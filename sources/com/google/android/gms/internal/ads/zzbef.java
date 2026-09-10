package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzbef extends zzbcc implements zzbeg {
    public zzbef() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    public static zzbeg zze(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
        return iInterfaceQueryLocalInterface instanceof zzbeg ? (zzbeg) iInterfaceQueryLocalInterface : new zzbee(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbcc
    public final boolean zzdd(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        zzbed zzbebVar;
        if (i2 == 1) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                zzbebVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
                zzbebVar = iInterfaceQueryLocalInterface instanceof zzbed ? (zzbed) iInterfaceQueryLocalInterface : new zzbeb(strongBinder);
            }
            zzbcd.zzh(parcel);
            zzb(zzbebVar);
        } else if (i2 == 2) {
            parcel.readInt();
            zzbcd.zzh(parcel);
        } else {
            if (i2 != 3) {
                return false;
            }
            com.google.android.gms.ads.internal.client.zze zzeVar = (com.google.android.gms.ads.internal.client.zze) zzbcd.zzb(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR);
            zzbcd.zzh(parcel);
            zzd(zzeVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
