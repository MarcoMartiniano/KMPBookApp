package com.marcomartiniano.kmpbookapp.book.presentation.book_list

import com.marcomartiniano.kmpbookapp.book.domain.Book
import com.marcomartiniano.kmpbookapp.core.presentation.UiText

data class BookListState(
    val searchQuery: String = "Kotlin",
    val searchResults: List<Book> = emptyList(),
    val favoriteBooks: List<Book> = emptyList(),
    val isLoading: Boolean = false,
    val selectedTabIndex: Int = 0,
    val errorMessage: UiText? = null
)
