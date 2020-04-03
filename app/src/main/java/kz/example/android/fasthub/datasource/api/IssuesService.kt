package kz.example.android.fasthub.datasource.api

import io.reactivex.Single
import kz.example.android.fasthub.data.api.IssueFromApi
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface IssuesService {
    @GET("/issues")
    fun getIssues(@Header("Authorization") auth: String, @Query("filter") filter: String): Single<List<IssueFromApi>>
}