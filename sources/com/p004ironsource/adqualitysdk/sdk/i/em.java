package com.p004ironsource.adqualitysdk.sdk.i;

import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes5.dex */
public final class em extends ef {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static long f1913 = -334442904899499428L;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f1914 = 0;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f1915 = 1;

    public em(ee eeVar, ee eeVar2, dm dmVar) {
        super(eeVar, eeVar2, dmVar);
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.ef
    /* JADX INFO: renamed from: ﻐ */
    public final String mo2089() {
        int i2 = f1914 + 77;
        f1915 = i2 % 128;
        String strIntern = m2104("⪅赑⪣䜫牠⮒", i2 % 2 == 0 ? ViewConfiguration.getWindowTouchSlop() - 95 : ViewConfiguration.getWindowTouchSlop() >> 8).intern();
        f1915 = (f1914 + 99) % 128;
        return strIntern;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.ee
    /* JADX INFO: renamed from: ｋ */
    public final du mo2050(dr drVar, cp cpVar) {
        return new du(Boolean.valueOf(m2091().m2086(drVar, cpVar).m2047() && m2090().m2086(drVar, cpVar).m2047()));
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m2104(String str, int i2) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (f.f1955) {
            try {
                char[] cArrM2116 = f.m2116(f1913, cArr, i2);
                f.f1954 = 4;
                while (true) {
                    int i3 = f.f1954;
                    if (i3 < cArrM2116.length) {
                        int i4 = i3 - 4;
                        f.f1953 = i4;
                        cArrM2116[i3] = (char) (((long) (cArrM2116[i3] ^ cArrM2116[i3 % 4])) ^ (((long) i4) * f1913));
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
