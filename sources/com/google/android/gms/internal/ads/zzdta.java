package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdta implements zzijg {
    private final zzijp zza;

    private zzdta(zzijp zzijpVar) {
        this.zza = zzijpVar;
    }

    public static zzdta zzc(zzijp zzijpVar) {
        return new zzdta(zzijpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdsz zzb() {
        return new zzdsz(((zzdoe) this.zza).zza());
    }
}
