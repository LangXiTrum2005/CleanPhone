package com.google.android.material.internal;

import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: compiled from: MultiViewUpdateListener.java */
/* JADX INFO: loaded from: classes3.dex */
public class triweekly implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final attabal f20536attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final View[] f20537saneness;

    /* JADX INFO: compiled from: MultiViewUpdateListener.java */
    public interface attabal {
        void attabal(ValueAnimator valueAnimator, View view);
    }

    public triweekly(attabal attabalVar, View... viewArr) {
        this.f20536attabal = attabalVar;
        this.f20537saneness = viewArr;
    }

    public static triweekly apical(View... viewArr) {
        return new triweekly(new attabal() { // from class: com.google.android.material.internal.cutely
            @Override // com.google.android.material.internal.triweekly.attabal
            public final void attabal(ValueAnimator valueAnimator, View view) {
                triweekly.taiyuan(valueAnimator, view);
            }
        }, viewArr);
    }

    public static triweekly beachfront(View... viewArr) {
        return new triweekly(new attabal() { // from class: com.google.android.material.internal.formularize
            @Override // com.google.android.material.internal.triweekly.attabal
            public final void attabal(ValueAnimator valueAnimator, View view) {
                triweekly.impromptu(valueAnimator, view);
            }
        }, viewArr);
    }

    public static void competently(ValueAnimator valueAnimator, View view) {
        view.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static void cutely(ValueAnimator valueAnimator, View view) {
        view.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static triweekly formularize(View... viewArr) {
        return new triweekly(new attabal() { // from class: com.google.android.material.internal.apical
            @Override // com.google.android.material.internal.triweekly.attabal
            public final void attabal(ValueAnimator valueAnimator, View view) {
                triweekly.cutely(valueAnimator, view);
            }
        }, viewArr);
    }

    public static void impromptu(ValueAnimator valueAnimator, View view) {
        Float f = (Float) valueAnimator.getAnimatedValue();
        view.setScaleX(f.floatValue());
        view.setScaleY(f.floatValue());
    }

    public static triweekly marial(View... viewArr) {
        return new triweekly(new attabal() { // from class: com.google.android.material.internal.impassible
            @Override // com.google.android.material.internal.triweekly.attabal
            public final void attabal(ValueAnimator valueAnimator, View view) {
                triweekly.competently(valueAnimator, view);
            }
        }, viewArr);
    }

    public static void taiyuan(ValueAnimator valueAnimator, View view) {
        view.setTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        for (View view : this.f20537saneness) {
            this.f20536attabal.attabal(valueAnimator, view);
        }
    }
}
