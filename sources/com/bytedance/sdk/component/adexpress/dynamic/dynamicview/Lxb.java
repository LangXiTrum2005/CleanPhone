package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

/* JADX INFO: loaded from: classes2.dex */
public class Lxb extends LD {
    private final Rect LD = new Rect();
    private final Paint ZU = new Paint(1);
    private final Bitmap lk;

    public Lxb(Bitmap bitmap, LD ld) {
        this.lk = bitmap;
        if (ld != null) {
            this.Lxb = ld.Lxb;
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.LD
    public void Lxb(Canvas canvas) {
        canvas.drawBitmap(this.lk, this.LD, getBounds(), this.ZU);
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        int iHeight = rect.height();
        int iWidth = rect.width();
        int width = this.lk.getWidth();
        int height = this.lk.getHeight();
        this.LD.set(0, 0, width, height);
        if (height >= iHeight && width >= iWidth) {
            if (width > iWidth) {
                Rect rect2 = this.LD;
                int i = (width - iWidth) / 2;
                rect2.left = i;
                rect2.right = i + iWidth;
            }
            if (height > iHeight) {
                Rect rect3 = this.LD;
                int i2 = (height - iHeight) / 2;
                rect3.top = i2;
                rect3.bottom = i2 + iHeight;
                return;
            }
            return;
        }
        float f = iHeight;
        float f2 = f * 1.0f;
        float f3 = height;
        float f4 = f2 / f3;
        float f5 = iWidth;
        float f6 = 1.0f * f5;
        float f7 = width;
        if (Math.max(f4, f6 / f7) > f4) {
            int i3 = (int) ((f2 / f5) * f7);
            Rect rect4 = this.LD;
            int i4 = (height - i3) / 2;
            rect4.top = i4;
            rect4.bottom = i4 + i3;
            return;
        }
        int i5 = (int) ((f6 / f) * f3);
        Rect rect5 = this.LD;
        int i6 = (width - i5) / 2;
        rect5.left = i6;
        rect5.right = i6 + i5;
    }
}
