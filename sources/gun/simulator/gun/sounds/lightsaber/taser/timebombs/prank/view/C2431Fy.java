package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.badlogic.gdx.backends.android.SpineController;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Fy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2431Fy extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2612My f3096a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2431Fy(C2612My c2612My, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.f3096a = c2612My;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        return new C2431Fy(this.f3096a, interfaceC2857Wj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        C2431Fy c2431Fy = (C2431Fy) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2);
        C5033xf0 c5033xf0 = C5033xf0.f5238a;
        c2431Fy.invokeSuspend(c5033xf0);
        return c5033xf0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        C3843k5 animationState;
        C3843k5 animationState2;
        AbstractC3375el.b0(obj);
        C2612My c2612My = this.f3096a;
        SpineController spineControllerR = c2612My.r();
        if (spineControllerR != null && (animationState2 = spineControllerR.getAnimationState("GUN_SMOKE")) != null) {
            animationState2.s(0.0f);
        }
        SpineController spineControllerR2 = c2612My.r();
        if (spineControllerR2 != null && (animationState = spineControllerR2.getAnimationState("GUN_SMOKE")) != null) {
            animationState.q(0.0f, 101);
        }
        return C5033xf0.f5238a;
    }
}
