package com.dayko.repository

import com.dayko.persistence.BookDao
import com.dayko.persistence.model.Book
import com.dayko.remote.BookApi
import io.reactivex.Flowable
import javax.inject.Inject

class BookRepository @Inject constructor(
        val dao: BookDao,
        val api: BookApi
) {

    fun fetchBooks() : Flowable<Book> = Flowable.just(Book("", "", ""))

}