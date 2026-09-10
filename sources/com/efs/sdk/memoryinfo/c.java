package com.efs.sdk.memoryinfo;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Debug;
import android.os.Process;
import android.support.v4.media.session.PlaybackStateCompat;

/* JADX INFO: loaded from: classes2.dex */
final class c {
    final String activity;
    final String bg;
    final long n;
    final long o;
    final long p;
    final long q;
    final float r;
    final long s;
    final long t;

    public c(Context context) {
        Debug.MemoryInfo[] processMemoryInfo;
        Debug.MemoryInfo memoryInfo = null;
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager != null && (processMemoryInfo = activityManager.getProcessMemoryInfo(new int[]{Process.myPid()})) != null && processMemoryInfo.length > 0) {
                memoryInfo = processMemoryInfo[0];
            }
        } catch (Throwable unused) {
        }
        if (memoryInfo == null) {
            memoryInfo = new Debug.MemoryInfo();
            Debug.getMemoryInfo(memoryInfo);
        }
        this.bg = UMMemoryMonitor.get().isForeground() ? "fg" : "bg";
        this.n = ((long) memoryInfo.getTotalPss()) * PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
        this.o = ((long) memoryInfo.dalvikPss) * PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
        this.p = ((long) memoryInfo.nativePss) * PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
        this.s = f.a(memoryInfo) * PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
        long jFreeMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        this.q = jFreeMemory;
        long jMaxMemory = Runtime.getRuntime().maxMemory();
        if (jMaxMemory != 0) {
            this.r = (jFreeMemory * 1.0f) / jMaxMemory;
        } else {
            this.r = 1.0f;
        }
        this.t = f.a() * PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
        this.activity = UMMemoryMonitor.get().getCurrentActivity();
    }
}
