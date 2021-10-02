package com.example.zaycevnettesttask.view

import moxy.MvpView
import moxy.viewstate.strategy.alias.Skip

interface IMainView: MvpView {
    @Skip
    fun showToast(message: String)
}