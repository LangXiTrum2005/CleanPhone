package com.p004ironsource.adqualitysdk.sdk.i;

import com.startapp.simple.bloomfilter.codec.CharEncoding;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes5.dex */
public final class dm {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f1713 = 1;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f1714;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char[] f1715 = {')'};

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private int f1716;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private String f1717;

    private dm(String str, int i2) {
        this.f1717 = str;
        this.f1716 = i2;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static dm m1949(String str, int i2) {
        int i3 = f1713 + 73;
        f1714 = i3 % 128;
        if (i3 % 2 != 0) {
            r.m2874().m2907();
            throw null;
        }
        if (!r.m2874().m2907()) {
            return null;
        }
        dm dmVar = new dm(str, i2);
        int i4 = f1713 + 11;
        f1714 = i4 % 128;
        if (i4 % 2 == 0) {
            return dmVar;
        }
        throw null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f1717);
        sb.append(m1950(false, new int[]{0, 1, 25, 0}, "\u0001").intern());
        sb.append(this.f1716);
        String string = sb.toString();
        f1713 = (f1714 + 25) % 128;
        return string;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final int m1951() {
        int i2 = f1713 + 115;
        f1714 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.f1716;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m1950(boolean z2, int[] iArr, String str) throws UnsupportedEncodingException {
        String str2;
        Object bytes = str;
        if (str != null) {
            bytes = str.getBytes(CharEncoding.ISO_8859_1);
        }
        byte[] bArr = (byte[]) bytes;
        synchronized (h.f2186) {
            try {
                int i2 = iArr[0];
                int i3 = iArr[1];
                int i4 = iArr[2];
                int i5 = iArr[3];
                char[] cArr = new char[i3];
                System.arraycopy(f1715, i2, cArr, 0, i3);
                if (bArr != null) {
                    char[] cArr2 = new char[i3];
                    h.f2185 = 0;
                    char c2 = 0;
                    while (true) {
                        int i6 = h.f2185;
                        if (i6 >= i3) {
                            break;
                        }
                        if (bArr[i6] == 1) {
                            cArr2[i6] = (char) (((cArr[i6] << 1) + 1) - c2);
                        } else {
                            cArr2[i6] = (char) ((cArr[i6] << 1) - c2);
                        }
                        c2 = cArr2[i6];
                        h.f2185 = i6 + 1;
                    }
                    cArr = cArr2;
                }
                if (i5 > 0) {
                    char[] cArr3 = new char[i3];
                    System.arraycopy(cArr, 0, cArr3, 0, i3);
                    int i7 = i3 - i5;
                    System.arraycopy(cArr3, 0, cArr, i7, i5);
                    System.arraycopy(cArr3, i5, cArr, 0, i7);
                }
                if (z2) {
                    char[] cArr4 = new char[i3];
                    h.f2185 = 0;
                    while (true) {
                        int i8 = h.f2185;
                        if (i8 >= i3) {
                            break;
                        }
                        cArr4[i8] = cArr[(i3 - i8) - 1];
                        h.f2185 = i8 + 1;
                    }
                    cArr = cArr4;
                }
                if (i4 > 0) {
                    h.f2185 = 0;
                    while (true) {
                        int i9 = h.f2185;
                        if (i9 >= i3) {
                            break;
                        }
                        cArr[i9] = (char) (cArr[i9] - iArr[2]);
                        h.f2185 = i9 + 1;
                    }
                }
                str2 = new String(cArr);
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }
}
