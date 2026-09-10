package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgnf extends zzbcb implements zzgnh {
    public zzgnf(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.lmd.protocol.ILmdOverlayService");
    }

    @Override // com.google.android.gms.internal.ads.zzgnh
    public final void zze(String str, Bundle bundle, zzgnj zzgnjVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzbcd.zzc(parcelZza, bundle);
        zzbcd.zze(parcelZza, zzgnjVar);
        zzdb(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzgnh
    public final void zzf(Bundle bundle, zzgnj zzgnjVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbcd.zzc(parcelZza, bundle);
        zzbcd.zze(parcelZza, zzgnjVar);
        zzdb(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzgnh
    public final void zzg(Bundle bundle, zzgnj zzgnjVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbcd.zzc(parcelZza, bundle);
        zzbcd.zze(parcelZza, zzgnjVar);
        zzdb(3, parcelZza);
    }
}
