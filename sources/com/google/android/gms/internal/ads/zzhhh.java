package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
class zzhhh {
    final long[] zza;
    final long[] zzb;
    final long[] zzc;

    public zzhhh(long[] jArr, long[] jArr2, long[] jArr3) {
        this.zza = jArr;
        this.zzb = jArr2;
        this.zzc = jArr3;
    }

    public void zza(long[] jArr, long[] jArr2) {
        System.arraycopy(jArr2, 0, jArr, 0, 10);
    }

    public final void zzb(zzhhh zzhhhVar, int i2) {
        zzhhg.zza(this.zza, zzhhhVar.zza, i2);
        zzhhg.zza(this.zzb, zzhhhVar.zzb, i2);
        zzhhg.zza(this.zzc, zzhhhVar.zzc, i2);
    }

    public zzhhh() {
        this(new long[10], new long[10], new long[10]);
    }

    public zzhhh(zzhhh zzhhhVar) {
        this.zza = Arrays.copyOf(zzhhhVar.zza, 10);
        this.zzb = Arrays.copyOf(zzhhhVar.zzb, 10);
        this.zzc = Arrays.copyOf(zzhhhVar.zzc, 10);
    }
}
