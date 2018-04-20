package com.dayko.persistence.di

import android.arch.persistence.room.Room
import android.content.Context
import com.dayko.persistence.BookDao
import com.dayko.persistence.BookDatabase
import dagger.Module
import dagger.Provides

@Module
class DatabaseModule {

    @Provides
    fun dao(database: BookDatabase): BookDao = database.bookDao

    @Provides
    fun database(ctx: Context): BookDatabase = Room.databaseBuilder(ctx, BookDatabase::class.java, "books").build()

}
