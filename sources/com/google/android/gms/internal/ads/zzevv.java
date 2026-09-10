package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes4.dex */
public final class zzevv implements zzijg {
    private final zzijp zza;

    private zzevv(zzijp zzijpVar, zzijp zzijpVar2) {
        this.zza = zzijpVar2;
    }

    public static zzevv zza(zzijp zzijpVar, zzijp zzijpVar2) {
        return new zzevv(zzijpVar, zzijpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzgtn zzgtnVarZzh;
        zzeun zzeunVarZzc = zzeup.zzc();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.zza.zzb();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzeV)).booleanValue()) {
            zzgtnVarZzh = zzgtn.zzi(new zzeyj(zzeunVarZzc, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzeW)).intValue(), scheduledExecutorService));
        } else {
            zzgtnVarZzh = zzgtn.zzh();
        }
        zzijo.zzb(zzgtnVarZzh);
        return zzgtnVarZzh;
    }
}
