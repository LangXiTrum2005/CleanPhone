package com.ironsource.adqualitysdk.sdk.i;

import android.view.ViewConfiguration;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class fg extends ey {

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static long f2047 = -1491163008681807620L;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2048 = 1;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2049;

    public fg(ef efVar, ef efVar2) {
        super(efVar, efVar2);
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m2207(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (i.f2435) {
            try {
                i.f2436 = i10;
                char[] cArr2 = new char[cArr.length];
                i.f2434 = 0;
                while (true) {
                    int i11 = i.f2434;
                    if (i11 < cArr.length) {
                        cArr2[i11] = (char) (((long) (cArr[i11] ^ (i.f2436 * i11))) ^ f2047);
                        i.f2434++;
                    } else {
                        str2 = new String(cArr2);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ey
    /* JADX INFO: renamed from: ﻛ */
    public final Number mo2199(Number number, Number number2) {
        if (!(number instanceof Double)) {
            int i10 = f2048 + 71;
            int i11 = i10 % 128;
            f2049 = i11;
            if (i10 % 2 != 0) {
                throw null;
            }
            if (!(number2 instanceof Double)) {
                if (!(number instanceof Long)) {
                    f2048 = (i11 + 75) % 128;
                    if (!(number2 instanceof Long)) {
                        Integer numValueOf = Integer.valueOf(number.intValue() % number2.intValue());
                        f2049 = (f2048 + 95) % 128;
                        return numValueOf;
                    }
                }
                return Long.valueOf(number.longValue() % number2.longValue());
            }
        }
        return Double.valueOf(number.doubleValue() % number2.doubleValue());
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.em
    /* JADX INFO: renamed from: ﾇ */
    public final String mo2179() {
        int i10 = f2048 + 95;
        f2049 = i10 % 128;
        return m2207("烙", i10 % 2 != 0 ? 42209 / (ViewConfiguration.getKeyRepeatDelay() - 123) : 42209 - (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern();
    }
}
