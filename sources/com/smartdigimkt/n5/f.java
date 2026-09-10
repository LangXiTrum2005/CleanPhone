package com.smartdigimkt.n5;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.LinearInterpolator;

/* JADX INFO: loaded from: classes4.dex */
public class f extends a {
    public f(View view) {
        super(view);
    }

    @Override // com.smartdigimkt.n5.a
    public ValueAnimator a() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f37084a, "rotation", 0.0f, 4.0f, 0.0f, -4.0f, 0.0f);
        objectAnimatorOfFloat.setDuration(1000L);
        objectAnimatorOfFloat.setRepeatMode(1);
        objectAnimatorOfFloat.setRepeatCount(-1);
        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        return objectAnimatorOfFloat;
    }
}
