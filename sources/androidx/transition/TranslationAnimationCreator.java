package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes.dex */
class TranslationAnimationCreator {

    public static class TransitionPositionListener extends AnimatorListenerAdapter implements Transition.TransitionListener {
        public int[] X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public boolean f8451Y;

        @Override // androidx.transition.Transition.TransitionListener
        public final void a() {
            if (this.X == null) {
                this.X = new int[2];
            }
            throw null;
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void c(Transition transition) {
            if (!this.f8451Y) {
                throw null;
            }
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void d() {
            throw null;
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void e(Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void f(Transition transition) {
            c(transition);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void g(Transition transition) {
            this.f8451Y = true;
            throw null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.f8451Y = true;
            throw null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            throw null;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator, boolean z2) {
            if (!z2) {
                throw null;
            }
        }
    }
}
