package com.bytedance.sdk.component.adexpress.lc;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public class kqm extends View {
    private ValueAnimator JXs;
    private Paint LD;
    private Context Lxb;
    private float ZU;
    private boolean ebl;
    private int lc;
    private RectF lk;

    public kqm(Context context) {
        super(context);
        this.lc = 1500;
        this.Lxb = context;
        Paint paint = new Paint();
        this.LD = paint;
        paint.setAntiAlias(true);
        this.LD.setStyle(Paint.Style.STROKE);
        this.LD.setStrokeWidth(10.0f);
        this.LD.setColor(Color.parseColor("#80FFFFFF"));
        this.lk = new RectF();
    }

    public void LD() {
        ValueAnimator valueAnimator = this.JXs;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    public void lk() {
        this.ebl = true;
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.ebl) {
            return;
        }
        canvas.drawArc(this.lk, 270.0f, this.ZU, false, this.LD);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        setMeasuredDimension(Math.min(size, size2), Math.min(size, size2));
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.lk.set(5.0f, 5.0f, i - 5, i2 - 5);
    }

    public void setDuration(int i) {
        this.lc = i;
    }

    public void Lxb() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 360.0f);
        this.JXs = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.lc);
        this.JXs.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.lc.kqm.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                kqm.this.ZU = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kqm.this.requestLayout();
            }
        });
        this.JXs.start();
    }
}
