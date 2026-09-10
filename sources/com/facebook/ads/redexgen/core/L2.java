package com.facebook.ads.redexgen.core;

import android.util.SparseArray;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class L2 {
    public static String[] A0I = {"PiFB59Vxde45j8XGh3VNLS0bXquL", "eCGnEp7n3q", "QH0EN4bfbiXOmvaYxmEgWcgYRTVGFgtW", "ynU2FJVvbbIz4lLWIxM7HwzaaEzIs2yM", "B", "nKAZbJPu58l8", "2xLWRKjlXe7o2y", "tMbtJGMRwKJD523"};
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public final InterfaceC1407Hd A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final SparseArray<HR> A0D = new SparseArray<>();
    public final SparseArray<HQ> A0C = new SparseArray<>();
    public L1 A06 = new L1();
    public L1 A07 = new L1();
    public byte[] A0B = new byte[128];
    public final HU A0E = new HU(this.A0B, 0, 0);

    /* JADX WARN: Code duplicated, block: B:104:0x021e A[PHI: r18 r20
  0x021e: PHI (r18v1 int) = (r18v0 int), (r18v0 int), (r18v0 int), (r18v0 int), (r18v3 int), (r18v3 int) binds: [B:92:0x01fa, B:94:0x01fe, B:99:0x0211, B:100:0x0213, B:82:0x01c6, B:83:0x01c8] A[DONT_GENERATE, DONT_INLINE]
  0x021e: PHI (r20v2 int) = (r20v0 int), (r20v0 int), (r20v1 int), (r20v1 int), (r20v0 int), (r20v0 int) binds: [B:92:0x01fa, B:94:0x01fe, B:99:0x0211, B:100:0x0213, B:82:0x01c6, B:83:0x01c8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:106:0x0230  */
    /* JADX WARN: Code duplicated, block: B:107:0x0238  */
    /* JADX WARN: Code duplicated, block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:12:0x005a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:13:0x005b  */
    /* JADX WARN: Code duplicated, block: B:15:0x0074 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:16:0x0075  */
    /* JADX WARN: Code duplicated, block: B:18:0x0082 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:19:0x0083  */
    /* JADX WARN: Code duplicated, block: B:21:0x008d  */
    /* JADX WARN: Code duplicated, block: B:25:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:29:0x00bc A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:30:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:32:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:36:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ec A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:39:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:42:0x0105  */
    /* JADX WARN: Code duplicated, block: B:44:0x0117 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:45:0x0118  */
    /* JADX WARN: Code duplicated, block: B:50:0x012f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0137 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:53:0x0138  */
    /* JADX WARN: Code duplicated, block: B:55:0x0140  */
    /* JADX WARN: Code duplicated, block: B:57:0x0148 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:58:0x0149  */
    /* JADX WARN: Code duplicated, block: B:59:0x0151  */
    /* JADX WARN: Code duplicated, block: B:61:0x015e  */
    /* JADX WARN: Code duplicated, block: B:62:0x0166  */
    /* JADX WARN: Code duplicated, block: B:63:0x016e  */
    /* JADX WARN: Code duplicated, block: B:65:0x017d  */
    /* JADX WARN: Code duplicated, block: B:68:0x018d  */
    /* JADX WARN: Code duplicated, block: B:71:0x0193  */
    /* JADX WARN: Code duplicated, block: B:73:0x019b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:74:0x019c  */
    /* JADX WARN: Code duplicated, block: B:75:0x019f  */
    /* JADX WARN: Code duplicated, block: B:78:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:80:0x01bb A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:81:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:91:0x01f8  */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final void A05(byte[] bArr, int i2, int i3) {
        int iA05;
        int iA04;
        int iA06;
        HQ hq;
        HR hr;
        HU hu;
        int i4;
        boolean zA0A;
        boolean z2;
        boolean zA0A2;
        boolean z3;
        int iA07;
        int iA08;
        String[] strArr;
        if (this.A08) {
            int i5 = i3 - i2;
            if (this.A0B.length < this.A00 + i5) {
                byte[] bArr2 = this.A0B;
                int i6 = this.A00;
                if (A0I[2].charAt(10) != 'z') {
                    A0I[3] = "fF62whIImPZuUxQ3wOrH7qahZ1W3GZDe";
                    this.A0B = Arrays.copyOf(bArr2, (i6 + i5) * 2);
                    System.arraycopy(bArr, i2, this.A0B, this.A00, i5);
                    this.A00 += i5;
                    this.A0E.A08(this.A0B, 0, this.A00);
                    if (!this.A0E.A0B(8)) {
                        return;
                    }
                    this.A0E.A06();
                    iA05 = this.A0E.A05(2);
                    this.A0E.A07(5);
                    if (!this.A0E.A09()) {
                        return;
                    }
                    this.A0E.A04();
                    if (!this.A0E.A09()) {
                        return;
                    }
                    iA04 = this.A0E.A04();
                    if (!this.A0H) {
                        if (this.A0E.A09()) {
                            iA06 = this.A0E.A04();
                            if (this.A0C.indexOfKey(iA06) < 0) {
                                this.A08 = false;
                                return;
                            }
                            hq = this.A0C.get(iA06);
                            hr = this.A0D.get(hq.A01);
                            if (hr.A0D) {
                                if (!this.A0E.A0B(2)) {
                                    return;
                                } else {
                                    this.A0E.A07(2);
                                }
                            }
                            hu = this.A0E;
                            i4 = hr.A02;
                            if (A0I[3].charAt(31) != 'R') {
                                String[] strArr2 = A0I;
                                strArr2[4] = "Y";
                                strArr2[0] = "LBdvSwh0xb7fkSyUzFJrubBBNhQW";
                                if (!hu.A0B(i4)) {
                                    return;
                                }
                            } else if (!hu.A0B(i4)) {
                                return;
                            }
                            zA0A = false;
                            z2 = false;
                            zA0A2 = false;
                            int iA09 = this.A0E.A05(hr.A02);
                            if (hr.A0C) {
                                if (A0I[1].length() != 10) {
                                    A0I[6] = "9PoEa2ZU2Rc4Mb";
                                } else {
                                    A0I[6] = "45zkVvkeN2w0fF";
                                }
                            } else {
                                if (!this.A0E.A0B(1)) {
                                    return;
                                }
                                zA0A = this.A0E.A0A();
                                if (zA0A) {
                                    if (!this.A0E.A0B(1)) {
                                        return;
                                    }
                                    zA0A2 = this.A0E.A0A();
                                    z2 = true;
                                } else if (A0I[3].charAt(31) != 'R') {
                                    String[] strArr3 = A0I;
                                    strArr3[4] = "3";
                                    strArr3[0] = "19iwLQZiC4kcbLDxX6EkwfmmLREP";
                                }
                            }
                            if (this.A01 == 5) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            iA07 = 0;
                            if (z3) {
                                if (!this.A0E.A09()) {
                                    return;
                                } else {
                                    iA07 = this.A0E.A04();
                                }
                            }
                            iA08 = 0;
                            int iA03 = 0;
                            int iA010 = 0;
                            int iA011 = 0;
                            if (hr.A07 == 0) {
                                if (!this.A0E.A0B(hr.A06)) {
                                    return;
                                }
                                iA08 = this.A0E.A05(hr.A06);
                                if (hq.A02 || zA0A) {
                                    strArr = A0I;
                                    if (strArr[5].length() != strArr[7].length()) {
                                        A0I[1] = "lSna5RLd1h";
                                    } else {
                                        A0I[6] = "3KoChTLYrqIZNd";
                                    }
                                } else {
                                    if (!this.A0E.A09()) {
                                        return;
                                    }
                                    iA03 = this.A0E.A03();
                                    if (A0I[3].charAt(31) != 'R') {
                                        A0I[2] = "kr3yeibAy42hiyE0dA9TA4Dy6aRxjun2";
                                    } else {
                                        A0I[1] = "MkKVWDrQaD";
                                    }
                                }
                            } else if (hr.A07 == 1 || hr.A0B) {
                                strArr = A0I;
                                if (strArr[5].length() != strArr[7].length()) {
                                    A0I[1] = "lSna5RLd1h";
                                } else {
                                    A0I[6] = "3KoChTLYrqIZNd";
                                }
                            } else {
                                if (!this.A0E.A09()) {
                                    return;
                                }
                                iA010 = this.A0E.A03();
                                if (!hq.A02 || zA0A) {
                                    strArr = A0I;
                                    if (strArr[5].length() != strArr[7].length()) {
                                        A0I[1] = "lSna5RLd1h";
                                    } else {
                                        A0I[6] = "3KoChTLYrqIZNd";
                                    }
                                } else if (!this.A0E.A09()) {
                                    return;
                                } else {
                                    iA011 = this.A0E.A03();
                                }
                            }
                            this.A07.A04(hr, iA05, iA04, iA09, iA06, zA0A, z2, zA0A2, z3, iA07, iA08, iA03, iA010, iA011);
                            this.A08 = false;
                            return;
                        }
                        return;
                    }
                    this.A08 = false;
                    this.A07.A03(iA04);
                    if (A0I[1].length() == 10) {
                        String[] strArr4 = A0I;
                        strArr4[4] = "L";
                        strArr4[0] = "t7NRPrzJk7qeXS0lN2m3lGyrxGU0";
                        return;
                    }
                }
            } else {
                System.arraycopy(bArr, i2, this.A0B, this.A00, i5);
                this.A00 += i5;
                this.A0E.A08(this.A0B, 0, this.A00);
                if (!this.A0E.A0B(8)) {
                    return;
                }
                this.A0E.A06();
                iA05 = this.A0E.A05(2);
                this.A0E.A07(5);
                if (!this.A0E.A09()) {
                    return;
                }
                this.A0E.A04();
                if (!this.A0E.A09()) {
                    return;
                }
                iA04 = this.A0E.A04();
                if (!this.A0H) {
                    if (this.A0E.A09()) {
                        return;
                    }
                    iA06 = this.A0E.A04();
                    if (this.A0C.indexOfKey(iA06) < 0) {
                        this.A08 = false;
                        return;
                    }
                    hq = this.A0C.get(iA06);
                    hr = this.A0D.get(hq.A01);
                    if (hr.A0D) {
                        if (!this.A0E.A0B(2)) {
                            return;
                        } else {
                            this.A0E.A07(2);
                        }
                    }
                    hu = this.A0E;
                    i4 = hr.A02;
                    if (A0I[3].charAt(31) != 'R') {
                        String[] strArr5 = A0I;
                        strArr5[4] = "Y";
                        strArr5[0] = "LBdvSwh0xb7fkSyUzFJrubBBNhQW";
                        if (!hu.A0B(i4)) {
                            return;
                        }
                    } else if (!hu.A0B(i4)) {
                        return;
                    }
                    zA0A = false;
                    z2 = false;
                    zA0A2 = false;
                    int iA012 = this.A0E.A05(hr.A02);
                    if (hr.A0C) {
                        if (!this.A0E.A0B(1)) {
                            return;
                        }
                        zA0A = this.A0E.A0A();
                        if (zA0A) {
                            if (!this.A0E.A0B(1)) {
                                return;
                            }
                            zA0A2 = this.A0E.A0A();
                            z2 = true;
                        } else if (A0I[3].charAt(31) != 'R') {
                            String[] strArr6 = A0I;
                            strArr6[4] = "3";
                            strArr6[0] = "19iwLQZiC4kcbLDxX6EkwfmmLREP";
                        }
                    } else if (A0I[1].length() != 10) {
                        A0I[6] = "9PoEa2ZU2Rc4Mb";
                    } else {
                        A0I[6] = "45zkVvkeN2w0fF";
                    }
                    if (this.A01 == 5) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    iA07 = 0;
                    if (z3) {
                        if (!this.A0E.A09()) {
                            return;
                        } else {
                            iA07 = this.A0E.A04();
                        }
                    }
                    iA08 = 0;
                    int iA013 = 0;
                    int iA014 = 0;
                    int iA015 = 0;
                    if (hr.A07 == 0) {
                        if (!this.A0E.A0B(hr.A06)) {
                            return;
                        }
                        iA08 = this.A0E.A05(hr.A06);
                        if (hq.A02) {
                            strArr = A0I;
                            if (strArr[5].length() != strArr[7].length()) {
                                A0I[1] = "lSna5RLd1h";
                            } else {
                                A0I[6] = "3KoChTLYrqIZNd";
                            }
                        } else {
                            strArr = A0I;
                            if (strArr[5].length() != strArr[7].length()) {
                                A0I[1] = "lSna5RLd1h";
                            } else {
                                A0I[6] = "3KoChTLYrqIZNd";
                            }
                        }
                    } else if (hr.A07 == 1) {
                        strArr = A0I;
                        if (strArr[5].length() != strArr[7].length()) {
                            A0I[1] = "lSna5RLd1h";
                        } else {
                            A0I[6] = "3KoChTLYrqIZNd";
                        }
                    } else {
                        strArr = A0I;
                        if (strArr[5].length() != strArr[7].length()) {
                            A0I[1] = "lSna5RLd1h";
                        } else {
                            A0I[6] = "3KoChTLYrqIZNd";
                        }
                    }
                    this.A07.A04(hr, iA05, iA04, iA012, iA06, zA0A, z2, zA0A2, z3, iA07, iA08, iA013, iA014, iA015);
                    this.A08 = false;
                    return;
                }
                this.A08 = false;
                this.A07.A03(iA04);
                if (A0I[1].length() == 10) {
                    String[] strArr7 = A0I;
                    strArr7[4] = "L";
                    strArr7[0] = "t7NRPrzJk7qeXS0lN2m3lGyrxGU0";
                    return;
                }
            }
            throw new RuntimeException();
        }
    }

    public L2(InterfaceC1407Hd interfaceC1407Hd, boolean z2, boolean z3) {
        this.A0F = interfaceC1407Hd;
        this.A0G = z2;
        this.A0H = z3;
        A01();
    }

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
    private void A00(int i2) {
        if (this.A05 == -9223372036854775807L) {
            return;
        }
        boolean z2 = this.A0A;
        this.A0F.AIu(this.A05, z2 ? 1 : 0, (int) (this.A02 - this.A04), i2, null);
    }

    public final void A01() {
        this.A08 = false;
        this.A09 = false;
        this.A07.A02();
    }

    public final void A02(long j, int i2, long j2) {
        this.A01 = i2;
        this.A03 = j2;
        this.A02 = j;
        if (!this.A0G || this.A01 != 1) {
            if (!this.A0H) {
                return;
            }
            if (this.A01 != 5 && this.A01 != 1 && this.A01 != 2) {
                return;
            }
        }
        L1 l1 = this.A06;
        L1 l2 = this.A07;
        if (A0I[1].length() != 10) {
            throw new RuntimeException();
        }
        A0I[6] = "uj74NyijhUvg4q";
        this.A06 = l2;
        this.A07 = l1;
        L1 newSliceHeader = this.A07;
        newSliceHeader.A02();
        this.A00 = 0;
        this.A08 = true;
    }

    public final void A03(HQ hq) {
        this.A0C.append(hq.A00, hq);
    }

    public final void A04(HR hr) {
        this.A0D.append(hr.A09, hr);
    }

    public final boolean A06() {
        return this.A0H;
    }

    public final boolean A07(long j, int i2, boolean z2, boolean z3) {
        boolean z4 = false;
        if (this.A01 == 9 || (this.A0H && this.A07.A00(this.A06))) {
            if (z2 && this.A09) {
                A00(i2 + ((int) (j - this.A02)));
            }
            this.A04 = this.A02;
            this.A05 = this.A03;
            this.A0A = false;
            this.A09 = true;
        }
        if (this.A0G) {
            z3 = this.A07.A05();
        }
        boolean z5 = this.A0A;
        if (this.A01 == 5 || (z3 && this.A01 == 1)) {
            z4 = true;
        }
        this.A0A = z5 | z4;
        boolean treatIFrameAsKeyframe = this.A0A;
        return treatIFrameAsKeyframe;
    }
}
