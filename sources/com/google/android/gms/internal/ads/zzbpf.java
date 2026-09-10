package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbpf extends zzbcb implements IInterface {
    public zzbpf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
    }

    public final void zze(zzboz zzbozVar, zzbpe zzbpeVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbcd.zzc(parcelZza, zzbozVar);
        zzbcd.zze(parcelZza, zzbpeVar);
        zzdb(2, parcelZza);
    }
}
