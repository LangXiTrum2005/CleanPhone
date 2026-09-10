package com.example.cleanapp.util

import android.content.Context
import android.database.ContentObserver
import android.net.Uri
import android.os.Handler
import android.os.Looper
import android.provider.ContactsContract
import android.provider.MediaStore
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.launch

object MediaStoreSyncManager {

    private val scope = CoroutineScope(Dispatchers.Default)

    private val _mediaUpdateFlow = MutableSharedFlow<Unit>(replay = 0, extraBufferCapacity = 1)
    val mediaUpdateFlow: SharedFlow<Unit> = _mediaUpdateFlow.asSharedFlow()

    private val _contactsUpdateFlow = MutableSharedFlow<Unit>(replay = 0, extraBufferCapacity = 1)
    val contactsUpdateFlow: SharedFlow<Unit> = _contactsUpdateFlow.asSharedFlow()

    private var isMediaObserverRegistered = false
    private var isContactsObserverRegistered = false

    private var mediaDebounceJob: Job? = null
    private var contactsDebounceJob: Job? = null

    private val mediaObserver = object : ContentObserver(Handler(Looper.getMainLooper())) {
        override fun onChange(selfChange: Boolean, uri: Uri?) {
            super.onChange(selfChange, uri)
            // Debounce rapid events (e.g. continuous camera burst shots)
            mediaDebounceJob?.cancel()
            mediaDebounceJob = scope.launch {
                delay(400)
                _mediaUpdateFlow.emit(Unit)
            }
        }
    }

    private val contactsObserver = object : ContentObserver(Handler(Looper.getMainLooper())) {
        override fun onChange(selfChange: Boolean, uri: Uri?) {
            super.onChange(selfChange, uri)
            contactsDebounceJob?.cancel()
            contactsDebounceJob = scope.launch {
                delay(400)
                _contactsUpdateFlow.emit(Unit)
            }
        }
    }

    fun startListening(context: Context) {
        val appContext = context.applicationContext

        // 1. MediaStore Observer (Images & Videos)
        if (!isMediaObserverRegistered) {
            try {
                appContext.contentResolver.registerContentObserver(
                    MediaStore.Images.Media.EXTERNAL_CONTENT_URI,
                    true,
                    mediaObserver
                )
                appContext.contentResolver.registerContentObserver(
                    MediaStore.Video.Media.EXTERNAL_CONTENT_URI,
                    true,
                    mediaObserver
                )
                isMediaObserverRegistered = true
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }

        // 2. Contacts Observer
        if (!isContactsObserverRegistered) {
            try {
                appContext.contentResolver.registerContentObserver(
                    ContactsContract.Contacts.CONTENT_URI,
                    true,
                    contactsObserver
                )
                isContactsObserverRegistered = true
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }

    fun notifyManualMediaChange() {
        scope.launch {
            _mediaUpdateFlow.emit(Unit)
        }
    }

    fun notifyManualContactsChange() {
        scope.launch {
            _contactsUpdateFlow.emit(Unit)
        }
    }
}
