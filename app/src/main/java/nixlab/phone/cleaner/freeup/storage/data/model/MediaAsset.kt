package nixlab.phone.cleaner.freeup.storage.data.model

import android.net.Uri

data class MediaAsset(
    val id: Long,
    val uri: Uri,
    val path: String,
    val displayName: String,
    val mimeType: String,
    val size: Long,
    val dateAdded: Long,
    val dateTaken: Long,
    val width: Int,
    val height: Int,
    val durationMs: Long = 0L,
    val isVideo: Boolean = false,
    val isScreenshot: Boolean = false,
    var dHash: Long? = null,
    var isBestResult: Boolean = false,
    var isSelected: Boolean = false
) {
    val resolutionText: String
        get() = if (width > 0 && height > 0) "${width}x${height}" else ""
}
