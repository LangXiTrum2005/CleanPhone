package com.scwang.smart.refresh.classics;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import com.scwang.smart.drawable.PaintDrawable;
import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: loaded from: classes5.dex */
public class ArrowDrawable extends PaintDrawable {

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public int f33507Y = 0;
    public int Z = 0;
    public final Path e0 = new Path();

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int iWidth = bounds.width();
        int iHeight = bounds.height();
        int i2 = this.f33507Y;
        Path path = this.e0;
        if (i2 != iWidth || this.Z != iHeight) {
            int i3 = (iWidth * 30) / Sdk.SDKError.Reason.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE;
            path.reset();
            float f = i3;
            float f2 = f * 0.70710677f;
            float f3 = f / 0.70710677f;
            float f4 = iWidth;
            float f5 = f4 / 2.0f;
            float f6 = iHeight;
            path.moveTo(f5, f6);
            float f7 = f6 / 2.0f;
            path.lineTo(0.0f, f7);
            float f8 = f7 - f2;
            path.lineTo(f2, f8);
            float f9 = f / 2.0f;
            float f10 = f5 - f9;
            float f11 = (f6 - f3) - f9;
            path.lineTo(f10, f11);
            path.lineTo(f10, 0.0f);
            float f12 = f5 + f9;
            path.lineTo(f12, 0.0f);
            path.lineTo(f12, f11);
            path.lineTo(f4 - f2, f8);
            path.lineTo(f4, f7);
            path.close();
            this.f33507Y = iWidth;
            this.Z = iHeight;
        }
        canvas.drawPath(path, this.X);
    }
}
