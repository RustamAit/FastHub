package kz.example.android.fasthub.datasource.api

import io.reactivex.Single
import kz.example.android.fasthub.data.api.User
import retrofit2.http.GET

interface UserService {
    @GET("user")
    fun getUser(): Single<User>
}