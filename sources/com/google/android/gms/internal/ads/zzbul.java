package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzbul extends zzbcc implements zzbum {
    public zzbul() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbcc
    public final boolean zzdd(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 == 1) {
            IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            zzbcd.zzh(parcel);
            zze(iObjectWrapperAsInterface);
        } else if (i2 == 2) {
            String string = parcel.readString();
            zzbcd.zzh(parcel);
            zzf(string);
        } else if (i2 == 3) {
            com.google.android.gms.ads.internal.client.zze zzeVar = (com.google.android.gms.ads.internal.client.zze) zzbcd.zzb(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR);
            zzbcd.zzh(parcel);
            zzg(zzeVar);
        } else {
            if (i2 != 4) {
                return false;
            }
            zzbti zzbtiVarZzb = zzbth.zzb(parcel.readStrongBinder());
            zzbcd.zzh(parcel);
            zzh(zzbtiVarZzb);
        }
        parcel2.writeNoException();
        return true;
    }
}
