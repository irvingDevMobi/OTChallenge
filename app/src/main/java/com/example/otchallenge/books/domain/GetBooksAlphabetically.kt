package com.example.otchallenge.books.domain

import com.example.otchallenge.books.data.BooksRepository
import io.reactivex.Observable
import javax.inject.Inject

class GetBooksAlphabetically @Inject constructor(
    private val booksRepository: BooksRepository
) {
    operator fun invoke(): Observable<List<Book>> {
        return booksRepository.getBooks().map { books ->
            books.sortedBy { it.title }
        }
    }
}
