package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import androidx.core.view.PointerIconCompat;
import com.google.android.exoplayer2.metadata.Metadata;
import java.io.IOException;
import java.util.List;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.nm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4167nm implements InterfaceC3050b4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC2412Ff f4759a;
    public final Ec0 b;
    public final Fc0 c;
    public final C4079mm d;
    public final SparseArray e;
    public EI f;
    public LU g;
    public Qa0 h;
    public boolean i;

    public C4167nm(InterfaceC2412Ff interfaceC2412Ff) {
        interfaceC2412Ff.getClass();
        this.f4759a = interfaceC2412Ff;
        int i = Ug0.f3833a;
        Looper looperMyLooper = Looper.myLooper();
        this.f = new EI(looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper, interfaceC2412Ff, new C2953a0(13));
        Ec0 ec0 = new Ec0();
        this.b = ec0;
        this.c = new Fc0();
        this.d = new C4079mm(ec0);
        this.e = new SparseArray();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JU
    public final void A(C2321Bs c2321Bs) {
        C4570sO c4570sO;
        C3403f4 c3403f4I = (!(c2321Bs instanceof C2321Bs) || (c4570sO = c2321Bs.m) == null) ? I() : J(new C5186zO(c4570sO));
        N(c3403f4I, 10, new C2885Xl(c3403f4I, c2321Bs, 1));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JU
    public final void B(C3693iO c3693iO, int i) {
        C3403f4 c3403f4I = I();
        N(c3403f4I, 1, new C4771ug0(c3403f4I, c3693iO, i));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JU
    public final void C(C2421Fo c2421Fo) {
        C3403f4 c3403f4I = I();
        N(c3403f4I, 29, new C3285dk(10, c3403f4I, c2421Fo));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3120bq
    public final void D(int i, C5186zO c5186zO, int i2) {
        C3403f4 c3403f4L = L(i, c5186zO);
        N(c3403f4L, 1022, new C2911Yl(c3403f4L, i2, 4));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3120bq
    public final void E(int i, C5186zO c5186zO, Exception exc) {
        C3403f4 c3403f4L = L(i, c5186zO);
        N(c3403f4L, 1024, new C3641hm(c3403f4L, exc, 3));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JU
    public final void F(C5117yd0 c5117yd0) {
        C3403f4 c3403f4I = I();
        N(c3403f4I, 2, new C3285dk(9, c3403f4I, c5117yd0));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3120bq
    public final void G(int i, C5186zO c5186zO) {
        C3403f4 c3403f4L = L(i, c5186zO);
        N(c3403f4L, 1025, new C3815jm(c3403f4L, 6));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JU
    public final void H(boolean z) {
        C3403f4 c3403f4I = I();
        N(c3403f4I, 7, new C3553gm(1, c3403f4I, z));
    }

    public final C3403f4 I() {
        return J(this.d.d);
    }

    public final C3403f4 J(C5186zO c5186zO) {
        this.g.getClass();
        Gc0 gc0 = c5186zO == null ? null : (Gc0) this.d.c.get(c5186zO);
        if (c5186zO != null && gc0 != null) {
            return K(gc0, gc0.h(c5186zO.f4977a, this.b).c, c5186zO);
        }
        int iP = ((C2736Rs) this.g).p();
        Gc0 gc0T = ((C2736Rs) this.g).t();
        if (iP >= gc0T.p()) {
            gc0T = Gc0.f3128a;
        }
        return K(gc0T, iP, null);
    }

    public final C3403f4 K(Gc0 gc0, int i, C5186zO c5186zO) {
        C5186zO c5186zO2 = gc0.q() ? null : c5186zO;
        ((Oa0) this.f4759a).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = gc0.equals(((C2736Rs) this.g).t()) && i == ((C2736Rs) this.g).p();
        long jW = 0;
        if (c5186zO2 == null || !c5186zO2.a()) {
            if (z) {
                jW = ((C2736Rs) this.g).m();
            } else if (!gc0.q()) {
                jW = Ug0.W(gc0.n(i, this.c, 0L).m);
            }
        } else if (z && ((C2736Rs) this.g).n() == c5186zO2.b && ((C2736Rs) this.g).o() == c5186zO2.c) {
            jW = ((C2736Rs) this.g).r();
        }
        C5186zO c5186zO3 = this.d.d;
        Gc0 gc0T = ((C2736Rs) this.g).t();
        int iP = ((C2736Rs) this.g).p();
        long jR = ((C2736Rs) this.g).r();
        C2736Rs c2736Rs = (C2736Rs) this.g;
        c2736Rs.Q();
        return new C3403f4(jElapsedRealtime, gc0, i, c5186zO2, jW, gc0T, iP, c5186zO3, jR, Ug0.W(c2736Rs.h0.q));
    }

    public final C3403f4 L(int i, C5186zO c5186zO) {
        this.g.getClass();
        if (c5186zO != null) {
            return ((Gc0) this.d.c.get(c5186zO)) != null ? J(c5186zO) : K(Gc0.f3128a, i, c5186zO);
        }
        Gc0 gc0T = ((C2736Rs) this.g).t();
        if (i >= gc0T.p()) {
            gc0T = Gc0.f3128a;
        }
        return K(gc0T, i, null);
    }

    public final C3403f4 M() {
        return J(this.d.f);
    }

    public final void N(C3403f4 c3403f4, int i, BI bi) {
        this.e.put(i, c3403f4);
        this.f.e(i, bi);
    }

    public final void O(LU lu, Looper looper) {
        FW.s(this.g == null || this.d.b.isEmpty());
        lu.getClass();
        this.g = lu;
        this.h = ((Oa0) this.f4759a).a(looper, null);
        EI ei = this.f;
        this.f = new EI(ei.d, looper, ei.f3019a, new C3285dk(5, this, lu));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JU
    public final void a(Ih0 ih0) {
        C3403f4 c3403f4M = M();
        N(c3403f4M, 25, new C3285dk(12, c3403f4M, ih0));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JU
    public final void b(int i) {
        C3403f4 c3403f4I = I();
        N(c3403f4I, 6, new C2911Yl(c3403f4I, i, 2));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EO
    public final void c(int i, C5186zO c5186zO, C3779jO c3779jO) {
        C3403f4 c3403f4L = L(i, c5186zO);
        N(c3403f4L, 1005, new C3903km(c3403f4L, c3779jO, 1));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3120bq
    public final void e(int i, C5186zO c5186zO) {
        C3403f4 c3403f4L = L(i, c5186zO);
        N(c3403f4L, 1023, new C3815jm(c3403f4L, 5));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3120bq
    public final void f(int i, C5186zO c5186zO) {
        C3403f4 c3403f4L = L(i, c5186zO);
        N(c3403f4L, 1027, new C3815jm(c3403f4L, 2));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JU
    public final void g(int i) {
        C3403f4 c3403f4I = I();
        N(c3403f4I, 4, new C2911Yl(c3403f4I, i, 0));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JU
    public final void h(C2469Hk c2469Hk) {
        C3403f4 c3403f4I = I();
        N(c3403f4I, 27, new C3285dk(6, c3403f4I, c2469Hk));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JU
    public final void i(Metadata metadata) {
        C3403f4 c3403f4I = I();
        N(c3403f4I, 28, new C3285dk(11, c3403f4I, metadata));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EO
    public final void j(int i, C5186zO c5186zO, final FI fi, final C3779jO c3779jO, final IOException iOException, final boolean z) {
        final C3403f4 c3403f4L = L(i, c5186zO);
        N(c3403f4L, PointerIconCompat.TYPE_HELP, new BI(c3403f4L, fi, c3779jO, iOException, z) { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Wl

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ C3779jO f3937a;

            {
                this.f3937a = c3779jO;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.BI
            public final void invoke(Object obj) {
                ((InterfaceC3579h4) obj).d(this.f3937a);
            }
        });
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JU
    public final void k(int i, boolean z) {
        C3403f4 c3403f4I = I();
        N(c3403f4I, 30, new C3289dm(i, c3403f4I, z));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JU
    public final void l(int i) {
        LU lu = this.g;
        lu.getClass();
        C4079mm c4079mm = this.d;
        c4079mm.d = C4079mm.b(lu, c4079mm.b, c4079mm.e, c4079mm.f4714a);
        c4079mm.d(((C2736Rs) lu).t());
        C3403f4 c3403f4I = I();
        N(c3403f4I, 0, new C2911Yl(c3403f4I, i, 3));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JU
    public final void m(C3955lO c3955lO) {
        C3403f4 c3403f4I = I();
        N(c3403f4I, 14, new C3285dk(3, c3403f4I, c3955lO));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JU
    public final void n(C2321Bs c2321Bs) {
        C4570sO c4570sO;
        C3403f4 c3403f4I = (!(c2321Bs instanceof C2321Bs) || (c4570sO = c2321Bs.m) == null) ? I() : J(new C5186zO(c4570sO));
        N(c3403f4I, 10, new C2885Xl(c3403f4I, c2321Bs, 0));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JU
    public final void o(boolean z) {
        C3403f4 c3403f4M = M();
        N(c3403f4M, 23, new C3553gm(3, c3403f4M, z));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JU
    public final void onCues(List list) {
        C3403f4 c3403f4I = I();
        N(c3403f4I, 27, new C3285dk(8, c3403f4I, list));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JU
    public final void onPlayerStateChanged(boolean z, int i) {
        C3403f4 c3403f4I = I();
        N(c3403f4I, -1, new C3289dm(c3403f4I, z, i, 1));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JU
    public final void onRepeatModeChanged(int i) {
        C3403f4 c3403f4I = I();
        N(c3403f4I, 8, new C2911Yl(c3403f4I, i, 1));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JU
    public final void onSeekProcessed() {
        C3403f4 c3403f4I = I();
        N(c3403f4I, -1, new C3815jm(c3403f4I, 1));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JU
    public final void onShuffleModeEnabledChanged(boolean z) {
        C3403f4 c3403f4I = I();
        N(c3403f4I, 9, new C3553gm(2, c3403f4I, z));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JU
    public final void p(HU hu) {
        C3403f4 c3403f4I = I();
        N(c3403f4I, 13, new C3285dk(7, c3403f4I, hu));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JU
    public final void q(int i, int i2) {
        C3403f4 c3403f4M = M();
        N(c3403f4M, 24, new C3991lm(i, i2, c3403f4M));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EO
    public final void r(int i, C5186zO c5186zO, FI fi, C3779jO c3779jO) {
        C3403f4 c3403f4L = L(i, c5186zO);
        N(c3403f4L, 1002, new C3465fm(c3403f4L, fi, c3779jO, 1));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EO
    public final void s(int i, C5186zO c5186zO, C3779jO c3779jO) {
        C3403f4 c3403f4L = L(i, c5186zO);
        N(c3403f4L, 1004, new C3903km(c3403f4L, c3779jO, 0));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JU
    public final void t(boolean z) {
        C3403f4 c3403f4I = I();
        N(c3403f4I, 3, new C3553gm(0, c3403f4I, z));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EO
    public final void u(int i, C5186zO c5186zO, FI fi, C3779jO c3779jO) {
        C3403f4 c3403f4L = L(i, c5186zO);
        N(c3403f4L, 1000, new C3465fm(c3403f4L, fi, c3779jO, 0));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JU
    public final void v(int i, boolean z) {
        C3403f4 c3403f4I = I();
        N(c3403f4I, 5, new C3289dm(c3403f4I, z, i, 0));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JU
    public final void w(EU eu) {
        C3403f4 c3403f4I = I();
        N(c3403f4I, 12, new C3285dk(4, c3403f4I, eu));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3120bq
    public final void x(int i, C5186zO c5186zO) {
        C3403f4 c3403f4L = L(i, c5186zO);
        N(c3403f4L, 1026, new C3815jm(c3403f4L, 3));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JU
    public final void y(final int i, final KU ku, final KU ku2) {
        if (i == 1) {
            this.i = false;
        }
        LU lu = this.g;
        lu.getClass();
        C4079mm c4079mm = this.d;
        c4079mm.d = C4079mm.b(lu, c4079mm.b, c4079mm.e, c4079mm.f4714a);
        final C3403f4 c3403f4I = I();
        N(c3403f4I, 11, new BI(i, ku, ku2, c3403f4I) { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.bm

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f4187a;

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.BI
            public final void invoke(Object obj) {
                InterfaceC3579h4 interfaceC3579h4 = (InterfaceC3579h4) obj;
                interfaceC3579h4.getClass();
                interfaceC3579h4.onPositionDiscontinuity(this.f4187a);
            }
        });
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EO
    public final void z(int i, C5186zO c5186zO, FI fi, C3779jO c3779jO) {
        C3403f4 c3403f4L = L(i, c5186zO);
        N(c3403f4L, 1001, new C3465fm(c3403f4L, fi, c3779jO, 2));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JU
    public final void onRenderedFirstFrame() {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JU
    public final void d(IU iu) {
    }
}
