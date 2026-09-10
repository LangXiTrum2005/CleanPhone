package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzbzo extends zzbcc implements zzbzp {
    public zzbzo() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbcc
    public final boolean zzdd(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 == 1) {
            zzbzt zzbztVar = (zzbzt) zzbcd.zzb(parcel, zzbzt.CREATOR);
            zzbcd.zzh(parcel);
            zzb(zzbztVar);
            parcel2.writeNoException();
        } else if (i2 != 2) {
            zzbzs zzbzqVar = null;
            zzbzn zzbznVar = null;
            if (i2 == 3) {
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                    zzbzqVar = iInterfaceQueryLocalInterface instanceof zzbzs ? (zzbzs) iInterfaceQueryLocalInterface : new zzbzq(strongBinder);
                }
                zzbcd.zzh(parcel);
                zzd(zzbzqVar);
                parcel2.writeNoException();
            } else if (i2 != 34) {
                switch (i2) {
                    case 5:
                        boolean zZze = zze();
                        parcel2.writeNoException();
                        int i4 = zzbcd.zza;
                        parcel2.writeInt(zZze ? 1 : 0);
                        break;
                    case 6:
                        zzf();
                        parcel2.writeNoException();
                        break;
                    case 7:
                        zzg();
                        parcel2.writeNoException();
                        break;
                    case 8:
                        zzh();
                        parcel2.writeNoException();
                        break;
                    case 9:
                        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                        zzbcd.zzh(parcel);
                        zzi(iObjectWrapperAsInterface);
                        parcel2.writeNoException();
                        break;
                    case 10:
                        IObjectWrapper iObjectWrapperAsInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                        zzbcd.zzh(parcel);
                        zzj(iObjectWrapperAsInterface2);
                        parcel2.writeNoException();
                        break;
                    case 11:
                        IObjectWrapper iObjectWrapperAsInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                        zzbcd.zzh(parcel);
                        zzk(iObjectWrapperAsInterface3);
                        parcel2.writeNoException();
                        break;
                    case 12:
                        String strZzl = zzl();
                        parcel2.writeNoException();
                        parcel2.writeString(strZzl);
                        break;
                    case 13:
                        String string = parcel.readString();
                        zzbcd.zzh(parcel);
                        zzm(string);
                        parcel2.writeNoException();
                        break;
                    case 14:
                        com.google.android.gms.ads.internal.client.zzcb zzcbVarZzb = com.google.android.gms.ads.internal.client.zzca.zzb(parcel.readStrongBinder());
                        zzbcd.zzh(parcel);
                        zzn(zzcbVarZzb);
                        parcel2.writeNoException();
                        break;
                    case 15:
                        Bundle bundleZzo = zzo();
                        parcel2.writeNoException();
                        zzbcd.zzd(parcel2, bundleZzo);
                        break;
                    case 16:
                        IBinder strongBinder2 = parcel.readStrongBinder();
                        if (strongBinder2 != null) {
                            IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
                            zzbznVar = iInterfaceQueryLocalInterface2 instanceof zzbzn ? (zzbzn) iInterfaceQueryLocalInterface2 : new zzbzn(strongBinder2);
                        }
                        zzbcd.zzh(parcel);
                        zzu(zzbznVar);
                        parcel2.writeNoException();
                        break;
                    case 17:
                        parcel.readString();
                        zzbcd.zzh(parcel);
                        parcel2.writeNoException();
                        break;
                    case 18:
                        IObjectWrapper iObjectWrapperAsInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                        zzbcd.zzh(parcel);
                        zzp(iObjectWrapperAsInterface4);
                        parcel2.writeNoException();
                        break;
                    case 19:
                        String string2 = parcel.readString();
                        zzbcd.zzh(parcel);
                        zzq(string2);
                        parcel2.writeNoException();
                        break;
                    case 20:
                        boolean zZzs = zzs();
                        parcel2.writeNoException();
                        int i5 = zzbcd.zza;
                        parcel2.writeInt(zZzs ? 1 : 0);
                        break;
                    case 21:
                        com.google.android.gms.ads.internal.client.zzea zzeaVarZzt = zzt();
                        parcel2.writeNoException();
                        zzbcd.zze(parcel2, zzeaVarZzt);
                        break;
                    default:
                        return false;
                }
            } else {
                boolean zZza = zzbcd.zza(parcel);
                zzbcd.zzh(parcel);
                zzr(zZza);
                parcel2.writeNoException();
            }
        } else {
            zzc();
            parcel2.writeNoException();
        }
        return true;
    }
}
