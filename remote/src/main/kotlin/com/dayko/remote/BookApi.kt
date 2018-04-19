package com.dayko.remote

import com.dayko.remote.model.BookResponse
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Path

interface BookApi {

    @GET("volumes/{id}")
    fun volumes(@Path("id") id: String) : Single<BookResponse>

}