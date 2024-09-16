package com.example.otchallenge.books.data.remote

import com.example.otchallenge.books.domain.Book
import io.reactivex.Observable

interface BooksRemoteSource {
    fun getBooks(): Observable<List<Book>>
}
