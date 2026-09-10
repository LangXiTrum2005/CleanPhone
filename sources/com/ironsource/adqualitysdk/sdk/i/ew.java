package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class ew extends ey {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static long f2007 = -5454280642948135403L;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2008 = 1;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2009;

    public ew(ef efVar, ef efVar2) {
        super(efVar, efVar2);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ey
    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final Number mo2199(Number number, Number number2) {
        f2009 = (f2008 + 63) % 128;
        if ((number instanceof Double) || (number2 instanceof Double)) {
            Double dValueOf = Double.valueOf(number.doubleValue() / number2.doubleValue());
            int i10 = f2009 + 33;
            f2008 = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 67 / 0;
            }
            return dValueOf;
        }
        if ((number instanceof Long) || (number2 instanceof Long)) {
            return Long.valueOf(number.longValue() / number2.longValue());
        }
        Integer numValueOf = Integer.valueOf(number.intValue() / number2.intValue());
        f2009 = (f2008 + 47) % 128;
        return numValueOf;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.em
    /* JADX INFO: renamed from: ﾇ */
    public final String mo2179() {
        f2009 = (f2008 + 125) % 128;
        String strIntern = m2198("ﾀﾯ燚ᓕﱮ", TextUtils.indexOf("", "") + 1).intern();
        f2008 = (f2009 + 55) % 128;
        return strIntern;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m2198(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (g.f2127) {
            try {
                char[] cArrM2229 = g.m2229(f2007, cArr, i10);
                g.f2129 = 4;
                while (true) {
                    int i11 = g.f2129;
                    if (i11 < cArrM2229.length) {
                        int i12 = i11 - 4;
                        g.f2128 = i12;
                        cArrM2229[i11] = (char) (((long) (cArrM2229[i11] ^ cArrM2229[i11 % 4])) ^ (((long) i12) * f2007));
                        g.f2129 = i11 + 1;
                    } else {
                        str2 = new String(cArrM2229, 4, cArrM2229.length - 4);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }
}
