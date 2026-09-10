package com.smartdigimkt.sdk.basead.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes6.dex */
public class WaveAnimImageView extends ImageView {
    private Paint e0;
    private a f0;
    int g0;
    int h0;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        float f38436a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f38437b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float f38438c;

        public a(float f, float f2, float f3) {
            this.f38436a = f;
            this.f38437b = f2;
            this.f38438c = f3;
        }
    }

    public WaveAnimImageView(Context context) {
        super(context);
        a(context);
    }

    private void a(Context context) {
        Paint paint = new Paint();
        this.e0 = paint;
        paint.setAntiAlias(true);
        this.e0.setStyle(Paint.Style.STROKE);
        this.e0.setColor(Color.parseColor("#FFFFFF"));
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        a aVar = this.f0;
        if (aVar != null) {
            this.e0.setAlpha((int) (aVar.f38438c * 255.0f));
            this.e0.setStrokeWidth(this.f0.f38437b);
            canvas.drawCircle(this.g0, this.h0, this.f0.f38436a, this.e0);
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        this.g0 = getWidth() / 2;
        this.h0 = getHeight() / 2;
    }

    public void setWaveAnimParams(a aVar) {
        this.f0 = aVar;
        postInvalidate();
    }

    public WaveAnimImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public WaveAnimImageView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        a(context);
    }
}
