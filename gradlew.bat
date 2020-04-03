package kz.pbo.android_client_app.Repository.interfaces

import io.reactivex.Completable
import io.reactivex.Flowable
import io.reactivex.Observable
import io.reactivex.Single
import kz.pbo.android_client_app.core.data.DataEntities
import kz.pbo.android_client_app.core.data.DataModels
import okhttp3.RequestBody
import okhttp3.ResponseBody
import retrofit2.Call

interface Repositories {

    interface MainRepository{
        fun syncData(): Single<DataEntities.Updates>
        fun saveQuestionAnswer(it: DataEntities.AnswerFromApi, fromSocket: Boolean)
        fun saveQuestions(it: DataEntities.QuestionFromApi)
        fun saveTasks(it: DataEntities.TaskFromApi): DataModels.Task?
        fun saveDocumentTask(it: DataEntities.DocumentTaskFromApi): DataModels.DocumentTaskWithDocuments
        fun saveContracotor(it: DataEntities.ContractorFromApi): DataModels.ContractorWithDeals
        fun getStreamData(): Observable<DataEntities.SyncUpdates>
        fun saveEntityTeam(it: DataEntities.Person)
        fun saveTariffDataRecords(it: DataEntities.TariffDataRecord)
    }

    interface QuestionAnswerRepository{
        fun getQuestionAnswers(questionUuid: String): Observable<List<DataModels.Answer>>
        fun getQuestionAnswersFromRemoteRepo(questionId: Int): Single<List<DataModels.Answer>>
        fun getQuestionsAnswersFromDB(questionUuid: String): Observable<List<DataModels.Answer>>?
        fun getQuestionAnswer(uuid: String): DataModels.AnswersWithDocuments
        fun getQuestionAnswerDocumentIds(answerUid: String): List<Int>
        fun createQuestionAnswerInDb(questionId: Int,questionUuid: String, text: String, voiceRecordId: Int?): String
        fun updateAnswerDocumentUuids(oldUuid: String, newUuid: String)
        fun upsertQuestionAnswer(questionAnswer: DataEntities.AnswerFromDB)
        fun updateQuestionAnswerDocuments(id: Int, file_url: String, uuid: String)
        fun updateQuestionAnswerSendStatus(uuid: String, sendStatus: String)
        fun postQuestionAnswerSingle(questionID: Int, text: String, uuid: String): Single<DataEntities.AnswerFromApi?>
        fun upsertQuestionAnswer(questionAnswer: DataEntities.AnswerFromApi)
        fun getAnswerBySendStatus(sendStatus: String): Observable<List<DataEntities.A