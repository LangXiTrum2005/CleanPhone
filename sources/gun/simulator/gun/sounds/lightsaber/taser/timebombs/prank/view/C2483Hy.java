package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.badlogic.gdx.backends.android.IControl;
import com.badlogic.gdx.backends.android.SpineController;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Hy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2483Hy extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2612My f3194a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2483Hy(C2612My c2612My, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.f3194a = c2612My;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        return new C2483Hy(this.f3194a, interfaceC2857Wj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        C2483Hy c2483Hy = (C2483Hy) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2);
        C5033xf0 c5033xf0 = C5033xf0.f5238a;
        c2483Hy.invokeSuspend(c5033xf0);
        return c5033xf0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        C3843k5 animationState;
        C3843k5 animationState2;
        AbstractC3375el.b0(obj);
        C2612My c2612My = this.f3194a;
        SpineController spineControllerR = c2612My.r();
        if (spineControllerR != null && (animationState2 = spineControllerR.getAnimationState(c2612My.t())) != null) {
            animationState2.s(0.0f);
            C3755j5 c3755j5L = animationState2.l(c2612My.v);
            if (c3755j5L != null && c3755j5L.f4535a != null) {
                animationState2.q(0.0f, c2612My.v);
            }
        }
        SpineController spineControllerR2 = c2612My.r();
        if (spineControllerR2 != null && (animationState = spineControllerR2.getAnimationState("GUN_SMOKE")) != null) {
            animationState.s(0.0f);
            SpineController spineControllerR3 = c2612My.r();
            if (spineControllerR3 != null) {
                IControl.DefaultImpls.addAnimation$default(spineControllerR3, "GUN_SMOKE", 101, DM.h(c2612My.s(), "_smoke"), false, 0.0f, null, 32, null);
            }
        }
        return C5033xf0.f5238a;
    }
}
