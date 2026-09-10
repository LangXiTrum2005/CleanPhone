package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.iy;
import com.google.android.gms.internal.ads.qh;
import com.google.android.gms.internal.ads.qt;
import com.google.android.gms.internal.ads.rh;
import com.google.android.gms.internal.ads.wi;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzcg extends qh implements zzch {
    public zzcg() {
        super("com.google.android.gms.ads.internal.client.IAdPreloader");
    }

    @Override // com.google.android.gms.internal.ads.qh
    public final boolean u1(int i10, Parcel parcel, Parcel parcel2) throws RemoteException {
        zzcb zzbzVar = null;
        zzce zzccVar = null;
        switch (i10) {
            case 1:
                ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(zzfp.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloadCallback");
                    zzbzVar = iInterfaceQueryLocalInterface instanceof zzcb ? (zzcb) iInterfaceQueryLocalInterface : new zzbz(strongBinder, "com.google.android.gms.ads.internal.client.IAdPreloadCallback");
                }
                rh.f(parcel);
                zze(arrayListCreateTypedArrayList, zzbzVar);
                parcel2.writeNoException();
                return true;
            case 2:
                String string = parcel.readString();
                rh.f(parcel);
                boolean zZzf = zzf(string);
                parcel2.writeNoException();
                parcel2.writeInt(zZzf ? 1 : 0);
                return true;
            case 3:
                String string2 = parcel.readString();
                rh.f(parcel);
                iy iyVarZzg = zzg(string2);
                parcel2.writeNoException();
                rh.e(parcel2, iyVarZzg);
                return true;
            case 4:
                String string3 = parcel.readString();
                rh.f(parcel);
                boolean zZzh = zzh(string3);
                parcel2.writeNoException();
                parcel2.writeInt(zZzh ? 1 : 0);
                return true;
            case 5:
                String string4 = parcel.readString();
                rh.f(parcel);
                wi wiVarZzi = zzi(string4);
                parcel2.writeNoException();
                rh.e(parcel2, wiVarZzi);
                return true;
            case 6:
                String string5 = parcel.readString();
                rh.f(parcel);
                boolean zZzj = zzj(string5);
                parcel2.writeNoException();
                parcel2.writeInt(zZzj ? 1 : 0);
                return true;
            case 7:
                String string6 = parcel.readString();
                rh.f(parcel);
                zzbu zzbuVarZzk = zzk(string6);
                parcel2.writeNoException();
                rh.e(parcel2, zzbuVarZzk);
                return true;
            case 8:
                qt.x1(parcel.readStrongBinder());
                rh.f(parcel);
                parcel2.writeNoException();
                return true;
            case 9:
                String string7 = parcel.readString();
                zzfp zzfpVar = (zzfp) rh.b(parcel, zzfp.CREATOR);
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloadCallbackV2");
                    zzccVar = iInterfaceQueryLocalInterface2 instanceof zzce ? (zzce) iInterfaceQueryLocalInterface2 : new zzcc(strongBinder2, "com.google.android.gms.ads.internal.client.IAdPreloadCallbackV2");
                }
                rh.f(parcel);
                boolean zZzm = zzm(string7, zzfpVar, zzccVar);
                parcel2.writeNoException();
                parcel2.writeInt(zZzm ? 1 : 0);
                return true;
            case 10:
                int i11 = parcel.readInt();
                String string8 = parcel.readString();
                rh.f(parcel);
                boolean zZzn = zzn(i11, string8);
                parcel2.writeNoException();
                parcel2.writeInt(zZzn ? 1 : 0);
                return true;
            case 11:
                String string9 = parcel.readString();
                rh.f(parcel);
                zzbu zzbuVarZzo = zzo(string9);
                parcel2.writeNoException();
                rh.e(parcel2, zzbuVarZzo);
                return true;
            case 12:
                String string10 = parcel.readString();
                rh.f(parcel);
                wi wiVarZzp = zzp(string10);
                parcel2.writeNoException();
                rh.e(parcel2, wiVarZzp);
                return true;
            case 13:
                String string11 = parcel.readString();
                rh.f(parcel);
                iy iyVarZzq = zzq(string11);
                parcel2.writeNoException();
                rh.e(parcel2, iyVarZzq);
                return true;
            case 14:
                int i12 = parcel.readInt();
                String string12 = parcel.readString();
                rh.f(parcel);
                zzfp zzfpVarZzr = zzr(i12, string12);
                parcel2.writeNoException();
                rh.d(parcel2, zzfpVarZzr);
                return true;
            case 15:
                int i13 = parcel.readInt();
                rh.f(parcel);
                Bundle bundleZzs = zzs(i13);
                parcel2.writeNoException();
                rh.d(parcel2, bundleZzs);
                return true;
            case 16:
                int i14 = parcel.readInt();
                String string13 = parcel.readString();
                rh.f(parcel);
                int iZzt = zzt(i14, string13);
                parcel2.writeNoException();
                parcel2.writeInt(iZzt);
                return true;
            case 17:
                int i15 = parcel.readInt();
                String string14 = parcel.readString();
                rh.f(parcel);
                boolean zZzu = zzu(i15, string14);
                parcel2.writeNoException();
                parcel2.writeInt(zZzu ? 1 : 0);
                return true;
            case 18:
                int i16 = parcel.readInt();
                rh.f(parcel);
                zzv(i16);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
