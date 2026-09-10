package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.he, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3625he extends AbstractC3184ce {
    public final InterfaceC3655hx e;

    public C3625he(InterfaceC3655hx interfaceC3655hx, InterfaceC4443qv interfaceC4443qv, InterfaceC3549gk interfaceC3549gk, int i, EnumC5024xb enumC5024xb) {
        super(i, interfaceC3549gk, enumC5024xb, interfaceC4443qv);
        this.e = interfaceC3655hx;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2929Zd
    public final AbstractC2929Zd d(InterfaceC3549gk interfaceC3549gk, int i, EnumC5024xb enumC5024xb) {
        return new C3625he(this.e, this.d, interfaceC3549gk, i, enumC5024xb);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3184ce
    public final Object g(InterfaceC4530rv interfaceC4530rv, InterfaceC2857Wj interfaceC2857Wj) {
        Object objM = WD.m(new C3537ge(this, interfaceC4530rv, null), interfaceC2857Wj);
        return objM == EnumC4602sk.f4993a ? objM : C5033xf0.f5238a;
    }
}
