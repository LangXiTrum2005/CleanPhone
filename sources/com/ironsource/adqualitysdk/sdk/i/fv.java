package com.ironsource.adqualitysdk.sdk.i;

import android.widget.ExpandableListView;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class fv extends gb {

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f2094 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2095 = 0;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char f2096 = 18148;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char f2097 = 35462;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char f2098 = 48768;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char f2099 = 57485;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m2222(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (o.f3076) {
            try {
                char[] cArr2 = new char[cArr.length];
                o.f3077 = 0;
                char[] cArr3 = new char[2];
                while (true) {
                    int i11 = o.f3077;
                    if (i11 < cArr.length) {
                        cArr3[0] = cArr[i11];
                        cArr3[1] = cArr[i11 + 1];
                        int i12 = 58224;
                        for (int i13 = 0; i13 < 16; i13++) {
                            char c4 = cArr3[1];
                            char c5 = cArr3[0];
                            char c10 = (char) (c4 - (((c5 + i12) ^ ((c5 << 4) + f2097)) ^ ((c5 >>> 5) + f2099)));
                            cArr3[1] = c10;
                            cArr3[0] = (char) (c5 - (((c10 >>> 5) + f2096) ^ ((c10 + i12) ^ ((c10 << 4) + f2098))));
                            i12 -= 40503;
                        }
                        int i14 = o.f3077;
                        cArr2[i14] = cArr3[0];
                        cArr2[i14 + 1] = cArr3[1];
                        o.f3077 = i14 + 2;
                    } else {
                        str2 = new String(cArr2, 0, i10);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    public final String toString() {
        int i10 = f2095 + 93;
        f2094 = i10 % 128;
        String strIntern = m2222("龰႞仫蘶ᳺ廜", i10 % 2 == 0 ? 115 - (ExpandableListView.getPackedPositionForChild(1, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(1, 0) == 0L ? 0 : -1)) : (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 7).intern();
        f2094 = (f2095 + 77) % 128;
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gb
    /* JADX INFO: renamed from: ﻐ */
    public final ea mo2220(ee eeVar, cl clVar) {
        ea eaVar = new ea(null);
        eaVar.m2118();
        int i10 = f2094 + 49;
        f2095 = i10 % 128;
        if (i10 % 2 == 0) {
            return eaVar;
        }
        throw null;
    }
}
