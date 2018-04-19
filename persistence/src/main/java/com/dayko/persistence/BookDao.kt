package com.dayko.persistence

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Query
import com.dayko.persistence.model.Book
import io.reactivex.Flowable

@Dao
interface BookDao {

    @Query("SELECT * FROM books")
    fun books() : Flowable<Book>

}