package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.ph;
import com.google.android.gms.internal.ads.qt;
import com.google.android.gms.internal.ads.rh;
import com.google.android.gms.internal.ads.st;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zzct extends ph implements zzcv {
    @Override // com.google.android.gms.ads.internal.client.zzcv
    public final st getAdapterCreator() throws RemoteException {
        Parcel parcelR = r(q(), 2);
        st stVarX1 = qt.x1(parcelR.readStrongBinder());
        parcelR.recycle();
        return stVarX1;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcv
    public final zzez getLiteSdkVersion() throws RemoteException {
        Parcel parcelR = r(q(), 1);
        zzez zzezVar = (zzez) rh.b(parcelR, zzez.CREATOR);
        parcelR.recycle();
        return zzezVar;
    }
}
