package com.example.zaycevnettesttask.di

import android.app.Application
import com.example.zaycevnettesttask.domain.usecases.IncLaunchCountUseCase
import com.example.zaycevnettesttask.presentation.main.MainMvpPresenter
import dagger.Component

@Component(modules = [
    AppModule::class,
    DataModule::class,
    LaunchCountUseCasesModule::class,
    MainModule::class
])
interface AppComponent {
    fun inject(application: Application)

    fun getMainPresenter(): MainMvpPresenter

    fun getIncLaunchCountUseCase(): IncLaunchCountUseCase
}