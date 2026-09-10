package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfaf implements zzijg {
    private final zzijp zza;

    private zzfaf(zzijp zzijpVar, zzijp zzijpVar2) {
        this.zza = zzijpVar;
    }

    public static zzfaf zzc(zzijp zzijpVar, zzijp zzijpVar2) {
        return new zzfaf(zzijpVar, zzijpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzfad zzb() {
        return new zzfad(((zzclp) this.zza).zza(), zzflk.zzc());
    }
}
