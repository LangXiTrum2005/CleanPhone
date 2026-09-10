package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.WeaponSortActivity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.Weapon;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.sk0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4603sk0 extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4994a;
    public final /* synthetic */ Weapon b;
    public final /* synthetic */ WeaponSortActivity c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4603sk0(WeaponSortActivity weaponSortActivity, Weapon weapon, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.b = weapon;
        this.c = weaponSortActivity;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        return new C4603sk0(this.c, this.b, interfaceC2857Wj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        return ((C4603sk0) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2)).invokeSuspend(C5033xf0.f5238a);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i = this.f4994a;
        C5033xf0 c5033xf0 = C5033xf0.f5238a;
        if (i != 0) {
            if (i == 1) {
                AbstractC3375el.b0(obj);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC3375el.b0(obj);
            }
        }
        AbstractC3375el.b0(obj);
        this.f4994a = 1;
        AbstractC3862kJ.b(this.b);
        if (c5033xf0 == enumC4602sk) {
            return enumC4602sk;
        }
        C2627Nn c2627Nn = AbstractC4437qp.f4904a;
        RL rl = TL.f3768a;
        C4515rk0 c4515rk0 = new C4515rk0(this.c, null);
        this.f4994a = 2;
        return WD.X(c4515rk0, rl, this) == enumC4602sk ? enumC4602sk : c5033xf0;
    }
}
