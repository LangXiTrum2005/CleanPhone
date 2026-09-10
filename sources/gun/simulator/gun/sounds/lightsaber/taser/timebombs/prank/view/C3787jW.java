package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.net.Uri;
import android.os.Looper;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.jW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3787jW extends G9 {
    public final C3693iO h;
    public final C3341eO i;
    public final InterfaceC4341pl j;
    public final Md0 k;
    public final InterfaceC3296dq l;
    public final G7 m;
    public final int n;
    public boolean o;
    public long p;
    public boolean q;
    public boolean r;
    public Bd0 s;

    public C3787jW(C3693iO c3693iO, InterfaceC4341pl interfaceC4341pl, Md0 md0, InterfaceC3296dq interfaceC3296dq, G7 g7, int i) {
        C3341eO c3341eO = c3693iO.b;
        c3341eO.getClass();
        this.i = c3341eO;
        this.h = c3693iO;
        this.j = interfaceC4341pl;
        this.k = md0;
        this.l = interfaceC3296dq;
        this.m = g7;
        this.n = i;
        this.o = true;
        this.p = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.G9
    public final InterfaceC4395qO b(C5186zO c5186zO, C2833Vl c2833Vl, long j) {
        InterfaceC4429ql interfaceC4429qlCreateDataSource = this.j.createDataSource();
        Bd0 bd0 = this.s;
        if (bd0 != null) {
            interfaceC4429qlCreateDataSource.c(bd0);
        }
        C3341eO c3341eO = this.i;
        Uri uri = c3341eO.f4269a;
        FW.t(this.g);
        return new C3525gW(uri, interfaceC4429qlCreateDataSource, new C4568sM((InterfaceC4441qt) this.k.b), this.l, new C3031aq(this.d.c, 0, c5186zO), this.m, a(c5186zO), this, c2833Vl, c3341eO.e, this.n);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.G9
    public final C3693iO k() {
        return this.h;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.G9
    public final void o(Bd0 bd0) {
        this.s = bd0;
        InterfaceC3296dq interfaceC3296dq = this.l;
        interfaceC3296dq.prepare();
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        WU wu = this.g;
        FW.t(wu);
        interfaceC3296dq.f(looperMyLooper, wu);
        v();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.G9
    public final void q(InterfaceC4395qO interfaceC4395qO) {
        C3525gW c3525gW = (C3525gW) interfaceC4395qO;
        if (c3525gW.v) {
            for (V20 v20 : c3525gW.s) {
                v20.i();
                InterfaceC2889Xp interfaceC2889Xp = v20.h;
                if (interfaceC2889Xp != null) {
                    interfaceC2889Xp.b(v20.e);
                    v20.h = null;
                    v20.g = null;
                }
            }
        }
        c3525gW.k.e(c3525gW);
        c3525gW.p.removeCallbacksAndMessages(null);
        c3525gW.q = null;
        c3525gW.L = true;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.G9
    public final void s() {
        this.l.release();
    }

    public final void v() {
        S60 s60 = new S60(this.p, this.q, this.r, this.h);
        Gc0 c3613hW = s60;
        if (this.o) {
            c3613hW = new C3613hW(s60, 0);
        }
        p(c3613hW);
    }

    public final void w(long j, boolean z, boolean z2) {
        if (j == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
            j = this.p;
        }
        if (!this.o && this.p == j && this.q == z && this.r == z2) {
            return;
        }
        this.p = j;
        this.q = z;
        this.r = z2;
        this.o = false;
        v();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.G9
    public final void m() {
    }
}
