package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzbec extends zzbcc implements zzbed {
    public zzbec() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    public static zzbed zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
        return iInterfaceQueryLocalInterface instanceof zzbed ? (zzbed) iInterfaceQueryLocalInterface : new zzbeb(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbcc
    public final boolean zzdd(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        zzbek zzbeiVar;
        switch (i2) {
            case 2:
                com.google.android.gms.ads.internal.client.zzbx zzbxVarZze = zze();
                parcel2.writeNoException();
                zzbcd.zze(parcel2, zzbxVarZze);
                return true;
            case 3:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    boolean z2 = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdPresentationCallback") instanceof zzbeh;
                }
                zzbcd.zzh(parcel);
                parcel2.writeNoException();
                return true;
            case 4:
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 == null) {
                    zzbeiVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
                    zzbeiVar = iInterfaceQueryLocalInterface instanceof zzbek ? (zzbek) iInterfaceQueryLocalInterface : new zzbei(strongBinder2);
                }
                zzbcd.zzh(parcel);
                zzf(iObjectWrapperAsInterface, zzbeiVar);
                parcel2.writeNoException();
                return true;
            case 5:
                com.google.android.gms.ads.internal.client.zzea zzeaVarZzg = zzg();
                parcel2.writeNoException();
                zzbcd.zze(parcel2, zzeaVarZzg);
                return true;
            case 6:
                boolean zZza = zzbcd.zza(parcel);
                zzbcd.zzh(parcel);
                zzh(zZza);
                parcel2.writeNoException();
                return true;
            case 7:
                com.google.android.gms.ads.internal.client.zzdt zzdtVarZzb = com.google.android.gms.ads.internal.client.zzds.zzb(parcel.readStrongBinder());
                zzbcd.zzh(parcel);
                zzi(zzdtVarZzb);
                parcel2.writeNoException();
                return true;
            case 8:
                String strZzj = zzj();
                parcel2.writeNoException();
                parcel2.writeString(strZzj);
                return true;
            case 9:
                long jZzk = zzk();
                parcel2.writeNoException();
                parcel2.writeLong(jZzk);
                return true;
            case 10:
                long j = parcel.readLong();
                zzbcd.zzh(parcel);
                zzl(j);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
