package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.p80, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4290p80 extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C5081y80 f4825a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4290p80(C5081y80 c5081y80, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.f4825a = c5081y80;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        return new C4290p80(this.f4825a, interfaceC2857Wj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        C4290p80 c4290p80 = (C4290p80) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2);
        C5033xf0 c5033xf0 = C5033xf0.f5238a;
        c4290p80.invokeSuspend(c5033xf0);
        return c5033xf0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC3375el.b0(obj);
        if (!((Boolean) AbstractC3194cj.c().a()).booleanValue()) {
            AbstractC2995aW.C(this.f4825a.b.getAnalyticsName());
            AbstractC3194cj.c().b(Boolean.TRUE);
        }
        return C5033xf0.f5238a;
    }
}
