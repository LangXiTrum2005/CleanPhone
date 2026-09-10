package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class Tc0 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3779a;
    public final /* synthetic */ View b;

    public /* synthetic */ Tc0(View view, int i) {
        this.f3779a = i;
        this.b = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.f3779a;
        View view = this.b;
        AbstractC2995aW.q(view, "$view");
        AbstractC2995aW.q(valueAnimator, "it");
        switch (i) {
            case 0:
                Object animatedValue = valueAnimator.getAnimatedValue();
                AbstractC2995aW.o(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                view.setAlpha(((Float) animatedValue).floatValue());
                break;
            case 1:
                Object animatedValue2 = valueAnimator.getAnimatedValue();
                AbstractC2995aW.o(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
                view.setScaleX(((Float) animatedValue2).floatValue());
                Object animatedValue3 = valueAnimator.getAnimatedValue();
                AbstractC2995aW.o(animatedValue3, "null cannot be cast to non-null type kotlin.Float");
                view.setScaleY(((Float) animatedValue3).floatValue());
                break;
            case 2:
                Object animatedValue4 = valueAnimator.getAnimatedValue();
                AbstractC2995aW.o(animatedValue4, "null cannot be cast to non-null type kotlin.Float");
                view.setAlpha(((Float) animatedValue4).floatValue());
                break;
            default:
                Object animatedValue5 = valueAnimator.getAnimatedValue();
                AbstractC2995aW.o(animatedValue5, "null cannot be cast to non-null type kotlin.Float");
                view.setAlpha(((Float) animatedValue5).floatValue());
                break;
        }
    }
}
