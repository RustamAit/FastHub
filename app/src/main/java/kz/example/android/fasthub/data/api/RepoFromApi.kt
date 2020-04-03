package kz.example.android.fasthub.data.api

import kz.example.android.fasthub.data.domain.Repo


data class RepoFromApi(
    val id: Int,
    val full_name: String?,
    val name: String,
    val url: String
)

