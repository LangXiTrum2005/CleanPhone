package com.smartdigimkt.sdk.basead.ui.simpleview;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: loaded from: classes6.dex */
public class SimpleCircleView extends View {
    private Paint e0;
    private final long f0;
    private final float g0;
    private final float h0;
    ValueAnimator i0;

    public class a implements Runnable {

        /* JADX INFO: renamed from: com.smartdigimkt.sdk.basead.ui.simpleview.SimpleCircleView$a$a, reason: collision with other inner class name */
        public class C0611a implements ValueAnimator.AnimatorUpdateListener {
            public C0611a() {
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                try {
                    float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    SimpleCircleView.this.setScaleX(fFloatValue);
                    SimpleCircleView.this.setScaleY(fFloatValue);
                } catch (Throwable unused) {
                    SimpleCircleView.this.setScaleX(3.0f);
                    SimpleCircleView.this.setScaleY(3.0f);
                }
            }
        }

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SimpleCircleView.this.setScaleX(0.1f);
            SimpleCircleView.this.setScaleY(0.1f);
            SimpleCircleView.this.i0 = ValueAnimator.ofFloat(0.1f, Math.max((SimpleCircleView.this.getWidth() <= 0 || SimpleCircleView.this.getHeight() <= 0) ? 3.0f : (float) (Math.hypot(SimpleCircleView.this.getWidth() / 2, SimpleCircleView.this.getHeight() / 2) / ((double) (Math.min(SimpleCircleView.this.getWidth(), SimpleCircleView.this.getHeight()) / 2))), 3.0f));
            SimpleCircleView.this.i0.setDuration(500L);
            SimpleCircleView.this.i0.addUpdateListener(new C0611a());
            SimpleCircleView.this.i0.start();
        }
    }

    public SimpleCircleView(Context context) {
        this(context, null);
    }

    private void a() {
        Paint paint = new Paint();
        this.e0 = paint;
        paint.setColor(1711276032);
        this.e0.setAntiAlias(true);
        post(new a());
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.i0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float width = getWidth() / 2;
        float height = getHeight() / 2;
        canvas.drawCircle(width, height, Math.min(width, height), this.e0);
    }

    public SimpleCircleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SimpleCircleView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f0 = 500L;
        this.g0 = 0.1f;
        this.h0 = 3.0f;
        a();
    }
}
