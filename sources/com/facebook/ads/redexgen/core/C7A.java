package com.facebook.ads.redexgen.core;

import com.facebook.ads.androidx.media3.common.Timeline;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7A, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C7A {
    public static byte[] A0E;
    public static String[] A0F = {"qTjlphzGhjtz23pZpbkrfGV3", "gcvQ0aFRAZsVeDDMvPpq9fmBIR43z3dS", "1g2pSH5s64tGUAh3eJ0e3X43Q9jzw3mq", "lB1M4R9KcDs1NZsKBVQ3JQYLP4RbMvTH", "7AgciWFjZyCuzmH359m88XAJrahqi7eF", "Et2BwvNp", "Oz1eJxJHgMWzrYsZQ0zZlFN1YCxGY3CZ", "Iy7o67ktSbvMBIxm3lxnuK7UTKgUaVFx"};
    public C7B A00;
    public boolean A01;
    public boolean A02;
    public long A03;
    public C7A A04;
    public C2690nW A05 = C2690nW.A06;
    public C1350Ex A06;
    public final InterfaceC2709np A07;
    public final Object A08;
    public final DT[] A09;
    public final AnonymousClass79 A0A;
    public final AbstractC1349Ew A0B;
    public final InterfaceC11797p[] A0C;
    public final boolean[] A0D;

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0E, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 22);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A0E = new byte[]{81, 121, 120, 117, 125, 76, 121, 110, 117, 115, 120, 84, 115, 112, 120, 121, 110, 28, 41, 62, 37, 35, 40, 108, 62, 41, 32, 41, 45, 63, 41, 108, 42, 45, 37, 32, 41, 40, 98};
    }

    static {
        A04();
    }

    @MetaExoPlayerCustomization(type = {"TEMPORARY"}, value = "Old exoplayer method. requires deleting")
    public C7A(InterfaceC11797p[] interfaceC11797pArr, long j, AbstractC1349Ew abstractC1349Ew, F0 f0, InterfaceC1298Cx interfaceC1298Cx, C7B c7b, C1350Ex c1350Ex) {
        this.A0C = interfaceC11797pArr;
        this.A03 = j - c7b.A03;
        this.A0B = abstractC1349Ew;
        this.A08 = AbstractC10843y.A01(c7b.A04.A04);
        this.A00 = c7b;
        this.A06 = c1350Ex;
        this.A09 = new DT[interfaceC11797pArr.length];
        this.A0D = new boolean[interfaceC11797pArr.length];
        this.A0A = new C2770op(this, interfaceC1298Cx);
        this.A07 = A00(c7b.A04, this.A0A, f0, c7b.A03, c7b.A01);
    }

    @MetaExoPlayerCustomization(type = {"TEMPORARY"}, value = "MediaSourceList is temporarily changed to MediaSourceAdapter")
    public static InterfaceC2709np A00(C2708no c2708no, AnonymousClass79 anonymousClass79, F0 f0, long j, long j2) {
        InterfaceC2709np interfaceC2709npA5W = anonymousClass79.A5W(c2708no, f0, j);
        if (j2 != -9223372036854775807L) {
            return new C9v(interfaceC2709npA5W, true, 0L, j2);
        }
        return interfaceC2709npA5W;
    }

    private void A02() {
        if (!A08()) {
            return;
        }
        for (int i2 = 0; i2 < i; i2++) {
            boolean rendererEnabled = this.A06.A00(i2);
            InterfaceC2672nE interfaceC2672nE = this.A06.A04[i2];
            if (rendererEnabled && interfaceC2672nE != null) {
                interfaceC2672nE.A5x();
            }
        }
    }

    private void A03() {
        if (!A08()) {
            return;
        }
        for (int i2 = 0; i2 < i; i2++) {
            boolean rendererEnabled = this.A06.A00(i2);
            InterfaceC2672nE interfaceC2672nE = this.A06.A04[i2];
            if (rendererEnabled && interfaceC2672nE != null) {
                interfaceC2672nE.A6K();
            }
        }
    }

    @MetaExoPlayerCustomization(type = {"TEMPORARY"}, value = "Temporary bridging of MediaSourceList with MediaSourceAdapter")
    public static void A05(AnonymousClass79 anonymousClass79, InterfaceC2709np interfaceC2709np) {
        try {
            if (interfaceC2709np instanceof C9v) {
                anonymousClass79.AHk(((C9v) interfaceC2709np).A05);
            } else {
                anonymousClass79.AHk(interfaceC2709np);
            }
        } catch (RuntimeException e2) {
            AbstractC10924g.A08(A01(0, 17, 10), A01(17, 22, 90), e2);
        }
    }

    private void A06(DT[] dtArr) {
        for (int i2 = 0; i2 < i; i2++) {
            if (this.A0C[i2].A9N() == -2 && this.A06.A00(i2)) {
                dtArr[i2] = new C2711nr();
            }
        }
    }

    private void A07(DT[] dtArr) {
        for (int i2 = 0; i2 < i; i2++) {
            if (this.A0C[i2].A9N() == -2) {
                dtArr[i2] = null;
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
        long jA78 = this.A01 ? this.A07.A78() : Long.MIN_VALUE;
        return jA78 == Long.MIN_VALUE ? this.A00.A00 : jA78;
    }

    public final long A0A() {
        if (this.A02) {
            return this.A07.A8b();
        }
        return 0L;
    }

    public final long A0B() {
        return this.A03;
    }

    @MetaExoPlayerCustomization(type = {"NEW_METHOD"})
    public final long A0C(long j) {
        return this.A07.A76(j);
    }

    public final long A0D(long j) {
        return j - A0B();
    }

    public final long A0E(long j) {
        return A0B() + j;
    }

    public final long A0F(C1350Ex c1350Ex, long j, boolean z2) {
        return A0G(c1350Ex, j, z2, new boolean[this.A0C.length]);
    }

    public final long A0G(C1350Ex c1350Ex, long j, boolean z2, boolean[] zArr) {
        int i2 = 0;
        while (true) {
            boolean z3 = false;
            if (i2 < c1350Ex.A00) {
                boolean[] zArr2 = this.A0D;
                if (!z2) {
                    boolean zA01 = c1350Ex.A01(this.A06, i2);
                    if (A0F[5].length() != 8) {
                        throw new RuntimeException();
                    }
                    String[] strArr = A0F;
                    strArr[4] = "ZW5cY05fUZ7YDJtoLiROAD1s3u7pqZaY";
                    strArr[3] = "DBvv8TdqbKzS7YgGUgxEKNMIgeBwY4FK";
                    if (zA01) {
                        z3 = true;
                    }
                }
                zArr2[i2] = z3;
                i2++;
            } else {
                A07(this.A09);
                A02();
                this.A06 = c1350Ex;
                A03();
                long jAJ9 = this.A07.AJ9(c1350Ex.A04, this.A0D, this.A09, zArr, j);
                A06(this.A09);
                this.A01 = false;
                for (int i3 = 0; i3 < this.A09.length; i3++) {
                    if (this.A09[i3] != null) {
                        AbstractC10843y.A08(c1350Ex.A00(i3));
                        if (this.A0C[i3].A9N() != -2) {
                            this.A01 = true;
                        }
                    } else {
                        AbstractC10843y.A08(c1350Ex.A04[i3] == null);
                    }
                }
                return jAJ9;
            }
        }
    }

    @MetaExoPlayerCustomization(type = {"TEMPORARY"})
    public final long A0H(boolean z2) {
        if (!z2) {
            return this.A03;
        }
        return this.A00.A03 + this.A03;
    }

    public final C7A A0I() {
        return this.A04;
    }

    public final C2690nW A0J() {
        return this.A05;
    }

    public final C1350Ex A0K() {
        return this.A06;
    }

    public final C1350Ex A0L(float f, Timeline timeline) throws AD {
        C1350Ex c1350ExA0b = this.A0B.A0b(this.A0C, A0J(), this.A00.A04, timeline);
        for (InterfaceC2672nE interfaceC2672nE : c1350ExA0b.A04) {
            if (interfaceC2672nE != null) {
                interfaceC2672nE.AFJ(f);
            }
        }
        return c1350ExA0b;
    }

    @MetaExoPlayerCustomization(type = {"TEMPORARY"}, value = "MediaSourceAdapter to be replaced with MediaSourceList")
    public final void A0M() {
        A02();
        A05(this.A0A, this.A07);
    }

    public final void A0N(float f, Timeline timeline) throws AD {
        this.A02 = true;
        this.A05 = this.A07.A9M();
        long jA0F = A0F(A0L(f, timeline), this.A00.A03, false);
        this.A03 += this.A00.A03 - jA0F;
        this.A00 = this.A00.A00(jA0F);
    }

    public final void A0O(long j) {
        AbstractC10843y.A08(A08());
        this.A07.A5C(A0D(j));
    }

    public final void A0P(long j) {
        AbstractC10843y.A08(A08());
        if (this.A02) {
            this.A07.AHW(A0D(j));
        }
    }

    public final void A0Q(C7A c7a) {
        if (c7a == this.A04) {
            return;
        }
        A02();
        this.A04 = c7a;
        A03();
    }

    public final boolean A0R() {
        return this.A02 && (!this.A01 || this.A07.A78() == Long.MIN_VALUE);
    }
}
