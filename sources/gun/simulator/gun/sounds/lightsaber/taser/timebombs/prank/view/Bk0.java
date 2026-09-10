package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.efs.sdk.base.core.util.NetworkUtil;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.WeaponSortActivity;

/* JADX INFO: loaded from: classes4.dex */
public final class Bk0 extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2889a;
    public final /* synthetic */ WeaponSortActivity b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Bk0(WeaponSortActivity weaponSortActivity, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.b = weaponSortActivity;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        return new Bk0(this.b, interfaceC2857Wj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        return ((Bk0) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2)).invokeSuspend(C5033xf0.f5238a);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i = this.f2889a;
        if (i == 0) {
            AbstractC3375el.b0(obj);
            WeaponSortActivity weaponSortActivity = this.b;
            if (!NetworkUtil.isConnected(weaponSortActivity)) {
                C2627Nn c2627Nn = AbstractC4437qp.f4904a;
                RL rl = TL.f3768a;
                Ak0 ak0 = new Ak0(weaponSortActivity, null);
                this.f2889a = 1;
                if (WD.X(ak0, rl, this) == enumC4602sk) {
                    return enumC4602sk;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC3375el.b0(obj);
        }
        return C5033xf0.f5238a;
    }
}
