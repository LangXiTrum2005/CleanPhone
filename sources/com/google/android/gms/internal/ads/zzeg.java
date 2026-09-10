package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzeg {
    private int zza;
    private int zzb;
    private int zzc;
    private long[] zzd;
    private int zze;

    public zzeg() {
        throw null;
    }

    public final void zza(long j) {
        int i2 = this.zzc;
        long[] jArr = this.zzd;
        int length = jArr.length;
        if (i2 == length) {
            int i3 = length + length;
            if (i3 < 0) {
                throw new IllegalStateException();
            }
            long[] jArr2 = new long[i3];
            int i4 = this.zza;
            int i5 = length - i4;
            System.arraycopy(jArr, i4, jArr2, 0, i5);
            System.arraycopy(this.zzd, 0, jArr2, i5, i4);
            this.zza = 0;
            this.zzb = this.zzc - 1;
            this.zzd = jArr2;
            this.zze = jArr2.length - 1;
            jArr = jArr2;
        }
        int i6 = (this.zzb + 1) & this.zze;
        this.zzb = i6;
        jArr[i6] = j;
        this.zzc++;
    }

    public final long zzb() {
        int i2 = this.zzc;
        if (i2 == 0) {
            throw new NoSuchElementException();
        }
        long[] jArr = this.zzd;
        int i3 = this.zza;
        long j = jArr[i3];
        this.zza = this.zze & (i3 + 1);
        this.zzc = i2 - 1;
        return j;
    }

    public final long zzc() {
        if (this.zzc != 0) {
            return this.zzd[this.zza];
        }
        throw new NoSuchElementException();
    }

    public final boolean zzd() {
        return this.zzc == 0;
    }

    public final void zze() {
        this.zza = 0;
        this.zzb = -1;
        this.zzc = 0;
    }

    public zzeg(int i2) {
        int i3 = 16;
        if (Integer.bitCount(16) != 1) {
            int iHighestOneBit = Integer.highestOneBit(15);
            i3 = iHighestOneBit + iHighestOneBit;
        }
        this.zza = 0;
        this.zzb = -1;
        this.zzc = 0;
        long[] jArr = new long[i3];
        this.zzd = jArr;
        this.zze = jArr.length - 1;
    }
}
