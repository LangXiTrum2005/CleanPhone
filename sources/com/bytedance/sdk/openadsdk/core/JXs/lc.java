package com.bytedance.sdk.openadsdk.core.JXs;

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
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public class lc extends FrameLayout {
    private Drawable JXs;
    private int LD;
    private int Lxb;
    private boolean OY;
    private Drawable ZU;
    private ValueAnimator ebl;
    private boolean lc;
    private Drawable lk;

    public lc(Context context) {
        super(context);
        this.Lxb = 100;
    }

    private void Lxb() {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 10000);
        this.ebl = valueAnimatorOfInt;
        valueAnimatorOfInt.setDuration(2000L);
        this.ebl.setRepeatCount(-1);
        this.ebl.setInterpolator(new LinearInterpolator());
        this.ebl.setRepeatMode(1);
        this.ebl.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.JXs.lc.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                lc.this.setProgress(((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        });
        this.ebl.start();
        setMax(10000);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.lc = true;
        if (this.JXs != null) {
            Lxb();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.lc = false;
        ValueAnimator valueAnimator = this.ebl;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.ebl.removeAllUpdateListeners();
            this.ebl = null;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public void onVisibilityChanged(@NonNull View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i != 0) {
            ValueAnimator valueAnimator = this.ebl;
            if (valueAnimator == null || this.OY) {
                return;
            }
            this.OY = true;
            valueAnimator.pause();
            return;
        }
        if (this.OY) {
            this.OY = false;
            ValueAnimator valueAnimator2 = this.ebl;
            if (valueAnimator2 != null) {
                valueAnimator2.resume();
            } else {
                Lxb();
            }
        }
    }

    public void setIndeterminateDrawable(Drawable drawable) {
        this.JXs = drawable;
        setProgressDrawable(drawable);
        if (this.lc && this.ebl == null) {
            Lxb();
        }
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(QAg.Lxb(this, layoutParams));
    }

    public void setMax(int i) {
        this.Lxb = i;
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i, i2, i3, i4);
    }

    public void setProgress(int i) {
        this.LD = i;
        Drawable drawable = this.lk;
        if (drawable != null) {
            drawable.setLevel((int) ((i * 10000.0f) / this.Lxb));
        }
    }

    public void setProgressDrawable(Drawable drawable) {
        this.ZU = drawable;
        setBackground(drawable);
        Drawable drawable2 = this.ZU;
        if (drawable2 instanceof LayerDrawable) {
            int numberOfLayers = ((LayerDrawable) drawable2).getNumberOfLayers();
            for (int i = 0; i < numberOfLayers; i++) {
                Drawable drawable3 = ((LayerDrawable) this.ZU).getDrawable(i);
                if ((drawable3 instanceof ScaleDrawable) || (drawable3 instanceof ClipDrawable)) {
                    this.lk = drawable3;
                }
            }
        }
        Drawable drawable4 = this.ZU;
        if (drawable4 instanceof RotateDrawable) {
            this.lk = drawable4;
        }
    }

    public lc(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.Lxb = 100;
    }
}
