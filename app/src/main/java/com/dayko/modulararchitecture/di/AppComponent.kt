package com.dayko.modulararchitecture.di

import com.dayko.repository.BookRepository
import com.dayko.repository.di.RepositoryModule
import dagger.Component

@Component(modules = [RepositoryModule::class, AppModule::class])
interface AppComponent {
    val repo: BookRepository


}
