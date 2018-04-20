package com.dayko.modulararchitecture.di

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient

@Module
class AppModule(val app: Application) {

    val ctx @Provides get() = app as Context

    val okHttpClient @Provides get() = OkHttpClient.Builder().build()

}
