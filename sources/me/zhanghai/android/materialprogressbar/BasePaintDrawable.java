package me.zhanghai.android.materialprogressbar;

import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.core.view.ViewCompat;

/* JADX INFO: loaded from: classes4.dex */
abstract class BasePaintDrawable extends BaseDrawable {
    private Paint mPaint;

    @Override // me.zhanghai.android.materialprogressbar.BaseDrawable
    public final void onDraw(Canvas canvas, int i, int i2) {
        if (this.mPaint == null) {
            Paint paint = new Paint();
            this.mPaint = paint;
            paint.setAntiAlias(true);
            this.mPaint.setColor(ViewCompat.MEASURED_STATE_MASK);
            onPreparePaint(this.mPaint);
        }
        this.mPaint.setAlpha(this.mAlpha);
        this.mPaint.setColorFilter(getColorFilterForDrawing());
        onDraw(canvas, i, i2, this.mPaint);
    }

    public abstract void onDraw(Canvas canvas, int i, int i2, Paint paint);

    public abstract void onPreparePaint(Paint paint);
}
