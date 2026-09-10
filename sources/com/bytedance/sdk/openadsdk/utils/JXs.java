package com.bytedance.sdk.openadsdk.utils;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;

/* JADX INFO: loaded from: classes2.dex */
public class JXs {
    static float LD = 0.0f;
    static int Lxb = -1;
    private static long lk;

    public static class Lxb {
        public final float LD;
        public final int Lxb;

        public Lxb(int i, float f) {
            this.Lxb = i;
            this.LD = f;
        }
    }

    private static void Lxb(Intent intent) {
        if (intent.getIntExtra(NotificationCompat.CATEGORY_STATUS, -1) == 2) {
            Lxb = 1;
        } else {
            Lxb = 0;
        }
        LD = (intent.getIntExtra("level", -1) * 100) / intent.getIntExtra("scale", -1);
    }

    @NonNull
    public static Lxb Lxb() {
        if (lk == 0 || SystemClock.elapsedRealtime() - lk > ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS) {
            Intent intentRegisterReceiver = com.bytedance.sdk.openadsdk.core.kqm.Lxb().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            "obtainCurrentState: registerReceiver result is ".concat(String.valueOf(intentRegisterReceiver));
            if (intentRegisterReceiver != null) {
                Lxb(intentRegisterReceiver);
                lk = SystemClock.elapsedRealtime();
            }
        }
        return new Lxb(Lxb, LD);
    }
}
