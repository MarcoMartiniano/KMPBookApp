package com.marcomartiniano.kmpbookapp

import androidx.compose.runtime.Composable
import com.marcomartiniano.kmpbookapp.book.presentation.book_list.BookListScreenRoot
import com.marcomartiniano.kmpbookapp.book.presentation.book_list.BookListViewModel
import org.koin.compose.viewmodel.koinViewModel

@Composable
fun App() {
    val viewModel = koinViewModel<BookListViewModel>()
    BookListScreenRoot(
        viewModel = viewModel,
        onBookClick = {

        }
    )
}