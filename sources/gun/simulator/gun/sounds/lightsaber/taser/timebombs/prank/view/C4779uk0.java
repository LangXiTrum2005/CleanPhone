package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.LightSaber;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.MechanicalGun;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.Weapon;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.uk0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4779uk0 extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5097a;
    public final /* synthetic */ Weapon b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4779uk0(Weapon weapon, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.b = weapon;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        return new C4779uk0(this.b, interfaceC2857Wj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        return ((C4779uk0) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2)).invokeSuspend(C5033xf0.f5238a);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i = this.f5097a;
        if (i == 0) {
            AbstractC3375el.b0(obj);
            Weapon weapon = this.b;
            if (weapon instanceof MechanicalGun) {
                String strB0 = AbstractC2871Wx.b0(weapon.getName());
                AbstractC2995aW.q(strB0, "<set-?>");
                AbstractC2871Wx.i = strB0;
            } else if (weapon instanceof LightSaber) {
                String strZ = AbstractC2340Cl.z(weapon.getName());
                AbstractC2995aW.q(strZ, "<set-?>");
                AbstractC2871Wx.j = strZ;
            }
            this.f5097a = 1;
            obj = WD.X(new C3774jJ(weapon, null), AbstractC4437qp.b, this);
            if (obj == enumC4602sk) {
                return enumC4602sk;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC3375el.b0(obj);
        }
        return obj;
    }
}
