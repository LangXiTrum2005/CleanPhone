package com.facebook.ads.redexgen.core;

import android.text.Layout;
import com.umeng.analytics.pro.cw;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Xf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1152Xf {
    public static byte[] A0J;
    public static String[] A0K = {"OqR42QNDz09gx", "DtiHbQaUkm0", "JgpCwHNymRJ", "dh5rxWpj3tPCY04cXvRSuC3eR8iATcwk", "PYnflpjfPumnvKXDI3zE0fUnK5FKpak4", "W36ieGod6cPpkKyFfSA0rNFOIJ6rQSY8", "CYEaoHN3CVzFU", "ruRyuhAYMSIGmjbWJNtvzawnHNUnse4j"};
    public float A00;
    public int A02;
    public int A04;
    public Layout.Alignment A0C;
    public Layout.Alignment A0D;
    public XU A0E;
    public String A0F;
    public String A0G;
    public boolean A0H;
    public boolean A0I;
    public int A07 = -1;
    public int A0B = -1;
    public int A03 = -1;
    public int A06 = -1;
    public int A05 = -1;
    public int A09 = -1;
    public int A08 = -1;
    public int A0A = -1;
    public float A01 = Float.MAX_VALUE;

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0J, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 123);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A0J = new byte[]{89, 122, 120, 112, 124, 105, 116, 110, 117, 127, 59, 120, 116, 119, 116, 105, 59, 115, 122, 104, 59, 117, 116, 111, 59, 121, 126, 126, 117, 59, 127, 126, 125, 114, 117, 126, 127, 53, 43, 2, 3, 25, 77, cw.l, 2, 1, 2, 31, 77, 5, 12, 30, 77, 3, 2, 25, 77, cw.m, 8, 8, 3, 77, 9, 8, 11, 4, 3, 8, 9, 67};
    }

    static {
        A02();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x005e  */
    private C1152Xf A00(C1152Xf c1152Xf, boolean z) {
        if (c1152Xf != null) {
            if (!this.A0I && c1152Xf.A0I) {
                A0H(c1152Xf.A04);
            }
            if (this.A03 == -1) {
                this.A03 = c1152Xf.A03;
            }
            int i = this.A06;
            String[] strArr = A0K;
            if (strArr[1].length() == strArr[2].length()) {
                String[] strArr2 = A0K;
                strArr2[4] = "9yZLmzKRjmy6mKHdII8aSJjyosCysvEv";
                strArr2[5] = "xtrJhxRxaNE4zKEJWsZ6xxlIgQzIDAqb";
                if (i == -1) {
                    this.A06 = c1152Xf.A06;
                }
                if (this.A0F == null) {
                    String str = c1152Xf.A0F;
                    String[] strArr3 = A0K;
                    if (strArr3[1].length() == strArr3[2].length()) {
                        String[] strArr4 = A0K;
                        strArr4[1] = "PIWjDAuyyge";
                        strArr4[2] = "5xdW3fLLrcv";
                        if (str != null) {
                            this.A0F = c1152Xf.A0F;
                        }
                    } else if (str != null) {
                        this.A0F = c1152Xf.A0F;
                    }
                }
                if (this.A07 == -1) {
                    int i2 = c1152Xf.A07;
                    String[] strArr5 = A0K;
                    if (strArr5[4].charAt(13) != strArr5[5].charAt(13)) {
                        String[] strArr6 = A0K;
                        strArr6[6] = "aTaOtkFxxNKpg";
                        strArr6[0] = "iRwUZqFTMqSU4";
                        this.A07 = i2;
                    } else {
                        String[] strArr7 = A0K;
                        strArr7[4] = "cKKSsokexmgvtKcSKMjOxdZPfgguG92b";
                        strArr7[5] = "9CWGDeX3gVj6yKNXJkvvga8e9g1m5E17";
                        this.A07 = i2;
                    }
                }
                if (this.A0B == -1) {
                    int i3 = c1152Xf.A0B;
                    String[] strArr8 = A0K;
                    if (strArr8[6].length() == strArr8[0].length()) {
                        String[] strArr9 = A0K;
                        strArr9[4] = "bv1IvST00trSyK6fisr3sXwS5p89tsbq";
                        strArr9[5] = "ozrp3vOqrFosaK5YKlxxTKZ7TzvWABET";
                        this.A0B = i3;
                    }
                }
                if (this.A08 == -1) {
                    this.A08 = c1152Xf.A08;
                }
                if (this.A0D == null && c1152Xf.A0D != null) {
                    this.A0D = c1152Xf.A0D;
                }
                if (this.A0C == null && c1152Xf.A0C != null) {
                    this.A0C = c1152Xf.A0C;
                }
                if (this.A0A == -1) {
                    this.A0A = c1152Xf.A0A;
                }
                if (this.A05 == -1) {
                    this.A05 = c1152Xf.A05;
                    this.A00 = c1152Xf.A00;
                }
                if (this.A0E == null) {
                    XU xu = c1152Xf.A0E;
                    String[] strArr10 = A0K;
                    if (strArr10[1].length() != strArr10[2].length()) {
                        String[] strArr11 = A0K;
                        strArr11[7] = "b9o0U0oQJo4PLZ5sUf7ydz34CxuHnOjQ";
                        strArr11[3] = "P2ZzagTnJ90WpTOVo0K1z7Qfu87kj2r2";
                        this.A0E = xu;
                    } else {
                        String[] strArr12 = A0K;
                        strArr12[7] = "VHP720eMFSzuDMAqTvl1UljQEVoXtwC6";
                        strArr12[3] = "svCicFMTzpPWaVT8Xvt4aMy8jdNznuVf";
                        this.A0E = xu;
                    }
                }
                if (this.A01 == Float.MAX_VALUE) {
                    this.A01 = c1152Xf.A01;
                }
                if (z) {
                    boolean z2 = this.A0H;
                    String[] strArr13 = A0K;
                    if (strArr13[6].length() != strArr13[0].length()) {
                        throw new RuntimeException();
                    }
                    String[] strArr14 = A0K;
                    strArr14[1] = "Jys0gy4uhHt";
                    strArr14[2] = "YjPYlGMr6kN";
                    if (!z2 && c1152Xf.A0H) {
                        A0G(c1152Xf.A02);
                    }
                }
                if (z) {
                    int i4 = this.A09;
                    String[] strArr15 = A0K;
                    if (strArr15[4].charAt(13) == strArr15[5].charAt(13)) {
                        String[] strArr16 = A0K;
                        strArr16[7] = "z4A8VAmAJNPLRMU5UDX5Po0m8QTRlS8j";
                        strArr16[3] = "Ym5RyqpVw3lskCq6FB5wD9Vdp3bJ6EgP";
                        if (i4 == -1 && c1152Xf.A09 != -1) {
                            this.A09 = c1152Xf.A09;
                        }
                    }
                }
            }
            throw new RuntimeException();
        }
        return this;
    }

    public final float A03() {
        return this.A00;
    }

    public final float A04() {
        return this.A01;
    }

    public final int A05() {
        if (this.A0H) {
            return this.A02;
        }
        throw new IllegalStateException(A01(0, 38, 96));
    }

    public final int A06() {
        if (this.A0I) {
            return this.A04;
        }
        throw new IllegalStateException(A01(38, 32, 22));
    }

    public final int A07() {
        return this.A05;
    }

    public final int A08() {
        return this.A08;
    }

    public final int A09() {
        return this.A09;
    }

    public final int A0A() {
        if (this.A03 == -1) {
            int i = this.A06;
            String[] strArr = A0K;
            if (strArr[4].charAt(13) != strArr[5].charAt(13)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0K;
            strArr2[4] = "gTQ1s3dLsfyBRKnbIhTLZ9CvwCro6Qqx";
            strArr2[5] = "0Q3a2bvGDieSUKABFc67zGQyHnxCWCNj";
            if (i == -1) {
                return -1;
            }
        }
        int i2 = this.A03;
        String[] strArr3 = A0K;
        if (strArr3[1].length() != strArr3[2].length()) {
            throw new RuntimeException();
        }
        String[] strArr4 = A0K;
        strArr4[6] = "4EwytS8GlInOe";
        strArr4[0] = "gBmD7Ox9dAROs";
        return (i2 == 1 ? 1 : 0) | (this.A06 == 1 ? 2 : 0);
    }

    public final Layout.Alignment A0B() {
        return this.A0C;
    }

    public final Layout.Alignment A0C() {
        return this.A0D;
    }

    public final XU A0D() {
        return this.A0E;
    }

    public final C1152Xf A0E(float f) {
        this.A00 = f;
        return this;
    }

    public final C1152Xf A0F(float f) {
        this.A01 = f;
        return this;
    }

    public final C1152Xf A0G(int i) {
        this.A02 = i;
        this.A0H = true;
        return this;
    }

    public final C1152Xf A0H(int i) {
        this.A04 = i;
        this.A0I = true;
        return this;
    }

    public final C1152Xf A0I(int i) {
        this.A05 = i;
        return this;
    }

    public final C1152Xf A0J(int i) {
        this.A08 = i;
        return this;
    }

    public final C1152Xf A0K(int i) {
        this.A09 = i;
        return this;
    }

    public final C1152Xf A0L(Layout.Alignment alignment) {
        this.A0C = alignment;
        return this;
    }

    public final C1152Xf A0M(Layout.Alignment alignment) {
        this.A0D = alignment;
        return this;
    }

    public final C1152Xf A0N(XU xu) {
        this.A0E = xu;
        return this;
    }

    public final C1152Xf A0O(C1152Xf c1152Xf) {
        return A00(c1152Xf, true);
    }

    public final C1152Xf A0P(String str) {
        this.A0F = str;
        return this;
    }

    public final C1152Xf A0Q(String str) {
        this.A0G = str;
        return this;
    }

    public final C1152Xf A0R(boolean z) {
        this.A03 = z ? 1 : 0;
        return this;
    }

    public final C1152Xf A0S(boolean z) {
        this.A06 = z ? 1 : 0;
        return this;
    }

    public final C1152Xf A0T(boolean z) {
        this.A07 = z ? 1 : 0;
        return this;
    }

    public final C1152Xf A0U(boolean z) {
        this.A0A = z ? 1 : 0;
        return this;
    }

    public final C1152Xf A0V(boolean z) {
        this.A0B = z ? 1 : 0;
        return this;
    }

    public final String A0W() {
        return this.A0F;
    }

    public final String A0X() {
        return this.A0G;
    }

    public final boolean A0Y() {
        return this.A0A == 1;
    }

    public final boolean A0Z() {
        return this.A0H;
    }

    public final boolean A0a() {
        return this.A0I;
    }

    public final boolean A0b() {
        return this.A07 == 1;
    }

    public final boolean A0c() {
        return this.A0B == 1;
    }
}
