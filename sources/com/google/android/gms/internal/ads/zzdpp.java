package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdpp implements zzijg {
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

    private zzdpp(zzijp zzijpVar, zzijp zzijpVar2, zzijp zzijpVar3, zzijp zzijpVar4, zzijp zzijpVar5, zzijp zzijpVar6, zzijp zzijpVar7, zzijp zzijpVar8, zzijp zzijpVar9, zzijp zzijpVar10, zzijp zzijpVar11) {
        this.zza = zzijpVar;
        this.zzb = zzijpVar2;
        this.zzc = zzijpVar3;
        this.zzd = zzijpVar4;
        this.zze = zzijpVar5;
        this.zzf = zzijpVar6;
        this.zzg = zzijpVar7;
        this.zzh = zzijpVar8;
        this.zzi = zzijpVar9;
        this.zzj = zzijpVar10;
        this.zzk = zzijpVar11;
    }

    public static zzdpp zza(zzijp zzijpVar, zzijp zzijpVar2, zzijp zzijpVar3, zzijp zzijpVar4, zzijp zzijpVar5, zzijp zzijpVar6, zzijp zzijpVar7, zzijp zzijpVar8, zzijp zzijpVar9, zzijp zzijpVar10, zzijp zzijpVar11) {
        return new zzdpp(zzijpVar, zzijpVar2, zzijpVar3, zzijpVar4, zzijpVar5, zzijpVar6, zzijpVar7, zzijpVar8, zzijpVar9, zzijpVar10, zzijpVar11);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdpo(((zzdps) this.zza).zzc(), ((zzdpt) this.zzb).zzc(), ((zzdpx) this.zzc).zza(), (zzdbc) this.zzd.zzb(), (zzddd) this.zze.zzb(), (zzdai) this.zzf.zzb(), (zzdip) this.zzg.zzb(), (Context) this.zzh.zzb(), ((zzcwb) this.zzi).zza(), ((zzcmg) this.zzj).zza(), ((zzdab) this.zzk).zza());
    }
}
