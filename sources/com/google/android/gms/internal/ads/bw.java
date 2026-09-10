package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class bw extends ph implements dw {
    public final aw v1(s9.b bVar, st stVar) {
        aw yvVar;
        Parcel parcelQ = q();
        rh.e(parcelQ, bVar);
        rh.e(parcelQ, stVar);
        parcelQ.writeInt(261710000);
        Parcel parcelR = r(parcelQ, 1);
        IBinder strongBinder = parcelR.readStrongBinder();
        if (strongBinder == null) {
            yvVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
            yvVar = iInterfaceQueryLocalInterface instanceof aw ? (aw) iInterfaceQueryLocalInterface : new yv(strongBinder);
        }
        parcelR.recycle();
        return yvVar;
    }
}
