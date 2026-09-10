package com.startapp.sdk.inappbrowser;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ProgressBar;

/* JADX INFO: loaded from: classes6.dex */
public class AnimatingProgressBar extends ProgressBar {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final AccelerateDecelerateInterpolator f40754c = new AccelerateDecelerateInterpolator();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ValueAnimator f40755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f40756b;

    public AnimatingProgressBar(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f40756b = true;
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f40755a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    @Override // android.widget.ProgressBar
    public void setProgress(int i2) {
        if (!this.f40756b) {
            super.setProgress(i2);
            return;
        }
        ValueAnimator valueAnimator = this.f40755a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            if (getProgress() >= i2) {
                return;
            }
        } else {
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(getProgress(), i2);
            this.f40755a = valueAnimatorOfInt;
            valueAnimatorOfInt.setInterpolator(f40754c);
            this.f40755a.addUpdateListener(new a(this));
        }
        this.f40755a.setIntValues(getProgress(), i2);
        this.f40755a.start();
    }

    public final void a() {
        super.setProgress(0);
        ValueAnimator valueAnimator = this.f40755a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }
}
