package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzdm;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.client.zzdp;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzdx;
import com.google.android.gms.ads.internal.client.zzm;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class hy extends qh implements iy {
    public hy() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    public static iy zzt(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
        return iInterfaceQueryLocalInterface instanceof iy ? (iy) iInterfaceQueryLocalInterface : new gy(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.qh
    public final boolean u1(int i10, Parcel parcel, Parcel parcel2) {
        py nyVar = null;
        py nyVar2 = null;
        qy qyVar = null;
        ly jyVar = null;
        switch (i10) {
            case 1:
                zzm zzmVar = (zzm) rh.b(parcel, zzm.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    nyVar = iInterfaceQueryLocalInterface instanceof py ? (py) iInterfaceQueryLocalInterface : new ny(strongBinder);
                }
                rh.f(parcel);
                zzc(zzmVar, nyVar);
                parcel2.writeNoException();
                return true;
            case 2:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
                    jyVar = iInterfaceQueryLocalInterface2 instanceof ly ? (ly) iInterfaceQueryLocalInterface2 : new jy(strongBinder2, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
                }
                rh.f(parcel);
                zze(jyVar);
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zZzi = zzi();
                parcel2.writeNoException();
                ClassLoader classLoader = rh.f19590a;
                parcel2.writeInt(zZzi ? 1 : 0);
                return true;
            case 4:
                String strZzj = zzj();
                parcel2.writeNoException();
                parcel2.writeString(strZzj);
                return true;
            case 5:
                s9.a aVarX1 = s9.b.x1(parcel.readStrongBinder());
                rh.f(parcel);
                zzb(aVarX1);
                parcel2.writeNoException();
                return true;
            case 6:
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
                    qyVar = iInterfaceQueryLocalInterface3 instanceof qy ? (qy) iInterfaceQueryLocalInterface3 : new qy(strongBinder3, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
                }
                rh.f(parcel);
                zzs(qyVar);
                parcel2.writeNoException();
                return true;
            case 7:
                vy vyVar = (vy) rh.b(parcel, vy.CREATOR);
                rh.f(parcel);
                zzh(vyVar);
                parcel2.writeNoException();
                return true;
            case 8:
                zzdn zzdnVarZzb = zzdm.zzb(parcel.readStrongBinder());
                rh.f(parcel);
                zzf(zzdnVarZzb);
                parcel2.writeNoException();
                return true;
            case 9:
                Bundle bundleZzg = zzg();
                parcel2.writeNoException();
                rh.d(parcel2, bundleZzg);
                return true;
            case 10:
                s9.a aVarX2 = s9.b.x1(parcel.readStrongBinder());
                ClassLoader classLoader2 = rh.f19590a;
                boolean z10 = parcel.readInt() != 0;
                rh.f(parcel);
                zzk(aVarX2, z10);
                parcel2.writeNoException();
                return true;
            case 11:
                fy fyVarZzl = zzl();
                parcel2.writeNoException();
                rh.e(parcel2, fyVarZzl);
                return true;
            case 12:
                zzdx zzdxVarZzm = zzm();
                parcel2.writeNoException();
                rh.e(parcel2, zzdxVarZzm);
                return true;
            case 13:
                zzdq zzdqVarZzb = zzdp.zzb(parcel.readStrongBinder());
                rh.f(parcel);
                zzo(zzdqVarZzb);
                parcel2.writeNoException();
                return true;
            case 14:
                zzm zzmVar2 = (zzm) rh.b(parcel, zzm.CREATOR);
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    nyVar2 = iInterfaceQueryLocalInterface4 instanceof py ? (py) iInterfaceQueryLocalInterface4 : new ny(strongBinder4);
                }
                rh.f(parcel);
                zzd(zzmVar2, nyVar2);
                parcel2.writeNoException();
                return true;
            case 15:
                boolean zA = rh.a(parcel);
                rh.f(parcel);
                zzp(zA);
                parcel2.writeNoException();
                return true;
            case 16:
                String strZzn = zzn();
                parcel2.writeNoException();
                parcel2.writeString(strZzn);
                return true;
            case 17:
                long jZzq = zzq();
                parcel2.writeNoException();
                parcel2.writeLong(jZzq);
                return true;
            case 18:
                long j10 = parcel.readLong();
                rh.f(parcel);
                zzr(j10);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
