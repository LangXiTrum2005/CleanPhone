package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.App;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.t5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4634t5 extends Ea0 implements InterfaceC3567gx {
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        return new C4634t5(2, interfaceC2857Wj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        C4634t5 c4634t5 = (C4634t5) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2);
        C5033xf0 c5033xf0 = C5033xf0.f5238a;
        c4634t5.invokeSuspend(c5033xf0);
        return c5033xf0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        AbstractC3375el.b0(obj);
        C2498In c2498In = App.n;
        App.t = ((Boolean) AbstractC3459fj.a().a()).booleanValue() ? 0 : 3;
        App.u = ((Boolean) AbstractC3459fj.a().a()).booleanValue() ? 0 : 3;
        App.v = ((Boolean) AbstractC3459fj.a().a()).booleanValue() ? 0 : 3;
        App.w = ((Boolean) AbstractC3459fj.a().a()).booleanValue() ? 0 : 3;
        App.x = ((Boolean) AbstractC3459fj.a().a()).booleanValue() ? 0 : 3;
        return C5033xf0.f5238a;
    }
}
