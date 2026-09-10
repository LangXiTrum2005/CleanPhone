package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzbth extends zzbcc implements zzbti {
    public zzbth() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
    }

    public static zzbti zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
        return iInterfaceQueryLocalInterface instanceof zzbti ? (zzbti) iInterfaceQueryLocalInterface : new zzbtg(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbcc
    public final boolean zzdd(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 == 1) {
            IObjectWrapper iObjectWrapperZze = zze();
            parcel2.writeNoException();
            zzbcd.zze(parcel2, iObjectWrapperZze);
        } else {
            if (i2 != 2) {
                return false;
            }
            boolean zZzf = zzf();
            parcel2.writeNoException();
            int i4 = zzbcd.zza;
            parcel2.writeInt(zZzf ? 1 : 0);
        }
        return true;
    }
}
