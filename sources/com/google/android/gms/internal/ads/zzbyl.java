package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbyl extends zzbcb implements zzbyn {
    public zzbyl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.google.android.gms.internal.ads.zzbyn
    public final void zze(zzbza zzbzaVar, zzbyr zzbyrVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbcd.zzc(parcelZza, zzbzaVar);
        zzbcd.zze(parcelZza, zzbyrVar);
        zzda(4, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyn
    public final void zzf(zzbza zzbzaVar, zzbyr zzbyrVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbcd.zzc(parcelZza, zzbzaVar);
        zzbcd.zze(parcelZza, zzbyrVar);
        zzda(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyn
    public final void zzg(zzbza zzbzaVar, zzbyr zzbyrVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbcd.zzc(parcelZza, zzbzaVar);
        zzbcd.zze(parcelZza, zzbyrVar);
        zzda(6, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyn
    public final void zzh(String str, zzbyr zzbyrVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzbcd.zze(parcelZza, zzbyrVar);
        zzda(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyn
    public final void zzi(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzda(9, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyn
    public final void zzj(zzbyj zzbyjVar, zzbys zzbysVar) throws RemoteException {
        throw null;
    }
}
