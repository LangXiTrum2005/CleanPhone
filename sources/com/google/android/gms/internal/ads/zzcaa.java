package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcaa extends zzbcb implements zzcac {
    public zzcaa(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
    }

    @Override // com.google.android.gms.internal.ads.zzcac
    public final String zze() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(1, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzcac
    public final int zzf() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(2, zza());
        int i2 = parcelZzcZ.readInt();
        parcelZzcZ.recycle();
        return i2;
    }
}
