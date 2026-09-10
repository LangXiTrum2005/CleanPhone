package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.jv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3827jv extends BV {
    public static final C3827jv c = new C3827jv(C4179nv.f4766a);

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3744j
    public final int d(Object obj) {
        float[] fArr = (float[]) obj;
        AbstractC2995aW.q(fArr, "<this>");
        return fArr.length;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2671Pf, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3744j
    public final void f(InterfaceC4421qh interfaceC4421qh, int i, Object obj, boolean z) {
        C3739iv c3739iv = (C3739iv) obj;
        AbstractC2995aW.q(c3739iv, "builder");
        float fM = interfaceC4421qh.m(this.b, i);
        c3739iv.b(c3739iv.d() + 1);
        float[] fArr = c3739iv.f4527a;
        int i2 = c3739iv.b;
        c3739iv.b = i2 + 1;
        fArr[i2] = fM;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3744j
    public final Object g(Object obj) {
        float[] fArr = (float[]) obj;
        AbstractC2995aW.q(fArr, "<this>");
        C3739iv c3739iv = new C3739iv();
        c3739iv.f4527a = fArr;
        c3739iv.b = fArr.length;
        c3739iv.b(10);
        return c3739iv;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.BV
    public final Object j() {
        return new float[0];
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.BV
    public final void k(InterfaceC4596sh interfaceC4596sh, Object obj, int i) {
        float[] fArr = (float[]) obj;
        AbstractC2995aW.q(interfaceC4596sh, "encoder");
        AbstractC2995aW.q(fArr, "content");
        for (int i2 = 0; i2 < i; i2++) {
            interfaceC4596sh.k(this.b, i2, fArr[i2]);
        }
    }
}
