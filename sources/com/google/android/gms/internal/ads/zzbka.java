package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.applovin.impl.Z;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbka extends zzbcb implements zzbkc {
    public zzbka(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    @Override // com.google.android.gms.internal.ads.zzbkc
    public final void zzb(String str, IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzbcd.zze(parcelZza, iObjectWrapper);
        zzda(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbkc
    public final IObjectWrapper zzc(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        return Z.j(zzcZ(2, parcelZza));
    }

    @Override // com.google.android.gms.internal.ads.zzbkc
    public final void zzd(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzbcd.zze(parcelZza, iObjectWrapper);
        zzda(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbkc
    public final void zzdB(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzbcd.zze(parcelZza, iObjectWrapper);
        zzda(9, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbkc
    public final void zzdC(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzbcd.zze(parcelZza, iObjectWrapper);
        zzda(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbkc
    public final void zzdD(zzbjv zzbjvVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbcd.zze(parcelZza, zzbjvVar);
        zzda(8, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbkc
    public final void zze() throws RemoteException {
        zzda(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbkc
    public final void zzf(IObjectWrapper iObjectWrapper, int i2) throws RemoteException {
        Parcel parcelZza = zza();
        zzbcd.zze(parcelZza, iObjectWrapper);
        parcelZza.writeInt(i2);
        zzda(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbkc
    public final void zzg(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzbcd.zze(parcelZza, iObjectWrapper);
        zzda(6, parcelZza);
    }
}
