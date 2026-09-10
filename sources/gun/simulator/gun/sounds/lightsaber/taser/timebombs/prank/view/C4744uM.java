package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.uM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4744uM extends AbstractC4971ww {
    public static final Object h = new Object();
    public final Object f;
    public final Object g;

    public C4744uM(Gc0 gc0, Object obj, Object obj2) {
        super(gc0);
        this.f = obj;
        this.g = obj2;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4971ww, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Gc0
    public final int b(Object obj) {
        Object obj2;
        if (h.equals(obj) && (obj2 = this.g) != null) {
            obj = obj2;
        }
        return this.e.b(obj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4971ww, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Gc0
    public final Ec0 g(int i, Ec0 ec0, boolean z) {
        this.e.g(i, ec0, z);
        if (Ug0.a(ec0.b, this.g) && z) {
            ec0.b = h;
        }
        return ec0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4971ww, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Gc0
    public final Object m(int i) {
        Object objM = this.e.m(i);
        return Ug0.a(objM, this.g) ? h : objM;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4971ww, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Gc0
    public final Fc0 n(int i, Fc0 fc0, long j) {
        this.e.n(i, fc0, j);
        if (Ug0.a(fc0.f3074a, this.f)) {
            fc0.f3074a = Fc0.r;
        }
        return fc0;
    }
}
