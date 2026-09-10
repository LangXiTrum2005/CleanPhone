package com.p004ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes5.dex */
public final class eu extends en {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static long f1931 = 5534326972105450709L;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f1932 = 0;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f1933 = 1;

    public eu(ee eeVar, ee eeVar2, dm dmVar) {
        super(eeVar, eeVar2, dmVar);
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m2111(String str, int i2) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (g.f2055) {
            try {
                g.f2056 = i2;
                char[] cArr2 = new char[cArr.length];
                g.f2054 = 0;
                while (true) {
                    int i3 = g.f2054;
                    if (i3 < cArr.length) {
                        cArr2[i3] = (char) (((long) (cArr[i3] ^ (g.f2056 * i3))) ^ f1931);
                        g.f2054++;
                    } else {
                        str2 = new String(cArr2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.ef
    /* JADX INFO: renamed from: ﻐ */
    public final String mo2089() {
        int i2 = f1933 + 35;
        f1932 = i2 % 128;
        return m2111("擸", i2 % 2 != 0 ? 24862 << TextUtils.indexOf("", "") : TextUtils.indexOf("", "") + 6637).intern();
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.en
    /* JADX INFO: renamed from: ﾇ */
    public final Number mo2105(Number number, Number number2) {
        int i2 = (f1932 + 123) % 128;
        f1933 = i2;
        if (!(number instanceof Double)) {
            f1932 = (i2 + 97) % 128;
            if (!(number2 instanceof Double)) {
                if (!(number instanceof Long)) {
                    int i3 = i2 + 77;
                    f1932 = i3 % 128;
                    if (i3 % 2 != 0) {
                        boolean z2 = number2 instanceof Long;
                        throw null;
                    }
                    if (!(number2 instanceof Long)) {
                        Integer numValueOf = Integer.valueOf(number.intValue() - number2.intValue());
                        int i4 = f1933 + 75;
                        f1932 = i4 % 128;
                        if (i4 % 2 == 0) {
                            return numValueOf;
                        }
                        throw null;
                    }
                }
                return Long.valueOf(number.longValue() - number2.longValue());
            }
        }
        return Double.valueOf(number.doubleValue() - number2.doubleValue());
    }
}
