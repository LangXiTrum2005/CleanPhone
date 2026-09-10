package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import qk.i0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zzw implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iO0 = i0.o0(parcel);
        String strV = null;
        zze zzeVar = null;
        Bundle bundleN = null;
        String strV2 = null;
        String strV3 = null;
        String strV4 = null;
        String strV5 = null;
        long jE0 = 0;
        while (parcel.dataPosition() < iO0) {
            int i10 = parcel.readInt();
            switch ((char) i10) {
                case 1:
                    strV = i0.v(parcel, i10);
                    break;
                case 2:
                    jE0 = i0.e0(parcel, i10);
                    break;
                case 3:
                    zzeVar = (zze) i0.s(parcel, i10, zze.CREATOR);
                    break;
                case 4:
                    bundleN = i0.n(parcel, i10);
                    break;
                case 5:
                    strV2 = i0.v(parcel, i10);
                    break;
                case 6:
                    strV3 = i0.v(parcel, i10);
                    break;
                case 7:
                    strV4 = i0.v(parcel, i10);
                    break;
                case '\b':
                    strV5 = i0.v(parcel, i10);
                    break;
                default:
                    i0.l0(parcel, i10);
                    break;
            }
        }
        i0.D(parcel, iO0);
        return new zzv(strV, jE0, zzeVar, bundleN, strV2, strV3, strV4, strV5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzv[i10];
    }
}
