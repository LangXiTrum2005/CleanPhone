package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzbej extends zzbcc implements zzbek {
    public zzbej() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbcc
    public final boolean zzdd(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 == 1) {
            zzc();
        } else if (i2 == 2) {
            zzd();
        } else if (i2 == 3) {
            com.google.android.gms.ads.internal.client.zze zzeVar = (com.google.android.gms.ads.internal.client.zze) zzbcd.zzb(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR);
            zzbcd.zzh(parcel);
            zze(zzeVar);
        } else if (i2 == 4) {
            zzf();
        } else {
            if (i2 != 5) {
                return false;
            }
            zzg();
        }
        parcel2.writeNoException();
        return true;
    }
}
