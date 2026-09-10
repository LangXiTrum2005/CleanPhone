package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.ph;
import com.google.android.gms.internal.ads.rh;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zzcq extends ph implements zzcs {
    @Override // com.google.android.gms.ads.internal.client.zzcs
    public final void zzb(zze zzeVar) throws RemoteException {
        Parcel parcelQ = q();
        rh.c(parcelQ, zzeVar);
        m0(parcelQ, 1);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcs
    public final void zzc() throws RemoteException {
        m0(q(), 2);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcs
    public final void zzd() throws RemoteException {
        m0(q(), 3);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcs
    public final void zze() throws RemoteException {
        m0(q(), 4);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcs
    public final void zzf() throws RemoteException {
        m0(q(), 5);
    }
}
