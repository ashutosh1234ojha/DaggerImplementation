package com.example.dagger

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.dagger.di.DaggerCarComponent

class MainConceptActivity : AppCompatActivity() {

    lateinit var car: Car
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val carComponent = DaggerCarComponent.create()

        car = carComponent.getCar()

        car.drive()
    }
}