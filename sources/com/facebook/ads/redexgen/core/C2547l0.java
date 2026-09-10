package com.facebook.ads.redexgen.core;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.l0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2547l0 implements LL {
    public static byte[] A08;
    public static String[] A09 = {"mF6wsmKEoSH0oaFjYCs54xiQsDf", "7fvgeHK83IOxRTsxSXxl4b3GDJCkJYIR", "3AWdxUjQjYm4RALX7ZxT6TNspaUhotFB", "ejd6qsjsHb99jkL857XJ5GpzVF9O4Dmm", "HjmRuX1Dl2gTeBJaQInX56gY9CThxDdt", "4dP72HMzoJKZI0lPLVreHOZSlD0czmst", "VabPsN9EmqWHNd02VeXfGkhVpY5qzzPo", "1TiSMCKkeVz3FItUT5PAcFJ22kgDAGxf"};
    public int A00;
    public long A01;
    public long A02;
    public final int A03;
    public final C2860qI A04;
    public final HA A05;
    public final InterfaceC1407Hd A06;
    public final LN A07;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A08, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 81);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A08 = new byte[]{-68, -95, -24, -16, -11, -69, -95, -34, 17, 9, -2, -4, 13, -2, -3, -71, -5, 5, 8, -4, 4, -71, 12, 2, 19, -2, -45, -71};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.core.LL
    public final boolean AIt(InterfaceC2651ms interfaceC2651ms, long j) throws IOException {
        long j2 = j;
        while (true) {
            String[] strArr = A09;
            if (strArr[6].charAt(28) != strArr[5].charAt(28)) {
                throw new RuntimeException();
            }
            A09[7] = "xyHijgDe1t0LZE27YhGAb5keyZPdsLp6";
            if (j2 <= 0 || this.A00 >= this.A03) {
                int i2 = this.A07.A02;
                int i3 = this.A00 / i2;
                if (i3 > 0) {
                    long jA0U = this.A02 + C5C.A0U(this.A01, 1000000L, this.A07.A04);
                    int i4 = i3 * i2;
                    int i5 = this.A00 - i4;
                    this.A06.AIu(jA0U, 1, i4, i5, null);
                    this.A01 += (long) i3;
                    this.A00 = i5;
                }
                return j2 <= 0;
            }
            int iAIp = this.A06.AIp(interfaceC2651ms, (int) Math.min(this.A03 - this.A00, j2), true);
            if (iAIp == -1) {
                j2 = 0;
            } else {
                this.A00 += iAIp;
                j2 -= (long) iAIp;
            }
        }
    }

    static {
        A01();
    }

    public C2547l0(HA ha, InterfaceC1407Hd interfaceC1407Hd, LN ln, String str, int i2) throws C3K {
        this.A05 = ha;
        this.A06 = interfaceC1407Hd;
        this.A07 = ln;
        int i3 = (ln.A05 * ln.A01) / 8;
        int bytesPerFrame = ln.A02;
        if (bytesPerFrame == i3) {
            int bytesPerFrame2 = ln.A04;
            int constantBitrate = bytesPerFrame2 * i3 * 8;
            int bytesPerFrame3 = ln.A04;
            this.A03 = Math.max(i3, (bytesPerFrame3 * i3) / 10);
            C10512p c10512pA0j = new C10512p().A11(str).A0a(constantBitrate).A0j(constantBitrate);
            int bytesPerFrame4 = this.A03;
            C10512p c10512pA0h = c10512pA0j.A0h(bytesPerFrame4);
            int bytesPerFrame5 = ln.A05;
            C10512p c10512pA0b = c10512pA0h.A0b(bytesPerFrame5);
            int bytesPerFrame6 = ln.A04;
            this.A04 = c10512pA0b.A0m(bytesPerFrame6).A0i(i2).A14();
            return;
        }
        StringBuilder sbAppend = new StringBuilder().append(A00(7, 21, 72)).append(i3).append(A00(0, 7, 48));
        int bytesPerFrame7 = ln.A02;
        throw C3K.A01(sbAppend.append(bytesPerFrame7).toString(), null);
    }

    @Override // com.facebook.ads.redexgen.core.LL
    public final void AA8(int i2, long j) {
        this.A05.AJ7(new C2545ky(this.A07, 1, i2, j));
        this.A06.A6e(this.A04);
    }

    @Override // com.facebook.ads.redexgen.core.LL
    public final void AIk(long j) {
        this.A02 = j;
        this.A00 = 0;
        this.A01 = 0L;
    }
}
