package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.InterfaceC0435l1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class dj extends cw implements ch {

    /* JADX INFO: renamed from: ﬤ, reason: contains not printable characters */
    private static int f1716 = 0;

    /* JADX INFO: renamed from: סּ, reason: contains not printable characters */
    private static short[] f1718 = null;

    /* JADX INFO: renamed from: ףּ, reason: contains not printable characters */
    private static int f1719 = 1;

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private String f1723;

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private String f1724;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private String f1725;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private String f1726;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private String f1727;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private String f1728;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private String f1729;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private String f1730;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private String f1731;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private String f1732;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private String f1733;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private String f1734;

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private static int[] f1722 = {-514055054, 986805583, 118192177, 2139654145, 2062548679, 190415070, -518954687, 438003559, -2098248804, 1542630599, 1863072784, -288092209, 1081576945, 529164221, 473022761, 1727075667, -1927367909, 983953927};

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static int f1720 = -1816622011;

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private static int f1721 = 70;

    /* JADX INFO: renamed from: 爫, reason: contains not printable characters */
    private static int f1715 = 1673015664;

    /* JADX INFO: renamed from: טּ, reason: contains not printable characters */
    private static byte[] f1717 = {27, -27, 35, -51, 15, -2, 27, -37, 7, -2, 8, -15, 3, 12, 30, -49, 15, -14, -11, -9, 37, -26, 7, -2, 8, -15, 3, 12, 30, -49, 15, -14, 27, -41, 13, -14, 10, -11, 2, 13, -17, 18, 35, -51, 15, -14, 27, -41, 13, -14, 10, -11, 2, 13, -17, 18, 35, -51, 15, -2, 27, -28, -17, 13, -11, 19, -4, -13, 47, -49, 15, -14, 27, -39, -5, 6, -3, 43, -45, 15, -2, 27, -43, 1, 14, -16, 4, 12, 19, -34, 15, -2, 27, -39, -3, 47, -48, 15, -2, 2, -6, -9, 34, -20, -5, 39, -50, 15, -2, 22, -11, 9, -13, 0, -3, 50, -33, -5, 39, -50, 15, -14, 22, -11, 9, -13, 0, -3, 50, -33, -5, 39, -50, 15, -2, -1, -4, 41, -37, -5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private void m1972(String str) {
        int i10 = f1716 + InterfaceC0435l1.d.b.f29105b;
        int i11 = i10 % 128;
        f1719 = i11;
        int i12 = i10 % 2;
        this.f1723 = str;
        if (i12 == 0) {
            int i13 = 56 / 0;
        }
        f1716 = (i11 + 39) % 128;
    }

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private void m1973(String str) {
        int i10 = f1716;
        this.f1724 = str;
        int i11 = i10 + 39;
        f1719 = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private Object m1974() {
        int i10 = f1716 + 9;
        f1719 = i10 % 128;
        if (i10 % 2 != 0) {
            return this.f1723;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private JSONObject m1975() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt(is.f2582, this.f1734);
            jSONObject.putOpt(is.f2578, this.f1731);
            jSONObject.putOpt(is.f2583, this.f1733);
            jSONObject.putOpt(is.f2585, this.f1732);
            jSONObject.putOpt(is.f2586, this.f1725);
            jSONObject.putOpt(is.f2581, this.f1729);
            jSONObject.putOpt(is.f2579, this.f1727);
            jSONObject.putOpt(is.f2580, this.f1726);
            jSONObject.putOpt(is.f2576, this.f1728);
            f1719 = (f1716 + 59) % 128;
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private void m1977(String str) {
        int i10 = (f1716 + 45) % 128;
        f1719 = i10;
        this.f1727 = str;
        f1716 = (i10 + 55) % 128;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private String m1978() {
        int i10 = f1716;
        int i11 = i10 + InterfaceC0435l1.d.b.f29109f;
        f1719 = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
        String str = this.f1727;
        f1719 = (i10 + 5) % 128;
        return str;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private void m1981(String str) {
        int i10 = f1719 + InterfaceC0435l1.d.b.f29107d;
        f1716 = i10 % 128;
        int i11 = i10 % 2;
        this.f1725 = str;
        if (i11 != 0) {
            int i12 = 28 / 0;
        }
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private String m1982() {
        int i10 = (f1716 + 53) % 128;
        f1719 = i10;
        String str = this.f1729;
        int i11 = i10 + 89;
        f1716 = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 44 / 0;
        }
        return str;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private void m1985(String str) {
        int i10 = f1716;
        this.f1729 = str;
        int i11 = i10 + InterfaceC0435l1.d.b.f29107d;
        f1719 = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 18 / 0;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private void m1988(String str) {
        int i10 = (f1719 + 77) % 128;
        f1716 = i10;
        this.f1731 = str;
        int i11 = i10 + 13;
        f1719 = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m1990(String str) {
        int i10 = f1716;
        this.f1733 = str;
        int i11 = i10 + 91;
        f1719 = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private String m1991() {
        int i10 = f1719 + 29;
        f1716 = i10 % 128;
        if (i10 % 2 == 0) {
            return this.f1734;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private void m1994(String str) {
        int i10 = f1716 + 123;
        f1719 = i10 % 128;
        int i11 = i10 % 2;
        this.f1734 = str;
        if (i11 == 0) {
            int i12 = 65 / 0;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private void m1997(String str) {
        int i10 = f1716;
        int i11 = i10 + 21;
        f1719 = i11 % 128;
        int i12 = i11 % 2;
        this.f1732 = str;
        if (i12 == 0) {
            int i13 = 44 / 0;
        }
        f1719 = (i10 + 11) % 128;
    }

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private Object m1971() {
        int i10 = f1716;
        String str = this.f1724;
        f1719 = (i10 + 79) % 128;
        return str;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private String m1976() {
        int i10 = f1716;
        String str = this.f1728;
        int i11 = i10 + 53;
        f1719 = i11 % 128;
        if (i11 % 2 != 0) {
            return str;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private void m1979(String str) {
        int i10 = f1716;
        this.f1726 = str;
        f1719 = (i10 + 13) % 128;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private String m1980() {
        int i10 = (f1719 + 1) % 128;
        f1716 = i10;
        String str = this.f1725;
        f1719 = (i10 + 1) % 128;
        return str;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private void m1983(String str) {
        int i10 = f1719 + 41;
        int i11 = i10 % 128;
        f1716 = i11;
        int i12 = i10 % 2;
        this.f1728 = str;
        if (i12 != 0) {
            throw null;
        }
        f1719 = (i11 + 117) % 128;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private String m1984() {
        int i10 = f1716;
        String str = this.f1726;
        int i11 = i10 + 59;
        f1719 = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 95 / 0;
        }
        return str;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private String m1986() {
        int i10 = f1719 + 37;
        f1716 = i10 % 128;
        if (i10 % 2 == 0) {
            return this.f1733;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private Object m1989() {
        int i10 = f1719 + 33;
        f1716 = i10 % 128;
        if (i10 % 2 == 0) {
            return this.f1730;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private void m1992(String str) {
        int i10 = f1716;
        int i11 = i10 + 19;
        f1719 = i11 % 128;
        int i12 = i11 % 2;
        this.f1730 = str;
        if (i12 == 0) {
            int i13 = 8 / 0;
        }
        f1719 = (i10 + 13) % 128;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private String m1993() {
        int i10 = f1719;
        int i11 = i10 + 43;
        f1716 = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
        String str = this.f1731;
        f1716 = (i10 + 31) % 128;
        return str;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private String m1995() {
        int i10 = f1719;
        String str = this.f1732;
        f1716 = (i10 + 35) % 128;
        return str;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m1987(int[] iArr, int i10) {
        String str;
        synchronized (a.f61) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f1722.clone();
                a.f58 = 0;
                while (true) {
                    int i11 = a.f58;
                    if (i11 < iArr.length) {
                        int i12 = iArr[i11];
                        char c4 = (char) (i12 >> 16);
                        cArr[0] = c4;
                        char c5 = (char) i12;
                        cArr[1] = c5;
                        char c10 = (char) (iArr[i11 + 1] >> 16);
                        cArr[2] = c10;
                        char c11 = (char) iArr[i11 + 1];
                        cArr[3] = c11;
                        a.f59 = (c4 << 16) + c5;
                        a.f60 = (c10 << 16) + c11;
                        a.m199(iArr2);
                        for (int i13 = 0; i13 < 16; i13++) {
                            int i14 = a.f59 ^ iArr2[i13];
                            a.f59 = i14;
                            int iM200 = a.m200(i14) ^ a.f60;
                            int i15 = a.f59;
                            a.f59 = iM200;
                            a.f60 = i15;
                        }
                        int i16 = a.f59;
                        int i17 = a.f60;
                        a.f59 = i17;
                        a.f60 = i16;
                        int i18 = i16 ^ iArr2[16];
                        a.f60 = i18;
                        int i19 = i17 ^ iArr2[17];
                        a.f59 = i19;
                        cArr[0] = (char) (i19 >>> 16);
                        cArr[1] = (char) i19;
                        cArr[2] = (char) (i18 >>> 16);
                        cArr[3] = (char) i18;
                        a.m199(iArr2);
                        int i20 = a.f58;
                        cArr2[i20 << 1] = cArr[0];
                        cArr2[(i20 << 1) + 1] = cArr[1];
                        cArr2[(i20 << 1) + 2] = cArr[2];
                        cArr2[(i20 << 1) + 3] = cArr[3];
                        a.f58 = i20 + 2;
                    } else {
                        str = new String(cArr2, 0, i10);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x045c, code lost:
    
        if (r20.equals(m1996((short) (android.text.TextUtils.lastIndexOf("", '0', 0) + 1), (-1673015548) - (android.os.SystemClock.elapsedRealtime() > 0 ? 1 : (android.os.SystemClock.elapsedRealtime() == 0 ? 0 : -1)), android.graphics.drawable.Drawable.resolveOpacity(0, 0) - 55, (android.os.SystemClock.elapsedRealtime() > 0 ? 1 : (android.os.SystemClock.elapsedRealtime() == 0 ? 0 : -1)) + 1816622028, (byte) android.view.View.MeasureSpec.getSize(0)).intern()) != false) goto L96;
     */
    @Override // com.ironsource.adqualitysdk.sdk.i.ch
    /* JADX INFO: renamed from: ﾒ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mo821(com.ironsource.adqualitysdk.sdk.i.cl r19, java.lang.String r20, java.util.List<java.lang.Object> r21, com.ironsource.adqualitysdk.sdk.i.ck r22, com.ironsource.adqualitysdk.sdk.i.ee r23) {
        /*
            Method dump skipped, instruction units count: 1776
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.dj.mo821(com.ironsource.adqualitysdk.sdk.i.cl, java.lang.String, java.util.List, com.ironsource.adqualitysdk.sdk.i.ck, com.ironsource.adqualitysdk.sdk.i.ee):java.lang.Object");
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m1996(short s10, int i10, int i11, int i12, byte b10) {
        String string;
        synchronized (n.f3070) {
            try {
                StringBuilder sb2 = new StringBuilder();
                int i13 = f1721;
                int i14 = i11 + i13;
                int i15 = i14 == -1 ? 1 : 0;
                if (i15 != 0) {
                    byte[] bArr = f1717;
                    if (bArr != null) {
                        i14 = (byte) (bArr[f1720 + i12] + i13);
                    } else {
                        i14 = (short) (f1718[f1720 + i12] + i13);
                    }
                }
                if (i14 > 0) {
                    n.f3072 = ((i12 + i14) - 2) + f1720 + i15;
                    n.f3073 = b10;
                    char c4 = (char) (i10 + f1715);
                    n.f3074 = c4;
                    sb2.append(c4);
                    n.f3075 = n.f3074;
                    n.f3071 = 1;
                    while (n.f3071 < i14) {
                        byte[] bArr2 = f1717;
                        if (bArr2 != null) {
                            int i16 = n.f3072;
                            n.f3072 = i16 - 1;
                            n.f3074 = (char) (n.f3075 + (((byte) (bArr2[i16] + s10)) ^ n.f3073));
                        } else {
                            short[] sArr = f1718;
                            int i17 = n.f3072;
                            n.f3072 = i17 - 1;
                            n.f3074 = (char) (n.f3075 + (((short) (sArr[i17] + s10)) ^ n.f3073));
                        }
                        sb2.append(n.f3074);
                        n.f3075 = n.f3074;
                        n.f3071++;
                    }
                }
                string = sb2.toString();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return string;
    }
}
