package com.bytedance.sdk.component.adexpress.lc;

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
import android.widget.ImageView;

/* JADX INFO: loaded from: classes2.dex */
public class CSn extends ImageView {
    private int LD;
    private Paint Lxb;
    private Matrix ZU;
    private int lk;

    public CSn(Context context) {
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
        Drawable drawable = getDrawable();
        if (drawable == null) {
            super.onDraw(canvas);
            return;
        }
        Bitmap bitmapLxb = Lxb(drawable);
        if (bitmapLxb == null) {
            super.onDraw(canvas);
            return;
        }
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        BitmapShader bitmapShader = new BitmapShader(bitmapLxb, tileMode, tileMode);
        float fMax = (bitmapLxb.getWidth() == getWidth() && bitmapLxb.getHeight() == getHeight()) ? 1.0f : Math.max((getWidth() * 1.0f) / bitmapLxb.getWidth(), (getHeight() * 1.0f) / bitmapLxb.getHeight());
        this.ZU.setScale(fMax, fMax);
        bitmapShader.setLocalMatrix(this.ZU);
        this.Lxb.setShader(bitmapShader);
        canvas.drawRoundRect(new RectF(0.0f, 0.0f, getWidth(), getHeight()), this.LD, this.lk, this.Lxb);
    }

    public void setXRound(int i) {
        this.LD = i;
        postInvalidate();
    }

    public void setYRound(int i) {
        this.lk = i;
        postInvalidate();
    }

    public CSn(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CSn(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LD = 25;
        this.lk = 25;
        Paint paint = new Paint();
        this.Lxb = paint;
        paint.setAntiAlias(true);
        this.Lxb.setFilterBitmap(true);
        this.ZU = new Matrix();
    }
}
