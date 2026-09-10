package com.example.cleanapp.data.repository

import android.app.usage.UsageStats
import android.app.usage.UsageStatsManager
import android.content.Context
import android.content.pm.ApplicationInfo
import android.content.pm.PackageManager
import com.example.cleanapp.data.model.AppItem
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.io.File
import java.util.Calendar

class AppManagerRepository(private val context: Context) {

    suspend fun getInstalledUserApps(): List<AppItem> = withContext(Dispatchers.IO) {
        val pm = context.packageManager
        val apps = try {
            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.TIRAMISU) {
                pm.getInstalledApplications(PackageManager.ApplicationInfoFlags.of(PackageManager.GET_META_DATA.toLong()))
            } else {
                @Suppress("DEPRECATION")
                pm.getInstalledApplications(PackageManager.GET_META_DATA)
            }
        } catch (e: Exception) {
            emptyList()
        }
        val usageMap = getUsageStatsMap()

        val list = mutableListOf<AppItem>()

        for (app in apps) {
            try {
                // Filter out system apps, keep user-installed or updated apps
                val isSystem = (app.flags and ApplicationInfo.FLAG_SYSTEM) != 0
                val isUpdatedSystem = (app.flags and ApplicationInfo.FLAG_UPDATED_SYSTEM_APP) != 0

                if ((!isSystem || isUpdatedSystem) && app.packageName != context.packageName) {
                    val name = try {
                        pm.getApplicationLabel(app).toString()
                    } catch (e: Exception) {
                        app.packageName
                    }
                    val icon = try {
                        pm.getApplicationIcon(app)
                    } catch (e: Exception) {
                        null
                    }
                    val size = try {
                        if (!app.sourceDir.isNullOrEmpty()) File(app.sourceDir).length() else 0L
                    } catch (e: Exception) {
                        0L
                    }

                    val usage = usageMap[app.packageName]
                    val lastUsed = usage?.lastTimeUsed ?: 0L
                    val timeInForeground = usage?.totalTimeInForeground ?: 0L

                    list.add(
                        AppItem(
                            packageName = app.packageName,
                            appName = name,
                            icon = icon,
                            sizeBytes = size,
                            lastUsedTimestamp = lastUsed,
                            totalTimeInForegroundMs = timeInForeground
                        )
                    )
                }
            } catch (e: Exception) {
                // Ignore any individual problematic app
            }
        }

        list.sortedByDescending { it.sizeBytes }
    }

    private fun getUsageStatsMap(): Map<String, UsageStats> {
        return try {
            val usm = context.getSystemService(Context.USAGE_STATS_SERVICE) as? UsageStatsManager ?: return emptyMap()
            val calendar = Calendar.getInstance()
            val endTime = calendar.timeInMillis
            calendar.add(Calendar.DAY_OF_YEAR, -30)
            val startTime = calendar.timeInMillis

            val aggregateStats = usm.queryAndAggregateUsageStats(startTime, endTime)
            if (!aggregateStats.isNullOrEmpty()) {
                aggregateStats
            } else {
                val stats = usm.queryUsageStats(UsageStatsManager.INTERVAL_MONTHLY, startTime, endTime)
                    ?: usm.queryUsageStats(UsageStatsManager.INTERVAL_DAILY, startTime, endTime)
                stats?.associateBy { it.packageName } ?: emptyMap()
            }
        } catch (e: Exception) {
            emptyMap()
        }
    }
}
