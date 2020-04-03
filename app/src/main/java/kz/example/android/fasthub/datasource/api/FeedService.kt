package kz.example.android.fasthub.datasource.api

import io.reactivex.Single
import kz.example.android.fasthub.data.api.FeedEventFromApi
import retrofit2.http.GET
import retrofit2.http.Path

interface FeedService {
    @GET("users/RustamAit/received_events")
    fun getUserFeed(): Single<List<FeedEventFromApi>>
}