package kz.example.android.fasthub.ui.Feed

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import kz.example.android.fasthub.data.domain.FeedEvent
import kz.example.android.fasthub.repository.feedEvent.FeedEventRepository

class FeedViewModel(private val feedRepository: FeedEventRepository): ViewModel(){

    private val feedLiveData: MutableLiveData<List<FeedEvent>> = MutableLiveData()
    private val compositeDisposable: CompositeDisposable = CompositeDisposable()

    fun getFeedLiveData() = feedLiveData

    fun fetchData(){
        feedRepository.getCurrentUserFeed()
            ?.subscribeOn(Schedulers.io())
            ?.observeOn(AndroidSchedulers.mainThread())
            ?.onErrorReturn { emptyList() }
            ?.subscribe { data ->  feedLiveData.value = data}?.let {
                compositeDisposable.add(
                    it
                )
            }
    }




}