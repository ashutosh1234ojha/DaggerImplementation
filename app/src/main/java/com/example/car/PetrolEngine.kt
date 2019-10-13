package com.example.car

import android.util.Log
import javax.inject.Inject

class PetrolEngine @Inject constructor() : Engine {
    override fun start() {
        Log.d("Tag", "Petrol engine started")
    }
}