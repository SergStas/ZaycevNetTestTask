package com.example.zaycevnettesttask.view

import android.os.Bundle
import android.widget.Toast
import com.example.zaycevnettesttask.App
import com.example.zaycevnettesttask.R
import com.example.zaycevnettesttask.presentation.main.MainMvpPresenter
import moxy.MvpAppCompatActivity
import moxy.ktx.moxyPresenter

class MainActivity : MvpAppCompatActivity(), IMainView {
    private val _presenter: MainMvpPresenter by moxyPresenter {
        App.appComponent.getMainPresenter()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
    }
}