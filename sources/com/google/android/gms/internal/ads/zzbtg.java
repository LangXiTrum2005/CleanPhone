package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.applovin.impl.Z;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbtg extends zzbcb implements zzbti {
    public zzbtg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbti
    public final IObjectWrapper zze() throws RemoteException {
        return Z.j(zzcZ(1, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbti
    public final boolean zzf() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(2, zza());
        boolean zZza = zzbcd.zza(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZza;
    }
}
