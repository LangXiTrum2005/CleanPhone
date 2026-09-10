package com.inmobi.media;

import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Resources;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.y5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3367y5 {
    public static final int a() {
        int i = Resources.getSystem().getDisplayMetrics().densityDpi;
        if (640 <= i && i <= Integer.MAX_VALUE) {
            return 1080;
        }
        if (480 <= i && i < 640) {
            return 720;
        }
        if (320 <= i && i < 480) {
            return 480;
        }
        if (240 > i || i >= 320) {
            return PsExtractor.VIDEO_STREAM_MASK;
        }
        return 360;
    }

    public static final boolean a(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Object systemService = context.getSystemService("activity");
        Intrinsics.competently(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        ActivityManager activityManager = (ActivityManager) systemService;
        Intrinsics.checkNotNullParameter(activityManager, "<this>");
        C3342x5.a.getClass();
        if (!(C3342x5.u() ? activityManager.isLowRamDevice() : true)) {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            if (memoryInfo.availMem / ((long) ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) >= 100) {
                return false;
            }
        }
        return true;
    }
}
