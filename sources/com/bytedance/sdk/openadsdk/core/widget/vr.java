package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes2.dex */
public class vr extends com.bytedance.sdk.openadsdk.core.di.mj {
    private int ik;
    private RectF lr;
    private Paint ri;

    public vr(Context context) {
        this(context, null);
    }

    private void ri() {
        setTextColor(-1);
        Paint paint = new Paint();
        this.ri = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.ri.setColor(Color.parseColor("#99333333"));
        this.ri.setAntiAlias(true);
        this.ri.setStrokeWidth(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.lr = new RectF();
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        RectF rectF = this.lr;
        float f = rectF.bottom;
        canvas.drawRoundRect(rectF, f / 2.0f, f / 2.0f, this.ri);
        canvas.translate((this.lr.right / 2.0f) - (getPaint().measureText(getText().toString()) / 2.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        super.onDraw(canvas);
    }

    @Override // com.bytedance.sdk.openadsdk.core.di.mj, android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (measuredWidth <= 0 || measuredHeight <= 0) {
            this.lr.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            return;
        }
        int iMeasureText = (int) getPaint().measureText("00");
        this.ik = iMeasureText;
        if (measuredWidth < iMeasureText) {
            measuredWidth = iMeasureText;
        }
        int i3 = measuredWidth + ((measuredHeight / 2) * 2);
        setMeasuredDimension(i3, measuredHeight);
        this.lr.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i3, measuredHeight);
    }

    public vr(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public vr(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.ik = 0;
        ri();
    }
}
