package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.badlogic.gdx.backends.android.IControl;
import com.badlogic.gdx.backends.android.SpineController;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.bean.Weapon;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.zb0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C5201zb0 extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Gb0 f5331a;
    public int b;
    public final /* synthetic */ Gb0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5201zb0(Gb0 gb0, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.c = gb0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        return new C5201zb0(this.c, interfaceC2857Wj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        return ((C5201zb0) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2)).invokeSuspend(C5033xf0.f5238a);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        String name;
        Gb0 gb0;
        C3843k5 animationState;
        Gb0 gb1;
        C3843k5 animationState2;
        C3843k5 animationState3;
        SpineController spineController;
        C4991x70 skeleton;
        C3443fb c3443fbA;
        SpineController spineController2;
        C4991x70 skeleton2;
        C3443fb c3443fbA2;
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i = this.b;
        C5033xf0 c5033xf0 = C5033xf0.f5238a;
        Gb0 gb2 = this.c;
        if (i == 0) {
            AbstractC3375el.b0(obj);
            InterfaceC4397qQ interfaceC4397qQ = (InterfaceC4397qQ) gb2.P.getValue();
            this.b = 1;
            if (((C4660tQ) interfaceC4397qQ).d(null, this) == enumC4602sk) {
                return enumC4602sk;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    gb1 = this.f5331a;
                    AbstractC3375el.b0(obj);
                    spineController = gb1.N;
                    if (spineController != null && (skeleton = spineController.getSkeleton("GUN_SCIENCE_LASER_VANISH")) != null && (c3443fbA = skeleton.a("root")) != null) {
                        c3443fbA.e = gb1.V;
                        c3443fbA.f = gb1.W;
                    }
                    ((C4660tQ) ((InterfaceC4397qQ) gb2.P.getValue())).e(null);
                    return c5033xf0;
                }
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gb0 = this.f5331a;
                AbstractC3375el.b0(obj);
                spineController2 = gb0.N;
                if (spineController2 != null && (skeleton2 = spineController2.getSkeleton("GUN_SCIENCE_ARC_VANISH")) != null && (c3443fbA2 = skeleton2.a("root")) != null) {
                    c3443fbA2.e = gb0.V;
                    c3443fbA2.f = gb0.W;
                }
                ((C4660tQ) ((InterfaceC4397qQ) gb2.P.getValue())).e(null);
                return c5033xf0;
            }
            AbstractC3375el.b0(obj);
        }
        Weapon weaponN = gb2.f4847a.n();
        if (weaponN != null && (name = weaponN.getName()) != null) {
            boolean zL0 = AbstractC3089ba0.l0(name, "laser gun");
            SpineController spineController3 = gb2.N;
            if (zL0) {
                if (spineController3 != null) {
                    IControl.DefaultImpls.setAnimation$default(spineController3, "GUN_SCIENCE", 0, name.concat("_let go"), false, 0.0f, null, 56, null);
                }
                if (spineController3 != 0) {
                    spineController3.showSlot("GUN_SCIENCE");
                }
                if (spineController3 != 0 && (animationState3 = spineController3.getAnimationState("GUN_SCIENCE_EFFECT")) != null) {
                    animationState3.q(0.0f, 1);
                }
                if (spineController3 != 0 && (animationState2 = spineController3.getAnimationState("GUN_SCIENCE_LASER_APPEAR")) != null) {
                    animationState2.q(0.0f, 2);
                }
                String strConcat = Gb0.M(name).concat("_vanish");
                this.f5331a = gb2;
                this.b = 2;
                gb2.N("GUN_SCIENCE_LASER_VANISH", 3, strConcat, false);
                if (c5033xf0 == enumC4602sk) {
                    return enumC4602sk;
                }
                gb1 = gb2;
                spineController = gb1.N;
                if (spineController != null) {
                    c3443fbA.e = gb1.V;
                    c3443fbA.f = gb1.W;
                }
            } else if (AbstractC3089ba0.l0(name, "arc")) {
                if (spineController3 != null && (animationState = spineController3.getAnimationState("GUN_SCIENCE_EFFECT")) != null) {
                    animationState.q(0.0f, 1);
                }
                String strConcat2 = Gb0.M(name).concat("_vanish");
                this.f5331a = gb2;
                this.b = 3;
                gb2.N("GUN_SCIENCE_ARC_VANISH", 2, strConcat2, false);
                if (c5033xf0 == enumC4602sk) {
                    return enumC4602sk;
                }
                gb0 = gb2;
                spineController2 = gb0.N;
                if (spineController2 != null) {
                    c3443fbA2.e = gb0.V;
                    c3443fbA2.f = gb0.W;
                }
            }
        }
        ((C4660tQ) ((InterfaceC4397qQ) gb2.P.getValue())).e(null);
        return c5033xf0;
    }
}
