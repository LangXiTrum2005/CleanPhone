package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzera {
    private final zzerf zza;
    private final String zzb;
    private com.google.android.gms.ads.internal.client.zzea zzc;

    public zzera(zzerf zzerfVar, String str) {
        this.zza = zzerfVar;
        this.zzb = str;
    }

    public final synchronized boolean zza() throws RemoteException {
        return this.zza.zzb();
    }

    public final synchronized void zzb(com.google.android.gms.ads.internal.client.zzm zzmVar, int i2) throws RemoteException {
        this.zzc = null;
        zzerg zzergVar = new zzerg(i2);
        zzeqz zzeqzVar = new zzeqz(this);
        this.zza.zza(zzmVar, this.zzb, zzergVar, zzeqzVar);
    }

    public final synchronized String zzc() {
        com.google.android.gms.ads.internal.client.zzea zzeaVar;
        try {
            zzeaVar = this.zzc;
        } catch (RemoteException e2) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e2);
            return null;
        }
        return zzeaVar != null ? zzeaVar.zze() : null;
    }

    public final synchronized String zzd() {
        com.google.android.gms.ads.internal.client.zzea zzeaVar;
        try {
            zzeaVar = this.zzc;
        } catch (RemoteException e2) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e2);
            return null;
        }
        return zzeaVar != null ? zzeaVar.zze() : null;
    }

    public final /* synthetic */ void zze(com.google.android.gms.ads.internal.client.zzea zzeaVar) {
        this.zzc = zzeaVar;
    }
}
