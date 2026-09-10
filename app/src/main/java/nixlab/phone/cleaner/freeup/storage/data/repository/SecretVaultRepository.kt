package nixlab.phone.cleaner.freeup.storage.data.repository

import android.content.ContentValues
import android.content.Context
import android.net.Uri
import android.os.Build
import android.os.Environment
import android.provider.MediaStore
import nixlab.phone.cleaner.freeup.storage.data.model.ContactItem
import nixlab.phone.cleaner.freeup.storage.data.model.MediaAsset
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import org.json.JSONArray
import org.json.JSONObject
import java.io.File
import java.io.FileInputStream
import java.io.FileOutputStream

class SecretVaultRepository(private val context: Context) {

    private val vaultDir: File
        get() = File(context.filesDir, "secret_vault").apply { if (!exists()) mkdirs() }

    private val contactsFile: File
        get() = File(context.filesDir, "secret_contacts.json")

    suspend fun getSecretMedia(): List<MediaAsset> = withContext(Dispatchers.IO) {
        val list = mutableListOf<MediaAsset>()
        val files = vaultDir.listFiles() ?: return@withContext emptyList()

        for (file in files) {
            val isVideo = file.name.endsWith(".mp4", ignoreCase = true)
            list.add(
                MediaAsset(
                    id = file.hashCode().toLong(),
                    uri = Uri.fromFile(file),
                    path = file.absolutePath,
                    displayName = file.name,
                    mimeType = if (isVideo) "video/mp4" else "image/jpeg",
                    size = file.length(),
                    dateAdded = file.lastModified(),
                    dateTaken = file.lastModified(),
                    width = 1080,
                    height = 1920,
                    isVideo = isVideo
                )
            )
        }
        list.sortedByDescending { it.dateAdded }
    }

    suspend fun importMedia(uri: Uri, isVideo: Boolean): Boolean = withContext(Dispatchers.IO) {
        try {
            val ext = if (isVideo) ".mp4" else ".jpg"
            val targetFile = File(vaultDir, "vault_${System.currentTimeMillis()}$ext")
            context.contentResolver.openInputStream(uri)?.use { input ->
                FileOutputStream(targetFile).use { output ->
                    input.copyTo(output)
                }
            }
            true
        } catch (e: Exception) {
            e.printStackTrace()
            false
        }
    }

    suspend fun restoreMediaToGallery(asset: MediaAsset): Boolean = withContext(Dispatchers.IO) {
        try {
            val file = File(asset.path)
            if (!file.exists()) return@withContext false

            val isVideo = asset.isVideo
            val displayName = "restored_${System.currentTimeMillis()}_${file.name}"
            val collection = if (isVideo) {
                MediaStore.Video.Media.EXTERNAL_CONTENT_URI
            } else {
                MediaStore.Images.Media.EXTERNAL_CONTENT_URI
            }

            val values = ContentValues().apply {
                put(MediaStore.MediaColumns.DISPLAY_NAME, displayName)
                put(MediaStore.MediaColumns.MIME_TYPE, if (isVideo) "video/mp4" else "image/jpeg")
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                    val relPath = if (isVideo) Environment.DIRECTORY_MOVIES + "/Cleanup" else Environment.DIRECTORY_PICTURES + "/Cleanup"
                    put(MediaStore.MediaColumns.RELATIVE_PATH, relPath)
                    put(MediaStore.MediaColumns.IS_PENDING, 1)
                }
            }

            val outputUri = context.contentResolver.insert(collection, values) ?: return@withContext false

            FileInputStream(file).use { input ->
                context.contentResolver.openOutputStream(outputUri)?.use { output ->
                    input.copyTo(output)
                }
            }

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                values.clear()
                values.put(MediaStore.MediaColumns.IS_PENDING, 0)
                context.contentResolver.update(outputUri, values, null, null)
            }

            // Remove from vault
            file.delete()
            true
        } catch (e: Exception) {
            e.printStackTrace()
            false
        }
    }

    suspend fun restoreAllToGallery(): Int = withContext(Dispatchers.IO) {
        val mediaList = getSecretMedia()
        var restoredCount = 0
        for (item in mediaList) {
            if (restoreMediaToGallery(item)) {
                restoredCount++
            }
        }
        restoredCount
    }

    suspend fun deleteSecretMedia(asset: MediaAsset): Boolean = withContext(Dispatchers.IO) {
        try {
            File(asset.path).delete()
        } catch (e: Exception) {
            false
        }
    }

    suspend fun getSecretContacts(): List<ContactItem> = withContext(Dispatchers.IO) {
        val list = mutableListOf<ContactItem>()
        if (!contactsFile.exists()) return@withContext emptyList()
        try {
            val jsonStr = contactsFile.readText()
            val array = JSONArray(jsonStr)
            for (i in 0 until array.length()) {
                val obj = array.getJSONObject(i)
                val phones = mutableListOf<String>()
                val pArr = obj.optJSONArray("phones")
                if (pArr != null) {
                    for (j in 0 until pArr.length()) phones.add(pArr.getString(j))
                }
                list.add(
                    ContactItem(
                        id = obj.optLong("id", System.currentTimeMillis()),
                        lookupKey = "",
                        displayName = obj.optString("name", "Secret Contact"),
                        phoneNumbers = phones
                    )
                )
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
        list
    }

    suspend fun addSecretContact(name: String, phone: String): Boolean = withContext(Dispatchers.IO) {
        val current = getSecretContacts().toMutableList()
        current.add(
            ContactItem(
                id = System.currentTimeMillis(),
                lookupKey = "",
                displayName = name,
                phoneNumbers = listOf(phone)
            )
        )
        saveSecretContacts(current)
    }

    suspend fun deleteSecretContact(contact: ContactItem): Boolean = withContext(Dispatchers.IO) {
        val current = getSecretContacts().filter { it.id != contact.id }
        saveSecretContacts(current)
    }

    private fun saveSecretContacts(contacts: List<ContactItem>): Boolean {
        return try {
            val array = JSONArray()
            for (c in contacts) {
                val obj = JSONObject().apply {
                    put("id", c.id)
                    put("name", c.displayName)
                    val pArr = JSONArray()
                    c.phoneNumbers.forEach { pArr.put(it) }
                    put("phones", pArr)
                }
                array.put(obj)
            }
            contactsFile.writeText(array.toString())
            true
        } catch (e: Exception) {
            false
        }
    }
}
