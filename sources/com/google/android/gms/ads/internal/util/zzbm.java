package com.google.android.gms.ads.internal.util;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.ph;
import com.google.android.gms.internal.ads.rh;
import s9.a;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbm extends ph implements zzbo {
    @Override // com.google.android.gms.ads.internal.util.zzbo
    public final boolean zze(a aVar, String str, String str2) throws RemoteException {
        Parcel parcelQ = q();
        rh.e(parcelQ, aVar);
        parcelQ.writeString(str);
        parcelQ.writeString(str2);
        Parcel parcelR = r(parcelQ, 1);
        boolean z10 = parcelR.readInt() != 0;
        parcelR.recycle();
        return z10;
    }

    @Override // com.google.android.gms.ads.internal.util.zzbo
    public final void zzf(a aVar) throws RemoteException {
        Parcel parcelQ = q();
        rh.e(parcelQ, aVar);
        m0(parcelQ, 2);
    }

    @Override // com.google.android.gms.ads.internal.util.zzbo
    public final boolean zzg(a aVar, com.google.android.gms.ads.internal.offline.buffering.zza zzaVar) throws RemoteException {
        Parcel parcelQ = q();
        rh.e(parcelQ, aVar);
        rh.c(parcelQ, zzaVar);
        Parcel parcelR = r(parcelQ, 3);
        boolean z10 = parcelR.readInt() != 0;
        parcelR.recycle();
        return z10;
    }
}
