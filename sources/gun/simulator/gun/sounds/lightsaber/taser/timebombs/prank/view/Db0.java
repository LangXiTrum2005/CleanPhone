package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.badlogic.gdx.backends.android.SpineController;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.Weapon;

/* JADX INFO: loaded from: classes4.dex */
public final class Db0 extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2976a;
    public final /* synthetic */ Gb0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Db0(Gb0 gb0, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.b = gb0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        return new Db0(this.b, interfaceC2857Wj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        return ((Db0) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2)).invokeSuspend(C5033xf0.f5238a);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        String name;
        C3843k5 animationState;
        C3843k5 animationState2;
        C3843k5 animationState3;
        C3843k5 animationState4;
        C3843k5 animationState5;
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i = this.f2976a;
        Gb0 gb0 = this.b;
        if (i == 0) {
            AbstractC3375el.b0(obj);
            InterfaceC4397qQ interfaceC4397qQ = (InterfaceC4397qQ) gb0.P.getValue();
            this.f2976a = 1;
            if (((C4660tQ) interfaceC4397qQ).d(null, this) == enumC4602sk) {
                return enumC4602sk;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC3375el.b0(obj);
        }
        Weapon weaponN = gb0.f4847a.n();
        if (weaponN != null && (name = weaponN.getName()) != null) {
            SpineController spineController = gb0.N;
            if (spineController != null && (animationState5 = spineController.getAnimationState("GUN_SCIENCE")) != null) {
                animationState5.q(0.0f, 0);
            }
            if (spineController != null && (animationState4 = spineController.getAnimationState("GUN_SCIENCE_EFFECT")) != null) {
                animationState4.q(0.0f, 1);
            }
            if (AbstractC3089ba0.l0(name, "laser gun")) {
                if (spineController != null && (animationState3 = spineController.getAnimationState("GUN_SCIENCE_LASER_APPEAR")) != null) {
                    animationState3.q(0.0f, 2);
                }
                if (spineController != null && (animationState2 = spineController.getAnimationState("GUN_SCIENCE_LASER_VANISH")) != null) {
                    animationState2.q(0.0f, 3);
                }
            } else if (AbstractC3089ba0.l0(name, "arc") && spineController != null && (animationState = spineController.getAnimationState("GUN_SCIENCE_ARC_VANISH")) != null) {
                animationState.q(0.0f, 2);
            }
        }
        ((C4660tQ) ((InterfaceC4397qQ) gb0.P.getValue())).e(null);
        return C5033xf0.f5238a;
    }
}
