package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzee;
import com.google.android.gms.ads.internal.client.zzfw;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzr;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class gj implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14878a;

    public /* synthetic */ gj(int i10) {
        this.f14878a = i10;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f14878a) {
            case 0:
                int iO0 = qk.i0.o0(parcel);
                boolean zA0 = false;
                boolean zA1 = false;
                boolean zA2 = false;
                long jE0 = 0;
                ParcelFileDescriptor parcelFileDescriptor = null;
                while (parcel.dataPosition() < iO0) {
                    int i10 = parcel.readInt();
                    char c4 = (char) i10;
                    if (c4 == 2) {
                        parcelFileDescriptor = (ParcelFileDescriptor) qk.i0.s(parcel, i10, ParcelFileDescriptor.CREATOR);
                    } else if (c4 == 3) {
                        zA0 = qk.i0.a0(parcel, i10);
                    } else if (c4 == 4) {
                        zA1 = qk.i0.a0(parcel, i10);
                    } else if (c4 == 5) {
                        jE0 = qk.i0.e0(parcel, i10);
                    } else if (c4 != 6) {
                        qk.i0.l0(parcel, i10);
                    } else {
                        zA2 = qk.i0.a0(parcel, i10);
                    }
                }
                qk.i0.D(parcel, iO0);
                return new fj(parcelFileDescriptor, zA0, zA1, jE0, zA2);
            case 1:
                int iO1 = qk.i0.o0(parcel);
                boolean zA3 = false;
                int iD0 = 0;
                String strV = null;
                String strV2 = null;
                String strV3 = null;
                String strV4 = null;
                Bundle bundleN = null;
                String strV5 = null;
                long jE1 = 0;
                long jE2 = 0;
                while (parcel.dataPosition() < iO1) {
                    int i11 = parcel.readInt();
                    switch ((char) i11) {
                        case 2:
                            strV = qk.i0.v(parcel, i11);
                            break;
                        case 3:
                            jE1 = qk.i0.e0(parcel, i11);
                            break;
                        case 4:
                            strV2 = qk.i0.v(parcel, i11);
                            break;
                        case 5:
                            strV3 = qk.i0.v(parcel, i11);
                            break;
                        case 6:
                            strV4 = qk.i0.v(parcel, i11);
                            break;
                        case 7:
                            bundleN = qk.i0.n(parcel, i11);
                            break;
                        case '\b':
                            zA3 = qk.i0.a0(parcel, i11);
                            break;
                        case '\t':
                            jE2 = qk.i0.e0(parcel, i11);
                            break;
                        case '\n':
                            strV5 = qk.i0.v(parcel, i11);
                            break;
                        case 11:
                            iD0 = qk.i0.d0(parcel, i11);
                            break;
                        default:
                            qk.i0.l0(parcel, i11);
                            break;
                    }
                }
                qk.i0.D(parcel, iO1);
                return new ij(strV, jE1, strV2, strV3, strV4, bundleN, zA3, jE2, strV5, iD0);
            case 2:
                int iO2 = qk.i0.o0(parcel);
                int iD1 = 0;
                boolean zA4 = false;
                int iD2 = 0;
                boolean zA5 = false;
                int iD3 = 0;
                boolean zA6 = false;
                int iD4 = 0;
                int iD5 = 0;
                boolean zA7 = false;
                int iD6 = 0;
                zzfw zzfwVar = null;
                while (parcel.dataPosition() < iO2) {
                    int i12 = parcel.readInt();
                    switch ((char) i12) {
                        case 1:
                            iD1 = qk.i0.d0(parcel, i12);
                            break;
                        case 2:
                            zA4 = qk.i0.a0(parcel, i12);
                            break;
                        case 3:
                            iD2 = qk.i0.d0(parcel, i12);
                            break;
                        case 4:
                            zA5 = qk.i0.a0(parcel, i12);
                            break;
                        case 5:
                            iD3 = qk.i0.d0(parcel, i12);
                            break;
                        case 6:
                            zzfwVar = (zzfw) qk.i0.s(parcel, i12, zzfw.CREATOR);
                            break;
                        case 7:
                            zA6 = qk.i0.a0(parcel, i12);
                            break;
                        case '\b':
                            iD4 = qk.i0.d0(parcel, i12);
                            break;
                        case '\t':
                            iD5 = qk.i0.d0(parcel, i12);
                            break;
                        case '\n':
                            zA7 = qk.i0.a0(parcel, i12);
                            break;
                        case 11:
                            iD6 = qk.i0.d0(parcel, i12);
                            break;
                        default:
                            qk.i0.l0(parcel, i12);
                            break;
                    }
                }
                qk.i0.D(parcel, iO2);
                return new eo(iD1, zA4, iD2, zA5, iD3, zzfwVar, zA6, iD4, iD5, zA7, iD6);
            case 3:
                int iO3 = qk.i0.o0(parcel);
                String strV6 = null;
                String[] strArrW = null;
                String[] strArrW2 = null;
                while (parcel.dataPosition() < iO3) {
                    int i13 = parcel.readInt();
                    char c5 = (char) i13;
                    if (c5 == 1) {
                        strV6 = qk.i0.v(parcel, i13);
                    } else if (c5 == 2) {
                        strArrW = qk.i0.w(parcel, i13);
                    } else if (c5 != 3) {
                        qk.i0.l0(parcel, i13);
                    } else {
                        strArrW2 = qk.i0.w(parcel, i13);
                    }
                }
                qk.i0.D(parcel, iO3);
                return new nr(strV6, strArrW, strArrW2);
            case 4:
                int iO4 = qk.i0.o0(parcel);
                long jE3 = 0;
                boolean zA8 = false;
                int iD7 = 0;
                boolean zA9 = false;
                String strV7 = null;
                byte[] bArrO = null;
                String[] strArrW3 = null;
                String[] strArrW4 = null;
                while (parcel.dataPosition() < iO4) {
                    int i14 = parcel.readInt();
                    switch ((char) i14) {
                        case 1:
                            zA8 = qk.i0.a0(parcel, i14);
                            break;
                        case 2:
                            strV7 = qk.i0.v(parcel, i14);
                            break;
                        case 3:
                            iD7 = qk.i0.d0(parcel, i14);
                            break;
                        case 4:
                            bArrO = qk.i0.o(parcel, i14);
                            break;
                        case 5:
                            strArrW3 = qk.i0.w(parcel, i14);
                            break;
                        case 6:
                            strArrW4 = qk.i0.w(parcel, i14);
                            break;
                        case 7:
                            zA9 = qk.i0.a0(parcel, i14);
                            break;
                        case '\b':
                            jE3 = qk.i0.e0(parcel, i14);
                            break;
                        default:
                            qk.i0.l0(parcel, i14);
                            break;
                    }
                }
                qk.i0.D(parcel, iO4);
                return new or(zA8, strV7, iD7, bArrO, strArrW3, strArrW4, zA9, jE3);
            case 5:
                int iO5 = qk.i0.o0(parcel);
                String strV8 = null;
                boolean zA10 = false;
                int iD8 = 0;
                String strV9 = null;
                while (parcel.dataPosition() < iO5) {
                    int i15 = parcel.readInt();
                    char c10 = (char) i15;
                    if (c10 == 1) {
                        strV8 = qk.i0.v(parcel, i15);
                    } else if (c10 == 2) {
                        zA10 = qk.i0.a0(parcel, i15);
                    } else if (c10 == 3) {
                        iD8 = qk.i0.d0(parcel, i15);
                    } else if (c10 != 4) {
                        qk.i0.l0(parcel, i15);
                    } else {
                        strV9 = qk.i0.v(parcel, i15);
                    }
                }
                qk.i0.D(parcel, iO5);
                return new tr(strV8, iD8, strV9, zA10);
            case 6:
                int iO6 = qk.i0.o0(parcel);
                String strV10 = null;
                Bundle bundleN2 = null;
                while (parcel.dataPosition() < iO6) {
                    int i16 = parcel.readInt();
                    char c11 = (char) i16;
                    if (c11 == 1) {
                        strV10 = qk.i0.v(parcel, i16);
                    } else if (c11 != 2) {
                        qk.i0.l0(parcel, i16);
                    } else {
                        bundleN2 = qk.i0.n(parcel, i16);
                    }
                }
                qk.i0.D(parcel, iO6);
                return new as(bundleN2, strV10);
            case 7:
                int iO7 = qk.i0.o0(parcel);
                int iD9 = 0;
                int iD10 = 0;
                String strV11 = null;
                int iD11 = 0;
                while (parcel.dataPosition() < iO7) {
                    int i17 = parcel.readInt();
                    char c12 = (char) i17;
                    if (c12 == 1) {
                        iD11 = qk.i0.d0(parcel, i17);
                    } else if (c12 == 2) {
                        strV11 = qk.i0.v(parcel, i17);
                    } else if (c12 == 3) {
                        iD10 = qk.i0.d0(parcel, i17);
                    } else if (c12 != 1000) {
                        qk.i0.l0(parcel, i17);
                    } else {
                        iD9 = qk.i0.d0(parcel, i17);
                    }
                }
                qk.i0.D(parcel, iO7);
                return new bs(strV11, iD9, iD11, iD10);
            case 8:
                int iO8 = qk.i0.o0(parcel);
                int iD12 = 0;
                int iD13 = 0;
                int iD14 = 0;
                while (parcel.dataPosition() < iO8) {
                    int i18 = parcel.readInt();
                    char c13 = (char) i18;
                    if (c13 == 1) {
                        iD12 = qk.i0.d0(parcel, i18);
                    } else if (c13 == 2) {
                        iD13 = qk.i0.d0(parcel, i18);
                    } else if (c13 != 3) {
                        qk.i0.l0(parcel, i18);
                    } else {
                        iD14 = qk.i0.d0(parcel, i18);
                    }
                }
                qk.i0.D(parcel, iO8);
                return new fv(iD12, iD13, iD14);
            case 9:
                int iO9 = qk.i0.o0(parcel);
                IBinder iBinderC0 = null;
                IBinder iBinderC1 = null;
                while (parcel.dataPosition() < iO9) {
                    int i19 = parcel.readInt();
                    char c14 = (char) i19;
                    if (c14 == 1) {
                        iBinderC0 = qk.i0.c0(parcel, i19);
                    } else if (c14 != 2) {
                        qk.i0.l0(parcel, i19);
                    } else {
                        iBinderC1 = qk.i0.c0(parcel, i19);
                    }
                }
                qk.i0.D(parcel, iO9);
                return new xw(iBinderC0, iBinderC1);
            case 10:
                int iO10 = qk.i0.o0(parcel);
                Bundle bundleN3 = null;
                zzm zzmVar = null;
                zzr zzrVar = null;
                String strV12 = null;
                ApplicationInfo applicationInfo = null;
                PackageInfo packageInfo = null;
                String strV13 = null;
                String strV14 = null;
                String strV15 = null;
                VersionInfoParcel versionInfoParcel = null;
                Bundle bundleN4 = null;
                ArrayList arrayListX = null;
                Bundle bundleN5 = null;
                String strV16 = null;
                String strV17 = null;
                ArrayList arrayListX2 = null;
                String strV18 = null;
                eo eoVar = null;
                ArrayList arrayListX3 = null;
                String strV19 = null;
                String strV20 = null;
                String strV21 = null;
                Bundle bundleN6 = null;
                String strV22 = null;
                zzee zzeeVar = null;
                Bundle bundleN7 = null;
                String strV23 = null;
                String strV24 = null;
                String strV25 = null;
                ArrayList arrayListR = null;
                String strV26 = null;
                ArrayList arrayListX4 = null;
                ArrayList arrayListX5 = null;
                String strV27 = null;
                bs bsVar = null;
                String strV28 = null;
                Bundle bundleN8 = null;
                int iD15 = 0;
                int iD16 = 0;
                boolean zA11 = false;
                int iD17 = 0;
                int iD18 = 0;
                boolean zA12 = false;
                int iD19 = 0;
                int iD20 = 0;
                boolean zA13 = false;
                boolean zA14 = false;
                int iD21 = 0;
                boolean zA15 = false;
                boolean zA16 = false;
                int iD22 = 0;
                boolean zA17 = false;
                boolean zA18 = false;
                boolean zA19 = false;
                float f10 = 0.0f;
                float f11 = 0.0f;
                long jE4 = 0;
                long jE5 = 0;
                while (parcel.dataPosition() < iO10) {
                    int i20 = parcel.readInt();
                    switch ((char) i20) {
                        case 1:
                            iD15 = qk.i0.d0(parcel, i20);
                            break;
                        case 2:
                            bundleN3 = qk.i0.n(parcel, i20);
                            break;
                        case 3:
                            zzmVar = (zzm) qk.i0.s(parcel, i20, zzm.CREATOR);
                            break;
                        case 4:
                            zzrVar = (zzr) qk.i0.s(parcel, i20, zzr.CREATOR);
                            break;
                        case 5:
                            strV12 = qk.i0.v(parcel, i20);
                            break;
                        case 6:
                            applicationInfo = (ApplicationInfo) qk.i0.s(parcel, i20, ApplicationInfo.CREATOR);
                            break;
                        case 7:
                            packageInfo = (PackageInfo) qk.i0.s(parcel, i20, PackageInfo.CREATOR);
                            break;
                        case '\b':
                            strV13 = qk.i0.v(parcel, i20);
                            break;
                        case '\t':
                            strV14 = qk.i0.v(parcel, i20);
                            break;
                        case '\n':
                            strV15 = qk.i0.v(parcel, i20);
                            break;
                        case 11:
                            versionInfoParcel = (VersionInfoParcel) qk.i0.s(parcel, i20, VersionInfoParcel.CREATOR);
                            break;
                        case '\f':
                            bundleN4 = qk.i0.n(parcel, i20);
                            break;
                        case '\r':
                            iD16 = qk.i0.d0(parcel, i20);
                            break;
                        case 14:
                            arrayListX = qk.i0.x(parcel, i20);
                            break;
                        case 15:
                            bundleN5 = qk.i0.n(parcel, i20);
                            break;
                        case 16:
                            zA11 = qk.i0.a0(parcel, i20);
                            break;
                        case 17:
                        case 22:
                        case 23:
                        case 24:
                        case ' ':
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_LEFT_APP_VALUE:
                        case '>':
                        default:
                            qk.i0.l0(parcel, i20);
                            break;
                        case 18:
                            iD17 = qk.i0.d0(parcel, i20);
                            break;
                        case 19:
                            iD18 = qk.i0.d0(parcel, i20);
                            break;
                        case 20:
                            qk.i0.r0(parcel, i20, 4);
                            f10 = parcel.readFloat();
                            break;
                        case 21:
                            strV16 = qk.i0.v(parcel, i20);
                            break;
                        case 25:
                            jE4 = qk.i0.e0(parcel, i20);
                            break;
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
                            strV17 = qk.i0.v(parcel, i20);
                            break;
                        case 27:
                            arrayListX2 = qk.i0.x(parcel, i20);
                            break;
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE:
                            strV18 = qk.i0.v(parcel, i20);
                            break;
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_SUCCESS_TIME_VALUE:
                            eoVar = (eo) qk.i0.s(parcel, i20, eo.CREATOR);
                            break;
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_FAILURE_TIME_VALUE:
                            arrayListX3 = qk.i0.x(parcel, i20);
                            break;
                        case 31:
                            jE5 = qk.i0.e0(parcel, i20);
                            break;
                        case '!':
                            strV19 = qk.i0.v(parcel, i20);
                            break;
                        case '\"':
                            qk.i0.r0(parcel, i20, 4);
                            f11 = parcel.readFloat();
                            break;
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_FAILURE_TIME_VALUE:
                            iD19 = qk.i0.d0(parcel, i20);
                            break;
                        case '$':
                            iD20 = qk.i0.d0(parcel, i20);
                            break;
                        case '%':
                            zA13 = qk.i0.a0(parcel, i20);
                            break;
                        case '\'':
                            strV20 = qk.i0.v(parcel, i20);
                            break;
                        case '(':
                            zA12 = qk.i0.a0(parcel, i20);
                            break;
                        case ')':
                            strV21 = qk.i0.v(parcel, i20);
                            break;
                        case '*':
                            zA14 = qk.i0.a0(parcel, i20);
                            break;
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_OPERATIVE_EVENT_FAILURE_VALUE:
                            iD21 = qk.i0.d0(parcel, i20);
                            break;
                        case ',':
                            bundleN6 = qk.i0.n(parcel, i20);
                            break;
                        case '-':
                            strV22 = qk.i0.v(parcel, i20);
                            break;
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_NETWORK_VALUE:
                            zzeeVar = (zzee) qk.i0.s(parcel, i20, zzee.CREATOR);
                            break;
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_EXTRAS_EXCEEDED_SIZE_VALUE:
                            zA15 = qk.i0.a0(parcel, i20);
                            break;
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE:
                            bundleN7 = qk.i0.n(parcel, i20);
                            break;
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_SUCCESS_TIME_VALUE:
                            strV23 = qk.i0.v(parcel, i20);
                            break;
                        case '2':
                            strV24 = qk.i0.v(parcel, i20);
                            break;
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_STARTED_VALUE:
                            strV25 = qk.i0.v(parcel, i20);
                            break;
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_SUCCESS_VALUE:
                            zA16 = qk.i0.a0(parcel, i20);
                            break;
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_FAILURE_VALUE:
                            arrayListR = qk.i0.r(parcel, i20);
                            break;
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SDK_NOT_FOUND_VALUE:
                            strV26 = qk.i0.v(parcel, i20);
                            break;
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_UNSUBSCRIBED_VALUE:
                            arrayListX4 = qk.i0.x(parcel, i20);
                            break;
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_RECEIVED_VALUE:
                            iD22 = qk.i0.d0(parcel, i20);
                            break;
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_PARSE_FAILURE_VALUE:
                            zA17 = qk.i0.a0(parcel, i20);
                            break;
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_BUILD_FAILURE_VALUE:
                            zA18 = qk.i0.a0(parcel, i20);
                            break;
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_STARTED_VALUE:
                            zA19 = qk.i0.a0(parcel, i20);
                            break;
                        case '<':
                            arrayListX5 = qk.i0.x(parcel, i20);
                            break;
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_FAILURE_TIME_VALUE:
                            strV27 = qk.i0.v(parcel, i20);
                            break;
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_START_ON_DISPLAY_READY_VALUE:
                            bsVar = (bs) qk.i0.s(parcel, i20, bs.CREATOR);
                            break;
                        case '@':
                            strV28 = qk.i0.v(parcel, i20);
                            break;
                        case 'A':
                            bundleN8 = qk.i0.n(parcel, i20);
                            break;
                    }
                }
                qk.i0.D(parcel, iO10);
                return new cx(iD15, bundleN3, zzmVar, zzrVar, strV12, applicationInfo, packageInfo, strV13, strV14, strV15, versionInfoParcel, bundleN4, iD16, arrayListX, bundleN5, zA11, iD17, iD18, f10, strV16, jE4, strV17, arrayListX2, strV18, eoVar, arrayListX3, jE5, strV19, f11, zA12, iD19, iD20, zA13, strV20, strV21, zA14, iD21, bundleN6, strV22, zzeeVar, zA15, bundleN7, strV23, strV24, strV25, zA16, arrayListR, strV26, arrayListX4, iD22, zA17, zA18, zA19, arrayListX5, strV27, bsVar, strV28, bundleN8);
            case 11:
                int iO11 = qk.i0.o0(parcel);
                ArrayList arrayListX6 = null;
                boolean zA20 = false;
                while (parcel.dataPosition() < iO11) {
                    int i21 = parcel.readInt();
                    char c15 = (char) i21;
                    if (c15 == 2) {
                        zA20 = qk.i0.a0(parcel, i21);
                    } else if (c15 != 3) {
                        qk.i0.l0(parcel, i21);
                    } else {
                        arrayListX6 = qk.i0.x(parcel, i21);
                    }
                }
                qk.i0.D(parcel, iO11);
                return new dx(arrayListX6, zA20);
            case 12:
                int iO12 = qk.i0.o0(parcel);
                String strV29 = null;
                while (parcel.dataPosition() < iO12) {
                    int i22 = parcel.readInt();
                    if (((char) i22) != 1) {
                        qk.i0.l0(parcel, i22);
                    } else {
                        strV29 = qk.i0.v(parcel, i22);
                    }
                }
                qk.i0.D(parcel, iO12);
                return new ex(strV29);
            case 13:
                int iO13 = qk.i0.o0(parcel);
                Bundle bundleN9 = null;
                VersionInfoParcel versionInfoParcel2 = null;
                ApplicationInfo applicationInfo2 = null;
                String strV30 = null;
                ArrayList arrayListX7 = null;
                PackageInfo packageInfo2 = null;
                String strV31 = null;
                String strV32 = null;
                ev0 ev0Var = null;
                String strV33 = null;
                Bundle bundleN10 = null;
                boolean zA21 = false;
                boolean zA22 = false;
                while (parcel.dataPosition() < iO13) {
                    int i23 = parcel.readInt();
                    switch ((char) i23) {
                        case 1:
                            bundleN9 = qk.i0.n(parcel, i23);
                            break;
                        case 2:
                            versionInfoParcel2 = (VersionInfoParcel) qk.i0.s(parcel, i23, VersionInfoParcel.CREATOR);
                            break;
                        case 3:
                            applicationInfo2 = (ApplicationInfo) qk.i0.s(parcel, i23, ApplicationInfo.CREATOR);
                            break;
                        case 4:
                            strV30 = qk.i0.v(parcel, i23);
                            break;
                        case 5:
                            arrayListX7 = qk.i0.x(parcel, i23);
                            break;
                        case 6:
                            packageInfo2 = (PackageInfo) qk.i0.s(parcel, i23, PackageInfo.CREATOR);
                            break;
                        case 7:
                            strV31 = qk.i0.v(parcel, i23);
                            break;
                        case '\b':
                        default:
                            qk.i0.l0(parcel, i23);
                            break;
                        case '\t':
                            strV32 = qk.i0.v(parcel, i23);
                            break;
                        case '\n':
                            ev0Var = (ev0) qk.i0.s(parcel, i23, ev0.CREATOR);
                            break;
                        case 11:
                            strV33 = qk.i0.v(parcel, i23);
                            break;
                        case '\f':
                            zA21 = qk.i0.a0(parcel, i23);
                            break;
                        case '\r':
                            zA22 = qk.i0.a0(parcel, i23);
                            break;
                        case 14:
                            bundleN10 = qk.i0.n(parcel, i23);
                            break;
                    }
                }
                qk.i0.D(parcel, iO13);
                return new mx(bundleN9, versionInfoParcel2, applicationInfo2, strV30, arrayListX7, packageInfo2, strV31, strV32, ev0Var, strV33, zA21, zA22, bundleN10);
            case 14:
                int iO14 = qk.i0.o0(parcel);
                zzm zzmVar2 = null;
                String strV34 = null;
                while (parcel.dataPosition() < iO14) {
                    int i24 = parcel.readInt();
                    char c16 = (char) i24;
                    if (c16 == 2) {
                        zzmVar2 = (zzm) qk.i0.s(parcel, i24, zzm.CREATOR);
                    } else if (c16 != 3) {
                        qk.i0.l0(parcel, i24);
                    } else {
                        strV34 = qk.i0.v(parcel, i24);
                    }
                }
                qk.i0.D(parcel, iO14);
                return new yx(zzmVar2, strV34);
            case 15:
                int iO15 = qk.i0.o0(parcel);
                int iD23 = 0;
                String strV35 = null;
                while (parcel.dataPosition() < iO15) {
                    int i25 = parcel.readInt();
                    char c17 = (char) i25;
                    if (c17 == 2) {
                        strV35 = qk.i0.v(parcel, i25);
                    } else if (c17 != 3) {
                        qk.i0.l0(parcel, i25);
                    } else {
                        iD23 = qk.i0.d0(parcel, i25);
                    }
                }
                qk.i0.D(parcel, iO15);
                return new dy(strV35, iD23);
            case 16:
                int iO16 = qk.i0.o0(parcel);
                String strV36 = null;
                String strV37 = null;
                while (parcel.dataPosition() < iO16) {
                    int i26 = parcel.readInt();
                    char c18 = (char) i26;
                    if (c18 == 1) {
                        strV36 = qk.i0.v(parcel, i26);
                    } else if (c18 != 2) {
                        qk.i0.l0(parcel, i26);
                    } else {
                        strV37 = qk.i0.v(parcel, i26);
                    }
                }
                qk.i0.D(parcel, iO16);
                return new vy(strV36, strV37);
            case 17:
                int iO17 = qk.i0.o0(parcel);
                String strV38 = null;
                String strV39 = null;
                ArrayList arrayListX8 = null;
                ArrayList arrayListX9 = null;
                boolean zA23 = false;
                boolean zA24 = false;
                boolean zA25 = false;
                boolean zA26 = false;
                while (parcel.dataPosition() < iO17) {
                    int i27 = parcel.readInt();
                    switch ((char) i27) {
                        case 2:
                            strV38 = qk.i0.v(parcel, i27);
                            break;
                        case 3:
                            strV39 = qk.i0.v(parcel, i27);
                            break;
                        case 4:
                            zA23 = qk.i0.a0(parcel, i27);
                            break;
                        case 5:
                            zA24 = qk.i0.a0(parcel, i27);
                            break;
                        case 6:
                            arrayListX8 = qk.i0.x(parcel, i27);
                            break;
                        case 7:
                            zA25 = qk.i0.a0(parcel, i27);
                            break;
                        case '\b':
                            zA26 = qk.i0.a0(parcel, i27);
                            break;
                        case '\t':
                            arrayListX9 = qk.i0.x(parcel, i27);
                            break;
                        default:
                            qk.i0.l0(parcel, i27);
                            break;
                    }
                }
                qk.i0.D(parcel, iO17);
                return new az(strV38, strV39, zA23, zA24, arrayListX8, zA25, zA26, arrayListX9);
            case 18:
                int iO18 = qk.i0.o0(parcel);
                String strV40 = null;
                String strV41 = null;
                zzr zzrVar2 = null;
                zzm zzmVar3 = null;
                while (parcel.dataPosition() < iO18) {
                    int i28 = parcel.readInt();
                    char c19 = (char) i28;
                    if (c19 == 1) {
                        strV40 = qk.i0.v(parcel, i28);
                    } else if (c19 == 2) {
                        strV41 = qk.i0.v(parcel, i28);
                    } else if (c19 == 3) {
                        zzrVar2 = (zzr) qk.i0.s(parcel, i28, zzr.CREATOR);
                    } else if (c19 != 4) {
                        qk.i0.l0(parcel, i28);
                    } else {
                        zzmVar3 = (zzm) qk.i0.s(parcel, i28, zzm.CREATOR);
                    }
                }
                qk.i0.D(parcel, iO18);
                return new xz(strV40, strV41, zzrVar2, zzmVar3);
            case 19:
                int iO19 = qk.i0.o0(parcel);
                int iD24 = 0;
                int iD25 = 0;
                int iD26 = 0;
                int iD27 = 0;
                int iD28 = 0;
                int iD29 = 0;
                String strV42 = null;
                while (parcel.dataPosition() < iO19) {
                    int i29 = parcel.readInt();
                    switch ((char) i29) {
                        case 1:
                            iD24 = qk.i0.d0(parcel, i29);
                            break;
                        case 2:
                            iD25 = qk.i0.d0(parcel, i29);
                            break;
                        case 3:
                            iD26 = qk.i0.d0(parcel, i29);
                            break;
                        case 4:
                            iD27 = qk.i0.d0(parcel, i29);
                            break;
                        case 5:
                            strV42 = qk.i0.v(parcel, i29);
                            break;
                        case 6:
                            iD28 = qk.i0.d0(parcel, i29);
                            break;
                        case 7:
                            iD29 = qk.i0.d0(parcel, i29);
                            break;
                        default:
                            qk.i0.l0(parcel, i29);
                            break;
                    }
                }
                qk.i0.D(parcel, iO19);
                return new ev0(iD24, strV42, iD25, iD26, iD27, iD28, iD29);
            case 20:
                int iO20 = qk.i0.o0(parcel);
                byte[] bArrO2 = null;
                int iD30 = 0;
                while (parcel.dataPosition() < iO20) {
                    int i30 = parcel.readInt();
                    char c20 = (char) i30;
                    if (c20 == 1) {
                        iD30 = qk.i0.d0(parcel, i30);
                    } else if (c20 != 2) {
                        qk.i0.l0(parcel, i30);
                    } else {
                        bArrO2 = qk.i0.o(parcel, i30);
                    }
                }
                qk.i0.D(parcel, iO20);
                return new d01(iD30, bArrO2);
            case 21:
                int iO21 = qk.i0.o0(parcel);
                String strV43 = null;
                int iD31 = 0;
                String strV44 = null;
                while (parcel.dataPosition() < iO21) {
                    int i31 = parcel.readInt();
                    char c21 = (char) i31;
                    if (c21 == 1) {
                        iD31 = qk.i0.d0(parcel, i31);
                    } else if (c21 == 2) {
                        strV43 = qk.i0.v(parcel, i31);
                    } else if (c21 != 3) {
                        qk.i0.l0(parcel, i31);
                    } else {
                        strV44 = qk.i0.v(parcel, i31);
                    }
                }
                qk.i0.D(parcel, iO21);
                return new f01(iD31, strV43, strV44);
            case 22:
                int iO22 = qk.i0.o0(parcel);
                byte[] bArrO3 = null;
                int iD32 = 0;
                while (parcel.dataPosition() < iO22) {
                    int i32 = parcel.readInt();
                    char c22 = (char) i32;
                    if (c22 == 1) {
                        iD32 = qk.i0.d0(parcel, i32);
                    } else if (c22 != 2) {
                        qk.i0.l0(parcel, i32);
                    } else {
                        bArrO3 = qk.i0.o(parcel, i32);
                    }
                }
                qk.i0.D(parcel, iO22);
                return new g01(iD32, bArrO3);
            case 23:
                int iO23 = qk.i0.o0(parcel);
                String strV45 = null;
                String strV46 = null;
                int iD33 = 0;
                int iD34 = 0;
                int iD35 = 0;
                while (parcel.dataPosition() < iO23) {
                    int i33 = parcel.readInt();
                    char c23 = (char) i33;
                    if (c23 == 1) {
                        iD33 = qk.i0.d0(parcel, i33);
                    } else if (c23 == 2) {
                        iD34 = qk.i0.d0(parcel, i33);
                    } else if (c23 == 3) {
                        strV45 = qk.i0.v(parcel, i33);
                    } else if (c23 == 4) {
                        strV46 = qk.i0.v(parcel, i33);
                    } else if (c23 != 5) {
                        qk.i0.l0(parcel, i33);
                    } else {
                        iD35 = qk.i0.d0(parcel, i33);
                    }
                }
                qk.i0.D(parcel, iO23);
                return new k01(strV45, iD33, iD34, iD35, strV46);
            case 24:
                int iO24 = qk.i0.o0(parcel);
                int iD36 = 0;
                byte[] bArrO4 = null;
                int iD37 = 0;
                while (parcel.dataPosition() < iO24) {
                    int i34 = parcel.readInt();
                    char c24 = (char) i34;
                    if (c24 == 1) {
                        iD36 = qk.i0.d0(parcel, i34);
                    } else if (c24 == 2) {
                        bArrO4 = qk.i0.o(parcel, i34);
                    } else if (c24 != 3) {
                        qk.i0.l0(parcel, i34);
                    } else {
                        iD37 = qk.i0.d0(parcel, i34);
                    }
                }
                qk.i0.D(parcel, iO24);
                return new l01(bArrO4, iD36, iD37);
            case 25:
                return new g02(parcel);
            default:
                return new c02(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        switch (this.f14878a) {
            case 0:
                return new fj[i10];
            case 1:
                return new ij[i10];
            case 2:
                return new eo[i10];
            case 3:
                return new nr[i10];
            case 4:
                return new or[i10];
            case 5:
                return new tr[i10];
            case 6:
                return new as[i10];
            case 7:
                return new bs[i10];
            case 8:
                return new fv[i10];
            case 9:
                return new xw[i10];
            case 10:
                return new cx[i10];
            case 11:
                return new dx[i10];
            case 12:
                return new ex[i10];
            case 13:
                return new mx[i10];
            case 14:
                return new yx[i10];
            case 15:
                return new dy[i10];
            case 16:
                return new vy[i10];
            case 17:
                return new az[i10];
            case 18:
                return new xz[i10];
            case 19:
                return new ev0[i10];
            case 20:
                return new d01[i10];
            case 21:
                return new f01[i10];
            case 22:
                return new g01[i10];
            case 23:
                return new k01[i10];
            case 24:
                return new l01[i10];
            case 25:
                return new g02[i10];
            default:
                return new c02[i10];
        }
    }
}
