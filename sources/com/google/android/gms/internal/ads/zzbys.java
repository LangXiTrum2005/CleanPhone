package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbys extends zzbcb implements IInterface {
    public zzbys(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.ITrustlessTokenListener");
    }

    public final void zze(String str, zzbyj zzbyjVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzbcd.zzc(parcelZza, zzbyjVar);
        zzda(1, parcelZza);
    }

    public final void zzf(com.google.android.gms.ads.internal.util.zzba zzbaVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbcd.zzc(parcelZza, zzbaVar);
        zzda(2, parcelZza);
    }
}
