package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.util.ParsableByteArray;

/* JADX INFO: loaded from: classes3.dex */
public final class TsUtil {
    public static long a(ParsableByteArray parsableByteArray, int i2, int i3) {
        parsableByteArray.F(i2);
        if (parsableByteArray.a() < 5) {
            return -9223372036854775807L;
        }
        int iG = parsableByteArray.g();
        if ((8388608 & iG) != 0 || ((2096896 & iG) >> 8) != i3 || (iG & 32) == 0 || parsableByteArray.u() < 7 || parsableByteArray.a() < 7 || (parsableByteArray.u() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        parsableByteArray.e(bArr, 0, 6);
        return ((((long) bArr[0]) & 255) << 25) | ((((long) bArr[1]) & 255) << 17) | ((((long) bArr[2]) & 255) << 9) | ((((long) bArr[3]) & 255) << 1) | ((((long) bArr[4]) & 255) >> 7);
    }
}
