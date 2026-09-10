package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzddp implements zzijg {
    private final zzijp zza;

    private zzddp(zzijp zzijpVar) {
        this.zza = zzijpVar;
    }

    public static zzddp zzc(zzijp zzijpVar) {
        return new zzddp(zzijpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzddo zzb() {
        return new zzddo(((zzijs) this.zza).zzb());
    }
}
