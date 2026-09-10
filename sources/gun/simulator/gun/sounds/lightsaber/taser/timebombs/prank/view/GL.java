package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.MainActivity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.Weapon;

/* JADX INFO: loaded from: classes4.dex */
public final class GL extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MainActivity f3117a;
    public final /* synthetic */ Weapon b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GL(MainActivity mainActivity, Weapon weapon, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.f3117a = mainActivity;
        this.b = weapon;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        return new GL(this.f3117a, this.b, interfaceC2857Wj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        GL gl = (GL) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2);
        C5033xf0 c5033xf0 = C5033xf0.f5238a;
        gl.invokeSuspend(c5033xf0);
        return c5033xf0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        AbstractC3375el.b0(obj);
        MainActivity mainActivity = this.f3117a;
        Weapon weapon = this.b;
        DialogC5143ys dialogC5143ys = new DialogC5143ys(mainActivity, weapon, 0);
        C4479rL c4479rL = new C4479rL(mainActivity, weapon, 1);
        EL el = new EL(mainActivity, 1);
        switch (dialogC5143ys.b) {
            case 0:
                dialogC5143ys.d = new C5055xs(c4479rL, el, null, 0);
                break;
            default:
                dialogC5143ys.d = new C5055xs(c4479rL, el, null, 2);
                break;
        }
        dialogC5143ys.show();
        return C5033xf0.f5238a;
    }
}
