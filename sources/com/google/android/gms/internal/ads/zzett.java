package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzett implements zzijg {
    private final zzijp zza;

    private zzett(zzijp zzijpVar, zzijp zzijpVar2) {
        this.zza = zzijpVar;
    }

    public static zzett zzc(zzijp zzijpVar, zzijp zzijpVar2) {
        return new zzett(zzijpVar, zzijpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzetr zzb() {
        return new zzetr(((zzcmg) this.zza).zza(), zzflk.zzc());
    }
}
