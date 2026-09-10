package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes4.dex */
public final class zzedh implements zzijg {
    private final zzijp zza;
    private final zzijp zzb;
    private final zzijp zzc;
    private final zzijp zzd;
    private final zzijp zze;
    private final zzijp zzf;
    private final zzijp zzg;
    private final zzijp zzh;
    private final zzijp zzi;
    private final zzijp zzj;

    private zzedh(zzijp zzijpVar, zzijp zzijpVar2, zzijp zzijpVar3, zzijp zzijpVar4, zzijp zzijpVar5, zzijp zzijpVar6, zzijp zzijpVar7, zzijp zzijpVar8, zzijp zzijpVar9, zzijp zzijpVar10, zzijp zzijpVar11, zzijp zzijpVar12, zzijp zzijpVar13) {
        this.zza = zzijpVar;
        this.zzb = zzijpVar2;
        this.zzc = zzijpVar3;
        this.zzd = zzijpVar4;
        this.zze = zzijpVar6;
        this.zzf = zzijpVar7;
        this.zzg = zzijpVar8;
        this.zzh = zzijpVar11;
        this.zzi = zzijpVar12;
        this.zzj = zzijpVar13;
    }

    public static zzedh zzc(zzijp zzijpVar, zzijp zzijpVar2, zzijp zzijpVar3, zzijp zzijpVar4, zzijp zzijpVar5, zzijp zzijpVar6, zzijp zzijpVar7, zzijp zzijpVar8, zzijp zzijpVar9, zzijp zzijpVar10, zzijp zzijpVar11, zzijp zzijpVar12, zzijp zzijpVar13) {
        return new zzedh(zzijpVar, zzijpVar2, zzijpVar3, zzijpVar4, zzijpVar5, zzijpVar6, zzijpVar7, zzijpVar8, zzijpVar9, zzijpVar10, zzijpVar11, zzijpVar12, zzijpVar13);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzedg zzb() {
        return new zzedg((zzclg) this.zza.zzb(), ((zzclp) this.zzb).zza(), ((zzcmg) this.zzc).zza(), ((zzdab) this.zzd).zza(), zzflk.zzc(), (String) this.zze.zzb(), (zzfno) this.zzf.zzb(), (zzdwy) this.zzg.zzb(), zzcmq.zza(), zzcmn.zza(), (ScheduledExecutorService) this.zzh.zzb(), (zzfpi) this.zzi.zzb(), ((zzddp) this.zzj).zzb());
    }
}
