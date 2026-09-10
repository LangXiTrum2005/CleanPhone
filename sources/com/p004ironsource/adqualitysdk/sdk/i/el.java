package com.p004ironsource.adqualitysdk.sdk.i;

import android.view.ViewConfiguration;
import com.startapp.simple.bloomfilter.codec.CharEncoding;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes5.dex */
public final class el extends ee {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f1906 = 1;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f1907 = 0;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static boolean f1908 = true;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f1909 = 286;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static boolean f1910 = true;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char[] f1911 = {355, 400, 397, 318, 387, 404, 383, 394, 403, 402, 391, 396, 389, 406, 398, 401};

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private String f1912;

    public el(String str, dm dmVar) {
        super(dmVar);
        this.f1912 = dw.m2051(str);
    }

    public final boolean equals(Object obj) {
        int i2 = f1907;
        int i3 = i2 + 77;
        f1906 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        f1906 = (i2 + 119) % 128;
        if (el.class != obj.getClass()) {
            return false;
        }
        boolean zEquals = this.f1912.equals(((el) obj).f1912);
        f1906 = (f1907 + 33) % 128;
        return zEquals;
    }

    public final int hashCode() {
        int i2 = f1906 + 77;
        f1907 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.f1912;
        if (str == null) {
            return 0;
        }
        int iHashCode = str.hashCode();
        f1907 = (f1906 + 57) % 128;
        return iHashCode;
    }

    public final String toString() {
        f1906 = (f1907 + 123) % 128;
        String strM2103 = m2103();
        int i2 = f1907 + 7;
        f1906 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 60 / 0;
        }
        return strM2103;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.ee
    /* JADX INFO: renamed from: ｋ */
    public final du mo2050(dr drVar, cp cpVar) {
        try {
            return new du(drVar.m1984(m2103()));
        } catch (Exception e2) {
            dt dtVarM1623 = cpVar.m1623(m2103());
            if (dtVarM1623 != null) {
                du duVar = new du(dtVarM1623);
                int i2 = f1906 + 29;
                f1907 = i2 % 128;
                if (i2 % 2 == 0) {
                    return duVar;
                }
                throw null;
            }
            String strM1616 = cpVar.m1616();
            StringBuilder sb = new StringBuilder();
            sb.append(m2102(null, null, (ViewConfiguration.getWindowTouchSlop() >> 8) + 127, "\u0084\u008c\u0083\u008b\u0090\u0090\u0085\u0082\u008f\u008e\u0085\u0084\u008d\u008c\u008b\u008a\u0087\u0089\u0088\u0087\u0086\u0085\u0084\u0082\u0083\u0082\u0082\u0081").intern());
            sb.append(this);
            sb.append(m2085());
            cq.m1676(strM1616, sb.toString(), e2);
            return new du(null);
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final String m2103() {
        int i2 = f1906;
        String str = this.f1912;
        f1907 = (i2 + 85) % 128;
        return str;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m2102(String str, int[] iArr, int i2, String str2) throws UnsupportedEncodingException {
        Object bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes(CharEncoding.ISO_8859_1);
        }
        byte[] bArr = (byte[]) bytes;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (o.f2877) {
            try {
                char[] cArr2 = f1911;
                int i3 = f1909;
                if (f1910) {
                    int length = bArr.length;
                    o.f2878 = length;
                    char[] cArr3 = new char[length];
                    o.f2879 = 0;
                    while (o.f2879 < o.f2878) {
                        int i4 = o.f2879;
                        int i5 = o.f2878 - 1;
                        int i6 = o.f2879;
                        cArr3[i4] = (char) (cArr2[bArr[i5 - i6] + i2] - i3);
                        o.f2879 = i6 + 1;
                    }
                    return new String(cArr3);
                }
                if (f1908) {
                    int length2 = cArr.length;
                    o.f2878 = length2;
                    char[] cArr4 = new char[length2];
                    o.f2879 = 0;
                    while (o.f2879 < o.f2878) {
                        int i7 = o.f2879;
                        int i8 = o.f2878 - 1;
                        int i9 = o.f2879;
                        cArr4[i7] = (char) (cArr2[cArr[i8 - i9] - i2] - i3);
                        o.f2879 = i9 + 1;
                    }
                    return new String(cArr4);
                }
                int length3 = iArr.length;
                o.f2878 = length3;
                char[] cArr5 = new char[length3];
                o.f2879 = 0;
                while (o.f2879 < o.f2878) {
                    int i10 = o.f2879;
                    int i11 = o.f2878 - 1;
                    int i12 = o.f2879;
                    cArr5[i10] = (char) (cArr2[iArr[i11 - i12] - i2] - i3);
                    o.f2879 = i12 + 1;
                }
                return new String(cArr5);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
