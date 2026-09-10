package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzedz implements zzijg {
    private final zzijp zza;
    private final zzijp zzb;

    private zzedz(zzijp zzijpVar, zzijp zzijpVar2) {
        this.zza = zzijpVar;
        this.zzb = zzijpVar2;
    }

    public static zzedz zzc(zzijp zzijpVar, zzijp zzijpVar2) {
        return new zzedz(zzijpVar, zzijpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzedy zzb() {
        return new zzedy(((zzclp) this.zza).zza(), (zzcbw) this.zzb.zzb());
    }
}
