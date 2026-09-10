package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.hy;
import com.google.android.gms.internal.ads.iy;
import com.google.android.gms.internal.ads.m70;
import com.google.android.gms.internal.ads.ph;
import com.google.android.gms.internal.ads.rh;
import com.google.android.gms.internal.ads.st;
import com.google.android.gms.internal.ads.vi;
import com.google.android.gms.internal.ads.wi;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zzcf extends ph implements zzch {
    public zzcf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdPreloader");
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final void zze(List list, zzcb zzcbVar) throws RemoteException {
        Parcel parcelQ = q();
        parcelQ.writeTypedList(list);
        rh.e(parcelQ, zzcbVar);
        m0(parcelQ, 1);
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final boolean zzf(String str) throws RemoteException {
        Parcel parcelQ = q();
        parcelQ.writeString(str);
        Parcel parcelR = r(parcelQ, 2);
        ClassLoader classLoader = rh.f19590a;
        boolean z10 = parcelR.readInt() != 0;
        parcelR.recycle();
        return z10;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final iy zzg(String str) throws RemoteException {
        Parcel parcelQ = q();
        parcelQ.writeString(str);
        Parcel parcelR = r(parcelQ, 3);
        iy iyVarZzt = hy.zzt(parcelR.readStrongBinder());
        parcelR.recycle();
        return iyVarZzt;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final boolean zzh(String str) throws RemoteException {
        Parcel parcelQ = q();
        parcelQ.writeString(str);
        Parcel parcelR = r(parcelQ, 4);
        ClassLoader classLoader = rh.f19590a;
        boolean z10 = parcelR.readInt() != 0;
        parcelR.recycle();
        return z10;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final wi zzi(String str) throws RemoteException {
        wi viVar;
        Parcel parcelQ = q();
        parcelQ.writeString(str);
        Parcel parcelR = r(parcelQ, 5);
        IBinder strongBinder = parcelR.readStrongBinder();
        int i10 = m70.f17318f;
        if (strongBinder == null) {
            viVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
            viVar = iInterfaceQueryLocalInterface instanceof wi ? (wi) iInterfaceQueryLocalInterface : new vi(strongBinder);
        }
        parcelR.recycle();
        return viVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final boolean zzj(String str) throws RemoteException {
        Parcel parcelQ = q();
        parcelQ.writeString(str);
        Parcel parcelR = r(parcelQ, 6);
        ClassLoader classLoader = rh.f19590a;
        boolean z10 = parcelR.readInt() != 0;
        parcelR.recycle();
        return z10;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final zzbu zzk(String str) throws RemoteException {
        zzbu zzbsVar;
        Parcel parcelQ = q();
        parcelQ.writeString(str);
        Parcel parcelR = r(parcelQ, 7);
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

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final void zzl(st stVar) throws RemoteException {
        Parcel parcelQ = q();
        rh.e(parcelQ, stVar);
        m0(parcelQ, 8);
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final boolean zzm(String str, zzfp zzfpVar, zzce zzceVar) throws RemoteException {
        Parcel parcelQ = q();
        parcelQ.writeString(str);
        rh.c(parcelQ, zzfpVar);
        rh.e(parcelQ, zzceVar);
        Parcel parcelR = r(parcelQ, 9);
        boolean z10 = parcelR.readInt() != 0;
        parcelR.recycle();
        return z10;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final boolean zzn(int i10, String str) throws RemoteException {
        Parcel parcelQ = q();
        parcelQ.writeInt(i10);
        parcelQ.writeString(str);
        Parcel parcelR = r(parcelQ, 10);
        ClassLoader classLoader = rh.f19590a;
        boolean z10 = parcelR.readInt() != 0;
        parcelR.recycle();
        return z10;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final zzbu zzo(String str) throws RemoteException {
        zzbu zzbsVar;
        Parcel parcelQ = q();
        parcelQ.writeString(str);
        Parcel parcelR = r(parcelQ, 11);
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

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final wi zzp(String str) throws RemoteException {
        wi viVar;
        Parcel parcelQ = q();
        parcelQ.writeString(str);
        Parcel parcelR = r(parcelQ, 12);
        IBinder strongBinder = parcelR.readStrongBinder();
        int i10 = m70.f17318f;
        if (strongBinder == null) {
            viVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
            viVar = iInterfaceQueryLocalInterface instanceof wi ? (wi) iInterfaceQueryLocalInterface : new vi(strongBinder);
        }
        parcelR.recycle();
        return viVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final iy zzq(String str) throws RemoteException {
        Parcel parcelQ = q();
        parcelQ.writeString(str);
        Parcel parcelR = r(parcelQ, 13);
        iy iyVarZzt = hy.zzt(parcelR.readStrongBinder());
        parcelR.recycle();
        return iyVarZzt;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final zzfp zzr(int i10, String str) throws RemoteException {
        Parcel parcelQ = q();
        parcelQ.writeInt(i10);
        parcelQ.writeString(str);
        Parcel parcelR = r(parcelQ, 14);
        zzfp zzfpVar = (zzfp) rh.b(parcelR, zzfp.CREATOR);
        parcelR.recycle();
        return zzfpVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final Bundle zzs(int i10) throws RemoteException {
        Parcel parcelQ = q();
        parcelQ.writeInt(i10);
        Parcel parcelR = r(parcelQ, 15);
        Bundle bundle = (Bundle) rh.b(parcelR, Bundle.CREATOR);
        parcelR.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final int zzt(int i10, String str) throws RemoteException {
        Parcel parcelQ = q();
        parcelQ.writeInt(i10);
        parcelQ.writeString(str);
        Parcel parcelR = r(parcelQ, 16);
        int i11 = parcelR.readInt();
        parcelR.recycle();
        return i11;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final boolean zzu(int i10, String str) throws RemoteException {
        Parcel parcelQ = q();
        parcelQ.writeInt(i10);
        parcelQ.writeString(str);
        Parcel parcelR = r(parcelQ, 17);
        ClassLoader classLoader = rh.f19590a;
        boolean z10 = parcelR.readInt() != 0;
        parcelR.recycle();
        return z10;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final void zzv(int i10) throws RemoteException {
        Parcel parcelQ = q();
        parcelQ.writeInt(i10);
        m0(parcelQ, 18);
    }
}
