package kz.example.android.fasthub.di

import kz.example.android.fasthub.core.Constants
import kz.example.android.fasthub.datasource.api.UserService
import kz.example.android.fasthub.datasource.api.createService
import kz.example.android.fasthub.repository.session.SessionRepository
import kz.example.android.fasthub.repository.session.SessionRepositoryImpl
import kz.example.android.fasthub.ui.signIn.AuthViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val sessionModule = module {
    single { createService<UserService>(get(), Constants.base_url) }
    single { SessionRepositoryImpl(
        get(),
        get()
    ) as SessionRepository }
    viewModel { AuthViewModel(get()) }
}