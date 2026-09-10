package com.facebook.ads.redexgen.core;

import com.umeng.analytics.pro.cw;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Rw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1022Rw implements YX {
    public static byte[] A08;
    public static String[] A09 = {"3YB8MGqCwNcEW0DMrwKIRHm1ckBrFTBA", "IkZpt8vQXgwkTV6SNbg9dFllmwZBVUt", "mRsGorhsvHmVhFUaH29UgPmeOtvHn4lN", "NZGXVerQjN", "ktEBhwdBZHicIkHEv9835rc7Bz5E4mB", "Jde05jIIt5KuIrQgX4QesNYVwpb959jW", "Ph5WWolLggrmlvQk6tNF1eIKiattDb4b", "QNl37q0upAJmuWWTurj1wDKNZ6jUozY3"};
    public int A00;
    public long A01;
    public long A02;
    public final int A03;
    public final ZM A04;
    public final UL A05;
    public final InterfaceC1086Uo A06;
    public final YZ A07;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A08, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 112);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A08 = new byte[]{6, 29, 90, 82, 73, 7, 29, cw.k, 48, 56, 45, 43, 60, 45, 44, 104, 42, 36, 39, 43, 35, 104, 59, 33, 50, 45, 114, 104};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.core.YX
    public final boolean AHz(WJ wj, long j) throws IOException {
        long j2 = j;
        while (j2 > 0 && this.A00 < this.A03) {
            int iMin = (int) Math.min(this.A03 - this.A00, j2);
            InterfaceC1086Uo interfaceC1086Uo = this.A06;
            if (A09[5].charAt(24) != 'w') {
                throw new RuntimeException();
            }
            String[] strArr = A09;
            strArr[6] = "0GH7tQrl0ummAEMDPuDZZEZfCoTZGEUG";
            strArr[7] = "3NlRy6inOQbmBxPmnSpvnVgiP2E3EIKz";
            int iAHv = interfaceC1086Uo.AHv(wj, iMin, true);
            if (iAHv == -1) {
                j2 = 0;
            } else {
                this.A00 += iAHv;
                j2 -= (long) iAHv;
            }
        }
        int i = this.A07.A02;
        int i2 = this.A00 / i;
        if (i2 > 0) {
            long jA0U = this.A02 + AbstractC1600gE.A0U(this.A01, 1000000L, this.A07.A04);
            int i3 = i2 * i;
            int i4 = this.A00;
            String[] strArr2 = A09;
            if (strArr2[0].charAt(22) != strArr2[2].charAt(22)) {
                A09[3] = "ynB1qy4xiFaN66tDf";
                int i5 = i4 - i3;
                this.A06.AI0(jA0U, 0, i3, i5, null);
                this.A01 += (long) i2;
                this.A00 = i5;
            } else {
                String[] strArr3 = A09;
                strArr3[0] = "pUQkPna5OKFVMo6gIScxbPmwE4M8sbpQ";
                strArr3[2] = "boro4ohexmiDUCkamzw9wTmnBKi3oWmZ";
                int i6 = i4 - i3;
                this.A06.AI0(jA0U, 1, i3, i6, null);
                this.A01 += (long) i2;
                this.A00 = i6;
            }
        }
        return j2 <= 0;
    }

    static {
        A01();
    }

    public C1022Rw(UL ul, InterfaceC1086Uo interfaceC1086Uo, YZ yz, String str, int i) throws Q6 {
        this.A05 = ul;
        this.A06 = interfaceC1086Uo;
        this.A07 = yz;
        int i2 = (yz.A05 * yz.A01) / 8;
        int bytesPerFrame = yz.A02;
        if (bytesPerFrame == i2) {
            int bytesPerFrame2 = yz.A04;
            int constantBitrate = bytesPerFrame2 * i2 * 8;
            int bytesPerFrame3 = yz.A04;
            this.A03 = Math.max(i2, (bytesPerFrame3 * i2) / 10);
            P5 p5A0j = new P5().A11(str).A0a(constantBitrate).A0j(constantBitrate);
            int bytesPerFrame4 = this.A03;
            P5 p5A0h = p5A0j.A0h(bytesPerFrame4);
            int bytesPerFrame5 = yz.A05;
            P5 p5A0b = p5A0h.A0b(bytesPerFrame5);
            int bytesPerFrame6 = yz.A04;
            this.A04 = p5A0b.A0m(bytesPerFrame6).A0i(i).A14();
            return;
        }
        StringBuilder sbAppend = new StringBuilder().append(A00(7, 21, 56)).append(i2).append(A00(0, 7, 77));
        int bytesPerFrame7 = yz.A02;
        throw Q6.A01(sbAppend.append(bytesPerFrame7).toString(), null);
    }

    @Override // com.facebook.ads.redexgen.core.YX
    public final void A9y(int i, long j) {
        this.A05.AID(new C1016Rq(this.A07, 1, i, j));
        this.A06.A6U(this.A04);
    }

    @Override // com.facebook.ads.redexgen.core.YX
    public final void AHq(long j) {
        this.A02 = j;
        this.A00 = 0;
        this.A01 = 0L;
    }
}
