package com.example.otchallenge.books.presenter

import com.example.otchallenge.base.presenter.BasePresenter
import com.example.otchallenge.books.BookListContract
import com.example.otchallenge.books.domain.GetBooksAlphabetically
import io.reactivex.Scheduler

class BookListPresenter(
    view: BookListContract.View,
    private val getBooksAlphabetically: GetBooksAlphabetically,
    private val uiScheduler: Scheduler,
    private val ioScheduler: Scheduler,
) : BasePresenter<BookListContract.View>(view), BookListContract.Presenter {
    override fun fetchBooks() {
        view.showLoader()
        addDisposable(
            getBooksAlphabetically()
                .subscribeOn(ioScheduler)
                .observeOn(uiScheduler)
                .subscribe(view::showBooks) { error ->
                    view.showError(error.message.toString())
                }
        )
    }
}
