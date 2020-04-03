package kz.example.android.fasthub.datasource.api

import android.content.Context
import android.net.ConnectivityManager
import android.util.Log
import kz.example.android.fasthub.core.interceptors.AuthorizationInterceptor
import kz.example.android.fasthub.core.session.SessionController
import kz.example.android.fasthub.datasource.sharedPref.LocalSharedPref
import okhttp3.Credentials
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

private fun isInternetAvailable(context: Context): Boolean {
    val connectivityManager = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager?
    val activeNetworkInfo = connectivityManager!!.activeNetworkInfo
    return activeNetworkInfo != null && activeNetworkInfo.isConnected
}

fun createOkHttpClientWithAuthenticator(sharedPref: LocalSharedPref,
                                        session: SessionController,
                                        context: Context): OkHttpClient {
    val loggerInterceptor = HttpLoggingInterceptor(HttpLoggingInterceptor.Logger { message -> Log.i("API", message) })
    loggerInterceptor.level = HttpLoggingInterceptor.Level.BODY

    return OkHttpClient.Builder()
        .connectTimeout(180L, TimeUnit.SECONDS)
        .readTimeout(180L, TimeUnit.SECONDS)
        .authenticator{route, response ->
            val request = response.request()
            if(sharedPref.getUsername() == null || sharedPref.getPassword()==null){
                session.invalidate()
                return@authenticator null
            }
            return@authenticator request.newBuilder()
                .addHeader("Authorization", Credentials.basic(sharedPref.getUsername(), sharedPref.getPassword()))
                .build()

        }
        .addInterceptor(loggerInterceptor)
        .addInterceptor(object: AuthorizationInterceptor(session){
            override fun isInternetAvailable(): Boolean {
                return isInternetAvailable(context)
            }
        })
        .build()
}


inline fun <reified T> createService(okHttpClient: OkHttpClient, url: String): T {
    val retrofit = Retrofit.Builder()
        .baseUrl(url)
        .client(okHttpClient)
        .addConverterFactory(GsonConverterFactory.create())
        .addCallAdapterFactory(RxJava2CallAdapterFactory.createAsync()).build()
    return retrofit.create(T::class.java)
}