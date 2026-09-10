package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbeb extends zzbcb implements zzbed {
    public zzbeb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbed
    public final com.google.android.gms.ads.internal.client.zzbx zze() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbed
    public final void zzf(IObjectWrapper iObjectWrapper, zzbek zzbekVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbcd.zze(parcelZza, iObjectWrapper);
        zzbcd.zze(parcelZza, zzbekVar);
        zzda(4, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbed
    public final com.google.android.gms.ads.internal.client.zzea zzg() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(5, zza());
        com.google.android.gms.ads.internal.client.zzea zzeaVarZzb = com.google.android.gms.ads.internal.client.zzdz.zzb(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzeaVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbed
    public final void zzh(boolean z2) throws RemoteException {
        Parcel parcelZza = zza();
        int i2 = zzbcd.zza;
        parcelZza.writeInt(z2 ? 1 : 0);
        zzda(6, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbed
    public final void zzi(com.google.android.gms.ads.internal.client.zzdt zzdtVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbcd.zze(parcelZza, zzdtVar);
        zzda(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbed
    public final String zzj() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(8, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbed
    public final long zzk() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(9, zza());
        long j = parcelZzcZ.readLong();
        parcelZzcZ.recycle();
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzbed
    public final void zzl(long j) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeLong(j);
        zzda(10, parcelZza);
    }
}
