package com.example.zaycevnettesttask.di

import com.example.zaycevnettesttask.domain.usecases.GetLaunchCountUseCase
import com.example.zaycevnettesttask.presentation.main.MainMvpPresenter
import com.example.zaycevnettesttask.presentation.main.MainMvpPresenterImpl
import dagger.Module
import dagger.Provides

@Module
class MainModule {
    @Provides
    fun provideMainPresenter(useCase: GetLaunchCountUseCase): MainMvpPresenter {
        return MainMvpPresenterImpl(useCase)
    }
}