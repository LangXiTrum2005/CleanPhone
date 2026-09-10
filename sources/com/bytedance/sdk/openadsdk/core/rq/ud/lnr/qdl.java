package com.bytedance.sdk.openadsdk.core.rq.ud.lnr;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.bytedance.adsdk.ugeno.mml;

/* JADX INFO: loaded from: classes3.dex */
public class qdl extends View {
    private int exu;
    private ValueAnimator fs;
    private int jpc;
    private RectF lnr;
    private int mml;
    private float mo;
    private int mzz;
    private Paint qdl;
    private float rdp;
    private mml rq;
    private String to;
    private int tvp;
    private Paint ud;
    private float wd;

    public qdl(Context context) {
        super(context);
        this.mml = com.bytedance.adsdk.ugeno.wd.qdl.qdl("#FFD813");
        this.mzz = com.bytedance.adsdk.ugeno.wd.qdl.qdl("rgba(0, 0, 0, 0.5)");
        this.mo = 3.0f;
        this.wd = 0.0f;
        this.jpc = 0;
        this.tvp = 100;
        this.to = "line";
        this.exu = 1000;
        setBackgroundColor(0);
        qdl();
    }

    private void ud(Canvas canvas) {
        Paint paint = this.qdl;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        float width = getWidth();
        float f = this.mo;
        float f2 = this.wd;
        canvas.drawRoundRect(0.0f, 0.0f, width, f, f2, f2, this.qdl);
        float width2 = (getWidth() * this.rdp) / this.tvp;
        this.ud.setStyle(style);
        if (!TextUtils.equals(this.to, "line_reverse")) {
            float f3 = this.mo;
            float f4 = this.wd;
            canvas.drawRoundRect(0.0f, 0.0f, width2, f3, f4, f4, this.ud);
        } else {
            float width3 = getWidth() - width2;
            float width4 = getWidth();
            float f5 = this.mo;
            float f6 = this.wd;
            canvas.drawRoundRect(width3, 0.0f, width4, f5, f6, f6, this.ud);
        }
    }

    public int getMaxProgress() {
        return this.tvp;
    }

    public int getProgress() {
        return this.jpc;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.fs;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (TextUtils.equals(this.to, "ring") || TextUtils.equals(this.to, "ring_reverse")) {
            qdl(canvas);
        } else {
            ud(canvas);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        mml mmlVar = this.rq;
        if (mmlVar != null) {
            int[] iArrQdl = mmlVar.qdl(i2, i3);
            super.onMeasure(iArrQdl[0], iArrQdl[1]);
        } else {
            super.onMeasure(i2, i3);
        }
        if (TextUtils.equals(this.to, "ring") || TextUtils.equals(this.to, "ring_reverse")) {
            int iMin = Math.min(getMeasuredWidth(), getMeasuredHeight());
            setMeasuredDimension(iMin, iMin);
        } else {
            setMeasuredDimension(getMeasuredWidth(), (int) this.mo);
        }
        mml mmlVar2 = this.rq;
        if (mmlVar2 != null) {
            mmlVar2.mzz();
        }
    }

    public void setAnimationDuration(int i2) {
        this.exu = i2;
        this.fs.setDuration(i2);
    }

    public void setMaxProgress(int i2) {
        this.tvp = i2;
        invalidate();
    }

    public void setProgress(int i2) {
        int iMin = Math.min(i2, this.tvp);
        this.jpc = iMin;
        if (iMin < 0) {
            this.jpc = 0;
        }
        ValueAnimator valueAnimator = this.fs;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.fs.setFloatValues(this.rdp, this.jpc);
            Log.d("UGenRender", "setProgress: animatedProgress=" + this.rdp + " progress=" + i2);
            this.fs.start();
        }
    }

    private void qdl() {
        Paint paint = new Paint(1);
        this.qdl = paint;
        paint.setColor(this.mzz);
        Paint paint2 = this.qdl;
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        Paint paint3 = new Paint(1);
        this.ud = paint3;
        paint3.setColor(this.mml);
        this.ud.setStyle(style);
        this.lnr = new RectF();
        this.rdp = this.jpc;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(new float[0]);
        this.fs = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.exu);
        this.fs.setInterpolator(new LinearInterpolator());
        this.fs.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.rq.ud.lnr.qdl.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                qdl.this.rdp = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qdl.this.invalidate();
            }
        });
    }

    public qdl ud(int i2) {
        this.qdl.setColor(i2);
        return this;
    }

    public qdl ud(float f) {
        this.wd = f;
        return this;
    }

    private void qdl(Canvas canvas) {
        float f;
        int i2;
        float f2 = this.mo / 2.0f;
        this.lnr.set(f2, f2, getWidth() - f2, getHeight() - f2);
        Paint paint = this.qdl;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        this.qdl.setStrokeWidth(this.mo);
        canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, (getWidth() / 2.0f) - f2, this.qdl);
        if (TextUtils.equals(this.to, "ring_reverse")) {
            f = this.rdp * (-360.0f);
            i2 = this.tvp;
        } else {
            f = this.rdp * 360.0f;
            i2 = this.tvp;
        }
        float f3 = f / i2;
        this.ud.setStyle(style);
        this.ud.setStrokeWidth(this.mo);
        if (this.wd <= 0.0f) {
            this.ud.setStrokeCap(Paint.Cap.SQUARE);
        } else {
            this.ud.setStrokeCap(Paint.Cap.ROUND);
        }
        canvas.drawArc(this.lnr, -90.0f, f3, false, this.ud);
    }

    public qdl qdl(int i2) {
        this.ud.setColor(i2);
        return this;
    }

    public qdl qdl(float f) {
        this.mo = f;
        invalidate();
        return this;
    }

    public qdl qdl(String str) {
        this.to = str;
        return this;
    }

    public void qdl(mml mmlVar) {
        this.rq = mmlVar;
    }
}
