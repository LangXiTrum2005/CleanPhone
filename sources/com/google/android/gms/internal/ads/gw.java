package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class gw extends qh implements hw {
    public gw() {
        super("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    public static hw zzI(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
        return iInterfaceQueryLocalInterface instanceof hw ? (hw) iInterfaceQueryLocalInterface : new fw(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.qh
    public final boolean u1(int i10, Parcel parcel, Parcel parcel2) {
        switch (i10) {
            case 1:
                Bundle bundle = (Bundle) rh.b(parcel, Bundle.CREATOR);
                rh.f(parcel);
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
                Bundle bundle2 = (Bundle) rh.b(parcel, Bundle.CREATOR);
                rh.f(parcel);
                zzo(bundle2);
                parcel2.writeNoException();
                rh.d(parcel2, bundle2);
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
                ClassLoader classLoader = rh.f19590a;
                parcel2.writeInt(zZzg ? 1 : 0);
                return true;
            case 12:
                int i11 = parcel.readInt();
                int i12 = parcel.readInt();
                Intent intent = (Intent) rh.b(parcel, Intent.CREATOR);
                rh.f(parcel);
                zzm(i11, i12, intent);
                parcel2.writeNoException();
                return true;
            case 13:
                s9.b.x1(parcel.readStrongBinder());
                rh.f(parcel);
                parcel2.writeNoException();
                return true;
            case 14:
                zzf();
                parcel2.writeNoException();
                return true;
            case 15:
                int i13 = parcel.readInt();
                String[] strArrCreateStringArray = parcel.createStringArray();
                int[] iArrCreateIntArray = parcel.createIntArray();
                rh.f(parcel);
                zzH(i13, strArrCreateStringArray, iArrCreateIntArray);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
