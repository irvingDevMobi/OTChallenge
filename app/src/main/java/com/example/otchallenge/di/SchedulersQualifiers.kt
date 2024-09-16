package com.example.otchallenge.di

import javax.inject.Qualifier

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class UiScheduler

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class IoScheduler

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class ComputationScheduler
