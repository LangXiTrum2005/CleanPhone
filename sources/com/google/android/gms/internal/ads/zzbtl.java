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
public final class zzbtl extends zzbcb implements IInterface {
    public zzbtl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
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

    public final String zzj() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(7, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    public final void zzk() throws RemoteException {
        zzda(8, zza());
    }

    public final void zzl(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzbcd.zze(parcelZza, iObjectWrapper);
        zzda(9, parcelZza);
    }

    public final void zzm(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzbcd.zze(parcelZza, iObjectWrapper);
        zzda(10, parcelZza);
    }

    public final boolean zzn() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(11, zza());
        boolean zZza = zzbcd.zza(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZza;
    }

    public final boolean zzo() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(12, zza());
        boolean zZza = zzbcd.zza(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZza;
    }

    public final Bundle zzp() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(13, zza());
        Bundle bundle = (Bundle) zzbcd.zzb(parcelZzcZ, Bundle.CREATOR);
        parcelZzcZ.recycle();
        return bundle;
    }

    public final void zzq(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzbcd.zze(parcelZza, iObjectWrapper);
        zzda(14, parcelZza);
    }

    public final IObjectWrapper zzr() throws RemoteException {
        return Z.j(zzcZ(15, zza()));
    }

    public final com.google.android.gms.ads.internal.client.zzed zzs() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(16, zza());
        com.google.android.gms.ads.internal.client.zzed zzedVarZzb = com.google.android.gms.ads.internal.client.zzec.zzb(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzedVarZzb;
    }

    public final zzbjr zzt() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(19, zza());
        zzbjr zzbjrVarZzj = zzbjq.zzj(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzbjrVarZzj;
    }

    public final IObjectWrapper zzu() throws RemoteException {
        return Z.j(zzcZ(20, zza()));
    }

    public final IObjectWrapper zzv() throws RemoteException {
        return Z.j(zzcZ(21, zza()));
    }

    public final void zzw(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel parcelZza = zza();
        zzbcd.zze(parcelZza, iObjectWrapper);
        zzbcd.zze(parcelZza, iObjectWrapper2);
        zzbcd.zze(parcelZza, iObjectWrapper3);
        zzda(22, parcelZza);
    }
}
