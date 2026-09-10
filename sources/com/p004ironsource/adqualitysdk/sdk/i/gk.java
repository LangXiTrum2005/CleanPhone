package com.p004ironsource.adqualitysdk.sdk.i;

import com.hyprmx.android.sdk.placement.PlacementType;
import com.startapp.simple.bloomfilter.codec.CharEncoding;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes5.dex */
public final class gk extends gi {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char[] f2108 = {'j', 177, 159, 190, 198, 194, 196, 201, 201, 201, 209, 196, 198, 212, 202, 196, 201, 206, 173, 171, 208, 212, 209, 207, 210, 179, 167, 199, 201, 203, 208, 204, 198, 169, 176, 203, 199, 172, 175, 206, 198, 194, 196, 201, 201, 201, '4', 'p', 't', 'q', 'o', 'r'};

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2109 = 0;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2110 = 1;

    @Override // com.p004ironsource.adqualitysdk.sdk.i.gi
    /* JADX INFO: renamed from: ﻐ */
    public final String mo2138() {
        f2109 = (f2110 + 109) % 128;
        String strIntern = m2159(false, new int[]{0, 46, 96, 15}, "\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0001").intern();
        int i2 = f2109 + 69;
        f2110 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 54 / 0;
        }
        return strIntern;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.gi
    /* JADX INFO: renamed from: ﻛ */
    public final String mo2139() {
        int i2 = f2110 + 91;
        f2109 = i2 % 128;
        String strIntern = (i2 % 2 != 0 ? m2159(false, new int[]{46, 6, 0, 0}, "\u0000\u0001\u0001\u0000\u0001\u0001") : m2159(false, new int[]{46, 6, 0, 0}, "\u0000\u0001\u0001\u0000\u0001\u0001")).intern();
        f2110 = (f2109 + 49) % 128;
        return strIntern;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.gi
    /* JADX INFO: renamed from: ｋ */
    public final Class mo2140() {
        int i2 = f2110 + 53;
        f2109 = i2 % 128;
        if (i2 % 2 == 0) {
            return PlacementType.class;
        }
        throw null;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.gi
    /* JADX INFO: renamed from: ﾇ */
    public final bg mo2141() {
        bo boVar = new bo(mo2139());
        int i2 = f2110 + 59;
        f2109 = i2 % 128;
        if (i2 % 2 == 0) {
            return boVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m2159(boolean z2, int[] iArr, String str) throws UnsupportedEncodingException {
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
                System.arraycopy(f2108, i2, cArr, 0, i3);
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
