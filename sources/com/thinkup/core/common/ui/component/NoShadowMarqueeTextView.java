package com.thinkup.core.common.ui.component;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import com.thinkup.core.common.ui.MarqueeTextView;

/* JADX INFO: loaded from: classes6.dex */
public class NoShadowMarqueeTextView extends MarqueeTextView {
    public NoShadowMarqueeTextView(Context context) {
        this(context, null);
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        setHorizontalFadingEdgeEnabled(false);
    }

    public NoShadowMarqueeTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NoShadowMarqueeTextView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }
}
