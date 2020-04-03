package kz.example.android.fasthub.ui.issues

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import io.reactivex.SingleObserver
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers
import kz.example.android.fasthub.data.IssueType
import kz.example.android.fasthub.data.domain.Issue
import kz.example.android.fasthub.repository.issue.IssueRepository

class IssueViewModel(private val issueRepository: IssueRepository): ViewModel(){

    val createdIssuesLiveData: MutableLiveData<List<Issue>> =  MutableLiveData()
    val assignedIssuesLiveData: MutableLiveData<List<Issue>> = MutableLiveData()
    val mentionedIssuesLiveData: MutableLiveData<List<Issue>> = MutableLiveData()

    val createdIssuesCountLiveData: MutableLiveData<Int> =  MutableLiveData()
    val assignedIssuesCountLiveData: MutableLiveData<Int> =  MutableLiveData()
    val mentionedIssuesCountLiveData: MutableLiveData<Int> =  MutableLiveData()

    private val compositeDisposable: CompositeDisposable = CompositeDisposable()

    fun fetchData(){

        compositeDisposable.addAll(

            issueRepository.getIssues(IssueType.created)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe { list ->
                    createdIssuesLiveData.value = list
                    createdIssuesCountLiveData.value = list.size
                },

            issueRepository.getIssues(IssueType.assigned)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe { list ->
                    assignedIssuesLiveData.value = list
                    assignedIssuesCountLiveData.value = list.size
                },

            issueRepository.getIssues(IssueType.mentioned)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe { list ->
                    mentionedIssuesLiveData.value = list
                    mentionedIssuesCountLiveData.value = list.size
                }
        )
    }

    override fun onCleared() {
        super.onCleared()
        compositeDisposable.dispose()
    }

}