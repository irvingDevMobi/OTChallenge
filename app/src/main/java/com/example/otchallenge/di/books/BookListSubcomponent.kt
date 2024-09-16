package com.example.otchallenge.di.books

import com.example.otchallenge.books.view.BookListFragment
import dagger.Subcomponent

@Subcomponent(modules = [BookListModule::class])
interface BookListSubcomponent {
    fun inject(bookListFragment: BookListFragment)

    @Subcomponent.Builder
    interface Builder {
        fun build(): BookListSubcomponent
        fun bookListModule(module: BookListModule): Builder
    }
}
