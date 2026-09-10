package com.google.android.gms.ads.internal.client;

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
        String strV = null;
        String strV2 = null;
        zze zzeVar = null;
        IBinder iBinderC0 = null;
        int iD0 = 0;
        while (parcel.dataPosition() < iO0) {
            int i10 = parcel.readInt();
            char c4 = (char) i10;
            if (c4 == 1) {
                iD0 = i0.d0(parcel, i10);
            } else if (c4 == 2) {
                strV = i0.v(parcel, i10);
            } else if (c4 == 3) {
                strV2 = i0.v(parcel, i10);
            } else if (c4 == 4) {
                zzeVar = (zze) i0.s(parcel, i10, zze.CREATOR);
            } else if (c4 != 5) {
                i0.l0(parcel, i10);
            } else {
                iBinderC0 = i0.c0(parcel, i10);
            }
        }
        i0.D(parcel, iO0);
        return new zze(iD0, strV, strV2, zzeVar, iBinderC0);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zze[i10];
    }
}
