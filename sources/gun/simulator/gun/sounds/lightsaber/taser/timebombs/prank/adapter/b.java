package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.adapter;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.Weapon;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4437qp;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2627Nn;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3774jJ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5033xf0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ea0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4602sk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4514rk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.RL;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.TL;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WD;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2784a;
    public final /* synthetic */ Weapon b;
    public final /* synthetic */ RvGunDisplayAdapter.LightSaberViewHolder c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Weapon weapon, RvGunDisplayAdapter.LightSaberViewHolder lightSaberViewHolder, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.b = weapon;
        this.c = lightSaberViewHolder;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        return new b(this.b, this.c, interfaceC2857Wj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2)).invokeSuspend(C5033xf0.f5238a);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i = this.f2784a;
        if (i != 0) {
            if (i == 1) {
                AbstractC3375el.b0(obj);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC3375el.b0(obj);
            }
            return C5033xf0.f5238a;
        }
        AbstractC3375el.b0(obj);
        this.f2784a = 1;
        obj = WD.X(new C3774jJ(this.b, null), AbstractC4437qp.b, this);
        if (obj == enumC4602sk) {
            return enumC4602sk;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        C2627Nn c2627Nn = AbstractC4437qp.f4904a;
        RL rl = TL.f3768a;
        a aVar = new a(this.c, zBooleanValue, null);
        this.f2784a = 2;
        if (WD.X(aVar, rl, this) == enumC4602sk) {
            return enumC4602sk;
        }
        return C5033xf0.f5238a;
    }
}
