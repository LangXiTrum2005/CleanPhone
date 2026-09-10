package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import androidx.constraintlayout.widget.ConstraintLayout;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.WeaponUseActivity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.databinding.LayoutWeaponActivityActionBinding;

/* JADX INFO: loaded from: classes4.dex */
public final class Uj0 extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3838a;
    public final /* synthetic */ LayoutWeaponActivityActionBinding b;
    public final /* synthetic */ C3109bk0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Uj0(LayoutWeaponActivityActionBinding layoutWeaponActivityActionBinding, C3109bk0 c3109bk0, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.b = layoutWeaponActivityActionBinding;
        this.c = c3109bk0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        return new Uj0(this.b, this.c, interfaceC2857Wj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        return ((Uj0) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2)).invokeSuspend(C5033xf0.f5238a);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i = this.f3838a;
        C3109bk0 c3109bk0 = this.c;
        LayoutWeaponActivityActionBinding layoutWeaponActivityActionBinding = this.b;
        if (i == 0) {
            AbstractC3375el.b0(obj);
            ConstraintLayout constraintLayout = layoutWeaponActivityActionBinding.conColorChoose;
            AbstractC2995aW.p(constraintLayout, "conColorChoose");
            layoutWeaponActivityActionBinding.conColorChoose.setVisibility(Oh0.b(constraintLayout) ? 4 : 0);
            ConstraintLayout constraintLayout2 = layoutWeaponActivityActionBinding.conColorChoose;
            AbstractC2995aW.p(constraintLayout2, "conColorChoose");
            if (Oh0.b(constraintLayout2)) {
                WeaponUseActivity weaponUseActivity = c3109bk0.f;
                this.f3838a = 1;
                if (weaponUseActivity.q(this) == enumC4602sk) {
                    return enumC4602sk;
                }
            } else {
                AbstractC4340pk0 abstractC4340pk0 = c3109bk0.f.d;
                AbstractC2995aW.o(abstractC4340pk0, "null cannot be cast to non-null type gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.helper.LightSaberFireHelper");
                ((C4213oI) abstractC4340pk0).q();
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC3375el.b0(obj);
        }
        layoutWeaponActivityActionBinding.chooseColorSeekBar.setOnColorChangeListener(new Lj0(c3109bk0));
        return C5033xf0.f5238a;
    }
}
