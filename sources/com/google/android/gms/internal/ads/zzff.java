package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class zzff {
    private long[] zza;
    private Object[] zzb;
    private int zzc;
    private int zzd;

    public zzff() {
        throw null;
    }

    private final Object zzf() {
        zzgqa.zzi(this.zzd > 0);
        Object[] objArr = this.zzb;
        int i2 = this.zzc;
        Object obj = objArr[i2];
        objArr[i2] = null;
        this.zzc = (i2 + 1) % objArr.length;
        this.zzd--;
        return obj;
    }

    public final synchronized void zza(long j, Object obj) {
        try {
            int i2 = this.zzd;
            if (i2 > 0) {
                if (j <= this.zza[((this.zzc + i2) - 1) % this.zzb.length]) {
                    zzb();
                }
            }
            int length = this.zzb.length;
            if (this.zzd >= length) {
                int i3 = length + length;
                long[] jArr = new long[i3];
                Object[] objArr = new Object[i3];
                int i4 = this.zzc;
                int i5 = length - i4;
                System.arraycopy(this.zza, i4, jArr, 0, i5);
                System.arraycopy(this.zzb, this.zzc, objArr, 0, i5);
                int i6 = this.zzc;
                if (i6 > 0) {
                    System.arraycopy(this.zza, 0, jArr, i5, i6);
                    System.arraycopy(this.zzb, 0, objArr, i5, this.zzc);
                }
                this.zza = jArr;
                this.zzb = objArr;
                this.zzc = 0;
            }
            int i7 = this.zzc;
            int i8 = this.zzd;
            Object[] objArr2 = this.zzb;
            int length2 = (i7 + i8) % objArr2.length;
            this.zza[length2] = j;
            objArr2[length2] = obj;
            this.zzd = i8 + 1;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzb() {
        this.zzc = 0;
        this.zzd = 0;
        Arrays.fill(this.zzb, (Object) null);
    }

    public final synchronized int zzc() {
        return this.zzd;
    }

    public final synchronized Object zzd() {
        if (this.zzd == 0) {
            return null;
        }
        return zzf();
    }

    public final synchronized Object zze(long j) {
        Object objZzf;
        objZzf = null;
        while (this.zzd > 0 && j - this.zza[this.zzc] >= 0) {
            objZzf = zzf();
        }
        return objZzf;
    }

    public zzff(int i2) {
        this.zza = new long[10];
        this.zzb = new Object[10];
    }
}
