package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbzn extends zzbcb implements IInterface {
    public zzbzn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
    }

    public final void zze(zzbzm zzbzmVar, String str, String str2) throws RemoteException {
        Parcel parcelZza = zza();
        zzbcd.zze(parcelZza, zzbzmVar);
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzda(2, parcelZza);
    }
}
