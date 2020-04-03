package kz.example.android.fasthub.repository.issue

import io.reactivex.Single
import kz.example.android.fasthub.data.domain.Issue
import kz.example.android.fasthub.data.domain.mapToDomain
import kz.example.android.fasthub.datasource.api.IssuesService
import kz.example.android.fasthub.datasource.sharedPref.LocalSharedPref
import okhttp3.Credentials

class IssueRepositoryImpl(val issuesService: IssuesService, val sharedPref: LocalSharedPref): IssueRepository{

    override fun getIssues(filter: String): Single<List<Issue>>{
        return issuesService.getIssues(Credentials.basic(sharedPref.getUsername(), sharedPref.getPassword()), filter)
            .flattenAsObservable { it }
            .filter{it.pull_request == null}
            .map { it.mapToDomain() }
            .toList()
            .onErrorReturn { emptyList() }
    }

    override fun getPullRequests(filter: String): Single<List<Issue>>{
        return issuesService.getIssues(Credentials.basic(sharedPref.getUsername(), sharedPref.getPassword()), filter)
            .flattenAsObservable { it }
            .filter{it.pull_request != null}
            .map { it.mapToDomain() }
            .toList()
            .onErrorReturn { emptyList() }
    }

}
