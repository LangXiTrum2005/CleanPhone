package com.p004ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes5.dex */
public final class fm extends fq {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f1988 = 0;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f1989 = 1;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static long f1990 = 6840138081520209287L;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m2125(String str, int i2) {
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
                        cArr2[i3] = (char) (((long) (cArr[i3] ^ (g.f2056 * i3))) ^ f1990);
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

    public final String toString() {
        f1988 = (f1989 + 13) % 128;
        String strIntern = m2125("䷥헎綔蕗ⴀ뒛", TextUtils.getOffsetAfter("", 0) + 38971).intern();
        f1989 = (f1988 + 15) % 128;
        return strIntern;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.fq
    /* JADX INFO: renamed from: ｋ */
    public final du mo2122(dr drVar, cp cpVar) {
        du duVar = new du(null);
        duVar.m2041();
        f1989 = (f1988 + 97) % 128;
        return duVar;
    }
}
