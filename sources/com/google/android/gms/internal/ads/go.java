package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class go extends qh implements ho {
    public static ho x1(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
        return iInterfaceQueryLocalInterface instanceof ho ? (ho) iInterfaceQueryLocalInterface : new fo(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.qh
    public final boolean u1(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 == 2) {
            parcel2.writeNoException();
            parcel2.writeString(((wn) this).f21547a);
            return true;
        }
        if (i10 != 3) {
            return false;
        }
        parcel2.writeNoException();
        parcel2.writeList(((wn) this).f21549c);
        return true;
    }
}
