package com.example.zaycevnettesttask.domain.di

import android.app.Application
import dagger.Component

@Component
interface AppComponent {
    fun inject(application: Application)
}