package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcak extends zzbcb implements zzcam {
    public zzcak(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzcam
    public final void zze() throws RemoteException {
        zzda(1, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzcam
    public final void zzf(int i2) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i2);
        zzda(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcam
    public final void zzg(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbcd.zzc(parcelZza, zzeVar);
        zzda(3, parcelZza);
    }
}
