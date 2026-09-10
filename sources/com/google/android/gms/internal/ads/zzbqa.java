package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzbqa extends zzbcc implements zzbqb {
    public zzbqa() {
        super("com.google.android.gms.ads.internal.instream.client.IInstreamAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbcc
    public final boolean zzdd(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        zzbqe zzbqcVar;
        if (i2 == 3) {
            com.google.android.gms.ads.internal.client.zzed zzedVarZzb = zzb();
            parcel2.writeNoException();
            zzbcd.zze(parcel2, zzedVarZzb);
            return true;
        }
        if (i2 == 4) {
            zzc();
            parcel2.writeNoException();
            return true;
        }
        if (i2 == 5) {
            IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                zzbqcVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
                zzbqcVar = iInterfaceQueryLocalInterface instanceof zzbqe ? (zzbqe) iInterfaceQueryLocalInterface : new zzbqc(strongBinder);
            }
            zzbcd.zzh(parcel);
            zzd(iObjectWrapperAsInterface, zzbqcVar);
            parcel2.writeNoException();
            return true;
        }
        if (i2 == 6) {
            IObjectWrapper iObjectWrapperAsInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            zzbcd.zzh(parcel);
            zze(iObjectWrapperAsInterface2);
            parcel2.writeNoException();
            return true;
        }
        if (i2 != 7) {
            return false;
        }
        zzbjv zzbjvVarZzf = zzf();
        parcel2.writeNoException();
        zzbcd.zze(parcel2, zzbjvVarZzf);
        return true;
    }
}
