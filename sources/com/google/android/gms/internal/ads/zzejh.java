package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes4.dex */
public final class zzejh implements zzejg {
    public final zzejg zza;
    private final zzgpr zzb;

    public zzejh(zzejg zzejgVar, zzgpr zzgprVar) {
        this.zza = zzejgVar;
        this.zzb = zzgprVar;
    }

    @Override // com.google.android.gms.internal.ads.zzejg
    public final boolean zza(zzfic zzficVar, zzfhr zzfhrVar) {
        return this.zza.zza(zzficVar, zzfhrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzejg
    public final ListenableFuture zzb(zzfic zzficVar, zzfhr zzfhrVar) {
        return zzgym.zzk(this.zza.zzb(zzficVar, zzfhrVar), this.zzb, zzcdo.zza);
    }
}
