package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzbwx extends zzbcc implements zzbwy {
    public zzbwx() {
        super("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    public static zzbwy zzI(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
        return iInterfaceQueryLocalInterface instanceof zzbwy ? (zzbwy) iInterfaceQueryLocalInterface : new zzbww(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbcc
    public final boolean zzdd(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        switch (i2) {
            case 1:
                Bundle bundle = (Bundle) zzbcd.zzb(parcel, Bundle.CREATOR);
                zzbcd.zzh(parcel);
                zzh(bundle);
                parcel2.writeNoException();
                return true;
            case 2:
                zzi();
                parcel2.writeNoException();
                return true;
            case 3:
                zzj();
                parcel2.writeNoException();
                return true;
            case 4:
                zzk();
                parcel2.writeNoException();
                return true;
            case 5:
                zzl();
                parcel2.writeNoException();
                return true;
            case 6:
                Bundle bundle2 = (Bundle) zzbcd.zzb(parcel, Bundle.CREATOR);
                zzbcd.zzh(parcel);
                zzo(bundle2);
                parcel2.writeNoException();
                zzbcd.zzd(parcel2, bundle2);
                return true;
            case 7:
                zzp();
                parcel2.writeNoException();
                return true;
            case 8:
                zzq();
                parcel2.writeNoException();
                return true;
            case 9:
                zzs();
                parcel2.writeNoException();
                return true;
            case 10:
                zze();
                parcel2.writeNoException();
                return true;
            case 11:
                boolean zZzg = zzg();
                parcel2.writeNoException();
                int i4 = zzbcd.zza;
                parcel2.writeInt(zZzg ? 1 : 0);
                return true;
            case 12:
                int i5 = parcel.readInt();
                int i6 = parcel.readInt();
                Intent intent = (Intent) zzbcd.zzb(parcel, Intent.CREATOR);
                zzbcd.zzh(parcel);
                zzm(i5, i6, intent);
                parcel2.writeNoException();
                return true;
            case 13:
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbcd.zzh(parcel);
                zzn(iObjectWrapperAsInterface);
                parcel2.writeNoException();
                return true;
            case 14:
                zzf();
                parcel2.writeNoException();
                return true;
            case 15:
                int i7 = parcel.readInt();
                String[] strArrCreateStringArray = parcel.createStringArray();
                int[] iArrCreateIntArray = parcel.createIntArray();
                zzbcd.zzh(parcel);
                zzH(i7, strArrCreateStringArray, iArrCreateIntArray);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
