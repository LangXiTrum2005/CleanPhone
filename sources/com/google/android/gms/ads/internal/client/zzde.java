package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.ph;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zzde extends ph implements zzdg {
    @Override // com.google.android.gms.ads.internal.client.zzdg
    public final String zze() throws RemoteException {
        Parcel parcelR = r(q(), 1);
        String string = parcelR.readString();
        parcelR.recycle();
        return string;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdg
    public final String zzf() throws RemoteException {
        Parcel parcelR = r(q(), 2);
        String string = parcelR.readString();
        parcelR.recycle();
        return string;
    }
}
