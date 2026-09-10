package com.thinkup.core.common.res.image;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes6.dex */
public class RecycleImageView extends ImageView {
    public RecycleImageView(Context context) {
        super(context);
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        try {
            super.dispatchDraw(canvas);
        } catch (Throwable unused) {
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (Throwable unused) {
        }
    }

    public RecycleImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RecycleImageView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }
}
