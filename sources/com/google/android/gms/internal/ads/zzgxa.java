package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgxa {
    public static long[] zza(long[]... jArr) {
        long length = 0;
        for (long[] jArr2 : jArr) {
            length += (long) jArr2.length;
        }
        int i2 = (int) length;
        zzgqa.zze(length == ((long) i2), "the total number of elements (%s) in the arrays must fit in an int", length);
        long[] jArr3 = new long[i2];
        int i3 = 0;
        for (long[] jArr4 : jArr) {
            int length2 = jArr4.length;
            System.arraycopy(jArr4, 0, jArr3, i3, length2);
            i3 += length2;
        }
        return jArr3;
    }
}
