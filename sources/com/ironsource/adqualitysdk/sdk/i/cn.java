package com.ironsource.adqualitysdk.sdk.i;

import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.f2;
import com.ironsource.InterfaceC0435l1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class cn {

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f1466 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char f1467 = 51068;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char f1468 = 61710;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char f1469 = 1805;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f1470 = 0;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char f1471 = 24949;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static void m1706(String str, String str2) {
        f1466 = (f1470 + 59) % 128;
        m1710(str, str2, null, null);
        f1470 = (f1466 + 59) % 128;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static void m1710(String str, String str2, Throwable th2, dn dnVar) {
        kl.m2902(f2.k(m1709("\u0b79巧鶶㨈", 5 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), str, new StringBuilder()), str2, Integer.toHexString(str2.hashCode()), th2, dnVar, null, false);
        f1470 = (f1466 + 35) % 128;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static void m1711(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m1709("\u0b79巧磂腚", TextUtils.getOffsetAfter("", 0) + 4).intern());
        sb2.append(str);
        m.m2987(sb2.toString(), str2);
        int i10 = f1470 + 55;
        f1466 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static void m1708(String str, String str2, Throwable th2) {
        int i10 = f1466 + InterfaceC0435l1.d.b.f29114k;
        f1470 = i10 % 128;
        int i11 = i10 % 2;
        m1710(str, str2, th2, null);
        if (i11 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static void m1707(String str, String str2, dn dnVar) {
        int i10 = f1466 + 115;
        f1470 = i10 % 128;
        int i11 = i10 % 2;
        m1710(str, str2, null, dnVar);
        if (i11 != 0) {
            throw null;
        }
        int i12 = f1466 + 3;
        f1470 = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m1709(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (o.f3076) {
            try {
                char[] cArr2 = new char[cArr.length];
                o.f3077 = 0;
                char[] cArr3 = new char[2];
                while (true) {
                    int i11 = o.f3077;
                    if (i11 < cArr.length) {
                        cArr3[0] = cArr[i11];
                        cArr3[1] = cArr[i11 + 1];
                        int i12 = 58224;
                        for (int i13 = 0; i13 < 16; i13++) {
                            char c4 = cArr3[1];
                            char c5 = cArr3[0];
                            char c10 = (char) (c4 - (((c5 + i12) ^ ((c5 << 4) + f1469)) ^ ((c5 >>> 5) + f1467)));
                            cArr3[1] = c10;
                            cArr3[0] = (char) (c5 - (((c10 >>> 5) + f1468) ^ ((c10 + i12) ^ ((c10 << 4) + f1471))));
                            i12 -= 40503;
                        }
                        int i14 = o.f3077;
                        cArr2[i14] = cArr3[0];
                        cArr2[i14 + 1] = cArr3[1];
                        o.f3077 = i14 + 2;
                    } else {
                        str2 = new String(cArr2, 0, i10);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }
}
