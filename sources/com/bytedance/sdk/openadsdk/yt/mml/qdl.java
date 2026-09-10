package com.bytedance.sdk.openadsdk.yt.mml;

/* JADX INFO: loaded from: classes3.dex */
public class qdl {
    public static long qdl() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        return jCurrentTimeMillis - (jCurrentTimeMillis % 86400000);
    }

    public static boolean qdl(long j) {
        return j - (j % 86400000) == qdl();
    }
}
