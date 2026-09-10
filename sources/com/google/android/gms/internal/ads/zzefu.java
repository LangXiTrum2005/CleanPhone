package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
final class zzefu extends zzbqw {
    final /* synthetic */ zzefw zza;
    private final zzecz zzb;

    public /* synthetic */ zzefu(zzefw zzefwVar, zzecz zzeczVar, zzefv zzefvVar) {
        this.zza = zzefwVar;
        this.zzb = zzeczVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbqx
    public final void zze(String str) throws RemoteException {
        ((zzees) this.zzb.zzc).zzi(0, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbqx
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        ((zzees) this.zzb.zzc).zzh(zzeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbqx
    public final void zzg(zzbpt zzbptVar) throws RemoteException {
        this.zza.zzc = zzbptVar;
        ((zzees) this.zzb.zzc).zzo();
    }
}
