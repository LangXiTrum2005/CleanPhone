package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzbll extends zzbcc implements zzblm {
    public zzbll() {
        super("com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
    }

    public static zzblm zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
        return iInterfaceQueryLocalInterface instanceof zzblm ? (zzblm) iInterfaceQueryLocalInterface : new zzblk(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbcc
    public final boolean zzdd(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        zzbls zzblqVar;
        if (i2 != 1) {
            return false;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        if (strongBinder == null) {
            zzblqVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
            zzblqVar = iInterfaceQueryLocalInterface instanceof zzbls ? (zzbls) iInterfaceQueryLocalInterface : new zzblq(strongBinder);
        }
        zzbcd.zzh(parcel);
        zze(zzblqVar);
        parcel2.writeNoException();
        return true;
    }
}
