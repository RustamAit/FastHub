package kz.example.android.fasthub.core.session

interface AuthorizationListener{
    fun onUserLoggedOut()
    fun onNetworkFail()
    fun onServerError()
    fun onRequestLimitExceed()
}