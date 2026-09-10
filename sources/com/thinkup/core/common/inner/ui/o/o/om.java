package com.thinkup.core.common.inner.ui.o.o;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.LinearInterpolator;

/* JADX INFO: loaded from: classes6.dex */
public final class om extends o {
    public om(View view) {
        super(view);
    }

    @Override // com.thinkup.core.common.inner.ui.o.o.o
    public final ValueAnimator oo() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.o, "rotation", 0.0f, 4.0f, 0.0f, -4.0f, 0.0f);
        objectAnimatorOfFloat.setDuration(1000L);
        objectAnimatorOfFloat.setRepeatMode(1);
        objectAnimatorOfFloat.setRepeatCount(-1);
        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        return objectAnimatorOfFloat;
    }
}
