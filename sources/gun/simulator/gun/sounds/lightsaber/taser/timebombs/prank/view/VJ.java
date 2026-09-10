package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.animation.ValueAnimator;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.motion.MaterialMainContainerBackHelper;
import com.google.android.material.navigation.DrawerLayoutUtils;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class VJ implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3868a;
    public final /* synthetic */ Object b;

    public /* synthetic */ VJ(Object obj, int i) {
        this.f3868a = i;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.f3868a;
        Object obj = this.b;
        switch (i) {
            case 0:
                C3160cK c3160cK = (C3160cK) obj;
                B6 b6 = c3160cK.J;
                if (b6 == null) {
                    b6 = B6.f2856a;
                }
                if (b6 != B6.b) {
                    C4948wh c4948wh = c3160cK.o;
                    if (c4948wh != null) {
                        c4948wh.r(c3160cK.b.e());
                    }
                } else {
                    c3160cK.invalidateSelf();
                }
                break;
            case 1:
                C2757Sn c2757Sn = (C2757Sn) obj;
                int i2 = C2757Sn.N;
                c2757Sn.getClass();
                c2757Sn.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c2757Sn.invalidate(c2757Sn.f3736a);
                break;
            case 2:
                MaterialMainContainerBackHelper.lambda$createCornerAnimator$0((ClippableRoundedCornerLayout) obj, valueAnimator);
                break;
            case 3:
                DrawerLayoutUtils.lambda$getScrimCloseAnimatorUpdateListener$0((DrawerLayout) obj, valueAnimator);
                break;
            default:
                C4629t20 c4629t20 = (C4629t20) obj;
                AbstractC2995aW.q(c4629t20, "this$0");
                AbstractC2995aW.q(valueAnimator, "snapAnim");
                Object animatedValue = valueAnimator.getAnimatedValue();
                AbstractC2995aW.o(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                c4629t20.l(c4629t20.M, ((Float) animatedValue).floatValue());
                break;
        }
    }
}
