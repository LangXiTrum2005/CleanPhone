package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzexd implements zzijg {
    private final zzijp zza;

    private zzexd(zzijp zzijpVar, zzijp zzijpVar2) {
        this.zza = zzijpVar2;
    }

    public static zzexd zzc(zzijp zzijpVar, zzijp zzijpVar2) {
        return new zzexd(zzijpVar, zzijpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzexb zzb() {
        return new zzexb(zzflk.zzc(), ((zzdab) this.zza).zza());
    }
}
