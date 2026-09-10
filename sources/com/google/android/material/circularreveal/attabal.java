package com.google.android.material.circularreveal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;

/* JADX INFO: compiled from: CircularRevealCompat.java */
/* JADX INFO: loaded from: classes3.dex */
public final class attabal {

    /* JADX INFO: renamed from: com.google.android.material.circularreveal.attabal$attabal, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CircularRevealCompat.java */
    public class C0299attabal extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final /* synthetic */ dern f19991attabal;

        public C0299attabal(dern dernVar) {
            this.f19991attabal = dernVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f19991attabal.destroyCircularRevealCache();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f19991attabal.buildCircularRevealCache();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Animator attabal(dern dernVar, float f, float f2, float f3) {
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(dernVar, (Property<dern, V>) dern.C0300dern.f19993attabal, (TypeEvaluator) dern.saneness.f19997saneness, (Object[]) new dern.marial[]{new dern.marial(f, f2, f3)});
        dern.marial revealInfo = dernVar.getRevealInfo();
        if (revealInfo == null) {
            throw new IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
        }
        Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal((View) dernVar, (int) f, (int) f2, revealInfo.f19995dern, f3);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfObject, animatorCreateCircularReveal);
        return animatorSet;
    }

    public static Animator.AnimatorListener saneness(dern dernVar) {
        return new C0299attabal(dernVar);
    }
}
