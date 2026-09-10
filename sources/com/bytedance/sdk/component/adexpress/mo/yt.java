package com.bytedance.sdk.component.adexpress.mo;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class yt extends View {
    private RectF lnr;
    private float mml;
    private int mo;
    private ValueAnimator mzz;
    private Context qdl;
    private Paint ud;
    private boolean wd;

    public yt(Context context) {
        super(context);
        this.mo = 1500;
        this.qdl = context;
        Paint paint = new Paint();
        this.ud = paint;
        paint.setAntiAlias(true);
        this.ud.setStyle(Paint.Style.STROKE);
        this.ud.setStrokeWidth(10.0f);
        this.ud.setColor(Color.parseColor("#80FFFFFF"));
        this.lnr = new RectF();
    }

    public void lnr() {
        this.wd = true;
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.wd) {
            return;
        }
        canvas.drawArc(this.lnr, 270.0f, this.mml, false, this.ud);
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i3);
        setMeasuredDimension(Math.min(size, size2), Math.min(size, size2));
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        this.lnr.set(5.0f, 5.0f, i2 - 5, i3 - 5);
    }

    public void setDuration(int i2) {
        this.mo = i2;
    }

    public void ud() {
        ValueAnimator valueAnimator = this.mzz;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    public void qdl() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 360.0f);
        this.mzz = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.mo);
        this.mzz.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.mo.yt.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                yt.this.mml = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yt.this.requestLayout();
            }
        });
        this.mzz.start();
    }
}
