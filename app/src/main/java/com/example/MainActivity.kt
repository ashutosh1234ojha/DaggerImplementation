package com.example

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.car.Car
import com.example.dagger.R
import com.example.di.DaggerCarComponent
import javax.inject.Inject


class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var car: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val carComponent = DaggerCarComponent
                .builder()
                .horsePower(32)
                .engineCapacity(64)
                .build()
        carComponent.inject(this)
        car.drive()
    }
}