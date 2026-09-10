package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.badlogic.gdx.backends.android.SpineController;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.c20, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3135c20 extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4629t20 f4199a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3135c20(C4629t20 c4629t20, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.f4199a = c4629t20;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        return new C3135c20(this.f4199a, interfaceC2857Wj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        C3135c20 c3135c20 = (C3135c20) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2);
        C5033xf0 c5033xf0 = C5033xf0.f5238a;
        c3135c20.invokeSuspend(c5033xf0);
        return c5033xf0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) throws Throwable {
        C3843k5 animationState;
        C3843k5 animationState2;
        AbstractC3375el.b0(obj);
        C4629t20 c4629t20 = this.f4199a;
        SpineController spineController = c4629t20.c;
        if (spineController != null && (animationState2 = spineController.getAnimationState("reload")) != null) {
            animationState2.q(0.0f, 8);
        }
        SpineController spineController2 = c4629t20.c;
        if (spineController2 != null && (animationState = spineController2.getAnimationState("reload")) != null) {
            animationState.q(0.0f, 9);
        }
        if (spineController2 != null) {
            spineController2.hideSlot("reload", "hong");
        }
        if (spineController2 != null) {
            spineController2.hideSlot("reload", "finger");
        }
        ((C2856Wi) AbstractC2934Zi.b.getValue()).b(Boolean.FALSE);
        c4629t20.f0 = false;
        return C5033xf0.f5238a;
    }
}
