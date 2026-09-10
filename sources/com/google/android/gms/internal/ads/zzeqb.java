package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeqb implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;
    private final zzhfj zzc;

    public zzeqb(zzhfj zzhfjVar, zzhfj zzhfjVar2, zzhfj zzhfjVar3, zzhfj zzhfjVar4) {
        this.zza = zzhfjVar2;
        this.zzb = zzhfjVar3;
        this.zzc = zzhfjVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzero zzeroVarZza = zzerq.zza();
        zzeoj zzeojVar = (zzeoj) this.zza.zzb();
        List list = (List) this.zzb.zzb();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.zzc.zzb();
        if (list.contains("24")) {
            return new zzesd(zzeojVar, ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzmb)).intValue(), scheduledExecutorService);
        }
        return new zzesd(zzeroVarZza, ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzmb)).intValue(), scheduledExecutorService);
    }
}
