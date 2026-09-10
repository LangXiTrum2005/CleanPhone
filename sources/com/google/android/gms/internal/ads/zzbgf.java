package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzbgf extends zzayb implements zzbgg {
    public zzbgf() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
    }

    public static zzbgg zze(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
        return iInterfaceQueryLocalInterface instanceof zzbgg ? (zzbgg) iInterfaceQueryLocalInterface : new zzbge(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzayb
    public final boolean zzdD(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            zzayc.zzc(parcel);
            zzc(iObjectWrapperAsInterface);
        } else if (i == 2) {
            zzd();
        } else {
            if (i != 3) {
                return false;
            }
            IObjectWrapper iObjectWrapperAsInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            zzayc.zzc(parcel);
            zzb(iObjectWrapperAsInterface2);
        }
        parcel2.writeNoException();
        return true;
    }
}
