package kz.example.android.fasthub.repository.session

import io.reactivex.Single
import kz.example.android.fasthub.core.AuthStatus
import kz.example.android.fasthub.datasource.api.UserService
import kz.example.android.fasthub.datasource.sharedPref.LocalSharedPref
import kz.example.android.fasthub.repository.session.SessionRepository

class SessionRepositoryImpl(private val userService: UserService, private val sharedPref: LocalSharedPref):
    SessionRepository {
    override fun checkAuthCredetials(): Single<AuthStatus> {
        return userService.getUser().map { return@map AuthStatus.AUTHORIZED }.onErrorReturn { AuthStatus.UNATHORIZED }
    }

    override fun getUsername() = sharedPref.getUsername()

    override fun getUserPassword() = sharedPref.getPassword()

    override fun setUsername(username: String) = sharedPref.setUsername(username)

    override fun setUserPassword(password: String) = sharedPref.setPassword(password)

    override fun clearUserData(){
        sharedPref.clearUsername()
        sharedPref.clearPassword()
    }

}