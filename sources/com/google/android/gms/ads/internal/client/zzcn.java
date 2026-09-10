package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.aw;
import com.google.android.gms.internal.ads.cr;
import com.google.android.gms.internal.ads.dr;
import com.google.android.gms.internal.ads.hr;
import com.google.android.gms.internal.ads.hw;
import com.google.android.gms.internal.ads.iy;
import com.google.android.gms.internal.ads.qh;
import com.google.android.gms.internal.ads.qo;
import com.google.android.gms.internal.ads.qt;
import com.google.android.gms.internal.ads.rh;
import com.google.android.gms.internal.ads.st;
import com.google.android.gms.internal.ads.tz;
import com.google.android.gms.internal.ads.uo;
import com.google.android.gms.internal.ads.vx;
import s9.a;
import s9.b;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzcn extends qh implements zzco {
    public zzcn() {
        super("com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // com.google.android.gms.internal.ads.qh
    public final boolean u1(int i10, Parcel parcel, Parcel parcel2) throws RemoteException {
        dr crVar = null;
        switch (i10) {
            case 1:
                a aVarX1 = b.x1(parcel.readStrongBinder());
                zzr zzrVar = (zzr) rh.b(parcel, zzr.CREATOR);
                String string = parcel.readString();
                st stVarX1 = qt.x1(parcel.readStrongBinder());
                int i11 = parcel.readInt();
                rh.f(parcel);
                zzbu zzbuVarZzb = zzb(aVarX1, zzrVar, string, stVarX1, i11);
                parcel2.writeNoException();
                rh.e(parcel2, zzbuVarZzb);
                return true;
            case 2:
                a aVarX2 = b.x1(parcel.readStrongBinder());
                zzr zzrVar2 = (zzr) rh.b(parcel, zzr.CREATOR);
                String string2 = parcel.readString();
                st stVarX2 = qt.x1(parcel.readStrongBinder());
                int i12 = parcel.readInt();
                rh.f(parcel);
                zzbu zzbuVarZzc = zzc(aVarX2, zzrVar2, string2, stVarX2, i12);
                parcel2.writeNoException();
                rh.e(parcel2, zzbuVarZzc);
                return true;
            case 3:
                a aVarX3 = b.x1(parcel.readStrongBinder());
                String string3 = parcel.readString();
                st stVarX3 = qt.x1(parcel.readStrongBinder());
                int i13 = parcel.readInt();
                rh.f(parcel);
                zzbq zzbqVarZzd = zzd(aVarX3, string3, stVarX3, i13);
                parcel2.writeNoException();
                rh.e(parcel2, zzbqVarZzd);
                return true;
            case 4:
                b.x1(parcel.readStrongBinder());
                rh.f(parcel);
                parcel2.writeNoException();
                parcel2.writeStrongBinder(null);
                return true;
            case 5:
                a aVarX4 = b.x1(parcel.readStrongBinder());
                a aVarX5 = b.x1(parcel.readStrongBinder());
                rh.f(parcel);
                qo qoVarZze = zze(aVarX4, aVarX5);
                parcel2.writeNoException();
                rh.e(parcel2, qoVarZze);
                return true;
            case 6:
                a aVarX6 = b.x1(parcel.readStrongBinder());
                st stVarX4 = qt.x1(parcel.readStrongBinder());
                int i14 = parcel.readInt();
                rh.f(parcel);
                vx vxVarZzf = zzf(aVarX6, stVarX4, i14);
                parcel2.writeNoException();
                rh.e(parcel2, vxVarZzf);
                return true;
            case 7:
                b.x1(parcel.readStrongBinder());
                rh.f(parcel);
                parcel2.writeNoException();
                parcel2.writeStrongBinder(null);
                return true;
            case 8:
                a aVarX7 = b.x1(parcel.readStrongBinder());
                rh.f(parcel);
                hw hwVarZzg = zzg(aVarX7);
                parcel2.writeNoException();
                rh.e(parcel2, hwVarZzg);
                return true;
            case 9:
                a aVarX8 = b.x1(parcel.readStrongBinder());
                int i15 = parcel.readInt();
                rh.f(parcel);
                zzcy zzcyVarZzi = zzi(aVarX8, i15);
                parcel2.writeNoException();
                rh.e(parcel2, zzcyVarZzi);
                return true;
            case 10:
                a aVarX9 = b.x1(parcel.readStrongBinder());
                zzr zzrVar3 = (zzr) rh.b(parcel, zzr.CREATOR);
                String string4 = parcel.readString();
                int i16 = parcel.readInt();
                rh.f(parcel);
                zzbu zzbuVarZzj = zzj(aVarX9, zzrVar3, string4, i16);
                parcel2.writeNoException();
                rh.e(parcel2, zzbuVarZzj);
                return true;
            case 11:
                a aVarX10 = b.x1(parcel.readStrongBinder());
                a aVarX11 = b.x1(parcel.readStrongBinder());
                a aVarX12 = b.x1(parcel.readStrongBinder());
                rh.f(parcel);
                uo uoVarZzk = zzk(aVarX10, aVarX11, aVarX12);
                parcel2.writeNoException();
                rh.e(parcel2, uoVarZzk);
                return true;
            case 12:
                a aVarX13 = b.x1(parcel.readStrongBinder());
                String string5 = parcel.readString();
                st stVarX5 = qt.x1(parcel.readStrongBinder());
                int i17 = parcel.readInt();
                rh.f(parcel);
                iy iyVarZzl = zzl(aVarX13, string5, stVarX5, i17);
                parcel2.writeNoException();
                rh.e(parcel2, iyVarZzl);
                return true;
            case 13:
                a aVarX14 = b.x1(parcel.readStrongBinder());
                zzr zzrVar4 = (zzr) rh.b(parcel, zzr.CREATOR);
                String string6 = parcel.readString();
                st stVarX6 = qt.x1(parcel.readStrongBinder());
                int i18 = parcel.readInt();
                rh.f(parcel);
                zzbu zzbuVarZzm = zzm(aVarX14, zzrVar4, string6, stVarX6, i18);
                parcel2.writeNoException();
                rh.e(parcel2, zzbuVarZzm);
                return true;
            case 14:
                a aVarX15 = b.x1(parcel.readStrongBinder());
                st stVarX7 = qt.x1(parcel.readStrongBinder());
                int i19 = parcel.readInt();
                rh.f(parcel);
                tz tzVarZzn = zzn(aVarX15, stVarX7, i19);
                parcel2.writeNoException();
                rh.e(parcel2, tzVarZzn);
                return true;
            case 15:
                a aVarX16 = b.x1(parcel.readStrongBinder());
                st stVarX8 = qt.x1(parcel.readStrongBinder());
                int i20 = parcel.readInt();
                rh.f(parcel);
                aw awVarZzo = zzo(aVarX16, stVarX8, i20);
                parcel2.writeNoException();
                rh.e(parcel2, awVarZzo);
                return true;
            case 16:
                a aVarX17 = b.x1(parcel.readStrongBinder());
                st stVarX9 = qt.x1(parcel.readStrongBinder());
                int i21 = parcel.readInt();
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsEventListener");
                    crVar = iInterfaceQueryLocalInterface instanceof dr ? (dr) iInterfaceQueryLocalInterface : new cr(strongBinder, "com.google.android.gms.ads.internal.h5.client.IH5AdsEventListener");
                }
                rh.f(parcel);
                hr hrVarZzp = zzp(aVarX17, stVarX9, i21, crVar);
                parcel2.writeNoException();
                rh.e(parcel2, hrVarZzp);
                return true;
            case 17:
                a aVarX18 = b.x1(parcel.readStrongBinder());
                st stVarX10 = qt.x1(parcel.readStrongBinder());
                int i22 = parcel.readInt();
                rh.f(parcel);
                zzdt zzdtVarZzq = zzq(aVarX18, stVarX10, i22);
                parcel2.writeNoException();
                rh.e(parcel2, zzdtVarZzq);
                return true;
            case 18:
                a aVarX19 = b.x1(parcel.readStrongBinder());
                st stVarX11 = qt.x1(parcel.readStrongBinder());
                int i23 = parcel.readInt();
                rh.f(parcel);
                zzch zzchVarZzh = zzh(aVarX19, stVarX11, i23);
                parcel2.writeNoException();
                rh.e(parcel2, zzchVarZzh);
                return true;
            default:
                return false;
        }
    }
}
