package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.GradientDrawable;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes2.dex */
public class lr extends GradientDrawable {
    private final Paint lr;
    protected Path ri;

    public lr() {
        this.ri = new Path();
        Paint paint = new Paint(1);
        this.lr = paint;
        paint.setColor(-1);
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Path path = this.ri;
        if (path == null || path.isEmpty()) {
            ri(canvas);
            return;
        }
        int iSaveLayer = canvas.saveLayer(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, canvas.getWidth(), canvas.getHeight(), this.lr, 31);
        ri(canvas);
        this.lr.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        canvas.drawPath(this.ri, this.lr);
        this.lr.setXfermode(null);
        canvas.restoreToCount(iSaveLayer);
    }

    public void ri(Canvas canvas) {
        super.draw(canvas);
    }

    public void ri(int i, int i2, int i3, int i4) {
        this.ri.addRect(i, i2, i3, i4, Path.Direction.CW);
        invalidateSelf();
    }

    public lr(GradientDrawable.Orientation orientation, int[] iArr) {
        super(orientation, iArr);
        this.ri = new Path();
        Paint paint = new Paint(1);
        this.lr = paint;
        paint.setColor(-1);
    }
}
