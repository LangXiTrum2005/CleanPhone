package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzccf extends zzbcc implements zzccg {
    public zzccf() {
        super("com.google.android.gms.ads.internal.signals.ISignalCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbcc
    public final boolean zzdd(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 == 1) {
            parcel.readString();
            parcel.readString();
            zzbcd.zzh(parcel);
        } else if (i2 == 2) {
            String string = parcel.readString();
            zzbcd.zzh(parcel);
            zzb(string);
        } else {
            if (i2 != 3) {
                return false;
            }
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            Bundle bundle = (Bundle) zzbcd.zzb(parcel, Bundle.CREATOR);
            zzbcd.zzh(parcel);
            zzc(string2, string3, bundle);
        }
        parcel2.writeNoException();
        return true;
    }
}
