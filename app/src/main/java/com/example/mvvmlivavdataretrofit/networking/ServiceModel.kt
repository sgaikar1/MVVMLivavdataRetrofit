package com.example.mvvmlivavdataretrofit.networking

import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.Retrofit


object ServiceModel {

    private val retrofit = Retrofit.Builder()
        .baseUrl("http://api.tvmaze.com/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()


    fun <S> cteateService(serviceClass: Class<S>): S {
        return retrofit.create(serviceClass)
    }

}