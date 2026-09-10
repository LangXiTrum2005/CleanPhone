package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes4.dex */
public final class zzevq implements zzijg {
    private final zzijp zza;
    private final zzijp zzb;
    private final zzijp zzc;
    private final zzijp zzd;

    private zzevq(zzijp zzijpVar, zzijp zzijpVar2, zzijp zzijpVar3, zzijp zzijpVar4) {
        this.zza = zzijpVar;
        this.zzb = zzijpVar2;
        this.zzc = zzijpVar3;
        this.zzd = zzijpVar4;
    }

    public static zzevq zza(zzijp zzijpVar, zzijp zzijpVar2, zzijp zzijpVar3, zzijp zzijpVar4) {
        return new zzevq(zzijpVar, zzijpVar2, zzijpVar3, zzijpVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzete zzeteVarZzb = ((zzetg) this.zza).zzb();
        zzeul zzeulVar = (zzeul) this.zzb.zzb();
        List list = (List) this.zzc.zzb();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.zzd.zzb();
        if (list.contains("10")) {
            return new zzeyj(zzeulVar, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzny)).intValue(), scheduledExecutorService);
        }
        return new zzeyj(zzeteVarZzb, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzny)).intValue(), scheduledExecutorService);
    }
}
