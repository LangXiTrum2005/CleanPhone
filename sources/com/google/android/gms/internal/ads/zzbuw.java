package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbuw extends zzbcb implements zzbuy {
    public zzbuw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzbuy
    public final void zze(IObjectWrapper iObjectWrapper, String str, Bundle bundle, Bundle bundle2, com.google.android.gms.ads.internal.client.zzr zzrVar, zzbvb zzbvbVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbcd.zze(parcelZza, iObjectWrapper);
        parcelZza.writeString(str);
        zzbcd.zzc(parcelZza, bundle);
        zzbcd.zzc(parcelZza, bundle2);
        zzbcd.zzc(parcelZza, zzrVar);
        zzbcd.zze(parcelZza, zzbvbVar);
        zzda(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbuy
    public final zzbvn zzf() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(2, zza());
        zzbvn zzbvnVar = (zzbvn) zzbcd.zzb(parcelZzcZ, zzbvn.CREATOR);
        parcelZzcZ.recycle();
        return zzbvnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbuy
    public final zzbvn zzg() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(3, zza());
        zzbvn zzbvnVar = (zzbvn) zzbcd.zzb(parcelZzcZ, zzbvn.CREATOR);
        parcelZzcZ.recycle();
        return zzbvnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbuy
    public final com.google.android.gms.ads.internal.client.zzed zzh() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(5, zza());
        com.google.android.gms.ads.internal.client.zzed zzedVarZzb = com.google.android.gms.ads.internal.client.zzec.zzb(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzedVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbuy
    public final void zzi(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbum zzbumVar, zzbtf zzbtfVar, com.google.android.gms.ads.internal.client.zzr zzrVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzbcd.zzc(parcelZza, zzmVar);
        zzbcd.zze(parcelZza, iObjectWrapper);
        zzbcd.zze(parcelZza, zzbumVar);
        zzbcd.zze(parcelZza, zzbtfVar);
        zzbcd.zzc(parcelZza, zzrVar);
        zzda(13, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbuy
    public final void zzj(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbup zzbupVar, zzbtf zzbtfVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzbcd.zzc(parcelZza, zzmVar);
        zzbcd.zze(parcelZza, iObjectWrapper);
        zzbcd.zze(parcelZza, zzbupVar);
        zzbcd.zze(parcelZza, zzbtfVar);
        zzda(14, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbuy
    public final boolean zzk(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzbcd.zze(parcelZza, iObjectWrapper);
        Parcel parcelZzcZ = zzcZ(15, parcelZza);
        boolean zZza = zzbcd.zza(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.ads.zzbuy
    public final void zzl(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbuv zzbuvVar, zzbtf zzbtfVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzbcd.zzc(parcelZza, zzmVar);
        zzbcd.zze(parcelZza, iObjectWrapper);
        zzbcd.zze(parcelZza, zzbuvVar);
        zzbcd.zze(parcelZza, zzbtfVar);
        zzda(16, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbuy
    public final boolean zzm(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzbcd.zze(parcelZza, iObjectWrapper);
        Parcel parcelZzcZ = zzcZ(17, parcelZza);
        boolean zZza = zzbcd.zza(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.ads.zzbuy
    public final void zzn(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbus zzbusVar, zzbtf zzbtfVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzbcd.zzc(parcelZza, zzmVar);
        zzbcd.zze(parcelZza, iObjectWrapper);
        zzbcd.zze(parcelZza, zzbusVar);
        zzbcd.zze(parcelZza, zzbtfVar);
        zzda(18, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbuy
    public final void zzo(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzda(19, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbuy
    public final void zzp(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbuv zzbuvVar, zzbtf zzbtfVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzbcd.zzc(parcelZza, zzmVar);
        zzbcd.zze(parcelZza, iObjectWrapper);
        zzbcd.zze(parcelZza, zzbuvVar);
        zzbcd.zze(parcelZza, zzbtfVar);
        zzda(20, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbuy
    public final void zzq(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbum zzbumVar, zzbtf zzbtfVar, com.google.android.gms.ads.internal.client.zzr zzrVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzbcd.zzc(parcelZza, zzmVar);
        zzbcd.zze(parcelZza, iObjectWrapper);
        zzbcd.zze(parcelZza, zzbumVar);
        zzbcd.zze(parcelZza, zzbtfVar);
        zzbcd.zzc(parcelZza, zzrVar);
        zzda(21, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbuy
    public final void zzr(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbus zzbusVar, zzbtf zzbtfVar, zzbjn zzbjnVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzbcd.zzc(parcelZza, zzmVar);
        zzbcd.zze(parcelZza, iObjectWrapper);
        zzbcd.zze(parcelZza, zzbusVar);
        zzbcd.zze(parcelZza, zzbtfVar);
        zzbcd.zzc(parcelZza, zzbjnVar);
        zzda(22, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbuy
    public final void zzs(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbuj zzbujVar, zzbtf zzbtfVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzbcd.zzc(parcelZza, zzmVar);
        zzbcd.zze(parcelZza, iObjectWrapper);
        zzbcd.zze(parcelZza, zzbujVar);
        zzbcd.zze(parcelZza, zzbtfVar);
        zzda(23, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbuy
    public final boolean zzt(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzbcd.zze(parcelZza, iObjectWrapper);
        Parcel parcelZzcZ = zzcZ(24, parcelZza);
        boolean zZza = zzbcd.zza(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZza;
    }
}
