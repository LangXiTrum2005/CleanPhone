package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes4.dex */
public final class zzemz implements zzijg {
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
    private final zzijp zzk;
    private final zzijp zzl;

    private zzemz(zzijp zzijpVar, zzijp zzijpVar2, zzijp zzijpVar3, zzijp zzijpVar4, zzijp zzijpVar5, zzijp zzijpVar6, zzijp zzijpVar7, zzijp zzijpVar8, zzijp zzijpVar9, zzijp zzijpVar10, zzijp zzijpVar11, zzijp zzijpVar12, zzijp zzijpVar13) {
        this.zza = zzijpVar;
        this.zzb = zzijpVar2;
        this.zzc = zzijpVar3;
        this.zzd = zzijpVar4;
        this.zze = zzijpVar5;
        this.zzf = zzijpVar6;
        this.zzg = zzijpVar7;
        this.zzh = zzijpVar9;
        this.zzi = zzijpVar10;
        this.zzj = zzijpVar11;
        this.zzk = zzijpVar12;
        this.zzl = zzijpVar13;
    }

    public static zzemz zzc(zzijp zzijpVar, zzijp zzijpVar2, zzijp zzijpVar3, zzijp zzijpVar4, zzijp zzijpVar5, zzijp zzijpVar6, zzijp zzijpVar7, zzijp zzijpVar8, zzijp zzijpVar9, zzijp zzijpVar10, zzijp zzijpVar11, zzijp zzijpVar12, zzijp zzijpVar13) {
        return new zzemz(zzijpVar, zzijpVar2, zzijpVar3, zzijpVar4, zzijpVar5, zzijpVar6, zzijpVar7, zzijpVar8, zzijpVar9, zzijpVar10, zzijpVar11, zzijpVar12, zzijpVar13);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzemy zzb() {
        return new zzemy(((zzclp) this.zza).zza(), (zzfmu) this.zzb.zzb(), (zzemr) this.zzc.zzb(), (zzdam) this.zzd.zzb(), (zzfpe) this.zze.zzb(), (zzfpi) this.zzf.zzb(), (zzcvn) this.zzg.zzb(), zzflk.zzc(), (ScheduledExecutorService) this.zzh.zzb(), (zzejl) this.zzi.zzb(), (zzfno) this.zzj.zzb(), ((zzemd) this.zzk).zzb(), (zzdwy) this.zzl.zzb());
    }
}
