package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzeyh implements zzijg {
    private final zzijp zza;

    private zzeyh(zzijp zzijpVar, zzijp zzijpVar2) {
        this.zza = zzijpVar2;
    }

    public static zzeyh zzc(zzijp zzijpVar, zzijp zzijpVar2) {
        return new zzeyh(zzijpVar, zzijpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzeyf zzb() {
        return new zzeyf(zzflk.zzc(), (zzdyh) this.zza.zzb());
    }
}
