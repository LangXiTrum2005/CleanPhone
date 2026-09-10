package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdmr implements zzijg {
    private final zzijp zza;

    private zzdmr(zzdmi zzdmiVar, zzijp zzijpVar) {
        this.zza = zzijpVar;
    }

    public static zzdmr zza(zzdmi zzdmiVar, zzijp zzijpVar) {
        return new zzdmr(zzdmiVar, zzijpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdij((zzdpm) this.zza.zzb(), zzcdo.zza);
    }
}
