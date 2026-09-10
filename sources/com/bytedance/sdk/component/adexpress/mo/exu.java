package com.bytedance.sdk.component.adexpress.mo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Movie;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.view.View;
import android.widget.ImageView;
import com.bumptech.glide.load.resource.bitmap.a;

/* JADX INFO: loaded from: classes.dex */
public class exu extends ImageView {
    private boolean exu;
    private volatile boolean fs;
    private float jpc;
    private int lnr;
    private AnimatedImageDrawable mml;
    private boolean mo;
    private boolean mzz;
    private Movie qdl;
    private boolean rdp;
    private int rq;
    private int to;
    private float tvp;
    private long ud;
    private float wd;

    public exu(Context context) {
        super(context);
        this.mzz = Build.VERSION.SDK_INT >= 28;
        this.mo = false;
        this.exu = true;
        this.rdp = true;
        qdl();
    }

    private void lnr() {
        if (this.qdl == null) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (this.ud == 0) {
            this.ud = jUptimeMillis;
        }
        int iDuration = this.qdl.duration();
        if (iDuration == 0) {
            iDuration = 1000;
        }
        if (this.rdp || Math.abs(iDuration - this.lnr) >= 60) {
            this.lnr = (int) ((jUptimeMillis - this.ud) % ((long) iDuration));
        } else {
            this.lnr = iDuration;
            this.fs = true;
        }
    }

    private void setDrawable(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        setImageDrawable(drawable);
        if (Build.VERSION.SDK_INT >= 28 && a.v(drawable)) {
            AnimatedImageDrawable animatedImageDrawableK = a.k(drawable);
            this.mml = animatedImageDrawableK;
            if (!this.fs) {
                animatedImageDrawableK.start();
            }
            if (!this.rdp) {
                animatedImageDrawableK.setRepeatCount(0);
            }
        }
        ud();
    }

    private void ud() {
        if (this.qdl == null || this.mzz || !this.exu) {
            return;
        }
        postInvalidateOnAnimation();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        if (this.qdl == null || this.mzz) {
            super.onDraw(canvas);
            return;
        }
        try {
            if (this.fs) {
                qdl(canvas);
                return;
            }
            lnr();
            qdl(canvas);
            ud();
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        if (this.qdl != null && !this.mzz) {
            this.wd = (getWidth() - this.to) / 2.0f;
            this.jpc = (getHeight() - this.rq) / 2.0f;
        }
        this.exu = getVisibility() == 0;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i2, int i3) {
        Movie movie;
        int size;
        int size2;
        super.onMeasure(i2, i3);
        if (this.mzz || (movie = this.qdl) == null) {
            return;
        }
        int iWidth = movie.width();
        int iHeight = this.qdl.height();
        float fMax = 1.0f / Math.max((View.MeasureSpec.getMode(i2) == 0 || iWidth <= (size2 = View.MeasureSpec.getSize(i2))) ? 1.0f : iWidth / size2, (View.MeasureSpec.getMode(i3) == 0 || iHeight <= (size = View.MeasureSpec.getSize(i3))) ? 1.0f : iHeight / size);
        this.tvp = fMax;
        int i4 = (int) (iWidth * fMax);
        this.to = i4;
        int i5 = (int) (iHeight * fMax);
        this.rq = i5;
        setMeasuredDimension(i4, i5);
    }

    @Override // android.view.View
    public void onScreenStateChanged(int i2) {
        super.onScreenStateChanged(i2);
        if (this.qdl != null) {
            this.exu = i2 == 1;
            ud();
        }
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i2) {
        super.onVisibilityChanged(view, i2);
        if (this.qdl != null) {
            this.exu = i2 == 0;
            ud();
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i2) {
        super.onWindowVisibilityChanged(i2);
        if (this.qdl != null) {
            this.exu = i2 == 0;
            ud();
        }
    }

    public void qdl() {
        if (this.mzz) {
            return;
        }
        setLayerType(1, null);
    }

    public void setRepeatConfig(boolean z2) {
        AnimatedImageDrawable animatedImageDrawable;
        this.rdp = z2;
        if (z2) {
            return;
        }
        try {
            if (Build.VERSION.SDK_INT < 28 || (animatedImageDrawable = this.mml) == null) {
                return;
            }
            animatedImageDrawable.setRepeatCount(0);
        } catch (Exception unused) {
        }
    }

    private void qdl(Canvas canvas) {
        Movie movie = this.qdl;
        if (movie == null) {
            return;
        }
        movie.setTime(this.lnr);
        float f = this.tvp;
        if (f == 0.0f) {
            canvas.scale(1.0f, 1.0f);
            this.qdl.draw(canvas, 0.0f, 0.0f);
        } else {
            canvas.scale(f, f);
            Movie movie2 = this.qdl;
            float f2 = this.wd;
            float f3 = this.tvp;
            movie2.draw(canvas, f2 / f3, this.jpc / f3);
        }
        canvas.restore();
    }
}
