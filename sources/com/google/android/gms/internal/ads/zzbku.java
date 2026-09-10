package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbku extends zzbcb implements zzbkw {
    public zzbku(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbkw
    public final void zze(zzbkn zzbknVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbcd.zze(parcelZza, zzbknVar);
        zzda(1, parcelZza);
    }
}
