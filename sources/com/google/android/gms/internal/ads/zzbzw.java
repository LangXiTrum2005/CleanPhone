package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzbzw extends zzbcc implements zzbzx {
    public zzbzw() {
        super("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    public static zzbzx zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
        return iInterfaceQueryLocalInterface instanceof zzbzx ? (zzbzx) iInterfaceQueryLocalInterface : new zzbzv(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbcc
    public final boolean zzdd(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        switch (i2) {
            case 1:
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbcd.zzh(parcel);
                zze(iObjectWrapperAsInterface);
                break;
            case 2:
                IObjectWrapper iObjectWrapperAsInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                int i4 = parcel.readInt();
                zzbcd.zzh(parcel);
                zzf(iObjectWrapperAsInterface2, i4);
                break;
            case 3:
                IObjectWrapper iObjectWrapperAsInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbcd.zzh(parcel);
                zzg(iObjectWrapperAsInterface3);
                break;
            case 4:
                IObjectWrapper iObjectWrapperAsInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbcd.zzh(parcel);
                zzh(iObjectWrapperAsInterface4);
                break;
            case 5:
                IObjectWrapper iObjectWrapperAsInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbcd.zzh(parcel);
                zzi(iObjectWrapperAsInterface5);
                break;
            case 6:
                IObjectWrapper iObjectWrapperAsInterface6 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbcd.zzh(parcel);
                zzj(iObjectWrapperAsInterface6);
                break;
            case 7:
                IObjectWrapper iObjectWrapperAsInterface7 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbzy zzbzyVar = (zzbzy) zzbcd.zzb(parcel, zzbzy.CREATOR);
                zzbcd.zzh(parcel);
                zzk(iObjectWrapperAsInterface7, zzbzyVar);
                break;
            case 8:
                IObjectWrapper iObjectWrapperAsInterface8 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbcd.zzh(parcel);
                zzl(iObjectWrapperAsInterface8);
                break;
            case 9:
                IObjectWrapper iObjectWrapperAsInterface9 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                int i5 = parcel.readInt();
                zzbcd.zzh(parcel);
                zzm(iObjectWrapperAsInterface9, i5);
                break;
            case 10:
                IObjectWrapper iObjectWrapperAsInterface10 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbcd.zzh(parcel);
                zzn(iObjectWrapperAsInterface10);
                break;
            case 11:
                IObjectWrapper iObjectWrapperAsInterface11 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbcd.zzh(parcel);
                zzo(iObjectWrapperAsInterface11);
                break;
            case 12:
                zzbcd.zzh(parcel);
                break;
            case 13:
                IObjectWrapper iObjectWrapperAsInterface12 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbcd.zzh(parcel);
                zzp(iObjectWrapperAsInterface12);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
