package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.GradientDrawable;

/* JADX INFO: loaded from: classes.dex */
public class ud extends GradientDrawable {
    protected Path qdl;
    private final Paint ud;

    public ud() {
        this.qdl = new Path();
        Paint paint = new Paint(1);
        this.ud = paint;
        paint.setColor(-1);
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Path path = this.qdl;
        if (path == null || path.isEmpty()) {
            qdl(canvas);
            return;
        }
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), this.ud, 31);
        qdl(canvas);
        this.ud.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        canvas.drawPath(this.qdl, this.ud);
        this.ud.setXfermode(null);
        canvas.restoreToCount(iSaveLayer);
    }

    public void qdl(Canvas canvas) {
        super.draw(canvas);
    }

    public void qdl(int i2, int i3, int i4, int i5) {
        this.qdl.addRect(i2, i3, i4, i5, Path.Direction.CW);
        invalidateSelf();
    }

    public ud(GradientDrawable.Orientation orientation, int[] iArr) {
        super(orientation, iArr);
        this.qdl = new Path();
        Paint paint = new Paint(1);
        this.ud = paint;
        paint.setColor(-1);
    }
}
