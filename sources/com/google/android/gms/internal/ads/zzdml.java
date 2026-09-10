package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdml implements zzijg {
    private final zzijp zza;

    private zzdml(zzdmi zzdmiVar, zzijp zzijpVar) {
        this.zza = zzijpVar;
    }

    public static zzdml zzc(zzdmi zzdmiVar, zzijp zzijpVar) {
        return new zzdml(zzdmiVar, zzijpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdnr zzb() {
        zzdnq zzdnqVar = (zzdnq) this.zza.zzb();
        zzijo.zzb(zzdnqVar);
        return zzdnqVar;
    }
}
