package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
final class zzehf extends zzbqz {
    private final zzecz zza;

    @Override // com.google.android.gms.internal.ads.zzbra
    public final void zze(String str) throws RemoteException {
        ((zzees) this.zza.zzc).zzi(0, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbra
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        ((zzees) this.zza.zzc).zzh(zzeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbra
    public final void zzg() throws RemoteException {
        ((zzees) this.zza.zzc).zzo();
    }
}
