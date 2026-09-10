package com.bytedance.sdk.component.adexpress.mo;

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
import android.widget.ImageView;
import com.bumptech.glide.load.resource.bitmap.a;

/* JADX INFO: loaded from: classes.dex */
public class uw extends ImageView {
    private int lnr;
    private Matrix mml;
    private Paint qdl;
    private int ud;

    public uw(Context context) {
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
        Drawable drawable = getDrawable();
        if (Build.VERSION.SDK_INT >= 28 && a.v(drawable)) {
            super.onDraw(canvas);
            return;
        }
        if (drawable == null) {
            super.onDraw(canvas);
            return;
        }
        Bitmap bitmapQdl = qdl(drawable);
        if (bitmapQdl == null) {
            super.onDraw(canvas);
            return;
        }
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        BitmapShader bitmapShader = new BitmapShader(bitmapQdl, tileMode, tileMode);
        float fMax = (bitmapQdl.getWidth() == getWidth() && bitmapQdl.getHeight() == getHeight()) ? 1.0f : Math.max((getWidth() * 1.0f) / bitmapQdl.getWidth(), (getHeight() * 1.0f) / bitmapQdl.getHeight());
        this.mml.setScale(fMax, fMax);
        bitmapShader.setLocalMatrix(this.mml);
        this.qdl.setShader(bitmapShader);
        canvas.drawRoundRect(new RectF(0.0f, 0.0f, getWidth(), getHeight()), this.ud, this.lnr, this.qdl);
    }

    public void setXRound(int i2) {
        this.ud = i2;
        postInvalidate();
    }

    public void setYRound(int i2) {
        this.lnr = i2;
        postInvalidate();
    }

    public uw(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public uw(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.ud = 25;
        this.lnr = 25;
        Paint paint = new Paint();
        this.qdl = paint;
        paint.setAntiAlias(true);
        this.qdl.setFilterBitmap(true);
        this.mml = new Matrix();
    }
}
