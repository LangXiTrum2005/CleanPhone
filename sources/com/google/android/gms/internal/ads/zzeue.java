package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzeue implements zzijg {
    private final zzijp zza;

    private zzeue(zzijp zzijpVar, zzijp zzijpVar2) {
        this.zza = zzijpVar2;
    }

    public static zzeue zzc(zzijp zzijpVar, zzijp zzijpVar2) {
        return new zzeue(zzijpVar, zzijpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzeuc zzb() {
        return new zzeuc(zzflk.zzc(), ((zzclp) this.zza).zza());
    }
}
