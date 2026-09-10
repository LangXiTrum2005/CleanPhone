package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbyp extends zzbcb implements zzbyr {
    public zzbyp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbyr
    public final void zze(ParcelFileDescriptor parcelFileDescriptor) throws RemoteException {
        Parcel parcelZza = zza();
        zzbcd.zzc(parcelZza, parcelFileDescriptor);
        zzda(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyr
    public final void zzf(com.google.android.gms.ads.internal.util.zzba zzbaVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbcd.zzc(parcelZza, zzbaVar);
        zzda(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyr
    public final void zzg(ParcelFileDescriptor parcelFileDescriptor, zzbza zzbzaVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbcd.zzc(parcelZza, parcelFileDescriptor);
        zzbcd.zzc(parcelZza, zzbzaVar);
        zzda(3, parcelZza);
    }
}
