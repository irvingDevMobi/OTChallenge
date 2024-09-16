package com.example.otchallenge.di

import dagger.Module
import dagger.Provides
import io.reactivex.Scheduler
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import javax.inject.Singleton

@Module
class SchedulersModule {

    @UiScheduler
    @Provides
    @Singleton
    fun provideUiScheduler(): Scheduler = AndroidSchedulers.mainThread()

    @IoScheduler
    @Provides
    @Singleton
    fun provideIoScheduler(): Scheduler = Schedulers.io()

    @ComputationScheduler
    @Provides
    @Singleton
    fun provideComputationScheduler(): Scheduler = Schedulers.computation()
}
