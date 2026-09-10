package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.qh;
import com.google.android.gms.internal.ads.rh;
import s9.a;
import s9.b;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzds extends qh implements zzdt {
    public zzds() {
        super("com.google.android.gms.ads.internal.client.IOutOfContextTester");
    }

    @Override // com.google.android.gms.internal.ads.qh
    public final boolean u1(int i10, Parcel parcel, Parcel parcel2) throws RemoteException {
        if (i10 != 1) {
            return false;
        }
        String string = parcel.readString();
        a aVarX1 = b.x1(parcel.readStrongBinder());
        a aVarX2 = b.x1(parcel.readStrongBinder());
        rh.f(parcel);
        zze(string, aVarX1, aVarX2);
        parcel2.writeNoException();
        return true;
    }
}
