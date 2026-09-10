package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzbpp extends zzbcc implements zzbpq {
    public zzbpp() {
        super("com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
    }

    public static zzbpq zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
        return iInterfaceQueryLocalInterface instanceof zzbpq ? (zzbpq) iInterfaceQueryLocalInterface : new zzbpo(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbcc
    public final boolean zzdd(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 == 2) {
            zze();
        } else {
            if (i2 != 3) {
                return false;
            }
            String string = parcel.readString();
            zzbcd.zzh(parcel);
            zzf(string);
        }
        parcel2.writeNoException();
        return true;
    }
}
