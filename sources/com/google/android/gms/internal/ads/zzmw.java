package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes4.dex */
public final class zzmw {
    private final zzs zza;
    private final SparseArray zzb;

    public zzmw(zzs zzsVar, SparseArray sparseArray) {
        this.zza = zzsVar;
        SparseArray sparseArray2 = new SparseArray(zzsVar.zzb());
        for (int i2 = 0; i2 < zzsVar.zzb(); i2++) {
            int iZzc = zzsVar.zzc(i2);
            zzmv zzmvVar = (zzmv) sparseArray.get(iZzc);
            zzmvVar.getClass();
            sparseArray2.append(iZzc, zzmvVar);
        }
        this.zzb = sparseArray2;
    }

    public final zzmv zza(int i2) {
        zzmv zzmvVar = (zzmv) this.zzb.get(i2);
        zzmvVar.getClass();
        return zzmvVar;
    }

    public final boolean zzb(int i2) {
        return this.zza.zza(i2);
    }

    public final int zzc() {
        return this.zza.zzb();
    }

    public final int zzd(int i2) {
        return this.zza.zzc(i2);
    }
}
