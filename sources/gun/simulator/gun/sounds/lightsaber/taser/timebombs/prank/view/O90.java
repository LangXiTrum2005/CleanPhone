package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class O90 extends AbstractC2845Vx implements InterfaceC3858kF {
    public final VE e;
    public final int f;
    public final T90 g;
    public final M40 h;
    public int i;
    public B4 j;
    public final C3067bF k;
    public final C4298pF l;

    public O90(VE ve, int i, T90 t90, D40 d40, B4 b4) {
        AbstractC2995aW.q(ve, "json");
        AbstractC3950lJ.x(i, "mode");
        AbstractC2995aW.q(t90, "lexer");
        AbstractC2995aW.q(d40, "descriptor");
        this.e = ve;
        this.f = i;
        this.g = t90;
        this.h = ve.b;
        this.i = -1;
        this.j = b4;
        C3067bF c3067bF = ve.f3865a;
        this.k = c3067bF;
        this.l = c3067bF.f ? null : new C4298pF(d40);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2845Vx, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2548Kl
    public final int B(D40 d40) {
        AbstractC2995aW.q(d40, "enumDescriptor");
        return BF.m(d40, this.e, y(), " at path ".concat(this.g.b.d()));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2845Vx, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2548Kl
    public final boolean C() {
        C4298pF c4298pF = this.l;
        return (c4298pF == null || !c4298pF.b) && this.g.x();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2845Vx, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2548Kl
    public final byte E() {
        T90 t90 = this.g;
        long j = t90.j();
        byte b = (byte) j;
        if (j == b) {
            return b;
        }
        T90.p(t90, "Failed to parse byte for input '" + j + '\'', 0, null, 6);
        throw null;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2548Kl, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4421qh
    public final M40 a() {
        return this.h;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2845Vx, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4421qh
    public final void b(D40 d40) {
        AbstractC2995aW.q(d40, "descriptor");
        if (this.e.f3865a.b && d40.d() == 0) {
            while (k(d40) != -1) {
            }
        }
        char cB = AbstractC3888ke0.b(this.f);
        T90 t90 = this.g;
        t90.i(cB);
        A70 a70 = t90.b;
        int i = a70.b;
        int[] iArr = (int[]) a70.c;
        if (iArr[i] == -2) {
            iArr[i] = -1;
            a70.b = i - 1;
        }
        int i2 = a70.b;
        if (i2 != -1) {
            a70.b = i2 - 1;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2845Vx, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2548Kl
    public final InterfaceC4421qh c(D40 d40) {
        AbstractC2995aW.q(d40, "descriptor");
        VE ve = this.e;
        int iA = AbstractC4496rb.A(d40, ve);
        T90 t90 = this.g;
        A70 a70 = t90.b;
        a70.getClass();
        int i = a70.b + 1;
        a70.b = i;
        if (i == ((Object[]) a70.d).length) {
            a70.f();
        }
        ((Object[]) a70.d)[i] = d40;
        t90.i(AbstractC3888ke0.a(iA));
        if (t90.s() == 4) {
            T90.p(t90, "Unexpected leading comma", 0, null, 6);
            throw null;
        }
        int iD = DM.D(iA);
        if (iD == 1 || iD == 2 || iD == 3) {
            return new O90(this.e, iA, this.g, d40, this.j);
        }
        if (this.f == iA && ve.f3865a.f) {
            return this;
        }
        return new O90(this.e, iA, this.g, d40, this.j);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3858kF
    public final VE d() {
        return this.e;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2845Vx, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2548Kl
    public final InterfaceC2548Kl f(D40 d40) {
        AbstractC2995aW.q(d40, "descriptor");
        return Q90.a(d40) ? new C3946lF(this.g, this.e) : this;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3858kF
    public final AbstractC4122nF g() {
        return new VF(this.e.f3865a, this.g).b();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2845Vx, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2548Kl
    public final int h() {
        T90 t90 = this.g;
        long j = t90.j();
        int i = (int) j;
        if (j == i) {
            return i;
        }
        T90.p(t90, "Failed to parse int for input '" + j + '\'', 0, null, 6);
        throw null;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2845Vx, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2548Kl
    public final long i() {
        return this.g.j();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2845Vx, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2548Kl
    public final Object j(InterfaceC2369Do interfaceC2369Do) {
        T90 t90 = this.g;
        VE ve = this.e;
        AbstractC2995aW.q(interfaceC2369Do, "deserializer");
        try {
            if ((interfaceC2369Do instanceof U) && !ve.f3865a.i) {
                String strJ = AbstractC4496rb.j(interfaceC2369Do.getDescriptor(), ve);
                String strF = t90.f(strJ, this.k.c);
                InterfaceC2369Do interfaceC2369DoA = strF != null ? ((U) interfaceC2369Do).a(this, strF) : null;
                if (interfaceC2369DoA == null) {
                    return AbstractC4496rb.m(this, interfaceC2369Do);
                }
                this.j = new B4(strJ, 1);
                return interfaceC2369DoA.deserialize(this);
            }
            return interfaceC2369Do.deserialize(this);
        } catch (BP e) {
            throw new BP(e.f2870a, e.getMessage() + " at path: " + t90.b.d(), e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:156:0x027d A[EDGE_INSN: B:156:0x027d->B:157:0x027e BREAK  A[LOOP:2: B:140:0x0219->B:187:?]] */
    /* JADX WARN: Code duplicated, block: B:30:0x0060  */
    /* JADX WARN: Code duplicated, block: B:31:0x0062  */
    /* JADX WARN: Code duplicated, block: B:33:0x0067  */
    /* JADX WARN: Code duplicated, block: B:36:0x006d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0071  */
    /* JADX WARN: Code duplicated, block: B:41:0x0076  */
    /* JADX WARN: Code duplicated, block: B:44:0x0084 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x0088  */
    /* JADX WARN: Code duplicated, block: B:70:0x00e3  */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4421qh
    public final int k(D40 d40) {
        boolean zW;
        boolean z;
        String strK;
        boolean zW2;
        int i;
        boolean z2;
        int i2;
        AbstractC2995aW.q(d40, "descriptor");
        int i3 = this.f;
        int iD = DM.D(i3);
        T90 t90 = this.g;
        char c = ':';
        int i4 = -1;
        if (iD == 0) {
            boolean zW3 = t90.w();
            while (true) {
                boolean zB = t90.b();
                C4298pF c4298pF = this.l;
                if (zB) {
                    C3067bF c3067bF = this.k;
                    String strM = c3067bF.c ? t90.m() : t90.e();
                    t90.i(c);
                    VE ve = this.e;
                    int iL = BF.l(d40, ve, strM);
                    boolean z3 = c3067bF.c;
                    if (iL != -3) {
                        if (c3067bF.h) {
                            D40 d40G = d40.g(iL);
                            if (d40G.b() || !(!t90.x())) {
                                if (AbstractC2995aW.i(d40G.getKind(), K40.f3299a)) {
                                    byte bS = t90.s();
                                    if (z3) {
                                        if (bS == 1 || bS == 0) {
                                            strK = t90.l();
                                            t90.c = strK;
                                        } else {
                                            strK = null;
                                        }
                                    } else if (bS != 1) {
                                        strK = null;
                                    } else {
                                        strK = t90.k();
                                        t90.c = strK;
                                    }
                                    if (strK != null && BF.l(d40G, ve, strK) == -3) {
                                        t90.k();
                                    }
                                }
                            }
                            zW = t90.w();
                            z = false;
                        }
                        if (c4298pF != null) {
                            C2630Nq c2630Nq = c4298pF.f4828a;
                            if (iL < 64) {
                                c2630Nq.c |= 1 << iL;
                            } else {
                                int i5 = (iL >>> 6) - 1;
                                long[] jArr = c2630Nq.d;
                                jArr[i5] = (1 << (iL & 63)) | jArr[i5];
                            }
                        }
                        i4 = iL;
                    } else {
                        zW = false;
                        z = true;
                    }
                    if (z) {
                        boolean z4 = c3067bF.b;
                        String str = t90.e;
                        if (!z4) {
                            B4 b4 = this.j;
                            if (b4 == null || !AbstractC2995aW.i(b4.f2852a, strM)) {
                                t90.o(AbstractC3089ba0.x0(str.subSequence(0, t90.f3759a).toString(), strM, 6), AbstractC3950lJ.r("Encountered an unknown key '", strM, '\''), "Use 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.");
                                throw null;
                            }
                            b4.f2852a = null;
                        }
                        ArrayList arrayList = new ArrayList();
                        byte bS2 = t90.s();
                        if (bS2 == 8 || bS2 == 6) {
                            while (true) {
                                byte bS3 = t90.s();
                                if (bS3 != 1) {
                                    if (bS3 == 8 || bS3 == 6) {
                                        arrayList.add(Byte.valueOf(bS3));
                                    } else {
                                        A70 a70 = t90.b;
                                        if (bS3 == 9) {
                                            if (((Number) AbstractC2853Wf.m0(arrayList)).byteValue() != 8) {
                                                throw AbstractC2871Wx.J(t90.f3759a, str, "found ] instead of } at path: " + a70);
                                            }
                                            AbstractC2801Uf.b0(arrayList);
                                        } else if (bS3 == 7) {
                                            if (((Number) AbstractC2853Wf.m0(arrayList)).byteValue() != 6) {
                                                throw AbstractC2871Wx.J(t90.f3759a, str, "found } instead of ] at path: " + a70);
                                            }
                                            AbstractC2801Uf.b0(arrayList);
                                        } else if (bS3 == 10) {
                                            T90.p(t90, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, null, 6);
                                            throw null;
                                        }
                                    }
                                    t90.g();
                                    if (arrayList.size() == 0) {
                                        break;
                                    }
                                } else if (z3) {
                                    t90.l();
                                } else {
                                    t90.e();
                                }
                            }
                        } else {
                            t90.l();
                        }
                        zW3 = t90.w();
                    } else {
                        zW3 = zW;
                    }
                    c = ':';
                } else if (!zW3) {
                    if (c4298pF == null) {
                        i4 = -1;
                        break;
                    }
                    C2630Nq c2630Nq2 = c4298pF.f4828a;
                    D40 d41 = c2630Nq2.f3480a;
                    int iD2 = d41.d();
                    while (true) {
                        long j = c2630Nq2.c;
                        InterfaceC3567gx interfaceC3567gx = c2630Nq2.b;
                        if (j == -1) {
                            if (iD2 <= 64) {
                                i4 = -1;
                                break;
                            }
                            long[] jArr2 = c2630Nq2.d;
                            int length = jArr2.length;
                            int i6 = 0;
                            loop3: while (true) {
                                if (i6 >= length) {
                                    i4 = -1;
                                    break;
                                }
                                int i7 = i6 + 1;
                                int i8 = i7 * 64;
                                long j2 = jArr2[i6];
                                while (true) {
                                    if (j2 != -1) {
                                        int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(~j2);
                                        j2 |= 1 << iNumberOfTrailingZeros;
                                        int i9 = iNumberOfTrailingZeros + i8;
                                        if (((Boolean) interfaceC3567gx.invoke(d41, Integer.valueOf(i9))).booleanValue()) {
                                            jArr2[i6] = j2;
                                            i4 = i9;
                                            break;
                                        }
                                    } else {
                                        jArr2[i6] = j2;
                                        i6 = i7;
                                    }
                                }
                            }
                        } else {
                            int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(~j);
                            c2630Nq2.c |= 1 << iNumberOfTrailingZeros2;
                            if (((Boolean) interfaceC3567gx.invoke(d41, Integer.valueOf(iNumberOfTrailingZeros2))).booleanValue()) {
                                i4 = iNumberOfTrailingZeros2;
                                break;
                            }
                        }
                    }
                } else {
                    T90.p(t90, "Unexpected trailing comma", 0, null, 6);
                    throw null;
                }
            }
        } else if (iD != 2) {
            boolean zW4 = t90.w();
            if (t90.b()) {
                int i10 = this.i;
                if (i10 != -1 && !zW4) {
                    T90.p(t90, "Expected end of the array or comma", 0, null, 6);
                    throw null;
                }
                i4 = i10 + 1;
                this.i = i4;
            } else if (zW4) {
                T90.p(t90, "Unexpected trailing comma", 0, null, 6);
                throw null;
            }
        } else {
            int i11 = this.i;
            boolean z5 = i11 % 2 != 0;
            if (z5) {
                zW2 = i11 != -1 ? t90.w() : false;
                if (t90.b()) {
                    if (z5) {
                        if (this.i == -1) {
                            z2 = !zW2;
                            i2 = t90.f3759a;
                            if (!z2) {
                                T90.p(t90, "Unexpected trailing comma", i2, null, 4);
                                throw null;
                            }
                        } else {
                            i = t90.f3759a;
                            if (!zW2) {
                                T90.p(t90, "Expected comma after the key-value pair", i, null, 4);
                                throw null;
                            }
                        }
                    }
                    i4 = this.i + 1;
                    this.i = i4;
                } else if (zW2) {
                    T90.p(t90, "Expected '}', but had ',' instead", 0, null, 6);
                    throw null;
                }
            } else {
                t90.i(':');
            }
            if (t90.b()) {
                if (z5) {
                    if (this.i == -1) {
                        z2 = !zW2;
                        i2 = t90.f3759a;
                        if (!z2) {
                            T90.p(t90, "Unexpected trailing comma", i2, null, 4);
                            throw null;
                        }
                    } else {
                        i = t90.f3759a;
                        if (!zW2) {
                            T90.p(t90, "Expected comma after the key-value pair", i, null, 4);
                            throw null;
                        }
                    }
                }
                i4 = this.i + 1;
                this.i = i4;
            } else if (zW2) {
                T90.p(t90, "Expected '}', but had ',' instead", 0, null, 6);
                throw null;
            }
        }
        if (i3 != 3) {
            A70 a71 = t90.b;
            ((int[]) a71.c)[a71.b] = i4;
        }
        return i4;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2845Vx, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2548Kl
    public final short o() {
        T90 t90 = this.g;
        long j = t90.j();
        short s = (short) j;
        if (j == s) {
            return s;
        }
        T90.p(t90, "Failed to parse short for input '" + j + '\'', 0, null, 6);
        throw null;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2845Vx, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2548Kl
    public final float p() {
        T90 t90 = this.g;
        String strL = t90.l();
        try {
            float f = Float.parseFloat(strL);
            if (this.e.f3865a.k || !(Float.isInfinite(f) || Float.isNaN(f))) {
                return f;
            }
            AbstractC2871Wx.s0(t90, Float.valueOf(f));
            throw null;
        } catch (IllegalArgumentException unused) {
            T90.p(t90, AbstractC3950lJ.r("Failed to parse type 'float' for input '", strL, '\''), 0, null, 6);
            throw null;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2845Vx, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2548Kl
    public final double q() {
        T90 t90 = this.g;
        String strL = t90.l();
        try {
            double d = Double.parseDouble(strL);
            if (this.e.f3865a.k || !(Double.isInfinite(d) || Double.isNaN(d))) {
                return d;
            }
            AbstractC2871Wx.s0(t90, Double.valueOf(d));
            throw null;
        } catch (IllegalArgumentException unused) {
            T90.p(t90, AbstractC3950lJ.r("Failed to parse type 'double' for input '", strL, '\''), 0, null, 6);
            throw null;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2845Vx, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2548Kl
    public final boolean r() {
        boolean z;
        boolean z2 = this.k.c;
        T90 t90 = this.g;
        if (!z2) {
            return t90.c(t90.u());
        }
        int iU = t90.u();
        String str = t90.e;
        if (iU == str.length()) {
            T90.p(t90, "EOF", 0, null, 6);
            throw null;
        }
        if (str.charAt(iU) == '\"') {
            iU++;
            z = true;
        } else {
            z = false;
        }
        boolean zC = t90.c(iU);
        if (!z) {
            return zC;
        }
        if (t90.f3759a == str.length()) {
            T90.p(t90, "EOF", 0, null, 6);
            throw null;
        }
        if (str.charAt(t90.f3759a) == '\"') {
            t90.f3759a++;
            return zC;
        }
        T90.p(t90, "Expected closing quotation mark", 0, null, 6);
        throw null;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2845Vx, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2548Kl
    public final char u() {
        T90 t90 = this.g;
        String strL = t90.l();
        if (strL.length() == 1) {
            return strL.charAt(0);
        }
        T90.p(t90, AbstractC3950lJ.r("Expected single char, but got '", strL, '\''), 0, null, 6);
        throw null;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2845Vx, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2548Kl
    public final String y() {
        boolean z = this.k.c;
        T90 t90 = this.g;
        return z ? t90.m() : t90.k();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2845Vx, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4421qh
    public final Object z(D40 d40, int i, InterfaceC2369Do interfaceC2369Do, Object obj) {
        AbstractC2995aW.q(d40, "descriptor");
        AbstractC2995aW.q(interfaceC2369Do, "deserializer");
        boolean z = this.f == 3 && (i & 1) == 0;
        T90 t90 = this.g;
        if (z) {
            A70 a70 = t90.b;
            int[] iArr = (int[]) a70.c;
            int i2 = a70.b;
            if (iArr[i2] == -2) {
                ((Object[]) a70.d)[i2] = G7.f;
            }
        }
        Object objZ = super.z(d40, i, interfaceC2369Do, obj);
        if (z) {
            A70 a71 = t90.b;
            int[] iArr2 = (int[]) a71.c;
            int i3 = a71.b;
            if (iArr2[i3] != -2) {
                int i4 = i3 + 1;
                a71.b = i4;
                if (i4 == ((Object[]) a71.d).length) {
                    a71.f();
                }
            }
            Object[] objArr = (Object[]) a71.d;
            int i5 = a71.b;
            objArr[i5] = objZ;
            ((int[]) a71.c)[i5] = -2;
        }
        return objZ;
    }
}
