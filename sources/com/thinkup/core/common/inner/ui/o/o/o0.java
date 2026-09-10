package com.thinkup.core.common.inner.ui.o.o;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.thinkup.core.common.ooo.o00;

/* JADX INFO: loaded from: classes6.dex */
public class o0 extends o {
    private Paint m0;
    private RectF mm;
    private Bitmap mn;
    private Canvas mo;
    private int n0;
    private int nm;
    private int nn;
    private int no;
    private int o00;
    private int o0o;
    private Paint om;
    private Paint on;
    private int oo;

    public o0(View view) {
        super(view);
        if (view == null) {
            return;
        }
        this.o0o = o00.o(view.getContext(), 5.0f);
        this.n0 = o00.o(view.getContext(), 24.0f);
        this.nn = o00.o(view.getContext(), 30.0f);
        this.oo = 20;
        Paint paint = new Paint(1);
        this.om = paint;
        paint.setColor(Color.parseColor("#cfffffff"));
        Paint paint2 = new Paint(1);
        this.on = paint2;
        paint2.setColor(-16777216);
        this.on.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        Paint paint3 = new Paint(1);
        this.m0 = paint3;
        paint3.setColor(-16777216);
        this.om.setStrokeWidth(this.o0o);
        this.om.setMaskFilter(new BlurMaskFilter(this.oo, BlurMaskFilter.Blur.NORMAL));
        int i2 = -this.o0o;
        this.no = i2;
        this.nm = i2 - this.nn;
    }

    @Override // com.thinkup.core.common.inner.ui.o.o.o
    public final void om() {
        super.om();
        if (this.o == null || this.f41855n == 0 || this.o0 == 0) {
            return;
        }
        try {
            int i2 = (int) (((double) this.f41855n) * 0.1d);
            this.nn = i2;
            this.nm = this.no - i2;
            RectF rectF = new RectF();
            this.mm = rectF;
            rectF.left = 0.0f;
            rectF.top = 0.0f;
            int i3 = this.f41855n;
            rectF.right = i3;
            int i4 = this.o0;
            rectF.bottom = i4;
            this.mn = Bitmap.createBitmap(i3, i4, Bitmap.Config.ARGB_8888);
            this.mo = new Canvas(this.mn);
        } catch (Throwable unused) {
        }
    }

    @Override // com.thinkup.core.common.inner.ui.o.o.o
    public final ValueAnimator oo() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(1200L);
        valueAnimatorOfFloat.setRepeatMode(1);
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.thinkup.core.common.inner.ui.o.o.o0.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                View view = o0.this.o;
                if (view == null || view.getVisibility() != 0) {
                    return;
                }
                if (o0.this.mn == null && o0.this.mo == null) {
                    return;
                }
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o0 o0Var = o0.this;
                o0.this.o00 = (int) (((o0.this.o0o * 2) + o0Var.nn + o0Var.f41855n) * fFloatValue);
                o0.this.o.postInvalidate();
            }
        });
        return valueAnimatorOfFloat;
    }

    @Override // com.thinkup.core.common.inner.ui.o.o.o, com.thinkup.core.common.inner.ui.o.m
    public void o(int i2, int i3) {
        if (this.f41855n != i2 || this.o0 != i3) {
            om();
        }
        super.o(i2, i3);
    }

    @Override // com.thinkup.core.common.inner.ui.o.o.o, com.thinkup.core.common.inner.ui.o.m
    public void o(Canvas canvas) {
        ValueAnimator valueAnimator;
        super.o(canvas);
        View view = this.o;
        if (view == null || view.getVisibility() != 0 || (valueAnimator = this.m) == null || !valueAnimator.isStarted() || this.mn == null || this.mo == null) {
            return;
        }
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, this.f41855n, this.o0, null, 31);
        this.mn.eraseColor(0);
        int i2 = this.no;
        int i3 = this.o00;
        canvas.drawLine(i2 + i3, 0.0f, this.nm + i3, this.o0, this.om);
        Canvas canvas2 = this.mo;
        RectF rectF = this.mm;
        int i4 = this.n0;
        canvas2.drawRoundRect(rectF, i4, i4, this.m0);
        canvas.drawBitmap(this.mn, 0.0f, 0.0f, this.on);
        canvas.restoreToCount(iSaveLayer);
    }
}
