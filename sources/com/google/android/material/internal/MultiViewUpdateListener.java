package com.google.android.material.internal;

import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public class MultiViewUpdateListener implements ValueAnimator.AnimatorUpdateListener {

    public interface Listener {
        void a(ValueAnimator valueAnimator, View view);
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        throw null;
    }
}
