package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzblo extends zzbcc implements zzblp {
    public zzblo() {
        super("com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbcc
    public final boolean zzdd(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 == 1) {
            String string = parcel.readString();
            zzbcd.zzh(parcel);
            zze(string);
        } else {
            if (i2 != 2) {
                return false;
            }
            zzf();
        }
        parcel2.writeNoException();
        return true;
    }
}
