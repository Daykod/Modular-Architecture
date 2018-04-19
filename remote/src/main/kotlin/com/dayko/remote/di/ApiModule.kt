package com.dayko.remote.di

import com.dayko.remote.BookApi
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import retrofit2.Retrofit

@Module
class ApiModule {

    @Provides
    fun retrofit(okHttpClient: OkHttpClient) = Retrofit.Builder()
            .client(okHttpClient)
            .baseUrl("https://www.googleapis.com/books/v1")
            .build()

    @Provides
    fun api(retrofit: Retrofit) : BookApi = retrofit.create(BookApi::class.java)

}