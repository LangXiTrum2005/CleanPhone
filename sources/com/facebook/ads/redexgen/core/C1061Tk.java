package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Tk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1061Tk implements W8 {
    public static byte[] A03;
    public static String[] A04 = {"hzw9X9GplxFenO", "mr", "eSgPSvhdyRUNuJEmKS3v3Y2qC3VmbDDU", "H3D", "kMq0zgmYTBjPFTCfqOESAoN1WiMPTwIN", "0ryUCh8KToOB7oIRjX4NVAlIweaZoTkN", "tRzJTDgOEnwp9ClspW3SLkymSAcnurzU", "ZyRwqq3dZ2uAk"};
    public final int A00;
    public final int A01;
    public final C1576fq A02;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 2);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        if (A04[7].length() != 13) {
            throw new RuntimeException();
        }
        A04[1] = "W11c6lYPj2izyCaf066";
        A03 = new byte[]{85, 73, -100, -99, -100, -93, 73, -100, -118, -106, -103, -107, -114, 73, -100, -110, -93, -114, 99, 73, 72, 123, 118, 116, 87, 104, 121, 122, 108, 121, 122, 73, 125, 108, 113, 119, 40, 123, 105, 117, 120, 116, 109, 40, 123, 113, -126, 109, 40, 117, 113, 123, 117, 105, 124, 107, 112, 54, 40, 123, 124, 123, 108, 40, 123, 105, 117, 120, 116, 109, 40, 123, 113, -126, 109, 66, 40, -59, -39, -56, -51, -45, -109, -42, -59, -37};
    }

    static {
        A01();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0034  */
    public C1061Tk(C1062Tl c1062Tl, ZM zm) {
        this.A02 = c1062Tl.A00;
        this.A02.A0f(12);
        int iA0L = this.A02.A0L();
        if (A00(77, 9, 98).equals(zm.A0W)) {
            int i = zm.A0C;
            int fixedSampleSize = zm.A06;
            int iA06 = AbstractC1600gE.A06(i, fixedSampleSize);
            if (iA0L != 0) {
                int fixedSampleSize2 = iA0L % iA06;
                if (fixedSampleSize2 != 0) {
                    AbstractC1561fb.A07(A00(20, 11, 5), A00(31, 46, 6) + iA06 + A00(0, 20, 39) + iA0L);
                    iA0L = iA06;
                }
            } else {
                AbstractC1561fb.A07(A00(20, 11, 5), A00(31, 46, 6) + iA06 + A00(0, 20, 39) + iA0L);
                iA0L = iA06;
            }
        }
        this.A00 = iA0L == 0 ? -1 : iA0L;
        int fixedSampleSize3 = this.A02.A0L();
        this.A01 = fixedSampleSize3;
    }

    @Override // com.facebook.ads.redexgen.core.W8
    public final int A80() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.W8
    public final int A8l() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.core.W8
    public final int AGa() {
        return this.A00 == -1 ? this.A02.A0L() : this.A00;
    }
}
