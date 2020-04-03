package kz.example.android.fasthub.ui.pullRequests

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import kz.example.android.fasthub.data.IssueType
import kz.example.android.fasthub.data.domain.Issue
import kz.example.android.fasthub.repository.issue.IssueRepository


class PullRequestsViewModel(private val issueRepository: IssueRepository): ViewModel(){

    val createdPullRequestsLiveData: MutableLiveData<List<Issue>> =  MutableLiveData()
    val assignedPullRequestsLiveData: MutableLiveData<List<Issue>> = MutableLiveData()
    val mentionedPullRequestsLiveData: MutableLiveData<List<Issue>> = MutableLiveData()

    val createdPullRequestsCountLiveData: MutableLiveData<Int> =  MutableLiveData()
    val assignedPullRequestsCountLiveData: MutableLiveData<Int> =  MutableLiveData()
    val mentionedPullRequestsCountLiveData: MutableLiveData<Int> =  MutableLiveData()

    private val compositeDisposable: CompositeDisposable = CompositeDisposable()

    fun fetchData(){

        compositeDisposable.addAll(

            issueRepository.getPullRequests(IssueType.created)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe { list ->
                    createdPullRequestsLiveData.value = list
                    createdPullRequestsCountLiveData.value = list.size
                },

            issueRepository.getPullRequests(IssueType.assigned)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe { list ->
                    assignedPullRequestsLiveData.value = list
                    assignedPullRequestsCountLiveData.value = list.size
                },

            issueRepository.getPullRequests(IssueType.mentioned)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe { list ->
                    mentionedPullRequestsLiveData.value = list
                    mentionedPullRequestsCountLiveData.value = list.size
                }
        )
    }

    override fun onCleared() {
        super.onCleared()
        compositeDisposable.dispose()
    }
}
