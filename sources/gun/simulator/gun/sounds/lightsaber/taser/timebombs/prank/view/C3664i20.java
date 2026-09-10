package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.res.Resources;
import com.badlogic.gdx.backends.android.SpineController;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.scenes.scene2d.Stage;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.App;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.i20, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3664i20 extends Ea0 implements InterfaceC3567gx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4629t20 f4485a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3664i20(C4629t20 c4629t20, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.f4485a = c4629t20;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        return new C3664i20(this.f4485a, interfaceC2857Wj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(Object obj, Object obj2) {
        C3664i20 c3664i20 = (C3664i20) create((InterfaceC4514rk) obj, (InterfaceC2857Wj) obj2);
        C5033xf0 c5033xf0 = C5033xf0.f5238a;
        c3664i20.invokeSuspend(c5033xf0);
        return c5033xf0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        C3443fb c3443fbA;
        Vector3 vector3Project;
        AbstractC3375el.b0(obj);
        C4629t20 c4629t20 = this.f4485a;
        SpineController spineController = c4629t20.c;
        if (spineController != null) {
            C4991x70 skeleton = spineController.getSkeleton("jichui");
            if (skeleton != null) {
                skeleton.h(1);
            }
            C4991x70 skeleton2 = spineController.getSkeleton("jichui");
            if (skeleton2 != null && (c3443fbA = skeleton2.a("jichui_hong")) != null) {
                float f = c3443fbA.u;
                float f2 = c3443fbA.x;
                Stage stage = AbstractC3197ck0.f4241a;
                if (stage == null) {
                    vector3Project = null;
                } else {
                    vector3Project = stage.getViewport().project(new Vector3(f, f2, 0.0f));
                    float screenHeight = (stage.getViewport().getScreenHeight() - vector3Project.y) + AbstractC3375el.G(App.n.f());
                    Resources resources = c4629t20.f5012a.getResources();
                    vector3Project.y = screenHeight - resources.getDimensionPixelSize(resources.getIdentifier("navigation_bar_height", "dimen", "android"));
                }
                c4629t20.G = vector3Project != null ? vector3Project.x : 0.0f;
                c4629t20.H = vector3Project != null ? vector3Project.y : 0.0f;
            }
        }
        return C5033xf0.f5238a;
    }
}
