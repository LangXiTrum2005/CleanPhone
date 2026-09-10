package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzctp implements zzijg {
    private final zzctj zza;
    private final zzijp zzb;

    private zzctp(zzctj zzctjVar, zzijp zzijpVar) {
        this.zza = zzctjVar;
        this.zzb = zzijpVar;
    }

    public static zzctp zzc(zzctj zzctjVar, zzijp zzijpVar) {
        return new zzctp(zzctjVar, zzijpVar);
    }

    public static zzctc zzd(zzctj zzctjVar, Object obj) {
        return (zzctf) obj;
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzctc zzb() {
        return ((zzctg) this.zzb).zzb();
    }
}
