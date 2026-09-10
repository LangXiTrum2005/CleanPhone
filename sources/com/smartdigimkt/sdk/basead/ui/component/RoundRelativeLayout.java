package com.smartdigimkt.sdk.basead.ui.component;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.smartdigimkt.j7.c;

/* JADX INFO: loaded from: classes6.dex */
public class RoundRelativeLayout extends RelativeLayout {
    int e0;

    public RoundRelativeLayout(Context context) {
        this(context, null);
    }

    private void a(Context context) {
        this.e0 = dip2px(context, 4.0f);
    }

    public static int dip2px(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
        super.draw(canvas);
        c.a(canvas, getWidth(), getHeight(), this.e0);
        canvas.restoreToCount(iSaveLayer);
    }

    public RoundRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public RoundRelativeLayout(Context context, AttributeSet attributeSet, int i2) {
        this(context);
    }
}
