package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.util.Pair;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.wM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4920wM extends AbstractC3554gm0 {
    public final boolean l;
    public final Fc0 m;
    public final Ec0 n;
    public C4744uM o;
    public C4656tM p;
    public boolean q;
    public boolean r;
    public boolean s;

    public C4920wM(G9 g9, boolean z) {
        super(g9);
        this.l = z && g9.l();
        this.m = new Fc0();
        this.n = new Ec0();
        Gc0 gc0J = g9.j();
        if (gc0J == null) {
            this.o = new C4744uM(new C4832vM(g9.k()), Fc0.r, C4744uM.h);
        } else {
            this.o = new C4744uM(gc0J, null, null);
            this.s = true;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3554gm0
    public final C5186zO A(C5186zO c5186zO) {
        Object obj = c5186zO.f4977a;
        Object obj2 = this.o.g;
        if (obj2 != null && obj2.equals(obj)) {
            obj = C4744uM.h;
        }
        return c5186zO.b(obj);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x006d  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:37:? A[RETURN, SYNTHETIC] */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3554gm0
    public final void B(Gc0 gc0) {
        long j;
        C4744uM c4744uM;
        C5186zO c5186zOB;
        C4744uM c4744uM2;
        if (this.r) {
            C4744uM c4744uM3 = this.o;
            this.o = new C4744uM(gc0, c4744uM3.f, c4744uM3.g);
            C4656tM c4656tM = this.p;
            if (c4656tM != null) {
                E(c4656tM.g);
            }
        } else {
            if (!gc0.q()) {
                Fc0 fc0 = this.m;
                gc0.o(0, fc0);
                long j2 = fc0.m;
                Object obj = fc0.f3074a;
                C4656tM c4656tM2 = this.p;
                if (c4656tM2 != null) {
                    C4744uM c4744uM4 = this.o;
                    Object obj2 = c4656tM2.f5032a.f4977a;
                    Ec0 ec0 = this.n;
                    c4744uM4.h(obj2, ec0);
                    long j3 = ec0.e + c4656tM2.b;
                    this.o.n(0, fc0, 0L);
                    if (j3 != fc0.m) {
                        j = j3;
                    } else {
                        j = j2;
                    }
                } else {
                    j = j2;
                }
                Pair pairJ = gc0.j(this.m, this.n, 0, j);
                Object obj3 = pairJ.first;
                long jLongValue = ((Long) pairJ.second).longValue();
                if (this.s) {
                    C4744uM c4744uM5 = this.o;
                    c4744uM = new C4744uM(gc0, c4744uM5.f, c4744uM5.g);
                } else {
                    c4744uM = new C4744uM(gc0, obj, obj3);
                }
                this.o = c4744uM;
                C4656tM c4656tM3 = this.p;
                if (c4656tM3 != null) {
                    E(jLongValue);
                    C5186zO c5186zO = c4656tM3.f5032a;
                    Object obj4 = c5186zO.f4977a;
                    if (this.o.g != null && obj4.equals(C4744uM.h)) {
                        obj4 = this.o.g;
                    }
                    c5186zOB = c5186zO.b(obj4);
                }
                this.s = true;
                this.r = true;
                p(this.o);
                if (c5186zOB != null) {
                    C4656tM c4656tM4 = this.p;
                    c4656tM4.getClass();
                    c4656tM4.a(c5186zOB);
                }
            }
            if (this.s) {
                C4744uM c4744uM6 = this.o;
                c4744uM2 = new C4744uM(gc0, c4744uM6.f, c4744uM6.g);
            } else {
                c4744uM2 = new C4744uM(gc0, Fc0.r, C4744uM.h);
            }
            this.o = c4744uM2;
        }
        c5186zOB = null;
        this.s = true;
        this.r = true;
        p(this.o);
        if (c5186zOB != null) {
            C4656tM c4656tM5 = this.p;
            c4656tM5.getClass();
            c4656tM5.a(c5186zOB);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3554gm0
    public final void C() {
        if (this.l) {
            return;
        }
        this.q = true;
        z(null, this.k);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.G9
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public final C4656tM b(C5186zO c5186zO, C2833Vl c2833Vl, long j) {
        C4656tM c4656tM = new C4656tM(c5186zO, c2833Vl, j);
        FW.s(c4656tM.d == null);
        G9 g9 = this.k;
        c4656tM.d = g9;
        if (this.r) {
            Object obj = this.o.g;
            Object obj2 = c5186zO.f4977a;
            if (obj != null && obj2.equals(C4744uM.h)) {
                obj2 = this.o.g;
            }
            c4656tM.a(c5186zO.b(obj2));
        } else {
            this.p = c4656tM;
            if (!this.q) {
                this.q = true;
                z(null, g9);
            }
        }
        return c4656tM;
    }

    public final void E(long j) {
        C4656tM c4656tM = this.p;
        int iB = this.o.b(c4656tM.f5032a.f4977a);
        if (iB == -1) {
            return;
        }
        C4744uM c4744uM = this.o;
        Ec0 ec0 = this.n;
        c4744uM.g(iB, ec0, false);
        long j2 = ec0.d;
        if (j2 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        c4656tM.g = j;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.G9
    public final void q(InterfaceC4395qO interfaceC4395qO) {
        ((C4656tM) interfaceC4395qO).c();
        if (interfaceC4395qO == this.p) {
            this.p = null;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4860vh, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.G9
    public final void s() {
        this.r = false;
        this.q = false;
        super.s();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4860vh, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.G9
    public final void m() {
    }
}
