package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

/* JADX INFO: loaded from: classes.dex */
public class qdl extends ud {
    private final Bitmap lnr;
    private final Rect ud = new Rect();
    private final Paint mml = new Paint(1);

    public qdl(Bitmap bitmap, ud udVar) {
        this.lnr = bitmap;
        if (udVar != null) {
            this.qdl = udVar.qdl;
        }
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        int iHeight = rect.height();
        int iWidth = rect.width();
        int width = this.lnr.getWidth();
        int height = this.lnr.getHeight();
        this.ud.set(0, 0, width, height);
        if (height >= iHeight && width >= iWidth) {
            if (width > iWidth) {
                Rect rect2 = this.ud;
                int i2 = (width - iWidth) / 2;
                rect2.left = i2;
                rect2.right = i2 + iWidth;
            }
            if (height > iHeight) {
                Rect rect3 = this.ud;
                int i3 = (height - iHeight) / 2;
                rect3.top = i3;
                rect3.bottom = i3 + iHeight;
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
            int i4 = (int) ((f2 / f5) * f7);
            Rect rect4 = this.ud;
            int i5 = (height - i4) / 2;
            rect4.top = i5;
            rect4.bottom = i5 + i4;
            return;
        }
        int i6 = (int) ((f6 / f) * f3);
        Rect rect5 = this.ud;
        int i7 = (width - i6) / 2;
        rect5.left = i7;
        rect5.right = i7 + i6;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ud
    public void qdl(Canvas canvas) {
        canvas.drawBitmap(this.lnr, this.ud, getBounds(), this.mml);
    }
}
