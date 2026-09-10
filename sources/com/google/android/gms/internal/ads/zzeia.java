package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeia implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;
    private final zzhfj zzc;

    public zzeia(zzhfj zzhfjVar, zzhfj zzhfjVar2, zzhfj zzhfjVar3) {
        this.zza = zzhfjVar;
        this.zzb = zzhfjVar2;
        this.zzc = zzhfjVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzehz((Context) this.zza.zzb(), (Executor) this.zzb.zzb(), (zzdof) this.zzc.zzb());
    }
}
