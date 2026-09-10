package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.badlogic.gdx.backends.android.IControl;
import com.badlogic.gdx.backends.android.SpineController;

/* JADX INFO: loaded from: classes4.dex */
public final class X10 extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4629t20 f3952a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X10(C4629t20 c4629t20, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.f3952a = c4629t20;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        return new X10(this.f3952a, interfaceC2857Wj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        X10 x10 = (X10) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2);
        C5033xf0 c5033xf0 = C5033xf0.f5238a;
        x10.invokeSuspend(c5033xf0);
        return c5033xf0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        C3843k5 animationState;
        C3843k5 animationState2;
        AbstractC3375el.b0(obj);
        C4629t20 c4629t20 = this.f3952a;
        SpineController spineController = c4629t20.c;
        if (spineController != null && (animationState2 = spineController.getAnimationState("reload")) != null) {
            animationState2.j();
        }
        SpineController spineController2 = c4629t20.c;
        if (spineController2 != null && (animationState = spineController2.getAnimationState("gun")) != null) {
            animationState.j();
        }
        if (spineController2 != null) {
            spineController2.hideSlot("dancao");
        }
        if (spineController2 != null) {
            spineController2.hideSlot("banji");
        }
        if (spineController2 != null) {
            spineController2.hideSlot("jichui");
        }
        if (spineController2 != null) {
            spineController2.hideSlot("qiang");
        }
        if (spineController2 != null) {
            spineController2.showSlot("reload");
        }
        if (spineController2 != null) {
            spineController2.showSlot("gun");
        }
        if (c4629t20.f0) {
            if (spineController2 != null) {
                spineController2.showSlot("reload", "hong");
            }
            if (spineController2 != null) {
                spineController2.showSlot("reload", "finger");
            }
            if (spineController2 != null) {
                IControl.DefaultImpls.addAnimation$default(spineController2, "reload", 8, "hong", false, 1.0f, null, 32, null);
            }
            if (spineController2 != null) {
                IControl.DefaultImpls.addAnimation$default(spineController2, "reload", 9, "finger", true, 0.0f, null, 48, null);
            }
        } else {
            if (spineController2 != null) {
                spineController2.hideSlot("reload", "hong");
            }
            if (spineController2 != null) {
                spineController2.hideSlot("reload", "finger");
            }
        }
        for (int i = 1; i < 7; i++) {
            if (spineController2 != null) {
                spineController2.hideSlot("reload", String.valueOf(i));
            }
            if (spineController2 != null) {
                spineController2.hideSlot("gun", String.valueOf(i));
            }
        }
        for (int i2 = 0; i2 < 6; i2++) {
            if (((Boolean) c4629t20.r.get(i2)).booleanValue() && spineController2 != null) {
                spineController2.showSlot("reload", String.valueOf(i2 + 1));
            }
        }
        return C5033xf0.f5238a;
    }
}
