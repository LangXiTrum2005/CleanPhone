package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.WeaponSortActivity;

/* JADX INFO: loaded from: classes4.dex */
public final class Za0 extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3794jb0 f4076a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Za0(C3794jb0 c3794jb0, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.f4076a = c3794jb0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        return new Za0(this.f4076a, interfaceC2857Wj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        Za0 za0 = (Za0) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2);
        C5033xf0 c5033xf0 = C5033xf0.f5238a;
        za0.invokeSuspend(c5033xf0);
        return c5033xf0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC3375el.b0(obj);
        WeaponSortActivity.g = true;
        if (!((Boolean) AbstractC3194cj.c().a()).booleanValue()) {
            AbstractC2995aW.C(this.f4076a.b.getAnalyticsName());
            AbstractC3194cj.c().b(Boolean.TRUE);
        }
        return C5033xf0.f5238a;
    }
}
