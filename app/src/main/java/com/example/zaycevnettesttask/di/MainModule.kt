package com.example.zaycevnettesttask.di

import com.example.zaycevnettesttask.domain.usecases.GetLaunchCountUseCase
import com.example.zaycevnettesttask.domain.usecases.ToastSingleShowControlUseCase
import com.example.zaycevnettesttask.presentation.main.MainMvpPresenter
import com.example.zaycevnettesttask.presentation.main.MainMvpPresenterImpl
import dagger.Module
import dagger.Provides

@Module
class MainModule {
    @Provides
    fun provideMainPresenter(
        launchCountUseCase: GetLaunchCountUseCase,
        toastControlUseCase: ToastSingleShowControlUseCase
    ): MainMvpPresenter {
        return MainMvpPresenterImpl(launchCountUseCase, toastControlUseCase)
    }
}