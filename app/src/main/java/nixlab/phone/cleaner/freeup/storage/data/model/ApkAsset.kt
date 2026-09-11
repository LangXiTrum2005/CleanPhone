package nixlab.phone.cleaner.freeup.storage.data.model

import android.graphics.drawable.Drawable
import android.net.Uri

data class ApkAsset(
    val id: Long,
    val uri: Uri,
    val path: String,
    val displayName: String,
    val packageName: String,
    val versionName: String,
    val size: Long,
    val dateModified: Long,
    val iconDrawable: Drawable?,
    val isInstalled: Boolean,
    var isSelected: Boolean = true
)
