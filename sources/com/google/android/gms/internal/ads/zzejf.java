package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzejf implements zzijg {
    private final zzijp zza;

    private zzejf(zzijp zzijpVar) {
        this.zza = zzijpVar;
    }

    public static zzejf zzc(zzijp zzijpVar) {
        return new zzejf(zzijpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzeje zzb() {
        return new zzeje(((zzclp) this.zza).zza());
    }
}
