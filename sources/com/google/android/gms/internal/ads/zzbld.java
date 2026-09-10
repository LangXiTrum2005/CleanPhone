package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbld extends zzbcb implements zzblf {
    public zzbld(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzblf
    public final void zze(zzbks zzbksVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbcd.zze(parcelZza, zzbksVar);
        zzda(1, parcelZza);
    }
}
