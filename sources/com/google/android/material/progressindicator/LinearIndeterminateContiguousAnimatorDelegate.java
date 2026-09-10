package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;

/* JADX INFO: loaded from: classes4.dex */
final class LinearIndeterminateContiguousAnimatorDelegate extends IndeterminateAnimatorDelegate<ObjectAnimator> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f19378a;

    /* JADX INFO: renamed from: com.google.android.material.progressindicator.LinearIndeterminateContiguousAnimatorDelegate$1, reason: invalid class name */
    class AnonymousClass1 extends AnimatorListenerAdapter {
        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.progressindicator.LinearIndeterminateContiguousAnimatorDelegate$2, reason: invalid class name */
    public class AnonymousClass2 extends Property<LinearIndeterminateContiguousAnimatorDelegate, Float> {
        @Override // android.util.Property
        public final Float get(LinearIndeterminateContiguousAnimatorDelegate linearIndeterminateContiguousAnimatorDelegate) {
            return Float.valueOf(linearIndeterminateContiguousAnimatorDelegate.f19378a);
        }

        @Override // android.util.Property
        public final void set(LinearIndeterminateContiguousAnimatorDelegate linearIndeterminateContiguousAnimatorDelegate, Float f) {
            linearIndeterminateContiguousAnimatorDelegate.f19378a = f.floatValue();
            throw null;
        }
    }

    static {
        new AnonymousClass2(Float.class, "animationFraction");
    }
}
