package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class ViewPropertyAnimatorCompat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f4485a;

    public static class Api21Impl {
        public static ViewPropertyAnimator a(ViewPropertyAnimator viewPropertyAnimator, float f) {
            return viewPropertyAnimator.translationZ(f);
        }

        public static ViewPropertyAnimator b(ViewPropertyAnimator viewPropertyAnimator, float f) {
            return viewPropertyAnimator.translationZBy(f);
        }

        public static ViewPropertyAnimator c(ViewPropertyAnimator viewPropertyAnimator, float f) {
            return viewPropertyAnimator.z(f);
        }

        public static ViewPropertyAnimator d(ViewPropertyAnimator viewPropertyAnimator, float f) {
            return viewPropertyAnimator.zBy(f);
        }
    }

    public ViewPropertyAnimatorCompat(View view) {
        this.f4485a = new WeakReference(view);
    }

    public final void a(float f) {
        View view = (View) this.f4485a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
    }

    public final void b() {
        View view = (View) this.f4485a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void c(long j) {
        View view = (View) this.f4485a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
    }

    public final void d(final ViewPropertyAnimatorListener viewPropertyAnimatorListener) {
        final View view = (View) this.f4485a.get();
        if (view != null) {
            if (viewPropertyAnimatorListener != null) {
                view.animate().setListener(new AnimatorListenerAdapter() { // from class: androidx.core.view.ViewPropertyAnimatorCompat.1
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationCancel(Animator animator) {
                        viewPropertyAnimatorListener.a();
                    }

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animator) {
                        viewPropertyAnimatorListener.c();
                    }

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationStart(Animator animator) {
                        viewPropertyAnimatorListener.b();
                    }
                });
            } else {
                view.animate().setListener(null);
            }
        }
    }

    public final void e(float f) {
        View view = (View) this.f4485a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
    }
}
