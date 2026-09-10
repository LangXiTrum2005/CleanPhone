package com.example.cleanapp.data.model

import android.graphics.drawable.Drawable

data class AppItem(
    val packageName: String,
    val appName: String,
    val icon: Drawable?,
    val sizeBytes: Long,
    val lastUsedTimestamp: Long,
    val totalTimeInForegroundMs: Long,
    var isSelected: Boolean = false
) {
    val isNeverUsed: Boolean
        get() = lastUsedTimestamp <= 0
}
