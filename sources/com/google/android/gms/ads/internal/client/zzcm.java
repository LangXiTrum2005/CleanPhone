package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.aw;
import com.google.android.gms.internal.ads.dr;
import com.google.android.gms.internal.ads.er;
import com.google.android.gms.internal.ads.fr;
import com.google.android.gms.internal.ads.gw;
import com.google.android.gms.internal.ads.hr;
import com.google.android.gms.internal.ads.hw;
import com.google.android.gms.internal.ads.hy;
import com.google.android.gms.internal.ads.iy;
import com.google.android.gms.internal.ads.ph;
import com.google.android.gms.internal.ads.po;
import com.google.android.gms.internal.ads.qo;
import com.google.android.gms.internal.ads.rh;
import com.google.android.gms.internal.ads.st;
import com.google.android.gms.internal.ads.sz;
import com.google.android.gms.internal.ads.tz;
import com.google.android.gms.internal.ads.uo;
import com.google.android.gms.internal.ads.vx;
import com.google.android.gms.internal.ads.yv;
import com.google.android.gms.internal.ads.zv;
import s9.a;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zzcm extends ph implements zzco {
    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbu zzb(a aVar, zzr zzrVar, String str, st stVar, int i10) throws RemoteException {
        zzbu zzbsVar;
        Parcel parcelQ = q();
        rh.e(parcelQ, aVar);
        rh.c(parcelQ, zzrVar);
        parcelQ.writeString(str);
        rh.e(parcelQ, stVar);
        parcelQ.writeInt(261710000);
        Parcel parcelR = r(parcelQ, 1);
        IBinder strongBinder = parcelR.readStrongBinder();
        if (strongBinder == null) {
            zzbsVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbsVar = iInterfaceQueryLocalInterface instanceof zzbu ? (zzbu) iInterfaceQueryLocalInterface : new zzbs(strongBinder);
        }
        parcelR.recycle();
        return zzbsVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbu zzc(a aVar, zzr zzrVar, String str, st stVar, int i10) throws RemoteException {
        zzbu zzbsVar;
        Parcel parcelQ = q();
        rh.e(parcelQ, aVar);
        rh.c(parcelQ, zzrVar);
        parcelQ.writeString(str);
        rh.e(parcelQ, stVar);
        parcelQ.writeInt(261710000);
        Parcel parcelR = r(parcelQ, 2);
        IBinder strongBinder = parcelR.readStrongBinder();
        if (strongBinder == null) {
            zzbsVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbsVar = iInterfaceQueryLocalInterface instanceof zzbu ? (zzbu) iInterfaceQueryLocalInterface : new zzbs(strongBinder);
        }
        parcelR.recycle();
        return zzbsVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbq zzd(a aVar, String str, st stVar, int i10) throws RemoteException {
        zzbq zzboVar;
        Parcel parcelQ = q();
        rh.e(parcelQ, aVar);
        parcelQ.writeString(str);
        rh.e(parcelQ, stVar);
        parcelQ.writeInt(261710000);
        Parcel parcelR = r(parcelQ, 3);
        IBinder strongBinder = parcelR.readStrongBinder();
        if (strongBinder == null) {
            zzboVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            zzboVar = iInterfaceQueryLocalInterface instanceof zzbq ? (zzbq) iInterfaceQueryLocalInterface : new zzbo(strongBinder);
        }
        parcelR.recycle();
        return zzboVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final qo zze(a aVar, a aVar2) throws RemoteException {
        Parcel parcelQ = q();
        rh.e(parcelQ, aVar);
        rh.e(parcelQ, aVar2);
        Parcel parcelR = r(parcelQ, 5);
        qo qoVarZzdG = po.zzdG(parcelR.readStrongBinder());
        parcelR.recycle();
        return qoVarZzdG;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final vx zzf(a aVar, st stVar, int i10) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final hw zzg(a aVar) throws RemoteException {
        Parcel parcelQ = q();
        rh.e(parcelQ, aVar);
        Parcel parcelR = r(parcelQ, 8);
        hw hwVarZzI = gw.zzI(parcelR.readStrongBinder());
        parcelR.recycle();
        return hwVarZzI;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzch zzh(a aVar, st stVar, int i10) throws RemoteException {
        zzch zzcfVar;
        Parcel parcelQ = q();
        rh.e(parcelQ, aVar);
        rh.e(parcelQ, stVar);
        parcelQ.writeInt(261710000);
        Parcel parcelR = r(parcelQ, 18);
        IBinder strongBinder = parcelR.readStrongBinder();
        if (strongBinder == null) {
            zzcfVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloader");
            zzcfVar = iInterfaceQueryLocalInterface instanceof zzch ? (zzch) iInterfaceQueryLocalInterface : new zzcf(strongBinder);
        }
        parcelR.recycle();
        return zzcfVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzcy zzi(a aVar, int i10) throws RemoteException {
        zzcy zzcwVar;
        Parcel parcelQ = q();
        rh.e(parcelQ, aVar);
        parcelQ.writeInt(261710000);
        Parcel parcelR = r(parcelQ, 9);
        IBinder strongBinder = parcelR.readStrongBinder();
        if (strongBinder == null) {
            zzcwVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            zzcwVar = iInterfaceQueryLocalInterface instanceof zzcy ? (zzcy) iInterfaceQueryLocalInterface : new zzcw(strongBinder);
        }
        parcelR.recycle();
        return zzcwVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbu zzj(a aVar, zzr zzrVar, String str, int i10) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final uo zzk(a aVar, a aVar2, a aVar3) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final iy zzl(a aVar, String str, st stVar, int i10) throws RemoteException {
        Parcel parcelQ = q();
        rh.e(parcelQ, aVar);
        parcelQ.writeString(str);
        rh.e(parcelQ, stVar);
        parcelQ.writeInt(261710000);
        Parcel parcelR = r(parcelQ, 12);
        iy iyVarZzt = hy.zzt(parcelR.readStrongBinder());
        parcelR.recycle();
        return iyVarZzt;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbu zzm(a aVar, zzr zzrVar, String str, st stVar, int i10) throws RemoteException {
        zzbu zzbsVar;
        Parcel parcelQ = q();
        rh.e(parcelQ, aVar);
        rh.c(parcelQ, zzrVar);
        parcelQ.writeString(str);
        rh.e(parcelQ, stVar);
        parcelQ.writeInt(261710000);
        Parcel parcelR = r(parcelQ, 13);
        IBinder strongBinder = parcelR.readStrongBinder();
        if (strongBinder == null) {
            zzbsVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbsVar = iInterfaceQueryLocalInterface instanceof zzbu ? (zzbu) iInterfaceQueryLocalInterface : new zzbs(strongBinder);
        }
        parcelR.recycle();
        return zzbsVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final tz zzn(a aVar, st stVar, int i10) throws RemoteException {
        Parcel parcelQ = q();
        rh.e(parcelQ, aVar);
        rh.e(parcelQ, stVar);
        parcelQ.writeInt(261710000);
        Parcel parcelR = r(parcelQ, 14);
        tz tzVarZzb = sz.zzb(parcelR.readStrongBinder());
        parcelR.recycle();
        return tzVarZzb;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final aw zzo(a aVar, st stVar, int i10) throws RemoteException {
        aw yvVar;
        Parcel parcelQ = q();
        rh.e(parcelQ, aVar);
        rh.e(parcelQ, stVar);
        parcelQ.writeInt(261710000);
        Parcel parcelR = r(parcelQ, 15);
        IBinder strongBinder = parcelR.readStrongBinder();
        int i11 = zv.f22723a;
        if (strongBinder == null) {
            yvVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
            yvVar = iInterfaceQueryLocalInterface instanceof aw ? (aw) iInterfaceQueryLocalInterface : new yv(strongBinder);
        }
        parcelR.recycle();
        return yvVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final hr zzp(a aVar, st stVar, int i10, dr drVar) throws RemoteException {
        hr erVar;
        Parcel parcelQ = q();
        rh.e(parcelQ, aVar);
        rh.e(parcelQ, stVar);
        parcelQ.writeInt(261710000);
        rh.e(parcelQ, drVar);
        Parcel parcelR = r(parcelQ, 16);
        IBinder strongBinder = parcelR.readStrongBinder();
        int i11 = fr.f14516a;
        if (strongBinder == null) {
            erVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
            erVar = iInterfaceQueryLocalInterface instanceof hr ? (hr) iInterfaceQueryLocalInterface : new er(strongBinder);
        }
        parcelR.recycle();
        return erVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzdt zzq(a aVar, st stVar, int i10) throws RemoteException {
        zzdt zzdrVar;
        Parcel parcelQ = q();
        rh.e(parcelQ, aVar);
        rh.e(parcelQ, stVar);
        parcelQ.writeInt(261710000);
        Parcel parcelR = r(parcelQ, 17);
        IBinder strongBinder = parcelR.readStrongBinder();
        if (strongBinder == null) {
            zzdrVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTester");
            zzdrVar = iInterfaceQueryLocalInterface instanceof zzdt ? (zzdt) iInterfaceQueryLocalInterface : new zzdr(strongBinder);
        }
        parcelR.recycle();
        return zzdrVar;
    }
}
