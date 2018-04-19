package com.dayko.persistence.model

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity(tableName = "books")
data class Book(
        @PrimaryKey val isbn: String,
        val author: String,
        val title: String
)