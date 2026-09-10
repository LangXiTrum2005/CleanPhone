package com.bytedance.sdk.component.adexpress.di;

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
import com.unity3d.services.UnityAdsConstants;
import dumb.saneness;

/* JADX INFO: loaded from: classes2.dex */
public class ay extends ImageView {
    private int ik;
    private Matrix ka;
    private int lr;
    private Paint ri;

    public ay(Context context) {
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
        Drawable drawable = getDrawable();
        if (Build.VERSION.SDK_INT >= 28 && saneness.attabal(drawable)) {
            super.onDraw(canvas);
            return;
        }
        if (drawable == null) {
            super.onDraw(canvas);
            return;
        }
        Bitmap bitmapRi = ri(drawable);
        if (bitmapRi == null) {
            super.onDraw(canvas);
            return;
        }
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        BitmapShader bitmapShader = new BitmapShader(bitmapRi, tileMode, tileMode);
        float fMax = (bitmapRi.getWidth() == getWidth() && bitmapRi.getHeight() == getHeight()) ? 1.0f : Math.max((getWidth() * 1.0f) / bitmapRi.getWidth(), (getHeight() * 1.0f) / bitmapRi.getHeight());
        this.ka.setScale(fMax, fMax);
        bitmapShader.setLocalMatrix(this.ka);
        this.ri.setShader(bitmapShader);
        canvas.drawRoundRect(new RectF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, getWidth(), getHeight()), this.lr, this.ik, this.ri);
    }

    public void setXRound(int i) {
        this.lr = i;
        postInvalidate();
    }

    public void setYRound(int i) {
        this.ik = i;
        postInvalidate();
    }

    public ay(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ay(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.lr = 25;
        this.ik = 25;
        Paint paint = new Paint();
        this.ri = paint;
        paint.setAntiAlias(true);
        this.ri.setFilterBitmap(true);
        this.ka = new Matrix();
    }
}
