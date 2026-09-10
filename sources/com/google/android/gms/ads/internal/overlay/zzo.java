package com.google.android.gms.ads.internal.overlay;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import qk.i0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zzo implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iO0 = i0.o0(parcel);
        long jE0 = 0;
        boolean zA0 = false;
        int iD0 = 0;
        int iD1 = 0;
        boolean zA1 = false;
        zzc zzcVar = null;
        IBinder iBinderC0 = null;
        IBinder iBinderC1 = null;
        IBinder iBinderC2 = null;
        IBinder iBinderC3 = null;
        String strV = null;
        String strV2 = null;
        IBinder iBinderC4 = null;
        String strV3 = null;
        VersionInfoParcel versionInfoParcel = null;
        String strV4 = null;
        com.google.android.gms.ads.internal.zzl zzlVar = null;
        IBinder iBinderC5 = null;
        String strV5 = null;
        String strV6 = null;
        String strV7 = null;
        IBinder iBinderC6 = null;
        IBinder iBinderC7 = null;
        IBinder iBinderC8 = null;
        while (parcel.dataPosition() < iO0) {
            int i10 = parcel.readInt();
            switch ((char) i10) {
                case 2:
                    zzcVar = (zzc) i0.s(parcel, i10, zzc.CREATOR);
                    break;
                case 3:
                    iBinderC0 = i0.c0(parcel, i10);
                    break;
                case 4:
                    iBinderC1 = i0.c0(parcel, i10);
                    break;
                case 5:
                    iBinderC2 = i0.c0(parcel, i10);
                    break;
                case 6:
                    iBinderC3 = i0.c0(parcel, i10);
                    break;
                case 7:
                    strV = i0.v(parcel, i10);
                    break;
                case '\b':
                    zA0 = i0.a0(parcel, i10);
                    break;
                case '\t':
                    strV2 = i0.v(parcel, i10);
                    break;
                case '\n':
                    iBinderC4 = i0.c0(parcel, i10);
                    break;
                case 11:
                    iD0 = i0.d0(parcel, i10);
                    break;
                case '\f':
                    iD1 = i0.d0(parcel, i10);
                    break;
                case '\r':
                    strV3 = i0.v(parcel, i10);
                    break;
                case 14:
                    versionInfoParcel = (VersionInfoParcel) i0.s(parcel, i10, VersionInfoParcel.CREATOR);
                    break;
                case 15:
                case 20:
                case 21:
                case 22:
                case 23:
                default:
                    i0.l0(parcel, i10);
                    break;
                case 16:
                    strV4 = i0.v(parcel, i10);
                    break;
                case 17:
                    zzlVar = (com.google.android.gms.ads.internal.zzl) i0.s(parcel, i10, com.google.android.gms.ads.internal.zzl.CREATOR);
                    break;
                case 18:
                    iBinderC5 = i0.c0(parcel, i10);
                    break;
                case 19:
                    strV5 = i0.v(parcel, i10);
                    break;
                case 24:
                    strV6 = i0.v(parcel, i10);
                    break;
                case 25:
                    strV7 = i0.v(parcel, i10);
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
                    iBinderC6 = i0.c0(parcel, i10);
                    break;
                case 27:
                    iBinderC7 = i0.c0(parcel, i10);
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE:
                    iBinderC8 = i0.c0(parcel, i10);
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_SUCCESS_TIME_VALUE:
                    zA1 = i0.a0(parcel, i10);
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_FAILURE_TIME_VALUE:
                    jE0 = i0.e0(parcel, i10);
                    break;
            }
        }
        i0.D(parcel, iO0);
        return new AdOverlayInfoParcel(zzcVar, iBinderC0, iBinderC1, iBinderC2, iBinderC3, strV, zA0, strV2, iBinderC4, iD0, iD1, strV3, versionInfoParcel, strV4, zzlVar, iBinderC5, strV5, strV6, strV7, iBinderC6, iBinderC7, iBinderC8, zA1, jE0);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new AdOverlayInfoParcel[i10];
    }
}
