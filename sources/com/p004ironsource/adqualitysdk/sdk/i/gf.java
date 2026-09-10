package com.p004ironsource.adqualitysdk.sdk.i;

import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.chartboost.sdk.Chartboost;

/* JADX INFO: loaded from: classes5.dex */
public final class gf extends gi {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2087 = 1;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int[] f2088 = {-434099454, -1457314231, -771968179, 2109500617, 2083488763, 70541128, -1564886261, 1065077304, 2146015993, 1994559323, 413903266, -11670557, 1987381323, -1999253732, 504038993, 1866668567, -297737277, -1383919022};

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2089;

    @Override // com.p004ironsource.adqualitysdk.sdk.i.gi
    /* JADX INFO: renamed from: ﻐ */
    public final String mo2138() {
        int i2 = f2089 + 93;
        f2087 = i2 % 128;
        String strIntern = (i2 % 2 == 0 ? m2153(new int[]{1554642595, 579330174, 1046953025, 1122549119, -774843644, -118747119, -438133716, 839537002, 42495053, -1163823665, 965989419, 207482137, 540021634, 1949288395, -1254625314, 876548152}, 85 / (ViewConfiguration.getFadingEdgeLength() * 109)) : m2153(new int[]{1554642595, 579330174, 1046953025, 1122549119, -774843644, -118747119, -438133716, 839537002, 42495053, -1163823665, 965989419, 207482137, 540021634, 1949288395, -1254625314, 876548152}, 29 - (ViewConfiguration.getFadingEdgeLength() >> 16))).intern();
        f2087 = (f2089 + 57) % 128;
        return strIntern;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.gi
    /* JADX INFO: renamed from: ﻛ */
    public final String mo2139() {
        int i2 = f2089 + 107;
        f2087 = i2 % 128;
        int[] iArr = {1046953025, 1122549119, -774843644, -118747119, 469757485, 948759487};
        String strIntern = (i2 % 2 == 0 ? m2153(iArr, 2 >>> (KeyEvent.getMaxKeyCode() % 96)) : m2153(iArr, 10 - (KeyEvent.getMaxKeyCode() >> 16))).intern();
        f2087 = (f2089 + 5) % 128;
        return strIntern;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.gi
    /* JADX INFO: renamed from: ｋ */
    public final Class mo2140() {
        int i2 = f2087 + 33;
        f2089 = i2 % 128;
        if (i2 % 2 == 0) {
            return Chartboost.class;
        }
        throw null;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.gi
    /* JADX INFO: renamed from: ﾇ */
    public final bg mo2141() {
        bk bkVar = new bk(mo2139());
        int i2 = f2087 + 27;
        f2089 = i2 % 128;
        if (i2 % 2 == 0) {
            return bkVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m2153(int[] iArr, int i2) {
        String str;
        synchronized (d.f1586) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f2088.clone();
                d.f1584 = 0;
                while (true) {
                    int i3 = d.f1584;
                    if (i3 < iArr.length) {
                        int i4 = iArr[i3];
                        char c2 = (char) (i4 >> 16);
                        cArr[0] = c2;
                        char c3 = (char) i4;
                        cArr[1] = c3;
                        char c4 = (char) (iArr[i3 + 1] >> 16);
                        cArr[2] = c4;
                        char c5 = (char) iArr[i3 + 1];
                        cArr[3] = c5;
                        d.f1587 = (c2 << 16) + c3;
                        d.f1585 = (c4 << 16) + c5;
                        d.m1788(iArr2);
                        for (int i5 = 0; i5 < 16; i5++) {
                            int i6 = d.f1587 ^ iArr2[i5];
                            d.f1587 = i6;
                            int iM1787 = d.m1787(i6) ^ d.f1585;
                            int i7 = d.f1587;
                            d.f1587 = iM1787;
                            d.f1585 = i7;
                        }
                        int i8 = d.f1587;
                        int i9 = d.f1585;
                        d.f1587 = i9;
                        d.f1585 = i8;
                        int i10 = i8 ^ iArr2[16];
                        d.f1585 = i10;
                        int i11 = i9 ^ iArr2[17];
                        d.f1587 = i11;
                        cArr[0] = (char) (i11 >>> 16);
                        cArr[1] = (char) i11;
                        cArr[2] = (char) (i10 >>> 16);
                        cArr[3] = (char) i10;
                        d.m1788(iArr2);
                        int i12 = d.f1584;
                        cArr2[i12 << 1] = cArr[0];
                        cArr2[(i12 << 1) + 1] = cArr[1];
                        cArr2[(i12 << 1) + 2] = cArr[2];
                        cArr2[(i12 << 1) + 3] = cArr[3];
                        d.f1584 = i12 + 2;
                    } else {
                        str = new String(cArr2, 0, i2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
