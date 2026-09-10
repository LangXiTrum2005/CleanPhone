package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.uD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4735uD extends BV {
    public static final C4735uD c = new C4735uD(AD.f2808a);

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3744j
    public final int d(Object obj) {
        int[] iArr = (int[]) obj;
        AbstractC2995aW.q(iArr, "<this>");
        return iArr.length;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2671Pf, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3744j
    public final void f(InterfaceC4421qh interfaceC4421qh, int i, Object obj, boolean z) {
        C4647tD c4647tD = (C4647tD) obj;
        AbstractC2995aW.q(c4647tD, "builder");
        int iD = interfaceC4421qh.D(this.b, i);
        c4647tD.b(c4647tD.d() + 1);
        int[] iArr = c4647tD.f5025a;
        int i2 = c4647tD.b;
        c4647tD.b = i2 + 1;
        iArr[i2] = iD;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3744j
    public final Object g(Object obj) {
        int[] iArr = (int[]) obj;
        AbstractC2995aW.q(iArr, "<this>");
        C4647tD c4647tD = new C4647tD();
        c4647tD.f5025a = iArr;
        c4647tD.b = iArr.length;
        c4647tD.b(10);
        return c4647tD;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.BV
    public final Object j() {
        return new int[0];
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.BV
    public final void k(InterfaceC4596sh interfaceC4596sh, Object obj, int i) {
        int[] iArr = (int[]) obj;
        AbstractC2995aW.q(interfaceC4596sh, "encoder");
        AbstractC2995aW.q(iArr, "content");
        for (int i2 = 0; i2 < i; i2++) {
            interfaceC4596sh.g(i2, iArr[i2], this.b);
        }
    }
}
