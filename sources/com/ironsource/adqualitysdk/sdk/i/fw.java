package com.ironsource.adqualitysdk.sdk.i;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class fw extends gb {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2100 = 0;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int[] f2101 = {-598734277, -252066075, -83151014, 1388977281, 1834245808, 489114282, 1416558927, 826642654, -341318833, 288524756, 2108818476, -338004689, -227303124, -707481186, -1659170128, 883089213, -552432623, 39096654};

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2102 = 1;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m2223(int[] iArr, int i10) {
        String str;
        synchronized (a.f61) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f2101.clone();
                a.f58 = 0;
                while (true) {
                    int i11 = a.f58;
                    if (i11 < iArr.length) {
                        int i12 = iArr[i11];
                        char c4 = (char) (i12 >> 16);
                        cArr[0] = c4;
                        char c5 = (char) i12;
                        cArr[1] = c5;
                        char c10 = (char) (iArr[i11 + 1] >> 16);
                        cArr[2] = c10;
                        char c11 = (char) iArr[i11 + 1];
                        cArr[3] = c11;
                        a.f59 = (c4 << 16) + c5;
                        a.f60 = (c10 << 16) + c11;
                        a.m199(iArr2);
                        for (int i13 = 0; i13 < 16; i13++) {
                            int i14 = a.f59 ^ iArr2[i13];
                            a.f59 = i14;
                            int iM200 = a.m200(i14) ^ a.f60;
                            int i15 = a.f59;
                            a.f59 = iM200;
                            a.f60 = i15;
                        }
                        int i16 = a.f59;
                        int i17 = a.f60;
                        a.f59 = i17;
                        a.f60 = i16;
                        int i18 = i16 ^ iArr2[16];
                        a.f60 = i18;
                        int i19 = i17 ^ iArr2[17];
                        a.f59 = i19;
                        cArr[0] = (char) (i19 >>> 16);
                        cArr[1] = (char) i19;
                        cArr[2] = (char) (i18 >>> 16);
                        cArr[3] = (char) i18;
                        a.m199(iArr2);
                        int i20 = a.f58;
                        cArr2[i20 << 1] = cArr[0];
                        cArr2[(i20 << 1) + 1] = cArr[1];
                        cArr2[(i20 << 1) + 2] = cArr[2];
                        cArr2[(i20 << 1) + 3] = cArr[3];
                        a.f58 = i20 + 2;
                    } else {
                        str = new String(cArr2, 0, i10);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }

    public final String toString() {
        int i10 = f2102 + 61;
        f2100 = i10 % 128;
        return (i10 % 2 != 0 ? m2223(new int[]{1120664443, 1538025312, -367954936, -1006971305, -1928813356, 589560066}, 41 % View.MeasureSpec.getMode(0)) : m2223(new int[]{1120664443, 1538025312, -367954936, -1006971305, -1928813356, 589560066}, 9 - View.MeasureSpec.getMode(0))).intern();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gb
    /* JADX INFO: renamed from: ﻐ */
    public final ea mo2220(ee eeVar, cl clVar) {
        ea eaVar = new ea(null);
        eaVar.m2119();
        int i10 = f2102 + 91;
        f2100 = i10 % 128;
        if (i10 % 2 == 0) {
            return eaVar;
        }
        throw null;
    }
}
