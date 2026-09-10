package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfan implements zzijg {
    private final zzijp zza;

    private zzfan(zzijp zzijpVar, zzijp zzijpVar2) {
        this.zza = zzijpVar2;
    }

    public static zzfan zzc(zzijp zzijpVar, zzijp zzijpVar2) {
        return new zzfan(zzijpVar, zzijpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzfam zzb() {
        return new zzfam(zzflk.zzc(), ((zzclp) this.zza).zza());
    }
}
