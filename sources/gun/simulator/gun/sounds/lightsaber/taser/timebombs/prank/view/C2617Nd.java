package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.Weapon;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Nd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2617Nd extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DialogC2799Ud f3464a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2617Nd(DialogC2799Ud dialogC2799Ud, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.f3464a = dialogC2799Ud;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        return new C2617Nd(this.f3464a, interfaceC2857Wj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        return ((C2617Nd) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2)).invokeSuspend(C5033xf0.f5238a);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        String name;
        AbstractC3375el.b0(obj);
        Weapon weapon = this.f3464a.b;
        if (weapon == null || (name = weapon.getName()) == null) {
            return null;
        }
        return AbstractC2871Wx.b0(name);
    }
}
