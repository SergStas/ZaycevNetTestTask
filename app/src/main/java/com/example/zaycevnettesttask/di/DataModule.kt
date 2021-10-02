package com.example.zaycevnettesttask.di

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import com.example.zaycevnettesttask.data.repository.LaunchCountSharedPreferencesRepository
import com.example.zaycevnettesttask.domain.repository.ILaunchCountRepository
import dagger.Module
import dagger.Provides

@Module
class DataModule {
    @Provides
    fun provideSharedPreferences(application: Application): SharedPreferences {
        return application.getSharedPreferences(
            "com.example.zaycevnettesttask",
            Context.MODE_PRIVATE
        )
    }

    @Provides
    fun provideLaunchCountRepository(
        sharedPreferences: SharedPreferences
    ): ILaunchCountRepository {
        return LaunchCountSharedPreferencesRepository(sharedPreferences)
    }
}