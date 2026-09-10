package com.bytedance.sdk.component.adexpress.mo;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.PathInterpolator;

/* JADX INFO: loaded from: classes.dex */
public class ljh extends View {
    private static int lnr = 50;
    private ObjectAnimator mml;
    private Paint qdl;
    private int ud;

    public ljh(Context context) {
        this(context, null);
    }

    private void lnr() {
        Paint paint = new Paint();
        this.qdl = paint;
        paint.setAntiAlias(true);
        this.qdl.setColor(Color.parseColor("#FFFFFFFF"));
        this.qdl.setStyle(Paint.Style.STROKE);
        this.qdl.setStrokeWidth(18.0f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "alpha", 1.0f, 0.0f);
        this.mml = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(200L);
    }

    @Override // android.view.View
    public void invalidate() {
        if (hasWindowFocus()) {
            super.invalidate();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        this.qdl.setShader(new LinearGradient(getMeasuredWidth() / 2, 0.0f, getMeasuredWidth() / 2, getMeasuredHeight(), -1, 16777215, Shader.TileMode.CLAMP));
        canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, this.ud, this.qdl);
    }

    public void ud() {
        clearAnimation();
    }

    public ljh(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public ljh(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.ud = 10;
        lnr();
    }

    public void qdl() {
        int iMin = ((int) Math.min(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f)) - 18;
        lnr = iMin;
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(10, iMin);
        valueAnimatorOfInt.setInterpolator(new PathInterpolator(0.0f, 0.2f, 0.3f, 1.0f));
        valueAnimatorOfInt.setDuration(800L);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.mo.ljh.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                ljh.this.ud = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                ljh.this.invalidate();
            }
        });
        valueAnimatorOfInt.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.mo.ljh.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                ljh.this.mml.start();
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                ljh.this.setVisibility(0);
                ljh.this.setAlpha(1.0f);
            }
        });
        valueAnimatorOfInt.start();
    }
}
