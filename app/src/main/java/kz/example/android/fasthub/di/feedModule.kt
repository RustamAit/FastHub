package kz.example.android.fasthub.di

import kz.example.android.fasthub.core.Constants
import kz.example.android.fasthub.datasource.api.FeedService
import kz.example.android.fasthub.datasource.api.createService
import kz.example.android.fasthub.repository.feedEvent.FeedEventRepository
import kz.example.android.fasthub.repository.feedEvent.FeedEventRepositoryImpl
import kz.example.android.fasthub.ui.Feed.FeedViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val feedModule = module {
    single { createService<FeedService>(get(), Constants.base_url) }
    single { FeedEventRepositoryImpl(get(),get()) as FeedEventRepository }
    viewModel { FeedViewModel(get()) }
}