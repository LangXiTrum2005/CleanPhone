package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.datastore.preferences.protobuf.a;

/* JADX INFO: loaded from: classes3.dex */
public class bjy extends com.bytedance.sdk.openadsdk.core.mo.jpc {
    private int lnr;
    private Paint qdl;
    private RectF ud;

    public bjy(Context context) {
        this(context, null);
    }

    private void qdl() {
        setTextColor(-1);
        Paint paint = new Paint();
        this.qdl = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.qdl.setColor(Color.parseColor("#99333333"));
        this.qdl.setAntiAlias(true);
        this.qdl.setStrokeWidth(0.0f);
        this.ud = new RectF();
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        RectF rectF = this.ud;
        float f = rectF.bottom;
        canvas.drawRoundRect(rectF, f / 2.0f, f / 2.0f, this.qdl);
        canvas.translate((this.ud.right / 2.0f) - (getPaint().measureText(getText().toString()) / 2.0f), 0.0f);
        super.onDraw(canvas);
    }

    @Override // com.bytedance.sdk.openadsdk.core.mo.jpc, android.widget.TextView, android.view.View
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (measuredWidth <= 0 || measuredHeight <= 0) {
            this.ud.set(0.0f, 0.0f, 0.0f, 0.0f);
            return;
        }
        int iMeasureText = (int) getPaint().measureText("00");
        this.lnr = iMeasureText;
        if (measuredWidth < iMeasureText) {
            measuredWidth = iMeasureText;
        }
        int iA = a.a(measuredHeight, 2, 2, measuredWidth);
        setMeasuredDimension(iA, measuredHeight);
        this.ud.set(0.0f, 0.0f, iA, measuredHeight);
    }

    public bjy(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public bjy(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.lnr = 0;
        qdl();
    }
}
