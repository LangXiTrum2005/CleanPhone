package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzaky {
    public final zzakv zza;
    public final int zzb;
    public final long[] zzc;
    public final int[] zzd;
    public final int zze;
    public final long[] zzf;
    public final int[] zzg;
    public final int[] zzh;
    public final long zzi;
    public final boolean zzj;

    public zzaky(zzakv zzakvVar, long[] jArr, int[] iArr, int i2, long[] jArr2, int[] iArr2, int[] iArr3, boolean z2, long j, int i3) {
        int length = iArr.length;
        int length2 = jArr2.length;
        zzgqa.zza(length == length2);
        zzgqa.zza(jArr.length == length2);
        int length3 = iArr2.length;
        zzgqa.zza(length3 == length2);
        this.zza = zzakvVar;
        this.zzc = jArr;
        this.zzd = iArr;
        this.zze = i2;
        this.zzf = jArr2;
        this.zzg = iArr2;
        this.zzh = iArr3;
        this.zzj = z2;
        this.zzi = j;
        this.zzb = i3;
        if (length3 > 0) {
            int i4 = length3 - 1;
            iArr2[i4] = iArr2[i4] | 536870912;
        }
    }

    public final int zza(long j) {
        int i2 = 0;
        if (this.zzj) {
            return zzfj.zzm(this.zzf, j, true, false);
        }
        int[] iArr = this.zzh;
        int length = iArr.length - 1;
        int i3 = -1;
        while (i2 <= length) {
            int i4 = ((length - i2) / 2) + i2;
            if (this.zzf[iArr[i4]] <= j) {
                i2 = i4 + 1;
                i3 = i4;
            } else {
                length = i4 - 1;
            }
        }
        if (i3 == -1) {
            return -1;
        }
        long[] jArr = this.zzf;
        long j2 = jArr[iArr[i3]];
        if (j2 == j) {
            while (i3 > 0) {
                int i5 = i3 - 1;
                if (jArr[iArr[i5]] != j2) {
                    break;
                }
                i3 = i5;
            }
        }
        return iArr[i3];
    }

    public final int zzb(long j) {
        int i2 = 0;
        if (this.zzj) {
            return zzfj.zzo(this.zzf, j, true, false);
        }
        int[] iArr = this.zzh;
        int length = iArr.length - 1;
        int i3 = -1;
        while (i2 <= length) {
            int i4 = ((length - i2) / 2) + i2;
            if (this.zzf[iArr[i4]] >= j) {
                length = i4 - 1;
                i3 = i4;
            } else {
                i2 = i4 + 1;
            }
        }
        if (i3 == -1) {
            return -1;
        }
        long[] jArr = this.zzf;
        long j2 = jArr[iArr[i3]];
        if (j2 == j) {
            while (i3 < iArr.length - 1) {
                int i5 = i3 + 1;
                if (jArr[iArr[i5]] != j2) {
                    break;
                }
                i3 = i5;
            }
        }
        return iArr[i3];
    }
}
