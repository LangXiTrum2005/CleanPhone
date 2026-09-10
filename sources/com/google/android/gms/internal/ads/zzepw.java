package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public final class zzepw implements zzher {
    private final zzhfj zza;

    public zzepw(zzhfj zzhfjVar, zzhfj zzhfjVar2) {
        this.zza = zzhfjVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzesd(zzeqt.zza(), ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzmd)).intValue(), (ScheduledExecutorService) this.zza.zzb());
    }
}
