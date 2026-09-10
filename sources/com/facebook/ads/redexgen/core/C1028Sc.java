package com.facebook.ads.redexgen.core;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Sc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1028Sc implements YT {
    public static byte[] A0C;
    public static String[] A0D = {"9TAby0kNjHx9MW0oX2U5tR3UFfl4M6Fc", "9wvrVXbABOMWuYCjw7gUO392vyNUZwV5", "oIjlUv9NU41FuwHXUUl30vEJoeyVPwSF", "JlVHUpqpehe4aHwlXL0OVETXukPr4fcW", "GfpkmnHzyCQ55u0yEIPzZZ2ufTZGzuvl", "iXu", "GZ7JusZ2ldl0um7DtEFN5mFa9jg8Ap63", "v7caFSowC3UlJhstXeUgQGU5Rhf8cnDW"};
    public int A00;
    public int A01;
    public int A02;
    public long A04;
    public C1590g4 A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final Y7 A0A;
    public final C1575fp A0B = new C1575fp(new byte[10]);
    public int A03 = 0;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0C, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 1);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        if (A0D[2].charAt(3) != 'l') {
            throw new RuntimeException();
        }
        String[] strArr = A0D;
        strArr[4] = "GgX5caeaEGPD198FUZgXxTd6TFlI4FKd";
        strArr[6] = "GYCJgRx91u7iZEQsWB8T7bFfAdyad0o9";
        A0C = new byte[]{107, -72, -70, -67, -80, 107, -83, -60, -65, -80, -66, 88, -127, -121, -128, 118, 50, -128, 119, 121, 115, -122, 123, -120, 119, 50, -126, 115, 117, 125, 119, -122, 50, -126, 115, -117, 126, -127, 115, 118, 50, -123, 123, -116, 119, 76, 50, 95, 116, -126, 97, 116, 112, 115, 116, -127, 107, -124, 123, -114, -122, 123, 121, -118, 123, 122, 54, -119, -118, 119, -120, -118, 54, 121, -123, 122, 123, 54, -122, -120, 123, 124, 127, -114, 80, 54, -74, -49, -58, -39, -47, -58, -60, -43, -58, -59, -127, -44, -43, -62, -45, -43, -127, -54, -49, -59, -54, -60, -62, -43, -48, -45, -127, -45, -58, -62, -59, -54, -49, -56, -127, -58, -39, -43, -58, -49, -59, -58, -59, -127, -55, -58, -62, -59, -58, -45, -113, -88, -97, -78, -86, -97, -99, -82, -97, -98, 90, -83, -82, -101, -84, -82, 90, -93, -88, -98, -93, -99, -101, -82, -87, -84, 116, 90, -97, -78, -86, -97, -99, -82, -97, -98, 90};
    }

    static {
        A02();
    }

    public C1028Sc(Y7 y7) {
        this.A0A = y7;
    }

    @RequiresNonNull({"timestampAdjuster"})
    private void A01() {
        this.A0B.A08(0);
        this.A04 = C.TIME_UNSET;
        if (this.A08) {
            this.A0B.A09(4);
            long jA04 = ((long) this.A0B.A04(3)) << 30;
            this.A0B.A09(1);
            long pts = this.A0B.A04(15) << 15;
            long j = jA04 | pts;
            this.A0B.A09(1);
            long pts2 = this.A0B.A04(15);
            long j2 = j | pts2;
            this.A0B.A09(1);
            if (!this.A09 && this.A07) {
                this.A0B.A09(4);
                long pts3 = this.A0B.A04(3);
                this.A0B.A09(1);
                long pts4 = (pts3 << 30) | ((long) (this.A0B.A04(15) << 15));
                this.A0B.A09(1);
                long pts5 = pts4 | ((long) this.A0B.A04(15));
                this.A0B.A09(1);
                this.A05.A06(pts5);
                this.A09 = true;
            }
            this.A04 = this.A05.A06(j2);
        }
    }

    private void A03(int i) {
        this.A03 = i;
        this.A00 = 0;
    }

    private boolean A04() {
        this.A0B.A08(0);
        int iA04 = this.A0B.A04(24);
        String strA00 = A00(47, 9, 14);
        if (iA04 != 1) {
            AbstractC1561fb.A07(strA00, A00(56, 30, 21) + iA04);
            this.A02 = -1;
            return false;
        }
        this.A0B.A09(8);
        int iA05 = this.A0B.A04(16);
        this.A0B.A09(5);
        this.A06 = this.A0B.A0H();
        this.A0B.A09(2);
        this.A08 = this.A0B.A0H();
        this.A07 = this.A0B.A0H();
        this.A0B.A09(6);
        int startCodePrefix = this.A0B.A04(8);
        this.A01 = startCodePrefix;
        if (iA05 == 0) {
            this.A02 = -1;
        } else {
            int startCodePrefix2 = iA05 + 6;
            int packetLength = startCodePrefix2 - 9;
            int startCodePrefix3 = this.A01;
            this.A02 = packetLength - startCodePrefix3;
            int startCodePrefix4 = this.A02;
            if (startCodePrefix4 < 0) {
                StringBuilder sbAppend = new StringBuilder().append(A00(11, 36, 17));
                int startCodePrefix5 = this.A02;
                AbstractC1561fb.A07(strA00, sbAppend.append(startCodePrefix5).toString());
                this.A02 = -1;
            }
        }
        return true;
    }

    private boolean A05(C1576fq c1576fq, byte[] bArr, int i) {
        int iMin = Math.min(c1576fq.A07(), i - this.A00);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            c1576fq.A0g(iMin);
        } else {
            int bytesToRead = this.A00;
            c1576fq.A0k(bArr, bytesToRead, iMin);
        }
        int bytesToRead2 = this.A00;
        this.A00 = bytesToRead2 + iMin;
        int bytesToRead3 = this.A00;
        return bytesToRead3 == i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:42:0x00fc  */
    @Override // com.facebook.ads.redexgen.core.YT
    public final void A51(C1576fq c1576fq, int i) throws Q6 {
        AbstractC1517es.A02(this.A05);
        if ((i & 1) != 0) {
            int i2 = this.A03;
            String strA00 = A00(47, 9, 14);
            switch (i2) {
                case 0:
                case 1:
                    A03(1);
                    break;
                case 2:
                    AbstractC1561fb.A07(strA00, A00(86, 50, 96));
                    A03(1);
                    break;
                case 3:
                    if (this.A02 != -1) {
                        AbstractC1561fb.A07(strA00, A00(136, 37, 57) + this.A02 + A00(0, 11, 74));
                    }
                    this.A0A.AFx();
                    A03(1);
                    break;
                default:
                    throw new IllegalStateException();
            }
        }
        while (c1576fq.A07() > 0) {
            int i3 = this.A03;
            if (A0D[5].length() != 3) {
                throw new RuntimeException();
            }
            A0D[1] = "V3cZYxSqVWD4zO864gHOyxoo4mbOJtMC";
            int i4 = 0;
            switch (i3) {
                case 0:
                    c1576fq.A0g(c1576fq.A07());
                    break;
                case 1:
                    if (A05(c1576fq, this.A0B.A00, 9)) {
                        A03(A04() ? 2 : 0);
                    }
                    break;
                case 2:
                    if (A05(c1576fq, this.A0B.A00, Math.min(10, this.A01))) {
                        int i5 = this.A01;
                        if (A0D[2].charAt(3) != 'l') {
                            A0D[1] = "PPWNF8Jhp4T00Qw1mqKm2HuHAydDfExW";
                            if (A05(c1576fq, null, i5)) {
                                A01();
                                i |= this.A06 ? 4 : 0;
                                this.A0A.AFy(this.A04, i);
                                A03(3);
                            }
                        } else {
                            String[] strArr = A0D;
                            strArr[3] = "PnvGsUz1VlKNmFL0IQ6Q52ziqwtpSdDi";
                            strArr[0] = "fp1mOhlujdIQN0rtqt37KaiP0GyAG04U";
                            if (A05(c1576fq, null, i5)) {
                                A01();
                                i |= this.A06 ? 4 : 0;
                                this.A0A.AFy(this.A04, i);
                                A03(3);
                            }
                        }
                    }
                    break;
                case 3:
                    int iA07 = c1576fq.A07();
                    int readLength = this.A02;
                    if (readLength != -1) {
                        int readLength2 = this.A02;
                        i4 = iA07 - readLength2;
                    }
                    if (i4 > 0) {
                        iA07 -= i4;
                        int readLength3 = c1576fq.A09();
                        c1576fq.A0e(readLength3 + iA07);
                    }
                    this.A0A.A50(c1576fq);
                    int readLength4 = this.A02;
                    if (readLength4 != -1) {
                        int readLength5 = this.A02;
                        this.A02 = readLength5 - iA07;
                        int readLength6 = this.A02;
                        if (readLength6 == 0) {
                            this.A0A.AFx();
                            A03(1);
                        }
                    }
                    break;
                default:
                    throw new IllegalStateException();
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.YT
    public final void AA3(C1590g4 c1590g4, UL ul, YS ys) {
        this.A05 = c1590g4;
        this.A0A.A5S(ul, ys);
    }

    @Override // com.facebook.ads.redexgen.core.YT
    public final void AIB() {
        this.A03 = 0;
        this.A00 = 0;
        this.A09 = false;
        this.A0A.AIB();
    }
}
