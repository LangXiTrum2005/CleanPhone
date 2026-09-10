package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.qh;
import com.google.android.gms.internal.ads.qt;
import com.google.android.gms.internal.ads.rh;
import com.google.android.gms.internal.ads.st;
import com.google.android.gms.internal.ads.xr;
import com.google.android.gms.internal.ads.yr;
import java.util.List;
import s9.a;
import s9.b;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzcx extends qh implements zzcy {
    public zzcx() {
        super("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // com.google.android.gms.internal.ads.qh
    public final boolean u1(int i10, Parcel parcel, Parcel parcel2) throws RemoteException {
        zzdk zzdiVar;
        switch (i10) {
            case 1:
                zze();
                parcel2.writeNoException();
                return true;
            case 2:
                float f10 = parcel.readFloat();
                rh.f(parcel);
                zzf(f10);
                parcel2.writeNoException();
                return true;
            case 3:
                String string = parcel.readString();
                rh.f(parcel);
                zzg(string);
                parcel2.writeNoException();
                return true;
            case 4:
                boolean zA = rh.a(parcel);
                rh.f(parcel);
                zzh(zA);
                parcel2.writeNoException();
                return true;
            case 5:
                a aVarX1 = b.x1(parcel.readStrongBinder());
                String string2 = parcel.readString();
                rh.f(parcel);
                zzi(aVarX1, string2);
                parcel2.writeNoException();
                return true;
            case 6:
                String string3 = parcel.readString();
                a aVarX2 = b.x1(parcel.readStrongBinder());
                rh.f(parcel);
                zzj(string3, aVarX2);
                parcel2.writeNoException();
                return true;
            case 7:
                float fZzk = zzk();
                parcel2.writeNoException();
                parcel2.writeFloat(fZzk);
                return true;
            case 8:
                boolean zZzl = zzl();
                parcel2.writeNoException();
                ClassLoader classLoader = rh.f19590a;
                parcel2.writeInt(zZzl ? 1 : 0);
                return true;
            case 9:
                String strZzm = zzm();
                parcel2.writeNoException();
                parcel2.writeString(strZzm);
                return true;
            case 10:
                String string4 = parcel.readString();
                rh.f(parcel);
                zzn(string4);
                parcel2.writeNoException();
                return true;
            case 11:
                st stVarX1 = qt.x1(parcel.readStrongBinder());
                rh.f(parcel);
                zzo(stVarX1);
                parcel2.writeNoException();
                return true;
            case 12:
                yr yrVarZzc = xr.zzc(parcel.readStrongBinder());
                rh.f(parcel);
                zzp(yrVarZzc);
                parcel2.writeNoException();
                return true;
            case 13:
                List listZzq = zzq();
                parcel2.writeNoException();
                parcel2.writeTypedList(listZzq);
                return true;
            case 14:
                zzfr zzfrVar = (zzfr) rh.b(parcel, zzfr.CREATOR);
                rh.f(parcel);
                zzr(zzfrVar);
                parcel2.writeNoException();
                return true;
            case 15:
                zzs();
                parcel2.writeNoException();
                return true;
            case 16:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    zzdiVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
                    zzdiVar = iInterfaceQueryLocalInterface instanceof zzdk ? (zzdk) iInterfaceQueryLocalInterface : new zzdi(strongBinder, "com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
                }
                rh.f(parcel);
                zzt(zzdiVar);
                parcel2.writeNoException();
                return true;
            case 17:
                boolean zA2 = rh.a(parcel);
                rh.f(parcel);
                zzu(zA2);
                parcel2.writeNoException();
                return true;
            case 18:
                String string5 = parcel.readString();
                rh.f(parcel);
                zzv(string5);
                parcel2.writeNoException();
                return true;
            case 19:
                zzw();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
