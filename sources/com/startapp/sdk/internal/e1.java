package com.startapp.sdk.internal;

import android.graphics.Canvas;
import android.graphics.EmbossMaskFilter;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;

/* JADX INFO: loaded from: classes6.dex */
public final class e1 extends ShapeDrawable {
    public e1(RoundRectShape roundRectShape) {
        super(roundRectShape);
    }

    @Override // android.graphics.drawable.ShapeDrawable
    public final void onDraw(Shape shape, Canvas canvas, Paint paint) {
        paint.setColor(-11363070);
        paint.setMaskFilter(new EmbossMaskFilter(new float[]{1.0f, 1.0f, 1.0f}, 0.4f, 5.0f, 3.0f));
        super.onDraw(shape, canvas, paint);
    }
}
