package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.net.Uri;
import android.os.Looper;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Sz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2769Sz extends G9 implements InterfaceC3062bA {
    public final InterfaceC2484Hz h;
    public final C3341eO i;
    public final C2497Im j;
    public final C4710tz k;
    public final InterfaceC3296dq l;
    public final G7 m;
    public final boolean n;
    public final int o;
    public final boolean p;
    public final InterfaceC3150cA q;
    public final long r;
    public final C3693iO s;
    public C3164cO t;
    public Bd0 u;

    static {
        AbstractC2944Zs.a("goog.exo.hls");
    }

    public C2769Sz(C3693iO c3693iO, C2497Im c2497Im, C3467fn c3467fn, C4710tz c4710tz, InterfaceC3296dq interfaceC3296dq, G7 g7, C3730in c3730in, long j, boolean z, int i) {
        C3341eO c3341eO = c3693iO.b;
        c3341eO.getClass();
        this.i = c3341eO;
        this.s = c3693iO;
        this.t = c3693iO.c;
        this.j = c2497Im;
        this.h = c3467fn;
        this.k = c4710tz;
        this.l = interfaceC3296dq;
        this.m = g7;
        this.q = c3730in;
        this.r = j;
        this.n = z;
        this.o = i;
        this.p = false;
    }

    public static C2613Mz v(long j, AC ac) {
        C2613Mz c2613Mz = null;
        for (int i = 0; i < ac.size(); i++) {
            C2613Mz c2613Mz2 = (C2613Mz) ac.get(i);
            long j2 = c2613Mz2.e;
            if (j2 > j || !c2613Mz2.l) {
                if (j2 > j) {
                    break;
                }
            } else {
                c2613Mz = c2613Mz2;
            }
        }
        return c2613Mz;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.G9
    public final InterfaceC4395qO b(C5186zO c5186zO, C2833Vl c2833Vl, long j) {
        DO doA = a(c5186zO);
        C3031aq c3031aq = new C3031aq(this.d.c, 0, c5186zO);
        Bd0 bd0 = this.u;
        WU wu = this.g;
        FW.t(wu);
        return new C2587Lz(this.h, this.q, this.j, bd0, this.l, c3031aq, this.m, doA, c2833Vl, this.k, this.n, this.o, this.p, wu);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.G9
    public final C3693iO k() {
        return this.s;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.G9
    public final void m() throws IOException {
        C3730in c3730in = (C3730in) this.q;
        OI oi = c3730in.g;
        if (oi != null) {
            oi.maybeThrowError();
        }
        Uri uri = c3730in.k;
        if (uri != null) {
            C3643hn c3643hn = (C3643hn) c3730in.d.get(uri);
            c3643hn.b.maybeThrowError();
            IOException iOException = c3643hn.j;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.G9
    public final void o(Bd0 bd0) {
        this.u = bd0;
        InterfaceC3296dq interfaceC3296dq = this.l;
        interfaceC3296dq.prepare();
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        WU wu = this.g;
        FW.t(wu);
        interfaceC3296dq.f(looperMyLooper, wu);
        DO doA = a(null);
        Uri uri = this.i.f4269a;
        C3730in c3730in = (C3730in) this.q;
        c3730in.getClass();
        c3730in.h = Ug0.m(null);
        c3730in.f = doA;
        c3730in.i = this;
        MT mt = new MT(c3730in.f4520a.f3238a.createDataSource(), uri, 4, c3730in.b.k());
        FW.s(c3730in.g == null);
        OI oi = new OI("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        c3730in.g = oi;
        G7 g7 = c3730in.c;
        int i = mt.c;
        oi.f(mt, c3730in, g7.A(i));
        doA.l(new FI(mt.b), i, -1, null, 0, null, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.G9
    public final void q(InterfaceC4395qO interfaceC4395qO) {
        C2587Lz c2587Lz = (C2587Lz) interfaceC4395qO;
        ((C3730in) c2587Lz.b).e.remove(c2587Lz);
        for (C3591hA c3591hA : c2587Lz.u) {
            if (c3591hA.D) {
                for (C3503gA c3503gA : c3591hA.v) {
                    c3503gA.i();
                    InterfaceC2889Xp interfaceC2889Xp = c3503gA.h;
                    if (interfaceC2889Xp != null) {
                        interfaceC2889Xp.b(c3503gA.e);
                        c3503gA.h = null;
                        c3503gA.g = null;
                    }
                }
            }
            c3591hA.j.e(c3591hA);
            c3591hA.r.removeCallbacksAndMessages(null);
            c3591hA.H = true;
            c3591hA.s.clear();
        }
        c2587Lz.r = null;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.G9
    public final void s() {
        C3730in c3730in = (C3730in) this.q;
        c3730in.k = null;
        c3730in.l = null;
        c3730in.j = null;
        c3730in.n = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        c3730in.g.e(null);
        c3730in.g = null;
        HashMap map = c3730in.d;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((C3643hn) it.next()).b.e(null);
        }
        c3730in.h.removeCallbacksAndMessages(null);
        c3730in.h = null;
        map.clear();
        this.l.release();
    }

    public final void w(C2743Rz c2743Rz) {
        long j;
        S60 s60;
        long j2;
        long jL;
        long j3;
        boolean z = c2743Rz.p;
        long j4 = c2743Rz.h;
        long jW = z ? Ug0.W(j4) : com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        int i = c2743Rz.d;
        long j5 = (i == 2 || i == 1) ? jW : com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        C3730in c3730in = (C3730in) this.q;
        C2847Vz c2847Vz = c3730in.j;
        c2847Vz.getClass();
        C4568sM c4568sM = new C4568sM(c2847Vz, c2743Rz);
        boolean z2 = c3730in.m;
        long j6 = c2743Rz.u;
        AC ac = c2743Rz.r;
        boolean z3 = c2743Rz.g;
        long j7 = jW;
        long jL2 = c2743Rz.e;
        if (z2) {
            long j8 = j5;
            long j9 = j4 - c3730in.n;
            boolean z4 = c2743Rz.o;
            long j10 = z4 ? j9 + j6 : com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
            long jL3 = z ? Ug0.L(Ug0.x(this.r)) - (j4 + j6) : 0L;
            long j11 = this.t.f4220a;
            C2717Qz c2717Qz = c2743Rz.v;
            if (j11 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                jL = Ug0.L(j11);
            } else {
                if (jL2 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                    j2 = j6 - jL2;
                } else {
                    long j12 = c2717Qz.d;
                    if (j12 == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET || c2743Rz.n == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                        j2 = c2717Qz.c;
                        if (j2 == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                            j2 = 3 * c2743Rz.m;
                        }
                    } else {
                        j2 = j12;
                    }
                }
                jL = j2 + jL3;
            }
            long j13 = j6 + jL3;
            long jK = Ug0.k(jL, jL3, j13);
            C3164cO c3164cO = this.s.c;
            boolean z5 = c3164cO.d == -3.4028235E38f && c3164cO.e == -3.4028235E38f && c2717Qz.c == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET && c2717Qz.d == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
            long jW2 = Ug0.W(jK);
            this.t = new C3164cO(jW2, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET, z5 ? 1.0f : this.t.d, z5 ? 1.0f : this.t.e);
            if (jL2 == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                jL2 = j13 - Ug0.L(jW2);
            }
            if (z3) {
                j3 = jL2;
            } else {
                C2613Mz c2613MzV = v(jL2, c2743Rz.s);
                if (c2613MzV != null) {
                    j3 = c2613MzV.e;
                } else if (ac.isEmpty()) {
                    j3 = 0;
                } else {
                    C2665Oz c2665Oz = (C2665Oz) ac.get(Ug0.d(ac, Long.valueOf(jL2), true));
                    C2613Mz c2613MzV2 = v(jL2, c2665Oz.m);
                    j3 = c2613MzV2 != null ? c2613MzV2.e : c2665Oz.e;
                }
            }
            boolean z6 = i == 2 && c2743Rz.f;
            long j14 = j10;
            s60 = new S60(j8, j7, j14, c2743Rz.u, j9, j3, true, !z4, z6, c4568sM, this.s, this.t);
        } else {
            long j15 = j5;
            if (jL2 == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET || ac.isEmpty()) {
                j = 0;
            } else {
                j = (z3 || jL2 == j6) ? jL2 : ((C2665Oz) ac.get(Ug0.d(ac, Long.valueOf(jL2), true))).e;
            }
            C3693iO c3693iO = this.s;
            long j16 = c2743Rz.u;
            s60 = new S60(j15, j7, j16, j16, 0L, j, true, false, true, c4568sM, c3693iO, null);
        }
        p(s60);
    }
}
