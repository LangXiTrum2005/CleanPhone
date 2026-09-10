package com.p004ironsource.adqualitysdk.sdk.i;

import android.graphics.PointF;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import com.google.firebase.crashlytics.internal.model.a;
import com.ogury.ad.OguryReward;
import com.startapp.simple.bloomfilter.codec.CharEncoding;
import io.presage.Presage;
import java.io.UnsupportedEncodingException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes5.dex */
public final class gw extends gi {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f2162 = 1;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2163;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char[] f2164 = {'v', 237, 235, 241, 243, 242, 232, 198, 208, 237, 235, 241, 243, 242, 248, 214, 213, 243, '3', 'k', 't', AbstractJsonLexerKt.UNICODE_ESC, 's'};

    public static class c extends gi {

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static int f2165 = 0;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static int f2166 = 1;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static char f2167 = 4;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static char[] f2168 = {'c', 'o', 'm', '.', 'g', AbstractJsonLexerKt.UNICODE_ESC, 'r', 'y', 'a', 'd', 'O', 'R', 'e', 'w', 'f', 'h'};

        @Override // com.p004ironsource.adqualitysdk.sdk.i.gi
        /* JADX INFO: renamed from: ﻐ */
        public final String mo2138() {
            byte mirror;
            int iIndexOf;
            int i2 = f2166 + 125;
            f2165 = i2 % 128;
            if (i2 % 2 != 0) {
                mirror = (byte) ('_' << AndroidCharacter.getMirror('~'));
                iIndexOf = 50 - TextUtils.indexOf("", "", 0);
            } else {
                mirror = (byte) ('=' - AndroidCharacter.getMirror('0'));
                iIndexOf = TextUtils.indexOf("", "", 0) + 24;
            }
            String strIntern = m2173(mirror, "\u0001\u0002\u0003\u0000\u0000\u0005\u0006\u0007\u000b\u0007\t\n\u0002\u000b\u0005\u0006\u0007\u0004\b\u000f\f\t\u0005\n", iIndexOf).intern();
            f2166 = (f2165 + 31) % 128;
            return strIntern;
        }

        @Override // com.p004ironsource.adqualitysdk.sdk.i.gi
        /* JADX INFO: renamed from: ﻛ */
        public final String mo2139() {
            f2165 = (f2166 + 57) % 128;
            String strIntern = m2173((byte) (81 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), "\u0000\u0005\u0006\u0007Ê", TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 6).intern();
            f2165 = (f2166 + 105) % 128;
            return strIntern;
        }

        @Override // com.p004ironsource.adqualitysdk.sdk.i.gi
        /* JADX INFO: renamed from: ｋ */
        public final Class mo2140() {
            int i2 = f2165 + 91;
            f2166 = i2 % 128;
            if (i2 % 2 != 0) {
                return OguryReward.class;
            }
            throw null;
        }

        @Override // com.p004ironsource.adqualitysdk.sdk.i.gi
        /* JADX INFO: renamed from: ﾇ */
        public final bg mo2141() {
            by byVar = new by(mo2139());
            f2166 = (f2165 + 9) % 128;
            return byVar;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static String m2173(byte b2, String str, int i2) {
            String str2;
            Object charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            synchronized (i.f2343) {
                try {
                    char[] cArr2 = f2168;
                    char c2 = f2167;
                    char[] cArr3 = new char[i2];
                    if (i2 % 2 != 0) {
                        i2--;
                        cArr3[i2] = (char) (cArr[i2] - b2);
                    }
                    if (i2 > 1) {
                        i.f2348 = 0;
                        while (true) {
                            int i3 = i.f2348;
                            if (i3 >= i2) {
                                break;
                            }
                            i.f2347 = cArr[i3];
                            i.f2345 = cArr[i.f2348 + 1];
                            if (i.f2347 == i.f2345) {
                                cArr3[i.f2348] = (char) (i.f2347 - b2);
                                cArr3[i.f2348 + 1] = (char) (i.f2345 - b2);
                            } else {
                                i.f2346 = i.f2347 / c2;
                                i.f2342 = i.f2347 % c2;
                                i.f2344 = i.f2345 / c2;
                                i.f2341 = i.f2345 % c2;
                                if (i.f2342 == i.f2341) {
                                    i.f2346 = a.b(i.f2346, c2, 1, c2);
                                    i.f2344 = a.b(i.f2344, c2, 1, c2);
                                    int i4 = (i.f2346 * c2) + i.f2342;
                                    int i5 = (i.f2344 * c2) + i.f2341;
                                    int i6 = i.f2348;
                                    cArr3[i6] = cArr2[i4];
                                    cArr3[i6 + 1] = cArr2[i5];
                                } else if (i.f2346 == i.f2344) {
                                    i.f2342 = a.b(i.f2342, c2, 1, c2);
                                    i.f2341 = a.b(i.f2341, c2, 1, c2);
                                    int i7 = (i.f2346 * c2) + i.f2342;
                                    int i8 = (i.f2344 * c2) + i.f2341;
                                    int i9 = i.f2348;
                                    cArr3[i9] = cArr2[i7];
                                    cArr3[i9 + 1] = cArr2[i8];
                                } else {
                                    int i10 = (i.f2346 * c2) + i.f2341;
                                    int i11 = (i.f2344 * c2) + i.f2342;
                                    int i12 = i.f2348;
                                    cArr3[i12] = cArr2[i10];
                                    cArr3[i12 + 1] = cArr2[i11];
                                }
                            }
                            i.f2348 += 2;
                        }
                    }
                    str2 = new String(cArr3);
                } catch (Throwable th) {
                    throw th;
                }
            }
            return str2;
        }
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.gi
    /* JADX INFO: renamed from: ﻐ */
    public final String mo2138() {
        int i2 = f2162 + 123;
        f2163 = i2 % 128;
        String strIntern = (i2 % 2 != 0 ? m2172(true, new int[]{0, 18, 135, 0}, "\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0000") : m2172(true, new int[]{0, 18, 135, 0}, "\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0000")).intern();
        f2162 = (f2163 + 3) % 128;
        return strIntern;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.gi
    /* JADX INFO: renamed from: ﻛ */
    public final String mo2139() {
        int i2 = f2163 + 117;
        f2162 = i2 % 128;
        return (i2 % 2 == 0 ? m2172(true, new int[]{18, 5, 0, 2}, "\u0001\u0000\u0000\u0001\u0001") : m2172(true, new int[]{18, 5, 0, 2}, "\u0001\u0000\u0000\u0001\u0001")).intern();
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.gi
    /* JADX INFO: renamed from: ｋ */
    public final Class mo2140() {
        int i2 = f2162 + 15;
        f2163 = i2 % 128;
        if (i2 % 2 == 0) {
            return Presage.class;
        }
        throw null;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.gi
    /* JADX INFO: renamed from: ﾇ */
    public final bg mo2141() {
        cb cbVar = new cb(mo2139());
        f2162 = (f2163 + 19) % 128;
        return cbVar;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m2172(boolean z2, int[] iArr, String str) throws UnsupportedEncodingException {
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
                System.arraycopy(f2164, i2, cArr, 0, i3);
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
