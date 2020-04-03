package kz.example.android.fasthub

import android.app.Application
import androidx.multidex.MultiDex
import androidx.multidex.MultiDexApplication
import kz.example.android.fasthub.di.appModules
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App: MultiDexApplication(){
    override fun onCreate() {
        super.onCreate()
        MultiDex.install(this)
        startKoin {
            modules(appModules)
            androidContext(this@App)
        }
    }
}