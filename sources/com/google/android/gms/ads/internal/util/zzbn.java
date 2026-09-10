package com.google.android.gms.ads.internal.util;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.qh;
import com.google.android.gms.internal.ads.rh;
import s9.a;
import s9.b;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzbn extends qh implements zzbo {
    public zzbn() {
        super("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
    }

    @Override // com.google.android.gms.internal.ads.qh
    public final boolean u1(int i10, Parcel parcel, Parcel parcel2) throws RemoteException {
        if (i10 == 1) {
            a aVarX1 = b.x1(parcel.readStrongBinder());
            String string = parcel.readString();
            String string2 = parcel.readString();
            rh.f(parcel);
            boolean zZze = zze(aVarX1, string, string2);
            parcel2.writeNoException();
            parcel2.writeInt(zZze ? 1 : 0);
            return true;
        }
        if (i10 == 2) {
            a aVarX2 = b.x1(parcel.readStrongBinder());
            rh.f(parcel);
            zzf(aVarX2);
            parcel2.writeNoException();
            return true;
        }
        if (i10 != 3) {
            return false;
        }
        a aVarX3 = b.x1(parcel.readStrongBinder());
        com.google.android.gms.ads.internal.offline.buffering.zza zzaVar = (com.google.android.gms.ads.internal.offline.buffering.zza) rh.b(parcel, com.google.android.gms.ads.internal.offline.buffering.zza.CREATOR);
        rh.f(parcel);
        boolean zZzg = zzg(aVarX3, zzaVar);
        parcel2.writeNoException();
        parcel2.writeInt(zZzg ? 1 : 0);
        return true;
    }
}
