package androidx.media3.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ Object f7757Y;

    public /* synthetic */ f(Object obj, int i2) {
        this.X = i2;
        this.f7757Y = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Object obj = this.f7757Y;
        switch (this.X) {
            case 0:
                PlayerControlViewLayoutManager playerControlViewLayoutManager = (PlayerControlViewLayoutManager) obj;
                playerControlViewLayoutManager.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = playerControlViewLayoutManager.f7705b;
                if (view != null) {
                    view.setAlpha(fFloatValue);
                }
                ViewGroup viewGroup = playerControlViewLayoutManager.f7706c;
                if (viewGroup != null) {
                    viewGroup.setAlpha(fFloatValue);
                }
                ViewGroup viewGroup2 = playerControlViewLayoutManager.f7707e;
                if (viewGroup2 != null) {
                    viewGroup2.setAlpha(fFloatValue);
                }
                break;
            case 1:
                PlayerControlViewLayoutManager playerControlViewLayoutManager2 = (PlayerControlViewLayoutManager) obj;
                playerControlViewLayoutManager2.getClass();
                playerControlViewLayoutManager2.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 2:
                PlayerControlViewLayoutManager playerControlViewLayoutManager3 = (PlayerControlViewLayoutManager) obj;
                playerControlViewLayoutManager3.getClass();
                playerControlViewLayoutManager3.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 3:
                PlayerControlViewLayoutManager playerControlViewLayoutManager4 = (PlayerControlViewLayoutManager) obj;
                playerControlViewLayoutManager4.getClass();
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view2 = playerControlViewLayoutManager4.f7705b;
                if (view2 != null) {
                    view2.setAlpha(fFloatValue2);
                }
                ViewGroup viewGroup3 = playerControlViewLayoutManager4.f7706c;
                if (viewGroup3 != null) {
                    viewGroup3.setAlpha(fFloatValue2);
                }
                ViewGroup viewGroup4 = playerControlViewLayoutManager4.f7707e;
                if (viewGroup4 != null) {
                    viewGroup4.setAlpha(fFloatValue2);
                }
                break;
            default:
                int i2 = DefaultTimeBar.T0;
                DefaultTimeBar defaultTimeBar = (DefaultTimeBar) obj;
                defaultTimeBar.getClass();
                defaultTimeBar.J0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                defaultTimeBar.invalidate(defaultTimeBar.e0);
                break;
        }
    }
}
