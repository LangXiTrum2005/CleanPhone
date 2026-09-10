package com.thinkup.core.common.inner.ui.o.o;

import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: loaded from: classes6.dex */
public final class oo extends o {
    private float oo;

    public oo(View view) {
        super(view);
        this.oo = 0.95f;
    }

    public final void on() {
        this.oo = 0.85f;
    }

    @Override // com.thinkup.core.common.inner.ui.o.o.o
    public final ValueAnimator oo() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, this.oo);
        valueAnimatorOfFloat.setDuration(500L);
        valueAnimatorOfFloat.setRepeatMode(2);
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.thinkup.core.common.inner.ui.o.o.oo.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = oo.this.o;
                if (view == null || view.getVisibility() != 0) {
                    return;
                }
                oo.this.o.setScaleX(fFloatValue);
                oo.this.o.setScaleY(fFloatValue);
            }
        });
        return valueAnimatorOfFloat;
    }
}
