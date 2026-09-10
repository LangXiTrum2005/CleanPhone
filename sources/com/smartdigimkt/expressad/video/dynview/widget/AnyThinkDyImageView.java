package com.smartdigimkt.expressad.video.dynview.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes5.dex */
public class AnyThinkDyImageView extends ImageView {
    private static final String e0 = "AnyThinkDyImageView";

    public AnyThinkDyImageView(Context context) {
        super(context);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public AnyThinkDyImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AnyThinkDyImageView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }
}
