package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdsn implements Callable {
    private final com.google.android.gms.ads.internal.zza zza;
    private final Context zzb;
    private final zzdxe zzc;
    private final zzehu zzd;
    private final Executor zze;
    private final zzayq zzf;
    private final VersionInfoParcel zzg;
    private final zzfpi zzh;
    private final zzeif zzi;
    private final zzfio zzj;

    public zzdsn(Context context, Executor executor, zzayq zzayqVar, VersionInfoParcel versionInfoParcel, com.google.android.gms.ads.internal.zza zzaVar, zzcjh zzcjhVar, zzehu zzehuVar, zzfpi zzfpiVar, zzdxe zzdxeVar, zzeif zzeifVar, zzfio zzfioVar) {
        this.zzb = context;
        this.zze = executor;
        this.zzf = zzayqVar;
        this.zzg = versionInfoParcel;
        this.zza = zzaVar;
        this.zzd = zzehuVar;
        this.zzh = zzfpiVar;
        this.zzc = zzdxeVar;
        this.zzi = zzeifVar;
        this.zzj = zzfioVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzdsp zzdspVar = new zzdsp(this);
        zzdspVar.zza();
        return zzdspVar;
    }

    public final /* synthetic */ com.google.android.gms.ads.internal.zza zza() {
        return this.zza;
    }

    public final /* synthetic */ Context zzb() {
        return this.zzb;
    }

    public final /* synthetic */ zzdxe zzc() {
        return this.zzc;
    }

    public final /* synthetic */ zzehu zzd() {
        return this.zzd;
    }

    public final /* synthetic */ Executor zze() {
        return this.zze;
    }

    public final /* synthetic */ zzayq zzf() {
        return this.zzf;
    }

    public final /* synthetic */ VersionInfoParcel zzg() {
        return this.zzg;
    }

    public final /* synthetic */ zzfpi zzh() {
        return this.zzh;
    }

    public final /* synthetic */ zzeif zzi() {
        return this.zzi;
    }

    public final /* synthetic */ zzfio zzj() {
        return this.zzj;
    }
}
