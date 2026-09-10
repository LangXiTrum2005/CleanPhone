package com.p004ironsource.adqualitysdk.sdk.i;

import com.fyber.FairBid;
import com.startapp.simple.bloomfilter.codec.CharEncoding;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes5.dex */
public final class gd extends gi {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char[] f2072 = {'g', 186, 191, 210, 202, 184, 159, 181, 208, 200, 210, 212, 175, 178, 211, 206, 200, '8', 'r', 'p', 'r', 'z', 'w', 'r'};

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2073 = 0;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2074 = 1;

    @Override // com.p004ironsource.adqualitysdk.sdk.i.gi
    /* JADX INFO: renamed from: ﻐ */
    public final String mo2138() {
        int i2 = f2074 + 47;
        f2073 = i2 % 128;
        String strIntern = (i2 % 2 != 0 ? m2149(false, new int[]{0, 17, 101, 16}, "\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001") : m2149(true, new int[]{0, 17, 101, 16}, "\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001")).intern();
        int i3 = f2073 + 29;
        f2074 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 76 / 0;
        }
        return strIntern;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.gi
    /* JADX INFO: renamed from: ﻛ */
    public final String mo2139() {
        int i2 = f2074 + 25;
        f2073 = i2 % 128;
        return (i2 % 2 != 0 ? m2149(false, new int[]{17, 7, 13, 1}, "\u0001\u0000\u0001\u0000\u0001\u0000\u0001") : m2149(false, new int[]{17, 7, 13, 1}, "\u0001\u0000\u0001\u0000\u0001\u0000\u0001")).intern();
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.gi
    /* JADX INFO: renamed from: ｋ */
    public final Class mo2140() {
        int i2 = f2074 + 117;
        int i3 = i2 % 128;
        f2073 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        int i4 = i3 + 3;
        f2074 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 65 / 0;
        }
        return FairBid.class;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.gi
    /* JADX INFO: renamed from: ﾇ */
    public final bg mo2141() {
        bq bqVar = new bq(mo2139());
        int i2 = f2074 + 31;
        f2073 = i2 % 128;
        if (i2 % 2 == 0) {
            return bqVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m2149(boolean z2, int[] iArr, String str) throws UnsupportedEncodingException {
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
                System.arraycopy(f2072, i2, cArr, 0, i3);
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
