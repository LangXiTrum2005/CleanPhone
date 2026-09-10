package com.scwang.smart.drawable;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;

/* JADX INFO: loaded from: classes5.dex */
public class ProgressDrawable extends PaintDrawable implements Animatable, ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public int f33506Y;
    public int Z;
    public int e0;
    public ValueAnimator f0;
    public Path g0;

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int iWidth = bounds.width();
        int iHeight = bounds.height();
        float f = iWidth;
        float fMax = Math.max(1.0f, f / 22.0f);
        int i2 = this.f33506Y;
        Path path = this.g0;
        if (i2 != iWidth || this.Z != iHeight) {
            path.reset();
            float f2 = f - fMax;
            float f3 = iHeight / 2.0f;
            Path.Direction direction = Path.Direction.CW;
            path.addCircle(f2, f3, fMax, direction);
            float f4 = f - (5.0f * fMax);
            path.addRect(f4, f3 - fMax, f2, f3 + fMax, direction);
            path.addCircle(f4, f3, fMax, direction);
            this.f33506Y = iWidth;
            this.Z = iHeight;
        }
        canvas.save();
        float f5 = f / 2.0f;
        float f6 = iHeight / 2.0f;
        canvas.rotate(this.e0, f5, f6);
        for (int i3 = 0; i3 < 12; i3++) {
            Paint paint = this.X;
            paint.setAlpha((i3 + 5) * 17);
            canvas.rotate(30.0f, f5, f6);
            canvas.drawPath(path, paint);
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f0.isRunning();
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.e0 = (((Integer) valueAnimator.getAnimatedValue()).intValue() / 30) * 30;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        ValueAnimator valueAnimator = this.f0;
        if (valueAnimator.isRunning()) {
            return;
        }
        valueAnimator.addUpdateListener(this);
        valueAnimator.start();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        ValueAnimator valueAnimator = this.f0;
        if (valueAnimator.isRunning()) {
            valueAnimator.removeAllListeners();
            valueAnimator.removeAllUpdateListeners();
            valueAnimator.cancel();
        }
    }
}
