package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: loaded from: classes4.dex */
public final class Pe0 extends BV {
    public static final Pe0 c = new Pe0(Qe0.f3612a);

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3744j
    public final int d(Object obj) {
        byte[] bArr = ((Ne0) obj).f3466a;
        AbstractC2995aW.q(bArr, "$this$collectionSize");
        return bArr.length;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2671Pf, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3744j
    public final void f(InterfaceC4421qh interfaceC4421qh, int i, Object obj, boolean z) {
        Oe0 oe0 = (Oe0) obj;
        AbstractC2995aW.q(oe0, "builder");
        byte bE = interfaceC4421qh.v(this.b, i).E();
        oe0.b(oe0.d() + 1);
        byte[] bArr = oe0.f3512a;
        int i2 = oe0.b;
        oe0.b = i2 + 1;
        bArr[i2] = bE;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3744j
    public final Object g(Object obj) {
        byte[] bArr = ((Ne0) obj).f3466a;
        AbstractC2995aW.q(bArr, "$this$toBuilder");
        Oe0 oe0 = new Oe0();
        oe0.f3512a = bArr;
        oe0.b = bArr.length;
        oe0.b(10);
        return oe0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.BV
    public final Object j() {
        return new Ne0(new byte[0]);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.BV
    public final void k(InterfaceC4596sh interfaceC4596sh, Object obj, int i) {
        byte[] bArr = ((Ne0) obj).f3466a;
        AbstractC2995aW.q(interfaceC4596sh, "encoder");
        AbstractC2995aW.q(bArr, "content");
        for (int i2 = 0; i2 < i; i2++) {
            interfaceC4596sh.q(this.b, i2).f(bArr[i2]);
        }
    }
}
