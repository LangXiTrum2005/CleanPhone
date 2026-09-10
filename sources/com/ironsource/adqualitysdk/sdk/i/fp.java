package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.ImageFormat;
import com.ironsource.InterfaceC0435l1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class fp extends ef {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static final fp f2071;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static long f2072 = 0;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2073 = 1;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2074;

    static {
        m2215();
        f2071 = new fp();
        f2074 = (f2073 + 53) % 128;
    }

    private fp() {
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static synchronized fp m2213() {
        fp fpVar;
        int i10 = (f2074 + InterfaceC0435l1.d.b.f29105b) % 128;
        f2073 = i10;
        fpVar = f2071;
        f2074 = (i10 + 15) % 128;
        return fpVar;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m2214(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (g.f2127) {
            try {
                char[] cArrM2229 = g.m2229(f2072, cArr, i10);
                g.f2129 = 4;
                while (true) {
                    int i11 = g.f2129;
                    if (i11 < cArrM2229.length) {
                        int i12 = i11 - 4;
                        g.f2128 = i12;
                        cArrM2229[i11] = (char) (((long) (cArrM2229[i11] ^ cArrM2229[i11 % 4])) ^ (((long) i12) * f2072));
                        g.f2129 = i11 + 1;
                    } else {
                        str2 = new String(cArrM2229, 4, cArrM2229.length - 4);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static void m2215() {
        f2072 = -3084995345519002236L;
    }

    public final String toString() {
        int i10 = f2073 + 9;
        f2074 = i10 % 128;
        return (i10 % 2 != 0 ? m2214("浩\ua83b洇ᛆ\udfad闊涢杍", (-1) >>> ImageFormat.getBitsPerPixel(0)) : m2214("浩\ua83b洇ᛆ\udfad闊涢杍", (-1) - ImageFormat.getBitsPerPixel(0))).intern();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ef
    /* JADX INFO: renamed from: ｋ */
    public final ea mo2164(ee eeVar, cl clVar) {
        ea eaVar = new ea(null);
        int i10 = f2074 + 97;
        f2073 = i10 % 128;
        if (i10 % 2 != 0) {
            return eaVar;
        }
        throw null;
    }
}
