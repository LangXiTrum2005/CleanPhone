package com.smartdigimkt.expressad.videocommon.view;

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
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.smartdigimkt.expressad.widget.ATImageView;
import com.smartdigimkt.v0.v;

/* JADX INFO: loaded from: classes5.dex */
public class RoundImageView extends ATImageView {
    private static final String p0 = "RoundImageView";
    private static final int q0 = 0;
    private static final int r0 = 1;
    private static final int s0 = 5;
    private static final String t0 = "state_instance";
    private static final String u0 = "state_type";
    private static final String v0 = "state_border_radius";
    private int h0;
    private int i0;
    private Paint j0;
    private int k0;
    private Matrix l0;
    private BitmapShader m0;
    private int n0;
    private RectF o0;

    public RoundImageView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.l0 = new Matrix();
        Paint paint = new Paint();
        this.j0 = paint;
        paint.setAntiAlias(true);
        this.i0 = (int) TypedValue.applyDimension(1, 5.0f, getResources().getDisplayMetrics());
        this.h0 = 1;
    }

    private Bitmap a(Drawable drawable) {
        try {
            if (drawable instanceof BitmapDrawable) {
                return ((BitmapDrawable) drawable).getBitmap();
            }
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_4444);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            drawable.draw(canvas);
            return bitmapCreateBitmap;
        } catch (Throwable th) {
            th.getMessage();
            return null;
        }
    }

    private void b() {
        Bitmap bitmapA;
        try {
            Drawable drawable = getDrawable();
            if (drawable == null || (bitmapA = a(drawable)) == null || bitmapA.isRecycled()) {
                return;
            }
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.m0 = new BitmapShader(bitmapA, tileMode, tileMode);
            int i2 = this.h0;
            float fMax = 1.0f;
            if (i2 == 0) {
                fMax = (this.n0 * 1.0f) / Math.min(bitmapA.getWidth(), bitmapA.getHeight());
            } else if (i2 == 1) {
                fMax = Math.max((getWidth() * 1.0f) / bitmapA.getWidth(), (getHeight() * 1.0f) / bitmapA.getHeight());
            }
            this.l0.setScale(fMax, fMax);
            this.m0.setLocalMatrix(this.l0);
            this.j0.setShader(this.m0);
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.smartdigimkt.expressad.widget.ATImageView, android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        try {
            if (getDrawable() == null) {
                return;
            }
            b();
            if (this.h0 != 1) {
                float f = this.k0;
                canvas.drawCircle(f, f, f, this.j0);
            } else {
                RectF rectF = this.o0;
                float f2 = this.i0;
                canvas.drawRoundRect(rectF, f2, f2, this.j0);
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.h0 == 0) {
            int iMin = Math.min(getMeasuredWidth(), getMeasuredHeight());
            this.n0 = iMin;
            this.k0 = iMin / 2;
            setMeasuredDimension(iMin, iMin);
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        Parcelable parcelable2 = bundle.getParcelable(t0);
        if (parcelable2 == null) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        super.onRestoreInstanceState(parcelable2);
        this.h0 = bundle.getInt(u0);
        this.i0 = bundle.getInt(v0);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable(t0, super.onSaveInstanceState());
        bundle.putInt(u0, this.h0);
        bundle.putInt(v0, this.i0);
        return bundle;
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (this.h0 == 1) {
            this.o0 = new RectF(0.0f, 0.0f, getWidth(), getHeight());
        }
    }

    public void setBorderRadius(int i2) {
        int iA = v.a(getContext(), i2);
        if (this.i0 != iA) {
            this.i0 = iA;
            invalidate();
        }
    }

    public void setType(int i2) {
        if (this.h0 != i2) {
            this.h0 = i2;
            if (i2 != 1 && i2 != 0) {
                this.h0 = 0;
            }
            requestLayout();
        }
    }

    public RoundImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.l0 = new Matrix();
        Paint paint = new Paint();
        this.j0 = paint;
        paint.setAntiAlias(true);
        this.i0 = (int) TypedValue.applyDimension(1, 5.0f, getResources().getDisplayMetrics());
        this.h0 = 1;
    }

    public RoundImageView(Context context) {
        super(context);
        this.l0 = new Matrix();
        Paint paint = new Paint();
        this.j0 = paint;
        paint.setAntiAlias(true);
        this.i0 = (int) TypedValue.applyDimension(1, 5.0f, getResources().getDisplayMetrics());
        this.h0 = 1;
    }
}
