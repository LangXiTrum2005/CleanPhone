package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.ph;
import com.google.android.gms.internal.ads.rh;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zzeb extends ph implements zzed {
    public zzeb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final void zze() throws RemoteException {
        m0(q(), 1);
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final void zzf() throws RemoteException {
        m0(q(), 2);
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final void zzg() throws RemoteException {
        m0(q(), 3);
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final void zzh() throws RemoteException {
        m0(q(), 4);
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final void zzi(boolean z10) throws RemoteException {
        Parcel parcelQ = q();
        ClassLoader classLoader = rh.f19590a;
        parcelQ.writeInt(z10 ? 1 : 0);
        m0(parcelQ, 5);
    }
}
