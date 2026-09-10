package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ef0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3364ef0 extends BV {
    public static final C3364ef0 c = new C3364ef0(C3452ff0.f4377a);

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3744j
    public final int d(Object obj) {
        short[] sArr = ((C3187cf0) obj).f4235a;
        AbstractC2995aW.q(sArr, "$this$collectionSize");
        return sArr.length;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2671Pf, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3744j
    public final void f(InterfaceC4421qh interfaceC4421qh, int i, Object obj, boolean z) {
        C3276df0 c3276df0 = (C3276df0) obj;
        AbstractC2995aW.q(c3276df0, "builder");
        short sO = interfaceC4421qh.v(this.b, i).o();
        c3276df0.b(c3276df0.d() + 1);
        short[] sArr = c3276df0.f4283a;
        int i2 = c3276df0.b;
        c3276df0.b = i2 + 1;
        sArr[i2] = sO;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3744j
    public final Object g(Object obj) {
        short[] sArr = ((C3187cf0) obj).f4235a;
        AbstractC2995aW.q(sArr, "$this$toBuilder");
        C3276df0 c3276df0 = new C3276df0();
        c3276df0.f4283a = sArr;
        c3276df0.b = sArr.length;
        c3276df0.b(10);
        return c3276df0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.BV
    public final Object j() {
        return new C3187cf0(new short[0]);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.BV
    public final void k(InterfaceC4596sh interfaceC4596sh, Object obj, int i) {
        short[] sArr = ((C3187cf0) obj).f4235a;
        AbstractC2995aW.q(interfaceC4596sh, "encoder");
        AbstractC2995aW.q(sArr, "content");
        for (int i2 = 0; i2 < i; i2++) {
            interfaceC4596sh.q(this.b, i2).v(sArr[i2]);
        }
    }
}
