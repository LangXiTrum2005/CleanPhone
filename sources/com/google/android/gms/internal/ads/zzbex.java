package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbex extends zzbcb implements IInterface {
    public zzbex(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.cache.ICacheService");
    }

    public final zzbes zze(zzbev zzbevVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbcd.zzc(parcelZza, zzbevVar);
        Parcel parcelZzcZ = zzcZ(1, parcelZza);
        zzbes zzbesVar = (zzbes) zzbcd.zzb(parcelZzcZ, zzbes.CREATOR);
        parcelZzcZ.recycle();
        return zzbesVar;
    }

    public final zzbes zzf(zzbev zzbevVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbcd.zzc(parcelZza, zzbevVar);
        Parcel parcelZzcZ = zzcZ(2, parcelZza);
        zzbes zzbesVar = (zzbes) zzbcd.zzb(parcelZzcZ, zzbes.CREATOR);
        parcelZzcZ.recycle();
        return zzbesVar;
    }

    public final long zzg(zzbev zzbevVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbcd.zzc(parcelZza, zzbevVar);
        Parcel parcelZzcZ = zzcZ(3, parcelZza);
        long j = parcelZzcZ.readLong();
        parcelZzcZ.recycle();
        return j;
    }
}
