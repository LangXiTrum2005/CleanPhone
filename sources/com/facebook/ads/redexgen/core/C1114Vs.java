package com.facebook.ads.redexgen.core;

import android.net.Uri;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.umeng.analytics.pro.cw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Vs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1114Vs implements UK {
    public static byte[] A0F;
    public static String[] A0G = {"WLnpqGwmHzJm", "j8mDpLZRt4jb0btoE3PowdlhKiYjooMv", "LvKPX1ruzLtbKAGXr", "saGT", "wAR", "aUAlrYknYHDWmbpnmJ0ialHsJrvjxoz3", "rxYfuj", "TLYsWmYAWPG3QVmpl"};
    public static final UO A0H;
    public static final int A0I;
    public static final byte[] A0J;
    public static final byte[] A0K;
    public static final int[] A0L;
    public static final int[] A0M;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public long A05;
    public long A06;
    public UL A07;
    public Uj A08;
    public InterfaceC1086Uo A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public final int A0D;
    public final byte[] A0E;

    public static String A05(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0F, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 7);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A08() {
        A0F = new byte[]{70, 0, 20, 7, 11, 3, 70, 18, 31, 22, 3, 70, 114, 112, cw.n, 28, 3, 91, 105, 107, 11, 7, 24, 103, 29, 8, 64, 71, 107, 113, 104, 96, 36, 106, 107, 112, 36, 98, 109, 106, 96, 36, 69, 73, 86, 36, 108, 97, 101, 96, 97, 118, 42, 32, 5, 5, 12, cw.l, 8, 5, 73, 40, 36, 59, 73, 39, 0, 24, cw.m, 2, 7, 10, 78, 30, cw.m, 10, 10, 7, 0, 9, 78, 12, 7, 26, 29, 78, 8, 1, 28, 78, 8, 28, cw.m, 3, 11, 78, 6, 11, cw.m, 10, 11, 28, 78, 7, 11, 7, 18, 80, 68, 85, 88, 94, 30, 2, 86, 65, 65, 11, 31, cw.l, 3, 5, 69, 11, 7, 24, 71, 29, 8};
    }

    static {
        A08();
        A0H = new UO() { // from class: com.facebook.ads.redexgen.X.Vu
            @Override // com.facebook.ads.redexgen.core.UO
            public final UK[] A5D() {
                return C1114Vs.A0F();
            }

            @Override // com.facebook.ads.redexgen.core.UO
            public final /* synthetic */ UK[] A5E(Uri uri, Map map) {
                return UN.A01(this, uri, map);
            }
        };
        A0L = new int[]{13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
        A0M = new int[]{18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        A0J = AbstractC1600gE.A1G(A05(12, 6, 86));
        A0K = AbstractC1600gE.A1G(A05(18, 9, 77));
        A0I = A0M[8];
    }

    public C1114Vs() {
        this(0);
    }

    public C1114Vs(int i) {
        this.A0D = (i & 2) != 0 ? i | 1 : i;
        this.A0E = new byte[1];
        this.A02 = -1;
    }

    private int A00(int i) throws Q6 {
        String strA05;
        if (A0B(i)) {
            return this.A0C ? A0M[i] : A0L[i];
        }
        StringBuilder sbAppend = new StringBuilder().append(A05(53, 12, 110));
        if (this.A0C) {
            strA05 = A05(105, 2, 87);
        } else {
            String[] strArr = A0G;
            if (strArr[7].length() != strArr[2].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0G;
            strArr2[7] = "8dm40L0Xxtb1614WY";
            strArr2[2] = "fsDKX5xha6jCJ8wPN";
            strA05 = A05(103, 2, 78);
        }
        throw Q6.A01(sbAppend.append(strA05).append(A05(0, 12, 97)).append(i).toString(), null);
    }

    public static int A01(int i, long j) {
        return (int) (((((long) i) * 8) * 1000000) / j);
    }

    private int A02(WJ wj) throws IOException {
        wj.AHr();
        wj.AG1(this.A0E, 0, 1);
        byte b = this.A0E[0];
        if ((b & 131) <= 0) {
            return A00((b >> 3) & 15);
        }
        throw Q6.A01(A05(65, 38, 105) + ((int) b), null);
    }

    @RequiresNonNull({"trackOutput"})
    private int A03(WJ wj) throws IOException {
        if (this.A00 == 0) {
            try {
                this.A01 = A02(wj);
                this.A00 = this.A01;
                if (this.A02 == -1) {
                    this.A05 = wj.A8d();
                    this.A02 = this.A01;
                }
                if (this.A02 == this.A01) {
                    int i = this.A03 + 1;
                    String[] strArr = A0G;
                    if (strArr[7].length() != strArr[2].length()) {
                        throw new RuntimeException();
                    }
                    A0G[4] = "DrG5s2EXS07EKtERz1su";
                    this.A03 = i;
                }
            } catch (EOFException unused) {
                return -1;
            }
        }
        int iAHv = this.A09.AHv(wj, this.A00, true);
        if (iAHv == -1) {
            return -1;
        }
        int bytesAppended = this.A00;
        this.A00 = bytesAppended - iAHv;
        int bytesAppended2 = this.A00;
        if (bytesAppended2 > 0) {
            return 0;
        }
        this.A09.AI0(this.A06 + this.A04, 1, this.A01, 0, null);
        this.A04 += 20000;
        return 0;
    }

    private WV A04(long j, boolean z) {
        return new WV(j, this.A05, A01(this.A02, 20000L), this.A02, z);
    }

    @EnsuresNonNull({"extractorOutput", "trackOutput"})
    private void A06() {
        AbstractC1517es.A02(this.A09);
    }

    @RequiresNonNull({"trackOutput"})
    private void A07() {
        String mimeType;
        if (!this.A0A) {
            this.A0A = true;
            if (this.A0C) {
                mimeType = A05(EnumC4719u30.ASSET_FAILED_STATUS_CODE_VALUE, 12, 109);
            } else {
                String[] strArr = A0G;
                if (strArr[3].length() == strArr[0].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0G;
                strArr2[1] = "xYlTR7AHoq9Btbkfj7cnPkAPY8waGihj";
                strArr2[5] = "8zgGBAOeTIqisba15obpkgdWIAQY52mi";
                mimeType = A05(107, 10, 54);
            }
            this.A09.A6U(new P5().A11(mimeType).A0h(A0I).A0b(1).A0m(this.A0C ? 16000 : 8000).A14());
        }
    }

    @RequiresNonNull({"extractorOutput"})
    private void A09(long j, int i) {
        if (this.A0B) {
            return;
        }
        if ((this.A0D & 1) == 0 || j == -1 || (this.A02 != -1 && this.A02 != this.A01)) {
            this.A08 = new C1120Vy(C.TIME_UNSET);
            this.A07.AID(this.A08);
            this.A0B = true;
        } else {
            if (this.A03 < 20 && i != -1) {
                return;
            }
            int i2 = this.A0D & 2;
            if (A0G[4].length() == 6) {
                throw new RuntimeException();
            }
            String[] strArr = A0G;
            strArr[7] = "Yj3RbeqTURvS4mmIQ";
            strArr[2] = "9kw349pbOT2Mbg8Sw";
            this.A08 = A04(j, i2 != 0);
            this.A07.AID(this.A08);
            this.A0B = true;
        }
    }

    private boolean A0A(int i) {
        return !this.A0C && (i < 12 || i > 14);
    }

    private boolean A0B(int i) {
        if (i >= 0 && i <= 15) {
            boolean zA0C = A0C(i);
            String[] strArr = A0G;
            if (strArr[3].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            A0G[4] = "eJjdpXlyupLRxhI1";
            if (zA0C || A0A(i)) {
                return true;
            }
        }
        return false;
    }

    private boolean A0C(int i) {
        return this.A0C && (i < 10 || i > 13);
    }

    private boolean A0D(WJ wj) throws IOException {
        if (A0E(wj, A0J)) {
            this.A0C = false;
            wj.AJ9(A0J.length);
            return true;
        }
        if (!A0E(wj, A0K)) {
            return false;
        }
        this.A0C = true;
        int length = A0K.length;
        if (A0G[4].length() == 6) {
            throw new RuntimeException();
        }
        String[] strArr = A0G;
        strArr[3] = "tExa";
        strArr[0] = "s7rENZw3HAf4";
        wj.AJ9(length);
        return true;
    }

    public static boolean A0E(WJ wj, byte[] bArr) throws IOException {
        wj.AHr();
        byte[] bArr2 = new byte[bArr.length];
        wj.AG1(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    public static /* synthetic */ UK[] A0F() {
        return new UK[]{new C1114Vs()};
    }

    @Override // com.facebook.ads.redexgen.core.UK
    public final void AA0(UL ul) {
        this.A07 = ul;
        this.A09 = ul.AJX(0, 1);
        ul.A6E();
    }

    @Override // com.facebook.ads.redexgen.core.UK
    public final int AGT(WJ wj, C1081Ug c1081Ug) throws IOException {
        A06();
        if (wj.A8d() != 0 || A0D(wj)) {
            A07();
            int iA03 = A03(wj);
            A09(wj.A8E(), iA03);
            return iA03;
        }
        throw Q6.A01(A05(27, 26, 3), null);
    }

    @Override // com.facebook.ads.redexgen.core.UK
    public final void AGj() {
    }

    @Override // com.facebook.ads.redexgen.core.UK
    public final void AIC(long j, long j2) {
        this.A04 = 0L;
        this.A01 = 0;
        this.A00 = 0;
        if (j != 0 && (this.A08 instanceof WV)) {
            this.A06 = ((WV) this.A08).A02(j);
        } else {
            this.A06 = 0L;
        }
    }

    @Override // com.facebook.ads.redexgen.core.UK
    public final boolean AJB(WJ wj) throws IOException {
        return A0D(wj);
    }
}
