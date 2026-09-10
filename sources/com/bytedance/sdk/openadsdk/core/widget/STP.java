package com.bytedance.sdk.openadsdk.core.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"AppCompatCustomView"})
public class STP extends com.bytedance.sdk.openadsdk.core.JXs.ZU {
    private RectF LD;
    private Paint Lxb;

    public STP(Context context) {
        super(context);
        Lxb();
    }

    private void Lxb() {
        Paint paint = new Paint();
        this.Lxb = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.Lxb.setColor(Color.parseColor("#99333333"));
        this.Lxb.setAntiAlias(true);
        this.Lxb.setStrokeWidth(0.0f);
        this.LD = new RectF();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        RectF rectF = this.LD;
        canvas.drawRoundRect(rectF, rectF.right / 2.0f, rectF.bottom / 2.0f, this.Lxb);
        super.onDraw(canvas);
    }

    @Override // com.bytedance.sdk.openadsdk.core.JXs.ZU, android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.LD.right == getMeasuredWidth() && this.LD.bottom == getMeasuredHeight()) {
            return;
        }
        this.LD.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
    }
}
