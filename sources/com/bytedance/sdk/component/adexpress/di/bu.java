package com.bytedance.sdk.component.adexpress.di;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes2.dex */
public class bu extends View {
    private long di;
    private Paint fi;
    private ValueAnimator ik;
    private Animator.AnimatorListener jbs;
    private ValueAnimator ka;
    private float lr;
    private float mj;
    private int qt;
    private float ri;
    private float xha;

    public bu(Context context, int i) {
        super(context);
        this.di = 300L;
        this.xha = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.qt = i;
        ri();
    }

    public void ik() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.mj, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.ka = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.di);
        this.ka.setInterpolator(new LinearInterpolator());
        this.ka.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.di.bu.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                bu.this.xha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bu.this.invalidate();
            }
        });
        Animator.AnimatorListener animatorListener = this.jbs;
        if (animatorListener != null) {
            this.ka.addListener(animatorListener);
        }
        this.ka.start();
    }

    public void lr() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.mj);
        this.ik = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.di);
        this.ik.setInterpolator(new LinearInterpolator());
        this.ik.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.di.bu.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                bu.this.xha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bu.this.invalidate();
            }
        });
        this.ik.start();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawCircle(this.ri, this.lr, this.xha, this.fi);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.ri = i / 2.0f;
        this.lr = i2 / 2.0f;
        this.mj = (float) (Math.hypot(i, i2) / 2.0d);
    }

    public void setAnimationListener(Animator.AnimatorListener animatorListener) {
        this.jbs = animatorListener;
    }

    public void ri() {
        Paint paint = new Paint(1);
        this.fi = paint;
        paint.setStyle(Paint.Style.FILL);
        this.fi.setColor(this.qt);
    }
}
