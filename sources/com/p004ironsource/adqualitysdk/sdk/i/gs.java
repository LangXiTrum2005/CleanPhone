package com.p004ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import android.widget.ExpandableListView;
import net.pubnative.lite.sdk.HyBid;

/* JADX INFO: loaded from: classes5.dex */
public final class gs extends gi {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2144 = 0;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f2145 = 1;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int[] f2146 = {2013760218, 934759908, 1557682066, -308299489, -1257502641, 224526825, -471246202, -213778916, 1753786807, -1794159897, -766658886, -764257837, -2048462426, 890836688, 702450842, 264781632, 2082252847, 76831733};

    @Override // com.p004ironsource.adqualitysdk.sdk.i.gi
    /* JADX INFO: renamed from: ﻐ */
    public final String mo2138() {
        f2144 = (f2145 + 53) % 128;
        String strIntern = m2168(new int[]{-2124760158, 111146802, 565358376, -483624199, 1281634192, -1276368609, 1146758292, 1037720993, -338308489, 416421076, 2008065100, 1445628070, 1037282153, 776900434}, 28 - TextUtils.indexOf("", "", 0, 0)).intern();
        f2144 = (f2145 + 123) % 128;
        return strIntern;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.gi
    /* JADX INFO: renamed from: ﻛ */
    public final String mo2139() {
        f2144 = (f2145 + 43) % 128;
        String strIntern = m2168(new int[]{565358376, -483624199, 1281634192, -1276368609, -353276556, 828725604}, 9 - ExpandableListView.getPackedPositionType(0L)).intern();
        int i2 = f2144 + 35;
        f2145 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 87 / 0;
        }
        return strIntern;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.gi
    /* JADX INFO: renamed from: ｋ */
    public final Class mo2140() {
        int i2 = f2144 + 79;
        f2145 = i2 % 128;
        if (i2 % 2 != 0) {
            return HyBid.class;
        }
        throw null;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.gi
    /* JADX INFO: renamed from: ﾇ */
    public final bg mo2141() {
        bz bzVar = new bz(mo2139());
        int i2 = f2145 + 15;
        f2144 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 8 / 0;
        }
        return bzVar;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m2168(int[] iArr, int i2) {
        String str;
        synchronized (d.f1586) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f2146.clone();
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
