package com.thinkup.core.common.inner.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes6.dex */
public class WaveAnimImageView extends ImageView {
    int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Paint f41850n;
    int o;
    private o o0;

    public static class o {
        float m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        float f41851n;
        float o;

        public o(float f, float f2, float f3) {
            this.o = f;
            this.m = f2;
            this.f41851n = f3;
        }
    }

    public WaveAnimImageView(Context context) {
        super(context);
        o();
    }

    private void o() {
        Paint paint = new Paint();
        this.f41850n = paint;
        paint.setAntiAlias(true);
        this.f41850n.setStyle(Paint.Style.STROKE);
        this.f41850n.setColor(Color.parseColor("#FFFFFF"));
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        o oVar = this.o0;
        if (oVar != null) {
            this.f41850n.setAlpha((int) (oVar.f41851n * 255.0f));
            this.f41850n.setStrokeWidth(this.o0.m);
            canvas.drawCircle(this.o, this.m, this.o0.o, this.f41850n);
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        this.o = getWidth() / 2;
        this.m = getHeight() / 2;
    }

    public void setWaveAnimParams(o oVar) {
        this.o0 = oVar;
        postInvalidate();
    }

    public WaveAnimImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        o();
    }

    public WaveAnimImageView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        o();
    }
}
