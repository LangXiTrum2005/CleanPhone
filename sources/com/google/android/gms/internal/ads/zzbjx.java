package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzbjx extends zzbcc implements zzbjy {
    public zzbjx() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    public static zzbjy zzh(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
        return iInterfaceQueryLocalInterface instanceof zzbjy ? (zzbjy) iInterfaceQueryLocalInterface : new zzbjw(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbcc
    public final boolean zzdd(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        switch (i2) {
            case 1:
                IObjectWrapper iObjectWrapperZzb = zzb();
                parcel2.writeNoException();
                zzbcd.zze(parcel2, iObjectWrapperZzb);
                return true;
            case 2:
                Uri uriZzc = zzc();
                parcel2.writeNoException();
                zzbcd.zzd(parcel2, uriZzc);
                return true;
            case 3:
                double dZzd = zzd();
                parcel2.writeNoException();
                parcel2.writeDouble(dZzd);
                return true;
            case 4:
                int iZze = zze();
                parcel2.writeNoException();
                parcel2.writeInt(iZze);
                return true;
            case 5:
                int iZzf = zzf();
                parcel2.writeNoException();
                parcel2.writeInt(iZzf);
                return true;
            case 6:
                Map mapZzg = zzg();
                parcel2.writeNoException();
                parcel2.writeMap(mapZzg);
                return true;
            default:
                return false;
        }
    }
}
