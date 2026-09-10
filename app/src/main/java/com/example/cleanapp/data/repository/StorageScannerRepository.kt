package com.example.cleanapp.data.repository

import android.app.PendingIntent
import android.content.ContentUris
import android.content.Context
import android.graphics.BitmapFactory
import android.net.Uri
import android.os.Build
import android.provider.MediaStore
import com.example.cleanapp.data.model.MediaAsset
import com.example.cleanapp.data.model.ScanResult
import com.example.cleanapp.data.model.SimilarGroup
import com.example.cleanapp.domain.algorithm.BestPhotoSelector
import com.example.cleanapp.domain.algorithm.DHash
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.withContext
import java.io.File

class StorageScannerRepository(private val context: Context) {

    sealed class ScanProgress {
        data class Progress(val percent: Int, val message: String) : ScanProgress()
        data class Completed(val result: ScanResult) : ScanProgress()
        data class Error(val error: String) : ScanProgress()
    }

    fun scanStorage(): Flow<ScanProgress> = flow {
        try {
            emit(ScanProgress.Progress(10, context.getString(com.example.cleanapp.R.string.scan_scanning_media)))

            val allImages = fetchAllImages()
            emit(ScanProgress.Progress(35, context.getString(com.example.cleanapp.R.string.scan_scanning_videos)))

            val allVideos = fetchAllVideos()
            emit(ScanProgress.Progress(50, context.getString(com.example.cleanapp.R.string.scan_analyzing_similarity)))

            // Extract screenshots
            val screenshots = allImages.filter { it.isScreenshot }
            val nonScreenshots = allImages.filter { !it.isScreenshot }

            // Compute dHash for images - limit to 500 photos for responsive scan
            val photosToHash = if (nonScreenshots.size > 500) nonScreenshots.take(500) else nonScreenshots
            val hashedPhotos = mutableListOf<MediaAsset>()
            val totalToHash = photosToHash.size
            photosToHash.forEachIndexed { index, asset ->
                val hash = computeHashSafely(asset)
                asset.dHash = hash
                hashedPhotos.add(asset)
                if (index % 10 == 0 && totalToHash > 0) {
                    val p = 50 + ((index.toDouble() / totalToHash) * 35).toInt()
                    emit(ScanProgress.Progress(p, context.getString(com.example.cleanapp.R.string.scan_analyzing_progress_fmt, index, totalToHash)))
                }
            }

            emit(ScanProgress.Progress(85, context.getString(com.example.cleanapp.R.string.scan_grouping_similar)))
            val (similarGroups, duplicateGroups) = groupSimilarAndDuplicatePhotos(hashedPhotos)

            // Large videos: sorted descending
            val largeVideos = allVideos.sortedByDescending { it.size }

            // Other media
            val otherMedia = allImages.filter {
                val p = it.path.lowercase()
                p.contains("whatsapp") || p.contains("telegram") || p.contains("download") || p.contains("messenger")
            }

            val totalReclaimable = similarGroups.sumOf { it.reclaimableSize } +
                    duplicateGroups.sumOf { it.reclaimableSize } +
                    screenshots.sumOf { it.size }

            val result = ScanResult(
                similarGroups = similarGroups,
                duplicateGroups = duplicateGroups,
                screenshots = screenshots,
                largeVideos = largeVideos,
                allPhotos = allImages,
                otherMedia = otherMedia,
                totalPhotosCount = allImages.size,
                totalVideosCount = allVideos.size,
                totalReclaimableBytes = totalReclaimable
            )

            emit(ScanProgress.Progress(100, context.getString(com.example.cleanapp.R.string.scan_done)))
            emit(ScanProgress.Completed(result))
        } catch (t: Throwable) {
            t.printStackTrace()
            emit(ScanProgress.Error(t.localizedMessage ?: context.getString(com.example.cleanapp.R.string.scan_failed)))
        }
    }.flowOn(Dispatchers.IO)

    private fun fetchAllImages(): List<MediaAsset> {
        val list = mutableListOf<MediaAsset>()
        try {
            val projection = arrayOf(
                MediaStore.Images.Media._ID,
                MediaStore.Images.Media.DISPLAY_NAME,
                MediaStore.Images.Media.DATA,
                MediaStore.Images.Media.MIME_TYPE,
                MediaStore.Images.Media.SIZE,
                MediaStore.Images.Media.DATE_ADDED,
                MediaStore.Images.Media.DATE_TAKEN,
                MediaStore.Images.Media.WIDTH,
                MediaStore.Images.Media.HEIGHT
            )

            val sortOrder = "${MediaStore.Images.Media.DATE_ADDED} DESC"
            val query = context.contentResolver.query(
                MediaStore.Images.Media.EXTERNAL_CONTENT_URI,
                projection,
                null,
                null,
                sortOrder
            )

            query?.use { cursor ->
                val idCol = cursor.getColumnIndex(MediaStore.Images.Media._ID)
                val nameCol = cursor.getColumnIndex(MediaStore.Images.Media.DISPLAY_NAME)
                val dataCol = cursor.getColumnIndex(MediaStore.Images.Media.DATA)
                val mimeCol = cursor.getColumnIndex(MediaStore.Images.Media.MIME_TYPE)
                val sizeCol = cursor.getColumnIndex(MediaStore.Images.Media.SIZE)
                val addedCol = cursor.getColumnIndex(MediaStore.Images.Media.DATE_ADDED)
                val takenCol = cursor.getColumnIndex(MediaStore.Images.Media.DATE_TAKEN)
                val widthCol = cursor.getColumnIndex(MediaStore.Images.Media.WIDTH)
                val heightCol = cursor.getColumnIndex(MediaStore.Images.Media.HEIGHT)

                while (cursor.moveToNext()) {
                    val id = if (idCol >= 0) cursor.getLong(idCol) else continue
                    val name = if (nameCol >= 0) cursor.getString(nameCol) ?: "Image_$id" else "Image_$id"
                    val path = if (dataCol >= 0) cursor.getString(dataCol) ?: "" else ""
                    val mime = if (mimeCol >= 0) cursor.getString(mimeCol) ?: "image/jpeg" else "image/jpeg"
                    val size = if (sizeCol >= 0) cursor.getLong(sizeCol) else 0L
                    val added = if (addedCol >= 0) cursor.getLong(addedCol) * 1000L else System.currentTimeMillis()
                    val taken = if (takenCol >= 0) {
                        val t = cursor.getLong(takenCol)
                        if (t > 0) t else added
                    } else added
                    val width = if (widthCol >= 0) cursor.getInt(widthCol) else 0
                    val height = if (heightCol >= 0) cursor.getInt(heightCol) else 0

                    val uri = ContentUris.withAppendedId(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, id)
                    val isScreenshot = path.lowercase().contains("screenshot") || name.lowercase().contains("screenshot")

                    if (size > 0) {
                        list.add(
                            MediaAsset(
                                id = id,
                                uri = uri,
                                path = path,
                                displayName = name,
                                mimeType = mime,
                                size = size,
                                dateAdded = added,
                                dateTaken = taken,
                                width = width,
                                height = height,
                                isScreenshot = isScreenshot
                            )
                        )
                    }
                }
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return list
    }

    private fun fetchAllVideos(): List<MediaAsset> {
        val list = mutableListOf<MediaAsset>()
        try {
            val projection = arrayOf(
                MediaStore.Video.Media._ID,
                MediaStore.Video.Media.DISPLAY_NAME,
                MediaStore.Video.Media.DATA,
                MediaStore.Video.Media.MIME_TYPE,
                MediaStore.Video.Media.SIZE,
                MediaStore.Video.Media.DATE_ADDED,
                MediaStore.Video.Media.DATE_TAKEN,
                MediaStore.Video.Media.WIDTH,
                MediaStore.Video.Media.HEIGHT,
                MediaStore.Video.Media.DURATION
            )

            val sortOrder = "${MediaStore.Video.Media.SIZE} DESC"
            val query = context.contentResolver.query(
                MediaStore.Video.Media.EXTERNAL_CONTENT_URI,
                projection,
                null,
                null,
                sortOrder
            )

            query?.use { cursor ->
                val idCol = cursor.getColumnIndex(MediaStore.Video.Media._ID)
                val nameCol = cursor.getColumnIndex(MediaStore.Video.Media.DISPLAY_NAME)
                val dataCol = cursor.getColumnIndex(MediaStore.Video.Media.DATA)
                val mimeCol = cursor.getColumnIndex(MediaStore.Video.Media.MIME_TYPE)
                val sizeCol = cursor.getColumnIndex(MediaStore.Video.Media.SIZE)
                val addedCol = cursor.getColumnIndex(MediaStore.Video.Media.DATE_ADDED)
                val takenCol = cursor.getColumnIndex(MediaStore.Video.Media.DATE_TAKEN)
                val widthCol = cursor.getColumnIndex(MediaStore.Video.Media.WIDTH)
                val heightCol = cursor.getColumnIndex(MediaStore.Video.Media.HEIGHT)
                val durationCol = cursor.getColumnIndex(MediaStore.Video.Media.DURATION)

                while (cursor.moveToNext()) {
                    val id = if (idCol >= 0) cursor.getLong(idCol) else continue
                    val name = if (nameCol >= 0) cursor.getString(nameCol) ?: "Video_$id" else "Video_$id"
                    val path = if (dataCol >= 0) cursor.getString(dataCol) ?: "" else ""
                    val mime = if (mimeCol >= 0) cursor.getString(mimeCol) ?: "video/mp4" else "video/mp4"
                    val size = if (sizeCol >= 0) cursor.getLong(sizeCol) else 0L
                    val added = if (addedCol >= 0) cursor.getLong(addedCol) * 1000L else System.currentTimeMillis()
                    val taken = if (takenCol >= 0) {
                        val t = cursor.getLong(takenCol)
                        if (t > 0) t else added
                    } else added
                    val width = if (widthCol >= 0) cursor.getInt(widthCol) else 0
                    val height = if (heightCol >= 0) cursor.getInt(heightCol) else 0
                    val duration = if (durationCol >= 0) cursor.getLong(durationCol) else 0L

                    val uri = ContentUris.withAppendedId(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, id)

                    if (size > 0) {
                        list.add(
                            MediaAsset(
                                id = id,
                                uri = uri,
                                path = path,
                                displayName = name,
                                mimeType = mime,
                                size = size,
                                dateAdded = added,
                                dateTaken = taken,
                                width = width,
                                height = height,
                                durationMs = duration,
                                isVideo = true
                            )
                        )
                    }
                }
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return list
    }

    private fun computeHashSafely(asset: MediaAsset): Long {
        return try {
            val options = BitmapFactory.Options().apply {
                val maxDim = maxOf(asset.width, asset.height)
                inSampleSize = if (maxDim > 1000) 16 else if (maxDim > 500) 8 else 4
                inPreferredConfig = android.graphics.Bitmap.Config.RGB_565
            }
            context.contentResolver.openInputStream(asset.uri)?.use { stream ->
                val bmp = BitmapFactory.decodeStream(stream, null, options)
                if (bmp != null) {
                    val hash = DHash.fromBitmap(bmp)
                    if (!bmp.isRecycled) {
                        bmp.recycle()
                    }
                    hash
                } else 0L
            } ?: 0L
        } catch (t: Throwable) {
            0L
        }
    }

    private fun groupSimilarAndDuplicatePhotos(photos: List<MediaAsset>): Pair<List<SimilarGroup>, List<SimilarGroup>> {
        val similarGroups = mutableListOf<SimilarGroup>()
        val duplicateGroups = mutableListOf<SimilarGroup>()

        val visited = HashSet<Long>()
        val n = photos.size

        for (i in 0 until n) {
            val p1 = photos[i]
            if (visited.contains(p1.id)) continue

            val currentGroup = mutableListOf(p1)
            var isExactMatchGroup = true

            for (j in i + 1 until n) {
                val p2 = photos[j]
                if (visited.contains(p2.id)) continue

                val h1 = p1.dHash ?: 0L
                val h2 = p2.dHash ?: 0L

                if (h1 != 0L && h2 != 0L) {
                    val distance = DHash.hammingDistance(h1, h2)
                    if (distance == 0 || (p1.size == p2.size && p1.width == p2.width && p1.height == p2.height)) {
                        currentGroup.add(p2)
                        visited.add(p2.id)
                    } else if (distance <= 10) {
                        currentGroup.add(p2)
                        visited.add(p2.id)
                        isExactMatchGroup = false
                    }
                }
            }

            if (currentGroup.size > 1) {
                visited.add(p1.id)
                val (best, duplicates) = BestPhotoSelector.selectBestPhoto(currentGroup)
                val group = SimilarGroup(
                    id = "group_${p1.id}",
                    title = if (isExactMatchGroup) "Duplicate Photos" else "Similar Set",
                    bestAsset = best,
                    duplicateAssets = duplicates
                )
                if (isExactMatchGroup) {
                    duplicateGroups.add(group)
                } else {
                    similarGroups.add(group)
                }
            }
        }

        return Pair(similarGroups, duplicateGroups)
    }

    suspend fun createDeleteRequest(uris: List<Uri>): PendingIntent? = withContext(Dispatchers.IO) {
        if (uris.isEmpty()) return@withContext null
        try {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
                MediaStore.createDeleteRequest(context.contentResolver, uris)
            } else {
                uris.forEach { uri ->
                    try {
                        context.contentResolver.delete(uri, null, null)
                    } catch (e: Exception) {
                        e.printStackTrace()
                    }
                }
                null
            }
        } catch (e: Exception) {
            e.printStackTrace()
            null
        }
    }
}
