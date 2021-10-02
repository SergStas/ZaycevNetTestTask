package com.example.zaycevnettesttask.domain.repository

interface ILaunchCountRepository {
    fun get(): Int

    fun increment(): Boolean

    fun checkFirstTime(): Boolean
}