package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ae, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C3007ae extends AbstractC2929Zd {
    public final InterfaceC3567gx d;

    public C3007ae(InterfaceC3567gx interfaceC3567gx, InterfaceC3549gk interfaceC3549gk, int i, EnumC5024xb enumC5024xb) {
        super(interfaceC3549gk, i, enumC5024xb);
        this.d = interfaceC3567gx;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2929Zd
    public Object c(VV vv, InterfaceC2857Wj interfaceC2857Wj) {
        Object objInvoke = this.d.invoke(vv, interfaceC2857Wj);
        return objInvoke == EnumC4602sk.f4993a ? objInvoke : C5033xf0.f5238a;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2929Zd
    public AbstractC2929Zd d(InterfaceC3549gk interfaceC3549gk, int i, EnumC5024xb enumC5024xb) {
        return new C3007ae(this.d, interfaceC3549gk, i, enumC5024xb);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2929Zd
    public final String toString() {
        return "block[" + this.d + "] -> " + super.toString();
    }
}
