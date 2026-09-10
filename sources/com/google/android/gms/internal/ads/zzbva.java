package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzbva extends zzbcc implements zzbvb {
    public zzbva() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbcc
    public final boolean zzdd(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 == 1) {
            String string = parcel.readString();
            zzbcd.zzh(parcel);
            zze(string);
        } else if (i2 == 2) {
            String string2 = parcel.readString();
            zzbcd.zzh(parcel);
            zzf(string2);
        } else {
            if (i2 != 3) {
                return false;
            }
            com.google.android.gms.ads.internal.client.zze zzeVar = (com.google.android.gms.ads.internal.client.zze) zzbcd.zzb(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR);
            zzbcd.zzh(parcel);
            zzg(zzeVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
