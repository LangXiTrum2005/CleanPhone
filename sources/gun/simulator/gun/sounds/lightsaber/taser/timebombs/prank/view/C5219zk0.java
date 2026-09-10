package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.zk0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C5219zk0 extends Ea0 implements InterfaceC3567gx {
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        return new C5219zk0(2, interfaceC2857Wj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        C5219zk0 c5219zk0 = (C5219zk0) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2);
        C5033xf0 c5033xf0 = C5033xf0.f5238a;
        c5219zk0.invokeSuspend(c5033xf0);
        return c5033xf0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC3375el.b0(obj);
        ((C2856Wi) AbstractC3194cj.n.getValue()).b(Boolean.TRUE);
        return C5033xf0.f5238a;
    }
}
