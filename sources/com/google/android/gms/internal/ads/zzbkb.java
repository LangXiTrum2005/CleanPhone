package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzbkb extends zzbcc implements zzbkc {
    public zzbkb() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    public static zzbkc zzdF(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
        return iInterfaceQueryLocalInterface instanceof zzbkc ? (zzbkc) iInterfaceQueryLocalInterface : new zzbka(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbcc
    public final boolean zzdd(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        zzbjv zzbjtVar;
        switch (i2) {
            case 1:
                String string = parcel.readString();
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbcd.zzh(parcel);
                zzb(string, iObjectWrapperAsInterface);
                parcel2.writeNoException();
                return true;
            case 2:
                String string2 = parcel.readString();
                zzbcd.zzh(parcel);
                IObjectWrapper iObjectWrapperZzc = zzc(string2);
                parcel2.writeNoException();
                zzbcd.zze(parcel2, iObjectWrapperZzc);
                return true;
            case 3:
                IObjectWrapper iObjectWrapperAsInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbcd.zzh(parcel);
                zzd(iObjectWrapperAsInterface2);
                parcel2.writeNoException();
                return true;
            case 4:
                zze();
                parcel2.writeNoException();
                return true;
            case 5:
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                parcel.readInt();
                zzbcd.zzh(parcel);
                parcel2.writeNoException();
                return true;
            case 6:
                IObjectWrapper iObjectWrapperAsInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbcd.zzh(parcel);
                zzg(iObjectWrapperAsInterface3);
                parcel2.writeNoException();
                return true;
            case 7:
                IObjectWrapper iObjectWrapperAsInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbcd.zzh(parcel);
                zzdC(iObjectWrapperAsInterface4);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    zzbjtVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
                    zzbjtVar = iInterfaceQueryLocalInterface instanceof zzbjv ? (zzbjv) iInterfaceQueryLocalInterface : new zzbjt(strongBinder);
                }
                zzbcd.zzh(parcel);
                zzdD(zzbjtVar);
                parcel2.writeNoException();
                return true;
            case 9:
                IObjectWrapper iObjectWrapperAsInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbcd.zzh(parcel);
                zzdB(iObjectWrapperAsInterface5);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
