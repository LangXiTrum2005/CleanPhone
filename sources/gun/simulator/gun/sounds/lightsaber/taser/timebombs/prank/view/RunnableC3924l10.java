package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import androidx.lifecycle.LifecycleOwnerKt;
import com.badlogic.gdx.backends.android.SpineController;
import com.badlogic.gdx.math.Vector3;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.RussianRouletteActivity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.databinding.LayoutRussainRouletteGuideBinding;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.views.ArrowView;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.l10, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC3924l10 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4626a;
    public final /* synthetic */ RussianRouletteActivity b;
    public final /* synthetic */ SpineController c;

    public /* synthetic */ RunnableC3924l10(RussianRouletteActivity russianRouletteActivity, SpineController spineController, int i) {
        this.f4626a = i;
        this.b = russianRouletteActivity;
        this.c = spineController;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3443fb c3443fbA;
        C3443fb c3443fbA2;
        C3443fb c3443fbA3;
        int i = this.f4626a;
        SpineController spineController = this.c;
        RussianRouletteActivity russianRouletteActivity = this.b;
        switch (i) {
            case 0:
                int i2 = RussianRouletteActivity.t;
                AbstractC2995aW.q(russianRouletteActivity, "this$0");
                AbstractC2995aW.q(spineController, "$controller");
                russianRouletteActivity.r = (((LayoutRussainRouletteGuideBinding) russianRouletteActivity.n().b).conGuide1.getWidth() / 2) + ((LayoutRussainRouletteGuideBinding) russianRouletteActivity.n().b).conGuide1.getLeft();
                russianRouletteActivity.s = ((LayoutRussainRouletteGuideBinding) russianRouletteActivity.n().b).conGuide1.getBottom();
                russianRouletteActivity.n = (((LayoutRussainRouletteGuideBinding) russianRouletteActivity.n().b).conGuide2.getWidth() / 2) + ((LayoutRussainRouletteGuideBinding) russianRouletteActivity.n().b).conGuide2.getLeft();
                russianRouletteActivity.o = ((LayoutRussainRouletteGuideBinding) russianRouletteActivity.n().b).conGuide2.getBottom();
                russianRouletteActivity.p = (((LayoutRussainRouletteGuideBinding) russianRouletteActivity.n().b).conGuide3.getWidth() / 2) + ((LayoutRussainRouletteGuideBinding) russianRouletteActivity.n().b).conGuide3.getLeft();
                russianRouletteActivity.q = ((LayoutRussainRouletteGuideBinding) russianRouletteActivity.n().b).conGuide3.getBottom();
                C4991x70 skeleton = spineController.getSkeleton("banji");
                if (skeleton != null) {
                    skeleton.h(1);
                }
                C4991x70 skeleton2 = spineController.getSkeleton("banji");
                if (skeleton2 != null && (c3443fbA3 = skeleton2.a("banji_hong2")) != null) {
                    Vector3 vector3K = russianRouletteActivity.k(c3443fbA3.u, c3443fbA3.x);
                    C4717u20 c4717u20N = russianRouletteActivity.n();
                    float f = russianRouletteActivity.n;
                    float f2 = russianRouletteActivity.o;
                    float f3 = vector3K != null ? vector3K.x * russianRouletteActivity.f2778a : 0.0f;
                    float f4 = vector3K != null ? vector3K.y * russianRouletteActivity.f2778a : 0.0f;
                    ArrowView arrowView = ((LayoutRussainRouletteGuideBinding) c4717u20N.b).arrow1;
                    arrowView.c = f;
                    arrowView.d = f2;
                    arrowView.e = f3;
                    arrowView.f = f4;
                    arrowView.invalidate();
                }
                C4991x70 skeleton3 = spineController.getSkeleton("jichui");
                if (skeleton3 != null) {
                    skeleton3.h(1);
                }
                C4991x70 skeleton4 = spineController.getSkeleton("jichui");
                if (skeleton4 != null && (c3443fbA2 = skeleton4.a("jichui_hong2")) != null) {
                    Vector3 vector3K2 = russianRouletteActivity.k(c3443fbA2.u, c3443fbA2.x);
                    C4717u20 c4717u20N2 = russianRouletteActivity.n();
                    float f5 = russianRouletteActivity.p;
                    float f6 = russianRouletteActivity.q;
                    float f7 = vector3K2 != null ? vector3K2.x * russianRouletteActivity.f2778a : 0.0f;
                    float f8 = vector3K2 != null ? vector3K2.y * russianRouletteActivity.f2778a : 0.0f;
                    ArrowView arrowView2 = ((LayoutRussainRouletteGuideBinding) c4717u20N2.b).arrow2;
                    arrowView2.c = f5;
                    arrowView2.d = f6;
                    arrowView2.e = f7;
                    arrowView2.f = f8;
                    arrowView2.invalidate();
                }
                C4991x70 skeleton5 = spineController.getSkeleton("dancao");
                if (skeleton5 != null) {
                    skeleton5.h(1);
                }
                C4991x70 skeleton6 = spineController.getSkeleton("dancao");
                if (skeleton6 != null && (c3443fbA = skeleton6.a("dancao_hong2")) != null) {
                    Vector3 vector3K3 = russianRouletteActivity.k(c3443fbA.u, c3443fbA.x);
                    C4717u20 c4717u20N3 = russianRouletteActivity.n();
                    float f9 = russianRouletteActivity.r;
                    float f10 = russianRouletteActivity.s;
                    float f11 = vector3K3 != null ? vector3K3.x * russianRouletteActivity.f2778a : 0.0f;
                    float f12 = vector3K3 != null ? russianRouletteActivity.f2778a * vector3K3.y : 0.0f;
                    ArrowView arrowView3 = ((LayoutRussainRouletteGuideBinding) c4717u20N3.b).arrow3;
                    arrowView3.c = f9;
                    arrowView3.d = f10;
                    arrowView3.e = f11;
                    arrowView3.f = f12;
                    arrowView3.invalidate();
                    break;
                }
                break;
            default:
                int i3 = RussianRouletteActivity.t;
                AbstractC2995aW.q(russianRouletteActivity, "this$0");
                AbstractC2995aW.q(spineController, "$controller");
                WD.D(LifecycleOwnerKt.getLifecycleScope(russianRouletteActivity), null, 0, new C4979x10(russianRouletteActivity, spineController, null), 3);
                break;
        }
    }
}
