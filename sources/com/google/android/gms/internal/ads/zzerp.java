package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzerp implements zzijg {
    private final zzijp zza;

    private zzerp(zzijp zzijpVar) {
        this.zza = zzijpVar;
    }

    public static zzerp zzc(zzijp zzijpVar) {
        return new zzerp(zzijpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzern zzb() {
        return new zzern(((zzclp) this.zza).zza());
    }
}
