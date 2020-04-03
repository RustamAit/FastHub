package kz.example.android.fasthub.core.session

class SessionControllerImpl(): SessionController{

    private var authorizationListener: AuthorizationListener? = null

    override fun setAuthListener(authListener: AuthorizationListener) {
        this.authorizationListener = authListener
    }

    override fun invalidateAuthListener() {
        this.authorizationListener = null
    }

    override fun onInternetUnavailable() {
        authorizationListener?.onNetworkFail()
    }

    override fun invalidate() {
        authorizationListener?.onUserLoggedOut()
    }

    override fun onRequestLimitExceed(){
        authorizationListener?.onRequestLimitExceed()
    }

    override fun onServerError() {
        authorizationListener?.onServerError()
    }

}