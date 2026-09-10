package com.p004ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import com.google.firebase.crashlytics.internal.model.a;

/* JADX INFO: loaded from: classes5.dex */
public final class cq {

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f1451 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char f1452 = 20953;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f1453 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char f1454 = 17357;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char f1455 = 47066;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char f1456 = 10150;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static void m1676(String str, String str2, Throwable th) {
        f1453 = (f1451 + 3) % 128;
        m1679(str, str2, th);
        int i2 = f1453 + 57;
        f1451 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static void m1678(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(m1677("ꏹ娮\ue0de〭", TextUtils.indexOf("", "", 0) + 4).intern());
        sb.append(str);
        n.m2840(sb.toString(), str2);
        f1451 = (f1453 + 7) % 128;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static void m1679(String str, String str2, Throwable th) {
        kb.m2747(a.n(new StringBuilder(), m1677("ꏹ娮龈ꢺ", TextUtils.getOffsetBefore("", 0) + 4), str), str2, Integer.toHexString(str2.hashCode()), th, null, false);
        int i2 = f1453 + 123;
        f1451 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m1677(String str, int i2) {
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
                            char c4 = (char) (c2 - (((c3 + i4) ^ ((c3 << 4) + f1456)) ^ ((c3 >>> 5) + f1452)));
                            cArr3[1] = c4;
                            cArr3[0] = (char) (c3 - (((c4 >>> 5) + f1455) ^ ((c4 + i4) ^ ((c4 << 4) + f1454))));
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
}
