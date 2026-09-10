package com.p004ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import android.util.TypedValue;

/* JADX INFO: loaded from: classes5.dex */
public final class fo extends fs {

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f1995 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char f1996 = 15483;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char f1997 = 25611;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f1998 = 0;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char f1999 = 24013;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char f2000 = 64362;

    public fo(ee eeVar) {
        super(eeVar);
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m2129(String str, int i2) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (m.f2870) {
            try {
                char[] cArr2 = new char[cArr.length];
                m.f2869 = 0;
                char[] cArr3 = new char[2];
                while (true) {
                    int i3 = m.f2869;
                    if (i3 < cArr.length) {
                        cArr3[0] = cArr[i3];
                        cArr3[1] = cArr[i3 + 1];
                        int i4 = 58224;
                        for (int i5 = 0; i5 < 16; i5++) {
                            char c2 = cArr3[1];
                            char c3 = cArr3[0];
                            char c4 = (char) (c2 - (((c3 + i4) ^ ((c3 << 4) + f1997)) ^ ((c3 >>> 5) + f1999)));
                            cArr3[1] = c4;
                            cArr3[0] = (char) (c3 - (((c4 >>> 5) + f1996) ^ ((c4 + i4) ^ ((c4 << 4) + f2000))));
                            i4 -= 40503;
                        }
                        int i6 = m.f2869;
                        cArr2[i6] = cArr3[0];
                        cArr2[i6 + 1] = cArr3[1];
                        m.f2869 = i6 + 2;
                    } else {
                        str2 = new String(cArr2, 0, i2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.fs
    public final String toString() {
        f1998 = (f1995 + 31) % 128;
        if (m2134() == null) {
            return m2129("\uf343篝㦏雏蚷\ud884蓗⻁", 7 - TextUtils.getOffsetBefore("", 0)).intern();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(m2129("\uf343篝㦏雏蚷\ud884\u009f\ue5f2", (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 7).intern());
        sb.append(super.toString());
        String string = sb.toString();
        int i2 = f1998 + 95;
        f1995 = i2 % 128;
        if (i2 % 2 != 0) {
            return string;
        }
        throw null;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.fs, com.p004ironsource.adqualitysdk.sdk.i.fq
    /* JADX INFO: renamed from: ｋ */
    public final du mo2122(dr drVar, cp cpVar) {
        f1998 = (f1995 + 85) % 128;
        du duVarMo2122 = super.mo2122(drVar, cpVar);
        duVarMo2122.m2045(true);
        int i2 = f1998 + 71;
        f1995 = i2 % 128;
        if (i2 % 2 != 0) {
            return duVarMo2122;
        }
        throw null;
    }
}
