package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.animation.ValueAnimator;
import com.badlogic.gdx.backends.android.SpineController;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.zH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C5179zH implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5321a;
    public final /* synthetic */ C4213oI b;

    public /* synthetic */ C5179zH(C4213oI c4213oI, int i) {
        this.f5321a = i;
        this.b = c4213oI;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C4991x70 skeleton;
        C4991x70 skeleton2;
        C4991x70 skeleton3;
        C4991x70 skeleton4;
        C4991x70 skeleton5;
        C4991x70 skeleton6;
        int i = this.f5321a;
        C3443fb c3443fbA = null;
        C4213oI c4213oI = this.b;
        switch (i) {
            case 0:
                AbstractC2995aW.q(c4213oI, "this$0");
                AbstractC2995aW.q(valueAnimator, "animation");
                Object animatedValue = valueAnimator.getAnimatedValue();
                AbstractC2995aW.o(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                float fFloatValue = ((Float) animatedValue).floatValue();
                SpineController spineController = c4213oI.N;
                if (spineController != null && (skeleton = spineController.getSkeleton("LIGHT_RECTANGLE2")) != null) {
                    c3443fbA = skeleton.a("root");
                }
                if (c3443fbA != null) {
                    c3443fbA.h = fFloatValue;
                    break;
                }
                break;
            case 1:
                AbstractC2995aW.q(c4213oI, "this$0");
                AbstractC2995aW.q(valueAnimator, "animation");
                Object animatedValue2 = valueAnimator.getAnimatedValue();
                AbstractC2995aW.o(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
                float fFloatValue2 = ((Float) animatedValue2).floatValue();
                SpineController spineController2 = c4213oI.N;
                if (spineController2 != null && (skeleton2 = spineController2.getSkeleton("LIGHT_SABER_EFFECT")) != null) {
                    c3443fbA = skeleton2.a("root");
                }
                if (c3443fbA != null) {
                    c3443fbA.h = fFloatValue2;
                    break;
                }
                break;
            case 2:
                AbstractC2995aW.q(c4213oI, "this$0");
                AbstractC2995aW.q(valueAnimator, "animation");
                Object animatedValue3 = valueAnimator.getAnimatedValue();
                AbstractC2995aW.o(animatedValue3, "null cannot be cast to non-null type kotlin.Float");
                float fFloatValue3 = ((Float) animatedValue3).floatValue();
                SpineController spineController3 = c4213oI.N;
                if (spineController3 != null && (skeleton3 = spineController3.getSkeleton("LIGHT_RECTANGLE1")) != null) {
                    c3443fbA = skeleton3.a("root");
                }
                if (c3443fbA != null) {
                    c3443fbA.h = fFloatValue3;
                    break;
                }
                break;
            case 3:
                AbstractC2995aW.q(c4213oI, "this$0");
                AbstractC2995aW.q(valueAnimator, "animation");
                Object animatedValue4 = valueAnimator.getAnimatedValue();
                AbstractC2995aW.o(animatedValue4, "null cannot be cast to non-null type kotlin.Float");
                float fFloatValue4 = ((Float) animatedValue4).floatValue();
                SpineController spineController4 = c4213oI.N;
                if (spineController4 != null && (skeleton4 = spineController4.getSkeleton("LIGHT_SABER_EFFECT1")) != null) {
                    c3443fbA = skeleton4.a("root");
                }
                if (c3443fbA != null) {
                    c3443fbA.h = fFloatValue4;
                    break;
                }
                break;
            case 4:
                AbstractC2995aW.q(c4213oI, "this$0");
                AbstractC2995aW.q(valueAnimator, "animation");
                Object animatedValue5 = valueAnimator.getAnimatedValue();
                AbstractC2995aW.o(animatedValue5, "null cannot be cast to non-null type kotlin.Float");
                float fFloatValue5 = ((Float) animatedValue5).floatValue();
                SpineController spineController5 = c4213oI.N;
                if (spineController5 != null && (skeleton5 = spineController5.getSkeleton("LIGHT_RECTANGLE")) != null) {
                    c3443fbA = skeleton5.a("root");
                }
                if (c3443fbA != null) {
                    c3443fbA.h = fFloatValue5;
                    break;
                }
                break;
            default:
                AbstractC2995aW.q(c4213oI, "this$0");
                AbstractC2995aW.q(valueAnimator, "animation");
                Object animatedValue6 = valueAnimator.getAnimatedValue();
                AbstractC2995aW.o(animatedValue6, "null cannot be cast to non-null type kotlin.Float");
                float fFloatValue6 = ((Float) animatedValue6).floatValue();
                SpineController spineController6 = c4213oI.N;
                if (spineController6 != null && (skeleton6 = spineController6.getSkeleton("LIGHT_SABER_EFFECT2")) != null) {
                    c3443fbA = skeleton6.a("root");
                }
                if (c3443fbA != null) {
                    c3443fbA.h = fFloatValue6;
                    break;
                }
                break;
        }
    }
}
