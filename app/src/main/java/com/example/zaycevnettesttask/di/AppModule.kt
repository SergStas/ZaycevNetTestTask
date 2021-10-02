package com.example.zaycevnettesttask.di

import android.app.Application
import dagger.Module
import dagger.Provides
import javax.inject.Inject

@Module
class AppModule(private val application: Application) {
    @Provides fun provideApplication(): Application {
        return application
    }
}