package com.marcomartiniano.kmpbookapp

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import com.marcomartiniano.kmpbookapp.book.data.network.KtorRemoteBookDataSource
import com.marcomartiniano.kmpbookapp.book.data.repository.DefaultBookRepository
import com.marcomartiniano.kmpbookapp.book.presentation.book_list.BookListScreenRoot
import com.marcomartiniano.kmpbookapp.book.presentation.book_list.BookListViewModel
import com.marcomartiniano.kmpbookapp.core.data.HttpClientFactory
import io.ktor.client.engine.HttpClientEngine

@Composable
fun App(engine: HttpClientEngine) {
    MaterialTheme {
        BookListScreenRoot(
            viewModel = remember { BookListViewModel(
                bookRepository = DefaultBookRepository(
                    remoteBookDataSource = KtorRemoteBookDataSource(
                        httpClient = HttpClientFactory.create(engine)
                    )
                )
            ) },
            onBookClick = {

            }
        )
    }
}