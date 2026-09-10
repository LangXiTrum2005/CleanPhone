package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdxm implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;
    private final zzhfj zzc;
    private final zzhfj zzd;
    private final zzhfj zze;
    private final zzhfj zzf;
    private final zzhfj zzg;
    private final zzhfj zzh;

    public zzdxm(zzhfj zzhfjVar, zzhfj zzhfjVar2, zzhfj zzhfjVar3, zzhfj zzhfjVar4, zzhfj zzhfjVar5, zzhfj zzhfjVar6, zzhfj zzhfjVar7, zzhfj zzhfjVar8, zzhfj zzhfjVar9, zzhfj zzhfjVar10, zzhfj zzhfjVar11) {
        this.zza = zzhfjVar;
        this.zzb = zzhfjVar2;
        this.zzc = zzhfjVar3;
        this.zzd = zzhfjVar4;
        this.zze = zzhfjVar6;
        this.zzf = zzhfjVar7;
        this.zzg = zzhfjVar8;
        this.zzh = zzhfjVar11;
    }

    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdxl zzb() {
        return new zzdxl((zzcgx) this.zza.zzb(), ((zzche) this.zzb).zza(), ((zzchs) this.zzc).zza(), ((zzcvk) this.zzd).zza(), zzffh.zzc(), (String) this.zze.zzb(), (zzfhh) this.zzf.zzb(), (zzdrq) this.zzg.zzb(), zzcic.zza(), zzchz.zza(), (ScheduledExecutorService) this.zzh.zzb());
    }
}
