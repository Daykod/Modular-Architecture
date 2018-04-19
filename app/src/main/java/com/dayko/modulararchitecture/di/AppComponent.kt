package com.dayko.modulararchitecture.di

import com.dayko.repository.di.RepositoryModule
import dagger.Component

@Component(modules = [(RepositoryModule::class)])
interface AppComponent