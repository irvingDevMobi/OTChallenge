package com.example.otchallenge.app.data.remote

import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory

object RetrofitApp {
    @OptIn(ExperimentalSerializationApi::class)
    fun getInstance(
        baseUrl: String
    ): Retrofit {
        val json = Json {
            ignoreUnknownKeys = true
            isLenient = true
            explicitNulls = false
        }
        val contentType = "application/json".toMediaType()
        val retrofitBuilder = Retrofit.Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(json.asConverterFactory(contentType))
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
        val okHttpClientBuilder = OkHttpClient.Builder()
        retrofitBuilder.client(okHttpClientBuilder.build())
        return retrofitBuilder.build()
    }
}
