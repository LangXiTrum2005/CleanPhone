package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzeua implements zzijg {
    private final zzijp zza;

    private zzeua(zzijp zzijpVar) {
        this.zza = zzijpVar;
    }

    public static zzeua zzc(zzijp zzijpVar) {
        return new zzeua(zzijpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzety zzb() {
        return new zzety(((zzdab) this.zza).zza());
    }
}
