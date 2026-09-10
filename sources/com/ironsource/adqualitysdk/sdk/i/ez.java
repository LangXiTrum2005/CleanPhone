package com.ironsource.adqualitysdk.sdk.i;

import android.widget.ExpandableListView;
import com.google.android.gms.internal.measurement.f2;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class ez extends ef {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2011 = 1;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f2012;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int[] f2013 = {-1714963948, 474887842, -78687186, -411686627, 1869695202, -258090639, -1683639541, 1988691961, -227722451, -676888897, 1045490908, 184116841, 1505269328, -69759961, -1713389253, -826280666, 1765738073, -1645437719};

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private eq f2014;

    public ez(eq eqVar) {
        this.f2014 = eqVar;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m2200(int[] iArr, int i10) {
        String str;
        synchronized (a.f61) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f2013.clone();
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
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f2014.toString());
        String strM = f2.m(sb2, m2200(new int[]{1434514374, -525193839}, 2 - ExpandableListView.getPackedPositionType(0L)));
        int i10 = f2011 + 59;
        f2012 = i10 % 128;
        if (i10 % 2 == 0) {
            return strM;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ef
    /* JADX INFO: renamed from: ｋ */
    public final ea mo2164(ee eeVar, cl clVar) {
        ea eaVarM2165;
        String strM2189;
        int iIntValue;
        int i10 = f2011 + 71;
        f2012 = i10 % 128;
        if (i10 % 2 != 0) {
            eaVarM2165 = this.f2014.m2165(eeVar, clVar);
            Number numberM2121 = eaVarM2165.m2121();
            strM2189 = this.f2014.m2189();
            iIntValue = numberM2121.intValue() >>> 1;
        } else {
            eaVarM2165 = this.f2014.m2165(eeVar, clVar);
            Number numberM2122 = eaVarM2165.m2121();
            strM2189 = this.f2014.m2189();
            iIntValue = numberM2122.intValue() + 1;
        }
        eeVar.m2152(strM2189, Integer.valueOf(iIntValue));
        return eaVarM2165;
    }
}
