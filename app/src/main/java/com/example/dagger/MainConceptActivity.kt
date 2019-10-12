package com.example.dagger

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.dagger.di.DaggerCarComponent
import javax.inject.Inject


class MainConceptActivity : AppCompatActivity() {

    @Inject
    lateinit var car: Car
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val carComponent = DaggerCarComponent.create()
        carComponent.inject(this)
        car.drive()
    }
}