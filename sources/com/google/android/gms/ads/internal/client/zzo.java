package com.google.android.gms.ads.internal.client;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import qk.i0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zzo implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iO0 = i0.o0(parcel);
        int iD0 = 0;
        int iD1 = 0;
        boolean zA0 = false;
        int iD2 = 0;
        boolean zA1 = false;
        boolean zA2 = false;
        int iD3 = 0;
        int iD4 = 0;
        int iD5 = 0;
        int iD6 = 0;
        long jE0 = 0;
        long jE1 = 0;
        long jE2 = 0;
        Bundle bundleN = null;
        ArrayList arrayListX = null;
        String strV = null;
        zzft zzftVar = null;
        Location location = null;
        String strV2 = null;
        Bundle bundleN2 = null;
        Bundle bundleN3 = null;
        ArrayList arrayListX2 = null;
        String strV3 = null;
        String strV4 = null;
        zzc zzcVar = null;
        String strV5 = null;
        ArrayList arrayListX3 = null;
        String strV6 = null;
        while (parcel.dataPosition() < iO0) {
            int i10 = parcel.readInt();
            switch ((char) i10) {
                case 1:
                    iD0 = i0.d0(parcel, i10);
                    break;
                case 2:
                    jE0 = i0.e0(parcel, i10);
                    break;
                case 3:
                    bundleN = i0.n(parcel, i10);
                    break;
                case 4:
                    iD1 = i0.d0(parcel, i10);
                    break;
                case 5:
                    arrayListX = i0.x(parcel, i10);
                    break;
                case 6:
                    zA0 = i0.a0(parcel, i10);
                    break;
                case 7:
                    iD2 = i0.d0(parcel, i10);
                    break;
                case '\b':
                    zA1 = i0.a0(parcel, i10);
                    break;
                case '\t':
                    strV = i0.v(parcel, i10);
                    break;
                case '\n':
                    zzftVar = (zzft) i0.s(parcel, i10, zzft.CREATOR);
                    break;
                case 11:
                    location = (Location) i0.s(parcel, i10, Location.CREATOR);
                    break;
                case '\f':
                    strV2 = i0.v(parcel, i10);
                    break;
                case '\r':
                    bundleN2 = i0.n(parcel, i10);
                    break;
                case 14:
                    bundleN3 = i0.n(parcel, i10);
                    break;
                case 15:
                    arrayListX2 = i0.x(parcel, i10);
                    break;
                case 16:
                    strV3 = i0.v(parcel, i10);
                    break;
                case 17:
                    strV4 = i0.v(parcel, i10);
                    break;
                case 18:
                    zA2 = i0.a0(parcel, i10);
                    break;
                case 19:
                    zzcVar = (zzc) i0.s(parcel, i10, zzc.CREATOR);
                    break;
                case 20:
                    iD3 = i0.d0(parcel, i10);
                    break;
                case 21:
                    strV5 = i0.v(parcel, i10);
                    break;
                case 22:
                    arrayListX3 = i0.x(parcel, i10);
                    break;
                case 23:
                    iD4 = i0.d0(parcel, i10);
                    break;
                case 24:
                    strV6 = i0.v(parcel, i10);
                    break;
                case 25:
                    iD5 = i0.d0(parcel, i10);
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
                    jE1 = i0.e0(parcel, i10);
                    break;
                case 27:
                    jE2 = i0.e0(parcel, i10);
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE:
                    iD6 = i0.d0(parcel, i10);
                    break;
                default:
                    i0.l0(parcel, i10);
                    break;
            }
        }
        i0.D(parcel, iO0);
        return new zzm(iD0, jE0, bundleN, iD1, arrayListX, zA0, iD2, zA1, strV, zzftVar, location, strV2, bundleN2, bundleN3, arrayListX2, strV3, strV4, zA2, zzcVar, iD3, strV5, arrayListX3, iD4, strV6, iD5, jE1, jE2, iD6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzm[i10];
    }
}
