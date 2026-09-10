package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.ph;
import com.google.android.gms.internal.ads.rh;
import com.google.android.gms.internal.ads.st;
import com.google.android.gms.internal.ads.tr;
import com.google.android.gms.internal.ads.yr;
import java.util.ArrayList;
import java.util.List;
import s9.a;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zzcw extends ph implements zzcy {
    public zzcw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zze() throws RemoteException {
        m0(q(), 1);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzf(float f10) throws RemoteException {
        Parcel parcelQ = q();
        parcelQ.writeFloat(f10);
        m0(parcelQ, 2);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzg(String str) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzh(boolean z10) throws RemoteException {
        Parcel parcelQ = q();
        ClassLoader classLoader = rh.f19590a;
        parcelQ.writeInt(z10 ? 1 : 0);
        m0(parcelQ, 4);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzi(a aVar, String str) throws RemoteException {
        Parcel parcelQ = q();
        rh.e(parcelQ, aVar);
        parcelQ.writeString(str);
        m0(parcelQ, 5);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzj(String str, a aVar) throws RemoteException {
        Parcel parcelQ = q();
        parcelQ.writeString(null);
        rh.e(parcelQ, aVar);
        m0(parcelQ, 6);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final float zzk() throws RemoteException {
        Parcel parcelR = r(q(), 7);
        float f10 = parcelR.readFloat();
        parcelR.recycle();
        return f10;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final boolean zzl() throws RemoteException {
        Parcel parcelR = r(q(), 8);
        ClassLoader classLoader = rh.f19590a;
        boolean z10 = parcelR.readInt() != 0;
        parcelR.recycle();
        return z10;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final String zzm() throws RemoteException {
        Parcel parcelR = r(q(), 9);
        String string = parcelR.readString();
        parcelR.recycle();
        return string;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzn(String str) throws RemoteException {
        Parcel parcelQ = q();
        parcelQ.writeString(str);
        m0(parcelQ, 10);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzo(st stVar) throws RemoteException {
        Parcel parcelQ = q();
        rh.e(parcelQ, stVar);
        m0(parcelQ, 11);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzp(yr yrVar) throws RemoteException {
        Parcel parcelQ = q();
        rh.e(parcelQ, yrVar);
        m0(parcelQ, 12);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final List zzq() throws RemoteException {
        Parcel parcelR = r(q(), 13);
        ArrayList arrayListCreateTypedArrayList = parcelR.createTypedArrayList(tr.CREATOR);
        parcelR.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzr(zzfr zzfrVar) throws RemoteException {
        Parcel parcelQ = q();
        rh.c(parcelQ, zzfrVar);
        m0(parcelQ, 14);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzs() throws RemoteException {
        m0(q(), 15);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzt(zzdk zzdkVar) throws RemoteException {
        Parcel parcelQ = q();
        rh.e(parcelQ, zzdkVar);
        m0(parcelQ, 16);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzu(boolean z10) throws RemoteException {
        Parcel parcelQ = q();
        ClassLoader classLoader = rh.f19590a;
        parcelQ.writeInt(z10 ? 1 : 0);
        m0(parcelQ, 17);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzv(String str) throws RemoteException {
        Parcel parcelQ = q();
        parcelQ.writeString(str);
        m0(parcelQ, 18);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzw() throws RemoteException {
        m0(q(), 19);
    }
}
