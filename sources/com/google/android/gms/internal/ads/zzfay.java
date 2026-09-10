package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfay implements zzijg {
    private final zzijp zza;
    private final zzijp zzb;
    private final zzijp zzc;
    private final zzijp zzd;
    private final zzijp zze;

    private zzfay(zzijp zzijpVar, zzijp zzijpVar2, zzijp zzijpVar3, zzijp zzijpVar4, zzijp zzijpVar5, zzijp zzijpVar6, zzijp zzijpVar7) {
        this.zza = zzijpVar2;
        this.zzb = zzijpVar3;
        this.zzc = zzijpVar5;
        this.zzd = zzijpVar6;
        this.zze = zzijpVar7;
    }

    public static zzfay zza(zzijp zzijpVar, zzijp zzijpVar2, zzijp zzijpVar3, zzijp zzijpVar4, zzijp zzijpVar5, zzijp zzijpVar6, zzijp zzijpVar7) {
        return new zzfay(zzijpVar, zzijpVar2, zzijpVar3, zzijpVar4, zzijpVar5, zzijpVar6, zzijpVar7);
    }

    public static zzfaw zzc(zzccs zzccsVar, Context context, ScheduledExecutorService scheduledExecutorService, Executor executor, int i2, boolean z2, boolean z3) {
        return new zzfaw(zzccsVar, context, scheduledExecutorService, executor, i2, z2, z3);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzfaw(zzcpj.zza(), ((zzclp) this.zza).zza(), (ScheduledExecutorService) this.zzb.zzb(), zzflk.zzc(), ((zzfce) this.zzc).zzb().intValue(), ((zzfcf) this.zzd).zzb().booleanValue(), ((zzfcg) this.zze).zzb().booleanValue());
    }
}
