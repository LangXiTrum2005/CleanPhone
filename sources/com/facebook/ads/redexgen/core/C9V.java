package com.facebook.ads.redexgen.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.9v, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C9v implements InterfaceC2709np, InterfaceC2710nq {
    public static String[] A06 = {"JXRw8dEnvO1Lr4g7cFUS0dvQrSj2gCrD", "hvHNuBxl", "xmWilmV3z2eIIj1", "UUtHfwhImwRJiupXWlBcpFq10hKf2hZ3", "Gjwbiw3zcCnfnivX0C6Z4KLegMayRhyW", "PFLAFIzQgEofbdrT2htWxpP7W2gVOOgi", "405rypbMY6P", "HWuA8Rz9jBHRgd5bymvhijPSyV36G6mN"};
    public long A00;
    public long A01;
    public long A02;
    public InterfaceC2710nq A03;
    public C2713nt[] A04 = new C2713nt[0];
    public final InterfaceC2709np A05;

    public C9v(InterfaceC2709np interfaceC2709np, boolean z2, long j, long j2) {
        this.A05 = interfaceC2709np;
        this.A02 = z2 ? j : -9223372036854775807L;
        this.A01 = j;
        this.A00 = j2;
    }

    private C11847u A00(long j, C11847u c11847u) {
        long toleranceBeforeUs = C5C.A0T(c11847u.A01, 0L, j - this.A01);
        long jA0T = C5C.A0T(c11847u.A00, 0L, this.A00 == Long.MIN_VALUE ? Long.MAX_VALUE : this.A00 - j);
        if (toleranceBeforeUs == c11847u.A01) {
            long j2 = c11847u.A00;
            if (A06[6].length() != 11) {
                throw new RuntimeException();
            }
            A06[0] = "SySHx2FlEzism2SEaRZKk1Ki9OIwKCgL";
            if (jA0T == j2) {
                return c11847u;
            }
        }
        return new C11847u(toleranceBeforeUs, jA0T);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.DW
    /* JADX INFO: renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final void ADV(InterfaceC2709np interfaceC2709np) {
        ((InterfaceC2710nq) AbstractC10843y.A01(this.A03)).ADV(this);
    }

    public static boolean A02(long j, InterfaceC2672nE[] interfaceC2672nEArr) {
        if (j != 0) {
            for (InterfaceC2672nE interfaceC2672nE : interfaceC2672nEArr) {
                if (interfaceC2672nE != null) {
                    C2860qI c2860qIA92 = interfaceC2672nE.A92();
                    if (!C3J.A0G(c2860qIA92.A0W, c2860qIA92.A0R)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean A03() {
        return this.A02 != -9223372036854775807L;
    }

    @Override // com.facebook.ads.redexgen.core.DX
    @MetaExoPlayerCustomization("Added in D19760981 for cancel request")
    public final void A4s(long j) {
        this.A05.A4s(j);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2709np
    public final boolean A5C(long j) {
        return this.A05.A5C(j);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2709np
    public final void A60(long j, boolean z2) {
        this.A05.A60(j, z2);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2709np
    public final long A6r(long j, C11847u c11847u) {
        if (j == this.A01) {
            return this.A01;
        }
        return this.A05.A6r(j, A00(j, c11847u));
    }

    @Override // com.facebook.ads.redexgen.core.DX
    @MetaExoPlayerCustomization("Added in D9949576 for unstall buffer")
    public final long A76(long j) {
        return this.A05.A76(j);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2709np
    public final long A78() {
        long jA78 = this.A05.A78();
        if (jA78 == Long.MIN_VALUE || (this.A00 != Long.MIN_VALUE && jA78 >= this.A00)) {
            return Long.MIN_VALUE;
        }
        return jA78;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2709np
    public final long A8b() {
        long jA8b = this.A05.A8b();
        if (jA8b != Long.MIN_VALUE) {
            long nextLoadPositionUs = this.A00;
            if (A06[0].charAt(29) != 'C') {
                throw new RuntimeException();
            }
            A06[0] = "QBPPyRyowan8CCGBQiXIHMf03VOUOCSC";
            if (nextLoadPositionUs == Long.MIN_VALUE || jA8b < this.A00) {
                return jA8b;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2709np
    public final C2690nW A9M() {
        return this.A05.A9M();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2709np
    public final void ACS() throws IOException {
        if (0 == 0) {
            this.A05.ACS();
            return;
        }
        throw null;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2710nq
    public final void AFS(InterfaceC2709np interfaceC2709np) {
        if (0 != 0) {
            return;
        }
        ((InterfaceC2710nq) AbstractC10843y.A01(this.A03)).AFS(this);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2709np
    public final void AH5(InterfaceC2710nq interfaceC2710nq, long j) {
        this.A03 = interfaceC2710nq;
        this.A05.AH5(this, j);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2709np
    public final long AHQ() {
        if (A03()) {
            long childDiscontinuityUs = this.A02;
            this.A02 = -9223372036854775807L;
            long jAHQ = AHQ();
            return jAHQ != -9223372036854775807L ? jAHQ : childDiscontinuityUs;
        }
        InterfaceC2709np interfaceC2709np = this.A05;
        if (A06[2].length() == 0) {
            throw new RuntimeException();
        }
        A06[6] = "ABWUoGiNBoa";
        long jAHQ2 = interfaceC2709np.AHQ();
        if (jAHQ2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long discontinuityUs = this.A01;
        boolean z2 = true;
        AbstractC10843y.A08(jAHQ2 >= discontinuityUs);
        if (this.A00 != Long.MIN_VALUE) {
            long discontinuityUs2 = this.A00;
            if (jAHQ2 > discontinuityUs2) {
                z2 = false;
            }
        }
        AbstractC10843y.A08(z2);
        return jAHQ2;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2709np
    public final void AHW(long j) {
        this.A05.AHW(j);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2709np
    public final long AJ8(@MetaExoPlayerCustomization long j, boolean z2) {
        this.A02 = -9223372036854775807L;
        boolean z3 = false;
        for (C2713nt c2713nt : this.A04) {
            if (c2713nt != null) {
                c2713nt.A00();
            }
        }
        long jAJ8 = this.A05.AJ8(j, z2);
        if (jAJ8 == j || (jAJ8 >= this.A01 && (this.A00 == Long.MIN_VALUE || jAJ8 <= this.A00))) {
            z3 = true;
        }
        AbstractC10843y.A08(z3);
        return jAJ8;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x005f  */
    /* JADX WARN: Code duplicated, block: B:29:0x0092  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:40:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:46:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:47:0x0102 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x0105  */
    /* JADX WARN: Code duplicated, block: B:51:0x0117 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x011d A[EDGE_INSN: B:58:0x011d->B:54:0x011d BREAK  A[LOOP:1: B:31:0x0097->B:50:0x010e], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x0059 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x011d A[EDGE_INSN: B:60:0x011d->B:54:0x011d BREAK  A[LOOP:1: B:31:0x0097->B:50:0x010e], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x010e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x010e A[SYNTHETIC] */
    @Override // com.facebook.ads.redexgen.core.InterfaceC2709np
    public final long AJ9(InterfaceC2672nE[] interfaceC2672nEArr, boolean[] zArr, DT[] dtArr, boolean[] zArr2, long j) {
        long j2;
        boolean z2;
        int i2;
        int length;
        DT[] childStreams;
        DT dt;
        DT dt2;
        C2713nt[] c2713ntArr;
        String[] strArr;
        this.A04 = new C2713nt[dtArr.length];
        DT[] dtArr2 = new DT[dtArr.length];
        int i3 = 0;
        while (true) {
            DT dt3 = null;
            if (i3 >= dtArr.length) {
                break;
            }
            this.A04[i3] = (C2713nt) dtArr[i3];
            DT[] childStreams2 = this.A04;
            if (childStreams2[i3] != null) {
                dt3 = this.A04[i3].A01;
            }
            dtArr2[i3] = dt3;
            i3++;
        }
        long jAJ9 = this.A05.AJ9(interfaceC2672nEArr, zArr, dtArr2, zArr2, j);
        if (!A03() || j != this.A01) {
            j2 = -9223372036854775807L;
            this.A02 = j2;
            if (jAJ9 != j || (jAJ9 >= this.A01 && (this.A00 == Long.MIN_VALUE || jAJ9 <= this.A00))) {
                z2 = true;
            } else {
                z2 = false;
            }
            AbstractC10843y.A08(z2);
            i2 = 0;
            while (true) {
                length = dtArr.length;
                if (A06[1].length() != 30) {
                    String[] strArr2 = A06;
                    strArr2[7] = "DNi9UWzwfCWyYPkB4uGGg0YkPCShAQe6";
                    strArr2[5] = "fAixbEz1F3G47KA6JLUGcT01MO1ZofiJ";
                    if (i2 >= length) {
                        break;
                    }
                    if (dtArr2[i2] == null) {
                        c2713ntArr = this.A04;
                        strArr = A06;
                        if (strArr[4].charAt(5) != strArr[3].charAt(5)) {
                            A06[6] = "ocXNdzhjsFv";
                            c2713ntArr[i2] = null;
                        }
                    } else {
                        childStreams = this.A04;
                        if (childStreams[i2] != null) {
                            dt = this.A04[i2].A01;
                            dt2 = dtArr2[i2];
                            if (A06[1].length() != 30) {
                                String[] strArr3 = A06;
                                strArr3[4] = "cYzDBwspbZ8a8DM9Dz10VjvDatAoG4Oi";
                                strArr3[3] = "WIkG6wjldaaFwlHYCP34A8xHiCA5NCte";
                                if (dt != dt2) {
                                    this.A04[i2] = new C2713nt(this, dtArr2[i2]);
                                }
                            } else if (dt != dt2) {
                                this.A04[i2] = new C2713nt(this, dtArr2[i2]);
                            }
                        } else {
                            this.A04[i2] = new C2713nt(this, dtArr2[i2]);
                        }
                    }
                    DT[] childStreams3 = this.A04;
                    dtArr[i2] = childStreams3[i2];
                    i2++;
                } else {
                    if (i2 >= length) {
                        break;
                    }
                    if (dtArr2[i2] == null) {
                        c2713ntArr = this.A04;
                        strArr = A06;
                        if (strArr[4].charAt(5) != strArr[3].charAt(5)) {
                            A06[6] = "ocXNdzhjsFv";
                            c2713ntArr[i2] = null;
                        }
                    } else {
                        childStreams = this.A04;
                        if (childStreams[i2] != null) {
                            dt = this.A04[i2].A01;
                            dt2 = dtArr2[i2];
                            if (A06[1].length() != 30) {
                                String[] strArr4 = A06;
                                strArr4[4] = "cYzDBwspbZ8a8DM9Dz10VjvDatAoG4Oi";
                                strArr4[3] = "WIkG6wjldaaFwlHYCP34A8xHiCA5NCte";
                                if (dt != dt2) {
                                    this.A04[i2] = new C2713nt(this, dtArr2[i2]);
                                }
                            } else if (dt != dt2) {
                                this.A04[i2] = new C2713nt(this, dtArr2[i2]);
                            }
                        } else {
                            this.A04[i2] = new C2713nt(this, dtArr2[i2]);
                        }
                    }
                    DT[] childStreams4 = this.A04;
                    dtArr[i2] = childStreams4[i2];
                    i2++;
                }
            }
            return jAJ9;
        }
        long j3 = this.A01;
        String[] strArr5 = A06;
        if (strArr5[4].charAt(5) == strArr5[3].charAt(5)) {
            String[] strArr6 = A06;
            strArr6[7] = "en1LL2zHQFU7eKPWWtw7tqDicZnmZ9l5";
            strArr6[5] = "t66o2OzEfyctLQHjRBlZ897u0IFgDWGZ";
            if (!A02(j3, interfaceC2672nEArr)) {
                j2 = -9223372036854775807L;
            } else {
                j2 = jAJ9;
            }
            this.A02 = j2;
            if (jAJ9 != j) {
                z2 = true;
            } else {
                z2 = true;
            }
            AbstractC10843y.A08(z2);
            i2 = 0;
            while (true) {
                length = dtArr.length;
                if (A06[1].length() != 30) {
                    String[] strArr7 = A06;
                    strArr7[7] = "DNi9UWzwfCWyYPkB4uGGg0YkPCShAQe6";
                    strArr7[5] = "fAixbEz1F3G47KA6JLUGcT01MO1ZofiJ";
                    if (i2 >= length) {
                        break;
                        break;
                    }
                    if (dtArr2[i2] == null) {
                        c2713ntArr = this.A04;
                        strArr = A06;
                        if (strArr[4].charAt(5) != strArr[3].charAt(5)) {
                            A06[6] = "ocXNdzhjsFv";
                            c2713ntArr[i2] = null;
                        }
                    } else {
                        childStreams = this.A04;
                        if (childStreams[i2] != null) {
                            dt = this.A04[i2].A01;
                            dt2 = dtArr2[i2];
                            if (A06[1].length() != 30) {
                                String[] strArr8 = A06;
                                strArr8[4] = "cYzDBwspbZ8a8DM9Dz10VjvDatAoG4Oi";
                                strArr8[3] = "WIkG6wjldaaFwlHYCP34A8xHiCA5NCte";
                                if (dt != dt2) {
                                    this.A04[i2] = new C2713nt(this, dtArr2[i2]);
                                }
                            } else if (dt != dt2) {
                                this.A04[i2] = new C2713nt(this, dtArr2[i2]);
                            }
                        } else {
                            this.A04[i2] = new C2713nt(this, dtArr2[i2]);
                        }
                    }
                    DT[] childStreams5 = this.A04;
                    dtArr[i2] = childStreams5[i2];
                    i2++;
                } else {
                    if (i2 >= length) {
                        break;
                        break;
                    }
                    if (dtArr2[i2] == null) {
                        c2713ntArr = this.A04;
                        strArr = A06;
                        if (strArr[4].charAt(5) != strArr[3].charAt(5)) {
                            A06[6] = "ocXNdzhjsFv";
                            c2713ntArr[i2] = null;
                        }
                    } else {
                        childStreams = this.A04;
                        if (childStreams[i2] != null) {
                            dt = this.A04[i2].A01;
                            dt2 = dtArr2[i2];
                            if (A06[1].length() != 30) {
                                String[] strArr9 = A06;
                                strArr9[4] = "cYzDBwspbZ8a8DM9Dz10VjvDatAoG4Oi";
                                strArr9[3] = "WIkG6wjldaaFwlHYCP34A8xHiCA5NCte";
                                if (dt != dt2) {
                                    this.A04[i2] = new C2713nt(this, dtArr2[i2]);
                                }
                            } else if (dt != dt2) {
                                this.A04[i2] = new C2713nt(this, dtArr2[i2]);
                            }
                        } else {
                            this.A04[i2] = new C2713nt(this, dtArr2[i2]);
                        }
                    }
                    DT[] childStreams6 = this.A04;
                    dtArr[i2] = childStreams6[i2];
                    i2++;
                }
            }
            return jAJ9;
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.redexgen.core.DX
    @MetaExoPlayerCustomization("Added in D19875605 for error load during pause")
    public final void AJc(boolean z2) {
        this.A05.AJc(z2);
    }

    @Override // com.facebook.ads.redexgen.core.DX
    @MetaExoPlayerCustomization("Added in D13267633 for lower priority during pause")
    public final void AKb(byte b2) {
        this.A05.AKb(b2);
    }
}
