package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes4.dex */
public final class zzezf implements zzijg {
    private final zzijp zza;
    private final zzijp zzb;
    private final zzijp zzc;
    private final zzijp zzd;
    private final zzijp zze;
    private final zzijp zzf;
    private final zzijp zzg;
    private final zzijp zzh;
    private final zzijp zzi;

    private zzezf(zzijp zzijpVar, zzijp zzijpVar2, zzijp zzijpVar3, zzijp zzijpVar4, zzijp zzijpVar5, zzijp zzijpVar6, zzijp zzijpVar7, zzijp zzijpVar8, zzijp zzijpVar9, zzijp zzijpVar10) {
        this.zza = zzijpVar2;
        this.zzb = zzijpVar3;
        this.zzc = zzijpVar4;
        this.zzd = zzijpVar5;
        this.zze = zzijpVar6;
        this.zzf = zzijpVar7;
        this.zzg = zzijpVar8;
        this.zzh = zzijpVar9;
        this.zzi = zzijpVar10;
    }

    public static zzezf zza(zzijp zzijpVar, zzijp zzijpVar2, zzijp zzijpVar3, zzijp zzijpVar4, zzijp zzijpVar5, zzijp zzijpVar6, zzijp zzijpVar7, zzijp zzijpVar8, zzijp zzijpVar9, zzijp zzijpVar10) {
        return new zzezf(zzijpVar, zzijpVar2, zzijpVar3, zzijpVar4, zzijpVar5, zzijpVar6, zzijpVar7, zzijpVar8, zzijpVar9, zzijpVar10);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzezd(zzflk.zzc(), (ScheduledExecutorService) this.zza.zzb(), (String) this.zzb.zzb(), (zzepk) this.zzc.zzb(), (Context) this.zzd.zzb(), ((zzdab) this.zze).zza(), (zzepf) this.zzf.zzb(), (zzduu) this.zzg.zzb(), (zzdzr) this.zzh.zzb(), ((Integer) this.zzi.zzb()).intValue());
    }
}
