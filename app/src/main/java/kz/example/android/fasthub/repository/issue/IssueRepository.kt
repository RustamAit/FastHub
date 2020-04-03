package kz.example.android.fasthub.repository.issue

import io.reactivex.Single
import kz.example.android.fasthub.data.domain.Issue

interface IssueRepository {

    fun getIssues(filter: String): Single<List<Issue>>
    fun getPullRequests(filter: String): Single<List<Issue>>
}
