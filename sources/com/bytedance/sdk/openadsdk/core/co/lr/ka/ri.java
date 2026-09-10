package com.bytedance.sdk.openadsdk.core.co.lr.ka;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.bytedance.adsdk.ugeno.ka;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes2.dex */
public class ri extends View {
    private int aw;
    private float bgr;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    private ValueAnimator f18113co;
    private float di;
    private int fi;
    private RectF ik;
    private int jbs;
    private int ka;
    private Paint lr;
    private int mj;
    private String qt;
    private Paint ri;
    private ka sf;
    private float xha;

    public ri(Context context) {
        super(context);
        this.ka = com.bytedance.adsdk.ugeno.xha.ri.ri("#FFD813");
        this.fi = com.bytedance.adsdk.ugeno.xha.ri.ri("rgba(0, 0, 0, 0.5)");
        this.di = 3.0f;
        this.xha = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.mj = 0;
        this.jbs = 100;
        this.qt = "line";
        this.aw = 1000;
        setBackgroundColor(0);
        ri();
    }

    private void lr(Canvas canvas) {
        Paint paint = this.ri;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        float width = getWidth();
        float f = this.di;
        float f2 = this.xha;
        canvas.drawRoundRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, width, f, f2, f2, this.ri);
        float width2 = (getWidth() * this.bgr) / this.jbs;
        this.lr.setStyle(style);
        if (!TextUtils.equals(this.qt, "line_reverse")) {
            float f3 = this.di;
            float f4 = this.xha;
            canvas.drawRoundRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, width2, f3, f4, f4, this.lr);
        } else {
            float width3 = getWidth() - width2;
            float width4 = getWidth();
            float f5 = this.di;
            float f6 = this.xha;
            canvas.drawRoundRect(width3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, width4, f5, f6, f6, this.lr);
        }
    }

    public int getMaxProgress() {
        return this.jbs;
    }

    public int getProgress() {
        return this.mj;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f18113co;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (TextUtils.equals(this.qt, "ring") || TextUtils.equals(this.qt, "ring_reverse")) {
            ri(canvas);
        } else {
            lr(canvas);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        ka kaVar = this.sf;
        if (kaVar != null) {
            int[] iArrRi = kaVar.ri(i, i2);
            super.onMeasure(iArrRi[0], iArrRi[1]);
        } else {
            super.onMeasure(i, i2);
        }
        if (TextUtils.equals(this.qt, "ring") || TextUtils.equals(this.qt, "ring_reverse")) {
            int iMin = Math.min(getMeasuredWidth(), getMeasuredHeight());
            setMeasuredDimension(iMin, iMin);
        } else {
            setMeasuredDimension(getMeasuredWidth(), (int) this.di);
        }
        ka kaVar2 = this.sf;
        if (kaVar2 != null) {
            kaVar2.fi();
        }
    }

    public void setAnimationDuration(int i) {
        this.aw = i;
        this.f18113co.setDuration(i);
    }

    public void setMaxProgress(int i) {
        this.jbs = i;
        invalidate();
    }

    public void setProgress(int i) {
        int iMin = Math.min(i, this.jbs);
        this.mj = iMin;
        if (iMin < 0) {
            this.mj = 0;
        }
        ValueAnimator valueAnimator = this.f18113co;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f18113co.setFloatValues(this.bgr, this.mj);
            this.f18113co.start();
        }
    }

    private void ri() {
        Paint paint = new Paint(1);
        this.ri = paint;
        paint.setColor(this.fi);
        Paint paint2 = this.ri;
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        Paint paint3 = new Paint(1);
        this.lr = paint3;
        paint3.setColor(this.ka);
        this.lr.setStyle(style);
        this.ik = new RectF();
        this.bgr = this.mj;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(new float[0]);
        this.f18113co = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.aw);
        this.f18113co.setInterpolator(new LinearInterpolator());
        this.f18113co.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.co.lr.ka.ri.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                ri.this.bgr = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ri.this.invalidate();
            }
        });
    }

    public ri lr(int i) {
        this.ri.setColor(i);
        return this;
    }

    public ri lr(float f) {
        this.xha = f;
        return this;
    }

    private void ri(Canvas canvas) {
        float f;
        int i;
        float f2 = this.di / 2.0f;
        this.ik.set(f2, f2, getWidth() - f2, getHeight() - f2);
        Paint paint = this.ri;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        this.ri.setStrokeWidth(this.di);
        canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, (getWidth() / 2.0f) - f2, this.ri);
        if (TextUtils.equals(this.qt, "ring_reverse")) {
            f = this.bgr * (-360.0f);
            i = this.jbs;
        } else {
            f = this.bgr * 360.0f;
            i = this.jbs;
        }
        float f3 = f / i;
        this.lr.setStyle(style);
        this.lr.setStrokeWidth(this.di);
        if (this.xha <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            this.lr.setStrokeCap(Paint.Cap.SQUARE);
        } else {
            this.lr.setStrokeCap(Paint.Cap.ROUND);
        }
        canvas.drawArc(this.ik, -90.0f, f3, false, this.lr);
    }

    public ri ri(int i) {
        this.lr.setColor(i);
        return this;
    }

    public ri ri(float f) {
        this.di = f;
        invalidate();
        return this;
    }

    public ri ri(String str) {
        this.qt = str;
        return this;
    }

    public void ri(ka kaVar) {
        this.sf = kaVar;
    }
}
