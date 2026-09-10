package com.p004ironsource.adqualitysdk.sdk.i;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes5.dex */
public final class ep extends eo {

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f1917 = 1;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f1918 = 0;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static long f1919 = 1647880768321327986L;

    public ep(ee eeVar, ee eeVar2, dm dmVar) {
        super(eeVar, eeVar2, dmVar);
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m2107(String str, int i2) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (f.f1955) {
            try {
                char[] cArrM2116 = f.m2116(f1919, cArr, i2);
                f.f1954 = 4;
                while (true) {
                    int i3 = f.f1954;
                    if (i3 < cArrM2116.length) {
                        int i4 = i3 - 4;
                        f.f1953 = i4;
                        cArrM2116[i3] = (char) (((long) (cArrM2116[i3] ^ cArrM2116[i3 % 4])) ^ (((long) i4) * f1919));
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

    @Override // com.p004ironsource.adqualitysdk.sdk.i.ef
    /* JADX INFO: renamed from: ﻐ */
    public final String mo2089() {
        f1918 = (f1917 + 125) % 128;
        String strIntern = m2107("ꈍꈳ읔曞脘", (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1).intern();
        f1917 = (f1918 + 45) % 128;
        return strIntern;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.ek
    /* JADX INFO: renamed from: ﻛ */
    public final boolean mo2099(int i2) {
        int i3 = f1918;
        int i4 = i3 + 53;
        f1917 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        if (i2 <= 0) {
            return false;
        }
        f1917 = (i3 + 101) % 128;
        return true;
    }
}
