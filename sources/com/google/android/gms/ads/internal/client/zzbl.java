package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.ph;
import com.google.android.gms.internal.ads.rh;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbl extends ph implements zzbn {
    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final void zze(zzm zzmVar) throws RemoteException {
        Parcel parcelQ = q();
        rh.c(parcelQ, zzmVar);
        m0(parcelQ, 1);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final String zzf() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final boolean zzg() throws RemoteException {
        Parcel parcelR = r(q(), 3);
        ClassLoader classLoader = rh.f19590a;
        boolean z10 = parcelR.readInt() != 0;
        parcelR.recycle();
        return z10;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final String zzh() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final void zzi(zzm zzmVar, int i10) throws RemoteException {
        Parcel parcelQ = q();
        rh.c(parcelQ, zzmVar);
        parcelQ.writeInt(i10);
        m0(parcelQ, 5);
    }
}
