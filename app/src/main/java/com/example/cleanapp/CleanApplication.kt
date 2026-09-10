package com.example.cleanapp

import android.app.Application

class CleanApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        instance = this
        com.example.cleanapp.util.LocaleHelper.applySavedLocale(this)
        com.example.cleanapp.util.MediaStoreSyncManager.startListening(this)
    }

    companion object {
        lateinit var instance: CleanApplication
            private set
    }
}
