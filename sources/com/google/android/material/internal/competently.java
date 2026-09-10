package com.google.android.material.internal;

import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: compiled from: FadeThroughUpdateListener.java */
/* JADX INFO: loaded from: classes3.dex */
public class competently implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final View f20437attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final float[] f20438dern = new float[2];

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final View f20439saneness;

    public competently(View view, View view2) {
        this.f20437attabal = view;
        this.f20439saneness = view2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        impromptu.attabal(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f20438dern);
        View view = this.f20437attabal;
        if (view != null) {
            view.setAlpha(this.f20438dern[0]);
        }
        View view2 = this.f20439saneness;
        if (view2 != null) {
            view2.setAlpha(this.f20438dern[1]);
        }
    }
}
