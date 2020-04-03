package kz.example.android.fasthub.di

import kz.example.android.fasthub.core.Constants
import kz.example.android.fasthub.datasource.api.IssuesService
import kz.example.android.fasthub.datasource.api.createService
import kz.example.android.fasthub.repository.issue.IssueRepository
import kz.example.android.fasthub.repository.issue.IssueRepositoryImpl
import kz.example.android.fasthub.ui.issues.IssueViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val issueModule = module {
    single { createService<IssuesService>(get(),Constants.base_url) }
    single { IssueRepositoryImpl(get(),get()) as IssueRepository }
    viewModel { IssueViewModel(get()) }
}