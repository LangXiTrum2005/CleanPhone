package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdmv implements zzijg {
    private final zzijp zza;

    private zzdmv(zzijp zzijpVar) {
        this.zza = zzijpVar;
    }

    public static zzdmv zzc(zzijp zzijpVar) {
        return new zzdmv(zzijpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdmu zzb() {
        return new zzdmu(((zzdoe) this.zza).zza());
    }
}
