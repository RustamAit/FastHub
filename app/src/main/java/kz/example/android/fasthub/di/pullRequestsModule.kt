package kz.example.android.fasthub.di

import kz.example.android.fasthub.ui.pullRequests.PullRequestsViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val pullRequestsModule = module {
    viewModel { PullRequestsViewModel(get()) }
}