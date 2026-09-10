package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbtd extends zzbcb implements zzbtf {
    public zzbtd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final void zze() throws RemoteException {
        zzda(1, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final void zzf() throws RemoteException {
        zzda(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final void zzg(int i2) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i2);
        zzda(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final void zzh() throws RemoteException {
        zzda(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final void zzi() throws RemoteException {
        zzda(5, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final void zzj() throws RemoteException {
        zzda(6, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final void zzk() throws RemoteException {
        zzda(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final void zzl(String str, String str2) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzda(9, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final void zzm(zzbks zzbksVar, String str) throws RemoteException {
        Parcel parcelZza = zza();
        zzbcd.zze(parcelZza, zzbksVar);
        parcelZza.writeString(str);
        zzda(10, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final void zzn() throws RemoteException {
        zzda(11, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final void zzo() throws RemoteException {
        zzda(13, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final void zzp(zzbzy zzbzyVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final void zzq() throws RemoteException {
        zzda(15, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final void zzr(zzcac zzcacVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbcd.zze(parcelZza, zzcacVar);
        zzda(16, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final void zzs(int i2) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final void zzt() throws RemoteException {
        zzda(18, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final void zzu() throws RemoteException {
        zzda(20, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final void zzv(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzda(21, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final void zzw(int i2, String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i2);
        parcelZza.writeString(str);
        zzda(22, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final void zzx(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbcd.zzc(parcelZza, zzeVar);
        zzda(23, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final void zzy(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbcd.zzc(parcelZza, zzeVar);
        zzda(24, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final void zzz() throws RemoteException {
        zzda(25, zza());
    }
}
