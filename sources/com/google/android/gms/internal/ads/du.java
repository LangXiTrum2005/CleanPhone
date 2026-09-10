package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzea;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class du extends qh implements eu {
    public du() {
        super("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    @Override // com.google.android.gms.internal.ads.qh
    public final boolean u1(int i10, Parcel parcel, Parcel parcel2) {
        switch (i10) {
            case 2:
                String strZze = zze();
                parcel2.writeNoException();
                parcel2.writeString(strZze);
                return true;
            case 3:
                List listZzf = zzf();
                parcel2.writeNoException();
                parcel2.writeList(listZzf);
                return true;
            case 4:
                String strZzg = zzg();
                parcel2.writeNoException();
                parcel2.writeString(strZzg);
                return true;
            case 5:
                mo moVarZzh = zzh();
                parcel2.writeNoException();
                rh.e(parcel2, moVarZzh);
                return true;
            case 6:
                String strZzi = zzi();
                parcel2.writeNoException();
                parcel2.writeString(strZzi);
                return true;
            case 7:
                String strZzj = zzj();
                parcel2.writeNoException();
                parcel2.writeString(strZzj);
                return true;
            case 8:
                double dZzk = zzk();
                parcel2.writeNoException();
                parcel2.writeDouble(dZzk);
                return true;
            case 9:
                String strZzl = zzl();
                parcel2.writeNoException();
                parcel2.writeString(strZzl);
                return true;
            case 10:
                String strZzm = zzm();
                parcel2.writeNoException();
                parcel2.writeString(strZzm);
                return true;
            case 11:
                zzea zzeaVarZzn = zzn();
                parcel2.writeNoException();
                rh.e(parcel2, zzeaVarZzn);
                return true;
            case 12:
                parcel2.writeNoException();
                ClassLoader classLoader = rh.f19590a;
                parcel2.writeStrongBinder(null);
                return true;
            case 13:
                s9.a aVarZzp = zzp();
                parcel2.writeNoException();
                rh.e(parcel2, aVarZzp);
                return true;
            case 14:
                s9.a aVarZzq = zzq();
                parcel2.writeNoException();
                rh.e(parcel2, aVarZzq);
                return true;
            case 15:
                s9.a aVarZzr = zzr();
                parcel2.writeNoException();
                rh.e(parcel2, aVarZzr);
                return true;
            case 16:
                Bundle bundleZzs = zzs();
                parcel2.writeNoException();
                rh.d(parcel2, bundleZzs);
                return true;
            case 17:
                boolean zZzt = zzt();
                parcel2.writeNoException();
                ClassLoader classLoader2 = rh.f19590a;
                parcel2.writeInt(zZzt ? 1 : 0);
                return true;
            case 18:
                boolean zZzu = zzu();
                parcel2.writeNoException();
                ClassLoader classLoader3 = rh.f19590a;
                parcel2.writeInt(zZzu ? 1 : 0);
                return true;
            case 19:
                zzv();
                parcel2.writeNoException();
                return true;
            case 20:
                s9.a aVarX1 = s9.b.x1(parcel.readStrongBinder());
                rh.f(parcel);
                k(aVarX1);
                parcel2.writeNoException();
                return true;
            case 21:
                s9.a aVarX2 = s9.b.x1(parcel.readStrongBinder());
                s9.a aVarX3 = s9.b.x1(parcel.readStrongBinder());
                s9.a aVarX4 = s9.b.x1(parcel.readStrongBinder());
                rh.f(parcel);
                f0(aVarX2, aVarX3, aVarX4);
                parcel2.writeNoException();
                return true;
            case 22:
                s9.a aVarX5 = s9.b.x1(parcel.readStrongBinder());
                rh.f(parcel);
                S(aVarX5);
                parcel2.writeNoException();
                return true;
            case 23:
                float fZzz = zzz();
                parcel2.writeNoException();
                parcel2.writeFloat(fZzz);
                return true;
            case 24:
                float fZzA = zzA();
                parcel2.writeNoException();
                parcel2.writeFloat(fZzA);
                return true;
            case 25:
                float fZzB = zzB();
                parcel2.writeNoException();
                parcel2.writeFloat(fZzB);
                return true;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
                zzC();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
