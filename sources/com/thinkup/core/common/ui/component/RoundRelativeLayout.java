package com.thinkup.core.common.ui.component;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.thinkup.core.common.ooo.moo;

/* JADX INFO: loaded from: classes6.dex */
public class RoundRelativeLayout extends RelativeLayout {
    int o;

    public RoundRelativeLayout(Context context) {
        this(context, null);
    }

    public static int dip2px(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    private void o(Context context) {
        this.o = dip2px(context, 4.0f);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
        super.draw(canvas);
        moo.o(canvas, getWidth(), getHeight(), this.o);
        canvas.restoreToCount(iSaveLayer);
    }

    public RoundRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.o = dip2px(context, 4.0f);
    }

    public RoundRelativeLayout(Context context, AttributeSet attributeSet, int i2) {
        this(context);
    }
}
