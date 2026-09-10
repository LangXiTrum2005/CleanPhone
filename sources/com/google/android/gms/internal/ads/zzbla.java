package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbla extends zzbcb implements zzblc {
    public zzbla(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    @Override // com.google.android.gms.internal.ads.zzblc
    public final void zze(zzbks zzbksVar, String str) throws RemoteException {
        Parcel parcelZza = zza();
        zzbcd.zze(parcelZza, zzbksVar);
        parcelZza.writeString(str);
        zzda(1, parcelZza);
    }
}
