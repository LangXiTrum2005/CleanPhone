package com.facebook.ads.redexgen.core;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.St, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1045St implements Y7 {
    public static byte[] A0F;
    public static String[] A0G = {"OZFg8cDT1zW4NUDidX36nqGGlM4Gnu8K", "YxwsvdVZLa6TH49sylSv7ddyfHOhxbVG", "D83U0UlzcukiYKzxrILuT6PxEk1Lj8TQ", "6glzZoJmYKjpH1HAyU6B58rMMHWcC73Y", "zcDH3nZTS1tEXdqR5YtV5eEoeeJlj5n2", "pu", "1k8sKmYKIPJVodvZ7PQYtw1", "wDdnZxbyn4n991ybTI4kGUW0UM0nFxQM"};
    public long A01;
    public InterfaceC1086Uo A02;
    public YE A03;
    public String A04;
    public boolean A05;
    public boolean A06;
    public final YL A0A;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean[] A0E = new boolean[3];
    public final YG A09 = new YG(7, 128);
    public final YG A07 = new YG(8, 128);
    public final YG A08 = new YG(6, 128);
    public long A00 = C.TIME_UNSET;
    public final C1576fq A0B = new C1576fq();

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0F, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 36);
            if (A0G[5].length() == 12) {
                throw new RuntimeException();
            }
            A0G[5] = "q4FUMn0GqMumvCZylFodlo8";
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A0F = new byte[]{90, 69, 72, 73, 67, 3, 77, 90, 79};
    }

    static {
        A02();
    }

    public C1045St(YL yl, boolean z, boolean z2) {
        this.A0A = yl;
        this.A0C = z;
        this.A0D = z2;
    }

    @EnsuresNonNull({"output", "sampleReader"})
    private void A01() {
        AbstractC1517es.A02(this.A02);
    }

    @RequiresNonNull({"output", "sampleReader"})
    private void A03(long j, int i, int i2, long j2) {
        if (!this.A05 || this.A03.A06()) {
            this.A09.A04(i2);
            this.A07.A04(i2);
            if (!this.A05) {
                boolean zA03 = this.A09.A03();
                if (A0G[6].length() != 23) {
                    throw new RuntimeException();
                }
                String[] strArr = A0G;
                strArr[1] = "udLg1q2ZrOTIf2qwyZfeBrXAEO90namO";
                strArr[3] = "UGUyldlipVmX2Icsyd88CJZiZqmsu6EW";
                if (zA03 && this.A07.A03()) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Arrays.copyOf(this.A09.A01, this.A09.A00));
                    arrayList.add(Arrays.copyOf(this.A07.A01, this.A07.A00));
                    C1077Uc c1077UcA09 = AbstractC1078Ud.A09(this.A09.A01, 3, this.A09.A00);
                    Ub ubA07 = AbstractC1078Ud.A07(this.A07.A01, 3, this.A07.A00);
                    this.A02.A6U(new P5().A0y(this.A04).A11(A00(0, 9, 8)).A0w(AbstractC1525f0.A01(c1077UcA09.A08, c1077UcA09.A01, c1077UcA09.A04)).A0r(c1077UcA09.A0A).A0f(c1077UcA09.A03).A0Y(c1077UcA09.A00).A12(arrayList).A14());
                    this.A05 = true;
                    this.A03.A04(c1077UcA09);
                    this.A03.A03(ubA07);
                    this.A09.A00();
                    this.A07.A00();
                }
            } else if (this.A09.A03()) {
                this.A03.A04(AbstractC1078Ud.A09(this.A09.A01, 3, this.A09.A00));
                this.A09.A00();
            } else if (this.A07.A03()) {
                this.A03.A03(AbstractC1078Ud.A07(this.A07.A01, 3, this.A07.A00));
                this.A07.A00();
            }
        }
        if (this.A08.A04(i2)) {
            this.A0B.A0j(this.A08.A01, AbstractC1078Ud.A02(this.A08.A01, this.A08.A00));
            this.A0B.A0f(4);
            this.A0A.A02(j2, this.A0B);
        }
        boolean sampleIsKeyFrame = this.A03.A07(j, i, this.A05, this.A06);
        if (sampleIsKeyFrame) {
            this.A06 = false;
        }
    }

    @RequiresNonNull({"sampleReader"})
    private void A04(long j, int i, long j2) {
        if (!this.A05 || this.A03.A06()) {
            this.A09.A01(i);
            this.A07.A01(i);
        }
        this.A08.A01(i);
        this.A03.A02(j, i, j2);
    }

    @RequiresNonNull({"sampleReader"})
    private void A05(byte[] bArr, int i, int i2) {
        if (!this.A05 || this.A03.A06()) {
            this.A09.A02(bArr, i, i2);
            this.A07.A02(bArr, i, i2);
        }
        this.A08.A02(bArr, i, i2);
        this.A03.A05(bArr, i, i2);
    }

    @Override // com.facebook.ads.redexgen.core.Y7
    public final void A50(C1576fq c1576fq) {
        A01();
        int iA09 = c1576fq.A09();
        int iA0A = c1576fq.A0A();
        byte[] bArrA0l = c1576fq.A0l();
        long j = this.A01;
        int offset = c1576fq.A07();
        this.A01 = j + ((long) offset);
        InterfaceC1086Uo interfaceC1086Uo = this.A02;
        int offset2 = c1576fq.A07();
        interfaceC1086Uo.AHx(c1576fq, offset2);
        while (true) {
            int iA04 = AbstractC1078Ud.A04(bArrA0l, iA09, iA0A, this.A0E);
            if (iA04 == iA0A) {
                A05(bArrA0l, iA09, iA0A);
                return;
            }
            int lengthToNalUnit = AbstractC1078Ud.A01(bArrA0l, iA04);
            int i = iA04 - iA09;
            if (i > 0) {
                A05(bArrA0l, iA09, iA04);
            }
            int i2 = iA0A - iA04;
            long j2 = this.A01 - ((long) i2);
            int offset3 = i < 0 ? -i : 0;
            A03(j2, i2, offset3, this.A00);
            A04(j2, lengthToNalUnit, this.A00);
            iA09 = iA04 + 3;
        }
    }

    @Override // com.facebook.ads.redexgen.core.Y7
    public final void A5S(UL ul, YS ys) {
        ys.A05();
        this.A04 = ys.A04();
        this.A02 = ul.AJX(ys.A03(), 2);
        this.A03 = new YE(this.A02, this.A0C, this.A0D);
        this.A0A.A03(ul, ys);
    }

    @Override // com.facebook.ads.redexgen.core.Y7
    public final void AFx() {
    }

    @Override // com.facebook.ads.redexgen.core.Y7
    public final void AFy(long j, int i) {
        if (j != C.TIME_UNSET) {
            this.A00 = j;
        }
        this.A06 |= (i & 2) != 0;
    }

    @Override // com.facebook.ads.redexgen.core.Y7
    public final void AIB() {
        this.A01 = 0L;
        this.A06 = false;
        this.A00 = C.TIME_UNSET;
        AbstractC1078Ud.A0H(this.A0E);
        this.A09.A00();
        this.A07.A00();
        this.A08.A00();
        if (this.A03 != null) {
            this.A03.A01();
        }
    }
}
