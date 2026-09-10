package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzeyd implements zzijg {
    private final zzijp zza;

    private zzeyd(zzijp zzijpVar, zzijp zzijpVar2) {
        this.zza = zzijpVar2;
    }

    public static zzeyd zzc(zzijp zzijpVar, zzijp zzijpVar2) {
        return new zzeyd(zzijpVar, zzijpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzeyb zzb() {
        return new zzeyb(zzflk.zzc(), ((zzclp) this.zza).zza());
    }
}
