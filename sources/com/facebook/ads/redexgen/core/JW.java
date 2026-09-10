package com.facebook.ads.redexgen.core;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.OggPageHeader;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class JW {
    public static String[] A05 = {"woqNFTEJ1xTDdkI437bHtamdu4tXteqY", "wF9EC05jEy4IHYIwxnPCGFJPaq3oRF", "mvXHGyDRnyfaH7rDUTrxLU", "Y3pxu", "rdrAFFFqCGKv06lfALLqqSpp4fott15M", "y1UafG2XcmxkBa1SOf4hmBpigeNmapwO", "We1qkMSr6SX3sfWhtZ2XCBlgLjoOgFnd", "pWnGwQQvfY"};
    public int A01;
    public boolean A02;
    public final JX A04 = new JX();
    public final C11074v A03 = new C11074v(new byte[OggPageHeader.MAX_PAGE_PAYLOAD], 0);
    public int A00 = -1;

    private int A00(int i2) {
        this.A01 = 0;
        int i3 = 0;
        while (i < size) {
            int[] iArr = this.A04.A09;
            int i4 = this.A01;
            int size = i4 + 1;
            this.A01 = size;
            int segmentLength = iArr[i4 + i2];
            i3 += segmentLength;
            if (segmentLength != 255) {
                break;
            }
        }
        return i3;
    }

    public final C11074v A01() {
        return this.A03;
    }

    public final JX A02() {
        return this.A04;
    }

    public final void A03() {
        this.A04.A02();
        this.A03.A0d(0);
        this.A00 = -1;
        this.A02 = false;
    }

    public final void A04() {
        if (this.A03.A0l().length == 65025) {
            return;
        }
        this.A03.A0j(Arrays.copyOf(this.A03.A0l(), Math.max(OggPageHeader.MAX_PAGE_PAYLOAD, this.A03.A0A())), this.A03.A0A());
    }

    public final boolean A05(InterfaceC2651ms interfaceC2651ms) throws IOException {
        AbstractC10843y.A08(interfaceC2651ms != null);
        if (this.A02) {
            this.A02 = false;
            this.A03.A0d(0);
        }
        while (!this.A02) {
            int i2 = this.A00;
            if (A05[2].length() == 22) {
                String[] strArr = A05;
                strArr[4] = "11LtUWwuTljX7vpVMDmw91gP9qyXcF1F";
                strArr[5] = "domIksdZFoGV1iSe2ioqlJ00HNTdFQYJ";
                if (i2 < 0) {
                    if (!this.A04.A03(interfaceC2651ms) || !this.A04.A05(interfaceC2651ms, true)) {
                        return false;
                    }
                    int bytesToSkip = 0;
                    int iA00 = this.A04.A01;
                    if ((this.A04.A04 & 1) == 1) {
                        int iA0A = this.A03.A0A();
                        String[] strArr2 = A05;
                        if (strArr2[6].charAt(23) == strArr2[0].charAt(23)) {
                            throw new RuntimeException();
                        }
                        String[] strArr3 = A05;
                        strArr3[6] = "Y9zvOFuJw9CJ8t2sOsvBkpDySrHa8OsK";
                        strArr3[0] = "XKYFbcbdBuLAcpGhFvzSCFSZpxBENLjQ";
                        if (iA0A == 0) {
                            iA00 += A00(0);
                            bytesToSkip = 0 + this.A01;
                        }
                    }
                    if (!HB.A02(interfaceC2651ms, iA00)) {
                        return false;
                    }
                    this.A00 = bytesToSkip;
                }
                int bytesToSkip2 = this.A00;
                String[] strArr4 = A05;
                if (strArr4[4].charAt(26) != strArr4[5].charAt(26)) {
                    A05[2] = "D5kSzmFKF6oS1B0XjjhMyT";
                    int iA01 = A00(bytesToSkip2);
                    int bytesToSkip3 = this.A00;
                    int segmentIndex = bytesToSkip3 + this.A01;
                    if (iA01 > 0) {
                        this.A03.A0c(this.A03.A0A() + iA01);
                        if (!HB.A03(interfaceC2651ms, this.A03.A0l(), this.A03.A0A(), iA01)) {
                            return false;
                        }
                        this.A03.A0e(this.A03.A0A() + iA01);
                        int i3 = this.A04.A09[segmentIndex - 1];
                        if (A05[2].length() == 22) {
                            String[] strArr5 = A05;
                            strArr5[7] = "zAFVDFtFmf";
                            strArr5[3] = "FIDx8";
                            this.A02 = i3 != 255;
                        }
                    }
                    if (segmentIndex == this.A04.A02) {
                        segmentIndex = -1;
                    }
                    this.A00 = segmentIndex;
                }
            }
            throw new RuntimeException();
        }
        return true;
    }
}
