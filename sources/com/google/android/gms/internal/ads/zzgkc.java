package com.google.android.gms.internal.ads;

import java.io.File;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgkc implements zzijg {
    private final zzijp zza;
    private final zzijp zzb;
    private final zzijp zzc;
    private final zzijp zzd;
    private final zzijp zze;
    private final zzijp zzf;
    private final zzijp zzg;
    private final zzijp zzh;
    private final zzijp zzi;

    private zzgkc(zzijp zzijpVar, zzijp zzijpVar2, zzijp zzijpVar3, zzijp zzijpVar4, zzijp zzijpVar5, zzijp zzijpVar6, zzijp zzijpVar7, zzijp zzijpVar8, zzijp zzijpVar9) {
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

    public static zzgkc zza(zzijp zzijpVar, zzijp zzijpVar2, zzijp zzijpVar3, zzijp zzijpVar4, zzijp zzijpVar5, zzijp zzijpVar6, zzijp zzijpVar7, zzijp zzijpVar8, zzijp zzijpVar9) {
        return new zzgkc(zzijpVar, zzijpVar2, zzijpVar3, zzijpVar4, zzijpVar5, zzijpVar6, zzijpVar7, zzijpVar8, zzijpVar9);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzgkb((zzgbr) this.zza.zzb(), (zzgbr) this.zzb.zzb(), zzijf.zzc(this.zzc), (zzgbr) this.zzd.zzb(), (zzgbr) this.zze.zzb(), zzijf.zzc(this.zzf), (File) this.zzg.zzb(), (ExecutorService) this.zzh.zzb(), (zzgnc) this.zzi.zzb());
    }
}
