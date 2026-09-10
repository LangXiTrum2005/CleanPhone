package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class j7 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23619a;

    public /* synthetic */ j7(int i10) {
        this.f23619a = i10;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f23619a) {
            case 0:
                int iO0 = qk.i0.o0(parcel);
                Bundle bundleN = null;
                String strV = null;
                boolean zA0 = false;
                long jE0 = 0;
                long jE1 = 0;
                while (parcel.dataPosition() < iO0) {
                    int i10 = parcel.readInt();
                    char c4 = (char) i10;
                    if (c4 == 1) {
                        jE0 = qk.i0.e0(parcel, i10);
                    } else if (c4 == 2) {
                        jE1 = qk.i0.e0(parcel, i10);
                    } else if (c4 == 3) {
                        zA0 = qk.i0.a0(parcel, i10);
                    } else if (c4 == 7) {
                        bundleN = qk.i0.n(parcel, i10);
                    } else if (c4 != '\b') {
                        qk.i0.l0(parcel, i10);
                    } else {
                        strV = qk.i0.v(parcel, i10);
                    }
                }
                qk.i0.D(parcel, iO0);
                return new i7(jE0, jE1, zA0, bundleN, strV);
            case 1:
                int iO1 = qk.i0.o0(parcel);
                String strV2 = null;
                int iD0 = 0;
                Intent intent = null;
                while (parcel.dataPosition() < iO1) {
                    int i11 = parcel.readInt();
                    char c5 = (char) i11;
                    if (c5 == 1) {
                        iD0 = qk.i0.d0(parcel, i11);
                    } else if (c5 == 2) {
                        strV2 = qk.i0.v(parcel, i11);
                    } else if (c5 != 3) {
                        qk.i0.l0(parcel, i11);
                    } else {
                        intent = (Intent) qk.i0.s(parcel, i11, Intent.CREATOR);
                    }
                }
                qk.i0.D(parcel, iO1);
                return new k7(iD0, intent, strV2);
            case 2:
                int iO2 = qk.i0.o0(parcel);
                va[] vaVarArr = null;
                int iD1 = 0;
                String[] strArrW = null;
                while (parcel.dataPosition() < iO2) {
                    int i12 = parcel.readInt();
                    char c10 = (char) i12;
                    if (c10 == 2) {
                        iD1 = qk.i0.d0(parcel, i12);
                    } else if (c10 == 3) {
                        vaVarArr = (va[]) qk.i0.y(parcel, i12, va.CREATOR);
                    } else if (c10 != 4) {
                        qk.i0.l0(parcel, i12);
                    } else {
                        strArrW = qk.i0.w(parcel, i12);
                    }
                }
                qk.i0.D(parcel, iO2);
                return new ra(iD1, vaVarArr, strArrW);
            case 3:
                int iO3 = qk.i0.o0(parcel);
                long jE2 = 0;
                String strV3 = null;
                String strV4 = null;
                ra[] raVarArr = null;
                byte[] bArrO = null;
                boolean zA1 = false;
                while (parcel.dataPosition() < iO3) {
                    int i13 = parcel.readInt();
                    switch ((char) i13) {
                        case 2:
                            strV3 = qk.i0.v(parcel, i13);
                            break;
                        case 3:
                            strV4 = qk.i0.v(parcel, i13);
                            break;
                        case 4:
                            raVarArr = (ra[]) qk.i0.y(parcel, i13, ra.CREATOR);
                            break;
                        case 5:
                            zA1 = qk.i0.a0(parcel, i13);
                            break;
                        case 6:
                            bArrO = qk.i0.o(parcel, i13);
                            break;
                        case 7:
                            jE2 = qk.i0.e0(parcel, i13);
                            break;
                        default:
                            qk.i0.l0(parcel, i13);
                            break;
                    }
                }
                qk.i0.D(parcel, iO3);
                return new sa(strV3, strV4, raVarArr, zA1, bArrO, jE2);
            case 4:
                int iO4 = qk.i0.o0(parcel);
                byte[] bArrO2 = null;
                while (parcel.dataPosition() < iO4) {
                    int i14 = parcel.readInt();
                    if (((char) i14) != 2) {
                        qk.i0.l0(parcel, i14);
                    } else {
                        bArrO2 = qk.i0.o(parcel, i14);
                    }
                }
                qk.i0.D(parcel, iO4);
                return new ta(bArrO2);
            case 5:
                int iO5 = qk.i0.o0(parcel);
                String strV5 = null;
                byte[] bArrO3 = null;
                byte[][] bArrP = null;
                byte[][] bArrP2 = null;
                byte[][] bArrP3 = null;
                byte[][] bArrP4 = null;
                int[] iArrQ = null;
                byte[][] bArrP5 = null;
                int[] iArrQ2 = null;
                byte[][] bArrP6 = null;
                while (parcel.dataPosition() < iO5) {
                    int i15 = parcel.readInt();
                    switch ((char) i15) {
                        case 2:
                            strV5 = qk.i0.v(parcel, i15);
                            break;
                        case 3:
                            bArrO3 = qk.i0.o(parcel, i15);
                            break;
                        case 4:
                            bArrP = qk.i0.p(parcel, i15);
                            break;
                        case 5:
                            bArrP2 = qk.i0.p(parcel, i15);
                            break;
                        case 6:
                            bArrP3 = qk.i0.p(parcel, i15);
                            break;
                        case 7:
                            bArrP4 = qk.i0.p(parcel, i15);
                            break;
                        case '\b':
                            iArrQ = qk.i0.q(parcel, i15);
                            break;
                        case '\t':
                            bArrP5 = qk.i0.p(parcel, i15);
                            break;
                        case '\n':
                            iArrQ2 = qk.i0.q(parcel, i15);
                            break;
                        case 11:
                            bArrP6 = qk.i0.p(parcel, i15);
                            break;
                        default:
                            qk.i0.l0(parcel, i15);
                            break;
                    }
                }
                qk.i0.D(parcel, iO5);
                return new ua(strV5, bArrO3, bArrP, bArrP2, bArrP3, bArrP4, iArrQ, bArrP5, iArrQ2, bArrP6);
            case 6:
                int iO6 = qk.i0.o0(parcel);
                boolean zA2 = false;
                int iD2 = 0;
                int iD3 = 0;
                int iD4 = 0;
                String strV6 = null;
                String strV7 = null;
                byte[] bArrO4 = null;
                double d10 = 0.0d;
                long jE3 = 0;
                while (parcel.dataPosition() < iO6) {
                    int i16 = parcel.readInt();
                    switch ((char) i16) {
                        case 2:
                            strV6 = qk.i0.v(parcel, i16);
                            break;
                        case 3:
                            jE3 = qk.i0.e0(parcel, i16);
                            break;
                        case 4:
                            zA2 = qk.i0.a0(parcel, i16);
                            break;
                        case 5:
                            qk.i0.r0(parcel, i16, 8);
                            d10 = parcel.readDouble();
                            break;
                        case 6:
                            strV7 = qk.i0.v(parcel, i16);
                            break;
                        case 7:
                            bArrO4 = qk.i0.o(parcel, i16);
                            break;
                        case '\b':
                            iD2 = qk.i0.d0(parcel, i16);
                            break;
                        case '\t':
                            iD3 = qk.i0.d0(parcel, i16);
                            break;
                        case '\n':
                            iD4 = qk.i0.d0(parcel, i16);
                            break;
                        default:
                            qk.i0.l0(parcel, i16);
                            break;
                    }
                }
                qk.i0.D(parcel, iO6);
                return new va(strV6, jE3, zA2, d10, strV7, bArrO4, iD2, iD3, iD4);
            case 7:
                int iO7 = qk.i0.o0(parcel);
                boolean zA3 = false;
                String strV8 = null;
                String strV9 = null;
                va vaVar = null;
                while (parcel.dataPosition() < iO7) {
                    int i17 = parcel.readInt();
                    char c11 = (char) i17;
                    if (c11 == 2) {
                        strV8 = qk.i0.v(parcel, i17);
                    } else if (c11 == 3) {
                        strV9 = qk.i0.v(parcel, i17);
                    } else if (c11 == 4) {
                        vaVar = (va) qk.i0.s(parcel, i17, va.CREATOR);
                    } else if (c11 != 5) {
                        qk.i0.l0(parcel, i17);
                    } else {
                        zA3 = qk.i0.a0(parcel, i17);
                    }
                }
                qk.i0.D(parcel, iO7);
                return new wa(strV8, strV9, vaVar, zA3);
            case 8:
                int iO8 = qk.i0.o0(parcel);
                ArrayList arrayListZ = null;
                while (parcel.dataPosition() < iO8) {
                    int i18 = parcel.readInt();
                    if (((char) i18) != 2) {
                        qk.i0.l0(parcel, i18);
                    } else {
                        arrayListZ = qk.i0.z(parcel, i18, wa.CREATOR);
                    }
                }
                qk.i0.D(parcel, iO8);
                return new xa(arrayListZ);
            default:
                int iO9 = qk.i0.o0(parcel);
                int iD5 = 0;
                int iD6 = 0;
                while (parcel.dataPosition() < iO9) {
                    int i19 = parcel.readInt();
                    char c12 = (char) i19;
                    if (c12 == 1) {
                        iD5 = qk.i0.d0(parcel, i19);
                    } else if (c12 != 2) {
                        qk.i0.l0(parcel, i19);
                    } else {
                        iD6 = qk.i0.d0(parcel, i19);
                    }
                }
                qk.i0.D(parcel, iO9);
                return new ya(iD5, iD6);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        switch (this.f23619a) {
            case 0:
                return new i7[i10];
            case 1:
                return new k7[i10];
            case 2:
                return new ra[i10];
            case 3:
                return new sa[i10];
            case 4:
                return new ta[i10];
            case 5:
                return new ua[i10];
            case 6:
                return new va[i10];
            case 7:
                return new wa[i10];
            case 8:
                return new xa[i10];
            default:
                return new ya[i10];
        }
    }
}
