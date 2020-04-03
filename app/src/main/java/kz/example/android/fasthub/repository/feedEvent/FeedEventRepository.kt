package kz.example.android.fasthub.repository.feedEvent

import io.reactivex.Single
import kz.example.android.fasthub.data.domain.FeedEvent

interface FeedEventRepository {

    fun getCurrentUserFeed(): Single<List<FeedEvent>>?
}
