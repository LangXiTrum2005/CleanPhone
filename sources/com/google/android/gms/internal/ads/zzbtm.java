package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.applovin.impl.Z;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbtm extends zzbcb implements zzbto {
    public zzbtm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    @Override // com.google.android.gms.internal.ads.zzbto
    public final float zzA() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(24, zza());
        float f = parcelZzcZ.readFloat();
        parcelZzcZ.recycle();
        return f;
    }

    @Override // com.google.android.gms.internal.ads.zzbto
    public final float zzB() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(25, zza());
        float f = parcelZzcZ.readFloat();
        parcelZzcZ.recycle();
        return f;
    }

    @Override // com.google.android.gms.internal.ads.zzbto
    public final void zzC() throws RemoteException {
        zzda(26, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbto
    public final String zze() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(2, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbto
    public final List zzf() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(3, zza());
        ArrayList arrayListZzf = zzbcd.zzf(parcelZzcZ);
        parcelZzcZ.recycle();
        return arrayListZzf;
    }

    @Override // com.google.android.gms.internal.ads.zzbto
    public final String zzg() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(4, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbto
    public final zzbjy zzh() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(5, zza());
        zzbjy zzbjyVarZzh = zzbjx.zzh(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzbjyVarZzh;
    }

    @Override // com.google.android.gms.internal.ads.zzbto
    public final String zzi() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(6, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbto
    public final String zzj() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(7, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbto
    public final double zzk() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(8, zza());
        double d = parcelZzcZ.readDouble();
        parcelZzcZ.recycle();
        return d;
    }

    @Override // com.google.android.gms.internal.ads.zzbto
    public final String zzl() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(9, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbto
    public final String zzm() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(10, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbto
    public final com.google.android.gms.ads.internal.client.zzed zzn() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(11, zza());
        com.google.android.gms.ads.internal.client.zzed zzedVarZzb = com.google.android.gms.ads.internal.client.zzec.zzb(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzedVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbto
    public final zzbjr zzo() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(12, zza());
        zzbjr zzbjrVarZzj = zzbjq.zzj(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzbjrVarZzj;
    }

    @Override // com.google.android.gms.internal.ads.zzbto
    public final IObjectWrapper zzp() throws RemoteException {
        return Z.j(zzcZ(13, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbto
    public final IObjectWrapper zzq() throws RemoteException {
        return Z.j(zzcZ(14, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbto
    public final IObjectWrapper zzr() throws RemoteException {
        return Z.j(zzcZ(15, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbto
    public final Bundle zzs() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(16, zza());
        Bundle bundle = (Bundle) zzbcd.zzb(parcelZzcZ, Bundle.CREATOR);
        parcelZzcZ.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzbto
    public final boolean zzt() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(17, zza());
        boolean zZza = zzbcd.zza(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.ads.zzbto
    public final boolean zzu() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(18, zza());
        boolean zZza = zzbcd.zza(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.ads.zzbto
    public final void zzv() throws RemoteException {
        zzda(19, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbto
    public final void zzw(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzbcd.zze(parcelZza, iObjectWrapper);
        zzda(20, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbto
    public final void zzx(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel parcelZza = zza();
        zzbcd.zze(parcelZza, iObjectWrapper);
        zzbcd.zze(parcelZza, iObjectWrapper2);
        zzbcd.zze(parcelZza, iObjectWrapper3);
        zzda(21, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbto
    public final void zzy(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzbcd.zze(parcelZza, iObjectWrapper);
        zzda(22, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbto
    public final float zzz() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(23, zza());
        float f = parcelZzcZ.readFloat();
        parcelZzcZ.recycle();
        return f;
    }
}
