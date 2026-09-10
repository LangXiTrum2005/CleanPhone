package com.startapp.sdk.inappbrowser;

import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AnimatingProgressBar f40766a;

    public a(AnimatingProgressBar animatingProgressBar) {
        this.f40766a = animatingProgressBar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        super/*android.widget.ProgressBar*/.setProgress(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
