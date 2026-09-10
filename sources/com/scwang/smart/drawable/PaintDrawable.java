package com.scwang.smart.drawable;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes5.dex */
public abstract class PaintDrawable extends Drawable {
    public final Paint X;

    public PaintDrawable() {
        Paint paint = new Paint();
        this.X = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(-5592406);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i2) {
        this.X.setAlpha(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.X.setColorFilter(colorFilter);
    }
}
