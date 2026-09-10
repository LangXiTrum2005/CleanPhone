package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdns implements zzijg {
    private final zzijp zza;

    private zzdns(zzijp zzijpVar) {
        this.zza = zzijpVar;
    }

    public static zzdns zza(zzijp zzijpVar) {
        return new zzdns(zzijpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdnr(((zzcwb) this.zza).zza());
    }
}
