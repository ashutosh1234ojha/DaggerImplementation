package com.example

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.car.Car
import com.example.dagger.R
import javax.inject.Inject


class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var car1: Car

    @Inject
    lateinit var car2: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val activityComponent =(application as MyApplication).getAppComponent()
                .getActivityComponentFactory().create(23,9)

        activityComponent.inject(this)


        car1.drive()
        car2.drive()
    }
}