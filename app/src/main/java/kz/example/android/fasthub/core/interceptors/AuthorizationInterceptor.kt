package kz.example.android.fasthub.core.interceptors

import kz.example.android.fasthub.core.session.SessionController
import okhttp3.Interceptor
import okhttp3.Response
import java.io.IOException

abstract class AuthorizationInterceptor(private val session: SessionController) : Interceptor {

    abstract fun isInternetAvailable(): Boolean

    @Throws(IOException::class)
    override fun intercept(chain: Interceptor.Chain): Response {
        if (!isInternetAvailable()){
            session.onInternetUnavailable()
            val request = chain.request().newBuilder().header("Cache-Control",
                "public, only-if-cached, max-stale=" + 60 * 60 * 24).build()
            val response = chain.proceed(request)
            return response
        }
        val response = chain.proceed(chain.request())
        if (response.code() == 401 || response.code() == 403) {
            session.invalidate()
        }
        if(response.code() == 403){
            session.onRequestLimitExceed()
        }
        if(response.code() == 500){
            session.onServerError()
        }

        return response
    }

}