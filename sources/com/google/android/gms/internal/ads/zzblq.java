package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.applovin.impl.Z;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class zzblq extends zzbcb implements zzbls {
    public zzblq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbls
    public final boolean zzA() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(24, zza());
        boolean zZza = zzbcd.zza(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.ads.zzbls
    public final void zzB(com.google.android.gms.ads.internal.client.zzdj zzdjVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbcd.zze(parcelZza, zzdjVar);
        zzda(25, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbls
    public final void zzC(com.google.android.gms.ads.internal.client.zzdf zzdfVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbcd.zze(parcelZza, zzdfVar);
        zzda(26, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbls
    public final void zzD() throws RemoteException {
        zzda(27, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbls
    public final void zzE() throws RemoteException {
        zzda(28, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbls
    public final zzbjv zzF() throws RemoteException {
        zzbjv zzbjtVar;
        Parcel parcelZzcZ = zzcZ(29, zza());
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            zzbjtVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
            zzbjtVar = iInterfaceQueryLocalInterface instanceof zzbjv ? (zzbjv) iInterfaceQueryLocalInterface : new zzbjt(strongBinder);
        }
        parcelZzcZ.recycle();
        return zzbjtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbls
    public final boolean zzG() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(30, zza());
        boolean zZza = zzbcd.zza(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.ads.zzbls
    public final com.google.android.gms.ads.internal.client.zzea zzH() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(31, zza());
        com.google.android.gms.ads.internal.client.zzea zzeaVarZzb = com.google.android.gms.ads.internal.client.zzdz.zzb(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzeaVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbls
    public final void zzI(com.google.android.gms.ads.internal.client.zzdt zzdtVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbcd.zze(parcelZza, zzdtVar);
        zzda(32, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbls
    public final void zzJ(Bundle bundle) throws RemoteException {
        Parcel parcelZza = zza();
        zzbcd.zzc(parcelZza, bundle);
        zzda(33, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbls
    public final long zzK() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(34, zza());
        long j = parcelZzcZ.readLong();
        parcelZzcZ.recycle();
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzbls
    public final void zzL(long j) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeLong(j);
        zzda(35, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbls
    public final String zze() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(2, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbls
    public final List zzf() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(3, zza());
        ArrayList arrayListZzf = zzbcd.zzf(parcelZzcZ);
        parcelZzcZ.recycle();
        return arrayListZzf;
    }

    @Override // com.google.android.gms.internal.ads.zzbls
    public final String zzg() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(4, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbls
    public final zzbjy zzh() throws RemoteException {
        zzbjy zzbjwVar;
        Parcel parcelZzcZ = zzcZ(5, zza());
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            zzbjwVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            zzbjwVar = iInterfaceQueryLocalInterface instanceof zzbjy ? (zzbjy) iInterfaceQueryLocalInterface : new zzbjw(strongBinder);
        }
        parcelZzcZ.recycle();
        return zzbjwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbls
    public final String zzi() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(6, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbls
    public final String zzj() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(7, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbls
    public final double zzk() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(8, zza());
        double d = parcelZzcZ.readDouble();
        parcelZzcZ.recycle();
        return d;
    }

    @Override // com.google.android.gms.internal.ads.zzbls
    public final String zzl() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(9, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbls
    public final String zzm() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(10, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbls
    public final com.google.android.gms.ads.internal.client.zzed zzn() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(11, zza());
        com.google.android.gms.ads.internal.client.zzed zzedVarZzb = com.google.android.gms.ads.internal.client.zzec.zzb(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzedVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbls
    public final String zzo() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbls
    public final void zzp() throws RemoteException {
        zzda(13, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbls
    public final zzbjr zzq() throws RemoteException {
        zzbjr zzbjpVar;
        Parcel parcelZzcZ = zzcZ(14, zza());
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            zzbjpVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
            zzbjpVar = iInterfaceQueryLocalInterface instanceof zzbjr ? (zzbjr) iInterfaceQueryLocalInterface : new zzbjp(strongBinder);
        }
        parcelZzcZ.recycle();
        return zzbjpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbls
    public final void zzr(Bundle bundle) throws RemoteException {
        Parcel parcelZza = zza();
        zzbcd.zzc(parcelZza, bundle);
        zzda(15, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbls
    public final boolean zzs(Bundle bundle) throws RemoteException {
        Parcel parcelZza = zza();
        zzbcd.zzc(parcelZza, bundle);
        Parcel parcelZzcZ = zzcZ(16, parcelZza);
        boolean zZza = zzbcd.zza(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.ads.zzbls
    public final void zzt(Bundle bundle) throws RemoteException {
        Parcel parcelZza = zza();
        zzbcd.zzc(parcelZza, bundle);
        zzda(17, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbls
    public final IObjectWrapper zzu() throws RemoteException {
        return Z.j(zzcZ(18, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbls
    public final IObjectWrapper zzv() throws RemoteException {
        return Z.j(zzcZ(19, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbls
    public final Bundle zzw() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(20, zza());
        Bundle bundle = (Bundle) zzbcd.zzb(parcelZzcZ, Bundle.CREATOR);
        parcelZzcZ.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzbls
    public final void zzx(zzblp zzblpVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbcd.zze(parcelZza, zzblpVar);
        zzda(21, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbls
    public final void zzy() throws RemoteException {
        zzda(22, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbls
    public final List zzz() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(23, zza());
        ArrayList arrayListZzf = zzbcd.zzf(parcelZzcZ);
        parcelZzcZ.recycle();
        return arrayListZzf;
    }
}
