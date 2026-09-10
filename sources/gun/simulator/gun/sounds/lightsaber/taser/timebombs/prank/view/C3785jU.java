package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.jU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3785jU implements InterfaceC4503re0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC2656Oq f4555a;
    public final Uh0 b = new Uh0(new byte[10], 2, (Object) null);
    public int c = 0;
    public int d;
    public Mc0 e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public int j;
    public boolean k;
    public long l;

    public C3785jU(InterfaceC2656Oq interfaceC2656Oq) {
        this.f4555a = interfaceC2656Oq;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4503re0
    public final void a(int i, JT jt) {
        int i2;
        FW.t(this.e);
        int i3 = i & 1;
        InterfaceC2656Oq interfaceC2656Oq = this.f4555a;
        int i4 = -1;
        int i5 = 3;
        int i6 = 2;
        if (i3 != 0) {
            int i7 = this.c;
            if (i7 != 0 && i7 != 1) {
                if (i7 == 2) {
                    AbstractC4038mJ.f();
                } else {
                    if (i7 != 3) {
                        throw new IllegalStateException();
                    }
                    if (this.j != -1) {
                        AbstractC4038mJ.f();
                    }
                    interfaceC2656Oq.packetFinished();
                }
            }
            this.c = 1;
            this.d = 0;
        }
        int i8 = i;
        while (jt.a() > 0) {
            int i9 = this.c;
            if (i9 != 0) {
                Uh0 uh0 = this.b;
                if (i9 != 1) {
                    if (i9 != i6) {
                        if (i9 != i5) {
                            throw new IllegalStateException();
                        }
                        int iA = jt.a();
                        int i10 = this.j;
                        int i11 = i10 == i4 ? 0 : iA - i10;
                        if (i11 > 0) {
                            iA -= i11;
                            jt.D(jt.b + iA);
                        }
                        interfaceC2656Oq.a(jt);
                        int i12 = this.j;
                        if (i12 != i4) {
                            int i13 = i12 - iA;
                            this.j = i13;
                            if (i13 == 0) {
                                interfaceC2656Oq.packetFinished();
                                this.c = 1;
                                this.d = 0;
                            }
                        }
                    } else if (c(Math.min(10, this.i), jt, uh0.d) && c(this.i, jt, null)) {
                        uh0.p(0);
                        this.l = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
                        if (this.f) {
                            uh0.s(4);
                            long jI = ((long) uh0.i(i5)) << 30;
                            uh0.s(1);
                            long jI2 = ((long) (uh0.i(15) << 15)) | jI;
                            uh0.s(1);
                            long jI3 = jI2 | ((long) uh0.i(15));
                            uh0.s(1);
                            if (!this.h && this.g) {
                                uh0.s(4);
                                long jI4 = ((long) uh0.i(i5)) << 30;
                                uh0.s(1);
                                long jI5 = ((long) (uh0.i(15) << 15)) | jI4;
                                uh0.s(1);
                                long jI6 = jI5 | ((long) uh0.i(15));
                                uh0.s(1);
                                this.e.b(jI6);
                                this.h = true;
                            }
                            this.l = this.e.b(jI3);
                        }
                        i8 |= this.k ? 4 : 0;
                        interfaceC2656Oq.b(i8, this.l);
                        this.c = 3;
                        this.d = 0;
                    }
                } else if (c(9, jt, uh0.d)) {
                    uh0.p(0);
                    if (uh0.i(24) != 1) {
                        AbstractC4038mJ.f();
                        this.j = -1;
                        i2 = 0;
                    } else {
                        uh0.s(8);
                        int i14 = uh0.i(16);
                        uh0.s(5);
                        this.k = uh0.h();
                        uh0.s(2);
                        this.f = uh0.h();
                        this.g = uh0.h();
                        uh0.s(6);
                        int i15 = uh0.i(8);
                        this.i = i15;
                        if (i14 == 0) {
                            this.j = -1;
                        } else {
                            int i16 = (i14 - 3) - i15;
                            this.j = i16;
                            if (i16 < 0) {
                                AbstractC4038mJ.f();
                                this.j = -1;
                            }
                        }
                        i2 = 2;
                    }
                    this.c = i2;
                    this.d = 0;
                }
            } else {
                jt.F(jt.a());
            }
            i4 = -1;
            i5 = 3;
            i6 = 2;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4503re0
    public final void b(Mc0 mc0, InterfaceC4353pt interfaceC4353pt, C4416qe0 c4416qe0) {
        this.e = mc0;
        this.f4555a.c(interfaceC4353pt, c4416qe0);
    }

    public final boolean c(int i, JT jt, byte[] bArr) {
        int iMin = Math.min(jt.a(), i - this.d);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            jt.F(iMin);
        } else {
            jt.d(bArr, this.d, iMin);
        }
        int i2 = this.d + iMin;
        this.d = i2;
        return i2 == i;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4503re0
    public final void seek() {
        this.c = 0;
        this.d = 0;
        this.h = false;
        this.f4555a.seek();
    }
}
