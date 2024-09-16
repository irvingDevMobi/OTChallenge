package com.example.otchallenge.books.data

import com.example.otchallenge.books.data.remote.BooksRemoteSource
import com.example.otchallenge.books.domain.Book
import io.reactivex.Observable

class BookRepositoryImpl(
    private val remoteSource: BooksRemoteSource
) : BooksRepository {
    override fun getBooks(): Observable<List<Book>> =
        remoteSource.getBooks()
}
