package com.mbridge.msdk.playercommon.exoplayer2.upstream.crypto;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
final class CryptoUtil {
    private CryptoUtil() {
    }

    public static long getFNV64Hash(String str) {
        long j10 = 0;
        if (str == null) {
            return 0L;
        }
        for (int i10 = 0; i10 < str.length(); i10++) {
            long jCharAt = j10 ^ ((long) str.charAt(i10));
            j10 = jCharAt + (jCharAt << 1) + (jCharAt << 4) + (jCharAt << 5) + (jCharAt << 7) + (jCharAt << 8) + (jCharAt << 40);
        }
        return j10;
    }
}
