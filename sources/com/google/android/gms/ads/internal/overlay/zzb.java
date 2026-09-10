package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import qk.i0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zzb implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iO0 = i0.o0(parcel);
        String strV = null;
        String strV2 = null;
        String strV3 = null;
        String strV4 = null;
        String strV5 = null;
        String strV6 = null;
        String strV7 = null;
        Intent intent = null;
        IBinder iBinderC0 = null;
        Bundle bundleN = null;
        boolean zA0 = false;
        while (parcel.dataPosition() < iO0) {
            int i10 = parcel.readInt();
            switch ((char) i10) {
                case 2:
                    strV = i0.v(parcel, i10);
                    break;
                case 3:
                    strV2 = i0.v(parcel, i10);
                    break;
                case 4:
                    strV3 = i0.v(parcel, i10);
                    break;
                case 5:
                    strV4 = i0.v(parcel, i10);
                    break;
                case 6:
                    strV5 = i0.v(parcel, i10);
                    break;
                case 7:
                    strV6 = i0.v(parcel, i10);
                    break;
                case '\b':
                    strV7 = i0.v(parcel, i10);
                    break;
                case '\t':
                    intent = (Intent) i0.s(parcel, i10, Intent.CREATOR);
                    break;
                case '\n':
                    iBinderC0 = i0.c0(parcel, i10);
                    break;
                case 11:
                    zA0 = i0.a0(parcel, i10);
                    break;
                case '\f':
                    bundleN = i0.n(parcel, i10);
                    break;
                default:
                    i0.l0(parcel, i10);
                    break;
            }
        }
        i0.D(parcel, iO0);
        return new zzc(strV, strV2, strV3, strV4, strV5, strV6, strV7, intent, iBinderC0, zA0, bundleN);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzc[i10];
    }
}
