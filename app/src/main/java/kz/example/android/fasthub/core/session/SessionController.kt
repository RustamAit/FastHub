package kz.example.android.fasthub.core.session

interface SessionController {
    fun setAuthListener(authListener: AuthorizationListener)
    fun invalidateAuthListener()
    fun onInternetUnavailable()
    fun invalidate()
    fun onServerError()
    fun onRequestLimitExceed()
}
