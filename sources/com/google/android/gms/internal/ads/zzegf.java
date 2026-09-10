package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzegf implements zzijg {
    private final zzijp zza;

    private zzegf(zzijp zzijpVar) {
        this.zza = zzijpVar;
    }

    public static zzegf zzc(zzijp zzijpVar) {
        return new zzegf(zzijpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzege zzb() {
        return new zzege(((zzcmo) this.zza).zzb());
    }
}
