package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfvm extends zzbcb implements IInterface {
    public zzfvm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.IGassService");
    }

    public final zzfvk zze(zzfvi zzfviVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbcd.zzc(parcelZza, zzfviVar);
        Parcel parcelZzcZ = zzcZ(1, parcelZza);
        zzfvk zzfvkVar = (zzfvk) zzbcd.zzb(parcelZzcZ, zzfvk.CREATOR);
        parcelZzcZ.recycle();
        return zzfvkVar;
    }

    public final void zzf(zzfvf zzfvfVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbcd.zzc(parcelZza, zzfvfVar);
        zzda(2, parcelZza);
    }

    public final zzfvt zzg(zzfvr zzfvrVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbcd.zzc(parcelZza, zzfvrVar);
        Parcel parcelZzcZ = zzcZ(3, parcelZza);
        zzfvt zzfvtVar = (zzfvt) zzbcd.zzb(parcelZzcZ, zzfvt.CREATOR);
        parcelZzcZ.recycle();
        return zzfvtVar;
    }
}
