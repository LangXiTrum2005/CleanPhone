package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.applovin.impl.Z;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbjw extends zzbcb implements zzbjy {
    public zzbjw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    @Override // com.google.android.gms.internal.ads.zzbjy
    public final IObjectWrapper zzb() throws RemoteException {
        return Z.j(zzcZ(1, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbjy
    public final Uri zzc() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(2, zza());
        Uri uri = (Uri) zzbcd.zzb(parcelZzcZ, Uri.CREATOR);
        parcelZzcZ.recycle();
        return uri;
    }

    @Override // com.google.android.gms.internal.ads.zzbjy
    public final double zzd() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(3, zza());
        double d = parcelZzcZ.readDouble();
        parcelZzcZ.recycle();
        return d;
    }

    @Override // com.google.android.gms.internal.ads.zzbjy
    public final int zze() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(4, zza());
        int i2 = parcelZzcZ.readInt();
        parcelZzcZ.recycle();
        return i2;
    }

    @Override // com.google.android.gms.internal.ads.zzbjy
    public final int zzf() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(5, zza());
        int i2 = parcelZzcZ.readInt();
        parcelZzcZ.recycle();
        return i2;
    }

    @Override // com.google.android.gms.internal.ads.zzbjy
    public final Map zzg() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(6, zza());
        HashMap mapZzg = zzbcd.zzg(parcelZzcZ);
        parcelZzcZ.recycle();
        return mapZzg;
    }
}
