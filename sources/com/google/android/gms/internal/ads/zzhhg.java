package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhhg {
    public static void zza(long[] jArr, long[] jArr2, int i2) {
        for (int i3 = 0; i3 < 10; i3++) {
            int i4 = (int) jArr[i3];
            jArr[i3] = ((-i2) & (((int) jArr2[i3]) ^ i4)) ^ i4;
        }
    }
}
