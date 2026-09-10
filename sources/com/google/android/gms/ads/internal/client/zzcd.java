package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.qh;
import com.google.android.gms.internal.ads.rh;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzcd extends qh implements zzce {
    public zzcd() {
        super("com.google.android.gms.ads.internal.client.IAdPreloadCallbackV2");
    }

    @Override // com.google.android.gms.internal.ads.qh
    public final boolean u1(int i10, Parcel parcel, Parcel parcel2) throws RemoteException {
        zzdx zzdvVar;
        if (i10 == 1) {
            String string = parcel.readString();
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                zzdvVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
                zzdvVar = iInterfaceQueryLocalInterface instanceof zzdx ? (zzdx) iInterfaceQueryLocalInterface : new zzdv(strongBinder);
            }
            rh.f(parcel);
            zze(string, zzdvVar);
        } else if (i10 == 2) {
            String string2 = parcel.readString();
            rh.f(parcel);
            zzf(string2);
        } else {
            if (i10 != 3) {
                return false;
            }
            String string3 = parcel.readString();
            zze zzeVar = (zze) rh.b(parcel, zze.CREATOR);
            rh.f(parcel);
            zzg(string3, zzeVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
