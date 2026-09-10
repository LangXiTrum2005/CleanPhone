package com.bytedance.sdk.component.adexpress.di;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes2.dex */
public class slm extends View {
    private int di;
    private ValueAnimator fi;
    private RectF ik;
    private float ka;
    private Paint lr;
    private Context ri;
    private boolean xha;

    public slm(Context context) {
        super(context);
        this.di = 1500;
        this.ri = context;
        Paint paint = new Paint();
        this.lr = paint;
        paint.setAntiAlias(true);
        this.lr.setStyle(Paint.Style.STROKE);
        this.lr.setStrokeWidth(10.0f);
        this.lr.setColor(Color.parseColor("#80FFFFFF"));
        this.ik = new RectF();
    }

    public void ik() {
        this.xha = true;
        invalidate();
    }

    public void lr() {
        ValueAnimator valueAnimator = this.fi;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.xha) {
            return;
        }
        canvas.drawArc(this.ik, 270.0f, this.ka, false, this.lr);
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
        this.ik.set(5.0f, 5.0f, i - 5, i2 - 5);
    }

    public void setDuration(int i) {
        this.di = i;
    }

    public void ri() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 360.0f);
        this.fi = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.di);
        this.fi.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.di.slm.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                slm.this.ka = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                slm.this.requestLayout();
            }
        });
        this.fi.start();
    }
}
