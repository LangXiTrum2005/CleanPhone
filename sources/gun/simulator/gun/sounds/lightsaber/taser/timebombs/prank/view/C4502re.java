package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.re, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4502re extends BV {
    public static final C4502re c = new C4502re(C2281Ae.f2824a);

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3744j
    public final int d(Object obj) {
        char[] cArr = (char[]) obj;
        AbstractC2995aW.q(cArr, "<this>");
        return cArr.length;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2671Pf, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3744j
    public final void f(InterfaceC4421qh interfaceC4421qh, int i, Object obj, boolean z) {
        C4327pe c4327pe = (C4327pe) obj;
        AbstractC2995aW.q(c4327pe, "builder");
        char cT = interfaceC4421qh.t(this.b, i);
        c4327pe.b(c4327pe.d() + 1);
        char[] cArr = c4327pe.f4842a;
        int i2 = c4327pe.b;
        c4327pe.b = i2 + 1;
        cArr[i2] = cT;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3744j
    public final Object g(Object obj) {
        char[] cArr = (char[]) obj;
        AbstractC2995aW.q(cArr, "<this>");
        C4327pe c4327pe = new C4327pe();
        c4327pe.f4842a = cArr;
        c4327pe.b = cArr.length;
        c4327pe.b(10);
        return c4327pe;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.BV
    public final Object j() {
        return new char[0];
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.BV
    public final void k(InterfaceC4596sh interfaceC4596sh, Object obj, int i) {
        char[] cArr = (char[]) obj;
        AbstractC2995aW.q(interfaceC4596sh, "encoder");
        AbstractC2995aW.q(cArr, "content");
        for (int i2 = 0; i2 < i; i2++) {
            interfaceC4596sh.h(this.b, i2, cArr[i2]);
        }
    }
}
