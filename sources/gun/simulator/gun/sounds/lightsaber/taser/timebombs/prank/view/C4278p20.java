package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.animation.Animator;
import android.animation.ValueAnimator;
import com.badlogic.gdx.backends.android.SpineController;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.p20, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4278p20 implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f4818a;
    public final /* synthetic */ C4629t20 b;
    public final /* synthetic */ float c;
    public final /* synthetic */ ValueAnimator d;

    public C4278p20(float f, C4629t20 c4629t20, float f2, ValueAnimator valueAnimator) {
        this.f4818a = f;
        this.b = c4629t20;
        this.c = f2;
        this.d = valueAnimator;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        AbstractC2995aW.q(animator, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C4991x70 skeleton;
        C3843k5 animationState;
        AbstractC2995aW.q(animator, "animation");
        C4629t20 c4629t20 = this.b;
        c4629t20.z = false;
        SpineController spineController = c4629t20.c;
        C3755j5 c3755j5L = (spineController == null || (animationState = spineController.getAnimationState("dancao")) == null) ? null : animationState.l(2);
        if (c3755j5L != null) {
            C3493g5 c3493g5 = c3755j5L.f4535a;
            Float fValueOf = c3493g5 != null ? Float.valueOf(c3493g5.d) : null;
            AbstractC2995aW.n(fValueOf);
            c3755j5L.k = fValueOf.floatValue() * this.c;
        }
        if (c3755j5L != null) {
            c3755j5L.o = 1.0f;
        }
        if (spineController != null && (skeleton = spineController.getSkeleton("dancao")) != null) {
            skeleton.h(3);
        }
        this.d.removeAllListeners();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        AbstractC2995aW.q(animator, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        AbstractC2995aW.q(animator, "animation");
        float f = this.f4818a;
        C4629t20 c4629t20 = this.b;
        if (f > 0.0f) {
            c4629t20.k(Integer.valueOf(c4629t20.h));
            c4629t20.i(60);
        } else {
            c4629t20.k(Integer.valueOf(c4629t20.h));
            c4629t20.i(-60);
        }
    }
}
