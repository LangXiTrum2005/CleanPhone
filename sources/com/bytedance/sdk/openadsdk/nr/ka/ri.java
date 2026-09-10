package com.bytedance.sdk.openadsdk.nr.ka;

import com.vungle.ads.internal.signals.SignalManager;

/* JADX INFO: loaded from: classes2.dex */
public class ri {
    public static long ri() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        return jCurrentTimeMillis - (jCurrentTimeMillis % SignalManager.TWENTY_FOUR_HOURS_MILLIS);
    }

    public static boolean ri(long j) {
        return j - (j % SignalManager.TWENTY_FOUR_HOURS_MILLIS) == ri();
    }
}
