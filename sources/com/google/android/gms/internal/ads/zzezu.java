package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzezu implements zzijg {
    private final zzijp zza;

    private zzezu(zzijp zzijpVar, zzijp zzijpVar2) {
        this.zza = zzijpVar2;
    }

    public static zzezu zzc(zzijp zzijpVar, zzijp zzijpVar2) {
        return new zzezu(zzijpVar, zzijpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzezt zzb() {
        return new zzezt(zzflk.zzc(), ((zzclp) this.zza).zza());
    }
}
