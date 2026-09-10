package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.animation.Animator;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.databinding.DialogRateUsBinding;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.jX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3788jX implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4556a;
    public final /* synthetic */ DialogC4228oX b;

    public /* synthetic */ C3788jX(DialogC4228oX dialogC4228oX, int i) {
        this.f4556a = i;
        this.b = dialogC4228oX;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.f4556a) {
            case 0:
                AbstractC2995aW.q(animator, "animation");
                break;
            default:
                AbstractC2995aW.q(animator, "animation");
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f4556a) {
            case 0:
                AbstractC2995aW.q(animator, "animation");
                break;
            default:
                AbstractC2995aW.q(animator, "animation");
                DialogC4228oX dialogC4228oX = this.b;
                if (((DialogRateUsBinding) dialogC4228oX.a()).lavRating.getVisibility() != 4) {
                    ((DialogRateUsBinding) dialogC4228oX.a()).lavRating.setVisibility(4);
                    ((DialogRateUsBinding) dialogC4228oX.a()).ratingBar.setAlpha(1.0f);
                    ((DialogRateUsBinding) dialogC4228oX.a()).lavFiveStar.e();
                    break;
                }
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        switch (this.f4556a) {
            case 0:
                AbstractC2995aW.q(animator, "animation");
                ((DialogRateUsBinding) this.b.a()).lavFiveStar.setMinProgress(0.33f);
                break;
            default:
                AbstractC2995aW.q(animator, "animation");
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f4556a) {
            case 0:
                AbstractC2995aW.q(animator, "animation");
                break;
            default:
                AbstractC2995aW.q(animator, "animation");
                ((DialogRateUsBinding) this.b.a()).ratingBar.setAlpha(0.0f);
                break;
        }
    }
}
