package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.qh;
import com.google.android.gms.internal.ads.rh;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzbm extends qh implements zzbn {
    public zzbm() {
        super("com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override // com.google.android.gms.internal.ads.qh
    public final boolean u1(int i10, Parcel parcel, Parcel parcel2) throws RemoteException {
        if (i10 == 1) {
            zzm zzmVar = (zzm) rh.b(parcel, zzm.CREATOR);
            rh.f(parcel);
            zze(zzmVar);
            parcel2.writeNoException();
            return true;
        }
        if (i10 == 2) {
            String strZzf = zzf();
            parcel2.writeNoException();
            parcel2.writeString(strZzf);
            return true;
        }
        if (i10 == 3) {
            boolean zZzg = zzg();
            parcel2.writeNoException();
            ClassLoader classLoader = rh.f19590a;
            parcel2.writeInt(zZzg ? 1 : 0);
            return true;
        }
        if (i10 == 4) {
            String strZzh = zzh();
            parcel2.writeNoException();
            parcel2.writeString(strZzh);
            return true;
        }
        if (i10 != 5) {
            return false;
        }
        zzm zzmVar2 = (zzm) rh.b(parcel, zzm.CREATOR);
        int i11 = parcel.readInt();
        rh.f(parcel);
        zzi(zzmVar2, i11);
        parcel2.writeNoException();
        return true;
    }
}
