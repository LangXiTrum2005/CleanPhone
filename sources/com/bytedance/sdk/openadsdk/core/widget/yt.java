package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import com.bumptech.glide.load.resource.bitmap.a;

/* JADX INFO: loaded from: classes3.dex */
public class yt extends com.bytedance.sdk.openadsdk.core.mo.mml {
    private int lnr;
    private final Matrix mml;
    private BitmapShader mo;
    private final RectF mzz;
    private final Paint qdl;
    private int ud;

    public yt(Context context) {
        this(context, null);
    }

    private Bitmap qdl(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        int width = drawable.getIntrinsicWidth() <= 0 ? getWidth() : drawable.getIntrinsicWidth();
        int height = drawable.getIntrinsicHeight() <= 0 ? getHeight() : drawable.getIntrinsicHeight();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, width, height);
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        Bitmap bitmapQdl;
        Drawable drawable = getDrawable();
        if (drawable == null) {
            super.onDraw(canvas);
            return;
        }
        if (Build.VERSION.SDK_INT >= 28 && a.v(drawable)) {
            super.onDraw(canvas);
            return;
        }
        if (this.mo == null && (bitmapQdl = qdl(drawable)) != null) {
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            this.mo = new BitmapShader(bitmapQdl, tileMode, tileMode);
            float fMax = (bitmapQdl.getWidth() == getWidth() && bitmapQdl.getHeight() == getHeight()) ? 1.0f : Math.max((getWidth() * 1.0f) / bitmapQdl.getWidth(), (getHeight() * 1.0f) / bitmapQdl.getHeight());
            this.mml.setScale(fMax, fMax);
            this.mo.setLocalMatrix(this.mml);
        }
        BitmapShader bitmapShader = this.mo;
        if (bitmapShader == null) {
            super.onDraw(canvas);
        } else {
            this.qdl.setShader(bitmapShader);
            canvas.drawRoundRect(this.mzz, this.ud, this.lnr, this.qdl);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        this.mzz.set(0.0f, 0.0f, i2, i3);
    }

    public void setXRound(int i2) {
        this.ud = i2;
        postInvalidate();
    }

    public void setYRound(int i2) {
        this.lnr = i2;
        postInvalidate();
    }

    @Override // android.view.View
    public void unscheduleDrawable(Drawable drawable) {
        super.unscheduleDrawable(drawable);
        this.mo = null;
    }

    public yt(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public yt(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.ud = 25;
        this.lnr = 25;
        this.mzz = new RectF();
        Paint paint = new Paint();
        this.qdl = paint;
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        this.mml = new Matrix();
    }
}
