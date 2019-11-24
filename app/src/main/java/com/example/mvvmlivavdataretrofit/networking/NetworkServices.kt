package com.example.mvvmlivavdataretrofit.networking

import com.example.mvvmlivavdataretrofit.modelresponse.SerieseListResponse
import retrofit2.Call
import retrofit2.http.GET


interface NetworkServices {
    @GET("people/1")
    fun getNewsList(): Call<SerieseListResponse>
}