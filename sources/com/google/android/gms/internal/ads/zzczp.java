package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;

/* JADX INFO: loaded from: classes4.dex */
public final class zzczp implements zzijg {
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

    private zzczp(zzijp zzijpVar, zzijp zzijpVar2, zzijp zzijpVar3, zzijp zzijpVar4, zzijp zzijpVar5, zzijp zzijpVar6, zzijp zzijpVar7, zzijp zzijpVar8, zzijp zzijpVar9, zzijp zzijpVar10, zzijp zzijpVar11, zzijp zzijpVar12, zzijp zzijpVar13) {
        this.zza = zzijpVar;
        this.zzb = zzijpVar2;
        this.zzc = zzijpVar3;
        this.zzd = zzijpVar4;
        this.zze = zzijpVar6;
        this.zzf = zzijpVar7;
        this.zzg = zzijpVar8;
        this.zzh = zzijpVar9;
        this.zzi = zzijpVar10;
        this.zzj = zzijpVar11;
        this.zzk = zzijpVar12;
        this.zzl = zzijpVar13;
    }

    public static zzczp zzc(zzijp zzijpVar, zzijp zzijpVar2, zzijp zzijpVar3, zzijp zzijpVar4, zzijp zzijpVar5, zzijp zzijpVar6, zzijp zzijpVar7, zzijp zzijpVar8, zzijp zzijpVar9, zzijp zzijpVar10, zzijp zzijpVar11, zzijp zzijpVar12, zzijp zzijpVar13) {
        return new zzczp(zzijpVar, zzijpVar2, zzijpVar3, zzijpVar4, zzijpVar5, zzijpVar6, zzijpVar7, zzijpVar8, zzijpVar9, zzijpVar10, zzijpVar11, zzijpVar12, zzijpVar13);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzczo zzb() {
        return new zzczo((zzfmu) this.zza.zzb(), ((zzcmg) this.zzb).zza(), (ApplicationInfo) this.zzc.zzb(), ((zzecm) this.zzd).zzb(), zzeve.zzc(), (PackageInfo) this.zze.zzb(), zzijf.zzc(this.zzf), ((zzclj) this.zzg).zzb(), (String) this.zzh.zzb(), ((zzfab) this.zzi).zzb(), ((zzdab) this.zzj).zza(), (zzdgd) this.zzk.zzb(), ((Integer) this.zzl.zzb()).intValue());
    }
}
