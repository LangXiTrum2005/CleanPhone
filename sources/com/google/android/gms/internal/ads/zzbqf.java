package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbqf extends zzbcb implements zzbqh {
    public zzbqf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbqh
    public final void zze(zzbqb zzbqbVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbcd.zze(parcelZza, zzbqbVar);
        zzda(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqh
    public final void zzf(int i2) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i2);
        zzda(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqh
    public final void zzg(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbcd.zzc(parcelZza, zzeVar);
        zzda(3, parcelZza);
    }
}
