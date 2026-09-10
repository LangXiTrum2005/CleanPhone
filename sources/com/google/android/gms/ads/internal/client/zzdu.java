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
public final class zzdu extends ph implements IInterface {
    public final zzdt zze(a aVar, st stVar, int i10) throws RemoteException {
        zzdt zzdrVar;
        Parcel parcelQ = q();
        rh.e(parcelQ, aVar);
        rh.e(parcelQ, stVar);
        parcelQ.writeInt(261710000);
        Parcel parcelR = r(parcelQ, 1);
        IBinder strongBinder = parcelR.readStrongBinder();
        if (strongBinder == null) {
            zzdrVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTester");
            zzdrVar = iInterfaceQueryLocalInterface instanceof zzdt ? (zzdt) iInterfaceQueryLocalInterface : new zzdr(strongBinder);
        }
        parcelR.recycle();
        return zzdrVar;
    }
}
