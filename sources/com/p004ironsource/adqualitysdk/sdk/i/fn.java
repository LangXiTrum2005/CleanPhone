package com.p004ironsource.adqualitysdk.sdk.i;

import android.widget.ExpandableListView;

/* JADX INFO: loaded from: classes5.dex */
public final class fn extends ee {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f1991 = 0;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f1992 = 1;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static long f1993;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static fn f1994;

    static {
        m2126();
        f1994 = new fn();
        f1991 = (f1992 + 105) % 128;
    }

    public fn() {
        super(dm.m1949("", -1));
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static void m2126() {
        f1993 = 2426085221878215170L;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static synchronized fn m2127() {
        int i2 = f1991;
        fn fnVar = f1994;
        int i3 = i2 + 43;
        f1992 = i3 % 128;
        if (i3 % 2 != 0) {
            return fnVar;
        }
        int i4 = 10 / 0;
        return fnVar;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m2128(String str, int i2) {
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
                        cArr2[i3] = (char) (((long) (cArr[i3] ^ (g.f2056 * i3))) ^ f1993);
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
        f1991 = (f1992 + 37) % 128;
        String strIntern = m2128("㉬\ud83a\ue6f4貉", ExpandableListView.getPackedPositionGroup(0L) + 59981).intern();
        int i2 = f1992 + 5;
        f1991 = i2 % 128;
        if (i2 % 2 == 0) {
            return strIntern;
        }
        throw null;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.ee
    /* JADX INFO: renamed from: ｋ */
    public final du mo2050(dr drVar, cp cpVar) {
        du duVar = new du(null);
        f1991 = (f1992 + 41) % 128;
        return duVar;
    }
}
