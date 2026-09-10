package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.MainActivity;

/* JADX INFO: loaded from: classes4.dex */
public final class ML extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MainActivity f3402a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ML(MainActivity mainActivity, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.f3402a = mainActivity;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        return new ML(this.f3402a, interfaceC2857Wj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        ML ml = (ML) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2);
        C5033xf0 c5033xf0 = C5033xf0.f5238a;
        ml.invokeSuspend(c5033xf0);
        return c5033xf0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        AbstractC3375el.b0(obj);
        S3.b("rate_pop_display", "start," + C4755uX.e);
        int i = C4755uX.e;
        MainActivity mainActivity = this.f3402a;
        if (i <= 3) {
            ((DialogC4476rI) mainActivity.i.getValue()).show();
        } else {
            DialogC4228oX dialogC4228oX = new DialogC4228oX(mainActivity, mainActivity, mainActivity, false);
            mainActivity.getClass();
            dialogC4228oX.show();
        }
        return C5033xf0.f5238a;
    }
}
