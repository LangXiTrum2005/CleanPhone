package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import qk.i0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfs implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iO0 = i0.o0(parcel);
        int iD0 = 0;
        int iD1 = 0;
        while (parcel.dataPosition() < iO0) {
            int i10 = parcel.readInt();
            char c4 = (char) i10;
            if (c4 == 1) {
                iD0 = i0.d0(parcel, i10);
            } else if (c4 != 2) {
                i0.l0(parcel, i10);
            } else {
                iD1 = i0.d0(parcel, i10);
            }
        }
        i0.D(parcel, iO0);
        return new zzfr(iD0, iD1);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzfr[i10];
    }
}
