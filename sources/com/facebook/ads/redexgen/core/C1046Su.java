package com.facebook.ads.redexgen.core;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.umeng.analytics.pro.cw;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Su, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1046Su implements Y7 {
    public static byte[] A0B;
    public static String[] A0C = {"UU4", "5kDq5zCM4dG6d991NXD0G9sJ0WOPqwsB", "p8XkjQAStLHUtKqrrAiwER6ksTNJUz4t", "DnJlNyrg4kuLhVn8G8l5X81joGPyP58J", "jIMRReNOGQp72Y08UAi", "Md1mOSXgUozSA6Q11b5qmTBd2J7pcDmW", "K81b8MFQIdYrhTyCLHBhed6wTbPrpXAS", "AlijsJ9SYvI1ijHaTPMhehKC4E8b4JSt"};
    public static final float[] A0D;
    public long A00;
    public long A01;
    public InterfaceC1086Uo A02;
    public YB A03;
    public String A04;
    public boolean A05;
    public final YA A06;
    public final YG A07;
    public final YV A08;
    public final C1576fq A09;
    public final boolean[] A0A;

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0B, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 92);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A0B = new byte[]{4, -18, -14, -17, cw.l, 33, 29, 32, 33, 46, -1, 36, 44, 23, 34, 31, 26, -42, 23, 41, 38, 27, 25, 42, -42, 40, 23, 42, 31, 37, -81, -44, -36, -57, -46, -49, -54, -122, -36, -43, -42, -59, -49, -44, -55, -40, -53, -45, -53, -44, -38, -59, -38, -49, -45, -53, -59, -40, -53, -39, -43, -46, -37, -38, -49, -43, -44, -11, cw.l, 8, 1, cw.l, 4, 12, 5, 4, -64, 22, 9, 4, 5, cw.m, -64, cw.m, 2, 10, 5, 3, 20, -64, 12, 1, 25, 5, 18, -64, 19, 8, 1, cw.n, 5, 58, 45, 40, 41, 51, -13, 49, 52, -8, 58, -15, 41, 55};
    }

    static {
        A02();
        A0D = new float[]{1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    }

    public C1046Su() {
        this(null);
    }

    public C1046Su(YV yv) {
        this.A08 = yv;
        this.A0A = new boolean[4];
        this.A06 = new YA(128);
        this.A00 = C.TIME_UNSET;
        if (yv != null) {
            this.A07 = new YG(178, 128);
            this.A09 = new C1576fq();
        } else {
            this.A07 = null;
            this.A09 = null;
        }
    }

    public static ZM A00(YA ya, int i, String str) {
        float f;
        byte[] bArrCopyOf = Arrays.copyOf(ya.A02, ya.A00);
        C1575fp c1575fp = new C1575fp(bArrCopyOf);
        c1575fp.A0A(i);
        c1575fp.A0A(4);
        c1575fp.A07();
        c1575fp.A09(8);
        if (c1575fp.A0H()) {
            c1575fp.A09(4);
            c1575fp.A09(3);
        }
        int iA04 = c1575fp.A04(4);
        String strA01 = A01(10, 20, 90);
        String strA02 = A01(0, 10, 96);
        if (iA04 == 15) {
            int iA05 = c1575fp.A04(8);
            int iA06 = c1575fp.A04(8);
            if (iA06 == 0) {
                AbstractC1561fb.A07(strA02, strA01);
                f = 1.0f;
            } else {
                f = iA05 / iA06;
            }
        } else if (iA04 < A0D.length) {
            f = A0D[iA04];
        } else {
            AbstractC1561fb.A07(strA02, strA01);
            f = 1.0f;
        }
        if (c1575fp.A0H()) {
            c1575fp.A09(2);
            c1575fp.A09(1);
            if (c1575fp.A0H()) {
                c1575fp.A09(15);
                String[] strArr = A0C;
                if (strArr[1].charAt(20) == strArr[3].charAt(20)) {
                    throw new RuntimeException();
                }
                A0C[2] = "xfKDXpL2Bcgn811sgO7YIyKvVTmQhFv5";
                c1575fp.A07();
                c1575fp.A09(15);
                c1575fp.A07();
                c1575fp.A09(15);
                c1575fp.A07();
                c1575fp.A09(3);
                c1575fp.A09(11);
                c1575fp.A07();
                c1575fp.A09(15);
                c1575fp.A07();
            }
        }
        if (c1575fp.A04(2) != 0) {
            AbstractC1561fb.A07(strA02, A01(67, 34, 68));
        }
        c1575fp.A07();
        int iA07 = c1575fp.A04(16);
        c1575fp.A07();
        if (c1575fp.A0H()) {
            if (iA07 == 0) {
                AbstractC1561fb.A07(strA02, A01(30, 37, 10));
            } else {
                int i2 = 0;
                for (int i3 = iA07 - 1; i3 > 0; i3 >>= 1) {
                    i2++;
                }
                c1575fp.A09(i2);
            }
        }
        c1575fp.A07();
        int videoObjectLayerWidth = c1575fp.A04(13);
        c1575fp.A07();
        int videoObjectLayerHeight = c1575fp.A04(13);
        c1575fp.A07();
        c1575fp.A07();
        return new P5().A0y(str).A11(A01(101, 13, 104)).A0r(videoObjectLayerWidth).A0f(videoObjectLayerHeight).A0Y(f).A12(Collections.singletonList(bArrCopyOf)).A14();
    }

    @Override // com.facebook.ads.redexgen.core.Y7
    public final void A50(C1576fq c1576fq) {
        AbstractC1517es.A02(this.A03);
        AbstractC1517es.A02(this.A02);
        int startCodeValue = c1576fq.A09();
        int bytesAlreadyPassed = c1576fq.A0A();
        byte[] bArrA0l = c1576fq.A0l();
        long j = this.A01;
        int offset = c1576fq.A07();
        this.A01 = j + ((long) offset);
        InterfaceC1086Uo interfaceC1086Uo = this.A02;
        int offset2 = c1576fq.A07();
        interfaceC1086Uo.AHx(c1576fq, offset2);
        while (true) {
            boolean[] zArr = this.A0A;
            int limit = A0C[0].length();
            if (limit == 30) {
                throw new RuntimeException();
            }
            A0C[2] = "CFtUxCmNoBWhFiIEntXm3PjzCTYd2fYp";
            int offset3 = AbstractC1078Ud.A04(bArrA0l, startCodeValue, bytesAlreadyPassed, zArr);
            if (offset3 == bytesAlreadyPassed) {
                if (!this.A05) {
                    this.A06.A03(bArrA0l, startCodeValue, bytesAlreadyPassed);
                }
                this.A03.A03(bArrA0l, startCodeValue, bytesAlreadyPassed);
                if (this.A07 != null) {
                    this.A07.A02(bArrA0l, startCodeValue, bytesAlreadyPassed);
                    return;
                }
                return;
            }
            byte[] dataArray = c1576fq.A0l();
            int limit2 = offset3 + 3;
            int i = dataArray[limit2] & 255;
            int startCodeOffset = offset3 - startCodeValue;
            if (!this.A05) {
                if (startCodeOffset > 0) {
                    this.A06.A03(bArrA0l, startCodeValue, offset3);
                }
                if (this.A06.A04(i, startCodeOffset < 0 ? -startCodeOffset : 0)) {
                    this.A02.A6U(A00(this.A06, this.A06.A01, (String) AbstractC1517es.A01(this.A04)));
                    this.A05 = true;
                }
            }
            this.A03.A03(bArrA0l, startCodeValue, offset3);
            if (this.A07 != null) {
                int i2 = 0;
                if (startCodeOffset > 0) {
                    this.A07.A02(bArrA0l, startCodeValue, offset3);
                } else {
                    i2 = -startCodeOffset;
                }
                if (this.A07.A04(i2)) {
                    byte[] dataArray2 = this.A07.A01;
                    int limit3 = this.A07.A00;
                    ((C1576fq) AbstractC1600gE.A0f(this.A09)).A0j(this.A07.A01, AbstractC1078Ud.A02(dataArray2, limit3));
                    ((YV) AbstractC1600gE.A0f(this.A08)).A02(this.A00, this.A09);
                }
                if (i == 178) {
                    byte[] dataArray3 = c1576fq.A0l();
                    int limit4 = offset3 + 2;
                    if (dataArray3[limit4] == 1) {
                        this.A07.A01(i);
                    }
                }
            }
            int i3 = bytesAlreadyPassed - offset3;
            this.A03.A02(this.A01 - ((long) i3), i3, this.A05);
            this.A03.A01(i, this.A00);
            startCodeValue = offset3 + 3;
        }
    }

    @Override // com.facebook.ads.redexgen.core.Y7
    public final void A5S(UL ul, YS ys) {
        ys.A05();
        this.A04 = ys.A04();
        this.A02 = ul.AJX(ys.A03(), 2);
        this.A03 = new YB(this.A02);
        if (this.A08 != null) {
            this.A08.A03(ul, ys);
        }
    }

    @Override // com.facebook.ads.redexgen.core.Y7
    public final void AFx() {
    }

    @Override // com.facebook.ads.redexgen.core.Y7
    public final void AFy(long j, int i) {
        if (j != C.TIME_UNSET) {
            this.A00 = j;
        }
    }

    @Override // com.facebook.ads.redexgen.core.Y7
    public final void AIB() {
        AbstractC1078Ud.A0H(this.A0A);
        this.A06.A02();
        if (this.A03 != null) {
            this.A03.A00();
        }
        if (this.A07 != null) {
            this.A07.A00();
        }
        this.A01 = 0L;
        this.A00 = C.TIME_UNSET;
    }
}
