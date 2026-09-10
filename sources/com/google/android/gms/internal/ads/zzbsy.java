package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzbsy extends zzbcc implements zzbsz {
    public zzbsy() {
        super("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    public static zzbsz zzf(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
        return iInterfaceQueryLocalInterface instanceof zzbsz ? (zzbsz) iInterfaceQueryLocalInterface : new zzbsx(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbcc
    public final boolean zzdd(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 == 1) {
            String string = parcel.readString();
            zzbcd.zzh(parcel);
            zzbtc zzbtcVarZzb = zzb(string);
            parcel2.writeNoException();
            zzbcd.zze(parcel2, zzbtcVarZzb);
        } else if (i2 == 2) {
            String string2 = parcel.readString();
            zzbcd.zzh(parcel);
            boolean zZzc = zzc(string2);
            parcel2.writeNoException();
            parcel2.writeInt(zZzc ? 1 : 0);
        } else if (i2 == 3) {
            String string3 = parcel.readString();
            zzbcd.zzh(parcel);
            zzbuy zzbuyVarZze = zze(string3);
            parcel2.writeNoException();
            zzbcd.zze(parcel2, zzbuyVarZze);
        } else {
            if (i2 != 4) {
                return false;
            }
            String string4 = parcel.readString();
            zzbcd.zzh(parcel);
            boolean zZzd = zzd(string4);
            parcel2.writeNoException();
            parcel2.writeInt(zZzd ? 1 : 0);
        }
        return true;
    }
}
