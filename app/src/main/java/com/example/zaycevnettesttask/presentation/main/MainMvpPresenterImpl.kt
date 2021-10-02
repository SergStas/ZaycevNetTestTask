package com.example.zaycevnettesttask.presentation.main

import com.example.zaycevnettesttask.domain.usecases.GetLaunchCountUseCase
import com.example.zaycevnettesttask.domain.usecases.ToastSingleShowControlUseCase

class MainMvpPresenterImpl (
    private val getLaunchCountUseCase: GetLaunchCountUseCase,
    private val toastSingleShowControlUseCase: ToastSingleShowControlUseCase
): MainMvpPresenter() {
    override fun onFirstViewAttach() {
        super.onFirstViewAttach()

        checkCount()
    }

    private fun checkCount() {
        val count = getLaunchCountUseCase.execute()

        if (count % 3 == 0 && toastSingleShowControlUseCase.execute())
            viewState.showToast("This is the launch №$count")
    }
}