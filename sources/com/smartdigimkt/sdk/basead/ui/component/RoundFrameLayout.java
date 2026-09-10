package com.smartdigimkt.sdk.basead.ui.component;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.smartdigimkt.j7.c;

/* JADX INFO: loaded from: classes6.dex */
public class RoundFrameLayout extends FrameLayout {
    int e0;

    public RoundFrameLayout(Context context) {
        super(context);
        this.e0 = dip2px(getContext(), 10.0f);
    }

    public static int dip2px(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
        super.dispatchDraw(canvas);
        c.a(canvas, getWidth(), getHeight(), this.e0);
        canvas.restoreToCount(iSaveLayer);
    }

    public void setRadius(int i2) {
        this.e0 = dip2px(getContext(), i2);
        postInvalidate();
    }

    public RoundFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e0 = dip2px(getContext(), 10.0f);
    }

    public RoundFrameLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.e0 = dip2px(getContext(), 10.0f);
    }
}
