package com.example.otchallenge.books.data

import com.example.otchallenge.books.domain.Book
import io.reactivex.Observable

class BookRepositoryImpl : BooksRepository {
    override fun getBooks(): Observable<List<Book>> {
        // TODO: call api
        Thread.sleep(1000)
        return Observable.just(
            listOf(
                Book(
                    "1",
                    "Lorem Ipsum",
                    "eque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit",
                    "https://storage.googleapis.com/du-prd/books/images/9781649376565.jpg"
                ),
                Book(
                    "2",
                    "Lorem Ipsum",
                    "eque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit",
                    "https://storage.googleapis.com/du-prd/books/images/9781668045831.jpg"
                ),
                Book(
                    "3",
                    "Lorem Ipsum",
                    "eque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit",
                    "https://storage.googleapis.com/du-prd/books/images/9781649376565.jpg"
                ),
                Book(
                    "4",
                    "Lorem Ipsum",
                    "eque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit",
                    "https://storage.googleapis.com/du-prd/books/images/9781649376565.jpg"
                ),
                Book(
                    "5",
                    "Lorem Ipsum",
                    "eque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit",
                    "https://storage.googleapis.com/du-prd/books/images/9781668045831.jpg"
                ),
                Book(
                    "6",
                    "Lorem Ipsum",
                    "eque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit",
                    "https://storage.googleapis.com/du-prd/books/images/9781649376565.jpg"
                ),
            )
        )
    }
}
