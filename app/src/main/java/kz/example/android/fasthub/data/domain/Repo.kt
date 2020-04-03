package kz.example.android.fasthub.data.domain

import kz.example.android.fasthub.data.api.RepoFromApi

class Repo (
    val id: Int,
    val name: String
)


fun RepoFromApi.mapToDomain(): Repo = Repo(
    this.id,this.full_name?:this.name
)

