package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzclv implements zzijg {
    private final zzijp zza;

    private zzclv(zzcli zzcliVar, zzijp zzijpVar) {
        this.zza = zzijpVar;
    }

    public static zzclv zzc(zzcli zzcliVar, zzijp zzijpVar) {
        return new zzclv(zzcliVar, zzijpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final String zzb() {
        return zzfjg.zza(((zzclp) this.zza).zza()).zze();
    }
}
