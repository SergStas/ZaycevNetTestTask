package com.example.zaycevnettesttask.data.repository

import android.content.SharedPreferences
import com.example.zaycevnettesttask.domain.repository.ILaunchCountRepository

class LaunchCountSharedPreferencesRepository(
    private val sharedPreferences: SharedPreferences
): ILaunchCountRepository {
    private val launchCountTag = "launches"
    private var firstShowLabel = "firstShow"

    override fun get(): Int {
        return sharedPreferences.getInt(launchCountTag, 0)
    }

    override fun increment(): Boolean {
        val oldValue = sharedPreferences.getInt(launchCountTag, 0)
        sharedPreferences.edit().putInt(launchCountTag, oldValue + 1).apply()

        updateFirstShowState(true)
        return true
    }

    override fun checkFirstTime(): Boolean {
        val result = sharedPreferences.getBoolean(firstShowLabel, true)
        updateFirstShowState(false)
        return result
    }

    private fun updateFirstShowState(value: Boolean) {
        sharedPreferences.edit().putBoolean(firstShowLabel, value).apply()
    }
}