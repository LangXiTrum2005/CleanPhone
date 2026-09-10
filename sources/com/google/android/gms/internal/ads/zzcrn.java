package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcrn implements zzijg {
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
    private final zzijp zzm;
    private final zzijp zzn;
    private final zzijp zzo;
    private final zzijp zzp;

    private zzcrn(zzijp zzijpVar, zzijp zzijpVar2, zzijp zzijpVar3, zzijp zzijpVar4, zzijp zzijpVar5, zzijp zzijpVar6, zzijp zzijpVar7, zzijp zzijpVar8, zzijp zzijpVar9, zzijp zzijpVar10, zzijp zzijpVar11, zzijp zzijpVar12, zzijp zzijpVar13, zzijp zzijpVar14, zzijp zzijpVar15, zzijp zzijpVar16, zzijp zzijpVar17, zzijp zzijpVar18) {
        this.zza = zzijpVar;
        this.zzb = zzijpVar3;
        this.zzc = zzijpVar4;
        this.zzd = zzijpVar5;
        this.zze = zzijpVar6;
        this.zzf = zzijpVar7;
        this.zzg = zzijpVar8;
        this.zzh = zzijpVar9;
        this.zzi = zzijpVar10;
        this.zzj = zzijpVar11;
        this.zzk = zzijpVar12;
        this.zzl = zzijpVar14;
        this.zzm = zzijpVar15;
        this.zzn = zzijpVar16;
        this.zzo = zzijpVar17;
        this.zzp = zzijpVar18;
    }

    public static zzcrn zza(zzijp zzijpVar, zzijp zzijpVar2, zzijp zzijpVar3, zzijp zzijpVar4, zzijp zzijpVar5, zzijp zzijpVar6, zzijp zzijpVar7, zzijp zzijpVar8, zzijp zzijpVar9, zzijp zzijpVar10, zzijp zzijpVar11, zzijp zzijpVar12, zzijp zzijpVar13, zzijp zzijpVar14, zzijp zzijpVar15, zzijp zzijpVar16, zzijp zzijpVar17, zzijp zzijpVar18) {
        return new zzcrn(zzijpVar, zzijpVar2, zzijpVar3, zzijpVar4, zzijpVar5, zzijpVar6, zzijpVar7, zzijpVar8, zzijpVar9, zzijpVar10, zzijpVar11, zzijpVar12, zzijpVar13, zzijpVar14, zzijpVar15, zzijpVar16, zzijpVar17, zzijpVar18);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzcrm(((zzclp) this.zza).zza(), zzflk.zzc(), (Executor) this.zzb.zzb(), (ScheduledExecutorService) this.zzc.zzb(), ((zzcwe) this.zzd).zza(), ((zzcwb) this.zze).zza(), (zzfpe) this.zzf.zzb(), (zzfix) this.zzg.zzb(), (View) this.zzh.zzb(), (zzcir) this.zzi.zzb(), (zzayq) this.zzj.zzb(), (zzbhr) this.zzk.zzb(), zzcof.zzc(), (zzfno) this.zzl.zzb(), ((zzczx) this.zzm).zza(), (zzdcz) this.zzn.zzb(), (zzcze) this.zzo.zzb(), ((zzijs) this.zzp).zzb());
    }
}
