package com.facebook.ads.redexgen.core;

import com.umeng.analytics.pro.cw;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.9a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C05669a implements InterfaceC1064Tn {
    public static byte[] A04;
    public static String[] A05 = {"xHILsbM1", "r9UR5mr64LX6eV4yUDAPzib1Gta", "ZQbIEf", "HuBz2", "SUFRTEuidhxn3hImQljJKV", "gaKc2fXcJsaSfjwMpUKSyAgqbWjrPPEf", "i1SnwhgXOAnC9omDSsrvwHYzb4OR8iqS", "p33njeS322l"};
    public final long A00;
    public final long A01;
    public final long[] A02;
    public final long[] A03;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C05669a A00(long j, long j2, UY uy, C1576fq c1576fq) {
        int iA0I;
        long j3 = j2;
        c1576fq.A0g(10);
        int iA0C = c1576fq.A0C();
        if (iA0C <= 0) {
            return null;
        }
        int i = uy.A03;
        long jA0U = AbstractC1600gE.A0U(iA0C, ((long) (i >= 32000 ? 1152 : 576)) * 1000000, i);
        int iA0M = c1576fq.A0M();
        int iA0M2 = c1576fq.A0M();
        if (A05[0].length() == 12) {
            throw new RuntimeException();
        }
        A05[7] = "yOI5KAPdn3q";
        int iA0M3 = c1576fq.A0M();
        c1576fq.A0g(2);
        long j4 = j3 + ((long) uy.A02);
        long[] jArr = new long[iA0M];
        long[] jArr2 = new long[iA0M];
        for (int i2 = 0; i2 < iA0M; i2++) {
            jArr[i2] = (((long) i2) * jA0U) / ((long) iA0M);
            jArr2[i2] = Math.max(j3, j4);
            switch (iA0M3) {
                case 1:
                    iA0I = c1576fq.A0I();
                    break;
                case 2:
                    iA0I = c1576fq.A0M();
                    break;
                case 3:
                    iA0I = c1576fq.A0K();
                    break;
                case 4:
                    iA0I = c1576fq.A0L();
                    break;
                default:
                    return null;
            }
            j3 += ((long) iA0I) * ((long) iA0M2);
        }
        if (j != -1 && j != j3) {
            AbstractC1561fb.A07(A01(27, 10, 75), A01(2, 25, 59) + j + A01(0, 2, 25) + j3);
        }
        return new C05669a(jArr, jArr2, jA0U, j3);
    }

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 93);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A04 = new byte[]{-94, -106, -18, -38, -22, -31, -72, -4, -7, 12, -7, -72, 11, 1, 18, -3, -72, 5, 1, 11, 5, -7, 12, -5, 0, -46, -72, -2, 10, 26, 17, -5, cw.k, cw.k, 19, cw.k, 26};
    }

    static {
        A02();
    }

    public C05669a(long[] jArr, long[] jArr2, long j, long j2) {
        this.A03 = jArr;
        this.A02 = jArr2;
        this.A01 = j;
        this.A00 = j2;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1064Tn
    public final long A7Z() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.Uj
    public final long A7j() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.core.Uj
    public final C1082Ui A8r(long j) {
        int iA0L = AbstractC1600gE.A0L(this.A03, j, true, true);
        C1083Uk c1083Uk = new C1083Uk(this.A03[iA0L], this.A02[iA0L]);
        if (c1083Uk.A01 < j) {
            int length = this.A03.length - 1;
            if (A05[3].length() == 20) {
                throw new RuntimeException();
            }
            A05[1] = "H8upqA";
            if (iA0L != length) {
                int tableIndex = iA0L + 1;
                long j2 = this.A03[tableIndex];
                int tableIndex2 = iA0L + 1;
                C1083Uk nextSeekPoint = new C1083Uk(j2, this.A02[tableIndex2]);
                return new C1082Ui(c1083Uk, nextSeekPoint);
            }
        }
        return new C1082Ui(c1083Uk);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1064Tn
    public final long A97(long j) {
        return this.A03[AbstractC1600gE.A0L(this.A02, j, true, true)];
    }

    @Override // com.facebook.ads.redexgen.core.Uj
    public final boolean AAY() {
        return true;
    }
}
