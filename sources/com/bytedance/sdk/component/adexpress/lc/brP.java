package com.bytedance.sdk.component.adexpress.lc;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.view.animation.LinearInterpolator;

/* JADX INFO: loaded from: classes2.dex */
public class brP extends View {
    private Paint JXs;
    private float LD;
    private float Lxb;
    private float OY;
    private Animator.AnimatorListener QAg;
    private ValueAnimator ZU;
    private float ebl;
    private long lc;
    private ValueAnimator lk;
    private int nBu;

    public brP(Context context, int i) {
        super(context);
        this.lc = 300L;
        this.ebl = 0.0f;
        this.nBu = i;
        Lxb();
    }

    public void LD() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, this.OY);
        this.lk = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.lc);
        this.lk.setInterpolator(new LinearInterpolator());
        this.lk.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.lc.brP.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                brP.this.ebl = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                brP.this.invalidate();
            }
        });
        this.lk.start();
    }

    public void lk() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.OY, 0.0f);
        this.ZU = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.lc);
        this.ZU.setInterpolator(new LinearInterpolator());
        this.ZU.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.lc.brP.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                brP.this.ebl = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                brP.this.invalidate();
            }
        });
        Animator.AnimatorListener animatorListener = this.QAg;
        if (animatorListener != null) {
            this.ZU.addListener(animatorListener);
        }
        this.ZU.start();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawCircle(this.Lxb, this.LD, this.ebl, this.JXs);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.Lxb = i / 2.0f;
        this.LD = i2 / 2.0f;
        this.OY = (float) (Math.hypot(i, i2) / 2.0d);
    }

    public void setAnimationListener(Animator.AnimatorListener animatorListener) {
        this.QAg = animatorListener;
    }

    public void Lxb() {
        Paint paint = new Paint(1);
        this.JXs = paint;
        paint.setStyle(Paint.Style.FILL);
        this.JXs.setColor(this.nBu);
    }
}
