package com.mbridge.msdk.foundation.download.utils;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class Utils {
    private Utils() {
    }

    public static int getDownloadRate(long j10, long j11) {
        if (j10 == 0 || j11 == 0) {
            return 0;
        }
        if (j10 == j11) {
            return 100;
        }
        return (int) (((j11 * 1.0d) / (j10 * 1.0d)) * 100.0d);
    }
}
