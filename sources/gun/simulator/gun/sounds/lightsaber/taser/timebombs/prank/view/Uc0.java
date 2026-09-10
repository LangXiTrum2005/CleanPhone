package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import com.mbridge.msdk.MBridgeConstans;

/* JADX INFO: loaded from: classes4.dex */
public final class Uc0 implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f3828a;
    public final /* synthetic */ View b;

    public Uc0(TextView textView, TextView textView2) {
        this.f3828a = textView;
        this.b = textView2;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        AbstractC2995aW.q(animator, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        AbstractC2995aW.q(animator, "animation");
        View view = this.f3828a;
        AbstractC2995aW.q(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.setDuration(400L);
        valueAnimatorOfFloat.addUpdateListener(new Tc0(view, 2));
        valueAnimatorOfFloat.start();
        View view2 = this.b;
        AbstractC2995aW.q(view2, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat2.setDuration(400L);
        valueAnimatorOfFloat2.addUpdateListener(new Tc0(view2, 2));
        valueAnimatorOfFloat2.start();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        AbstractC2995aW.q(animator, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        AbstractC2995aW.q(animator, "animation");
    }
}
