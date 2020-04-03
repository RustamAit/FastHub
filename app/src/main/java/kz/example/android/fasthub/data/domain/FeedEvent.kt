package kz.example.android.fasthub.data.domain

import kz.example.android.fasthub.data.api.FeedEventFromApi

data class FeedEvent(
    val id: String,
    val actor: Actor,
    val type: String,
    val created_at: String,
    val repo: Repo
){

    fun getEventTitle(): String{
        return when(type){
            "PushEvent" -> "${actor.displayLogin} pushed to ${repo.name} repository"
            "CreateEvent" -> "${actor.displayLogin} created something at ${repo.name} repository"
            else -> " ${actor.displayLogin} changed someThing at ${repo.name} repository"
        }
    }

}

fun FeedEventFromApi.mapToDomain() = FeedEvent(
    this.id,this.actor.mapToDomain(),this.type,this.created_at,this.repo.mapToDomain()
)