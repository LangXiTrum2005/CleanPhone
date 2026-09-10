package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdxe {
    private final zzdxj zza;
    private final Executor zzb;
    private final Map zzc;

    public zzdxe(zzdxj zzdxjVar, Executor executor) {
        this.zza = zzdxjVar;
        this.zzc = zzdxjVar.zza();
        this.zzb = executor;
    }

    public final zzdxd zza() {
        zzdxd zzdxdVar = new zzdxd(this);
        zzdxdVar.zzl();
        return zzdxdVar;
    }

    public final void zzb() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzmW)).booleanValue()) {
            zzdxd zzdxdVarZza = zza();
            zzdxdVarZza.zzc("action", "pecr");
            zzdxdVarZza.zzd();
        }
    }

    public final /* synthetic */ zzdxj zzc() {
        return this.zza;
    }

    public final /* synthetic */ Executor zzd() {
        return this.zzb;
    }

    public final /* synthetic */ Map zze() {
        return this.zzc;
    }
}
