package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public final class zzesz implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;
    private final zzhfj zzc;
    private final zzhfj zzd;
    private final zzhfj zze;
    private final zzhfj zzf;
    private final zzhfj zzg;
    private final zzhfj zzh;
    private final zzhfj zzi;

    public zzesz(zzhfj zzhfjVar, zzhfj zzhfjVar2, zzhfj zzhfjVar3, zzhfj zzhfjVar4, zzhfj zzhfjVar5, zzhfj zzhfjVar6, zzhfj zzhfjVar7, zzhfj zzhfjVar8, zzhfj zzhfjVar9, zzhfj zzhfjVar10) {
        this.zza = zzhfjVar2;
        this.zzb = zzhfjVar3;
        this.zzc = zzhfjVar4;
        this.zzd = zzhfjVar5;
        this.zze = zzhfjVar6;
        this.zzf = zzhfjVar7;
        this.zzg = zzhfjVar8;
        this.zzh = zzhfjVar9;
        this.zzi = zzhfjVar10;
    }

    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzesx(zzffh.zzc(), (ScheduledExecutorService) this.zza.zzb(), (String) this.zzb.zzb(), (zzejj) this.zzc.zzb(), (Context) this.zzd.zzb(), ((zzcvk) this.zze).zza(), (zzejf) this.zzf.zzb(), (zzdpm) this.zzg.zzb(), (zzduc) this.zzh.zzb(), ((Integer) this.zzi.zzb()).intValue());
    }
}
