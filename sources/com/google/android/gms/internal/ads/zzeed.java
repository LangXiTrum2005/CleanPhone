package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzeed implements zzijg {
    private final zzijp zza;
    private final zzijp zzb;

    private zzeed(zzijp zzijpVar, zzijp zzijpVar2, zzijp zzijpVar3) {
        this.zza = zzijpVar;
        this.zzb = zzijpVar3;
    }

    public static zzeed zzc(zzijp zzijpVar, zzijp zzijpVar2, zzijp zzijpVar3) {
        return new zzeed(zzijpVar, zzijpVar2, zzijpVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzeec zzb() {
        return new zzeec(((zzijn) this.zza).zzd(), zzflk.zzc(), ((zzddp) this.zzb).zzb());
    }
}
