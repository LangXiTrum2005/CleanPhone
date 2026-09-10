package com.smartdigimkt.n5;

import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public class e extends com.smartdigimkt.n5.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f37095e;

    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            View view = e.this.f37084a;
            if (view == null || view.getVisibility() != 0) {
                return;
            }
            e.this.f37084a.setScaleX(fFloatValue);
            e.this.f37084a.setScaleY(fFloatValue);
        }
    }

    public e(View view) {
        super(view);
        this.f37095e = 0.95f;
    }

    @Override // com.smartdigimkt.n5.a
    public ValueAnimator a() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, this.f37095e);
        valueAnimatorOfFloat.setDuration(500L);
        valueAnimatorOfFloat.setRepeatMode(2);
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.addUpdateListener(new a());
        return valueAnimatorOfFloat;
    }

    public void a(float f) {
        this.f37095e = f;
    }
}
