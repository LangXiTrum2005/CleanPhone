package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.ph;
import com.google.android.gms.internal.ads.rh;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdv extends ph implements zzdx {
    public zzdv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IResponseInfo");
    }

    @Override // com.google.android.gms.ads.internal.client.zzdx
    public final String zze() throws RemoteException {
        Parcel parcelR = r(q(), 1);
        String string = parcelR.readString();
        parcelR.recycle();
        return string;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdx
    public final String zzf() throws RemoteException {
        Parcel parcelR = r(q(), 2);
        String string = parcelR.readString();
        parcelR.recycle();
        return string;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdx
    public final List zzg() throws RemoteException {
        Parcel parcelR = r(q(), 3);
        ArrayList arrayListCreateTypedArrayList = parcelR.createTypedArrayList(zzv.CREATOR);
        parcelR.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdx
    public final zzv zzh() throws RemoteException {
        Parcel parcelR = r(q(), 4);
        zzv zzvVar = (zzv) rh.b(parcelR, zzv.CREATOR);
        parcelR.recycle();
        return zzvVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdx
    public final Bundle zzi() throws RemoteException {
        Parcel parcelR = r(q(), 5);
        Bundle bundle = (Bundle) rh.b(parcelR, Bundle.CREATOR);
        parcelR.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdx
    public final String zzj() throws RemoteException {
        Parcel parcelR = r(q(), 6);
        String string = parcelR.readString();
        parcelR.recycle();
        return string;
    }
}
