package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import qk.i0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfq implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iO0 = i0.o0(parcel);
        int iD0 = 0;
        int iD1 = 0;
        boolean zA0 = false;
        String strV = null;
        zzm zzmVar = null;
        while (parcel.dataPosition() < iO0) {
            int i10 = parcel.readInt();
            char c4 = (char) i10;
            if (c4 == 1) {
                strV = i0.v(parcel, i10);
            } else if (c4 == 2) {
                iD0 = i0.d0(parcel, i10);
            } else if (c4 == 3) {
                zzmVar = (zzm) i0.s(parcel, i10, zzm.CREATOR);
            } else if (c4 == 4) {
                iD1 = i0.d0(parcel, i10);
            } else if (c4 != 5) {
                i0.l0(parcel, i10);
            } else {
                zA0 = i0.a0(parcel, i10);
            }
        }
        i0.D(parcel, iO0);
        return new zzfp(strV, iD0, zzmVar, iD1, zA0);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzfp[i10];
    }
}
