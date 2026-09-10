package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Iv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C1450Iv {
    public static byte[] A09;
    public int A00;
    public int A01;
    public long A02;
    public int A03;
    public int A04;
    public final int A05;
    public final C11074v A06;
    public final C11074v A07;
    public final boolean A08;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A09, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 78);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A09 = new byte[]{-42, -39, -30, -29, -28, -49, -45, -40, -27, -34, -37, -112, -35, -27, -29, -28, -112, -46, -43, -112, -95};
    }

    public C1450Iv(C11074v c11074v, C11074v c11074v2, boolean z2) throws C3K {
        this.A07 = c11074v;
        this.A06 = c11074v2;
        this.A08 = z2;
        c11074v2.A0f(12);
        this.A05 = c11074v2.A0L();
        c11074v.A0f(12);
        this.A04 = c11074v.A0L();
        HB.A01(c11074v.A0C() == 1, A00(0, 21, 34));
        this.A00 = -1;
    }

    public final boolean A02() {
        long jA0Q;
        int iA0L;
        int i2 = this.A00 + 1;
        this.A00 = i2;
        if (i2 == this.A05) {
            return false;
        }
        if (this.A08) {
            jA0Q = this.A06.A0R();
        } else {
            jA0Q = this.A06.A0Q();
        }
        this.A02 = jA0Q;
        if (this.A00 == this.A03) {
            this.A01 = this.A07.A0L();
            this.A07.A0g(4);
            int i3 = this.A04 - 1;
            this.A04 = i3;
            if (i3 > 0) {
                iA0L = this.A07.A0L() - 1;
            } else {
                iA0L = -1;
            }
            this.A03 = iA0L;
        }
        return true;
    }
}
