package com.example.zaycevnettesttask

import android.app.Application
import com.example.zaycevnettesttask.domain.di.AppComponent
import com.example.zaycevnettesttask.domain.di.DaggerAppComponent

class App: Application() {
    companion object {
        lateinit var appComponent: AppComponent
    }

    override fun onCreate() {
        super.onCreate()

        initDagger()
    }

    private fun initDagger() {
        appComponent = DaggerAppComponent.builder().build()
        appComponent.inject(this)
    }
}