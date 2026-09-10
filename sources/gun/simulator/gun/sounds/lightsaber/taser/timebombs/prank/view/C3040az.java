package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Collections;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.az, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3040az implements InterfaceC2656Oq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3491g4 f4150a;
    public String b;
    public InterfaceC4326pd0 c;
    public C2950Zy d;
    public boolean e;
    public long l;
    public final boolean[] f = new boolean[3];
    public final C4836vQ g = new C4836vQ(32);
    public final C4836vQ h = new C4836vQ(33);
    public final C4836vQ i = new C4836vQ(34);
    public final C4836vQ j = new C4836vQ(39);
    public final C4836vQ k = new C4836vQ(40);
    public long m = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
    public final JT n = new JT();

    public C3040az(C3491g4 c3491g4) {
        this.f4150a = c3491g4;
    }

    /* JADX WARN: Code duplicated, block: B:173:0x0385  */
    /* JADX WARN: Code duplicated, block: B:176:0x039d  */
    /* JADX WARN: Code duplicated, block: B:179:0x03bd  */
    /* JADX WARN: Code duplicated, block: B:184:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:195:0x041b  */
    /* JADX WARN: Code duplicated, block: B:208:0x0440  */
    /* JADX WARN: Code duplicated, block: B:211:0x0446  */
    /* JADX WARN: Code duplicated, block: B:214:0x044b  */
    /* JADX WARN: Code duplicated, block: B:220:0x0457  */
    /* JADX WARN: Code duplicated, block: B:228:0x0464 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x00cd  */
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
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2656Oq
    public final void a(JT jt) {
        int i;
        int i2;
        int i3;
        boolean z;
        C4836vQ c4836vQ;
        C4836vQ c4836vQ2;
        C4836vQ c4836vQ3;
        C4836vQ c4836vQ4;
        int i4;
        C4836vQ c4836vQ5;
        boolean zB;
        C3491g4 c3491g4;
        JT jt2;
        C4836vQ c4836vQ6;
        int i5;
        boolean z2;
        boolean z3;
        FW.t(this.c);
        int i6 = Ug0.f3833a;
        while (jt.a() > 0) {
            int i7 = jt.b;
            byte[] bArr = jt.f3266a;
            this.l += (long) jt.a();
            this.c.d(jt.a(), jt);
            for (int i8 = jt.c; i7 < i8; i8 = i) {
                int iB = AbstractC5188zQ.b(bArr, i7, i8, this.f);
                if (iB == i8) {
                    d(bArr, i7, i8);
                    return;
                }
                int i9 = iB + 3;
                int i10 = (bArr[i9] & 126) >> 1;
                int i11 = iB - i7;
                if (i11 > 0) {
                    d(bArr, i7, iB);
                }
                int i12 = i8 - iB;
                long j = this.l - ((long) i12);
                int i13 = i11 < 0 ? -i11 : 0;
                long j2 = this.m;
                C2950Zy c2950Zy = this.d;
                boolean z4 = this.e;
                if (c2950Zy.j && c2950Zy.g) {
                    c2950Zy.m = c2950Zy.c;
                    c2950Zy.j = false;
                } else {
                    if (c2950Zy.h || c2950Zy.g) {
                        if (z4 && c2950Zy.i) {
                            i = i8;
                            long j3 = c2950Zy.b;
                            i2 = i9;
                            i3 = i10;
                            int i14 = i12 + ((int) (j - j3));
                            long j4 = c2950Zy.l;
                            if (j4 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                                c2950Zy.f4101a.a(j4, c2950Zy.m ? 1 : 0, (int) (j3 - c2950Zy.k), i14, null);
                            }
                            c2950Zy.k = c2950Zy.b;
                            c2950Zy.l = c2950Zy.e;
                            c2950Zy.m = c2950Zy.c;
                            c2950Zy.i = true;
                        } else {
                            i = i8;
                            i2 = i9;
                            i3 = i10;
                        }
                        c2950Zy.k = c2950Zy.b;
                        c2950Zy.l = c2950Zy.e;
                        c2950Zy.m = c2950Zy.c;
                        c2950Zy.i = true;
                    }
                    z = this.e;
                    c4836vQ = this.i;
                    c4836vQ2 = this.h;
                    c4836vQ3 = this.g;
                    if (z) {
                        c4836vQ = c4836vQ;
                        c4836vQ4 = c4836vQ2;
                        i4 = i12;
                    } else {
                        c4836vQ3.b(i13);
                        c4836vQ2.b(i13);
                        c4836vQ.b(i13);
                        if (!c4836vQ3.c && c4836vQ2.c && c4836vQ.c) {
                            InterfaceC4326pd0 interfaceC4326pd0 = this.c;
                            String str = this.b;
                            int i15 = c4836vQ3.e;
                            byte[] bArr2 = new byte[c4836vQ2.e + i15 + c4836vQ.e];
                            System.arraycopy(c4836vQ3.d, 0, bArr2, 0, i15);
                            System.arraycopy(c4836vQ2.d, 0, bArr2, c4836vQ3.e, c4836vQ2.e);
                            System.arraycopy(c4836vQ.d, 0, bArr2, c4836vQ3.e + c4836vQ2.e, c4836vQ.e);
                            Uh0 uh0 = new Uh0(c4836vQ2.d, 0, c4836vQ2.e);
                            uh0.s(44);
                            int i16 = uh0.i(3);
                            uh0.r();
                            int i17 = uh0.i(2);
                            boolean zH = uh0.h();
                            int i18 = uh0.i(5);
                            int i19 = 0;
                            int i20 = 0;
                            for (int i21 = 32; i19 < i21; i21 = 32) {
                                if (uh0.h()) {
                                    i20 |= 1 << i19;
                                }
                                i19++;
                            }
                            int[] iArr = new int[6];
                            for (int i22 = 0; i22 < 6; i22++) {
                                iArr[i22] = uh0.i(8);
                            }
                            int i23 = uh0.i(8);
                            int i24 = 0;
                            for (int i25 = 0; i25 < i16; i25++) {
                                if (uh0.h()) {
                                    i24 += 89;
                                }
                                if (uh0.h()) {
                                    i24 += 8;
                                }
                            }
                            uh0.s(i24);
                            if (i16 > 0) {
                                uh0.s((8 - i16) * 2);
                            }
                            uh0.l();
                            int iL = uh0.l();
                            if (iL == 3) {
                                uh0.r();
                            }
                            int iL2 = uh0.l();
                            int iL3 = uh0.l();
                            if (uh0.h()) {
                                int iL4 = uh0.l();
                                int iL5 = uh0.l();
                                int iL6 = uh0.l();
                                int iL7 = uh0.l();
                                iL2 -= (iL4 + iL5) * ((iL == 1 || iL == 2) ? 2 : 1);
                                iL3 -= (iL6 + iL7) * (iL == 1 ? 2 : 1);
                            } else {
                                c4836vQ = c4836vQ;
                            }
                            uh0.l();
                            uh0.l();
                            int iL8 = uh0.l();
                            for (int i26 = uh0.h() ? 0 : i16; i26 <= i16; i26++) {
                                uh0.l();
                                uh0.l();
                                uh0.l();
                            }
                            uh0.l();
                            uh0.l();
                            uh0.l();
                            uh0.l();
                            uh0.l();
                            uh0.l();
                            if (uh0.h() && uh0.h()) {
                                int i27 = 0;
                                for (int i28 = 4; i27 < i28; i28 = 4) {
                                    int i29 = 0;
                                    for (int i30 = 6; i29 < i30; i30 = 6) {
                                        if (uh0.h()) {
                                            int iMin = Math.min(64, 1 << ((i27 << 1) + 4));
                                            if (i27 > 1) {
                                                uh0.m();
                                            }
                                            for (int i31 = 0; i31 < iMin; i31++) {
                                                uh0.m();
                                            }
                                        } else {
                                            uh0.l();
                                        }
                                        i29 += i27 == 3 ? 3 : 1;
                                        i12 = i12;
                                        c4836vQ2 = c4836vQ2;
                                    }
                                    i27++;
                                }
                            }
                            c4836vQ4 = c4836vQ2;
                            i4 = i12;
                            uh0.s(2);
                            if (uh0.h()) {
                                uh0.s(8);
                                uh0.l();
                                uh0.l();
                                uh0.r();
                            }
                            int i32 = 0;
                            boolean zH2 = false;
                            int i33 = 0;
                            for (int iL9 = uh0.l(); i32 < iL9; iL9 = iL9) {
                                if (i32 != 0) {
                                    zH2 = uh0.h();
                                }
                                if (zH2) {
                                    uh0.r();
                                    uh0.l();
                                    for (int i34 = 0; i34 <= i33; i34++) {
                                        if (uh0.h()) {
                                            uh0.r();
                                        }
                                    }
                                } else {
                                    int iL10 = uh0.l();
                                    int iL11 = uh0.l();
                                    int i35 = iL10 + iL11;
                                    for (int i36 = 0; i36 < iL10; i36++) {
                                        uh0.l();
                                        uh0.r();
                                    }
                                    for (int i37 = 0; i37 < iL11; i37++) {
                                        uh0.l();
                                        uh0.r();
                                    }
                                    i33 = i35;
                                }
                                i32++;
                            }
                            if (uh0.h()) {
                                for (int i38 = 0; i38 < uh0.l(); i38++) {
                                    uh0.s(iL8 + 5);
                                }
                            }
                            uh0.s(2);
                            float f = 1.0f;
                            if (uh0.h()) {
                                if (uh0.h()) {
                                    int i39 = uh0.i(8);
                                    if (i39 == 255) {
                                        int i40 = uh0.i(16);
                                        int i41 = uh0.i(16);
                                        if (i40 != 0 && i41 != 0) {
                                            f = i40 / i41;
                                        }
                                    } else {
                                        float[] fArr = AbstractC5188zQ.b;
                                        if (i39 < 17) {
                                            f = fArr[i39];
                                        } else {
                                            AbstractC4038mJ.f();
                                        }
                                    }
                                }
                                if (uh0.h()) {
                                    uh0.r();
                                }
                                if (uh0.h()) {
                                    uh0.s(4);
                                    if (uh0.h()) {
                                        uh0.s(24);
                                    }
                                }
                                if (uh0.h()) {
                                    uh0.l();
                                    uh0.l();
                                }
                                uh0.r();
                                if (uh0.h()) {
                                    iL3 *= 2;
                                }
                            }
                            String strE = FW.e(i17, zH, i18, i20, iArr, i23);
                            C4531rw c4531rw = new C4531rw();
                            c4531rw.f4954a = str;
                            c4531rw.k = "video/hevc";
                            c4531rw.h = strE;
                            c4531rw.p = iL2;
                            c4531rw.q = iL3;
                            c4531rw.t = f;
                            c4531rw.m = Collections.singletonList(bArr2);
                            interfaceC4326pd0.e(new C4619sw(c4531rw));
                            this.e = true;
                        } else {
                            c4836vQ = c4836vQ;
                            c4836vQ4 = c4836vQ2;
                            i4 = i12;
                        }
                    }
                    c4836vQ5 = this.j;
                    zB = c4836vQ5.b(i13);
                    c3491g4 = this.f4150a;
                    jt2 = this.n;
                    if (zB) {
                        jt2.C(c4836vQ5.d, AbstractC5188zQ.e(c4836vQ5.d, c4836vQ5.e));
                        jt2.F(5);
                        AbstractC2845Vx.Q(j2, jt2, (InterfaceC4326pd0[]) c3491g4.c);
                    }
                    c4836vQ6 = this.k;
                    if (c4836vQ6.b(i13)) {
                        jt2.C(c4836vQ6.d, AbstractC5188zQ.e(c4836vQ6.d, c4836vQ6.e));
                        jt2.F(5);
                        AbstractC2845Vx.Q(j2, jt2, (InterfaceC4326pd0[]) c3491g4.c);
                    }
                    long j5 = this.m;
                    C2950Zy c2950Zy2 = this.d;
                    boolean z5 = this.e;
                    c2950Zy2.g = false;
                    c2950Zy2.h = false;
                    c2950Zy2.e = j5;
                    c2950Zy2.d = 0;
                    long j6 = j;
                    c2950Zy2.b = j6;
                    i5 = i3;
                    if (i5 >= 32 || i5 == 40) {
                        c4836vQ3 = c4836vQ3;
                    } else {
                        if (!c2950Zy2.i || c2950Zy2.j) {
                            c4836vQ3 = c4836vQ3;
                        } else {
                            if (z5) {
                                long j7 = c2950Zy2.l;
                                if (j7 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                                    c2950Zy2.f4101a.a(j7, c2950Zy2.m ? 1 : 0, (int) (j6 - c2950Zy2.k), i4, null);
                                }
                            }
                            c2950Zy2.i = false;
                        }
                        if ((32 <= i5 && i5 <= 35) || i5 == 39) {
                            z2 = true;
                            c2950Zy2.h = !c2950Zy2.j;
                            c2950Zy2.j = true;
                        }
                        if (i5 >= 16 || i5 > 21) {
                            z3 = false;
                        } else {
                            z3 = true;
                        }
                        c2950Zy2.c = z3;
                        if (!z3 && i5 > 9) {
                            z2 = false;
                        }
                        c2950Zy2.f = z2;
                        if (!this.e) {
                            c4836vQ3.d(i5);
                            c4836vQ4.d(i5);
                            c4836vQ.d(i5);
                        }
                        c4836vQ5.d(i5);
                        c4836vQ6.d(i5);
                        i7 = i2;
                        bArr = bArr;
                    }
                    z2 = true;
                    if (i5 >= 16) {
                        z3 = false;
                    } else {
                        z3 = false;
                    }
                    c2950Zy2.c = z3;
                    if (!z3) {
                        z2 = false;
                    }
                    c2950Zy2.f = z2;
                    if (!this.e) {
                        c4836vQ3.d(i5);
                        c4836vQ4.d(i5);
                        c4836vQ.d(i5);
                    }
                    c4836vQ5.d(i5);
                    c4836vQ6.d(i5);
                    i7 = i2;
                    bArr = bArr;
                }
                i = i8;
                i2 = i9;
                i3 = i10;
                j = j;
                z = this.e;
                c4836vQ = this.i;
                c4836vQ2 = this.h;
                c4836vQ3 = this.g;
                if (z) {
                    c4836vQ3.b(i13);
                    c4836vQ2.b(i13);
                    c4836vQ.b(i13);
                    if (!c4836vQ3.c) {
                        c4836vQ = c4836vQ;
                        c4836vQ4 = c4836vQ2;
                        i4 = i12;
                    } else {
                        c4836vQ = c4836vQ;
                        c4836vQ4 = c4836vQ2;
                        i4 = i12;
                    }
                } else {
                    c4836vQ = c4836vQ;
                    c4836vQ4 = c4836vQ2;
                    i4 = i12;
                }
                c4836vQ5 = this.j;
                zB = c4836vQ5.b(i13);
                c3491g4 = this.f4150a;
                jt2 = this.n;
                if (zB) {
                    jt2.C(c4836vQ5.d, AbstractC5188zQ.e(c4836vQ5.d, c4836vQ5.e));
                    jt2.F(5);
                    AbstractC2845Vx.Q(j2, jt2, (InterfaceC4326pd0[]) c3491g4.c);
                }
                c4836vQ6 = this.k;
                if (c4836vQ6.b(i13)) {
                    jt2.C(c4836vQ6.d, AbstractC5188zQ.e(c4836vQ6.d, c4836vQ6.e));
                    jt2.F(5);
                    AbstractC2845Vx.Q(j2, jt2, (InterfaceC4326pd0[]) c3491g4.c);
                }
                long j8 = this.m;
                C2950Zy c2950Zy3 = this.d;
                boolean z6 = this.e;
                c2950Zy3.g = false;
                c2950Zy3.h = false;
                c2950Zy3.e = j8;
                c2950Zy3.d = 0;
                long j9 = j;
                c2950Zy3.b = j9;
                i5 = i3;
                if (i5 >= 32) {
                    c4836vQ3 = c4836vQ3;
                    z2 = true;
                } else {
                    c4836vQ3 = c4836vQ3;
                    z2 = true;
                }
                if (i5 >= 16) {
                    z3 = false;
                } else {
                    z3 = false;
                }
                c2950Zy3.c = z3;
                if (!z3) {
                    z2 = false;
                }
                c2950Zy3.f = z2;
                if (!this.e) {
                    c4836vQ3.d(i5);
                    c4836vQ4.d(i5);
                    c4836vQ.d(i5);
                }
                c4836vQ5.d(i5);
                c4836vQ6.d(i5);
                i7 = i2;
                bArr = bArr;
            }
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2656Oq
    public final void b(int i, long j) {
        if (j != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
            this.m = j;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2656Oq
    public final void c(InterfaceC4353pt interfaceC4353pt, C4416qe0 c4416qe0) {
        c4416qe0.a();
        c4416qe0.b();
        this.b = c4416qe0.e;
        c4416qe0.b();
        InterfaceC4326pd0 interfaceC4326pd0Track = interfaceC4353pt.track(c4416qe0.d, 2);
        this.c = interfaceC4326pd0Track;
        this.d = new C2950Zy(interfaceC4326pd0Track);
        this.f4150a.t(interfaceC4353pt, c4416qe0);
    }

    public final void d(byte[] bArr, int i, int i2) {
        C2950Zy c2950Zy = this.d;
        if (c2950Zy.f) {
            int i3 = c2950Zy.d;
            int i4 = (i + 2) - i3;
            if (i4 < i2) {
                c2950Zy.g = (bArr[i4] & 128) != 0;
                c2950Zy.f = false;
            } else {
                c2950Zy.d = (i2 - i) + i3;
            }
        }
        if (!this.e) {
            this.g.a(bArr, i, i2);
            this.h.a(bArr, i, i2);
            this.i.a(bArr, i, i2);
        }
        this.j.a(bArr, i, i2);
        this.k.a(bArr, i, i2);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2656Oq
    public final void seek() {
        this.l = 0L;
        this.m = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        AbstractC5188zQ.a(this.f);
        this.g.c();
        this.h.c();
        this.i.c();
        this.j.c();
        this.k.c();
        C2950Zy c2950Zy = this.d;
        if (c2950Zy != null) {
            c2950Zy.f = false;
            c2950Zy.g = false;
            c2950Zy.h = false;
            c2950Zy.i = false;
            c2950Zy.j = false;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2656Oq
    public final void packetFinished() {
    }
}
