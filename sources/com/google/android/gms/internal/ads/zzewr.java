package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzewr implements zzijg {
    private final zzijp zza;

    private zzewr(zzijp zzijpVar, zzijp zzijpVar2) {
        this.zza = zzijpVar;
    }

    public static zzewr zzc(zzijp zzijpVar, zzijp zzijpVar2) {
        return new zzewr(zzijpVar, zzijpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzewq zzb() {
        return new zzewq(((zzclp) this.zza).zza(), zzflk.zzc());
    }
}
