package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbee extends zzbcb implements zzbeg {
    public zzbee(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbeg
    public final void zzb(zzbed zzbedVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbcd.zze(parcelZza, zzbedVar);
        zzda(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbeg
    public final void zzc(int i2) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i2);
        zzda(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbeg
    public final void zzd(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbcd.zzc(parcelZza, zzeVar);
        zzda(3, parcelZza);
    }
}
