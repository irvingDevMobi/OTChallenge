package com.example.otchallenge.base.presenter

import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable

abstract class BasePresenter<V>(
    protected val view: V
) {
    private val disposables = CompositeDisposable()

    protected fun addDisposable(disposable: Disposable) {
        disposables.add(disposable)
    }

    fun start() {

    }

    fun stop() {
        disposables.clear()
    }
}
