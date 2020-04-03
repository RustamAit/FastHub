package kz.example.android.fasthub.data.api

import kz.example.android.fasthub.data.domain.Actor

data class FeedEventFromApi(
    val actor: ActorFromApi,
    val created_at: String,
    val id: String,
    val `public`: Boolean,
    val repo: RepoFromApi,
    val type: String
)

