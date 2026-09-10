package com.bytedance.sdk.openadsdk.utils;

import android.content.Intent;
import android.os.SystemClock;
import android.util.Log;
import androidx.datastore.preferences.protobuf.a;
import com.applovin.sdk.AppLovinEventTypes;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;

/* JADX INFO: loaded from: classes3.dex */
public class wd {
    private static long lnr = 0;
    static int qdl = -1;
    static float ud;

    public static class qdl {
        public final int qdl;
        public final float ud;

        public qdl(int i2, float f) {
            this.qdl = i2;
            this.ud = f;
        }
    }

    private static void qdl(Intent intent) {
        if (intent.getIntExtra("status", -1) == 2) {
            qdl = 1;
        } else {
            qdl = 0;
        }
        ud = (intent.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1) * 100) / intent.getIntExtra("scale", -1);
    }

    public static qdl qdl() {
        if (lnr == 0 || SystemClock.elapsedRealtime() - lnr > ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS) {
            Intent intentD = a.d("android.intent.action.BATTERY_CHANGED", com.bytedance.sdk.openadsdk.core.yt.qdl(), null);
            Log.d("BatteryDataWatcher", "obtainCurrentState: registerReceiver result is ".concat(String.valueOf(intentD)));
            if (intentD != null) {
                qdl(intentD);
                lnr = SystemClock.elapsedRealtime();
            }
        }
        return new qdl(qdl, ud);
    }
}
