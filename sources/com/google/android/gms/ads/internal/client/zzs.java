package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import qk.i0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zzs implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iO0 = i0.o0(parcel);
        int iD0 = 0;
        int iD1 = 0;
        boolean zA0 = false;
        int iD2 = 0;
        int iD3 = 0;
        boolean zA1 = false;
        boolean zA2 = false;
        boolean zA3 = false;
        boolean zA4 = false;
        boolean zA5 = false;
        boolean zA6 = false;
        boolean zA7 = false;
        boolean zA8 = false;
        boolean zA9 = false;
        String strV = null;
        zzr[] zzrVarArr = null;
        while (parcel.dataPosition() < iO0) {
            int i10 = parcel.readInt();
            switch ((char) i10) {
                case 2:
                    strV = i0.v(parcel, i10);
                    break;
                case 3:
                    iD0 = i0.d0(parcel, i10);
                    break;
                case 4:
                    iD1 = i0.d0(parcel, i10);
                    break;
                case 5:
                    zA0 = i0.a0(parcel, i10);
                    break;
                case 6:
                    iD2 = i0.d0(parcel, i10);
                    break;
                case 7:
                    iD3 = i0.d0(parcel, i10);
                    break;
                case '\b':
                    zzrVarArr = (zzr[]) i0.y(parcel, i10, zzr.CREATOR);
                    break;
                case '\t':
                    zA1 = i0.a0(parcel, i10);
                    break;
                case '\n':
                    zA2 = i0.a0(parcel, i10);
                    break;
                case 11:
                    zA3 = i0.a0(parcel, i10);
                    break;
                case '\f':
                    zA4 = i0.a0(parcel, i10);
                    break;
                case '\r':
                    zA5 = i0.a0(parcel, i10);
                    break;
                case 14:
                    zA6 = i0.a0(parcel, i10);
                    break;
                case 15:
                    zA7 = i0.a0(parcel, i10);
                    break;
                case 16:
                    zA8 = i0.a0(parcel, i10);
                    break;
                case 17:
                    zA9 = i0.a0(parcel, i10);
                    break;
                default:
                    i0.l0(parcel, i10);
                    break;
            }
        }
        i0.D(parcel, iO0);
        return new zzr(strV, iD0, iD1, zA0, iD2, iD3, zzrVarArr, zA1, zA2, zA3, zA4, zA5, zA6, zA7, zA8, zA9);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzr[i10];
    }
}
