package androidx.transition;

import android.animation.Animator;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

/* JADX INFO: loaded from: classes.dex */
public class Explode extends Visibility {
    static {
        new DecelerateInterpolator();
        new AccelerateInterpolator();
    }

    @Override // androidx.transition.Visibility
    public final Animator P(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues2 == null) {
            return null;
        }
        view.getTranslationX();
        view.getTranslationY();
        viewGroup.getLocationOnScreen(null);
        throw null;
    }

    @Override // androidx.transition.Visibility
    public final Animator Q(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues == null) {
            return null;
        }
        Rect rect = (Rect) transitionValues.f8445a.get("android:explode:screenBounds");
        int i2 = rect.left;
        view.getTranslationX();
        view.getTranslationY();
        int[] iArr = (int[]) transitionValues.f8446b.getTag(com.charging.screenshow.battery.animations.themes.R.id.transition_position);
        if (iArr != null) {
            rect.offsetTo(iArr[0], iArr[1]);
        }
        viewGroup.getLocationOnScreen(null);
        throw null;
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public final void e(TransitionValues transitionValues) {
        Visibility.N(transitionValues);
        transitionValues.f8446b.getLocationOnScreen(null);
        throw null;
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public final void h(TransitionValues transitionValues) {
        Visibility.N(transitionValues);
        transitionValues.f8446b.getLocationOnScreen(null);
        throw null;
    }
}
