package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.badlogic.gdx.backends.android.SpineController;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.RussianRouletteActivity;

/* JADX INFO: loaded from: classes4.dex */
public final class S10 extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4629t20 f3694a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S10(C4629t20 c4629t20, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.f3694a = c4629t20;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        return new S10(this.f3694a, interfaceC2857Wj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        S10 s10 = (S10) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2);
        C5033xf0 c5033xf0 = C5033xf0.f5238a;
        s10.invokeSuspend(c5033xf0);
        return c5033xf0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        C4991x70 skeleton;
        C3443fb c3443fbA;
        C3443fb c3443fbA2;
        C4991x70 skeleton2;
        C3443fb c3443fbA3;
        C3843k5 animationState;
        AbstractC3375el.b0(obj);
        C4629t20 c4629t20 = this.f3694a;
        SpineController spineController = c4629t20.c;
        if (spineController != null && (animationState = spineController.getAnimationState("effect")) != null) {
            animationState.g();
            animationState.j();
            animationState.q(0.0f, 10);
            animationState.s(0.0f);
        }
        SpineController spineController2 = c4629t20.c;
        if (spineController2 != null) {
            spineController2.addAnimation("effect", 10, AbstractC3197ck0.c, false, 0.0f, c4629t20.X);
        }
        if (spineController2 != null && (skeleton = spineController2.getSkeleton("qiang")) != null && (c3443fbA = skeleton.a("texiao")) != null) {
            RussianRouletteActivity russianRouletteActivity = c4629t20.f5012a;
            if (spineController2 != null && (skeleton2 = spineController2.getSkeleton("effect")) != null && (c3443fbA3 = skeleton2.a("root")) != null) {
                float f = c3443fbA.e;
                float f2 = russianRouletteActivity.f2778a;
                c3443fbA3.e = f * f2;
                c3443fbA3.f = c3443fbA.f * f2;
            }
            C4991x70 skeleton3 = spineController2.getSkeleton("smoke");
            if (skeleton3 != null && (c3443fbA2 = skeleton3.a("root")) != null) {
                float f3 = c3443fbA.e;
                float f4 = russianRouletteActivity.f2778a;
                c3443fbA2.e = f3 * f4;
                c3443fbA2.f = c3443fbA.f * f4;
            }
        }
        c4629t20.d.lavShootWarn.post(new P10(c4629t20, 2));
        return C5033xf0.f5238a;
    }
}
