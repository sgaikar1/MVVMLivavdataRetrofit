package com.example.mvvmlivavdataretrofit

import androidx.lifecycle.MutableLiveData
import com.example.mvvmlivavdataretrofit.modelresponse.SerieseListResponse
import com.example.mvvmlivavdataretrofit.networking.NetworkServices
import com.example.mvvmlivavdataretrofit.networking.ServiceModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class SerieseRepository {

    private val newsApi: NetworkServices

    init {
        newsApi = ServiceModel.cteateService(NetworkServices::class.java)
    }

    fun getNews(): MutableLiveData<SerieseListResponse> {
        val newsData = MutableLiveData<SerieseListResponse>()
        newsApi.getNewsList().enqueue(object : Callback<SerieseListResponse> {
            override fun onFailure(call: Call<SerieseListResponse>, t: Throwable) {
                newsData.value = null;
            }

            override fun onResponse(call: Call<SerieseListResponse>, response: Response<SerieseListResponse>) {
                if (response.isSuccessful){
                    newsData.value = response.body();
                }
            }

        })
        return newsData
    }

    companion object {

        private var serieseRepository: SerieseRepository? = null

        val instance: SerieseRepository
            get() {
                if (serieseRepository == null) {
                    serieseRepository = SerieseRepository()
                }
                return serieseRepository as SerieseRepository
            }
    }
}