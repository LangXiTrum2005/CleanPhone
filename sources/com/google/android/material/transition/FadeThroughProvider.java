package com.google.android.material.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes4.dex */
public final class FadeThroughProvider implements VisibilityAnimatorProvider {

    /* JADX INFO: renamed from: com.google.android.material.transition.FadeThroughProvider$1, reason: invalid class name */
    class AnonymousClass1 implements ValueAnimator.AnimatorUpdateListener {
        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ((Float) valueAnimator.getAnimatedValue()).floatValue();
            RectF rectF = TransitionUtils.f19593a;
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.transition.FadeThroughProvider$2, reason: invalid class name */
    class AnonymousClass2 extends AnimatorListenerAdapter {
        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            throw null;
        }
    }
}
