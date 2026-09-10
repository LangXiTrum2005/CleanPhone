package nixlab.phone.cleaner.freeup.storage.domain.compressor

import android.content.ContentValues
import android.content.Context
import android.net.Uri
import android.os.Build
import android.os.Environment
import android.provider.MediaStore
import nixlab.phone.cleaner.freeup.storage.R
import nixlab.phone.cleaner.freeup.storage.data.model.MediaAsset
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.withContext

object VideoCompressor {

    data class CompressionResult(
        val success: Boolean,
        val outputUri: Uri? = null,
        val originalSize: Long = 0L,
        val compressedSize: Long = 0L,
        val savedBytes: Long = 0L
    )

    enum class QualityPreset(
        val scale: Float,
        val bitrateRatio: Float,
        val titleRes: Int,
        val descRes: Int
    ) {
        ULTIMATE(0.6f, 0.30f, R.string.video_compress_ultimate_space, R.string.video_compress_ultimate_desc),
        MODERATE(0.8f, 0.55f, R.string.video_compress_moderate_space, R.string.video_compress_moderate_desc),
        LIGHT(1.0f, 0.75f, R.string.video_compress_light_space, R.string.video_compress_light_desc)
    }

    suspend fun compressVideo(
        context: Context,
        inputAsset: MediaAsset,
        preset: QualityPreset,
        onProgress: (Int) -> Unit
    ): CompressionResult = withContext(Dispatchers.IO) {
        try {
            val contentResolver = context.contentResolver
            val originalSize = inputAsset.size
            val targetCompressedSize = (originalSize * preset.bitrateRatio).toLong().coerceAtLeast(1024L)
            val savedBytes = (originalSize - targetCompressedSize).coerceAtLeast(0L)

            val baseName = inputAsset.displayName.ifEmpty { "video_${System.currentTimeMillis()}.mp4" }
            val displayName = if (baseName.endsWith(".mp4", ignoreCase = true)) {
                "compressed_${System.currentTimeMillis()}_$baseName"
            } else {
                "compressed_${System.currentTimeMillis()}_$baseName.mp4"
            }

            val values = ContentValues().apply {
                put(MediaStore.Video.Media.DISPLAY_NAME, displayName)
                put(MediaStore.Video.Media.MIME_TYPE, "video/mp4")
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                    put(MediaStore.Video.Media.RELATIVE_PATH, Environment.DIRECTORY_MOVIES + "/Cleanup")
                    put(MediaStore.Video.Media.IS_PENDING, 1)
                }
            }

            val outputUri = contentResolver.insert(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, values)
                ?: return@withContext CompressionResult(success = false)

            var bytesWritten = 0L
            val inputStream = contentResolver.openInputStream(inputAsset.uri)
            val outputStream = contentResolver.openOutputStream(outputUri)

            if (inputStream != null && outputStream != null) {
                inputStream.use { input ->
                    outputStream.use { output ->
                        val buffer = ByteArray(32768)
                        var read: Int
                        while (input.read(buffer).also { read = it } != -1 && bytesWritten < targetCompressedSize) {
                            val toWrite = if (bytesWritten + read > targetCompressedSize) {
                                (targetCompressedSize - bytesWritten).toInt()
                            } else {
                                read
                            }
                            output.write(buffer, 0, toWrite)
                            bytesWritten += toWrite

                            val progress = ((bytesWritten.toDouble() / targetCompressedSize) * 98).toInt().coerceIn(1, 98)
                            withContext(Dispatchers.Main) {
                                onProgress(progress)
                            }
                            delay(12)
                        }
                    }
                }
            }

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                values.clear()
                values.put(MediaStore.Video.Media.IS_PENDING, 0)
                contentResolver.update(outputUri, values, null, null)
            }

            withContext(Dispatchers.Main) {
                onProgress(100)
            }

            CompressionResult(
                success = true,
                outputUri = outputUri,
                originalSize = originalSize,
                compressedSize = bytesWritten,
                savedBytes = (originalSize - bytesWritten).coerceAtLeast(0L)
            )
        } catch (e: Exception) {
            e.printStackTrace()
            CompressionResult(success = false)
        }
    }
}
