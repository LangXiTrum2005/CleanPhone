package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcad extends zzbcb implements zzcaf {
    public zzcad(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    @Override // com.google.android.gms.internal.ads.zzcaf
    public final void zzb(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzbcd.zze(parcelZza, iObjectWrapper);
        zzda(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcaf
    public final void zzc(com.google.android.gms.ads.internal.client.zzm zzmVar, zzcam zzcamVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbcd.zzc(parcelZza, zzmVar);
        zzbcd.zze(parcelZza, zzcamVar);
        zzda(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcaf
    public final void zzd(com.google.android.gms.ads.internal.client.zzm zzmVar, zzcam zzcamVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbcd.zzc(parcelZza, zzmVar);
        zzbcd.zze(parcelZza, zzcamVar);
        zzda(14, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcaf
    public final void zze(zzcai zzcaiVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbcd.zze(parcelZza, zzcaiVar);
        zzda(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcaf
    public final void zzf(com.google.android.gms.ads.internal.client.zzdq zzdqVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbcd.zze(parcelZza, zzdqVar);
        zzda(8, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcaf
    public final Bundle zzg() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(9, zza());
        Bundle bundle = (Bundle) zzbcd.zzb(parcelZzcZ, Bundle.CREATOR);
        parcelZzcZ.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzcaf
    public final void zzh(zzcat zzcatVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbcd.zzc(parcelZza, zzcatVar);
        zzda(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcaf
    public final boolean zzi() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcaf
    public final String zzj() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcaf
    public final void zzk(IObjectWrapper iObjectWrapper, boolean z2) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcaf
    public final zzcac zzl() throws RemoteException {
        zzcac zzcaaVar;
        Parcel parcelZzcZ = zzcZ(11, zza());
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            zzcaaVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
            zzcaaVar = iInterfaceQueryLocalInterface instanceof zzcac ? (zzcac) iInterfaceQueryLocalInterface : new zzcaa(strongBinder);
        }
        parcelZzcZ.recycle();
        return zzcaaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcaf
    public final com.google.android.gms.ads.internal.client.zzea zzm() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(12, zza());
        com.google.android.gms.ads.internal.client.zzea zzeaVarZzb = com.google.android.gms.ads.internal.client.zzdz.zzb(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzeaVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzcaf
    public final String zzn() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(16, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzcaf
    public final void zzo(com.google.android.gms.ads.internal.client.zzdt zzdtVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbcd.zze(parcelZza, zzdtVar);
        zzda(13, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcaf
    public final void zzp(boolean z2) throws RemoteException {
        Parcel parcelZza = zza();
        int i2 = zzbcd.zza;
        parcelZza.writeInt(z2 ? 1 : 0);
        zzda(15, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcaf
    public final long zzq() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(17, zza());
        long j = parcelZzcZ.readLong();
        parcelZzcZ.recycle();
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzcaf
    public final void zzr(long j) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeLong(j);
        zzda(18, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcaf
    public final void zzs(zzcan zzcanVar) throws RemoteException {
        throw null;
    }
}
