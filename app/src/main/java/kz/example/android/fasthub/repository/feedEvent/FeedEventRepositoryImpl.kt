package kz.example.android.fasthub.repository.feedEvent

import io.reactivex.Single
import kz.example.android.fasthub.data.domain.FeedEvent
import kz.example.android.fasthub.data.domain.mapToDomain
import kz.example.android.fasthub.datasource.api.FeedService
import kz.example.android.fasthub.datasource.sharedPref.LocalSharedPref

class FeedEventRepositoryImpl (private val feedService: FeedService, private val sharedPref: LocalSharedPref): FeedEventRepository{


    override fun getCurrentUserFeed(): Single<List<FeedEvent>>? {
        return feedService.getUserFeed()
            .flattenAsObservable { it }
            .map { it.mapToDomain() }
            .toList()
    }
}