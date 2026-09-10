package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.zJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C5181zJ extends BV {
    public static final C5181zJ c = new C5181zJ(FJ.f3064a);

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3744j
    public final int d(Object obj) {
        long[] jArr = (long[]) obj;
        AbstractC2995aW.q(jArr, "<this>");
        return jArr.length;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2671Pf, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3744j
    public final void f(InterfaceC4421qh interfaceC4421qh, int i, Object obj, boolean z) {
        C5093yJ c5093yJ = (C5093yJ) obj;
        AbstractC2995aW.q(c5093yJ, "builder");
        long jW = interfaceC4421qh.w(this.b, i);
        c5093yJ.b(c5093yJ.d() + 1);
        long[] jArr = c5093yJ.f5271a;
        int i2 = c5093yJ.b;
        c5093yJ.b = i2 + 1;
        jArr[i2] = jW;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3744j
    public final Object g(Object obj) {
        long[] jArr = (long[]) obj;
        AbstractC2995aW.q(jArr, "<this>");
        C5093yJ c5093yJ = new C5093yJ();
        c5093yJ.f5271a = jArr;
        c5093yJ.b = jArr.length;
        c5093yJ.b(10);
        return c5093yJ;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.BV
    public final Object j() {
        return new long[0];
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.BV
    public final void k(InterfaceC4596sh interfaceC4596sh, Object obj, int i) {
        long[] jArr = (long[]) obj;
        AbstractC2995aW.q(interfaceC4596sh, "encoder");
        AbstractC2995aW.q(jArr, "content");
        for (int i2 = 0; i2 < i; i2++) {
            interfaceC4596sh.l(this.b, i2, jArr[i2]);
        }
    }
}
