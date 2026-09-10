package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.animation.Animator;
import android.media.MediaPlayer;
import android.widget.ImageView;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.databinding.ActivityGunBinding;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.cb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3178cb implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4228a;
    public final /* synthetic */ C3355eb b;

    public /* synthetic */ C3178cb(C3355eb c3355eb, int i) {
        this.f4228a = i;
        this.b = c3355eb;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.f4228a;
        C3355eb c3355eb = this.b;
        switch (i) {
            case 0:
                AbstractC2995aW.q(animator, "animation");
                c3355eb.E = false;
                ImageView imageView = c3355eb.A.e;
                if (imageView != null) {
                    imageView.setEnabled(true);
                    break;
                }
                break;
            case 1:
                ((ActivityGunBinding) c3355eb.f4847a.getMBinding()).ivBoom.setTranslationY(0.0f);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.f4228a;
        C3355eb c3355eb = this.b;
        switch (i) {
            case 0:
                AbstractC2995aW.q(animator, "animation");
                c3355eb.E = false;
                ImageView imageView = c3355eb.A.e;
                if (imageView != null) {
                    imageView.setEnabled(true);
                    break;
                }
                break;
            case 1:
                ((ActivityGunBinding) c3355eb.f4847a.getMBinding()).ivBoom.setTranslationY(0.0f);
                break;
            case 2:
                break;
            default:
                C3355eb.o(c3355eb);
                try {
                    MediaPlayer mediaPlayer = c3355eb.B;
                    if (mediaPlayer != null) {
                        mediaPlayer.start();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        switch (this.f4228a) {
            case 0:
                AbstractC2995aW.q(animator, "animation");
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        ImageView imageView;
        int i = this.f4228a;
        C3355eb c3355eb = this.b;
        switch (i) {
            case 0:
                AbstractC2995aW.q(animator, "animation");
                boolean switchBoomBrokenScreen = c3355eb.b.getSwitchBoomBrokenScreen();
                C2770Ta c2770Ta = c3355eb.A;
                if (switchBoomBrokenScreen && (imageView = c2770Ta.e) != null) {
                    Oh0.e(imageView);
                }
                ImageView imageView2 = c2770Ta.e;
                if (imageView2 != null) {
                    imageView2.setEnabled(false);
                    break;
                }
                break;
            case 2:
                c3355eb.j(c3355eb.s);
                break;
        }
    }

    public C3178cb(C3355eb c3355eb) {
        this.f4228a = 1;
        this.b = c3355eb;
    }
}
