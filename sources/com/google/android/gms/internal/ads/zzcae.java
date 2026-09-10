package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzcae extends zzbcc implements zzcaf {
    public zzcae() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    public static zzcaf zzt(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
        return iInterfaceQueryLocalInterface instanceof zzcaf ? (zzcaf) iInterfaceQueryLocalInterface : new zzcad(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbcc
    public final boolean zzdd(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        zzcam zzcakVar = null;
        zzcam zzcakVar2 = null;
        zzcan zzcanVar = null;
        zzcai zzcagVar = null;
        switch (i2) {
            case 1:
                com.google.android.gms.ads.internal.client.zzm zzmVar = (com.google.android.gms.ads.internal.client.zzm) zzbcd.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    zzcakVar = iInterfaceQueryLocalInterface instanceof zzcam ? (zzcam) iInterfaceQueryLocalInterface : new zzcak(strongBinder);
                }
                zzbcd.zzh(parcel);
                zzc(zzmVar, zzcakVar);
                parcel2.writeNoException();
                return true;
            case 2:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
                    zzcagVar = iInterfaceQueryLocalInterface2 instanceof zzcai ? (zzcai) iInterfaceQueryLocalInterface2 : new zzcag(strongBinder2);
                }
                zzbcd.zzh(parcel);
                zze(zzcagVar);
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zZzi = zzi();
                parcel2.writeNoException();
                int i4 = zzbcd.zza;
                parcel2.writeInt(zZzi ? 1 : 0);
                return true;
            case 4:
                String strZzj = zzj();
                parcel2.writeNoException();
                parcel2.writeString(strZzj);
                return true;
            case 5:
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbcd.zzh(parcel);
                zzb(iObjectWrapperAsInterface);
                parcel2.writeNoException();
                return true;
            case 6:
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
                    zzcanVar = iInterfaceQueryLocalInterface3 instanceof zzcan ? (zzcan) iInterfaceQueryLocalInterface3 : new zzcan(strongBinder3);
                }
                zzbcd.zzh(parcel);
                zzs(zzcanVar);
                parcel2.writeNoException();
                return true;
            case 7:
                zzcat zzcatVar = (zzcat) zzbcd.zzb(parcel, zzcat.CREATOR);
                zzbcd.zzh(parcel);
                zzh(zzcatVar);
                parcel2.writeNoException();
                return true;
            case 8:
                com.google.android.gms.ads.internal.client.zzdq zzdqVarZzb = com.google.android.gms.ads.internal.client.zzdp.zzb(parcel.readStrongBinder());
                zzbcd.zzh(parcel);
                zzf(zzdqVarZzb);
                parcel2.writeNoException();
                return true;
            case 9:
                Bundle bundleZzg = zzg();
                parcel2.writeNoException();
                zzbcd.zzd(parcel2, bundleZzg);
                return true;
            case 10:
                IObjectWrapper iObjectWrapperAsInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                boolean zZza = zzbcd.zza(parcel);
                zzbcd.zzh(parcel);
                zzk(iObjectWrapperAsInterface2, zZza);
                parcel2.writeNoException();
                return true;
            case 11:
                zzcac zzcacVarZzl = zzl();
                parcel2.writeNoException();
                zzbcd.zze(parcel2, zzcacVarZzl);
                return true;
            case 12:
                com.google.android.gms.ads.internal.client.zzea zzeaVarZzm = zzm();
                parcel2.writeNoException();
                zzbcd.zze(parcel2, zzeaVarZzm);
                return true;
            case 13:
                com.google.android.gms.ads.internal.client.zzdt zzdtVarZzb = com.google.android.gms.ads.internal.client.zzds.zzb(parcel.readStrongBinder());
                zzbcd.zzh(parcel);
                zzo(zzdtVarZzb);
                parcel2.writeNoException();
                return true;
            case 14:
                com.google.android.gms.ads.internal.client.zzm zzmVar2 = (com.google.android.gms.ads.internal.client.zzm) zzbcd.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    zzcakVar2 = iInterfaceQueryLocalInterface4 instanceof zzcam ? (zzcam) iInterfaceQueryLocalInterface4 : new zzcak(strongBinder4);
                }
                zzbcd.zzh(parcel);
                zzd(zzmVar2, zzcakVar2);
                parcel2.writeNoException();
                return true;
            case 15:
                boolean zZza2 = zzbcd.zza(parcel);
                zzbcd.zzh(parcel);
                zzp(zZza2);
                parcel2.writeNoException();
                return true;
            case 16:
                String strZzn = zzn();
                parcel2.writeNoException();
                parcel2.writeString(strZzn);
                return true;
            case 17:
                long jZzq = zzq();
                parcel2.writeNoException();
                parcel2.writeLong(jZzq);
                return true;
            case 18:
                long j = parcel.readLong();
                zzbcd.zzh(parcel);
                zzr(j);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
