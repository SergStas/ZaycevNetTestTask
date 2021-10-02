package com.example.zaycevnettesttask.domain.di

import android.app.Application
import dagger.Module
import dagger.Provides

@Module
class AppModule(private val application: Application) {
    @Provides fun provideApplication(application: Application): Application {
        return application
    }
}