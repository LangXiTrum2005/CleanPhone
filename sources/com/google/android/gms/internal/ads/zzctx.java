package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzctx implements zzijg {
    private final zzijp zza;
    private final zzijp zzb;

    private zzctx(zzctj zzctjVar, zzijp zzijpVar, zzijp zzijpVar2) {
        this.zza = zzijpVar;
        this.zzb = zzijpVar2;
    }

    public static zzctx zzc(zzctj zzctjVar, zzijp zzijpVar, zzijp zzijpVar2) {
        return new zzctx(zzctjVar, zzijpVar, zzijpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzcbt zzb() {
        return new zzcbt(((zzclp) this.zza).zza(), ((zzdab) this.zzb).zza().zzg);
    }
}
