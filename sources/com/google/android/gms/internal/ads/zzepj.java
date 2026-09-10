package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzepj implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;
    private final zzhfj zzc;

    public zzepj(zzhfj zzhfjVar, zzhfj zzhfjVar2, zzhfj zzhfjVar3) {
        this.zza = zzhfjVar;
        this.zzb = zzhfjVar2;
        this.zzc = zzhfjVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final /* bridge */ /* synthetic */ Object zzb() {
        Object objZzb = ((zzeln) this.zza).zzb();
        zzeoj zzeojVar = (zzeoj) this.zzb.zzb();
        if (true == ((List) this.zzc.zzb()).contains("2")) {
            objZzb = zzeojVar;
        }
        zzhez.zzb(objZzb);
        return objZzb;
    }
}
