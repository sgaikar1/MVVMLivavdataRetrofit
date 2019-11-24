package com.example.mvvmlivavdataretrofit

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders


class MainActivity : AppCompatActivity() {

    private lateinit var serieseViewModel: SerieseViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        serieseViewModel = ViewModelProviders.of(this).get(SerieseViewModel::class.java)
        serieseViewModel.init()
        serieseViewModel.getSeriesRepository()?.observe(this , Observer {
            if(it!=null) {
                (findViewById<TextView>(R.id.text)).text = it.getName()
            }
        })
    }
}
