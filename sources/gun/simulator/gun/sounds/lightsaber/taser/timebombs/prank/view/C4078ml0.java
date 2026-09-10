package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.WeaponUseActivity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.Weapon;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ml0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4078ml0 extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Zb0 f4713a;
    public int b;
    public final /* synthetic */ WeaponUseActivity c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4078ml0(WeaponUseActivity weaponUseActivity, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.c = weaponUseActivity;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        return new C4078ml0(this.c, interfaceC2857Wj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        return ((C4078ml0) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2)).invokeSuspend(C5033xf0.f5238a);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        Zb0 zb0;
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i = this.b;
        if (i == 0) {
            AbstractC3375el.b0(obj);
            Zb0 zb1 = WeaponUseActivity.n;
            ExecutorC4433qn executorC4433qn = AbstractC4437qp.b;
            C3990ll0 c3990ll0 = new C3990ll0(this.c, null);
            this.f4713a = zb1;
            this.b = 1;
            Object objX = WD.X(c3990ll0, executorC4433qn, this);
            if (objX == enumC4602sk) {
                return enumC4602sk;
            }
            zb0 = zb1;
            obj = objX;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zb0 = this.f4713a;
            AbstractC3375el.b0(obj);
        }
        zb0.getClass();
        WeaponUseActivity.o = (Weapon) obj;
        return C5033xf0.f5238a;
    }
}
