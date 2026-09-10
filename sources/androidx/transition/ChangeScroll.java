package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class ChangeScroll extends Transition {
    public static final String[] C0 = {"android:changeScroll:x", "android:changeScroll:y"};

    public static void N(TransitionValues transitionValues) {
        HashMap map = transitionValues.f8445a;
        map.put("android:changeScroll:x", Integer.valueOf(transitionValues.f8446b.getScrollX()));
        map.put("android:changeScroll:y", Integer.valueOf(transitionValues.f8446b.getScrollY()));
    }

    @Override // androidx.transition.Transition
    public final void e(TransitionValues transitionValues) {
        N(transitionValues);
    }

    @Override // androidx.transition.Transition
    public final void h(TransitionValues transitionValues) {
        N(transitionValues);
    }

    @Override // androidx.transition.Transition
    public final Animator l(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        ObjectAnimator objectAnimatorOfInt;
        ObjectAnimator objectAnimatorOfInt2 = null;
        if (transitionValues == null || transitionValues2 == null) {
            return null;
        }
        View view = transitionValues2.f8446b;
        HashMap map = transitionValues.f8445a;
        int iIntValue = ((Integer) map.get("android:changeScroll:x")).intValue();
        HashMap map2 = transitionValues2.f8445a;
        int iIntValue2 = ((Integer) map2.get("android:changeScroll:x")).intValue();
        int iIntValue3 = ((Integer) map.get("android:changeScroll:y")).intValue();
        int iIntValue4 = ((Integer) map2.get("android:changeScroll:y")).intValue();
        if (iIntValue != iIntValue2) {
            view.setScrollX(iIntValue);
            objectAnimatorOfInt = ObjectAnimator.ofInt(view, "scrollX", iIntValue, iIntValue2);
        } else {
            objectAnimatorOfInt = null;
        }
        if (iIntValue3 != iIntValue4) {
            view.setScrollY(iIntValue3);
            objectAnimatorOfInt2 = ObjectAnimator.ofInt(view, "scrollY", iIntValue3, iIntValue4);
        }
        boolean z2 = TransitionUtils.f8441a;
        if (objectAnimatorOfInt == null) {
            return objectAnimatorOfInt2;
        }
        if (objectAnimatorOfInt2 == null) {
            return objectAnimatorOfInt;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfInt, objectAnimatorOfInt2);
        return animatorSet;
    }

    @Override // androidx.transition.Transition
    public final String[] t() {
        return C0;
    }
}
