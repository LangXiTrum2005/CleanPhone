package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
abstract class zzzm {
    public final int zza;
    public final zzbg zzb;
    public final int zzc;
    public final zzv zzd;

    public zzzm(int i2, zzbg zzbgVar, int i3) {
        this.zza = i2;
        this.zzb = zzbgVar;
        this.zzc = i3;
        this.zzd = zzbgVar.zza(i3);
    }

    public abstract int zza();

    public abstract boolean zzc(zzzm zzzmVar);
}
