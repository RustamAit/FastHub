package kz.example.android.fasthub.repository.session

import io.reactivex.Single
import kz.example.android.fasthub.core.AuthStatus

interface SessionRepository{

    fun checkAuthCredetials(): Single<AuthStatus>
    fun getUsername(): String?
    fun getUserPassword(): String?
    fun setUsername(username: String)
    fun setUserPassword(password: String)
    fun clearUserData()
}