package com.p004ironsource.adqualitysdk.sdk.i;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes5.dex */
public final class et extends en {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static long f1928 = -6617615807080026943L;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f1929 = 1;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f1930;

    public et(ee eeVar, ee eeVar2, dm dmVar) {
        super(eeVar, eeVar2, dmVar);
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.ef
    /* JADX INFO: renamed from: ﻐ */
    public final String mo2089() {
        f1929 = (f1930 + 25) % 128;
        String strIntern = m2110("\ueecd\ueee2汮ᇻ\udefa", (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))).intern();
        int i2 = f1929 + 27;
        f1930 = i2 % 128;
        if (i2 % 2 == 0) {
            return strIntern;
        }
        throw null;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.en
    /* JADX INFO: renamed from: ﾇ */
    public final Number mo2105(Number number, Number number2) {
        int i2 = (f1929 + 53) % 128;
        f1930 = i2;
        if (!(number instanceof Double)) {
            f1929 = (i2 + 59) % 128;
            if (!(number2 instanceof Double)) {
                if (!(number instanceof Long) && !(number2 instanceof Long)) {
                    return Integer.valueOf(number.intValue() / number2.intValue());
                }
                Long lValueOf = Long.valueOf(number.longValue() / number2.longValue());
                f1930 = (f1929 + 99) % 128;
                return lValueOf;
            }
        }
        return Double.valueOf(number.doubleValue() / number2.doubleValue());
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m2110(String str, int i2) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (f.f1955) {
            try {
                char[] cArrM2116 = f.m2116(f1928, cArr, i2);
                f.f1954 = 4;
                while (true) {
                    int i3 = f.f1954;
                    if (i3 < cArrM2116.length) {
                        int i4 = i3 - 4;
                        f.f1953 = i4;
                        cArrM2116[i3] = (char) (((long) (cArrM2116[i3] ^ cArrM2116[i3 % 4])) ^ (((long) i4) * f1928));
                        f.f1954 = i3 + 1;
                    } else {
                        str2 = new String(cArrM2116, 4, cArrM2116.length - 4);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }
}
