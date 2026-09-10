package com.facebook.ads.redexgen.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.google.android.exoplayer2.Timeline;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Pa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0951Pa {
    public static byte[] A0E;
    public static String[] A0F = {"K1cFtqvk4JWdFkB", "Ozphz5vH", "xTN64ZRgh1", "99O2iySzHHrdIRjI4gkuIzfLxszKvwXS", "00En2YYHTdTn9mG", "RZyqTmCXtNkcSOc8b9R3I8ppBcDmZpwC", "EM8PEvozxpK0IPSK0odQsfgZataeTbp", "3cP"};
    public C0953Pc A00;
    public boolean A01;
    public boolean A02;
    public long A03;
    public C0951Pa A04;
    public C0992Qs A05 = C0992Qs.A06;
    public C1419dH A06;
    public final R7 A07;
    public final Object A08;
    public final InterfaceC1309bV[] A09;
    public final PZ A0A;
    public final AbstractC1418dG A0B;
    public final InterfaceC0983Qi[] A0C;
    public final boolean[] A0D;

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0E, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 16);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A0E = new byte[]{108, 68, 69, 72, 64, 113, 68, 83, 72, 78, 69, 105, 78, 77, 69, 68, 83, 124, 73, 94, 69, 67, 72, 12, 94, 73, 64, 73, 77, 95, 73, 12, 74, 77, 69, 64, 73, 72, 2};
    }

    static {
        A04();
    }

    @MetaExoPlayerCustomization(type = {"TEMPORARY"}, value = "Old exoplayer method. requires deleting")
    public C0951Pa(InterfaceC0983Qi[] interfaceC0983QiArr, long j, AbstractC1418dG abstractC1418dG, InterfaceC1424dM interfaceC1424dM, InterfaceC1280az interfaceC1280az, C0953Pc c0953Pc, C1419dH c1419dH) {
        this.A0C = interfaceC0983QiArr;
        this.A03 = j - c0953Pc.A03;
        this.A0B = abstractC1418dG;
        this.A08 = AbstractC1517es.A01(c0953Pc.A04.A04);
        this.A00 = c0953Pc;
        this.A06 = c1419dH;
        this.A09 = new InterfaceC1309bV[interfaceC0983QiArr.length];
        this.A0D = new boolean[interfaceC0983QiArr.length];
        this.A0A = new ZA(this, interfaceC1280az);
        this.A07 = A00(c0953Pc.A04, this.A0A, interfaceC1424dM, c0953Pc.A03, c0953Pc.A01);
    }

    @MetaExoPlayerCustomization(type = {"TEMPORARY"}, value = "MediaSourceList is temporarily changed to MediaSourceAdapter")
    public static R7 A00(R5 r5, PZ pz, InterfaceC1424dM interfaceC1424dM, long j, long j2) {
        R7 r7A5M = pz.A5M(r5, interfaceC1424dM, j);
        if (j2 != C.TIME_UNSET) {
            return new C05538m(r7A5M, true, 0L, j2);
        }
        return r7A5M;
    }

    private void A02() {
        if (!A08()) {
            return;
        }
        for (int i = 0; i < i; i++) {
            boolean rendererEnabled = this.A06.A00(i);
            QD qd = this.A06.A04[i];
            if (rendererEnabled && qd != null) {
                qd.A5n();
            }
        }
    }

    private void A03() {
        if (!A08()) {
            return;
        }
        int i = 0;
        while (true) {
            int i2 = this.A06.A00;
            if (A0F[1].length() != 8) {
                throw new RuntimeException();
            }
            A0F[1] = "4oUgqrr8";
            if (i < i2) {
                boolean rendererEnabled = this.A06.A00(i);
                QD qd = this.A06.A04[i];
                if (rendererEnabled && qd != null) {
                    qd.A6A();
                }
                i++;
            } else {
                return;
            }
        }
    }

    @MetaExoPlayerCustomization(type = {"TEMPORARY"}, value = "Temporary bridging of MediaSourceList with MediaSourceAdapter")
    public static void A05(PZ pz, R7 r7) {
        try {
            if (r7 instanceof C05538m) {
                pz.AGs(((C05538m) r7).A05);
            } else {
                pz.AGs(r7);
            }
        } catch (RuntimeException e) {
            AbstractC1561fb.A08(A01(0, 17, 49), A01(17, 22, 60), e);
        }
    }

    private void A06(InterfaceC1309bV[] interfaceC1309bVArr) {
        for (int i = 0; i < i; i++) {
            if (this.A0C[i].A9D() == -2 && this.A06.A00(i)) {
                interfaceC1309bVArr[i] = new R9();
            }
        }
    }

    private void A07(InterfaceC1309bV[] interfaceC1309bVArr) {
        for (int i = 0; i < i; i++) {
            if (this.A0C[i].A9D() == -2) {
                interfaceC1309bVArr[i] = null;
            }
        }
    }

    private boolean A08() {
        return this.A04 == null;
    }

    public final long A09() {
        if (!this.A02) {
            return this.A00.A03;
        }
        long jA6y = this.A01 ? this.A07.A6y() : Long.MIN_VALUE;
        return jA6y == Long.MIN_VALUE ? this.A00.A00 : jA6y;
    }

    public final long A0A() {
        if (this.A02) {
            return this.A07.A8R();
        }
        return 0L;
    }

    public final long A0B() {
        return this.A03;
    }

    @MetaExoPlayerCustomization(type = {"NEW_METHOD"})
    public final long A0C(long j) {
        return this.A07.A6w(j);
    }

    public final long A0D(long j) {
        return j - A0B();
    }

    public final long A0E(long j) {
        return A0B() + j;
    }

    public final long A0F(C1419dH c1419dH, long j, boolean z) {
        return A0G(c1419dH, j, z, new boolean[this.A0C.length]);
    }

    public final long A0G(C1419dH c1419dH, long j, boolean z, boolean[] zArr) {
        int i = 0;
        while (true) {
            boolean z2 = false;
            if (i >= c1419dH.A00) {
                break;
            }
            boolean[] zArr2 = this.A0D;
            if (!z && c1419dH.A01(this.A06, i)) {
                z2 = true;
            }
            zArr2[i] = z2;
            i++;
        }
        A07(this.A09);
        A02();
        this.A06 = c1419dH;
        A03();
        long jAIF = this.A07.AIF(c1419dH.A04, this.A0D, this.A09, zArr, j);
        A06(this.A09);
        this.A01 = false;
        for (int i2 = 0; i2 < this.A09.length; i2++) {
            if (this.A09[i2] != null) {
                AbstractC1517es.A08(c1419dH.A00(i2));
                if (this.A0C[i2].A9D() != -2) {
                    this.A01 = true;
                }
            } else {
                AbstractC1517es.A08(c1419dH.A04[i2] == null);
            }
        }
        return jAIF;
    }

    @MetaExoPlayerCustomization(type = {"TEMPORARY"})
    public final long A0H(boolean z) {
        if (!z) {
            return this.A03;
        }
        long j = this.A00.A03 + this.A03;
        if (A0F[6].length() != 31) {
            throw new RuntimeException();
        }
        A0F[7] = "9m";
        return j;
    }

    public final C0951Pa A0I() {
        return this.A04;
    }

    public final C0992Qs A0J() {
        return this.A05;
    }

    public final C1419dH A0K() {
        return this.A06;
    }

    public final C1419dH A0L(float f, Timeline timeline) throws EK {
        C1419dH c1419dHA0b = this.A0B.A0b(this.A0C, A0J(), this.A00.A04, timeline);
        for (QD qd : c1419dHA0b.A04) {
            if (qd != null) {
                qd.AEW(f);
            }
        }
        return c1419dHA0b;
    }

    @MetaExoPlayerCustomization(type = {"TEMPORARY"}, value = "MediaSourceAdapter to be replaced with MediaSourceList")
    public final void A0M() {
        A02();
        A05(this.A0A, this.A07);
    }

    public final void A0N(float f, Timeline timeline) throws EK {
        this.A02 = true;
        this.A05 = this.A07.A9C();
        long jA0F = A0F(A0L(f, timeline), this.A00.A03, false);
        this.A03 += this.A00.A03 - jA0F;
        this.A00 = this.A00.A00(jA0F);
    }

    public final void A0O(long j) {
        AbstractC1517es.A08(A08());
        this.A07.A52(A0D(j));
    }

    public final void A0P(long j) {
        AbstractC1517es.A08(A08());
        if (this.A02) {
            this.A07.AGe(A0D(j));
        }
    }

    public final void A0Q(C0951Pa c0951Pa) {
        if (c0951Pa == this.A04) {
            return;
        }
        A02();
        this.A04 = c0951Pa;
        A03();
    }

    public final boolean A0R() {
        return this.A02 && (!this.A01 || this.A07.A6y() == Long.MIN_VALUE);
    }
}
