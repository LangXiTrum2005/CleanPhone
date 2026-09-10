package com.p004ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.vungle.warren.VungleApiClient;

/* JADX INFO: loaded from: classes5.dex */
public abstract class gz extends gi {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char[] f2173 = {'v', 19255, 38634, 57761, 11620, 30767};

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static long f2174 = 976425894902778690L;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2175 = 0;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2176 = 1;

    public static class c extends gz {

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private static long f2177 = 0;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static int f2178 = 0;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static char f2179 = 54151;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static int f2180 = 1;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static int f2181;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static String m2176(int i2, char c2, String str, String str2, String str3) {
            String str4;
            Object charArray = str3;
            if (str3 != null) {
                charArray = str3.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            Object charArray2 = str2;
            if (str2 != null) {
                charArray2 = str2.toCharArray();
            }
            char[] cArr2 = (char[]) charArray2;
            Object charArray3 = str;
            if (str != null) {
                charArray3 = str.toCharArray();
            }
            char[] cArr3 = (char[]) charArray3;
            synchronized (j.f2569) {
                try {
                    char[] cArr4 = (char[]) cArr3.clone();
                    char[] cArr5 = (char[]) cArr.clone();
                    cArr4[0] = (char) (c2 ^ cArr4[0]);
                    cArr5[2] = (char) (cArr5[2] + ((char) i2));
                    int length = cArr2.length;
                    char[] cArr6 = new char[length];
                    j.f2567 = 0;
                    while (true) {
                        int i3 = j.f2567;
                        if (i3 < length) {
                            int i4 = (i3 + 2) % 4;
                            int i5 = (i3 + 3) % 4;
                            int i6 = cArr4[i3 % 4] * 32718;
                            char c3 = cArr5[i4];
                            char c4 = (char) ((i6 + c3) % 65535);
                            j.f2568 = c4;
                            cArr5[i5] = (char) (((cArr4[i5] * 32718) + c3) / 65535);
                            cArr4[i5] = c4;
                            int i7 = j.f2567;
                            cArr6[i7] = (char) (((((long) (c4 ^ cArr2[i7])) ^ f2177) ^ ((long) f2178)) ^ ((long) f2179));
                            j.f2567 = i7 + 1;
                        } else {
                            str4 = new String(cArr6);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return str4;
        }

        @Override // com.p004ironsource.adqualitysdk.sdk.i.gi
        /* JADX INFO: renamed from: ﻐ */
        public final String mo2138() {
            f2180 = (f2181 + 21) % 128;
            String strIntern = m2176(1562235182 - MotionEvent.axisFromString(""), (char) ((Process.getThreadPriority(0) + 20) >> 6), "⿅᷑陝捱", "읫㹞圪䚞蟃賻쾇⥪맅祜渻嗇\uaad0廗㉴㵹⬻\uf24f炟耸㫶㭤ວ渹\ue7e4秲\uedf6訚ⵛ쮹➀య⯶", "\u0000\u0000\u0000\u0000").intern();
            int i2 = f2181 + 37;
            f2180 = i2 % 128;
            if (i2 % 2 != 0) {
                return strIntern;
            }
            throw null;
        }

        @Override // com.p004ironsource.adqualitysdk.sdk.i.gi
        /* JADX INFO: renamed from: ｋ */
        public final Class mo2140() {
            int i2 = f2181 + 9;
            int i3 = i2 % 128;
            f2180 = i3;
            if (i2 % 2 == 0) {
                throw null;
            }
            int i4 = i3 + 51;
            f2181 = i4 % 128;
            if (i4 % 2 == 0) {
                return VungleApiClient.class;
            }
            throw null;
        }

        @Override // com.p004ironsource.adqualitysdk.sdk.i.gi
        /* JADX INFO: renamed from: ﾇ */
        public final bg mo2141() {
            cd cdVar = new cd(m2176((-16777216) - Color.rgb(0, 0, 0), (char) (TextUtils.indexOf((CharSequence) "", '0') + 18431), "鍢︲﹪㭇", "そ╉\ueb9c\uab1a驇퓢", "\u0000\u0000\u0000\u0000").intern());
            int i2 = f2180 + 7;
            f2181 = i2 % 128;
            if (i2 % 2 == 0) {
                return cdVar;
            }
            throw null;
        }
    }

    public static class e extends gz {

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private static int f2182 = 1;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static int f2183;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static int[] f2184 = {-166519512, 771190380, -1021251276, 2002935051, -384155315, 1720935986, -1420635925, 447681101, -2006366280, -868082003, 2124188974, -604079263, -1036450136, -769972014, -1674965777, 1926117700, -72276627, -1956067187};

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static String m2177(int[] iArr, int i2) {
            String str;
            synchronized (d.f1586) {
                try {
                    char[] cArr = new char[4];
                    char[] cArr2 = new char[iArr.length << 1];
                    int[] iArr2 = (int[]) f2184.clone();
                    d.f1584 = 0;
                    while (true) {
                        int i3 = d.f1584;
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
                            d.f1587 = (c2 << 16) + c3;
                            d.f1585 = (c4 << 16) + c5;
                            d.m1788(iArr2);
                            for (int i5 = 0; i5 < 16; i5++) {
                                int i6 = d.f1587 ^ iArr2[i5];
                                d.f1587 = i6;
                                int iM1787 = d.m1787(i6) ^ d.f1585;
                                int i7 = d.f1587;
                                d.f1587 = iM1787;
                                d.f1585 = i7;
                            }
                            int i8 = d.f1587;
                            int i9 = d.f1585;
                            d.f1587 = i9;
                            d.f1585 = i8;
                            int i10 = i8 ^ iArr2[16];
                            d.f1585 = i10;
                            int i11 = i9 ^ iArr2[17];
                            d.f1587 = i11;
                            cArr[0] = (char) (i11 >>> 16);
                            cArr[1] = (char) i11;
                            cArr[2] = (char) (i10 >>> 16);
                            cArr[3] = (char) i10;
                            d.m1788(iArr2);
                            int i12 = d.f1584;
                            cArr2[i12 << 1] = cArr[0];
                            cArr2[(i12 << 1) + 1] = cArr[1];
                            cArr2[(i12 << 1) + 2] = cArr[2];
                            cArr2[(i12 << 1) + 3] = cArr[3];
                            d.f1584 = i12 + 2;
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
            int i2 = f2183 + 93;
            f2182 = i2 % 128;
            return (i2 % 2 == 0 ? m2177(new int[]{-1671615976, -356356412, 63039004, -1432051197, 646148875, 908773823, -712483812, -1148860541, 1804087072, 517514856, -1865104729, -991014761, -196292485, -2048437421, 82813273, -974088893, 1861605489, 750244452, -1216066011, 2029038506, -720223063, -432728645, -1138143007, -285953095}, 62 - KeyEvent.keyCodeFromString("")) : m2177(new int[]{-1671615976, -356356412, 63039004, -1432051197, 646148875, 908773823, -712483812, -1148860541, 1804087072, 517514856, -1865104729, -991014761, -196292485, -2048437421, 82813273, -974088893, 1861605489, 750244452, -1216066011, 2029038506, -720223063, -432728645, -1138143007, -285953095}, 47 - KeyEvent.keyCodeFromString(""))).intern();
        }

        @Override // com.p004ironsource.adqualitysdk.sdk.i.gi
        /* JADX INFO: renamed from: ｋ */
        public final Class mo2140() {
            int i2 = f2182;
            int i3 = i2 + 9;
            f2183 = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            f2183 = (i2 + 37) % 128;
            return com.vungle.ads.internal.network.VungleApiClient.class;
        }

        @Override // com.p004ironsource.adqualitysdk.sdk.i.gi
        /* JADX INFO: renamed from: ﾇ */
        public final bg mo2141() {
            ci ciVar = new ci(mo2139());
            int i2 = f2183 + 123;
            f2182 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 24 / 0;
            }
            return ciVar;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m2175(int i2, int i3, char c2) {
        String str;
        synchronized (a.f68) {
            try {
                char[] cArr = new char[i2];
                a.f69 = 0;
                while (true) {
                    int i4 = a.f69;
                    if (i4 < i2) {
                        cArr[i4] = (char) ((((long) f2173[i3 + i4]) ^ (((long) i4) * f2174)) ^ ((long) c2));
                        a.f69 = i4 + 1;
                    } else {
                        str = new String(cArr);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.gi
    /* JADX INFO: renamed from: ﻛ */
    public final String mo2139() {
        f2176 = (f2175 + 63) % 128;
        String strIntern = m2175((ViewConfiguration.getEdgeSlop() >> 16) + 6, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (ViewConfiguration.getDoubleTapTimeout() >> 16)).intern();
        int i2 = f2176 + 101;
        f2175 = i2 % 128;
        if (i2 % 2 == 0) {
            return strIntern;
        }
        throw null;
    }
}
