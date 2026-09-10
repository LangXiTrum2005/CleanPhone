package com.bytedance.sdk.component.adexpress.mo;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.view.animation.LinearInterpolator;

/* JADX INFO: loaded from: classes.dex */
public class jl extends View {
    private float jpc;
    private ValueAnimator lnr;
    private ValueAnimator mml;
    private long mo;
    private Paint mzz;
    private float qdl;
    private int to;
    private Animator.AnimatorListener tvp;
    private float ud;
    private float wd;

    public jl(Context context, int i2) {
        super(context);
        this.mo = 300L;
        this.wd = 0.0f;
        this.to = i2;
        qdl();
    }

    public void lnr() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.jpc, 0.0f);
        this.mml = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.mo);
        this.mml.setInterpolator(new LinearInterpolator());
        this.mml.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.mo.jl.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                jl.this.wd = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jl.this.invalidate();
            }
        });
        Animator.AnimatorListener animatorListener = this.tvp;
        if (animatorListener != null) {
            this.mml.addListener(animatorListener);
        }
        this.mml.start();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawCircle(this.qdl, this.ud, this.wd, this.mzz);
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        this.qdl = i2 / 2.0f;
        this.ud = i3 / 2.0f;
        this.jpc = (float) (Math.hypot(i2, i3) / 2.0d);
    }

    public void setAnimationListener(Animator.AnimatorListener animatorListener) {
        this.tvp = animatorListener;
    }

    public void ud() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, this.jpc);
        this.lnr = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.mo);
        this.lnr.setInterpolator(new LinearInterpolator());
        this.lnr.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.mo.jl.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                jl.this.wd = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jl.this.invalidate();
            }
        });
        this.lnr.start();
    }

    public void qdl() {
        Paint paint = new Paint(1);
        this.mzz = paint;
        paint.setStyle(Paint.Style.FILL);
        this.mzz.setColor(this.to);
    }
}
