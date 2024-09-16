package com.example.otchallenge.books.data.remote

import com.example.otchallenge.books.domain.Book

fun BookResponse?.toBook(): Book? =
    if (this == null || this.id == null) null
    else Book(
        this.id,
        this.title ?: "",
        this.description ?: "",
        this.coverUrl ?: ""
    )

fun List<BookResponse>?.toBooks(): List<Book> =
    this?.mapNotNull { it.toBook() } ?: listOf()

fun BookResultResponse?.toBooks(): List<Book> =
    this?.results?.books?.toBooks() ?: listOf()

