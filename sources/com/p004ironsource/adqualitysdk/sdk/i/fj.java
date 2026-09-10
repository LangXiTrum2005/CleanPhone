package com.p004ironsource.adqualitysdk.sdk.i;

import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes5.dex */
public final class fj extends fq {

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f1975 = 1;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static long f1976 = 1808670216826910144L;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f1977;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m2121(String str, int i2) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (f.f1955) {
            try {
                char[] cArrM2116 = f.m2116(f1976, cArr, i2);
                f.f1954 = 4;
                while (true) {
                    int i3 = f.f1954;
                    if (i3 < cArrM2116.length) {
                        int i4 = i3 - 4;
                        f.f1953 = i4;
                        cArrM2116[i3] = (char) (((long) (cArrM2116[i3] ^ cArrM2116[i3 % 4])) ^ (((long) i4) * f1976));
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

    public final String toString() {
        f1975 = (f1977 + 101) % 128;
        String strIntern = m2121("䩽뢅ቝᎩ䨞䴪靈\uf29d鴔琫킨ꮌ\ue446", ViewConfiguration.getKeyRepeatDelay() >> 16).intern();
        int i2 = f1977 + 67;
        f1975 = i2 % 128;
        if (i2 % 2 != 0) {
            return strIntern;
        }
        throw null;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.fq
    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final du mo2122(dr drVar, cp cpVar) {
        du duVar = new du(null);
        duVar.m2042();
        int i2 = f1977 + 115;
        f1975 = i2 % 128;
        if (i2 % 2 != 0) {
            return duVar;
        }
        throw null;
    }
}
