package com.p004ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.widget.ExpandableListView;
import com.applovin.sdk.AppLovinSdk;

/* JADX INFO: loaded from: classes5.dex */
public final class fz extends gi {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2051 = 1;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f2052;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int[] f2053 = {876899140, 1146927188, -1953054979, -719796811, -388021839, -1976701550, -1063637205, 1057734438, -1403009777, -1848047982, -1721802586, -713304591, -63562722, 259654117, -1477532573, 1953018498, -200411879, -189040390};

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m2145(int[] iArr, int i2) {
        String str;
        synchronized (d.f1586) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f2053.clone();
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

    @Override // com.p004ironsource.adqualitysdk.sdk.i.gi
    /* JADX INFO: renamed from: ﻐ */
    public final String mo2138() {
        int i2 = f2052 + 71;
        f2051 = i2 % 128;
        int[] iArr = {79751219, 1750554455, -1503082718, 277275941, 402294054, 132018325, 973782822, -769394259, 2043948706, -756067783, 1939264458, 1943427811, -1706348852, -1451493715};
        return (i2 % 2 == 0 ? m2145(iArr, 13 >> ExpandableListView.getPackedPositionGroup(1L)) : m2145(iArr, ExpandableListView.getPackedPositionGroup(0L) + 28)).intern();
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.gi
    /* JADX INFO: renamed from: ﻛ */
    public final String mo2139() {
        int i2 = f2052 + 95;
        f2051 = i2 % 128;
        return (i2 % 2 == 0 ? m2145(new int[]{-1503082718, 277275941, 402294054, 132018325}, 16777224 >> Color.rgb(0, 1, 0)) : m2145(new int[]{-1503082718, 277275941, 402294054, 132018325}, Color.rgb(0, 0, 0) + 16777224)).intern();
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.gi
    /* JADX INFO: renamed from: ｋ */
    public final Class mo2140() {
        int i2 = f2051 + 95;
        f2052 = i2 % 128;
        if (i2 % 2 == 0) {
            return AppLovinSdk.class;
        }
        throw null;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.gi
    /* JADX INFO: renamed from: ﾇ */
    public final bg mo2141() {
        bi biVar = new bi(mo2139());
        int i2 = f2051 + 43;
        f2052 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 94 / 0;
        }
        return biVar;
    }
}
