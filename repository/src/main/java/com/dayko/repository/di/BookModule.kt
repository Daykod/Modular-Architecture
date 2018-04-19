package com.dayko.repository.di

import com.dayko.persistence.di.DatabaseModule
import com.dayko.remote.di.ApiModule
import dagger.Module

@Module(includes = [(DatabaseModule::class), (ApiModule::class)])
class RepositoryModule