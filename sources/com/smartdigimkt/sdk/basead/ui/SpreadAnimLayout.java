package com.smartdigimkt.sdk.basead.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import com.smartdigimkt.n8.h;

/* JADX INFO: loaded from: classes6.dex */
public class SpreadAnimLayout extends FrameLayout {
    private Paint e0;
    private ValueAnimator f0;
    private c g0;
    private RectF h0;
    private RectF i0;
    private int j0;
    private int k0;
    private int l0;
    private Paint m0;
    private boolean n0;
    private boolean o0;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SpreadAnimLayout.this.startSpreadAnimation();
        }
    }

    public class b implements ValueAnimator.AnimatorUpdateListener {
        public b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            SpreadAnimLayout.this.g0.f38435b = (int) ((1.0f - fFloatValue) * 255.0f);
            int i2 = (int) (SpreadAnimLayout.this.k0 * fFloatValue);
            SpreadAnimLayout.this.g0.f38434a.set(SpreadAnimLayout.this.h0);
            float f = -i2;
            SpreadAnimLayout.this.g0.f38434a.inset(f, f);
            SpreadAnimLayout.this.postInvalidate();
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        RectF f38434a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f38435b;
    }

    public SpreadAnimLayout(Context context) {
        this(context, null, 0);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        if (!this.n0 || !this.o0) {
            super.draw(canvas);
            return;
        }
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
        this.e0.setAlpha(this.g0.f38435b);
        RectF rectF = this.g0.f38434a;
        float f = this.j0;
        canvas.drawRoundRect(rectF, f, f, this.e0);
        RectF rectF2 = this.h0;
        float f2 = this.j0;
        canvas.drawRoundRect(rectF2, f2, f2, this.m0);
        canvas.restoreToCount(iSaveLayer);
        super.draw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        int i4 = this.k0;
        setPadding(i4, i4, i4, i4);
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i2) {
        super.onWindowVisibilityChanged(i2);
        if (this.n0) {
            if (i2 == 0) {
                post(new a());
                return;
            }
            ValueAnimator valueAnimator = this.f0;
            if (valueAnimator != null) {
                valueAnimator.end();
            }
        }
    }

    public void setMaxSpreadDistance(int i2) {
        this.k0 = i2;
    }

    public void setRoundRadius(int i2) {
        this.j0 = i2;
    }

    public void startSpreadAnimation() {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        this.n0 = true;
        if (!this.o0) {
            this.h0 = new RectF(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
            this.i0 = new RectF(this.h0);
            c cVar = new c();
            this.g0 = cVar;
            cVar.f38435b = 255;
            cVar.f38434a = this.i0;
            this.k0 = Math.min(this.k0, Math.min((getWidth() - childAt.getWidth()) / 2, (getHeight() - childAt.getHeight()) / 2));
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f0 = valueAnimatorOfFloat;
            valueAnimatorOfFloat.setDuration(this.l0);
            this.f0.setRepeatMode(1);
            this.f0.setRepeatCount(-1);
            this.f0.setInterpolator(new AccelerateDecelerateInterpolator());
            this.f0.addUpdateListener(new b());
            this.o0 = true;
        }
        this.f0.start();
    }

    public SpreadAnimLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SpreadAnimLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.n0 = true;
        setWillNotDraw(false);
        int color = getResources().getColor(h.a(context, "color_spread", "color"));
        this.k0 = getResources().getDimensionPixelSize(h.a(getContext(), "myoffer_spread_max_distance_normal", "dimen"));
        this.j0 = h.a(context, 4.0f);
        this.l0 = 1000;
        Paint paint = new Paint();
        this.e0 = paint;
        paint.setAntiAlias(true);
        this.e0.setAlpha(255);
        this.e0.setColor(color);
        Paint paint2 = new Paint(1);
        this.m0 = paint2;
        paint2.setColor(-1);
        this.m0.setStyle(Paint.Style.FILL);
        this.m0.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }
}
