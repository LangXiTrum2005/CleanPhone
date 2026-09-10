package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;

/* JADX INFO: loaded from: classes4.dex */
final class LinearIndeterminateDisjointAnimatorDelegate extends IndeterminateAnimatorDelegate<ObjectAnimator> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f19379b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f19380a;

    /* JADX INFO: renamed from: com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate$1, reason: invalid class name */
    class AnonymousClass1 extends AnimatorListenerAdapter {
        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate$2, reason: invalid class name */
    class AnonymousClass2 extends AnimatorListenerAdapter {
        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate$3, reason: invalid class name */
    public class AnonymousClass3 extends Property<LinearIndeterminateDisjointAnimatorDelegate, Float> {
        @Override // android.util.Property
        public final Float get(LinearIndeterminateDisjointAnimatorDelegate linearIndeterminateDisjointAnimatorDelegate) {
            return Float.valueOf(linearIndeterminateDisjointAnimatorDelegate.f19380a);
        }

        @Override // android.util.Property
        public final void set(LinearIndeterminateDisjointAnimatorDelegate linearIndeterminateDisjointAnimatorDelegate, Float f) {
            linearIndeterminateDisjointAnimatorDelegate.f19380a = f.floatValue();
            throw null;
        }
    }

    static {
        new AnonymousClass3(Float.class, "animationFraction");
    }

    public final void a() {
    }
}
