package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcsx extends zzbec {
    private final zzcsw zza;
    private final com.google.android.gms.ads.internal.client.zzbx zzb;
    private final zzfdr zzc;
    private boolean zzd = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzbl)).booleanValue();
    private final zzdxe zze;

    public zzcsx(zzcsw zzcswVar, com.google.android.gms.ads.internal.client.zzbx zzbxVar, zzfdr zzfdrVar, zzdxe zzdxeVar) {
        this.zza = zzcswVar;
        this.zzb = zzbxVar;
        this.zzc = zzfdrVar;
        this.zze = zzdxeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbed
    public final com.google.android.gms.ads.internal.client.zzbx zze() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbed
    public final void zzf(IObjectWrapper iObjectWrapper, zzbek zzbekVar) {
        try {
            this.zzc.zzp(zzbekVar);
            this.zza.zzb((Activity) ObjectWrapper.unwrap(iObjectWrapper), zzbekVar, this.zzd);
        } catch (RemoteException e2) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbed
    public final com.google.android.gms.ads.internal.client.zzea zzg() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzhB)).booleanValue()) {
            return this.zza.zzn();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbed
    public final void zzh(boolean z2) {
        this.zzd = z2;
    }

    @Override // com.google.android.gms.internal.ads.zzbed
    public final void zzi(com.google.android.gms.ads.internal.client.zzdt zzdtVar) {
        Preconditions.checkMainThread("setOnPaidEventListener must be called on the main UI thread.");
        if (this.zzc != null) {
            try {
                if (!zzdtVar.zzf()) {
                    this.zze.zzb();
                }
            } catch (RemoteException e2) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zze("Error in making CSI ping for reporting paid event callback", e2);
            }
            this.zzc.zzr(zzdtVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbed
    public final String zzj() {
        try {
            return this.zzb.zzu();
        } catch (RemoteException e2) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e2);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbed
    public final long zzk() {
        zzcsw zzcswVar = this.zza;
        if (zzcswVar == null || zzcswVar.zzo() == null) {
            return 0L;
        }
        return zzcswVar.zzo().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbed
    public final void zzl(long j) {
        zzcsw zzcswVar = this.zza;
        if (zzcswVar == null || zzcswVar.zzo() == null) {
            return;
        }
        zzcswVar.zzo().zzb(j);
    }
}
