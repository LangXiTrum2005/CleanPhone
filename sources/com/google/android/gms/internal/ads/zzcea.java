package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class zzcea {
    private final zzcdt zza;
    private final AtomicInteger zzb;

    public zzcea() {
        zzcdt zzcdtVar = new zzcdt();
        this.zza = zzcdtVar;
        this.zzb = new AtomicInteger(0);
        zzgym.zzr(zzcdtVar, new zzcdy(this), zzcdo.zzg);
    }

    @Deprecated
    public final void zze(zzcdx zzcdxVar, zzcdv zzcdvVar) {
        zzgym.zzr(this.zza, new zzcdz(this, zzcdxVar, zzcdvVar), zzcdo.zzg);
    }

    @Deprecated
    public final void zzf(Object obj) {
        this.zza.zzc(obj);
    }

    @Deprecated
    public final void zzg() {
        this.zza.zzd(new Exception());
    }

    @Deprecated
    public final void zzh(Throwable th, String str) {
        this.zza.zzd(th);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zziF)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzh().zzh(th, str);
        }
    }

    @Deprecated
    public final int zzi() {
        return this.zzb.get();
    }

    public final /* synthetic */ AtomicInteger zzj() {
        return this.zzb;
    }
}
