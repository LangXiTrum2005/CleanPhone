package com.facebook.ads.redexgen.core;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class DL {
    public static String[] A07 = {"1TUPUvqjuckMieKxy618dXqeho2I2nXO", "1tw", "Rv8BHxt03y9lIrpcW4kHhbfWsqmFKBVK", "r8Px", "D2vXeeTjlCXB4Odv", "hN", "uuD40", "TpLNmCJV5wG1YwTXf3toM93vl9iWeWk7"};
    public long A00;
    public C2702ni A01;
    public C2702ni A02;
    public C2702ni A03;
    public final int A04;
    public final C11074v A05 = new C11074v(32);
    public final F0 A06;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C2702ni A04(C2702ni c2702ni, C2781p0 c2781p0, DN dn, C11074v c11074v) {
        int iA0M;
        long j = dn.A01;
        c11074v.A0d(1);
        C2702ni c2702niA03 = A03(c2702ni, j, c11074v.A0l(), 1);
        long j2 = j + 1;
        byte b2 = c11074v.A0l()[0];
        boolean z2 = (b2 & 128) != 0;
        int i2 = b2 & AbstractJsonLexerKt.TC_INVALID;
        C11375z c11375z = c2781p0.A05;
        if (c11375z.A04 == null) {
            c11375z.A04 = new byte[16];
        } else {
            Arrays.fill(c11375z.A04, (byte) 0);
        }
        C2702ni c2702niA04 = A03(c2702niA03, j2, c11375z.A04, i2);
        long j3 = j2 + ((long) i2);
        if (z2) {
            c11074v.A0d(2);
            c2702niA04 = A03(c2702niA04, j3, c11074v.A0l(), 2);
            j3 += 2;
            iA0M = c11074v.A0M();
        } else {
            iA0M = 1;
            if (A07[7].charAt(5) == 'i') {
                throw new RuntimeException();
            }
            A07[7] = "Hpyz1f8ALnZx1iP9R6alck8MxH3P54oK";
        }
        int[] iArr = c11375z.A06;
        if (iArr == null || iArr.length < iA0M) {
            iArr = new int[iA0M];
        }
        int[] iArr2 = c11375z.A07;
        if (iArr2 == null || iArr2.length < iA0M) {
            iArr2 = new int[iA0M];
        }
        if (z2) {
            int i3 = iA0M * 6;
            c11074v.A0d(i3);
            c2702niA04 = A03(c2702niA04, j3, c11074v.A0l(), i3);
            j3 += (long) i3;
            c11074v.A0f(0);
            for (int i4 = 0; i4 < iA0M; i4++) {
                iArr[i4] = c11074v.A0M();
                iArr2[i4] = c11074v.A0L();
            }
        } else {
            iArr[0] = 0;
            iArr2[0] = dn.A00 - ((int) (j3 - dn.A01));
        }
        C1405Hb c1405Hb = (C1405Hb) C5C.A0f(dn.A02);
        c11375z.A02(iA0M, iArr, iArr2, c1405Hb.A03, c11375z.A04, c1405Hb.A01, c1405Hb.A02, c1405Hb.A00);
        int i5 = (int) (j3 - dn.A01);
        dn.A01 += (long) i5;
        if (A07[0].charAt(1) == 'T') {
            A07[0] = "nTpP9ibfF3cbwjVbkTA4UIhNPpZui5fl";
            dn.A00 -= i5;
            return c2702niA04;
        }
        String[] strArr = A07;
        strArr[3] = "b8i1";
        strArr[6] = "bRWrT";
        dn.A00 -= i5;
        return c2702niA04;
    }

    public DL(F0 f0) {
        this.A06 = f0;
        this.A04 = f0.A8I();
        this.A01 = new C2702ni(0L, this.A04);
        this.A02 = this.A01;
        this.A03 = this.A01;
    }

    private int A00(int i2) {
        if (this.A03.A03 == null) {
            this.A03.A03(this.A06.A49(), new C2702ni(this.A03.A00, this.A04));
        }
        return Math.min(i2, (int) (this.A03.A00 - this.A00));
    }

    public static C2702ni A01(C2702ni c2702ni, long j) {
        while (j >= c2702ni.A00) {
            c2702ni = c2702ni.A02;
        }
        return c2702ni;
    }

    public static C2702ni A02(C2702ni c2702ni, long j, ByteBuffer byteBuffer, int i2) {
        C2702ni c2702niA01 = A01(c2702ni, j);
        while (i2 > 0) {
            int remaining = (int) (c2702niA01.A00 - j);
            int iMin = Math.min(i2, remaining);
            byte[] bArr = c2702niA01.A03.A01;
            int remaining2 = c2702niA01.A00(j);
            byteBuffer.put(bArr, remaining2, iMin);
            i2 -= iMin;
            j += (long) iMin;
            if (j == c2702niA01.A00) {
                c2702niA01 = c2702niA01.A02;
            }
        }
        return c2702niA01;
    }

    public static C2702ni A03(C2702ni c2702ni, long j, byte[] bArr, int i2) {
        C2702ni c2702niA01 = A01(c2702ni, j);
        int i3 = i2;
        while (i3 > 0) {
            int iMin = Math.min(i3, (int) (c2702niA01.A00 - j));
            byte[] bArr2 = c2702niA01.A03.A01;
            int toCopy = c2702niA01.A00(j);
            int remaining = i2 - i3;
            System.arraycopy(bArr2, toCopy, bArr, remaining, iMin);
            i3 -= iMin;
            j += (long) iMin;
            if (j == c2702niA01.A00) {
                c2702niA01 = c2702niA01.A02;
            }
        }
        return c2702niA01;
    }

    public static C2702ni A05(C2702ni c2702ni, C2781p0 c2781p0, DN dn, C11074v c11074v) {
        if (c2781p0.A0E()) {
            c2702ni = A04(c2702ni, c2781p0, dn, c11074v);
        }
        if (c2781p0.A03()) {
            c11074v.A0d(4);
            C2702ni c2702niA03 = A03(c2702ni, dn.A01, c11074v.A0l(), 4);
            int iA0L = c11074v.A0L();
            dn.A01 += 4;
            dn.A00 -= 4;
            c2781p0.A0C(iA0L);
            C2702ni c2702niA02 = A02(c2702niA03, dn.A01, c2781p0.A02, iA0L);
            dn.A01 += (long) iA0L;
            dn.A00 -= iA0L;
            c2781p0.A0D(dn.A00);
            return A02(c2702niA02, dn.A01, c2781p0.A03, dn.A00);
        }
        c2781p0.A0C(dn.A00);
        return A02(c2702ni, dn.A01, c2781p0.A02, dn.A00);
    }

    private void A06(int i2) {
        this.A00 += (long) i2;
        if (this.A00 == this.A03.A00) {
            this.A03 = this.A03.A02;
        }
    }

    private void A07(C2702ni c2702ni) {
        if (c2702ni.A03 == null) {
            return;
        }
        this.A06.AHe(c2702ni);
        c2702ni.A01();
    }

    public final int A08(InterfaceC10402c interfaceC10402c, int i2, boolean z2) throws IOException {
        int i3 = interfaceC10402c.read(this.A03.A03.A01, this.A03.A00(this.A00), A00(i2));
        if (i3 == -1) {
            if (z2) {
                return -1;
            }
            throw new EOFException();
        }
        A06(i3);
        return i3;
    }

    public final long A09() {
        return this.A00;
    }

    public final void A0A() {
        A07(this.A01);
        this.A01.A02(0L, this.A04);
        this.A02 = this.A01;
        this.A03 = this.A01;
        this.A00 = 0L;
        this.A06.AKT();
    }

    public final void A0B() {
        this.A02 = this.A01;
    }

    public final void A0C(long j) {
        if (j == -1) {
            return;
        }
        while (j >= this.A01.A00) {
            this.A06.AHd(this.A01.A03);
            this.A01 = this.A01.A01();
        }
        long j2 = this.A02.A01;
        long j3 = this.A01.A01;
        String[] strArr = A07;
        if (strArr[3].length() == strArr[6].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A07;
        strArr2[3] = "kTcq";
        strArr2[6] = "Dj6YZ";
        if (j2 < j3) {
            this.A02 = this.A01;
        }
    }

    public final void A0D(C11074v c11074v, int i2) {
        while (i2 > 0) {
            int iA00 = A00(i2);
            byte[] bArr = this.A03.A03.A01;
            int bytesAppended = this.A03.A00(this.A00);
            c11074v.A0k(bArr, bytesAppended, iA00);
            i2 -= iA00;
            A06(iA00);
        }
    }

    public final void A0E(C2781p0 c2781p0, DN dn) {
        A05(this.A02, c2781p0, dn, this.A05);
    }

    public final void A0F(C2781p0 c2781p0, DN dn) {
        this.A02 = A05(this.A02, c2781p0, dn, this.A05);
    }
}
