package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdmm implements zzijg {
    private final zzijp zza;

    private zzdmm(zzdmi zzdmiVar, zzijp zzijpVar) {
        this.zza = zzijpVar;
    }

    public static zzdmm zzc(zzdmi zzdmiVar, zzijp zzijpVar) {
        return new zzdmm(zzdmiVar, zzijpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdnu zzb() {
        zzdmg zzdmgVar = (zzdmg) this.zza.zzb();
        zzijo.zzb(zzdmgVar);
        return zzdmgVar;
    }
}
