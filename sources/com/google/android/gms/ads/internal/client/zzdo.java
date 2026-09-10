package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.ph;
import com.google.android.gms.internal.ads.rh;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdo extends ph implements zzdq {
    public zzdo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final void zze(zzt zztVar) throws RemoteException {
        Parcel parcelQ = q();
        rh.c(parcelQ, zztVar);
        m0(parcelQ, 1);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final boolean zzf() throws RemoteException {
        Parcel parcelR = r(q(), 2);
        ClassLoader classLoader = rh.f19590a;
        boolean z10 = parcelR.readInt() != 0;
        parcelR.recycle();
        return z10;
    }
}
