package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.App;

/* JADX INFO: loaded from: classes4.dex */
public final class Ek0 extends Ea0 implements InterfaceC3567gx {
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        return new Ek0(2, interfaceC2857Wj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        Ek0 ek0 = (Ek0) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2);
        C5033xf0 c5033xf0 = C5033xf0.f5238a;
        ek0.invokeSuspend(c5033xf0);
        return c5033xf0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        AbstractC3375el.b0(obj);
        if (((Boolean) AbstractC3459fj.a().a()).booleanValue()) {
            App.t = 0;
            App.u = 0;
            App.v = 0;
            App.w = 0;
            App.x = 0;
        } else {
            App.t = 3;
            App.u = 3;
            App.v = 3;
            App.w = 3;
            App.x = 3;
        }
        return C5033xf0.f5238a;
    }
}
