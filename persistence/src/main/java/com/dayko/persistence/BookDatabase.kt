package com.dayko.persistence

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import com.dayko.persistence.model.Book

@Database(entities = [(Book::class)], version = 1)
abstract class BookDatabase : RoomDatabase() {
    abstract val bookDao : BookDao
}