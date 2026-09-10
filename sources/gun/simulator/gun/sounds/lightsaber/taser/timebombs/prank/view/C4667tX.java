package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.tX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4667tX extends Ea0 implements InterfaceC3567gx {
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        return new C4667tX(2, interfaceC2857Wj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        return ((C4667tX) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2)).invokeSuspend(C5033xf0.f5238a);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC3375el.b0(obj);
        ((C2856Wi) AbstractC3194cj.i.getValue()).b(new Long(C4755uX.g));
        C2856Wi c2856Wi = (C2856Wi) AbstractC3194cj.h.getValue();
        int iIntValue = ((Number) c2856Wi.a()).intValue();
        c2856Wi.b(new Integer(iIntValue + 1));
        return new Integer(iIntValue);
    }
}
