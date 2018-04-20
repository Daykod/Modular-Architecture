package com.dayko.modulararchitecture

import android.app.Application
import com.dayko.modulararchitecture.di.AppComponent
import com.dayko.modulararchitecture.di.DaggerAppComponent

class App : Application() {

    companion object {
        val component: AppComponent = DaggerAppComponent.builder().build()
    }
}
