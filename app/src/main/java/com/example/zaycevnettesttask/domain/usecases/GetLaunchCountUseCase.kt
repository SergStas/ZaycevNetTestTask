package com.example.zaycevnettesttask.domain.usecases

import android.content.Context
import com.example.zaycevnettesttask.domain.repository.ILaunchCountRepository

class GetLaunchCountUseCase(private val repository: ILaunchCountRepository) {
    fun execute(): Int {
        return repository.get()
    }
}