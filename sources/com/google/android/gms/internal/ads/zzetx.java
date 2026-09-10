package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzetx implements zzijg {
    private final zzijp zza;

    private zzetx(zzijp zzijpVar, zzijp zzijpVar2) {
        this.zza = zzijpVar2;
    }

    public static zzetx zzc(zzijp zzijpVar, zzijp zzijpVar2) {
        return new zzetx(zzijpVar, zzijpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzetv zzb() {
        return new zzetv(zzflk.zzc(), ((zzclp) this.zza).zza());
    }
}
