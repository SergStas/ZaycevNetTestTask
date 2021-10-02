package com.example.zaycevnettesttask.di

import com.example.zaycevnettesttask.domain.repository.ILaunchCountRepository
import com.example.zaycevnettesttask.domain.usecases.GetLaunchCountUseCase
import com.example.zaycevnettesttask.domain.usecases.IncLaunchCountUseCase
import com.example.zaycevnettesttask.domain.usecases.ToastSingleShowControlUseCase
import dagger.Module
import dagger.Provides

@Module
class LaunchCountUseCasesModule {
    @Provides
    fun provideIncLaunchCountUseCase(repository: ILaunchCountRepository): IncLaunchCountUseCase {
        return IncLaunchCountUseCase(repository)
    }

    @Provides
    fun provideGetLaunchCountUseCase(repository: ILaunchCountRepository): GetLaunchCountUseCase {
        return GetLaunchCountUseCase(repository)
    }

    @Provides
    fun provideToastSingleShowControlUseCase(
        repository: ILaunchCountRepository
    ): ToastSingleShowControlUseCase {
        return ToastSingleShowControlUseCase(repository)
    }
}