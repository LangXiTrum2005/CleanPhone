package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcag extends zzbcb implements zzcai {
    public zzcag(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzcai
    public final void zze() throws RemoteException {
        zzda(1, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzcai
    public final void zzf() throws RemoteException {
        zzda(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzcai
    public final void zzg(zzcac zzcacVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbcd.zze(parcelZza, zzcacVar);
        zzda(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcai
    public final void zzh(int i2) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i2);
        zzda(4, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcai
    public final void zzi(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbcd.zzc(parcelZza, zzeVar);
        zzda(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcai
    public final void zzj() throws RemoteException {
        zzda(6, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzcai
    public final void zzk() throws RemoteException {
        zzda(7, zza());
    }
}
