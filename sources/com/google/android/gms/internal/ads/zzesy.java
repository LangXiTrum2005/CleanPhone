package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzesy implements zzijg {
    private final zzijp zza;

    private zzesy(zzijp zzijpVar, zzijp zzijpVar2) {
        this.zza = zzijpVar2;
    }

    public static zzesy zzc(zzijp zzijpVar, zzijp zzijpVar2) {
        return new zzesy(zzijpVar, zzijpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzesw zzb() {
        return new zzesw(zzflk.zzc(), ((zzclp) this.zza).zza());
    }
}
