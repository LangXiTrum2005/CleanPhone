package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iO0 = qk.i0.o0(parcel);
        String strV = null;
        int iD0 = 0;
        while (parcel.dataPosition() < iO0) {
            int i10 = parcel.readInt();
            char c4 = (char) i10;
            if (c4 == 1) {
                iD0 = qk.i0.d0(parcel, i10);
            } else if (c4 != 2) {
                qk.i0.l0(parcel, i10);
            } else {
                strV = qk.i0.v(parcel, i10);
            }
        }
        qk.i0.D(parcel, iO0);
        return new d(iD0, strV);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new d[i10];
    }
}
