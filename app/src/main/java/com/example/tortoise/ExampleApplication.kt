package com.example.tortoise

import android.app.Application
import com.unsplash.pickerandroid.photopicker.UnsplashPhotoPicker

class ExampleApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        // initializing the picker library
        UnsplashPhotoPicker.init(
            this,
            "4U4fQOEImLbZ1I2Esl-7ujZ9ad5t2fbW2LBccLaEu3s",
            "oEqMMOiCoD_nv_Ph9S4BhFRkBe-HuYDCxFVufSUHcnY"
            /* optional page size (number of photos per page) */
        )
            /* .setLoggingEnabled(true) // if you want to see the http requests */
    }
}
