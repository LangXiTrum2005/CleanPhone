package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzbyq extends zzbcc implements zzbyr {
    public zzbyq() {
        super("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbcc
    public final boolean zzdd(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 == 1) {
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) zzbcd.zzb(parcel, ParcelFileDescriptor.CREATOR);
            zzbcd.zzh(parcel);
            zze(parcelFileDescriptor);
        } else if (i2 == 2) {
            com.google.android.gms.ads.internal.util.zzba zzbaVar = (com.google.android.gms.ads.internal.util.zzba) zzbcd.zzb(parcel, com.google.android.gms.ads.internal.util.zzba.CREATOR);
            zzbcd.zzh(parcel);
            zzf(zzbaVar);
        } else {
            if (i2 != 3) {
                return false;
            }
            ParcelFileDescriptor parcelFileDescriptor2 = (ParcelFileDescriptor) zzbcd.zzb(parcel, ParcelFileDescriptor.CREATOR);
            zzbza zzbzaVar = (zzbza) zzbcd.zzb(parcel, zzbza.CREATOR);
            zzbcd.zzh(parcel);
            zzg(parcelFileDescriptor2, zzbzaVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
