package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.MainActivity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.base.BaseRvAdapter;

/* JADX INFO: loaded from: classes4.dex */
public final class KL extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MainActivity f3312a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KL(MainActivity mainActivity, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.f3312a = mainActivity;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        return new KL(this.f3312a, interfaceC2857Wj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        return ((KL) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2)).invokeSuspend(C5033xf0.f5238a);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        AbstractC3375el.b0(obj);
        BaseRvAdapter baseRvAdapter = this.f3312a.d;
        if (baseRvAdapter == null) {
            return null;
        }
        baseRvAdapter.d(1, "BasicViewHolder_UpdateView");
        return C5033xf0.f5238a;
    }
}
