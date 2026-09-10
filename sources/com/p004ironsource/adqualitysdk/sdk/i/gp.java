package com.p004ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.view.View;
import android.view.ViewConfiguration;
import com.mbridge.msdk.MBridgeSDK;
import com.mintegral.msdk.MIntegralSDK;
import com.p004ironsource.dc;
import com.startapp.simple.bloomfilter.codec.CharEncoding;
import java.io.UnsupportedEncodingException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes5.dex */
public final class gp {

    public static class b extends gi {

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private static char[] f2128 = {'7', 'k', 'k', 'M', 'M', 'n', 'i', 'W', 'G', 'K', '_', 'f', 'i', 'l', 'f', 'l', 'q', AbstractJsonLexerKt.BEGIN_LIST, 'K', dc.T, 'L', 'g', 'k', 'p', 'M', 'M', 'f', 'i', 'l', 'f', 'l', '@', '~', '~', 132, 127, 'y', 127, '|', 'y'};

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static int f2129 = 1;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static int f2130;

        @Override // com.p004ironsource.adqualitysdk.sdk.i.gi
        /* JADX INFO: renamed from: ﻐ */
        public final String mo2138() {
            f2130 = (f2129 + 83) % 128;
            String strIntern = m2164(true, new int[]{0, 31, 0, 7}, "\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001").intern();
            int i2 = f2130 + 71;
            f2129 = i2 % 128;
            if (i2 % 2 != 0) {
                return strIntern;
            }
            throw null;
        }

        @Override // com.p004ironsource.adqualitysdk.sdk.i.gi
        /* JADX INFO: renamed from: ﻛ */
        public final String mo2139() {
            f2130 = (f2129 + 11) % 128;
            String strIntern = m2164(false, new int[]{31, 9, 19, 0}, "\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001").intern();
            f2129 = (f2130 + 103) % 128;
            return strIntern;
        }

        @Override // com.p004ironsource.adqualitysdk.sdk.i.gi
        /* JADX INFO: renamed from: ｋ */
        public final Class mo2140() {
            int i2 = f2130;
            f2129 = (i2 + 41) % 128;
            int i3 = i2 + 11;
            f2129 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 39 / 0;
            }
            return MIntegralSDK.class;
        }

        @Override // com.p004ironsource.adqualitysdk.sdk.i.gi
        /* JADX INFO: renamed from: ﾇ */
        public final bg mo2141() {
            bt.d dVar = new bt.d(mo2139());
            f2130 = (f2129 + 81) % 128;
            return dVar;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static String m2164(boolean z2, int[] iArr, String str) throws UnsupportedEncodingException {
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
                    System.arraycopy(f2128, i2, cArr, 0, i3);
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

    public static class d extends gi {

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private static int[] f2131 = {-2079118221, 1212876267, -1227102910, -1517201004, 385957965, -2057761635, -1580260878, 1356142049, 1899406728, -1203592119, -1883079362, -2003866453, 1906955476, 1336559771, 1306254280, -172234682, -1043469899, -897218289};

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static int f2132 = 0;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static int f2133 = 1;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static String m2165(int[] iArr, int i2) {
            String str;
            synchronized (com.p004ironsource.adqualitysdk.sdk.i.d.f1586) {
                try {
                    char[] cArr = new char[4];
                    char[] cArr2 = new char[iArr.length << 1];
                    int[] iArr2 = (int[]) f2131.clone();
                    com.p004ironsource.adqualitysdk.sdk.i.d.f1584 = 0;
                    while (true) {
                        int i3 = com.p004ironsource.adqualitysdk.sdk.i.d.f1584;
                        if (i3 < iArr.length) {
                            int i4 = iArr[i3];
                            char c2 = (char) (i4 >> 16);
                            cArr[0] = c2;
                            char c3 = (char) i4;
                            cArr[1] = c3;
                            char c4 = (char) (iArr[i3 + 1] >> 16);
                            cArr[2] = c4;
                            char c5 = (char) iArr[i3 + 1];
                            cArr[3] = c5;
                            com.p004ironsource.adqualitysdk.sdk.i.d.f1587 = (c2 << 16) + c3;
                            com.p004ironsource.adqualitysdk.sdk.i.d.f1585 = (c4 << 16) + c5;
                            com.p004ironsource.adqualitysdk.sdk.i.d.m1788(iArr2);
                            for (int i5 = 0; i5 < 16; i5++) {
                                int i6 = com.p004ironsource.adqualitysdk.sdk.i.d.f1587 ^ iArr2[i5];
                                com.p004ironsource.adqualitysdk.sdk.i.d.f1587 = i6;
                                int iM1787 = com.p004ironsource.adqualitysdk.sdk.i.d.m1787(i6) ^ com.p004ironsource.adqualitysdk.sdk.i.d.f1585;
                                int i7 = com.p004ironsource.adqualitysdk.sdk.i.d.f1587;
                                com.p004ironsource.adqualitysdk.sdk.i.d.f1587 = iM1787;
                                com.p004ironsource.adqualitysdk.sdk.i.d.f1585 = i7;
                            }
                            int i8 = com.p004ironsource.adqualitysdk.sdk.i.d.f1587;
                            int i9 = com.p004ironsource.adqualitysdk.sdk.i.d.f1585;
                            com.p004ironsource.adqualitysdk.sdk.i.d.f1587 = i9;
                            com.p004ironsource.adqualitysdk.sdk.i.d.f1585 = i8;
                            int i10 = i8 ^ iArr2[16];
                            com.p004ironsource.adqualitysdk.sdk.i.d.f1585 = i10;
                            int i11 = i9 ^ iArr2[17];
                            com.p004ironsource.adqualitysdk.sdk.i.d.f1587 = i11;
                            cArr[0] = (char) (i11 >>> 16);
                            cArr[1] = (char) i11;
                            cArr[2] = (char) (i10 >>> 16);
                            cArr[3] = (char) i10;
                            com.p004ironsource.adqualitysdk.sdk.i.d.m1788(iArr2);
                            int i12 = com.p004ironsource.adqualitysdk.sdk.i.d.f1584;
                            cArr2[i12 << 1] = cArr[0];
                            cArr2[(i12 << 1) + 1] = cArr[1];
                            cArr2[(i12 << 1) + 2] = cArr[2];
                            cArr2[(i12 << 1) + 3] = cArr[3];
                            com.p004ironsource.adqualitysdk.sdk.i.d.f1584 = i12 + 2;
                        } else {
                            str = new String(cArr2, 0, i2);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return str;
        }

        @Override // com.p004ironsource.adqualitysdk.sdk.i.gi
        /* JADX INFO: renamed from: ﻐ */
        public final String mo2138() {
            f2133 = (f2132 + 61) % 128;
            String strIntern = m2165(new int[]{1867023693, 1101525955, 1175830377, 1983488376, 1504169384, 1648314324, 1455978300, 261464830, -1740147301, -685179090, -593626943, 1980029667, 1150756543, 222017236}, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 27).intern();
            f2132 = (f2133 + 83) % 128;
            return strIntern;
        }

        @Override // com.p004ironsource.adqualitysdk.sdk.i.gi
        /* JADX INFO: renamed from: ﻛ */
        public final String mo2139() {
            f2132 = (f2133 + 95) % 128;
            String strIntern = m2165(new int[]{-1865750967, -1480672260, 2144942115, 1779962929, 329920381, -714258382}, 9 - View.resolveSize(0, 0)).intern();
            int i2 = f2132 + 7;
            f2133 = i2 % 128;
            if (i2 % 2 != 0) {
                return strIntern;
            }
            throw null;
        }

        @Override // com.p004ironsource.adqualitysdk.sdk.i.gi
        /* JADX INFO: renamed from: ｋ */
        public final Class mo2140() {
            int i2 = (f2132 + 93) % 128;
            f2133 = i2;
            f2132 = (i2 + 19) % 128;
            return MBridgeSDK.class;
        }

        @Override // com.p004ironsource.adqualitysdk.sdk.i.gi
        /* JADX INFO: renamed from: ﾇ */
        public final bg mo2141() {
            bt.e eVar = new bt.e(mo2139());
            int i2 = f2133 + 31;
            f2132 = i2 % 128;
            if (i2 % 2 == 0) {
                return eVar;
            }
            throw null;
        }
    }

    public gp() {
    }

    public gp(Context context) {
        context.getApplicationContext();
    }
}
