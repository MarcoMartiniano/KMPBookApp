package com.marcomartiniano.kmpbookapp.book.presentation.book_list

import com.marcomartiniano.kmpbookapp.book.domain.Book
import com.marcomartiniano.kmpbookapp.core.presentation.UiText

data class BookListState(
    val searchQuery: String = "Kotlin",
    val searchResults: List<Book> = books,
    val favoriteBooks: List<Book> = emptyList<Book>(),
    val isLoading: Boolean = false,
    val selectedTabIndex: Int = 0,
    val errorMessage: UiText? = null
)

val books = (1..100).map {
    Book(
        id = it.toString(),
        title = "Book $it",
        imageUrl = "https://test.com",
        authors = listOf("Marco Martiniano"),
        description = "Description $it",
        languages = emptyList(),
        firstPublishYear = null,
        averageRating = 4.6785,
        ratingCount = 5,
        numPages = 150,
        numEditions = 4
    )
}
