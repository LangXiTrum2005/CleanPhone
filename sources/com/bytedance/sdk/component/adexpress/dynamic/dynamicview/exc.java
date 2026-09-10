package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public class exc extends Drawable {
    private int lnr;
    private RectF mml;
    private Paint qdl;
    private int ud;

    public exc(int i2, int i3) {
        this.lnr = i2;
        this.ud = i3;
        Paint paint = new Paint();
        this.qdl = paint;
        paint.setColor(0);
        this.qdl.setAntiAlias(true);
        this.qdl.setShadowLayer(i3, 0.0f, 0.0f, -16777216);
        this.qdl.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_ATOP));
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        RectF rectF = this.mml;
        int i2 = this.lnr;
        canvas.drawRoundRect(rectF, i2, i2, this.qdl);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        this.qdl.setAlpha(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i2, int i3, int i4, int i5) {
        super.setBounds(i2, i3, i4, i5);
        int i6 = this.ud;
        this.mml = new RectF(i2 + i6, i3 + i6, i4 - i6, i5 - i6);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.qdl.setColorFilter(colorFilter);
    }
}
