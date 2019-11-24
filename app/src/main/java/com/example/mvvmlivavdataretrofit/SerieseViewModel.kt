package com.example.mvvmlivavdataretrofit

import androidx.lifecycle.ViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.mvvmlivavdataretrofit.modelresponse.SerieseListResponse



public class SerieseViewModel : ViewModel(){
    private var mutableLiveData: MutableLiveData<SerieseListResponse>? = null
    private var serieseRepository: SerieseRepository? = null

    fun init() {
        if (mutableLiveData != null) {
            return
        }
        serieseRepository = SerieseRepository.instance
        mutableLiveData = serieseRepository!!.getNews()

    }

    fun getSeriesRepository(): LiveData<SerieseListResponse>? {
        return mutableLiveData
    }

}