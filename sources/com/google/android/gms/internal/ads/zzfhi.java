package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfhi extends zzcae {
    private final zzfhe zza;
    private final zzfgv zzb;
    private final String zzc;
    private final zzfid zzd;
    private final Context zze;
    private final VersionInfoParcel zzf;
    private final zzayq zzg;
    private final zzdxe zzh;
    private zzdte zzi;
    private boolean zzj = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzbi)).booleanValue();

    public zzfhi(String str, zzfhe zzfheVar, Context context, zzfgv zzfgvVar, zzfid zzfidVar, VersionInfoParcel versionInfoParcel, zzayq zzayqVar, zzdxe zzdxeVar) {
        this.zzc = str;
        this.zza = zzfheVar;
        this.zzb = zzfgvVar;
        this.zzd = zzfidVar;
        this.zze = context;
        this.zzf = versionInfoParcel;
        this.zzg = zzayqVar;
        this.zzh = zzdxeVar;
    }

    private final synchronized void zzx(com.google.android.gms.ads.internal.client.zzm zzmVar, zzcam zzcamVar, int i2) throws RemoteException {
        try {
            if (!zzmVar.zzb()) {
                boolean z2 = false;
                if (((Boolean) zzbii.zzk.zze()).booleanValue()) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzmA)).booleanValue()) {
                        z2 = true;
                    }
                }
                if (this.zzf.clientJarVersion < ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzmB)).intValue() || !z2) {
                    Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
                }
            }
            zzfgv zzfgvVar = this.zzb;
            zzfgvVar.zzh(zzcamVar);
            com.google.android.gms.ads.internal.zzt.zzc();
            if (com.google.android.gms.ads.internal.util.zzs.zzM(this.zze) && zzmVar.zzs == null) {
                int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzf("Failed to load the ad because app ID is missing.");
                zzfgvVar.zzdI(zzfjm.zzd(4, null, null));
                return;
            }
            if (this.zzi != null) {
                return;
            }
            zzfgx zzfgxVar = new zzfgx(null);
            zzfhe zzfheVar = this.zza;
            zzfheVar.zzj(i2);
            zzfheVar.zza(zzmVar, this.zzc, zzfgxVar, new zzfhh(this));
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcaf
    public final synchronized void zzb(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzk(iObjectWrapper, this.zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzcaf
    public final synchronized void zzc(com.google.android.gms.ads.internal.client.zzm zzmVar, zzcam zzcamVar) throws RemoteException {
        zzx(zzmVar, zzcamVar, 2);
    }

    @Override // com.google.android.gms.internal.ads.zzcaf
    public final synchronized void zzd(com.google.android.gms.ads.internal.client.zzm zzmVar, zzcam zzcamVar) throws RemoteException {
        zzx(zzmVar, zzcamVar, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzcaf
    public final void zze(zzcai zzcaiVar) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        this.zzb.zzi(zzcaiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcaf
    public final void zzf(com.google.android.gms.ads.internal.client.zzdq zzdqVar) {
        if (zzdqVar == null) {
            this.zzb.zzk(null);
        } else {
            this.zzb.zzk(new zzfhg(this, zzdqVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcaf
    public final Bundle zzg() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzdte zzdteVar = this.zzi;
        return zzdteVar != null ? zzdteVar.zzg() : new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzcaf
    public final synchronized void zzh(zzcat zzcatVar) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzfid zzfidVar = this.zzd;
        zzfidVar.zza = zzcatVar.zza;
        zzfidVar.zzb = zzcatVar.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzcaf
    public final boolean zzi() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzdte zzdteVar = this.zzi;
        return (zzdteVar == null || zzdteVar.zzb()) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzcaf
    public final synchronized String zzj() throws RemoteException {
        zzdte zzdteVar = this.zzi;
        if (zzdteVar == null || zzdteVar.zzn() == null) {
            return null;
        }
        return zzdteVar.zzn().zze();
    }

    @Override // com.google.android.gms.internal.ads.zzcaf
    public final synchronized void zzk(IObjectWrapper iObjectWrapper, boolean z2) throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (this.zzi == null) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Rewarded can not be shown before loaded");
            this.zzb.zzj(zzfjm.zzd(9, null, null));
        } else {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzdz)).booleanValue()) {
                this.zzg.zzb().zzi(new Throwable().getStackTrace());
            }
            this.zzi.zza(z2, (Activity) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcaf
    public final zzcac zzl() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzdte zzdteVar = this.zzi;
        if (zzdteVar != null) {
            return zzdteVar.zzc();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcaf
    public final com.google.android.gms.ads.internal.client.zzea zzm() {
        zzdte zzdteVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzhB)).booleanValue() && (zzdteVar = this.zzi) != null) {
            return zzdteVar.zzn();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcaf
    public final String zzn() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzcaf
    public final void zzo(com.google.android.gms.ads.internal.client.zzdt zzdtVar) {
        Preconditions.checkMainThread("setOnPaidEventListener must be called on the main UI thread.");
        try {
            if (!zzdtVar.zzf()) {
                this.zzh.zzb();
            }
        } catch (RemoteException e2) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zze("Error in making CSI ping for reporting paid event callback", e2);
        }
        this.zzb.zzl(zzdtVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcaf
    public final synchronized void zzp(boolean z2) {
        Preconditions.checkMainThread("setImmersiveMode must be called on the main UI thread.");
        this.zzj = z2;
    }

    @Override // com.google.android.gms.internal.ads.zzcaf
    public final synchronized long zzq() {
        zzdte zzdteVar = this.zzi;
        if (zzdteVar == null || zzdteVar.zzo() == null) {
            return 0L;
        }
        return zzdteVar.zzo().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzcaf
    public final synchronized void zzr(long j) {
        zzdte zzdteVar = this.zzi;
        if (zzdteVar == null || zzdteVar.zzo() == null) {
            return;
        }
        zzdteVar.zzo().zzb(j);
    }

    @Override // com.google.android.gms.internal.ads.zzcaf
    public final void zzs(zzcan zzcanVar) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        this.zzb.zzo(zzcanVar);
    }

    public final /* synthetic */ zzfid zzu() {
        return this.zzd;
    }

    public final /* synthetic */ zzdte zzv() {
        return this.zzi;
    }

    public final /* synthetic */ void zzw(zzdte zzdteVar) {
        this.zzi = zzdteVar;
    }
}
