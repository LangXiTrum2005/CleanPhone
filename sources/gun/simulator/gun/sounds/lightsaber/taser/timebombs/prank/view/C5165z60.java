package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.z60, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C5165z60 extends BV {
    public static final C5165z60 c = new C5165z60(A60.f2801a);

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3744j
    public final int d(Object obj) {
        short[] sArr = (short[]) obj;
        AbstractC2995aW.q(sArr, "<this>");
        return sArr.length;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2671Pf, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3744j
    public final void f(InterfaceC4421qh interfaceC4421qh, int i, Object obj, boolean z) {
        C5077y60 c5077y60 = (C5077y60) obj;
        AbstractC2995aW.q(c5077y60, "builder");
        short sE = interfaceC4421qh.e(this.b, i);
        c5077y60.b(c5077y60.d() + 1);
        short[] sArr = c5077y60.f5261a;
        int i2 = c5077y60.b;
        c5077y60.b = i2 + 1;
        sArr[i2] = sE;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3744j
    public final Object g(Object obj) {
        short[] sArr = (short[]) obj;
        AbstractC2995aW.q(sArr, "<this>");
        C5077y60 c5077y60 = new C5077y60();
        c5077y60.f5261a = sArr;
        c5077y60.b = sArr.length;
        c5077y60.b(10);
        return c5077y60;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.BV
    public final Object j() {
        return new short[0];
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.BV
    public final void k(InterfaceC4596sh interfaceC4596sh, Object obj, int i) {
        short[] sArr = (short[]) obj;
        AbstractC2995aW.q(interfaceC4596sh, "encoder");
        AbstractC2995aW.q(sArr, "content");
        for (int i2 = 0; i2 < i; i2++) {
            interfaceC4596sh.n(this.b, i2, sArr[i2]);
        }
    }
}
