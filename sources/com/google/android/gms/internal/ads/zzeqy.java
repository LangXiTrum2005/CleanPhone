package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class zzeqy implements zzijg {
    private final zzijp zza;
    private final zzijp zzb;
    private final zzijp zzc;
    private final zzijp zzd;
    private final zzijp zze;
    private final zzijp zzf;
    private final zzijp zzg;
    private final zzijp zzh;
    private final zzijp zzi;

    private zzeqy(zzijp zzijpVar, zzijp zzijpVar2, zzijp zzijpVar3, zzijp zzijpVar4, zzijp zzijpVar5, zzijp zzijpVar6, zzijp zzijpVar7, zzijp zzijpVar8, zzijp zzijpVar9) {
        this.zza = zzijpVar;
        this.zzb = zzijpVar2;
        this.zzc = zzijpVar3;
        this.zzd = zzijpVar4;
        this.zze = zzijpVar5;
        this.zzf = zzijpVar6;
        this.zzg = zzijpVar7;
        this.zzh = zzijpVar8;
        this.zzi = zzijpVar9;
    }

    public static zzeqy zza(zzijp zzijpVar, zzijp zzijpVar2, zzijp zzijpVar3, zzijp zzijpVar4, zzijp zzijpVar5, zzijp zzijpVar6, zzijp zzijpVar7, zzijp zzijpVar8, zzijp zzijpVar9) {
        return new zzeqy(zzijpVar, zzijpVar2, zzijpVar3, zzijpVar4, zzijpVar5, zzijpVar6, zzijpVar7, zzijpVar8, zzijpVar9);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzeqx((Context) this.zza.zzb(), (com.google.android.gms.ads.internal.client.zzr) this.zzb.zzb(), (String) this.zzc.zzb(), (zzffv) this.zzd.zzb(), (zzeqp) this.zze.zzb(), (zzfgv) this.zzf.zzb(), ((zzcmg) this.zzg).zza(), (zzayq) this.zzh.zzb(), (zzdxe) this.zzi.zzb());
    }
}
