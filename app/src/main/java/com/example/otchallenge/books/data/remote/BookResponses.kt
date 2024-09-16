package com.example.otchallenge.books.data.remote

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class BookResponse(
    @SerialName("primary_isbn13")
    val id: String?,
    val title: String?,
    val description: String?,
    @SerialName("book_image")
    val coverUrl: String?,
)

@Serializable
data class BooksResponse(
    val books: List<BookResponse>?
)

@Serializable
data class BookResultResponse(
    val results: BooksResponse
)
