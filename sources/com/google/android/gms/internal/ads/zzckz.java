package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class zzckz {
    private final zzckq zza;
    private final zzdxe zzb;

    public zzckz(zzckq zzckqVar, zzdxe zzdxeVar) {
        this.zza = zzckqVar;
        this.zzb = zzdxeVar;
    }

    public final void zza(final Context context, final VersionInfoParcel versionInfoParcel) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzpm)).booleanValue()) {
            Executor threadPoolExecutor = zzcdo.zza;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzpo)).booleanValue()) {
                zzcky zzckyVar = new zzcky(((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzpq)).intValue(), null);
                int iIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzpp)).intValue();
                threadPoolExecutor = new ThreadPoolExecutor(iIntValue, iIntValue, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), zzckyVar);
            }
            threadPoolExecutor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzckw
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzb(context, versionInfoParcel);
                }
            });
        }
    }

    public final /* synthetic */ void zzb(Context context, VersionInfoParcel versionInfoParcel) {
        long jElapsedRealtime = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
        com.google.android.gms.ads.internal.zzt.zzc().zze(context, versionInfoParcel.afmaVersion);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzpn)).booleanValue()) {
            long jElapsedRealtime2 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - jElapsedRealtime;
            zzdxd zzdxdVarZza = this.zzb.zza();
            zzdxdVarZza.zzc("action", "webview_startup_l");
            StringBuilder sb = new StringBuilder(String.valueOf(jElapsedRealtime2).length());
            sb.append(jElapsedRealtime2);
            zzdxdVarZza.zzc("webview_startup_l", sb.toString());
            zzdxdVarZza.zzd();
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzpt)).booleanValue()) {
            zzcdo.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzckv
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzc();
                }
            });
        }
    }

    public final /* synthetic */ void zzc() {
        this.zza.zzb(new zzcku(this, com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime()));
    }

    public final /* synthetic */ zzdxe zzd() {
        return this.zzb;
    }
}
