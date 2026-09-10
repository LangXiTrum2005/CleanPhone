package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public class IeN extends com.bytedance.sdk.openadsdk.core.JXs.OY {
    private RectF LD;
    private Paint Lxb;
    private int lk;

    public IeN(Context context) {
        this(context, null);
    }

    private void Lxb() {
        setTextColor(-1);
        Paint paint = new Paint();
        this.Lxb = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.Lxb.setColor(Color.parseColor("#99333333"));
        this.Lxb.setAntiAlias(true);
        this.Lxb.setStrokeWidth(0.0f);
        this.LD = new RectF();
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        RectF rectF = this.LD;
        float f = rectF.bottom;
        canvas.drawRoundRect(rectF, f / 2.0f, f / 2.0f, this.Lxb);
        canvas.translate((this.LD.right / 2.0f) - (getPaint().measureText(getText().toString()) / 2.0f), 0.0f);
        super.onDraw(canvas);
    }

    @Override // com.bytedance.sdk.openadsdk.core.JXs.OY, android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (measuredWidth <= 0 || measuredHeight <= 0) {
            this.LD.set(0.0f, 0.0f, 0.0f, 0.0f);
            return;
        }
        int iMeasureText = (int) getPaint().measureText("00");
        this.lk = iMeasureText;
        if (measuredWidth < iMeasureText) {
            measuredWidth = iMeasureText;
        }
        int i3 = ((measuredHeight / 2) * 2) + measuredWidth;
        setMeasuredDimension(i3, measuredHeight);
        this.LD.set(0.0f, 0.0f, i3, measuredHeight);
    }

    public IeN(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public IeN(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.lk = 0;
        Lxb();
    }
}
