package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public final class zzepy implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;

    public zzepy(zzhfj zzhfjVar, zzhfj zzhfjVar2) {
        this.zza = zzhfjVar;
        this.zzb = zzhfjVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzesd(((zzerb) this.zza).zzb(), ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzmq)).intValue(), (ScheduledExecutorService) this.zzb.zzb());
    }
}
