package com.bytedance.sdk.openadsdk.core.mo;

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

/* JADX INFO: loaded from: classes3.dex */
public class mo extends FrameLayout {
    private boolean jpc;
    private Drawable lnr;
    private Drawable mml;
    private boolean mo;
    private Drawable mzz;
    private int qdl;
    private int ud;
    private ValueAnimator wd;

    public mo(Context context) {
        super(context);
        this.qdl = 100;
    }

    private void qdl() {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 10000);
        this.wd = valueAnimatorOfInt;
        valueAnimatorOfInt.setDuration(2000L);
        this.wd.setRepeatCount(-1);
        this.wd.setInterpolator(new LinearInterpolator());
        this.wd.setRepeatMode(1);
        this.wd.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.mo.mo.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                mo.this.setProgress(((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        });
        this.wd.start();
        setMax(10000);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mo = true;
        if (this.mzz != null) {
            qdl();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.mo = false;
        ValueAnimator valueAnimator = this.wd;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.wd.removeAllUpdateListeners();
            this.wd = null;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i2) {
        super.onVisibilityChanged(view, i2);
        if (i2 != 0) {
            ValueAnimator valueAnimator = this.wd;
            if (valueAnimator == null || this.jpc) {
                return;
            }
            this.jpc = true;
            valueAnimator.pause();
            return;
        }
        if (this.jpc) {
            this.jpc = false;
            ValueAnimator valueAnimator2 = this.wd;
            if (valueAnimator2 != null) {
                valueAnimator2.resume();
            } else {
                qdl();
            }
        }
    }

    public void setIndeterminateDrawable(Drawable drawable) {
        this.mzz = drawable;
        setProgressDrawable(drawable);
        if (this.mo && this.wd == null) {
            qdl();
        }
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(tvp.qdl(this, layoutParams));
    }

    public void setMax(int i2) {
        this.qdl = i2;
    }

    @Override // android.view.View
    public void setPadding(int i2, int i3, int i4, int i5) {
        super.setPaddingRelative(i2, i3, i4, i5);
    }

    public void setProgress(int i2) {
        this.ud = i2;
        Drawable drawable = this.lnr;
        if (drawable != null) {
            drawable.setLevel((int) ((i2 * 10000.0f) / this.qdl));
        }
    }

    public void setProgressDrawable(Drawable drawable) {
        this.mml = drawable;
        setBackground(drawable);
        Drawable drawable2 = this.mml;
        if (drawable2 instanceof LayerDrawable) {
            int numberOfLayers = ((LayerDrawable) drawable2).getNumberOfLayers();
            for (int i2 = 0; i2 < numberOfLayers; i2++) {
                Drawable drawable3 = ((LayerDrawable) this.mml).getDrawable(i2);
                if ((drawable3 instanceof ScaleDrawable) || (drawable3 instanceof ClipDrawable)) {
                    this.lnr = drawable3;
                }
            }
        }
        Drawable drawable4 = this.mml;
        if (drawable4 instanceof RotateDrawable) {
            this.lnr = drawable4;
        }
    }

    public mo(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.qdl = 100;
    }
}
