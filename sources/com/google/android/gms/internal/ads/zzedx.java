package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzedx implements zzijg {
    private final zzijp zza;

    private zzedx(zzijp zzijpVar) {
        this.zza = zzijpVar;
    }

    public static zzedx zzc(zzijp zzijpVar) {
        return new zzedx(zzijpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzedw zzb() {
        return new zzedw(((zzclp) this.zza).zza());
    }
}
