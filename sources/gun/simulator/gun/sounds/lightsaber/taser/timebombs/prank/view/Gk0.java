package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.badlogic.gdx.backends.android.SpineController;
import com.badlogic.gdx.graphics.Color;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.WeaponUseActivity;

/* JADX INFO: loaded from: classes4.dex */
public final class Gk0 extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WeaponUseActivity f3135a;
    public final /* synthetic */ Color b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Gk0(WeaponUseActivity weaponUseActivity, Color color, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.f3135a = weaponUseActivity;
        this.b = color;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        return new Gk0(this.f3135a, this.b, interfaceC2857Wj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        Gk0 gk0 = (Gk0) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2);
        C5033xf0 c5033xf0 = C5033xf0.f5238a;
        gk0.invokeSuspend(c5033xf0);
        return c5033xf0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        C4991x70 skeleton;
        C4991x70 skeleton2;
        C4991x70 skeleton3;
        C4991x70 skeleton4;
        C4991x70 skeleton5;
        C4991x70 skeleton6;
        AbstractC3375el.b0(obj);
        AbstractC4340pk0 abstractC4340pk0 = this.f3135a.d;
        AbstractC2995aW.o(abstractC4340pk0, "null cannot be cast to non-null type gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.helper.LightSaberFireHelper");
        C4213oI c4213oI = (C4213oI) abstractC4340pk0;
        Color color = this.b;
        AbstractC2995aW.q(color, "color");
        N70 n70B = null;
        SpineController spineController = c4213oI.N;
        N70 n70B2 = (spineController == null || (skeleton6 = spineController.getSkeleton("LIGHT_RECTANGLE")) == null) ? null : skeleton6.b("glow");
        if (n70B2 != null) {
            n70B2.c = color;
        }
        N70 n70B3 = (spineController == null || (skeleton5 = spineController.getSkeleton("LIGHT_RECTANGLE1")) == null) ? null : skeleton5.b("glow");
        if (n70B3 != null) {
            n70B3.c = color;
        }
        N70 n70B4 = (spineController == null || (skeleton4 = spineController.getSkeleton("LIGHT_RECTANGLE2")) == null) ? null : skeleton4.b("glow");
        if (n70B4 != null) {
            n70B4.c = color;
        }
        N70 n70B5 = (spineController == null || (skeleton3 = spineController.getSkeleton("LIGHT_SABER_EFFECT")) == null) ? null : skeleton3.b(c4213oI.b0);
        if (n70B5 != null) {
            n70B5.c = color;
        }
        N70 n70B6 = (spineController == null || (skeleton2 = spineController.getSkeleton("LIGHT_SABER_EFFECT1")) == null) ? null : skeleton2.b(c4213oI.b0);
        if (n70B6 != null) {
            n70B6.c = color;
        }
        if (spineController != null && (skeleton = spineController.getSkeleton("LIGHT_SABER_EFFECT2")) != null) {
            n70B = skeleton.b(c4213oI.b0);
        }
        if (n70B != null) {
            n70B.c = color;
        }
        return C5033xf0.f5238a;
    }
}
