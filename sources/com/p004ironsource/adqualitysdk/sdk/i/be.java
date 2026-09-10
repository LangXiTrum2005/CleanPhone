package com.p004ironsource.adqualitysdk.sdk.i;

import com.startapp.simple.bloomfilter.codec.CharEncoding;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class be extends bg {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f737 = 1;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char[] f738 = {'z', 244, 248, 247, 241, 247, 249};

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f739;

    public be(String str) {
        super(str);
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ﱟ */
    public final boolean mo776() {
        int i2 = f737 + 111;
        f739 = i2 % 128;
        if (i2 % 2 == 0) {
            return true;
        }
        throw null;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ﻏ */
    public final boolean mo777() {
        int i2 = (f739 + 89) % 128;
        f737 = i2;
        int i3 = i2 + 21;
        f739 = i3 % 128;
        if (i3 % 2 == 0) {
            return true;
        }
        throw null;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ﻛ */
    public final Map<String, bg.b> mo707() {
        HashMap map = new HashMap();
        f737 = (f739 + 119) % 128;
        return map;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ｋ */
    public final Class mo708(String str) {
        int i2 = f739 + 117;
        f737 = i2 % 128;
        if (i2 % 2 != 0) {
            return null;
        }
        throw null;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ﾒ */
    public final String mo709() {
        f737 = (f739 + 93) % 128;
        String strIntern = m778(true, new int[]{0, 7, 176, 0}, "\u0000\u0001\u0001\u0000\u0001\u0001\u0001").intern();
        int i2 = f739 + 55;
        f737 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 61 / 0;
        }
        return strIntern;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m778(boolean z2, int[] iArr, String str) throws UnsupportedEncodingException {
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
                System.arraycopy(f738, i2, cArr, 0, i3);
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
