package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.applovin.impl.Z;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes3.dex */
public final class zzq extends com.google.android.gms.internal.common.zza implements IInterface {
    public zzq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    public final IObjectWrapper zze(IObjectWrapper iObjectWrapper, String str, int i2, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.common.zzc.zze(parcelZza, iObjectWrapper);
        parcelZza.writeString(str);
        parcelZza.writeInt(i2);
        com.google.android.gms.internal.common.zzc.zze(parcelZza, iObjectWrapper2);
        return Z.j(zzB(2, parcelZza));
    }

    public final IObjectWrapper zzf(IObjectWrapper iObjectWrapper, String str, int i2, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.common.zzc.zze(parcelZza, iObjectWrapper);
        parcelZza.writeString(str);
        parcelZza.writeInt(i2);
        com.google.android.gms.internal.common.zzc.zze(parcelZza, iObjectWrapper2);
        return Z.j(zzB(3, parcelZza));
    }
}
