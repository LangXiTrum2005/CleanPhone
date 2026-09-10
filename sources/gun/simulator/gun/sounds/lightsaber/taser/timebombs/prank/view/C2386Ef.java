package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.ArrayList;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ef, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2386Ef extends AbstractC3554gm0 {
    public final long l;
    public final long m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final ArrayList q;
    public final Fc0 r;
    public C2334Cf s;
    public C2360Df t;
    public long u;
    public long v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2386Ef(G9 g9, long j, long j2, boolean z, boolean z2, boolean z3) {
        super(g9);
        g9.getClass();
        FW.h(j >= 0);
        this.l = j;
        this.m = j2;
        this.n = z;
        this.o = z2;
        this.p = z3;
        this.q = new ArrayList();
        this.r = new Fc0();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3554gm0
    public final void B(Gc0 gc0) {
        if (this.t != null) {
            return;
        }
        D(gc0);
    }

    public final void D(Gc0 gc0) {
        long j;
        long j2;
        long j3;
        Fc0 fc0 = this.r;
        gc0.o(0, fc0);
        long j4 = fc0.q;
        C2334Cf c2334Cf = this.s;
        ArrayList arrayList = this.q;
        long j5 = this.m;
        if (c2334Cf == null || arrayList.isEmpty() || this.o) {
            boolean z = this.p;
            long j6 = this.l;
            if (z) {
                long j7 = fc0.m;
                j6 += j7;
                j = j7 + j5;
            } else {
                j = j5;
            }
            this.u = j4 + j6;
            this.v = j5 != Long.MIN_VALUE ? j4 + j : Long.MIN_VALUE;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C2308Bf c2308Bf = (C2308Bf) arrayList.get(i);
                long j8 = this.u;
                long j9 = this.v;
                c2308Bf.e = j8;
                c2308Bf.f = j9;
            }
            j2 = j6;
            j3 = j;
        } else {
            long j10 = this.u - j4;
            j3 = j5 != Long.MIN_VALUE ? this.v - j4 : Long.MIN_VALUE;
            j2 = j10;
        }
        try {
            C2334Cf c2334Cf2 = new C2334Cf(gc0, j2, j3);
            this.s = c2334Cf2;
            p(c2334Cf2);
        } catch (C2360Df e) {
            this.t = e;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((C2308Bf) arrayList.get(i2)).g = this.t;
            }
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.G9
    public final InterfaceC4395qO b(C5186zO c5186zO, C2833Vl c2833Vl, long j) {
        C2308Bf c2308Bf = new C2308Bf(this.k.b(c5186zO, c2833Vl, j), this.n, this.u, this.v);
        this.q.add(c2308Bf);
        return c2308Bf;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4860vh, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.G9
    public final void m() throws C2360Df {
        C2360Df c2360Df = this.t;
        if (c2360Df != null) {
            throw c2360Df;
        }
        super.m();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.G9
    public final void q(InterfaceC4395qO interfaceC4395qO) {
        ArrayList arrayList = this.q;
        FW.s(arrayList.remove(interfaceC4395qO));
        this.k.q(((C2308Bf) interfaceC4395qO).f2883a);
        if (!arrayList.isEmpty() || this.o) {
            return;
        }
        C2334Cf c2334Cf = this.s;
        c2334Cf.getClass();
        D(c2334Cf.e);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4860vh, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.G9
    public final void s() {
        super.s();
        this.t = null;
        this.s = null;
    }
}
