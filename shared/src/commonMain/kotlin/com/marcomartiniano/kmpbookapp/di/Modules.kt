package com.marcomartiniano.kmpbookapp.di

import androidx.sqlite.driver.bundled.BundledSQLiteDriver
import com.marcomartiniano.kmpbookapp.book.data.database.DatabaseFactory
import com.marcomartiniano.kmpbookapp.book.data.database.FavoriteBookDatabase
import com.marcomartiniano.kmpbookapp.book.data.network.KtorRemoteBookDataSource
import com.marcomartiniano.kmpbookapp.book.data.network.RemoteBookDataSource
import com.marcomartiniano.kmpbookapp.book.data.repository.DefaultBookRepository
import com.marcomartiniano.kmpbookapp.book.domain.BookRepository
import com.marcomartiniano.kmpbookapp.book.presentation.SelectedBookViewModel
import com.marcomartiniano.kmpbookapp.book.presentation.book_detail.BookDetailViewModel
import com.marcomartiniano.kmpbookapp.book.presentation.book_list.BookListViewModel
import com.marcomartiniano.kmpbookapp.core.data.HttpClientFactory
import org.koin.core.module.Module
import org.koin.core.module.dsl.singleOf
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.bind
import org.koin.dsl.module

expect val platformModule: Module

val sharedModule = module {
    single { HttpClientFactory.create(get()) }
    singleOf(::KtorRemoteBookDataSource).bind<RemoteBookDataSource>()
    singleOf(::DefaultBookRepository).bind<BookRepository>()

    single<FavoriteBookDatabase> {
        get<DatabaseFactory>()
            .create()
            .setDriver(BundledSQLiteDriver())
            .build()
    }

    single { get<FavoriteBookDatabase>().favoriteBookDao }

    viewModelOf(::BookListViewModel)
    viewModelOf(::SelectedBookViewModel)
    viewModelOf(::BookDetailViewModel)
}