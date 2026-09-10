package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public class Fade extends Visibility {

    public static class FadeAnimatorListener extends AnimatorListenerAdapter implements Transition.TransitionListener {
        public final View X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public boolean f8417Y = false;

        public FadeAnimatorListener(View view) {
            this.X = view;
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void a() {
            View view = this.X;
            view.setTag(com.charging.screenshow.battery.animations.themes.R.id.transition_pause_alpha, Float.valueOf(view.getVisibility() == 0 ? ViewUtils.f8453a.a(view) : 0.0f));
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void d() {
            this.X.setTag(com.charging.screenshow.battery.animations.themes.R.id.transition_pause_alpha, null);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void e(Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void f(Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void g(Transition transition) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            ViewUtils.f8453a.b(this.X, 1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            View view = this.X;
            if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
                this.f8417Y = true;
                view.setLayerType(2, null);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator, boolean z2) {
            boolean z3 = this.f8417Y;
            View view = this.X;
            if (z3) {
                view.setLayerType(0, null);
            }
            if (z2) {
                return;
            }
            ViewUtilsApi23 viewUtilsApi23 = ViewUtils.f8453a;
            viewUtilsApi23.b(view, 1.0f);
            viewUtilsApi23.getClass();
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void b(Transition transition) {
        }
    }

    public Fade(int i2) {
        this.C0 = i2;
    }

    public static float S(TransitionValues transitionValues, float f) {
        Float f2;
        return (transitionValues == null || (f2 = (Float) transitionValues.f8445a.get("android:fade:transitionAlpha")) == null) ? f : f2.floatValue();
    }

    @Override // androidx.transition.Visibility
    public final Animator P(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        ViewUtils.f8453a.getClass();
        return R(S(transitionValues, 0.0f), 1.0f, view);
    }

    @Override // androidx.transition.Visibility
    public final Animator Q(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        ViewUtilsApi23 viewUtilsApi23 = ViewUtils.f8453a;
        viewUtilsApi23.getClass();
        ObjectAnimator objectAnimatorR = R(S(transitionValues, 1.0f), 0.0f, view);
        if (objectAnimatorR == null) {
            viewUtilsApi23.b(view, S(transitionValues2, 1.0f));
        }
        return objectAnimatorR;
    }

    public final ObjectAnimator R(float f, float f2, View view) {
        if (f == f2) {
            return null;
        }
        ViewUtils.f8453a.b(view, f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) ViewUtils.f8454b, f2);
        FadeAnimatorListener fadeAnimatorListener = new FadeAnimatorListener(view);
        objectAnimatorOfFloat.addListener(fadeAnimatorListener);
        r().b(fadeAnimatorListener);
        return objectAnimatorOfFloat;
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public final void h(TransitionValues transitionValues) {
        Visibility.N(transitionValues);
        Float fValueOf = (Float) transitionValues.f8446b.getTag(com.charging.screenshow.battery.animations.themes.R.id.transition_pause_alpha);
        if (fValueOf == null) {
            if (transitionValues.f8446b.getVisibility() == 0) {
                fValueOf = Float.valueOf(ViewUtils.f8453a.a(transitionValues.f8446b));
            } else {
                fValueOf = Float.valueOf(0.0f);
            }
        }
        transitionValues.f8445a.put("android:fade:transitionAlpha", fValueOf);
    }
}
