package com.example.zaycevnettesttask.domain.usecases

import com.example.zaycevnettesttask.domain.repository.ILaunchCountRepository

class ToastSingleShowControlUseCase(private val repository: ILaunchCountRepository) {
    fun execute(): Boolean {
        return repository.checkFirstTime()
    }
}