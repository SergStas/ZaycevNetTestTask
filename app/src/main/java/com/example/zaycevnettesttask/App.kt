package com.example.zaycevnettesttask

import android.app.Application
import com.example.zaycevnettesttask.di.AppComponent
import com.example.zaycevnettesttask.di.AppModule
import com.example.zaycevnettesttask.di.DaggerAppComponent

class App: Application() {
    companion object {
        lateinit var appComponent: AppComponent
    }

    override fun onCreate() {
        super.onCreate()

        initDagger()

        incLaunchCount()
    }

    private fun initDagger() {
        appComponent = DaggerAppComponent.builder()
            .appModule(AppModule(this))
            .build()
        appComponent.inject(this)
    }

    private fun incLaunchCount() {
        appComponent.getIncLaunchCountUseCase().execute()
    }
}