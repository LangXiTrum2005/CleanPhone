package com.google.android.gms.ads.internal;

import android.os.Parcel;
import android.os.Parcelable;
import qk.i0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zzm implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iO0 = i0.o0(parcel);
        boolean zA0 = false;
        boolean zA1 = false;
        boolean zA2 = false;
        int iD0 = 0;
        boolean zA3 = false;
        boolean zA4 = false;
        boolean zA5 = false;
        float f10 = 0.0f;
        String strV = null;
        while (parcel.dataPosition() < iO0) {
            int i10 = parcel.readInt();
            switch ((char) i10) {
                case 2:
                    zA0 = i0.a0(parcel, i10);
                    break;
                case 3:
                    zA1 = i0.a0(parcel, i10);
                    break;
                case 4:
                    strV = i0.v(parcel, i10);
                    break;
                case 5:
                    zA2 = i0.a0(parcel, i10);
                    break;
                case 6:
                    i0.r0(parcel, i10, 4);
                    f10 = parcel.readFloat();
                    break;
                case 7:
                    iD0 = i0.d0(parcel, i10);
                    break;
                case '\b':
                    zA3 = i0.a0(parcel, i10);
                    break;
                case '\t':
                    zA4 = i0.a0(parcel, i10);
                    break;
                case '\n':
                    zA5 = i0.a0(parcel, i10);
                    break;
                default:
                    i0.l0(parcel, i10);
                    break;
            }
        }
        i0.D(parcel, iO0);
        return new zzl(zA0, zA1, strV, zA2, f10, iD0, zA3, zA4, zA5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzl[i10];
    }
}
