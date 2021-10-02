package com.example.zaycevnettesttask.data.repository

import android.content.SharedPreferences
import com.example.zaycevnettesttask.domain.repository.ILaunchCountRepository

class LaunchCountSharedPreferencesRepository(
    private val sharedPreferences: SharedPreferences
): ILaunchCountRepository {
    private val launchCountTag = "launches"

    override fun get(): Int {
        return sharedPreferences.getInt(launchCountTag, 0)
    }

    override fun increment(): Boolean {
        val oldValue = sharedPreferences.getInt(launchCountTag, -1)
        sharedPreferences.edit().putInt(launchCountTag, oldValue + 1).apply()
        return true
    }
}