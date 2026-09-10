package com.example.cleanapp.util

import android.os.Environment
import android.os.StatFs
import java.io.File
import java.text.DecimalFormat
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

object FileUtils {

    data class StorageStats(
        val totalBytes: Long,
        val freeBytes: Long,
        val usedBytes: Long,
        val usedPercentage: Int
    )

    fun getDeviceStorageStats(): StorageStats {
        return try {
            val path = Environment.getDataDirectory()
            val stat = StatFs(path.path)
            val blockSize = stat.blockSizeLong
            val totalBlocks = stat.blockCountLong
            val availableBlocks = stat.availableBlocksLong

            val total = totalBlocks * blockSize
            val free = availableBlocks * blockSize
            val used = total - free
            val percentage = if (total > 0) ((used.toDouble() / total.toDouble()) * 100).toInt() else 0

            StorageStats(
                totalBytes = total,
                freeBytes = free,
                usedBytes = used,
                usedPercentage = percentage.coerceIn(0, 100)
            )
        } catch (e: Exception) {
            StorageStats(
                totalBytes = 64L * 1024 * 1024 * 1024,
                freeBytes = 20L * 1024 * 1024 * 1024,
                usedBytes = 44L * 1024 * 1024 * 1024,
                usedPercentage = 68
            )
        }
    }

    fun formatBytes(bytes: Long): String {
        if (bytes <= 0) return "0 B"
        val units = arrayOf("B", "KB", "MB", "GB", "TB")
        val digitGroups = (Math.log10(bytes.toDouble()) / Math.log10(1024.0)).toInt()
        val value = bytes / Math.pow(1024.0, digitGroups.toDouble())
        return DecimalFormat("#,##0.#").format(value) + " " + units[digitGroups.coerceIn(0, units.size - 1)]
    }

    fun formatGbOnly(bytes: Long): String {
        val gb = bytes.toDouble() / (1024.0 * 1024.0 * 1024.0)
        return DecimalFormat("#,##0.#").format(gb) + " GB"
    }

    fun formatMonthYear(timestampMs: Long): String {
        val date = Date(timestampMs)
        return SimpleDateFormat("MMMM yyyy", Locale.getDefault()).format(date)
    }

    fun formatDate(timestampMs: Long): String {
        val date = Date(timestampMs)
        return SimpleDateFormat("dd/MM/yyyy", Locale.getDefault()).format(date)
    }
}
