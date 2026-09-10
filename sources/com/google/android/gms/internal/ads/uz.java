package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class uz extends ph implements wz {
    public final tz v1(s9.b bVar, st stVar) {
        tz rzVar;
        Parcel parcelQ = q();
        rh.e(parcelQ, bVar);
        rh.e(parcelQ, stVar);
        parcelQ.writeInt(261710000);
        Parcel parcelR = r(parcelQ, 2);
        IBinder strongBinder = parcelR.readStrongBinder();
        if (strongBinder == null) {
            rzVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
            rzVar = iInterfaceQueryLocalInterface instanceof tz ? (tz) iInterfaceQueryLocalInterface : new rz(strongBinder);
        }
        parcelR.recycle();
        return rzVar;
    }
}
