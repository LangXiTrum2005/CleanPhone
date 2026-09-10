package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeky {
    private final zzeld zza;
    private final String zzb;

    @Nullable
    private com.google.android.gms.ads.internal.client.zzdy zzc;

    public zzeky(zzeld zzeldVar, String str) {
        this.zza = zzeldVar;
        this.zzb = str;
    }

    @Nullable
    public final synchronized String zza() {
        com.google.android.gms.ads.internal.client.zzdy zzdyVar;
        try {
            zzdyVar = this.zzc;
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
            return null;
        }
        return zzdyVar != null ? zzdyVar.zzg() : null;
    }

    @Nullable
    public final synchronized String zzb() {
        com.google.android.gms.ads.internal.client.zzdy zzdyVar;
        try {
            zzdyVar = this.zzc;
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
            return null;
        }
        return zzdyVar != null ? zzdyVar.zzg() : null;
    }

    public final synchronized void zzd(com.google.android.gms.ads.internal.client.zzm zzmVar, int i) throws RemoteException {
        this.zzc = null;
        zzele zzeleVar = new zzele(i);
        zzekx zzekxVar = new zzekx(this);
        this.zza.zzb(zzmVar, this.zzb, zzeleVar, zzekxVar);
    }

    public final synchronized boolean zze() throws RemoteException {
        return this.zza.zza();
    }
}
