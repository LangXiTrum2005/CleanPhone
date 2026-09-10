package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

/* JADX INFO: loaded from: classes2.dex */
public class ri extends lr {
    private final Bitmap ik;
    private final Rect lr = new Rect();
    private final Paint ka = new Paint(1);

    public ri(Bitmap bitmap, lr lrVar) {
        this.ik = bitmap;
        if (lrVar != null) {
            this.ri = lrVar.ri;
        }
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        int iHeight = rect.height();
        int iWidth = rect.width();
        int width = this.ik.getWidth();
        int height = this.ik.getHeight();
        this.lr.set(0, 0, width, height);
        if (height >= iHeight && width >= iWidth) {
            if (width > iWidth) {
                Rect rect2 = this.lr;
                int i = (width - iWidth) / 2;
                rect2.left = i;
                rect2.right = i + iWidth;
            }
            if (height > iHeight) {
                Rect rect3 = this.lr;
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
            Rect rect4 = this.lr;
            int i4 = (height - i3) / 2;
            rect4.top = i4;
            rect4.bottom = i4 + i3;
            return;
        }
        int i5 = (int) ((f6 / f) * f3);
        Rect rect5 = this.lr;
        int i6 = (width - i5) / 2;
        rect5.left = i6;
        rect5.right = i6 + i5;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lr
    public void ri(Canvas canvas) {
        canvas.drawBitmap(this.ik, this.lr, getBounds(), this.ka);
    }
}
