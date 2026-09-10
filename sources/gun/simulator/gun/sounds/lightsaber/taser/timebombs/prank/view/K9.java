package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: loaded from: classes2.dex */
public abstract class K9 implements LU {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Fc0 f3304a = new Fc0();

    public final boolean a(int i) {
        C2736Rs c2736Rs = (C2736Rs) this;
        c2736Rs.Q();
        return c2736Rs.M.f3173a.f4194a.get(i);
    }

    public final boolean b() {
        C2736Rs c2736Rs = (C2736Rs) this;
        Gc0 gc0T = c2736Rs.t();
        return !gc0T.q() && gc0T.n(c2736Rs.p(), this.f3304a, 0L).i;
    }

    public final boolean c() {
        C2736Rs c2736Rs = (C2736Rs) this;
        Gc0 gc0T = c2736Rs.t();
        return !gc0T.q() && gc0T.n(c2736Rs.p(), this.f3304a, 0L).a();
    }

    public final boolean d() {
        C2736Rs c2736Rs = (C2736Rs) this;
        Gc0 gc0T = c2736Rs.t();
        return !gc0T.q() && gc0T.n(c2736Rs.p(), this.f3304a, 0L).h;
    }

    public abstract void e(int i, long j, boolean z);

    /* JADX WARN: Code duplicated, block: B:16:0x003c  */
    public final void f() {
        boolean z;
        int iE;
        C2736Rs c2736Rs = (C2736Rs) this;
        if (c2736Rs.t().q() || c2736Rs.z()) {
            return;
        }
        Gc0 gc0T = c2736Rs.t();
        if (gc0T.q()) {
            z = false;
        } else {
            int iP = c2736Rs.p();
            c2736Rs.Q();
            int i = c2736Rs.E;
            if (i == 1) {
                i = 0;
            }
            c2736Rs.Q();
            if (gc0T.e(iP, i, c2736Rs.F) != -1) {
                z = true;
            } else {
                z = false;
            }
        }
        if (!z) {
            if (c() && b()) {
                e(c2736Rs.p(), com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET, false);
                return;
            }
            return;
        }
        Gc0 gc0T2 = c2736Rs.t();
        if (gc0T2.q()) {
            iE = -1;
        } else {
            int iP2 = c2736Rs.p();
            c2736Rs.Q();
            int i2 = c2736Rs.E;
            if (i2 == 1) {
                i2 = 0;
            }
            c2736Rs.Q();
            iE = gc0T2.e(iP2, i2, c2736Rs.F);
        }
        if (iE == -1) {
            return;
        }
        if (iE == c2736Rs.p()) {
            e(c2736Rs.p(), com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET, true);
        } else {
            e(iE, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET, false);
        }
    }

    public final void g(int i, long j) {
        long jW;
        C2736Rs c2736Rs = (C2736Rs) this;
        long jR = c2736Rs.r() + j;
        c2736Rs.Q();
        if (c2736Rs.z()) {
            DU du = c2736Rs.h0;
            C5186zO c5186zO = du.b;
            Object obj = c5186zO.f4977a;
            Gc0 gc0 = du.f2971a;
            Ec0 ec0 = c2736Rs.n;
            gc0.h(obj, ec0);
            jW = Ug0.W(ec0.a(c5186zO.b, c5186zO.c));
        } else {
            Gc0 gc0T = c2736Rs.t();
            jW = gc0T.q() ? -9223372036854775807L : Ug0.W(gc0T.n(c2736Rs.p(), c2736Rs.f3304a, 0L).n);
        }
        if (jW != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
            jR = Math.min(jR, jW);
        }
        e(c2736Rs.p(), Math.max(jR, 0L), false);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003c  */
    public final void h() {
        boolean z;
        int iL;
        int iL2;
        C2736Rs c2736Rs = (C2736Rs) this;
        if (c2736Rs.t().q() || c2736Rs.z()) {
            return;
        }
        Gc0 gc0T = c2736Rs.t();
        if (gc0T.q()) {
            z = false;
        } else {
            int iP = c2736Rs.p();
            c2736Rs.Q();
            int i = c2736Rs.E;
            if (i == 1) {
                i = 0;
            }
            c2736Rs.Q();
            if (gc0T.l(iP, i, c2736Rs.F) != -1) {
                z = true;
            } else {
                z = false;
            }
        }
        if (c() && !d()) {
            if (z) {
                Gc0 gc0T2 = c2736Rs.t();
                if (gc0T2.q()) {
                    iL2 = -1;
                } else {
                    int iP2 = c2736Rs.p();
                    c2736Rs.Q();
                    int i2 = c2736Rs.E;
                    if (i2 == 1) {
                        i2 = 0;
                    }
                    c2736Rs.Q();
                    iL2 = gc0T2.l(iP2, i2, c2736Rs.F);
                }
                if (iL2 == -1) {
                    return;
                }
                if (iL2 == c2736Rs.p()) {
                    e(c2736Rs.p(), com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET, true);
                    return;
                } else {
                    e(iL2, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET, false);
                    return;
                }
            }
            return;
        }
        if (z) {
            long jR = c2736Rs.r();
            c2736Rs.Q();
            if (jR <= 3000) {
                Gc0 gc0T3 = c2736Rs.t();
                if (gc0T3.q()) {
                    iL = -1;
                } else {
                    int iP3 = c2736Rs.p();
                    c2736Rs.Q();
                    int i3 = c2736Rs.E;
                    if (i3 == 1) {
                        i3 = 0;
                    }
                    c2736Rs.Q();
                    iL = gc0T3.l(iP3, i3, c2736Rs.F);
                }
                if (iL == -1) {
                    return;
                }
                if (iL == c2736Rs.p()) {
                    e(c2736Rs.p(), com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET, true);
                    return;
                } else {
                    e(iL, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET, false);
                    return;
                }
            }
        }
        e(c2736Rs.p(), 0L, false);
    }
}
