package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.animation.Animator;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.q20, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4366q20 implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4865a;
    public final /* synthetic */ C4629t20 b;

    public /* synthetic */ C4366q20(C4629t20 c4629t20, int i) {
        this.f4865a = i;
        this.b = c4629t20;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.f4865a) {
            case 0:
                AbstractC2995aW.q(animator, "animation");
                C4629t20 c4629t20 = this.b;
                int i = c4629t20.h;
                c4629t20.z = false;
                break;
            default:
                AbstractC2995aW.q(animator, "animation");
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.f4865a;
        C4629t20 c4629t20 = this.b;
        switch (i) {
            case 0:
                AbstractC2995aW.q(animator, "animation");
                int i2 = c4629t20.h;
                c4629t20.z = false;
                break;
            default:
                AbstractC2995aW.q(animator, "animation");
                c4629t20.d.lavShootWarn.setVisibility(8);
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        switch (this.f4865a) {
            case 0:
                AbstractC2995aW.q(animator, "animation");
                break;
            default:
                AbstractC2995aW.q(animator, "animation");
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f4865a) {
            case 0:
                AbstractC2995aW.q(animator, "animation");
                this.b.z = true;
                break;
            default:
                AbstractC2995aW.q(animator, "animation");
                break;
        }
    }
}
