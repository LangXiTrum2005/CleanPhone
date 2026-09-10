package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.qX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4404qX extends Ea0 implements InterfaceC3567gx {
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        return new C4404qX(2, interfaceC2857Wj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        C4404qX c4404qX = (C4404qX) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2);
        C5033xf0 c5033xf0 = C5033xf0.f5238a;
        c4404qX.invokeSuspend(c5033xf0);
        return c5033xf0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        AbstractC3375el.b0(obj);
        C4755uX c4755uX = C4755uX.f5081a;
        C4755uX.b = ((Boolean) ((C2856Wi) AbstractC3194cj.l.getValue()).a()).booleanValue();
        C4755uX.d = ((Boolean) ((C2856Wi) AbstractC3194cj.j.getValue()).a()).booleanValue();
        C4755uX.e = ((Number) ((C2856Wi) AbstractC3194cj.h.getValue()).a()).intValue();
        C4755uX.f = ((Number) ((C2856Wi) AbstractC3194cj.i.getValue()).a()).longValue();
        return C5033xf0.f5238a;
    }
}
