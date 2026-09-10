package com.bytedance.sdk.component.adexpress.lc;

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
import androidx.core.view.ViewCompat;

/* JADX INFO: loaded from: classes2.dex */
public class eK extends View {
    private static int lk = 50;
    private int LD;
    private Paint Lxb;
    private ObjectAnimator ZU;

    public eK(Context context) {
        this(context, null);
    }

    private void lk() {
        Paint paint = new Paint();
        this.Lxb = paint;
        paint.setAntiAlias(true);
        this.Lxb.setColor(Color.parseColor("#FFFFFFFF"));
        this.Lxb.setStyle(Paint.Style.STROKE);
        this.Lxb.setStrokeWidth(18.0f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "alpha", 1.0f, 0.0f);
        this.ZU = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(200L);
    }

    public void LD() {
        clearAnimation();
    }

    @Override // android.view.View
    public void invalidate() {
        if (hasWindowFocus()) {
            super.invalidate();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        this.Lxb.setShader(new LinearGradient(getMeasuredWidth() / 2, 0.0f, getMeasuredWidth() / 2, getMeasuredHeight(), -1, ViewCompat.MEASURED_SIZE_MASK, Shader.TileMode.CLAMP));
        canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, this.LD, this.Lxb);
    }

    public eK(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public eK(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LD = 10;
        lk();
    }

    public void Lxb() {
        int iMin = ((int) Math.min(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f)) - 18;
        lk = iMin;
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(10, iMin);
        valueAnimatorOfInt.setInterpolator(new PathInterpolator(0.0f, 0.2f, 0.3f, 1.0f));
        valueAnimatorOfInt.setDuration(800L);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.lc.eK.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                eK.this.LD = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                eK.this.invalidate();
            }
        });
        valueAnimatorOfInt.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.lc.eK.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                eK.this.ZU.start();
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                eK.this.setVisibility(0);
                eK.this.setAlpha(1.0f);
            }
        });
        valueAnimatorOfInt.start();
    }
}
