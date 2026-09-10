package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.applovin.impl.Z;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes3.dex */
public final class zzp extends com.google.android.gms.internal.common.zza implements IInterface {
    public zzp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final IObjectWrapper zze(IObjectWrapper iObjectWrapper, String str, int i2) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.common.zzc.zze(parcelZza, iObjectWrapper);
        parcelZza.writeString(str);
        parcelZza.writeInt(i2);
        return Z.j(zzB(2, parcelZza));
    }

    public final int zzf(IObjectWrapper iObjectWrapper, String str, boolean z2) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.common.zzc.zze(parcelZza, iObjectWrapper);
        parcelZza.writeString(str);
        parcelZza.writeInt(z2 ? 1 : 0);
        Parcel parcelZzB = zzB(3, parcelZza);
        int i2 = parcelZzB.readInt();
        parcelZzB.recycle();
        return i2;
    }

    public final IObjectWrapper zzg(IObjectWrapper iObjectWrapper, String str, int i2) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.common.zzc.zze(parcelZza, iObjectWrapper);
        parcelZza.writeString(str);
        parcelZza.writeInt(i2);
        return Z.j(zzB(4, parcelZza));
    }

    public final int zzh(IObjectWrapper iObjectWrapper, String str, boolean z2) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.common.zzc.zze(parcelZza, iObjectWrapper);
        parcelZza.writeString(str);
        parcelZza.writeInt(z2 ? 1 : 0);
        Parcel parcelZzB = zzB(5, parcelZza);
        int i2 = parcelZzB.readInt();
        parcelZzB.recycle();
        return i2;
    }

    public final int zzi() throws RemoteException {
        Parcel parcelZzB = zzB(6, zza());
        int i2 = parcelZzB.readInt();
        parcelZzB.recycle();
        return i2;
    }

    public final IObjectWrapper zzj(IObjectWrapper iObjectWrapper, String str, boolean z2, long j) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.common.zzc.zze(parcelZza, iObjectWrapper);
        parcelZza.writeString(str);
        parcelZza.writeInt(z2 ? 1 : 0);
        parcelZza.writeLong(j);
        return Z.j(zzB(7, parcelZza));
    }

    public final IObjectWrapper zzk(IObjectWrapper iObjectWrapper, String str, int i2, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.common.zzc.zze(parcelZza, iObjectWrapper);
        parcelZza.writeString(str);
        parcelZza.writeInt(i2);
        com.google.android.gms.internal.common.zzc.zze(parcelZza, iObjectWrapper2);
        return Z.j(zzB(8, parcelZza));
    }
}
