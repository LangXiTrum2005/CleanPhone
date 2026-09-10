package com.bytedance.sdk.component.adexpress.lc;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Movie;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.view.View;
import android.widget.ImageView;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4107n5;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5010xO;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"AppCompatCustomView"})
public class NXR extends ImageView {
    private int JVA;
    private boolean JXs;
    private long LD;
    private Movie Lxb;
    private boolean NXR;
    private float OY;
    private float QAg;
    private boolean STP;
    private AnimatedImageDrawable ZU;
    private float ebl;
    private boolean lc;
    private int lk;
    private int nBu;
    private volatile boolean sLN;

    public NXR(Context context) {
        super(context);
        this.JXs = Build.VERSION.SDK_INT >= 28;
        this.lc = false;
        this.NXR = true;
        this.STP = true;
        Lxb();
    }

    private void LD() {
        if (this.Lxb == null || this.JXs || !this.NXR) {
            return;
        }
        postInvalidateOnAnimation();
    }

    private void lk() {
        if (this.Lxb == null) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (this.LD == 0) {
            this.LD = jUptimeMillis;
        }
        int iDuration = this.Lxb.duration();
        if (iDuration == 0) {
            iDuration = 1000;
        }
        if (this.STP || Math.abs(iDuration - this.lk) >= 60) {
            this.lk = (int) ((jUptimeMillis - this.LD) % ((long) iDuration));
        } else {
            this.lk = iDuration;
            this.sLN = true;
        }
    }

    private void setDrawable(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        setImageDrawable(drawable);
        if (Build.VERSION.SDK_INT >= 28 && AbstractC4107n5.A(drawable)) {
            AnimatedImageDrawable animatedImageDrawableJ = AbstractC5010xO.j(drawable);
            this.ZU = animatedImageDrawableJ;
            if (!this.sLN) {
                animatedImageDrawableJ.start();
            }
            if (!this.STP) {
                animatedImageDrawableJ.setRepeatCount(0);
            }
        }
        LD();
    }

    public void Lxb() {
        if (this.JXs) {
            return;
        }
        setLayerType(1, null);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        if (this.Lxb == null || this.JXs) {
            super.onDraw(canvas);
            return;
        }
        try {
            if (this.sLN) {
                Lxb(canvas);
                return;
            }
            lk();
            Lxb(canvas);
            LD();
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.sLN.Lxb("GifView", "onDraw->Throwable->", th);
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.Lxb != null && !this.JXs) {
            this.ebl = (getWidth() - this.nBu) / 2.0f;
            this.OY = (getHeight() - this.JVA) / 2.0f;
        }
        this.NXR = getVisibility() == 0;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        Movie movie;
        int size;
        int size2;
        super.onMeasure(i, i2);
        if (this.JXs || (movie = this.Lxb) == null) {
            return;
        }
        int iWidth = movie.width();
        int iHeight = this.Lxb.height();
        float fMax = 1.0f / Math.max((View.MeasureSpec.getMode(i) == 0 || iWidth <= (size2 = View.MeasureSpec.getSize(i))) ? 1.0f : iWidth / size2, (View.MeasureSpec.getMode(i2) == 0 || iHeight <= (size = View.MeasureSpec.getSize(i2))) ? 1.0f : iHeight / size);
        this.QAg = fMax;
        int i3 = (int) (iWidth * fMax);
        this.nBu = i3;
        int i4 = (int) (iHeight * fMax);
        this.JVA = i4;
        setMeasuredDimension(i3, i4);
    }

    @Override // android.view.View
    @SuppressLint({"NewApi"})
    public void onScreenStateChanged(int i) {
        super.onScreenStateChanged(i);
        if (this.Lxb != null) {
            this.NXR = i == 1;
            LD();
        }
    }

    @Override // android.view.View
    @SuppressLint({"NewApi"})
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (this.Lxb != null) {
            this.NXR = i == 0;
            LD();
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (this.Lxb != null) {
            this.NXR = i == 0;
            LD();
        }
    }

    public void setRepeatConfig(boolean z) {
        AnimatedImageDrawable animatedImageDrawable;
        this.STP = z;
        if (z) {
            return;
        }
        try {
            if (Build.VERSION.SDK_INT < 28 || (animatedImageDrawable = this.ZU) == null) {
                return;
            }
            animatedImageDrawable.setRepeatCount(0);
        } catch (Exception e) {
            com.bytedance.sdk.component.utils.sLN.Lxb("GifView", "setRepeatConfig error", e);
        }
    }

    private void Lxb(Canvas canvas) {
        Movie movie = this.Lxb;
        if (movie == null) {
            return;
        }
        movie.setTime(this.lk);
        float f = this.QAg;
        if (f == 0.0f) {
            canvas.scale(1.0f, 1.0f);
            this.Lxb.draw(canvas, 0.0f, 0.0f);
        } else {
            canvas.scale(f, f);
            Movie movie2 = this.Lxb;
            float f2 = this.ebl;
            float f3 = this.QAg;
            movie2.draw(canvas, f2 / f3, this.OY / f3);
        }
        canvas.restore();
    }
}
