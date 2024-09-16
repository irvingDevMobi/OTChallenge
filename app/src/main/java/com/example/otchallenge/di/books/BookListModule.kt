package com.example.otchallenge.di.books

import com.example.otchallenge.books.BookListContract
import com.example.otchallenge.books.domain.GetBooksAlphabetically
import com.example.otchallenge.books.presenter.BookListPresenter
import com.example.otchallenge.di.IoScheduler
import com.example.otchallenge.di.UiScheduler
import dagger.Module
import dagger.Provides
import io.reactivex.Scheduler

@Module
class BookListModule(
    private val view: BookListContract.View
) {
    @Provides
    fun provideBookListPresenter(
        getBooksAlphabetically: GetBooksAlphabetically,
        @UiScheduler
        uiScheduler: Scheduler,
        @IoScheduler
        ioScheduler: Scheduler
    ): BookListContract.Presenter = BookListPresenter(
        view, getBooksAlphabetically, uiScheduler, ioScheduler
    )

    @Provides
    fun provideBookListView(): BookListContract.View = view
}
