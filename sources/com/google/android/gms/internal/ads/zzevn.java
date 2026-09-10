package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes4.dex */
public final class zzevn implements zzijg {
    private final zzijp zza;
    private final zzijp zzb;

    private zzevn(zzijp zzijpVar, zzijp zzijpVar2) {
        this.zza = zzijpVar;
        this.zzb = zzijpVar2;
    }

    public static zzevn zza(zzijp zzijpVar, zzijp zzijpVar2) {
        return new zzevn(zzijpVar, zzijpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzeyj(((zzesk) this.zza).zzb(), ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zznK)).intValue(), (ScheduledExecutorService) this.zzb.zzb());
    }
}
