package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzcci extends zzbcc implements zzccj {
    public zzcci() {
        super("com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    public static zzccj zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
        return iInterfaceQueryLocalInterface instanceof zzccj ? (zzccj) iInterfaceQueryLocalInterface : new zzcch(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbcc
    public final boolean zzdd(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        zzccg zzcceVar = null;
        switch (i2) {
            case 1:
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzccn zzccnVar = (zzccn) zzbcd.zzb(parcel, zzccn.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalCallback");
                    zzcceVar = iInterfaceQueryLocalInterface instanceof zzccg ? (zzccg) iInterfaceQueryLocalInterface : new zzcce(strongBinder);
                }
                zzbcd.zzh(parcel);
                zze(iObjectWrapperAsInterface, zzccnVar, zzcceVar);
                parcel2.writeNoException();
                return true;
            case 2:
                IObjectWrapper iObjectWrapperAsInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbcd.zzh(parcel);
                zzf(iObjectWrapperAsInterface2);
                parcel2.writeNoException();
                return true;
            case 3:
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbcd.zzh(parcel);
                parcel2.writeNoException();
                zzbcd.zze(parcel2, null);
                return true;
            case 4:
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbcd.zzh(parcel);
                parcel2.writeNoException();
                zzbcd.zze(parcel2, null);
                return true;
            case 5:
                ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(Uri.CREATOR);
                IObjectWrapper iObjectWrapperAsInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbxn zzbxnVarZzb = zzbxm.zzb(parcel.readStrongBinder());
                zzbcd.zzh(parcel);
                zzg(arrayListCreateTypedArrayList, iObjectWrapperAsInterface3, zzbxnVarZzb);
                parcel2.writeNoException();
                return true;
            case 6:
                ArrayList arrayListCreateTypedArrayList2 = parcel.createTypedArrayList(Uri.CREATOR);
                IObjectWrapper iObjectWrapperAsInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbxn zzbxnVarZzb2 = zzbxm.zzb(parcel.readStrongBinder());
                zzbcd.zzh(parcel);
                zzh(arrayListCreateTypedArrayList2, iObjectWrapperAsInterface4, zzbxnVarZzb2);
                parcel2.writeNoException();
                return true;
            case 7:
                zzbxq zzbxqVar = (zzbxq) zzbcd.zzb(parcel, zzbxq.CREATOR);
                zzbcd.zzh(parcel);
                zzi(zzbxqVar);
                parcel2.writeNoException();
                return true;
            case 8:
                IObjectWrapper iObjectWrapperAsInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbcd.zzh(parcel);
                zzj(iObjectWrapperAsInterface5);
                parcel2.writeNoException();
                return true;
            case 9:
                ArrayList arrayListCreateTypedArrayList3 = parcel.createTypedArrayList(Uri.CREATOR);
                IObjectWrapper iObjectWrapperAsInterface6 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbxn zzbxnVarZzb3 = zzbxm.zzb(parcel.readStrongBinder());
                zzbcd.zzh(parcel);
                zzk(arrayListCreateTypedArrayList3, iObjectWrapperAsInterface6, zzbxnVarZzb3);
                parcel2.writeNoException();
                return true;
            case 10:
                ArrayList arrayListCreateTypedArrayList4 = parcel.createTypedArrayList(Uri.CREATOR);
                IObjectWrapper iObjectWrapperAsInterface7 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbxn zzbxnVarZzb4 = zzbxm.zzb(parcel.readStrongBinder());
                zzbcd.zzh(parcel);
                zzl(arrayListCreateTypedArrayList4, iObjectWrapperAsInterface7, zzbxnVarZzb4);
                parcel2.writeNoException();
                return true;
            case 11:
                IObjectWrapper iObjectWrapperAsInterface8 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper iObjectWrapperAsInterface9 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                String string = parcel.readString();
                IObjectWrapper iObjectWrapperAsInterface10 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbcd.zzh(parcel);
                IObjectWrapper iObjectWrapperZzm = zzm(iObjectWrapperAsInterface8, iObjectWrapperAsInterface9, string, iObjectWrapperAsInterface10);
                parcel2.writeNoException();
                zzbcd.zze(parcel2, iObjectWrapperZzm);
                return true;
            default:
                return false;
        }
    }
}
