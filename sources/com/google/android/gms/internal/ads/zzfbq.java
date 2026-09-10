package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfbq implements zzijg {
    private final zzijp zza;

    private zzfbq(zzijp zzijpVar) {
        this.zza = zzijpVar;
    }

    public static zzfbq zza(zzijp zzijpVar) {
        return new zzfbq(zzijpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzfbp(((zzclp) this.zza).zza());
    }
}
