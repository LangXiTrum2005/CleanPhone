package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.ph;
import com.google.android.gms.internal.ads.rh;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdy extends ph implements zzea {
    public zzdy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoController");
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final void zze() throws RemoteException {
        m0(q(), 1);
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final void zzf() throws RemoteException {
        m0(q(), 2);
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final void zzg(boolean z10) throws RemoteException {
        Parcel parcelQ = q();
        ClassLoader classLoader = rh.f19590a;
        parcelQ.writeInt(z10 ? 1 : 0);
        m0(parcelQ, 3);
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final boolean zzh() throws RemoteException {
        Parcel parcelR = r(q(), 4);
        ClassLoader classLoader = rh.f19590a;
        boolean z10 = parcelR.readInt() != 0;
        parcelR.recycle();
        return z10;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final int zzi() throws RemoteException {
        Parcel parcelR = r(q(), 5);
        int i10 = parcelR.readInt();
        parcelR.recycle();
        return i10;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final float zzj() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final float zzk() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final void zzl(zzed zzedVar) throws RemoteException {
        Parcel parcelQ = q();
        rh.e(parcelQ, zzedVar);
        m0(parcelQ, 8);
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final float zzm() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final boolean zzn() throws RemoteException {
        Parcel parcelR = r(q(), 10);
        ClassLoader classLoader = rh.f19590a;
        boolean z10 = parcelR.readInt() != 0;
        parcelR.recycle();
        return z10;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final zzed zzo() throws RemoteException {
        zzed zzebVar;
        Parcel parcelR = r(q(), 11);
        IBinder strongBinder = parcelR.readStrongBinder();
        if (strongBinder == null) {
            zzebVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
            zzebVar = iInterfaceQueryLocalInterface instanceof zzed ? (zzed) iInterfaceQueryLocalInterface : new zzeb(strongBinder);
        }
        parcelR.recycle();
        return zzebVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final boolean zzp() throws RemoteException {
        Parcel parcelR = r(q(), 12);
        ClassLoader classLoader = rh.f19590a;
        boolean z10 = parcelR.readInt() != 0;
        parcelR.recycle();
        return z10;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final void zzq() throws RemoteException {
        m0(q(), 13);
    }
}
