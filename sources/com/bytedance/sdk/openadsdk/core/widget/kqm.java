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
import android.util.AttributeSet;

/* JADX INFO: loaded from: classes2.dex */
public class kqm extends com.bytedance.sdk.openadsdk.core.JXs.ZU {
    private final RectF JXs;
    private int LD;
    private final Paint Lxb;
    private final Matrix ZU;
    private BitmapShader lc;
    private int lk;

    public kqm(Context context) {
        this(context, null);
    }

    private Bitmap Lxb(Drawable drawable) {
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
        Bitmap bitmapLxb;
        Drawable drawable = getDrawable();
        if (drawable == null) {
            super.onDraw(canvas);
            return;
        }
        if (this.lc == null && (bitmapLxb = Lxb(drawable)) != null) {
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            this.lc = new BitmapShader(bitmapLxb, tileMode, tileMode);
            float fMax = (bitmapLxb.getWidth() == getWidth() && bitmapLxb.getHeight() == getHeight()) ? 1.0f : Math.max((getWidth() * 1.0f) / bitmapLxb.getWidth(), (getHeight() * 1.0f) / bitmapLxb.getHeight());
            this.ZU.setScale(fMax, fMax);
            this.lc.setLocalMatrix(this.ZU);
        }
        BitmapShader bitmapShader = this.lc;
        if (bitmapShader == null) {
            super.onDraw(canvas);
        } else {
            this.Lxb.setShader(bitmapShader);
            canvas.drawRoundRect(this.JXs, this.LD, this.lk, this.Lxb);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.JXs.set(0.0f, 0.0f, i, i2);
    }

    public void setXRound(int i) {
        this.LD = i;
        postInvalidate();
    }

    public void setYRound(int i) {
        this.lk = i;
        postInvalidate();
    }

    @Override // android.view.View
    public void unscheduleDrawable(Drawable drawable) {
        super.unscheduleDrawable(drawable);
        this.lc = null;
    }

    public kqm(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public kqm(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LD = 25;
        this.lk = 25;
        this.JXs = new RectF();
        Paint paint = new Paint();
        this.Lxb = paint;
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        this.ZU = new Matrix();
    }
}
