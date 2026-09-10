package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.ph;
import com.google.android.gms.internal.ads.rh;
import com.google.android.gms.internal.ads.st;
import s9.a;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbv extends ph implements IInterface {
    public zzbv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManagerCreator");
    }

    public final IBinder zze(a aVar, zzr zzrVar, String str, st stVar, int i10, int i11) throws RemoteException {
        Parcel parcelQ = q();
        rh.e(parcelQ, aVar);
        rh.c(parcelQ, zzrVar);
        parcelQ.writeString(str);
        rh.e(parcelQ, stVar);
        parcelQ.writeInt(261710000);
        parcelQ.writeInt(i11);
        Parcel parcelR = r(parcelQ, 2);
        IBinder strongBinder = parcelR.readStrongBinder();
        parcelR.recycle();
        return strongBinder;
    }
}
