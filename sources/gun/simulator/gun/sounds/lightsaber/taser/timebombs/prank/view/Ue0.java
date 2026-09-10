package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: loaded from: classes4.dex */
public final class Ue0 extends BV {
    public static final Ue0 c = new Ue0(Ve0.f3882a);

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3744j
    public final int d(Object obj) {
        int[] iArr = ((Se0) obj).f3725a;
        AbstractC2995aW.q(iArr, "$this$collectionSize");
        return iArr.length;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2671Pf, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3744j
    public final void f(InterfaceC4421qh interfaceC4421qh, int i, Object obj, boolean z) {
        Te0 te0 = (Te0) obj;
        AbstractC2995aW.q(te0, "builder");
        int iH = interfaceC4421qh.v(this.b, i).h();
        te0.b(te0.d() + 1);
        int[] iArr = te0.f3781a;
        int i2 = te0.b;
        te0.b = i2 + 1;
        iArr[i2] = iH;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3744j
    public final Object g(Object obj) {
        int[] iArr = ((Se0) obj).f3725a;
        AbstractC2995aW.q(iArr, "$this$toBuilder");
        Te0 te0 = new Te0();
        te0.f3781a = iArr;
        te0.b = iArr.length;
        te0.b(10);
        return te0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.BV
    public final Object j() {
        return new Se0(new int[0]);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.BV
    public final void k(InterfaceC4596sh interfaceC4596sh, Object obj, int i) {
        int[] iArr = ((Se0) obj).f3725a;
        AbstractC2995aW.q(interfaceC4596sh, "encoder");
        AbstractC2995aW.q(iArr, "content");
        for (int i2 = 0; i2 < i; i2++) {
            interfaceC4596sh.q(this.b, i2).D(iArr[i2]);
        }
    }
}
