package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.WeaponSortActivity;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ua, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2796Ua extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3355eb f3825a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2796Ua(C3355eb c3355eb, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.f3825a = c3355eb;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        return new C2796Ua(this.f3825a, interfaceC2857Wj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        C2796Ua c2796Ua = (C2796Ua) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2);
        C5033xf0 c5033xf0 = C5033xf0.f5238a;
        c2796Ua.invokeSuspend(c5033xf0);
        return c5033xf0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC3375el.b0(obj);
        WeaponSortActivity.g = true;
        if (!((Boolean) AbstractC3194cj.c().a()).booleanValue()) {
            C3355eb c3355eb = this.f3825a;
            AbstractC2995aW.C(c3355eb.b.getAnalyticsName());
            AbstractC3194cj.c().b(Boolean.TRUE);
            c3355eb.i = true;
        }
        return C5033xf0.f5238a;
    }
}
