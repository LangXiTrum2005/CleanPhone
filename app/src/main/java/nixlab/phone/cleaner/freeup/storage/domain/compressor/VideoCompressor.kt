package nixlab.phone.cleaner.freeup.storage.domain.compressor

import android.content.ContentValues
import android.content.Context
import android.media.MediaCodec
import android.media.MediaCodecInfo
import android.media.MediaExtractor
import android.media.MediaFormat
import android.media.MediaMetadataRetriever
import android.media.MediaMuxer
import android.net.Uri
import android.os.Build
import android.os.Environment
import android.os.ParcelFileDescriptor
import android.provider.MediaStore
import nixlab.phone.cleaner.freeup.storage.R
import nixlab.phone.cleaner.freeup.storage.data.model.MediaAsset
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.suspendCancellableCoroutine
import kotlinx.coroutines.withContext
import java.io.File
import java.nio.ByteBuffer
import kotlin.coroutines.resume

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
        val originalSize = inputAsset.size
        val contentResolver = context.contentResolver

        val baseName = inputAsset.displayName.ifEmpty { "video_${System.currentTimeMillis()}.mp4" }
        val displayName = if (baseName.endsWith(".mp4", ignoreCase = true)) {
            "compressed_${System.currentTimeMillis()}_$baseName"
        } else {
            "compressed_${System.currentTimeMillis()}_$baseName.mp4"
        }

        var outputUri: Uri? = null
        var fallbackFile: File? = null
        var pfd: ParcelFileDescriptor? = null

        val publicMoviesDir = File(
            Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MOVIES),
            "Cleanup"
        ).apply { mkdirs() }
        val targetPublicFile = File(publicMoviesDir, displayName)

        val values = ContentValues().apply {
            put(MediaStore.Video.Media.DISPLAY_NAME, displayName)
            put(MediaStore.Video.Media.MIME_TYPE, "video/mp4")
            put(MediaStore.Video.Media.DATE_ADDED, System.currentTimeMillis() / 1000)
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                put(MediaStore.Video.Media.RELATIVE_PATH, Environment.DIRECTORY_MOVIES + "/Cleanup")
                put(MediaStore.Video.Media.IS_PENDING, 1)
            } else {
                @Suppress("DEPRECATION")
                put(MediaStore.Video.Media.DATA, targetPublicFile.absolutePath)
            }
        }

        try {
            outputUri = contentResolver.insert(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, values)
            if (outputUri != null) {
                pfd = contentResolver.openFileDescriptor(outputUri, "rw")
            }
        } catch (e: Exception) {
            e.printStackTrace()
            outputUri = null
            pfd = null
        }

        if (pfd == null) {
            fallbackFile = targetPublicFile
            try {
                pfd = ParcelFileDescriptor.open(
                    targetPublicFile,
                    ParcelFileDescriptor.MODE_READ_WRITE or ParcelFileDescriptor.MODE_CREATE or ParcelFileDescriptor.MODE_TRUNCATE
                )
                outputUri = Uri.fromFile(targetPublicFile)
            } catch (e: Exception) {
                e.printStackTrace()
                val appMoviesDir = File(context.getExternalFilesDir(Environment.DIRECTORY_MOVIES), "Cleanup").apply { mkdirs() }
                val appOutFile = File(appMoviesDir, displayName)
                fallbackFile = appOutFile
                try {
                    pfd = ParcelFileDescriptor.open(
                        appOutFile,
                        ParcelFileDescriptor.MODE_READ_WRITE or ParcelFileDescriptor.MODE_CREATE or ParcelFileDescriptor.MODE_TRUNCATE
                    )
                    outputUri = Uri.fromFile(appOutFile)
                } catch (ex: Exception) {
                    ex.printStackTrace()
                    return@withContext CompressionResult(success = false)
                }
            }
        }

        val finalUri = outputUri ?: return@withContext CompressionResult(success = false)

        var extractor: MediaExtractor? = null
        var decoder: MediaCodec? = null
        var encoder: MediaCodec? = null
        var muxer: MediaMuxer? = null

        try {
            extractor = MediaExtractor()
            extractor.setDataSource(context, inputAsset.uri, null)

            var videoTrackIndex = -1
            var audioTrackIndex = -1
            var inputVideoFormat: MediaFormat? = null
            var inputAudioFormat: MediaFormat? = null

            for (i in 0 until extractor.trackCount) {
                val format = extractor.getTrackFormat(i)
                val mime = format.getString(MediaFormat.KEY_MIME) ?: ""
                if (mime.startsWith("video/") && videoTrackIndex == -1) {
                    videoTrackIndex = i
                    inputVideoFormat = format
                } else if (mime.startsWith("audio/") && audioTrackIndex == -1) {
                    audioTrackIndex = i
                    inputAudioFormat = format
                }
            }

            if (videoTrackIndex == -1 || inputVideoFormat == null) {
                pfd.close()
                if (fallbackFile == null) {
                    try { contentResolver.delete(finalUri, null, null) } catch (ignored: Exception) {}
                } else {
                    fallbackFile.delete()
                }
                return@withContext CompressionResult(success = false)
            }

            // Extract metadata for rotation and duration
            var durationUs = if (inputVideoFormat.containsKey(MediaFormat.KEY_DURATION)) {
                inputVideoFormat.getLong(MediaFormat.KEY_DURATION)
            } else 0L
            var rotation = 0

            try {
                val retriever = MediaMetadataRetriever()
                retriever.setDataSource(context, inputAsset.uri)
                val durStr = retriever.extractMetadata(MediaMetadataRetriever.METADATA_KEY_DURATION)
                if (durationUs <= 0L && durStr != null) {
                    durationUs = durStr.toLong() * 1000L
                }
                val rotStr = retriever.extractMetadata(MediaMetadataRetriever.METADATA_KEY_VIDEO_ROTATION)
                if (rotStr != null) {
                    rotation = rotStr.toInt()
                }
                retriever.release()
            } catch (e: Exception) {
                e.printStackTrace()
            }

            val origWidth = inputVideoFormat.getInteger(MediaFormat.KEY_WIDTH)
            val origHeight = inputVideoFormat.getInteger(MediaFormat.KEY_HEIGHT)

            var targetWidth = ((origWidth * preset.scale).toInt() / 2) * 2
            var targetHeight = ((origHeight * preset.scale).toInt() / 2) * 2
            targetWidth = targetWidth.coerceAtLeast(160)
            targetHeight = targetHeight.coerceAtLeast(120)

            val estimatedOriginalBitrate = if (durationUs > 0) {
                ((originalSize * 8 * 1000000L) / durationUs).toInt()
            } else {
                2_000_000
            }

            val targetBitrate = (estimatedOriginalBitrate * preset.bitrateRatio).toInt().coerceIn(300_000, 12_000_000)

            val encoderFormat = MediaFormat.createVideoFormat(MediaFormat.MIMETYPE_VIDEO_AVC, targetWidth, targetHeight).apply {
                setInteger(MediaFormat.KEY_COLOR_FORMAT, MediaCodecInfo.CodecCapabilities.COLOR_FormatSurface)
                setInteger(MediaFormat.KEY_BIT_RATE, targetBitrate)
                setInteger(MediaFormat.KEY_FRAME_RATE, 30)
                setInteger(MediaFormat.KEY_I_FRAME_INTERVAL, 2)
            }

            encoder = MediaCodec.createEncoderByType(MediaFormat.MIMETYPE_VIDEO_AVC)
            encoder.configure(encoderFormat, null, null, MediaCodec.CONFIGURE_FLAG_ENCODE)
            val inputSurface = encoder.createInputSurface()
            encoder.start()

            val decoderMime = inputVideoFormat.getString(MediaFormat.KEY_MIME)!!
            decoder = MediaCodec.createDecoderByType(decoderMime)
            decoder.configure(inputVideoFormat, inputSurface, null, 0)
            decoder.start()

            muxer = MediaMuxer(pfd.fileDescriptor, MediaMuxer.OutputFormat.MUXER_OUTPUT_MPEG_4)
            if (rotation != 0) {
                muxer.setOrientationHint(rotation)
            }

            extractor.selectTrack(videoTrackIndex)

            val bufferInfo = MediaCodec.BufferInfo()
            var decoderDone = false
            var encoderDone = false
            var extractorVideoDone = false
            var muxerStarted = false
            var muxerVideoTrackIndex = -1
            var muxerAudioTrackIndex = -1

            val TIMEOUT_US = 10000L

            while (!encoderDone) {
                // 1. Feed extractor into decoder
                if (!extractorVideoDone) {
                    val inputBufferIndex = decoder.dequeueInputBuffer(TIMEOUT_US)
                    if (inputBufferIndex >= 0) {
                        val inputBuffer = decoder.getInputBuffer(inputBufferIndex)
                        if (inputBuffer != null) {
                            val sampleSize = extractor.readSampleData(inputBuffer, 0)
                            if (sampleSize < 0) {
                                decoder.queueInputBuffer(inputBufferIndex, 0, 0, 0L, MediaCodec.BUFFER_FLAG_END_OF_STREAM)
                                extractorVideoDone = true
                            } else {
                                val sampleTime = extractor.sampleTime
                                val sampleFlags = extractor.sampleFlags
                                decoder.queueInputBuffer(inputBufferIndex, 0, sampleSize, sampleTime, sampleFlags)
                                extractor.advance()
                            }
                        }
                    }
                }

                // 2. Read decoder output and render to encoder input surface
                if (!decoderDone) {
                    val decoderStatus = decoder.dequeueOutputBuffer(bufferInfo, TIMEOUT_US)
                    if (decoderStatus >= 0) {
                        val doRender = bufferInfo.size != 0
                        if ((bufferInfo.flags and MediaCodec.BUFFER_FLAG_END_OF_STREAM) != 0) {
                            decoderDone = true
                            encoder.signalEndOfInputStream()
                        }
                        val renderTimeNs = if (doRender) bufferInfo.presentationTimeUs * 1000L else 0L
                        decoder.releaseOutputBuffer(decoderStatus, renderTimeNs)

                        if (durationUs > 0) {
                            val progress = ((bufferInfo.presentationTimeUs.toDouble() / durationUs) * 90).toInt().coerceIn(1, 90)
                            withContext(Dispatchers.Main) {
                                onProgress(progress)
                            }
                        }
                    }
                }

                // 3. Read encoder output and write to muxer
                var encoderStatus = encoder.dequeueOutputBuffer(bufferInfo, TIMEOUT_US)
                while (encoderStatus >= 0 || encoderStatus == MediaCodec.INFO_OUTPUT_FORMAT_CHANGED) {
                    if (encoderStatus == MediaCodec.INFO_OUTPUT_FORMAT_CHANGED) {
                        if (muxerStarted) {
                            throw RuntimeException("Format changed twice")
                        }
                        val newFormat = encoder.outputFormat
                        muxerVideoTrackIndex = muxer.addTrack(newFormat)
                        if (audioTrackIndex >= 0 && inputAudioFormat != null) {
                            muxerAudioTrackIndex = muxer.addTrack(inputAudioFormat)
                        }
                        muxer.start()
                        muxerStarted = true
                    } else if (encoderStatus >= 0) {
                        val encodedData = encoder.getOutputBuffer(encoderStatus)
                        if (encodedData != null && bufferInfo.size > 0 && muxerStarted) {
                            if ((bufferInfo.flags and MediaCodec.BUFFER_FLAG_CODEC_CONFIG) == 0) {
                                muxer.writeSampleData(muxerVideoTrackIndex, encodedData, bufferInfo)
                            }
                        }
                        encoder.releaseOutputBuffer(encoderStatus, false)
                        if ((bufferInfo.flags and MediaCodec.BUFFER_FLAG_END_OF_STREAM) != 0) {
                            encoderDone = true
                            break
                        }
                    }
                    encoderStatus = encoder.dequeueOutputBuffer(bufferInfo, 0L)
                }
            }

            // Copy audio track if present
            if (audioTrackIndex >= 0 && muxerStarted && muxerAudioTrackIndex >= 0) {
                try {
                    extractor.unselectTrack(videoTrackIndex)
                    extractor.selectTrack(audioTrackIndex)
                    extractor.seekTo(0L, MediaExtractor.SEEK_TO_CLOSEST_SYNC)

                    val audioBuffer = ByteBuffer.allocateDirect(256 * 1024)
                    val audioBufferInfo = MediaCodec.BufferInfo()

                    while (true) {
                        val sampleSize = extractor.readSampleData(audioBuffer, 0)
                        if (sampleSize < 0) break
                        audioBufferInfo.set(
                            0,
                            sampleSize,
                            extractor.sampleTime,
                            extractor.sampleFlags
                        )
                        muxer.writeSampleData(muxerAudioTrackIndex, audioBuffer, audioBufferInfo)
                        extractor.advance()
                    }
                } catch (e: Exception) {
                    e.printStackTrace()
                }
            }

            withContext(Dispatchers.Main) {
                onProgress(98)
            }

            // Release resources before reading output file size
            try { decoder.stop(); decoder.release() } catch (ignored: Exception) {}
            try { encoder.stop(); encoder.release() } catch (ignored: Exception) {}
            try { extractor.release() } catch (ignored: Exception) {}
            try { if (muxerStarted) { muxer.stop() }; muxer.release() } catch (ignored: Exception) {}
            try { pfd.close() } catch (ignored: Exception) {}

            decoder = null
            encoder = null
            extractor = null
            muxer = null
            pfd = null

            if (fallbackFile == null && Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                try {
                    values.clear()
                    values.put(MediaStore.Video.Media.IS_PENDING, 0)
                    contentResolver.update(finalUri, values, null, null)
                } catch (e: Exception) {
                    e.printStackTrace()
                }
            }

            var scannedResultUri: Uri? = null
            try {
                val scanPath = fallbackFile?.absolutePath ?: targetPublicFile.absolutePath
                suspendCancellableCoroutine<Unit> { continuation ->
                    android.media.MediaScannerConnection.scanFile(
                        context,
                        arrayOf(scanPath),
                        arrayOf("video/mp4")
                    ) { _, uri ->
                        if (uri != null) {
                            scannedResultUri = uri
                        }
                        nixlab.phone.cleaner.freeup.storage.util.MediaStoreSyncManager.notifyManualMediaChange()
                        if (continuation.isActive) {
                            continuation.resume(Unit)
                        }
                    }
                }
            } catch (e: Exception) {
                e.printStackTrace()
                nixlab.phone.cleaner.freeup.storage.util.MediaStoreSyncManager.notifyManualMediaChange()
            }

            val resultOutputUri = scannedResultUri ?: finalUri

            var compressedSize = 0L
            try {
                if (fallbackFile != null && fallbackFile.exists()) {
                    compressedSize = fallbackFile.length()
                } else {
                    contentResolver.openFileDescriptor(finalUri, "r")?.use { readPfd ->
                        compressedSize = readPfd.statSize
                    }
                }
            } catch (e: Exception) {
                e.printStackTrace()
            }

            if (compressedSize <= 0L) {
                compressedSize = (originalSize * preset.bitrateRatio).toLong()
            }

            withContext(Dispatchers.Main) {
                onProgress(100)
            }

            CompressionResult(
                success = true,
                outputUri = resultOutputUri,
                originalSize = originalSize,
                compressedSize = compressedSize,
                savedBytes = (originalSize - compressedSize).coerceAtLeast(0L)
            )

        } catch (e: Exception) {
            e.printStackTrace()
            try { decoder?.stop(); decoder?.release() } catch (ignored: Exception) {}
            try { encoder?.stop(); encoder?.release() } catch (ignored: Exception) {}
            try { extractor?.release() } catch (ignored: Exception) {}
            try { muxer?.release() } catch (ignored: Exception) {}
            try { pfd?.close() } catch (ignored: Exception) {}
            if (fallbackFile == null) {
                try { contentResolver.delete(finalUri, null, null) } catch (ignored: Exception) {}
            } else {
                try { fallbackFile.delete() } catch (ignored: Exception) {}
            }

            CompressionResult(success = false)
        }
    }
}

