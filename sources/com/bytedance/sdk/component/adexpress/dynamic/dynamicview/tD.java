package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;

/* JADX INFO: loaded from: classes2.dex */
public class tD extends Drawable {
    private int LD;
    private Paint Lxb;
    private RectF ZU;
    private int lk;

    public tD(int i, int i2) {
        this.lk = i;
        this.LD = i2;
        Paint paint = new Paint();
        this.Lxb = paint;
        paint.setColor(0);
        this.Lxb.setAntiAlias(true);
        this.Lxb.setShadowLayer(i2, 0.0f, 0.0f, ViewCompat.MEASURED_STATE_MASK);
        this.Lxb.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_ATOP));
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        RectF rectF = this.ZU;
        int i = this.lk;
        canvas.drawRoundRect(rectF, i, i, this.Lxb);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.Lxb.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        int i5 = this.LD;
        this.ZU = new RectF(i + i5, i2 + i5, i3 - i5, i4 - i5);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.Lxb.setColorFilter(colorFilter);
    }
}
