package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzexo implements zzijg {
    private final zzijp zza;

    private zzexo(zzijp zzijpVar, zzijp zzijpVar2) {
        this.zza = zzijpVar2;
    }

    public static zzexo zzc(zzijp zzijpVar, zzijp zzijpVar2) {
        return new zzexo(zzijpVar, zzijpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzexm zzb() {
        return new zzexm(zzflk.zzc(), (zzeak) this.zza.zzb());
    }
}
