package kz.pbo.android_client_app.Repository.implementations

import io.reactivex.Observable
import io.reactivex.Single
import io.reactivex.schedulers.Schedulers
import kz.pbo.android_client_app.Repository.DAO.*
import kz.pbo.android_client_app.Repository.Services.QuestionAnswerService
import kz.pbo.android_client_app.Repository.interfaces.Repositories
import kz.pbo.android_client_app.core.Constants
import kz.pbo.android_client_app.core.StatusConstants
import kz.pbo.android_client_app.core.data.DataEntities
import kz.pbo.android_client_app.core.data.DataModels
import kz.pbo.android_client_app.core.data.LocalSharedPref.LocalSharedPref
import kz.pbo.android_client_app.core.generateUUID
import kz.pbo.android_client_app.core.getCurrentDateISOString

class QuestionAnswerRepository(var questionAnswerService: QuestionAnswerService,
                               var sharedPref: LocalSharedPref,
                               val questionAnswersDao: QuestionAnswersDao,
                               val documentsDao: DocumentsDao,
                               val personDao: PersonDao,
                               val questionsDao: QuestionsDao,
                               val voiceRecordDao: VoiceRecordDao): Repositories.QuestionAnswerRepository{



    override fun getQuestionAnswers(questionUuid: String): Observable<List<DataModels.Answer>> {
        return getQuestionsAnswersFromDB(questionUuid)!!
    }

    override fun getQuestionsAnswersFromDB(questionUuid: String): Observable<List<DataModels.Answer>>? {
        return questionAnswersDao.getQuestionsAnswersFromDB(questionUuid).flatMap {
            Observable.fromIterable(it).subscribeOn(Schedulers.io()).map {
                var voiceRecord: DataEntities.VoiceRecordFromDb? = null
                voiceRecord = voiceRecordDao.getVoiceRecordByParentSync(it.answer!!.uuid, Constants.answer)
                return@map DataModels.Answer(it.answer, ArrayList(it.documentList!!), personDao.getPersonFromDb(it.answer!!.sender_id),voiceRecord)
            }.toList().toObservable()
        }.subscribeOn(Schedulers.io())

//        return questionAnswersDao.getQuestionsAnswersFromDB(questionId).map{
//            val result = ArrayList<DataModels.Answer>()
//            it.forEach {
//                val voiceRecord: DataEntities.VoiceRecordFromDb? = voiceRecordDao.getVoiceRecordByParentSync(it.answer!!.uuid, Constants.answer)
//                result.add(DataModels.Answer(it.answer, ArrayList(it.documentList!!), personDao.getPersonFromDb(it.answer!!.sender_id),voiceRecord))
//            }
//            return@map result.toList()
//        }.subscribeOn(Schedulers.io())
    }

    override fun checkQuestionAnswerCount(questionUuid: String): Boolean{
        return questionAnswersDao.getQuestionAnswersCount(questionUuid) >= questionsDao.getQuestionAnswerCount(questionUuid)
    }

    override fun getQuestionAnswersFromDbLimited(questionUuid: String): Observable<List<DataModels.Answer>>{
        return questionAnswersDao.getQuestionsAnswersFromDBLimited(questionUuid).map{
            val result = ArrayList<DataModels.Answer>()
            it.forEach {
                val voiceRecord: DataEntities.VoiceRecordFromDb? = voiceRecordDao.getVoiceRecordByParentSync(it.answer!!.uuid, Constants.answer)
                result.add(DataModels.Answer(it.answer, ArrayList(it.documentList!!), personDao.getPersonFromDb(it.answer!!.sender_id),voiceRecord))
            }
            return@map result.toList()
        }.subscribeOn(Schedulers.io())
    }


    override fun getQuestionAnswersFromRemoteRepo(questionId: Int): Single<List<DataModels.Answer>>  {
        val result: ArrayList<DataModels.Answer> = ArrayList()
        return questionAnswerService.getQuestionAnswers(sharedPref.getAccessToken(), sharedPref.getCurrentEntityId()!!,
                questionId).map {
            it.forEach {answer ->
                personDao.upsertSender(answer.sender)
                val documentList: ArrayList<DataEntities.DocumentFromDb> = ArrayList()
                questionAnswersDao.upsertQuestionAnswer(answer.serializeAnswerForDb(questionId))
                answer.documents?.forEach {
                    documentsDao.upsertDocument(it.serializeDocumentForDb(answer.uuid as Any,"answer"))
                    documentList.add(it.serializeDocumentForDb(answer.uuid as Any,"answer"))
                }
                if(answer.voice_record!=null){
                    voiceRecordDao.upsertVoiceRecord(answer.voice_record.serializeVoiceRecordForDb(answer.uuid?:answer.id.toString(),Constants.answer,sharedPref.getCurrentEntityId()!!)!!)
                    result.add(DataModels.Answer(answer.serializeAnswerForDb(questionId),documentList,answer.sender,answer.voice_record.serializeVoiceRecordForDb(answer.uuid?:answer.id.toString(),Constants.answer,sharedPref.getCurrentEntityId()!!)))
                }
                else{
                    result.add(DataModels.Answer(answer.serializeAnswerForDb(questionId),documentList,answer.sender,null))
                }
            }
            result.toList()
        }

    }


    override fun postQuestionAnswerSingle(questionID: Int, text: String, uuid: String): Single<DataEntities.AnswerFromApi?>{
        return Single.fromCallable {
            r