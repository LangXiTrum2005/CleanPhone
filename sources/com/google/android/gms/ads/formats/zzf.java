package com.google.android.gms.ads.formats;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import qk.i0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zzf implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iO0 = i0.o0(parcel);
        IBinder iBinderC0 = null;
        boolean zA0 = false;
        IBinder iBinderC1 = null;
        while (parcel.dataPosition() < iO0) {
            int i10 = parcel.readInt();
            char c4 = (char) i10;
            if (c4 == 1) {
                zA0 = i0.a0(parcel, i10);
            } else if (c4 == 2) {
                iBinderC0 = i0.c0(parcel, i10);
            } else if (c4 != 3) {
                i0.l0(parcel, i10);
            } else {
                iBinderC1 = i0.c0(parcel, i10);
            }
        }
        i0.D(parcel, iO0);
        return new PublisherAdViewOptions(zA0, iBinderC0, iBinderC1);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new PublisherAdViewOptions[i10];
    }
}
