package com.bytedance.sdk.openadsdk.utils;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.SystemClock;
import com.applovin.sdk.AppLovinEventTypes;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;

/* JADX INFO: loaded from: classes2.dex */
public class xha {
    private static long ik = 0;
    static float lr = 0.0f;
    static int ri = -1;

    public static class ri {
        public final float lr;
        public final int ri;

        public ri(int i, float f) {
            this.ri = i;
            this.lr = f;
        }
    }

    private static void ri(Intent intent) {
        if (intent.getIntExtra("status", -1) == 2) {
            ri = 1;
        } else {
            ri = 0;
        }
        lr = (intent.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1) * 100) / intent.getIntExtra("scale", -1);
    }

    public static ri ri() {
        if (ik == 0 || SystemClock.elapsedRealtime() - ik > ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS) {
            Intent intentRegisterReceiver = com.bytedance.sdk.openadsdk.core.nr.ri().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            "obtainCurrentState: registerReceiver result is ".concat(String.valueOf(intentRegisterReceiver));
            if (intentRegisterReceiver != null) {
                ri(intentRegisterReceiver);
                ik = SystemClock.elapsedRealtime();
            }
        }
        return new ri(ri, lr);
    }
}
