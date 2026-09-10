package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ir extends ph implements kr {
    public final hr v1(s9.b bVar, st stVar, br brVar) {
        hr erVar;
        Parcel parcelQ = q();
        rh.e(parcelQ, bVar);
        rh.e(parcelQ, stVar);
        parcelQ.writeInt(261710000);
        rh.e(parcelQ, brVar);
        Parcel parcelR = r(parcelQ, 1);
        IBinder strongBinder = parcelR.readStrongBinder();
        if (strongBinder == null) {
            erVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
            erVar = iInterfaceQueryLocalInterface instanceof hr ? (hr) iInterfaceQueryLocalInterface : new er(strongBinder);
        }
        parcelR.recycle();
        return erVar;
    }
}
