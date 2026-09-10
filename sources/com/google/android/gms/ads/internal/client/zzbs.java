package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.applovin.impl.ca;
import com.google.android.gms.internal.ads.jm;
import com.google.android.gms.internal.ads.nw;
import com.google.android.gms.internal.ads.ph;
import com.google.android.gms.internal.ads.pw;
import com.google.android.gms.internal.ads.rh;
import com.google.android.gms.internal.ads.xx;
import com.google.android.gms.internal.ads.zi;
import s9.a;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbs extends ph implements zzbu {
    public zzbs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManager");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final boolean zzA() throws RemoteException {
        Parcel parcelR = r(q(), 46);
        ClassLoader classLoader = rh.f19590a;
        boolean z10 = parcelR.readInt() != 0;
        parcelR.recycle();
        return z10;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final boolean zzB() throws RemoteException {
        Parcel parcelR = r(q(), 23);
        ClassLoader classLoader = rh.f19590a;
        boolean z10 = parcelR.readInt() != 0;
        parcelR.recycle();
        return z10;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzC(xx xxVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzD(String str) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzE(String str) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final zzea zzF() throws RemoteException {
        zzea zzdyVar;
        Parcel parcelR = r(q(), 26);
        IBinder strongBinder = parcelR.readStrongBinder();
        if (strongBinder == null) {
            zzdyVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
            zzdyVar = iInterfaceQueryLocalInterface instanceof zzea ? (zzea) iInterfaceQueryLocalInterface : new zzdy(strongBinder);
        }
        parcelR.recycle();
        return zzdyVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzG(zzfw zzfwVar) throws RemoteException {
        Parcel parcelQ = q();
        rh.c(parcelQ, zzfwVar);
        m0(parcelQ, 29);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzH(zzee zzeeVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzI(zzx zzxVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzJ(zi ziVar) throws RemoteException {
        Parcel parcelQ = q();
        rh.e(parcelQ, ziVar);
        m0(parcelQ, 40);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzK(boolean z10) throws RemoteException {
        Parcel parcelQ = q();
        ClassLoader classLoader = rh.f19590a;
        parcelQ.writeInt(z10 ? 1 : 0);
        m0(parcelQ, 34);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzP(zzdq zzdqVar) throws RemoteException {
        Parcel parcelQ = q();
        rh.e(parcelQ, zzdqVar);
        m0(parcelQ, 42);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzQ(zzm zzmVar, zzbk zzbkVar) throws RemoteException {
        Parcel parcelQ = q();
        rh.c(parcelQ, zzmVar);
        rh.e(parcelQ, zzbkVar);
        m0(parcelQ, 43);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzR(a aVar) throws RemoteException {
        Parcel parcelQ = q();
        rh.e(parcelQ, aVar);
        m0(parcelQ, 44);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzS(zzcs zzcsVar) throws RemoteException {
        Parcel parcelQ = q();
        rh.e(parcelQ, zzcsVar);
        m0(parcelQ, 45);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzT(long j10) throws RemoteException {
        Parcel parcelQ = q();
        parcelQ.writeLong(j10);
        m0(parcelQ, 48);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final long zzU() throws RemoteException {
        Parcel parcelR = r(q(), 47);
        long j10 = parcelR.readLong();
        parcelR.recycle();
        return j10;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzY(zzcp zzcpVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final a zzb() throws RemoteException {
        return ca.o(r(q(), 1));
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzc() throws RemoteException {
        m0(q(), 2);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final boolean zzd() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzdS(zzbh zzbhVar) throws RemoteException {
        Parcel parcelQ = q();
        rh.e(parcelQ, zzbhVar);
        m0(parcelQ, 7);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final boolean zze(zzm zzmVar) throws RemoteException {
        Parcel parcelQ = q();
        rh.c(parcelQ, zzmVar);
        Parcel parcelR = r(parcelQ, 4);
        boolean z10 = parcelR.readInt() != 0;
        parcelR.recycle();
        return z10;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzf() throws RemoteException {
        m0(q(), 5);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzg() throws RemoteException {
        m0(q(), 6);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzi(zzcl zzclVar) throws RemoteException {
        Parcel parcelQ = q();
        rh.e(parcelQ, zzclVar);
        m0(parcelQ, 8);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzj(zzby zzbyVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final Bundle zzk() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzl() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzm() throws RemoteException {
        m0(q(), 11);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final zzr zzn() throws RemoteException {
        Parcel parcelR = r(q(), 12);
        zzr zzrVar = (zzr) rh.b(parcelR, zzr.CREATOR);
        parcelR.recycle();
        return zzrVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzo(zzr zzrVar) throws RemoteException {
        Parcel parcelQ = q();
        rh.c(parcelQ, zzrVar);
        m0(parcelQ, 13);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzp(nw nwVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzq(pw pwVar, String str) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final String zzr() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final String zzs() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final zzdx zzt() throws RemoteException {
        zzdx zzdvVar;
        Parcel parcelR = r(q(), 41);
        IBinder strongBinder = parcelR.readStrongBinder();
        if (strongBinder == null) {
            zzdvVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
            zzdvVar = iInterfaceQueryLocalInterface instanceof zzdx ? (zzdx) iInterfaceQueryLocalInterface : new zzdv(strongBinder);
        }
        parcelR.recycle();
        return zzdvVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final String zzu() throws RemoteException {
        Parcel parcelR = r(q(), 31);
        String string = parcelR.readString();
        parcelR.recycle();
        return string;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final zzcl zzv() throws RemoteException {
        zzcl zzcjVar;
        Parcel parcelR = r(q(), 32);
        IBinder strongBinder = parcelR.readStrongBinder();
        if (strongBinder == null) {
            zzcjVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
            zzcjVar = iInterfaceQueryLocalInterface instanceof zzcl ? (zzcl) iInterfaceQueryLocalInterface : new zzcj(strongBinder);
        }
        parcelR.recycle();
        return zzcjVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final zzbh zzw() throws RemoteException {
        zzbh zzbfVar;
        Parcel parcelR = r(q(), 33);
        IBinder strongBinder = parcelR.readStrongBinder();
        if (strongBinder == null) {
            zzbfVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
            zzbfVar = iInterfaceQueryLocalInterface instanceof zzbh ? (zzbh) iInterfaceQueryLocalInterface : new zzbf(strongBinder);
        }
        parcelR.recycle();
        return zzbfVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzx(jm jmVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzy(zzbe zzbeVar) throws RemoteException {
        Parcel parcelQ = q();
        rh.e(parcelQ, zzbeVar);
        m0(parcelQ, 20);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzz(boolean z10) throws RemoteException {
        Parcel parcelQ = q();
        ClassLoader classLoader = rh.f19590a;
        parcelQ.writeInt(z10 ? 1 : 0);
        m0(parcelQ, 22);
    }
}
