package kz.example.android.fasthub.data.domain

import kz.example.android.fasthub.data.api.IssueFromApi

data class Issue(
    val title: String?,
    val created_at: String?,
    val repo: Repo
)

fun IssueFromApi.mapToDomain(): Issue = Issue(
    this.title,this.created_at,this.repository.mapToDomain()
)