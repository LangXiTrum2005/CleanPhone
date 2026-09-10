package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzbpd extends zzbcc implements zzbpe {
    public zzbpd() {
        super("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbcc
    public final boolean zzdd(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 != 1) {
            return false;
        }
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) zzbcd.zzb(parcel, ParcelFileDescriptor.CREATOR);
        zzbcd.zzh(parcel);
        zzb(parcelFileDescriptor);
        return true;
    }
}
