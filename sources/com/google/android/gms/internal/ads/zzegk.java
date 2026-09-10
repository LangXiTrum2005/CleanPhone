package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzegk implements zzijg {
    private final zzijp zza;

    private zzegk(zzijp zzijpVar) {
        this.zza = zzijpVar;
    }

    public static zzegk zzc(zzijp zzijpVar) {
        return new zzegk(zzijpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzegj zzb() {
        return new zzegj(((zzclp) this.zza).zza());
    }
}
