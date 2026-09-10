package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class sz extends qh implements tz {
    public static tz zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
        return iInterfaceQueryLocalInterface instanceof tz ? (tz) iInterfaceQueryLocalInterface : new rz(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.qh
    public final boolean u1(int i10, Parcel parcel, Parcel parcel2) {
        qz pzVar = null;
        switch (i10) {
            case 1:
                s9.a aVarX1 = s9.b.x1(parcel.readStrongBinder());
                xz xzVar = (xz) rh.b(parcel, xz.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalCallback");
                    pzVar = iInterfaceQueryLocalInterface instanceof qz ? (qz) iInterfaceQueryLocalInterface : new pz(strongBinder, "com.google.android.gms.ads.internal.signals.ISignalCallback");
                }
                rh.f(parcel);
                zze(aVarX1, xzVar, pzVar);
                parcel2.writeNoException();
                return true;
            case 2:
                s9.a aVarX2 = s9.b.x1(parcel.readStrongBinder());
                rh.f(parcel);
                zzf(aVarX2);
                parcel2.writeNoException();
                return true;
            case 3:
                s9.b.x1(parcel.readStrongBinder());
                s9.b.x1(parcel.readStrongBinder());
                rh.f(parcel);
                parcel2.writeNoException();
                parcel2.writeStrongBinder(null);
                return true;
            case 4:
                s9.b.x1(parcel.readStrongBinder());
                rh.f(parcel);
                parcel2.writeNoException();
                parcel2.writeStrongBinder(null);
                return true;
            case 5:
                ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(Uri.CREATOR);
                s9.a aVarX3 = s9.b.x1(parcel.readStrongBinder());
                sw swVarX1 = rw.x1(parcel.readStrongBinder());
                rh.f(parcel);
                zzg(arrayListCreateTypedArrayList, aVarX3, swVarX1);
                parcel2.writeNoException();
                return true;
            case 6:
                ArrayList arrayListCreateTypedArrayList2 = parcel.createTypedArrayList(Uri.CREATOR);
                s9.a aVarX4 = s9.b.x1(parcel.readStrongBinder());
                sw swVarX2 = rw.x1(parcel.readStrongBinder());
                rh.f(parcel);
                zzh(arrayListCreateTypedArrayList2, aVarX4, swVarX2);
                parcel2.writeNoException();
                return true;
            case 7:
                xw xwVar = (xw) rh.b(parcel, xw.CREATOR);
                rh.f(parcel);
                zzi(xwVar);
                parcel2.writeNoException();
                return true;
            case 8:
                s9.a aVarX5 = s9.b.x1(parcel.readStrongBinder());
                rh.f(parcel);
                zzj(aVarX5);
                parcel2.writeNoException();
                return true;
            case 9:
                ArrayList arrayListCreateTypedArrayList3 = parcel.createTypedArrayList(Uri.CREATOR);
                s9.a aVarX6 = s9.b.x1(parcel.readStrongBinder());
                sw swVarX3 = rw.x1(parcel.readStrongBinder());
                rh.f(parcel);
                zzk(arrayListCreateTypedArrayList3, aVarX6, swVarX3);
                parcel2.writeNoException();
                return true;
            case 10:
                ArrayList arrayListCreateTypedArrayList4 = parcel.createTypedArrayList(Uri.CREATOR);
                s9.a aVarX7 = s9.b.x1(parcel.readStrongBinder());
                sw swVarX4 = rw.x1(parcel.readStrongBinder());
                rh.f(parcel);
                zzl(arrayListCreateTypedArrayList4, aVarX7, swVarX4);
                parcel2.writeNoException();
                return true;
            case 11:
                s9.a aVarX8 = s9.b.x1(parcel.readStrongBinder());
                s9.a aVarX9 = s9.b.x1(parcel.readStrongBinder());
                String string = parcel.readString();
                s9.a aVarX10 = s9.b.x1(parcel.readStrongBinder());
                rh.f(parcel);
                s9.a aVarZzm = zzm(aVarX8, aVarX9, string, aVarX10);
                parcel2.writeNoException();
                rh.e(parcel2, aVarZzm);
                return true;
            default:
                return false;
        }
    }
}
