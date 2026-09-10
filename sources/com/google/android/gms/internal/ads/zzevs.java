package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes4.dex */
public final class zzevs implements zzijg {
    private final zzijp zza;
    private final zzijp zzb;
    private final zzijp zzc;
    private final zzijp zzd;

    private zzevs(zzijp zzijpVar, zzijp zzijpVar2, zzijp zzijpVar3, zzijp zzijpVar4) {
        this.zza = zzijpVar;
        this.zzb = zzijpVar2;
        this.zzc = zzijpVar3;
        this.zzd = zzijpVar4;
    }

    public static zzevs zza(zzijp zzijpVar, zzijp zzijpVar2, zzijp zzijpVar3, zzijp zzijpVar4) {
        return new zzevs(zzijpVar, zzijpVar2, zzijpVar3, zzijpVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzetv zzetvVarZzb = ((zzetx) this.zza).zzb();
        zzeul zzeulVar = (zzeul) this.zzb.zzb();
        List list = (List) this.zzc.zzb();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.zzd.zzb();
        if (list.contains("13")) {
            return new zzeyj(zzeulVar, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zznH)).intValue(), scheduledExecutorService);
        }
        return new zzeyj(zzetvVarZzb, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zznH)).intValue(), scheduledExecutorService);
    }
}
