package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes2.dex */
public class bgr extends com.bytedance.sdk.openadsdk.core.di.ka {
    private RectF lr;
    private Paint ri;

    public bgr(Context context) {
        super(context);
        ri();
    }

    private void ri() {
        Paint paint = new Paint();
        this.ri = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.ri.setColor(Color.parseColor("#99333333"));
        this.ri.setAntiAlias(true);
        this.ri.setStrokeWidth(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.lr = new RectF();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        RectF rectF = this.lr;
        canvas.drawRoundRect(rectF, rectF.right / 2.0f, rectF.bottom / 2.0f, this.ri);
        super.onDraw(canvas);
    }

    @Override // com.bytedance.sdk.openadsdk.core.di.ka, android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.lr.right == getMeasuredWidth() && this.lr.bottom == getMeasuredHeight()) {
            return;
        }
        this.lr.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, getMeasuredWidth(), getMeasuredHeight());
    }
}
