package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: loaded from: classes4.dex */
public final class Ze0 extends BV {
    public static final Ze0 c = new Ze0(C3010af0.f4133a);

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3744j
    public final int d(Object obj) {
        long[] jArr = ((Xe0) obj).f3984a;
        AbstractC2995aW.q(jArr, "$this$collectionSize");
        return jArr.length;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2671Pf, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3744j
    public final void f(InterfaceC4421qh interfaceC4421qh, int i, Object obj, boolean z) {
        Ye0 ye0 = (Ye0) obj;
        AbstractC2995aW.q(ye0, "builder");
        long jI = interfaceC4421qh.v(this.b, i).i();
        ye0.b(ye0.d() + 1);
        long[] jArr = ye0.f4030a;
        int i2 = ye0.b;
        ye0.b = i2 + 1;
        jArr[i2] = jI;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3744j
    public final Object g(Object obj) {
        long[] jArr = ((Xe0) obj).f3984a;
        AbstractC2995aW.q(jArr, "$this$toBuilder");
        Ye0 ye0 = new Ye0();
        ye0.f4030a = jArr;
        ye0.b = jArr.length;
        ye0.b(10);
        return ye0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.BV
    public final Object j() {
        return new Xe0(new long[0]);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.BV
    public final void k(InterfaceC4596sh interfaceC4596sh, Object obj, int i) {
        long[] jArr = ((Xe0) obj).f3984a;
        AbstractC2995aW.q(interfaceC4596sh, "encoder");
        AbstractC2995aW.q(jArr, "content");
        for (int i2 = 0; i2 < i; i2++) {
            interfaceC4596sh.q(this.b, i2).s(jArr[i2]);
        }
    }
}
