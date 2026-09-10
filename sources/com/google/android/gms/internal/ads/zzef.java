package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class zzef {
    private int zza;
    private long[] zzb;

    public zzef() {
        this(32);
    }

    public final void zza(long j) {
        int i2 = this.zza;
        long[] jArr = this.zzb;
        if (i2 == jArr.length) {
            this.zzb = Arrays.copyOf(jArr, i2 + i2);
        }
        long[] jArr2 = this.zzb;
        int i3 = this.zza;
        this.zza = i3 + 1;
        jArr2[i3] = 0;
    }

    public final void zzb(long[] jArr) {
        int i2 = this.zza;
        int length = jArr.length;
        int i3 = i2 + length;
        long[] jArr2 = this.zzb;
        int length2 = jArr2.length;
        if (i3 > length2) {
            this.zzb = Arrays.copyOf(jArr2, Math.max(length2 + length2, i3));
        }
        System.arraycopy(jArr, 0, this.zzb, this.zza, length);
        this.zza = i3;
    }

    public final long zzc(int i2) {
        if (i2 >= 0 && i2 < this.zza) {
            return this.zzb[i2];
        }
        int i3 = this.zza;
        throw new IndexOutOfBoundsException(p005e.a.a(new StringBuilder(String.valueOf(i2).length() + 24 + String.valueOf(i3).length()), i2, "Invalid index ", i3, ", size is "));
    }

    public final int zzd() {
        return this.zza;
    }

    public zzef(int i2) {
        this.zzb = new long[i2];
    }
}
