package com.p004ironsource.adqualitysdk.sdk.i;

import com.startapp.simple.bloomfilter.codec.CharEncoding;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes5.dex */
public final class ew extends eo {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char[] f1940 = {30, '<'};

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f1941 = 0;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f1942 = 1;

    public ew(ee eeVar, ee eeVar2, dm dmVar) {
        super(eeVar, eeVar2, dmVar);
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m2113(boolean z2, int[] iArr, String str) throws UnsupportedEncodingException {
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
                System.arraycopy(f1940, i2, cArr, 0, i3);
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

    @Override // com.p004ironsource.adqualitysdk.sdk.i.ef
    /* JADX INFO: renamed from: ﻐ */
    public final String mo2089() {
        f1942 = (f1941 + 39) % 128;
        String strIntern = m2113(true, new int[]{0, 2, 0, 0}, "\u0001\u0001").intern();
        int i2 = f1941 + 13;
        f1942 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 66 / 0;
        }
        return strIntern;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.ek
    /* JADX INFO: renamed from: ﻛ */
    public final boolean mo2099(int i2) {
        if (i2 <= 0) {
            f1942 = (f1941 + 99) % 128;
            return true;
        }
        int i3 = f1942 + 33;
        f1941 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 80 / 0;
        }
        return false;
    }
}
