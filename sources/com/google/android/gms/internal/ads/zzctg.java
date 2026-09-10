package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class zzctg implements zzijg {
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

    private zzctg(zzijp zzijpVar, zzijp zzijpVar2, zzijp zzijpVar3, zzijp zzijpVar4, zzijp zzijpVar5, zzijp zzijpVar6, zzijp zzijpVar7, zzijp zzijpVar8, zzijp zzijpVar9, zzijp zzijpVar10) {
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
    }

    public static zzctg zzc(zzijp zzijpVar, zzijp zzijpVar2, zzijp zzijpVar3, zzijp zzijpVar4, zzijp zzijpVar5, zzijp zzijpVar6, zzijp zzijpVar7, zzijp zzijpVar8, zzijp zzijpVar9, zzijp zzijpVar10) {
        return new zzctg(zzijpVar, zzijpVar2, zzijpVar3, zzijpVar4, zzijpVar5, zzijpVar6, zzijpVar7, zzijpVar8, zzijpVar9, zzijpVar10);
    }

    public static zzctf zzd(zzcvj zzcvjVar, Context context, zzfhs zzfhsVar, View view, zzcir zzcirVar, zzcvi zzcviVar, zzdnw zzdnwVar, zzdit zzditVar, zzija zzijaVar, Executor executor) {
        return new zzctf(zzcvjVar, context, zzfhsVar, view, zzcirVar, zzcviVar, zzdnwVar, zzditVar, zzijaVar, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzctf zzb() {
        return new zzctf(((zzcxr) this.zza).zzb(), (Context) this.zzb.zzb(), ((zzctm) this.zzc).zza(), ((zzctl) this.zzd).zza(), ((zzcua) this.zze).zza(), ((zzctn) this.zzf).zza(), ((zzdlt) this.zzg).zza(), (zzdit) this.zzh.zzb(), zzijf.zzc(this.zzi), (Executor) this.zzj.zzb());
    }
}
