package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.ph;
import com.google.android.gms.internal.ads.rh;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zzcc extends ph implements zzce {
    @Override // com.google.android.gms.ads.internal.client.zzce
    public final void zze(String str, zzdx zzdxVar) throws RemoteException {
        Parcel parcelQ = q();
        parcelQ.writeString(str);
        rh.e(parcelQ, zzdxVar);
        m0(parcelQ, 1);
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final void zzf(String str) throws RemoteException {
        Parcel parcelQ = q();
        parcelQ.writeString(str);
        m0(parcelQ, 2);
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final void zzg(String str, zze zzeVar) throws RemoteException {
        Parcel parcelQ = q();
        parcelQ.writeString(str);
        rh.c(parcelQ, zzeVar);
        m0(parcelQ, 3);
    }
}
