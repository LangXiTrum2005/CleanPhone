package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdpr implements zzijg {
    private final zzijp zza;

    private zzdpr(zzdpq zzdpqVar, zzijp zzijpVar) {
        this.zza = zzijpVar;
    }

    public static zzdpr zza(zzdpq zzdpqVar, zzijp zzijpVar) {
        return new zzdpr(zzdpqVar, zzijpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzdpo zzdpoVar = (zzdpo) this.zza.zzb();
        zzijo.zzb(zzdpoVar);
        return zzdpoVar;
    }
}
