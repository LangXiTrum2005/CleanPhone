package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.jb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3793jb extends BV {
    public static final C3793jb c = new C3793jb(C3969lb.f4651a);

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3744j
    public final int d(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        AbstractC2995aW.q(zArr, "<this>");
        return zArr.length;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2671Pf, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3744j
    public final void f(InterfaceC4421qh interfaceC4421qh, int i, Object obj, boolean z) {
        C3707ib c3707ib = (C3707ib) obj;
        AbstractC2995aW.q(c3707ib, "builder");
        boolean zA = interfaceC4421qh.A(this.b, i);
        c3707ib.b(c3707ib.d() + 1);
        boolean[] zArr = c3707ib.f4508a;
        int i2 = c3707ib.b;
        c3707ib.b = i2 + 1;
        zArr[i2] = zA;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3744j
    public final Object g(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        AbstractC2995aW.q(zArr, "<this>");
        C3707ib c3707ib = new C3707ib();
        c3707ib.f4508a = zArr;
        c3707ib.b = zArr.length;
        c3707ib.b(10);
        return c3707ib;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.BV
    public final Object j() {
        return new boolean[0];
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.BV
    public final void k(InterfaceC4596sh interfaceC4596sh, Object obj, int i) {
        boolean[] zArr = (boolean[]) obj;
        AbstractC2995aW.q(interfaceC4596sh, "encoder");
        AbstractC2995aW.q(zArr, "content");
        for (int i2 = 0; i2 < i; i2++) {
            interfaceC4596sh.C(this.b, i2, zArr[i2]);
        }
    }
}
