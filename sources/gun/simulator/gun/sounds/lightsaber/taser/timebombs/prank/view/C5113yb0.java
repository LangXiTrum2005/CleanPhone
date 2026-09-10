package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.widget.ImageView;
import com.badlogic.gdx.backends.android.IControl;
import com.badlogic.gdx.backends.android.SpineController;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.App;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.WeaponUseActivity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.databinding.LayoutWeaponActivityActionBinding;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.yb0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C5113yb0 extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5283a;
    public final /* synthetic */ Gb0 b;
    public final /* synthetic */ SpineController c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5113yb0(Gb0 gb0, SpineController spineController, String str, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.b = gb0;
        this.c = spineController;
        this.d = str;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        return new C5113yb0(this.b, this.c, this.d, interfaceC2857Wj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        return ((C5113yb0) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2)).invokeSuspend(C5033xf0.f5238a);
    }

    /* JADX WARN: Code duplicated, block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x00db A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:45:0x00f3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:49:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:52:0x0105  */
    /* JADX WARN: Code duplicated, block: B:57:0x0119  */
    /* JADX WARN: Code duplicated, block: B:69:0x0162  */
    /* JADX WARN: Code duplicated, block: B:71:0x0174 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:75:0x017c  */
    /* JADX WARN: Code duplicated, block: B:78:0x0187  */
    /* JADX WARN: Code duplicated, block: B:86:0x01af A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:90:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:93:0x01c1  */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        boolean z;
        LayoutWeaponActivityActionBinding layoutWeaponActivityActionBinding;
        ImageView imageView;
        C3843k5 animationState;
        C4991x70 skeleton;
        C4991x70 skeleton2;
        C3443fb c3443fbA;
        C3443fb c3443fbA2;
        C3843k5 animationState2;
        C4991x70 skeleton3;
        C3443fb c3443fbA3;
        C3843k5 animationState3;
        C4991x70 skeleton4;
        C3443fb c3443fbA4;
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i = this.f5283a;
        C5033xf0 c5033xf0 = C5033xf0.f5238a;
        String str = this.d;
        Gb0 gb0 = this.b;
        SpineController spineController = this.c;
        switch (i) {
            case 0:
                AbstractC3375el.b0(obj);
                if (!App.q) {
                    S3.a("weapon_use");
                    App.q = true;
                }
                C3109bk0 c3109bk0M = gb0.f4847a.m();
                boolean zI = AbstractC2995aW.i((c3109bk0M == null || (layoutWeaponActivityActionBinding = (LayoutWeaponActivityActionBinding) c3109bk0M.b) == null || (imageView = layoutWeaponActivityActionBinding.ivImmersive) == null) ? null : Boolean.valueOf(imageView.isSelected()), Boolean.TRUE);
                WeaponUseActivity weaponUseActivity = gb0.f4847a;
                float f = zI ? weaponUseActivity.i + 0.05f : weaponUseActivity.i;
                C4991x70 skeleton5 = spineController.getSkeleton("GUN_SCIENCE");
                if (skeleton5 != null) {
                    C3443fb c3443fbA5 = skeleton5.a("special effects -" + str);
                    if (c3443fbA5 != null) {
                        gb0.V = c3443fbA5.e * f;
                        gb0.W = c3443fbA5.f * f;
                    }
                }
                if (AbstractC3089ba0.l0(str, "laser gun")) {
                    if (gb0.R) {
                        IControl.DefaultImpls.setAnimation$default(this.c, "GUN_SCIENCE", 0, str.concat("_static"), false, 0.0f, null, 56, null);
                        spineController.showSlot("GUN_SCIENCE");
                        return c5033xf0;
                    }
                    gb0.R = true;
                    String strConcat = str.concat("_long press");
                    this.f5283a = 1;
                    gb0.N("GUN_SCIENCE", 0, strConcat, false);
                    if (c5033xf0 == enumC4602sk) {
                        return enumC4602sk;
                    }
                    gb0.getClass();
                    String strConcat2 = Gb0.M(str).concat("_circulation");
                    this.f5283a = 2;
                    gb0.N("GUN_SCIENCE_EFFECT", 1, strConcat2, true);
                    if (c5033xf0 == enumC4602sk) {
                        return enumC4602sk;
                    }
                    gb0.getClass();
                    String strConcat3 = Gb0.M(str).concat("_appear");
                    this.f5283a = 3;
                    gb0.N("GUN_SCIENCE_LASER_APPEAR", 2, strConcat3, false);
                    if (c5033xf0 == enumC4602sk) {
                        return enumC4602sk;
                    }
                    animationState = spineController.getAnimationState("GUN_SCIENCE_LASER_APPEAR");
                    if (animationState != null) {
                        animationState.h = 2.0f;
                    }
                    skeleton = spineController.getSkeleton("GUN_SCIENCE_EFFECT");
                    if (skeleton != null && (c3443fbA2 = skeleton.a("root")) != null) {
                        c3443fbA2.e = gb0.V;
                        c3443fbA2.f = gb0.W;
                    }
                    skeleton2 = spineController.getSkeleton("GUN_SCIENCE_LASER_APPEAR");
                    if (skeleton2 != null && (c3443fbA = skeleton2.a("root")) != null) {
                        c3443fbA.e = gb0.V;
                        c3443fbA.f = gb0.W;
                        return c5033xf0;
                    }
                    return null;
                }
                if (!AbstractC3089ba0.l0(str, "arc")) {
                    this.f5283a = 6;
                    z = false;
                    Gb0.O(gb0, "GUN_SCIENCE", 0, str);
                    if (c5033xf0 == enumC4602sk) {
                        return enumC4602sk;
                    }
                    gb0.getClass();
                    String strM = Gb0.M(str);
                    this.f5283a = 7;
                    gb0.N("GUN_SCIENCE_EFFECT", 1, strM, z);
                    if (c5033xf0 == enumC4602sk) {
                        return enumC4602sk;
                    }
                    animationState3 = spineController.getAnimationState("GUN_SCIENCE_EFFECT");
                    if (animationState3 != null) {
                        animationState3.h = 3.0f;
                    }
                    skeleton4 = spineController.getSkeleton("GUN_SCIENCE_EFFECT");
                    if (skeleton4 != null && (c3443fbA4 = skeleton4.a("root")) != null) {
                        c3443fbA4.e = gb0.V;
                        c3443fbA4.f = gb0.W;
                        return c5033xf0;
                    }
                    return null;
                }
                this.f5283a = 4;
                Gb0.O(gb0, "GUN_SCIENCE", 0, str);
                if (c5033xf0 == enumC4602sk) {
                    return enumC4602sk;
                }
                if (!gb0.R) {
                    return c5033xf0;
                }
                gb0.R = true;
                String strConcat4 = Gb0.M(str).concat("_circulation");
                this.f5283a = 5;
                gb0.N("GUN_SCIENCE_EFFECT", 1, strConcat4, true);
                if (c5033xf0 == enumC4602sk) {
                    return enumC4602sk;
                }
                animationState2 = spineController.getAnimationState("GUN_SCIENCE_EFFECT");
                if (animationState2 != null) {
                    animationState2.h = 1.74f;
                }
                skeleton3 = spineController.getSkeleton("GUN_SCIENCE_EFFECT");
                if (skeleton3 != null && (c3443fbA3 = skeleton3.a("root")) != null) {
                    c3443fbA3.e = gb0.V;
                    c3443fbA3.f = gb0.W;
                    return c5033xf0;
                }
                return null;
            case 1:
                AbstractC3375el.b0(obj);
                gb0.getClass();
                String strConcat5 = Gb0.M(str).concat("_circulation");
                this.f5283a = 2;
                gb0.N("GUN_SCIENCE_EFFECT", 1, strConcat5, true);
                if (c5033xf0 == enumC4602sk) {
                    return enumC4602sk;
                }
                gb0.getClass();
                String strConcat6 = Gb0.M(str).concat("_appear");
                this.f5283a = 3;
                gb0.N("GUN_SCIENCE_LASER_APPEAR", 2, strConcat6, false);
                if (c5033xf0 == enumC4602sk) {
                    return enumC4602sk;
                }
                animationState = spineController.getAnimationState("GUN_SCIENCE_LASER_APPEAR");
                if (animationState != null) {
                    animationState.h = 2.0f;
                }
                skeleton = spineController.getSkeleton("GUN_SCIENCE_EFFECT");
                if (skeleton != null) {
                    c3443fbA2.e = gb0.V;
                    c3443fbA2.f = gb0.W;
                }
                skeleton2 = spineController.getSkeleton("GUN_SCIENCE_LASER_APPEAR");
                if (skeleton2 != null) {
                    c3443fbA.e = gb0.V;
                    c3443fbA.f = gb0.W;
                    return c5033xf0;
                }
                return null;
            case 2:
                AbstractC3375el.b0(obj);
                gb0.getClass();
                String strConcat7 = Gb0.M(str).concat("_appear");
                this.f5283a = 3;
                gb0.N("GUN_SCIENCE_LASER_APPEAR", 2, strConcat7, false);
                if (c5033xf0 == enumC4602sk) {
                    return enumC4602sk;
                }
                animationState = spineController.getAnimationState("GUN_SCIENCE_LASER_APPEAR");
                if (animationState != null) {
                    animationState.h = 2.0f;
                }
                skeleton = spineController.getSkeleton("GUN_SCIENCE_EFFECT");
                if (skeleton != null) {
                    c3443fbA2.e = gb0.V;
                    c3443fbA2.f = gb0.W;
                }
                skeleton2 = spineController.getSkeleton("GUN_SCIENCE_LASER_APPEAR");
                if (skeleton2 != null) {
                    c3443fbA.e = gb0.V;
                    c3443fbA.f = gb0.W;
                    return c5033xf0;
                }
                return null;
            case 3:
                AbstractC3375el.b0(obj);
                animationState = spineController.getAnimationState("GUN_SCIENCE_LASER_APPEAR");
                if (animationState != null) {
                    animationState.h = 2.0f;
                }
                skeleton = spineController.getSkeleton("GUN_SCIENCE_EFFECT");
                if (skeleton != null) {
                    c3443fbA2.e = gb0.V;
                    c3443fbA2.f = gb0.W;
                }
                skeleton2 = spineController.getSkeleton("GUN_SCIENCE_LASER_APPEAR");
                if (skeleton2 != null) {
                    c3443fbA.e = gb0.V;
                    c3443fbA.f = gb0.W;
                    return c5033xf0;
                }
                return null;
            case 4:
                AbstractC3375el.b0(obj);
                if (!gb0.R) {
                    return c5033xf0;
                }
                gb0.R = true;
                String strConcat8 = Gb0.M(str).concat("_circulation");
                this.f5283a = 5;
                gb0.N("GUN_SCIENCE_EFFECT", 1, strConcat8, true);
                if (c5033xf0 == enumC4602sk) {
                    return enumC4602sk;
                }
                animationState2 = spineController.getAnimationState("GUN_SCIENCE_EFFECT");
                if (animationState2 != null) {
                    animationState2.h = 1.74f;
                }
                skeleton3 = spineController.getSkeleton("GUN_SCIENCE_EFFECT");
                if (skeleton3 != null) {
                    c3443fbA3.e = gb0.V;
                    c3443fbA3.f = gb0.W;
                    return c5033xf0;
                }
                return null;
            case 5:
                AbstractC3375el.b0(obj);
                animationState2 = spineController.getAnimationState("GUN_SCIENCE_EFFECT");
                if (animationState2 != null) {
                    animationState2.h = 1.74f;
                }
                skeleton3 = spineController.getSkeleton("GUN_SCIENCE_EFFECT");
                if (skeleton3 != null) {
                    c3443fbA3.e = gb0.V;
                    c3443fbA3.f = gb0.W;
                    return c5033xf0;
                }
                return null;
            case 6:
                AbstractC3375el.b0(obj);
                z = false;
                gb0.getClass();
                String strM2 = Gb0.M(str);
                this.f5283a = 7;
                gb0.N("GUN_SCIENCE_EFFECT", 1, strM2, z);
                if (c5033xf0 == enumC4602sk) {
                    return enumC4602sk;
                }
                animationState3 = spineController.getAnimationState("GUN_SCIENCE_EFFECT");
                if (animationState3 != null) {
                    animationState3.h = 3.0f;
                }
                skeleton4 = spineController.getSkeleton("GUN_SCIENCE_EFFECT");
                if (skeleton4 != null) {
                    c3443fbA4.e = gb0.V;
                    c3443fbA4.f = gb0.W;
                    return c5033xf0;
                }
                return null;
            case 7:
                AbstractC3375el.b0(obj);
                animationState3 = spineController.getAnimationState("GUN_SCIENCE_EFFECT");
                if (animationState3 != null) {
                    animationState3.h = 3.0f;
                }
                skeleton4 = spineController.getSkeleton("GUN_SCIENCE_EFFECT");
                if (skeleton4 != null) {
                    c3443fbA4.e = gb0.V;
                    c3443fbA4.f = gb0.W;
                    return c5033xf0;
                }
                return null;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
