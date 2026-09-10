package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Tb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2771Tb extends BV {
    public static final C2771Tb c = new C2771Tb(C3269dc.f4277a);

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3744j
    public final int d(Object obj) {
        byte[] bArr = (byte[]) obj;
        AbstractC2995aW.q(bArr, "<this>");
        return bArr.length;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2671Pf, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3744j
    public final void f(InterfaceC4421qh interfaceC4421qh, int i, Object obj, boolean z) {
        C2667Pb c2667Pb = (C2667Pb) obj;
        AbstractC2995aW.q(c2667Pb, "builder");
        byte bX = interfaceC4421qh.x(this.b, i);
        c2667Pb.b(c2667Pb.d() + 1);
        byte[] bArr = c2667Pb.f3558a;
        int i2 = c2667Pb.b;
        c2667Pb.b = i2 + 1;
        bArr[i2] = bX;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3744j
    public final Object g(Object obj) {
        byte[] bArr = (byte[]) obj;
        AbstractC2995aW.q(bArr, "<this>");
        C2667Pb c2667Pb = new C2667Pb();
        c2667Pb.f3558a = bArr;
        c2667Pb.b = bArr.length;
        c2667Pb.b(10);
        return c2667Pb;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.BV
    public final Object j() {
        return new byte[0];
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.BV
    public final void k(InterfaceC4596sh interfaceC4596sh, Object obj, int i) {
        byte[] bArr = (byte[]) obj;
        AbstractC2995aW.q(interfaceC4596sh, "encoder");
        AbstractC2995aW.q(bArr, "content");
        for (int i2 = 0; i2 < i; i2++) {
            interfaceC4596sh.E(this.b, i2, bArr[i2]);
        }
    }
}
