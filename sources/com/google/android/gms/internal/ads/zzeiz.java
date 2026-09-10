package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class zzeiz {
    private final Context zza;
    private final VersionInfoParcel zzb;
    private final zzfhr zzc;
    private final zzcir zzd;
    private final zzdxe zze;
    private zzfrt zzf;

    public zzeiz(Context context, VersionInfoParcel versionInfoParcel, zzfhr zzfhrVar, zzcir zzcirVar, zzdxe zzdxeVar) {
        this.zza = context;
        this.zzb = versionInfoParcel;
        this.zzc = zzfhrVar;
        this.zzd = zzcirVar;
        this.zze = zzdxeVar;
    }

    public final synchronized boolean zza(boolean z2) {
        zzcir zzcirVar;
        zzfhr zzfhrVar = this.zzc;
        if (zzfhrVar.zzT) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzge)).booleanValue()) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzgh)).booleanValue() && (zzcirVar = this.zzd) != null) {
                    if (this.zzf != null) {
                        int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzi("Omid javascript session service already started for ad.");
                        return false;
                    }
                    if (!com.google.android.gms.ads.internal.zzt.zzu().zza(this.zza)) {
                        int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzi("Unable to initialize omid.");
                        return false;
                    }
                    if (zzfhrVar.zzV.zzb()) {
                        zzfrt zzfrtVarZzi = com.google.android.gms.ads.internal.zzt.zzu().zzi(this.zzb, zzcirVar.zzD(), true);
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzgi)).booleanValue()) {
                            zzdxe zzdxeVar = this.zze;
                            String str = zzfrtVarZzi != null ? "1" : "0";
                            zzdxd zzdxdVarZza = zzdxeVar.zza();
                            zzdxdVarZza.zzc("omid_js_session_success", str);
                            zzdxdVarZza.zzd();
                        }
                        if (zzfrtVarZzi == null) {
                            int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzi("Unable to create javascript session service.");
                            return false;
                        }
                        int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzh("Created omid javascript session service.");
                        this.zzf = zzfrtVarZzi;
                        zzcirVar.zzal(this);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final synchronized boolean zzb() {
        return this.zzf != null;
    }

    public final synchronized void zzc() {
        zzcir zzcirVar;
        try {
            zzfrt zzfrtVar = this.zzf;
            if (zzfrtVar == null || (zzcirVar = this.zzd) == null) {
                return;
            }
            Iterator it = zzcirVar.zzF().iterator();
            while (it.hasNext()) {
                com.google.android.gms.ads.internal.zzt.zzu().zzk(zzfrtVar, (View) it.next());
            }
            zzcirVar.zze("onSdkLoaded", zzgtg.zza());
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzd() {
        zzcir zzcirVar;
        if (this.zzf == null || (zzcirVar = this.zzd) == null) {
            return;
        }
        zzcirVar.zze("onSdkImpression", zzgtg.zza());
    }

    public final synchronized void zze(zzfrs zzfrsVar) {
        zzcir zzcirVar;
        zzfrt zzfrtVar = this.zzf;
        if (zzfrtVar == null || (zzcirVar = this.zzd) == null) {
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzu().zzj(zzfrtVar, zzfrsVar);
        this.zzf = null;
        zzcirVar.zzal(null);
    }

    public final synchronized void zzf(View view) {
        zzfrt zzfrtVar = this.zzf;
        if (zzfrtVar != null) {
            com.google.android.gms.ads.internal.zzt.zzu().zzk(zzfrtVar, view);
        }
    }
}
