package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdfn implements zzher {
    private final zzdeu zza;
    private final zzhfj zzb;

    public zzdfn(zzdeu zzdeuVar, zzhfj zzhfjVar) {
        this.zza = zzdeuVar;
        this.zzb = zzhfjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final /* bridge */ /* synthetic */ Object zzb() {
        return this.zza.zzd((Executor) this.zzb.zzb());
    }
}
