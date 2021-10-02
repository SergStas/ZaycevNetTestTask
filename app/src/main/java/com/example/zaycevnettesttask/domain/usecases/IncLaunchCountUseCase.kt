package com.example.zaycevnettesttask.domain.usecases

import com.example.zaycevnettesttask.domain.repository.ILaunchCountRepository

class IncLaunchCountUseCase(private val repository: ILaunchCountRepository) {
    fun execute() {
        repository.increment()
    }
}