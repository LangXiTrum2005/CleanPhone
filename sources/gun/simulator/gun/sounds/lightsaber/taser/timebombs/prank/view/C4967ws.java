package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.animation.Animator;
import android.animation.AnimatorSet;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.dialog.LockHintDialog;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ws, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4967ws implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5202a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C4967ws(Object obj, int i) {
        this.f5202a = i;
        this.b = obj;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.f5202a;
        Object obj = this.b;
        switch (i) {
            case 0:
                AbstractC2995aW.q(animator, "animation");
                AnimatorSet animatorSet = ((DialogC5143ys) obj).e;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                break;
            case 1:
                AbstractC2995aW.q(animator, "animation");
                AnimatorSet animatorSet2 = ((LockHintDialog) obj).b;
                if (animatorSet2 != null) {
                    animatorSet2.cancel();
                }
                break;
            case 2:
                AbstractC2995aW.q(animator, "animation");
                AnimatorSet animatorSet3 = ((DialogC5143ys) obj).e;
                if (animatorSet3 != null) {
                    animatorSet3.cancel();
                }
                break;
            default:
                AbstractC2995aW.q(animator, "animation");
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f5202a) {
            case 0:
                AbstractC2995aW.q(animator, "animation");
                break;
            case 1:
                AbstractC2995aW.q(animator, "animation");
                break;
            case 2:
                AbstractC2995aW.q(animator, "animation");
                break;
            default:
                AbstractC2995aW.q(animator, "animation");
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        switch (this.f5202a) {
            case 0:
                AbstractC2995aW.q(animator, "animation");
                break;
            case 1:
                AbstractC2995aW.q(animator, "animation");
                break;
            case 2:
                AbstractC2995aW.q(animator, "animation");
                break;
            default:
                AbstractC2995aW.q(animator, "animation");
                break;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0050, code lost:
    
        if (r1.equals("LightSaber-K") == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0059, code lost:
    
        if (r1.equals("LightSaber-I") == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0062, code lost:
    
        if (r1.equals("LightSaber-G") == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006b, code lost:
    
        if (r1.equals("LightSaber-D") == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006e, code lost:
    
        if (r2 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0070, code lost:
    
        com.badlogic.gdx.backends.android.IControl.DefaultImpls.addAnimation$default(r2, "LIGHT_SABER_DISMISS", 10, "xiaoshi", false, 0.0f, null, 56, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0081, code lost:
    
        if (r2 == null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0083, code lost:
    
        com.badlogic.gdx.backends.android.IControl.DefaultImpls.addAnimation$default(r2, "LIGHT_SABER_DISMISS1", 11, "xiaoshi", false, 0.0f, null, 56, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009b, code lost:
    
        if (r1.equals("LightSaber-B") == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b1, code lost:
    
        if (r2 == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b3, code lost:
    
        com.badlogic.gdx.backends.android.IControl.DefaultImpls.addAnimation$default(r2, "LIGHT_SABER_DISMISS", 10, "xiaoshi", false, 0.0f, null, 56, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c4, code lost:
    
        if (r2 == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c6, code lost:
    
        com.badlogic.gdx.backends.android.IControl.DefaultImpls.addAnimation$default(r2, "LIGHT_SABER_DISMISS1", 11, "xiaoshi", false, 0.0f, null, 56, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d7, code lost:
    
        if (r2 == null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d9, code lost:
    
        com.badlogic.gdx.backends.android.IControl.DefaultImpls.addAnimation$default(r2, "LIGHT_SABER_DISMISS2", 12, "xiaoshi", false, 0.0f, null, 56, null);
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.animation.Animator.AnimatorListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onAnimationStart(android.animation.Animator r18) {
        /*
            Method dump skipped, instruction units count: 736
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4967ws.onAnimationStart(android.animation.Animator):void");
    }
}
