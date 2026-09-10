package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzctk implements zzijg {
    private final zzctj zza;
    private final zzijp zzb;

    private zzctk(zzctj zzctjVar, zzijp zzijpVar) {
        this.zza = zzctjVar;
        this.zzb = zzijpVar;
    }

    public static zzctk zza(zzctj zzctjVar, zzijp zzijpVar) {
        return new zzctk(zzctjVar, zzijpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* synthetic */ Object zzb() {
        return this.zza.zze(((zzijs) this.zzb).zzb());
    }
}
