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
public final class zzbtk extends zzbcb implements IInterface {
    public zzbtk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
    }

    public final String zze() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(2, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    public final List zzf() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(3, zza());
        ArrayList arrayListZzf = zzbcd.zzf(parcelZzcZ);
        parcelZzcZ.recycle();
        return arrayListZzf;
    }

    public final String zzg() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(4, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    public final zzbjy zzh() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(5, zza());
        zzbjy zzbjyVarZzh = zzbjx.zzh(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzbjyVarZzh;
    }

    public final String zzi() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(6, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    public final double zzj() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(7, zza());
        double d = parcelZzcZ.readDouble();
        parcelZzcZ.recycle();
        return d;
    }

    public final String zzk() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(8, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    public final String zzl() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(9, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    public final void zzm() throws RemoteException {
        zzda(10, zza());
    }

    public final void zzn(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzbcd.zze(parcelZza, iObjectWrapper);
        zzda(11, parcelZza);
    }

    public final void zzo(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzbcd.zze(parcelZza, iObjectWrapper);
        zzda(12, parcelZza);
    }

    public final boolean zzp() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(13, zza());
        boolean zZza = zzbcd.zza(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZza;
    }

    public final boolean zzq() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(14, zza());
        boolean zZza = zzbcd.zza(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZza;
    }

    public final Bundle zzr() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(15, zza());
        Bundle bundle = (Bundle) zzbcd.zzb(parcelZzcZ, Bundle.CREATOR);
        parcelZzcZ.recycle();
        return bundle;
    }

    public final void zzs(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzbcd.zze(parcelZza, iObjectWrapper);
        zzda(16, parcelZza);
    }

    public final com.google.android.gms.ads.internal.client.zzed zzt() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(17, zza());
        com.google.android.gms.ads.internal.client.zzed zzedVarZzb = com.google.android.gms.ads.internal.client.zzec.zzb(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzedVarZzb;
    }

    public final IObjectWrapper zzu() throws RemoteException {
        return Z.j(zzcZ(18, zza()));
    }

    public final zzbjr zzv() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(19, zza());
        zzbjr zzbjrVarZzj = zzbjq.zzj(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzbjrVarZzj;
    }

    public final IObjectWrapper zzw() throws RemoteException {
        return Z.j(zzcZ(20, zza()));
    }

    public final IObjectWrapper zzx() throws RemoteException {
        return Z.j(zzcZ(21, zza()));
    }

    public final void zzy(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel parcelZza = zza();
        zzbcd.zze(parcelZza, iObjectWrapper);
        zzbcd.zze(parcelZza, iObjectWrapper2);
        zzbcd.zze(parcelZza, iObjectWrapper3);
        zzda(22, parcelZza);
    }
}
