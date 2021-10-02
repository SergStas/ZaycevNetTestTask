package com.example.zaycevnettesttask.presentation.main

import com.example.zaycevnettesttask.domain.usecases.GetLaunchCountUseCase

class MainMvpPresenterImpl (
    private val getLaunchCountUseCase: GetLaunchCountUseCase
): MainMvpPresenter() {
    override fun onFirstViewAttach() {
        super.onFirstViewAttach()

        checkCount()
    }

    private fun checkCount() {
        val count = getLaunchCountUseCase.execute()

        if (count % 3 == 0)
            viewState.showToast("This is the launch №$count")
    }
}