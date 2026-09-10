package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.qh;
import com.google.android.gms.internal.ads.rh;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzca extends qh implements zzcb {
    public zzca() {
        super("com.google.android.gms.ads.internal.client.IAdPreloadCallback");
    }

    @Override // com.google.android.gms.internal.ads.qh
    public final boolean u1(int i10, Parcel parcel, Parcel parcel2) throws RemoteException {
        if (i10 == 1) {
            zzfp zzfpVar = (zzfp) rh.b(parcel, zzfp.CREATOR);
            rh.f(parcel);
            zze(zzfpVar);
        } else {
            if (i10 != 2) {
                return false;
            }
            zzfp zzfpVar2 = (zzfp) rh.b(parcel, zzfp.CREATOR);
            rh.f(parcel);
            zzf(zzfpVar2);
        }
        parcel2.writeNoException();
        return true;
    }
}
