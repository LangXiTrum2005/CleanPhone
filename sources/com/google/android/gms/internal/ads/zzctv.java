package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzctv implements zzijg {
    private final zzctj zza;
    private final zzijp zzb;

    private zzctv(zzctj zzctjVar, zzijp zzijpVar) {
        this.zza = zzctjVar;
        this.zzb = zzijpVar;
    }

    public static zzctv zza(zzctj zzctjVar, zzijp zzijpVar) {
        return new zzctv(zzctjVar, zzijpVar);
    }

    public static zzdij zzc(zzctj zzctjVar, zzcux zzcuxVar) {
        return new zzdij(zzcuxVar, zzcdo.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        return zzc(this.zza, (zzcux) this.zzb.zzb());
    }
}
