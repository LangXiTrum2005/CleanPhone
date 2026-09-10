package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.adapter;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.databinding.ItemRvGunDisplayBinding;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5033xf0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ea0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4514rk;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f2785a;
    public final /* synthetic */ RvGunDisplayAdapter.ViewHolder b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(boolean z, RvGunDisplayAdapter.ViewHolder viewHolder, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.f2785a = z;
        this.b = viewHolder;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        return new c(this.f2785a, this.b, interfaceC2857Wj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        c cVar = (c) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2);
        C5033xf0 c5033xf0 = C5033xf0.f5238a;
        cVar.invokeSuspend(c5033xf0);
        return c5033xf0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        AbstractC3375el.b0(obj);
        boolean z = this.f2785a;
        RvGunDisplayAdapter.ViewHolder viewHolder = this.b;
        if (z) {
            ((ItemRvGunDisplayBinding) viewHolder.b).groupLock.setVisibility(0);
        } else {
            ((ItemRvGunDisplayBinding) viewHolder.b).groupLock.setVisibility(8);
        }
        return C5033xf0.f5238a;
    }
}
