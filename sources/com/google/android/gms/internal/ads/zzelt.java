package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class zzelt implements zzijg {
    private final zzijp zza;
    private final zzijp zzb;
    private final zzijp zzc;
    private final zzijp zzd;
    private final zzijp zze;
    private final zzijp zzf;
    private final zzijp zzg;

    private zzelt(zzijp zzijpVar, zzijp zzijpVar2, zzijp zzijpVar3, zzijp zzijpVar4, zzijp zzijpVar5, zzijp zzijpVar6, zzijp zzijpVar7, zzijp zzijpVar8, zzijp zzijpVar9) {
        this.zza = zzijpVar;
        this.zzb = zzijpVar3;
        this.zzc = zzijpVar4;
        this.zzd = zzijpVar5;
        this.zze = zzijpVar6;
        this.zzf = zzijpVar7;
        this.zzg = zzijpVar8;
    }

    public static zzelt zza(zzijp zzijpVar, zzijp zzijpVar2, zzijp zzijpVar3, zzijp zzijpVar4, zzijp zzijpVar5, zzijp zzijpVar6, zzijp zzijpVar7, zzijp zzijpVar8, zzijp zzijpVar9) {
        return new zzelt(zzijpVar, zzijpVar2, zzijpVar3, zzijpVar4, zzijpVar5, zzijpVar6, zzijpVar7, zzijpVar8, zzijpVar9);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzels((zzdlv) this.zza.zzb(), zzflk.zzc(), ((zzdqg) this.zzb).zzb(), (zzfjj) this.zzc.zzb(), (zzdsv) this.zzd.zzb(), (zzdwy) this.zze.zzb(), ((zzcmg) this.zzf).zza(), (Context) this.zzg.zzb(), zzcoh.zzc());
    }
}
