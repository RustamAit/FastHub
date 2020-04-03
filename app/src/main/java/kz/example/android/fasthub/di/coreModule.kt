package kz.example.android.fasthub.di

import android.content.Context
import android.content.SharedPreferences
import kz.example.android.fasthub.core.Constants
import kz.example.android.fasthub.core.session.SessionController
import kz.example.android.fasthub.core.session.SessionControllerImpl
import kz.example.android.fasthub.datasource.api.createOkHttpClientWithAuthenticator
import kz.example.android.fasthub.datasource.sharedPref.LocalSharedPref
import kz.example.android.fasthub.datasource.sharedPref.LocalSharedPrefImpl
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module


val coreModule = module{
    single {
        createSharedPreferences(androidContext())
    }

    single {
        LocalSharedPrefImpl(get()) as LocalSharedPref
    }

    single { SessionControllerImpl() as SessionController }

    single { createOkHttpClientWithAuthenticator(get(),get(),androidContext()) }



}


fun createSharedPreferences(context: Context) : SharedPreferences {
    return context.applicationContext.getSharedPreferences(Constants.preference, Context.MODE_PRIVATE)
}
