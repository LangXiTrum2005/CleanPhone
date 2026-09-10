package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;

/* JADX INFO: loaded from: classes4.dex */
final class CircularIndeterminateAnimatorDelegate extends IndeterminateAnimatorDelegate<ObjectAnimator> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f19375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f19376b;

    /* JADX INFO: renamed from: com.google.android.material.progressindicator.CircularIndeterminateAnimatorDelegate$1, reason: invalid class name */
    class AnonymousClass1 extends AnimatorListenerAdapter {
        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.progressindicator.CircularIndeterminateAnimatorDelegate$2, reason: invalid class name */
    class AnonymousClass2 extends AnimatorListenerAdapter {
        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.progressindicator.CircularIndeterminateAnimatorDelegate$3, reason: invalid class name */
    public class AnonymousClass3 extends Property<CircularIndeterminateAnimatorDelegate, Float> {
        @Override // android.util.Property
        public final Float get(CircularIndeterminateAnimatorDelegate circularIndeterminateAnimatorDelegate) {
            return Float.valueOf(circularIndeterminateAnimatorDelegate.f19375a);
        }

        @Override // android.util.Property
        public final void set(CircularIndeterminateAnimatorDelegate circularIndeterminateAnimatorDelegate, Float f) {
            circularIndeterminateAnimatorDelegate.f19375a = f.floatValue();
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.progressindicator.CircularIndeterminateAnimatorDelegate$4, reason: invalid class name */
    public class AnonymousClass4 extends Property<CircularIndeterminateAnimatorDelegate, Float> {
        @Override // android.util.Property
        public final Float get(CircularIndeterminateAnimatorDelegate circularIndeterminateAnimatorDelegate) {
            return Float.valueOf(circularIndeterminateAnimatorDelegate.f19376b);
        }

        @Override // android.util.Property
        public final void set(CircularIndeterminateAnimatorDelegate circularIndeterminateAnimatorDelegate, Float f) {
            circularIndeterminateAnimatorDelegate.f19376b = f.floatValue();
        }
    }

    static {
        new AnonymousClass3(Float.class, "animationFraction");
        new AnonymousClass4(Float.class, "completeEndFraction");
    }

    public final void a() {
    }
}
