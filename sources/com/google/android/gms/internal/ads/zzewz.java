package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzewz implements zzijg {
    private final zzijp zza;

    private zzewz(zzijp zzijpVar, zzijp zzijpVar2) {
        this.zza = zzijpVar2;
    }

    public static zzewz zzc(zzijp zzijpVar, zzijp zzijpVar2) {
        return new zzewz(zzijpVar, zzijpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzewx zzb() {
        return new zzewx(zzflk.zzc(), ((zzclp) this.zza).zza());
    }
}
