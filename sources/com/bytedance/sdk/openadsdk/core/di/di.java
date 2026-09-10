package com.bytedance.sdk.openadsdk.core.di;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RotateDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes2.dex */
public class di extends FrameLayout {
    private boolean di;
    private Drawable fi;
    private Drawable ik;
    private Drawable ka;
    private int lr;
    private boolean mj;
    private int ri;
    private ValueAnimator xha;

    public di(Context context) {
        super(context);
        this.ri = 100;
    }

    private void ri() {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 10000);
        this.xha = valueAnimatorOfInt;
        valueAnimatorOfInt.setDuration(2000L);
        this.xha.setRepeatCount(-1);
        this.xha.setInterpolator(new LinearInterpolator());
        this.xha.setRepeatMode(1);
        this.xha.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.di.di.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                di.this.setProgress(((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        });
        this.xha.start();
        setMax(10000);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.di = true;
        if (this.fi != null) {
            ri();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.di = false;
        ValueAnimator valueAnimator = this.xha;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.xha.removeAllUpdateListeners();
            this.xha = null;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i != 0) {
            ValueAnimator valueAnimator = this.xha;
            if (valueAnimator == null || this.mj) {
                return;
            }
            this.mj = true;
            valueAnimator.pause();
            return;
        }
        if (this.mj) {
            this.mj = false;
            ValueAnimator valueAnimator2 = this.xha;
            if (valueAnimator2 != null) {
                valueAnimator2.resume();
            } else {
                ri();
            }
        }
    }

    public void setIndeterminateDrawable(Drawable drawable) {
        this.fi = drawable;
        setProgressDrawable(drawable);
        if (this.di && this.xha == null) {
            ri();
        }
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(jbs.ri(this, layoutParams));
    }

    public void setMax(int i) {
        this.ri = i;
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i, i2, i3, i4);
    }

    public void setProgress(int i) {
        this.lr = i;
        Drawable drawable = this.ik;
        if (drawable != null) {
            drawable.setLevel((int) ((i * 10000.0f) / this.ri));
        }
    }

    public void setProgressDrawable(Drawable drawable) {
        this.ka = drawable;
        setBackground(drawable);
        Drawable drawable2 = this.ka;
        if (drawable2 instanceof LayerDrawable) {
            int numberOfLayers = ((LayerDrawable) drawable2).getNumberOfLayers();
            for (int i = 0; i < numberOfLayers; i++) {
                Drawable drawable3 = ((LayerDrawable) this.ka).getDrawable(i);
                if ((drawable3 instanceof ScaleDrawable) || (drawable3 instanceof ClipDrawable)) {
                    this.ik = drawable3;
                }
            }
        }
        Drawable drawable4 = this.ka;
        if (drawable4 instanceof RotateDrawable) {
            this.ik = drawable4;
        }
    }

    public di(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.ri = 100;
    }
}
