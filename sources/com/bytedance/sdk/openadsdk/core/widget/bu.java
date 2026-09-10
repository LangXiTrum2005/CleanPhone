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
import com.unity3d.services.UnityAdsConstants;
import dumb.saneness;

/* JADX INFO: loaded from: classes2.dex */
public class bu extends com.bytedance.sdk.openadsdk.core.di.ka {
    private BitmapShader di;
    private final RectF fi;
    private int ik;
    private final Matrix ka;
    private int lr;
    private final Paint ri;

    public bu(Context context) {
        this(context, null);
    }

    private Bitmap ri(Drawable drawable) {
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
        Bitmap bitmapRi;
        Drawable drawable = getDrawable();
        if (drawable == null) {
            super.onDraw(canvas);
            return;
        }
        if (Build.VERSION.SDK_INT >= 28 && saneness.attabal(drawable)) {
            super.onDraw(canvas);
            return;
        }
        if (this.di == null && (bitmapRi = ri(drawable)) != null) {
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            this.di = new BitmapShader(bitmapRi, tileMode, tileMode);
            float fMax = (bitmapRi.getWidth() == getWidth() && bitmapRi.getHeight() == getHeight()) ? 1.0f : Math.max((getWidth() * 1.0f) / bitmapRi.getWidth(), (getHeight() * 1.0f) / bitmapRi.getHeight());
            this.ka.setScale(fMax, fMax);
            this.di.setLocalMatrix(this.ka);
        }
        BitmapShader bitmapShader = this.di;
        if (bitmapShader == null) {
            super.onDraw(canvas);
        } else {
            this.ri.setShader(bitmapShader);
            canvas.drawRoundRect(this.fi, this.lr, this.ik, this.ri);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.fi.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i, i2);
    }

    public void setXRound(int i) {
        this.lr = i;
        postInvalidate();
    }

    public void setYRound(int i) {
        this.ik = i;
        postInvalidate();
    }

    @Override // android.view.View
    public void unscheduleDrawable(Drawable drawable) {
        super.unscheduleDrawable(drawable);
        this.di = null;
    }

    public bu(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public bu(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.lr = 25;
        this.ik = 25;
        this.fi = new RectF();
        Paint paint = new Paint();
        this.ri = paint;
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        this.ka = new Matrix();
    }
}
