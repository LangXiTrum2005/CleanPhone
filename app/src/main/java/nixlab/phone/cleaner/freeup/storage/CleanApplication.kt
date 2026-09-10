package nixlab.phone.cleaner.freeup.storage

import android.app.Application

class CleanApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        instance = this
        nixlab.phone.cleaner.freeup.storage.util.LocaleHelper.applySavedLocale(this)
        nixlab.phone.cleaner.freeup.storage.util.MediaStoreSyncManager.startListening(this)
    }

    companion object {
        lateinit var instance: CleanApplication
            private set
    }
}
