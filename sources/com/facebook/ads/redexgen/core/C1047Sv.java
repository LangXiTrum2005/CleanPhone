package com.facebook.ads.redexgen.core;

import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.umeng.analytics.pro.cw;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Sv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1047Sv implements Y7 {
    public static byte[] A0G;
    public static String[] A0H = {"NmTziwrBEeleI2zcDKgDjvA7qUw", "SekJReECHdWpHb6NQB3EQL2vetQgAEWA", "BOC6ZGrpYygESGmRPyhfDjH29NzWYoEz", "2gzrqHGB1xRLBwX4mZ1qcNgV5nulxwl4", "012keUBfh6BlFxDypCEXCalykyNE0ou0", "k3zjsf7yfJHE9mBrKaEHeQpEMH63VrpT", "MFzo5Fk0RO4wlGv3ISCdCJALs2z6bwtA", "Am35bXZOBd5vSoFaqvbJwRpc9RqFsHNr"};
    public static final double[] A0I;
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public InterfaceC1086Uo A05;
    public String A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public final Y8 A0B;
    public final YG A0C;
    public final YV A0D;
    public final C1576fq A0E;
    public final boolean[] A0F;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static Pair<ZM, Long> A00(Y8 y8, String str) {
        byte[] bArrCopyOf = Arrays.copyOf(y8.A02, y8.A00);
        int i = bArrCopyOf[4] & 255;
        int i2 = bArrCopyOf[5] & 255;
        int i3 = (i << 4) | (i2 >> 4);
        int i4 = ((i2 & 15) << 8) | (bArrCopyOf[6] & 255);
        float f = 1.0f;
        switch ((bArrCopyOf[7] & 240) >> 4) {
            case 2:
                float f2 = i4 * 4;
                float f3 = i3 * 3;
                if (A0H[0].length() == 12) {
                    throw new RuntimeException();
                }
                A0H[4] = "4nBX7WDv7j39O8wBvqnc7m1";
                f = f2 / f3;
                break;
                break;
            case 3:
                f = (i4 * 16) / (i3 * 9);
                break;
            case 4:
                f = (i4 * 121) / (i3 * 100);
                break;
        }
        ZM zmA14 = new P5().A0y(str).A11(A01(0, 11, 106)).A0r(i3).A0f(i4).A0Y(f).A12(Collections.singletonList(bArrCopyOf)).A14();
        long j = 0;
        int i5 = (bArrCopyOf[7] & cw.m) - 1;
        if (i5 >= 0 && i5 < A0I.length) {
            double d = A0I[i5];
            int i6 = y8.A01;
            int i7 = (bArrCopyOf[i6 + 9] & 96) >> 5;
            int i8 = bArrCopyOf[i6 + 9] & 31;
            if (i7 != i8) {
                d *= (((double) i7) + 1.0d) / ((double) (i8 + 1));
            }
            j = (long) (1000000.0d / d);
        }
        return Pair.create(zmA14, Long.valueOf(j));
    }

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0G, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 57);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A0G = new byte[]{37, 58, 55, 54, 60, 124, 62, 35, 54, 52, 97};
    }

    static {
        A02();
        A0I = new double[]{23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    }

    public C1047Sv() {
        this(null);
    }

    public C1047Sv(YV yv) {
        this.A0D = yv;
        this.A0F = new boolean[4];
        this.A0B = new Y8(128);
        if (yv != null) {
            this.A0C = new YG(178, 128);
            this.A0E = new C1576fq();
        } else {
            this.A0C = null;
            this.A0E = null;
        }
        this.A01 = C.TIME_UNSET;
        this.A03 = C.TIME_UNSET;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0094  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.facebook.ads.redexgen.core.Y7
    public final void A50(C1576fq c1576fq) {
        long j;
        AbstractC1517es.A02(this.A05);
        int iA09 = c1576fq.A09();
        int iA0A = c1576fq.A0A();
        byte[] bArrA0l = c1576fq.A0l();
        this.A04 += (long) c1576fq.A07();
        this.A05.AHx(c1576fq, c1576fq.A07());
        while (true) {
            boolean[] zArr = this.A0F;
            if (A0H[4].length() == 29) {
                throw new RuntimeException();
            }
            A0H[1] = "Sk7rD0t9pja6fbf2qHDBAx8lML3FlRVT";
            int iA04 = AbstractC1078Ud.A04(bArrA0l, iA09, iA0A, zArr);
            if (iA04 == iA0A) {
                if (!this.A07) {
                    this.A0B.A01(bArrA0l, iA09, iA0A);
                }
                if (this.A0C != null) {
                    this.A0C.A02(bArrA0l, iA09, iA0A);
                    return;
                }
                return;
            }
            int i = c1576fq.A0l()[iA04 + 3] & 255;
            int i2 = iA04 - iA09;
            if (!this.A07) {
                if (i2 > 0) {
                    this.A0B.A01(bArrA0l, iA09, iA04);
                }
                int i3 = i2 < 0 ? -i2 : 0;
                Y8 y8 = this.A0B;
                if (A0H[0].length() != 12) {
                    String[] strArr = A0H;
                    strArr[2] = "6vLvu8t1UjbsSA7j4T2WIGGRp9xXgADh";
                    strArr[7] = "uvaqu9exv8QtSnkbG07VedS6vNT3kTk3";
                    if (y8.A02(i, i3)) {
                        Pair<ZM, Long> pairA00 = A00(this.A0B, (String) AbstractC1517es.A01(this.A06));
                        this.A05.A6U((ZM) pairA00.first);
                        this.A00 = ((Long) pairA00.second).longValue();
                        this.A07 = true;
                    }
                } else if (y8.A02(i, i3)) {
                    Pair<ZM, Long> pairA01 = A00(this.A0B, (String) AbstractC1517es.A01(this.A06));
                    this.A05.A6U((ZM) pairA01.first);
                    this.A00 = ((Long) pairA01.second).longValue();
                    this.A07 = true;
                }
            }
            if (this.A0C != null) {
                int i4 = 0;
                if (i2 > 0) {
                    this.A0C.A02(bArrA0l, iA09, iA04);
                } else {
                    i4 = -i2;
                }
                if (this.A0C.A04(i4)) {
                    ((C1576fq) AbstractC1600gE.A0f(this.A0E)).A0j(this.A0C.A01, AbstractC1078Ud.A02(this.A0C.A01, this.A0C.A00));
                    ((YV) AbstractC1600gE.A0f(this.A0D)).A02(this.A03, this.A0E);
                }
                if (i == 178 && c1576fq.A0l()[iA04 + 2] == 1) {
                    this.A0C.A01(i);
                }
            }
            if (i == 0 || i == 179) {
                int i5 = iA0A - iA04;
                boolean z = this.A08;
                long j2 = C.TIME_UNSET;
                if (z && this.A07 && this.A03 != C.TIME_UNSET) {
                    boolean z2 = this.A09;
                    int i6 = ((int) (this.A04 - this.A02)) - i5;
                    InterfaceC1086Uo interfaceC1086Uo = this.A05;
                    long j3 = this.A03;
                    if (A0H[4].length() == 29) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A0H;
                    strArr2[6] = "pszzspl8TCNV2S9Wti5PXYcYJh6qtSmp";
                    strArr2[3] = "4DzEWRVPxLNyNUeomTR5Ko2MCjeaRwYf";
                    j2 = C.TIME_UNSET;
                    interfaceC1086Uo.AI0(j3, z2 ? 1 : 0, i6, i5, null);
                }
                if (!this.A0A || this.A08) {
                    this.A02 = this.A04 - ((long) i5);
                    if (this.A01 != j2) {
                        j = this.A01;
                    } else if (this.A03 != j2) {
                        long j4 = this.A03;
                        long j5 = this.A00;
                        if (A0H[0].length() == 12) {
                            throw new RuntimeException();
                        }
                        String[] strArr3 = A0H;
                        strArr3[6] = "XIzM1GxO1TAfhd6KokwKTRCog4N9cyYN";
                        strArr3[3] = "s4zJF40IVfDxSxwhPOUtYV27MEPRLGZ6";
                        j = j5 + j4;
                    } else {
                        j = j2;
                    }
                    this.A03 = j;
                    this.A09 = false;
                    this.A01 = j2;
                    this.A0A = true;
                }
                this.A08 = i == 0;
            } else if (i == 184) {
                this.A09 = true;
            }
            iA09 = iA04 + 3;
        }
    }

    @Override // com.facebook.ads.redexgen.core.Y7
    public final void A5S(UL ul, YS ys) {
        ys.A05();
        this.A06 = ys.A04();
        this.A05 = ul.AJX(ys.A03(), 2);
        if (this.A0D != null) {
            this.A0D.A03(ul, ys);
        }
    }

    @Override // com.facebook.ads.redexgen.core.Y7
    public final void AFx() {
    }

    @Override // com.facebook.ads.redexgen.core.Y7
    public final void AFy(long j, int i) {
        this.A01 = j;
    }

    @Override // com.facebook.ads.redexgen.core.Y7
    public final void AIB() {
        AbstractC1078Ud.A0H(this.A0F);
        this.A0B.A00();
        if (this.A0C != null) {
            this.A0C.A00();
        }
        this.A04 = 0L;
        this.A0A = false;
        this.A01 = C.TIME_UNSET;
        this.A03 = C.TIME_UNSET;
    }
}
