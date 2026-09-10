package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes4.dex */
public final class zzewd implements zzijg {
    private final zzijp zza;
    private final zzijp zzb;
    private final zzijp zzc;

    private zzewd(zzijp zzijpVar, zzijp zzijpVar2, zzijp zzijpVar3, zzijp zzijpVar4) {
        this.zza = zzijpVar2;
        this.zzb = zzijpVar3;
        this.zzc = zzijpVar4;
    }

    public static zzewd zza(zzijp zzijpVar, zzijp zzijpVar2, zzijp zzijpVar3, zzijp zzijpVar4) {
        return new zzewd(zzijpVar, zzijpVar2, zzijpVar3, zzijpVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzexq zzexqVarZzc = zzexs.zzc();
        zzeul zzeulVar = (zzeul) this.zza.zzb();
        List list = (List) this.zzb.zzb();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.zzc.zzb();
        if (list.contains("24")) {
            return new zzeyj(zzeulVar, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zznA)).intValue(), scheduledExecutorService);
        }
        return new zzeyj(zzexqVarZzc, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zznA)).intValue(), scheduledExecutorService);
    }
}
