package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.WeaponSortActivity;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.yk0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C5131yk0 extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5294a;
    public final /* synthetic */ WeaponSortActivity b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5131yk0(WeaponSortActivity weaponSortActivity, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.b = weaponSortActivity;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        return new C5131yk0(this.b, interfaceC2857Wj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        return ((C5131yk0) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2)).invokeSuspend(C5033xf0.f5238a);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i = this.f5294a;
        if (i == 0) {
            AbstractC3375el.b0(obj);
            C4755uX c4755uX = C4755uX.f5081a;
            this.f5294a = 1;
            obj = c4755uX.a(this);
            if (obj == enumC4602sk) {
                return enumC4602sk;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC3375el.b0(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            int i2 = C4755uX.e;
            WeaponSortActivity weaponSortActivity = this.b;
            if (i2 <= 3) {
                boolean z = WeaponSortActivity.g;
                ((DialogC4476rI) weaponSortActivity.e.getValue()).show();
            } else {
                boolean z2 = WeaponSortActivity.g;
                ((DialogC4228oX) weaponSortActivity.f.getValue()).show();
            }
            WeaponSortActivity.g = false;
        }
        WeaponSortActivity.h = false;
        return C5033xf0.f5238a;
    }
}
