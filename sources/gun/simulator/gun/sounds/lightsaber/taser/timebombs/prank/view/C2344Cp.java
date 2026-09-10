package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Cp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2344Cp extends BV {
    public static final C2344Cp c = new C2344Cp(C2396Ep.f3041a);

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3744j
    public final int d(Object obj) {
        double[] dArr = (double[]) obj;
        AbstractC2995aW.q(dArr, "<this>");
        return dArr.length;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2671Pf, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3744j
    public final void f(InterfaceC4421qh interfaceC4421qh, int i, Object obj, boolean z) {
        C2318Bp c2318Bp = (C2318Bp) obj;
        AbstractC2995aW.q(c2318Bp, "builder");
        double dN = interfaceC4421qh.n(this.b, i);
        c2318Bp.b(c2318Bp.d() + 1);
        double[] dArr = c2318Bp.f2894a;
        int i2 = c2318Bp.b;
        c2318Bp.b = i2 + 1;
        dArr[i2] = dN;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3744j
    public final Object g(Object obj) {
        double[] dArr = (double[]) obj;
        AbstractC2995aW.q(dArr, "<this>");
        C2318Bp c2318Bp = new C2318Bp();
        c2318Bp.f2894a = dArr;
        c2318Bp.b = dArr.length;
        c2318Bp.b(10);
        return c2318Bp;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.BV
    public final Object j() {
        return new double[0];
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.BV
    public final void k(InterfaceC4596sh interfaceC4596sh, Object obj, int i) {
        double[] dArr = (double[]) obj;
        AbstractC2995aW.q(interfaceC4596sh, "encoder");
        AbstractC2995aW.q(dArr, "content");
        for (int i2 = 0; i2 < i; i2++) {
            interfaceC4596sh.u(this.b, i2, dArr[i2]);
        }
    }
}
