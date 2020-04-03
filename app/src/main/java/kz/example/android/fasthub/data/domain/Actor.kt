package kz.example.android.fasthub.data.domain

import kz.example.android.fasthub.data.api.ActorFromApi

class Actor(
    val avatarUrl: String,
    val displayLogin: String
)

fun ActorFromApi.mapToDomain(): Actor =
    Actor(
        this.avatar_url, this.display_login
    )