package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.GradientDrawable;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public class LD extends GradientDrawable {
    private final Paint LD;
    protected Path Lxb;

    public LD() {
        this.Lxb = new Path();
        Paint paint = new Paint(1);
        this.LD = paint;
        paint.setColor(-1);
    }

    public void Lxb(Canvas canvas) {
        super.draw(canvas);
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        Path path = this.Lxb;
        if (path == null || path.isEmpty()) {
            Lxb(canvas);
            return;
        }
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), this.LD, 31);
        Lxb(canvas);
        this.LD.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        canvas.drawPath(this.Lxb, this.LD);
        this.LD.setXfermode(null);
        canvas.restoreToCount(iSaveLayer);
    }

    public void Lxb(int i, int i2, int i3, int i4) {
        this.Lxb.addRect(i, i2, i3, i4, Path.Direction.CW);
        invalidateSelf();
    }

    public LD(GradientDrawable.Orientation orientation, @ColorInt int[] iArr) {
        super(orientation, iArr);
        this.Lxb = new Path();
        Paint paint = new Paint(1);
        this.LD = paint;
        paint.setColor(-1);
    }
}
