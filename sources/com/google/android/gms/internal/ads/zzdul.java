package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdul implements zzijg {
    private final zzijp zza;

    private zzdul(zzduk zzdukVar, zzijp zzijpVar) {
        this.zza = zzijpVar;
    }

    public static zzdul zza(zzduk zzdukVar, zzijp zzijpVar) {
        return new zzdul(zzdukVar, zzijpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdij(((zzduj) this.zza).zzb(), zzcdo.zzf);
    }
}
