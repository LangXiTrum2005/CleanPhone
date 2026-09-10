package com.bytedance.sdk.openadsdk.core.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ImageDecoder;
import android.graphics.Movie;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.view.View;
import android.widget.ImageView;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3745j0;
import java.io.File;
import java.io.FileOutputStream;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"AppCompatCustomView"})
public class JXs extends ImageView {
    private boolean IeN;
    private int JVA;
    private AnimatedImageDrawable JXs;
    private Movie LD;
    private int Lxb;
    private volatile boolean NXR;
    private float OY;
    private float QAg;
    private boolean STP;
    private int ZU;
    private boolean ebl;
    private boolean lc;
    private long lk;
    private float nBu;
    private int sLN;

    public JXs(Context context) {
        super(context);
        this.lc = Build.VERSION.SDK_INT >= 28;
        this.ebl = false;
        this.STP = true;
        this.IeN = true;
        Lxb();
    }

    private AnimatedImageDrawable LD(int i) {
        if (i != -1 && Build.VERSION.SDK_INT >= 28) {
            return Lxb(ImageDecoder.createSource(getResources(), i));
        }
        return null;
    }

    private void ZU() {
        if (this.LD == null) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (this.lk == 0) {
            this.lk = jUptimeMillis;
        }
        int iDuration = this.LD.duration();
        if (iDuration == 0) {
            iDuration = 1000;
        }
        if (this.IeN || Math.abs(iDuration - this.ZU) >= 60) {
            this.ZU = (int) ((jUptimeMillis - this.lk) % ((long) iDuration));
        } else {
            this.ZU = iDuration;
            this.NXR = true;
        }
    }

    private ImageDecoder.Source lk(byte[] bArr) {
        FileOutputStream fileOutputStream;
        try {
            File fileLxb = Lxb(getContext(), com.bytedance.sdk.openadsdk.multipro.LD.lk() ? "GIF_AD_CACHE/" : "/GIF_CACHE/", "TT_GIF_FILE");
            fileOutputStream = new FileOutputStream(fileLxb);
            try {
                fileOutputStream.write(bArr, 0, bArr.length);
                if (Build.VERSION.SDK_INT >= 28) {
                    ImageDecoder.Source sourceCreateSource = ImageDecoder.createSource(fileLxb);
                    try {
                        fileOutputStream.close();
                    } catch (Throwable unused) {
                    }
                    return sourceCreateSource;
                }
            } catch (Throwable th) {
                th = th;
                try {
                    com.bytedance.sdk.component.utils.sLN.Lxb("GifView", "GifView  getSourceByFile fail : ", th);
                    return null;
                } finally {
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable unused2) {
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream = null;
        }
        return null;
    }

    public void Lxb() {
        if (this.lc) {
            return;
        }
        setLayerType(1, null);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        if (this.LD == null || this.lc) {
            super.onDraw(canvas);
            return;
        }
        try {
            if (this.NXR) {
                Lxb(canvas);
                return;
            }
            ZU();
            Lxb(canvas);
            lk();
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.sLN.Lxb("GifView", "onDraw->Throwable->", th);
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.LD != null && !this.lc) {
            this.OY = (getWidth() - this.JVA) / 2.0f;
            this.QAg = (getHeight() - this.sLN) / 2.0f;
        }
        this.STP = getVisibility() == 0;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        Movie movie;
        int size;
        int size2;
        super.onMeasure(i, i2);
        if (this.lc || (movie = this.LD) == null) {
            return;
        }
        int iWidth = movie.width();
        int iHeight = this.LD.height();
        float fMax = 1.0f / Math.max((View.MeasureSpec.getMode(i) == 0 || iWidth <= (size2 = View.MeasureSpec.getSize(i))) ? 1.0f : iWidth / size2, (View.MeasureSpec.getMode(i2) == 0 || iHeight <= (size = View.MeasureSpec.getSize(i2))) ? 1.0f : iHeight / size);
        this.nBu = fMax;
        int i3 = (int) (iWidth * fMax);
        this.JVA = i3;
        int i4 = (int) (iHeight * fMax);
        this.sLN = i4;
        setMeasuredDimension(i3, i4);
    }

    @Override // android.view.View
    @SuppressLint({"NewApi"})
    public void onScreenStateChanged(int i) {
        super.onScreenStateChanged(i);
        if (this.LD != null) {
            this.STP = i == 1;
            lk();
        }
    }

    @Override // android.view.View
    @SuppressLint({"NewApi"})
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (this.LD != null) {
            this.STP = i == 0;
            lk();
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (this.LD != null) {
            this.STP = i == 0;
            lk();
        }
    }

    public void setRepeatConfig(boolean z) {
        AnimatedImageDrawable animatedImageDrawable;
        this.IeN = z;
        if (z) {
            return;
        }
        try {
            if (Build.VERSION.SDK_INT < 28 || (animatedImageDrawable = this.JXs) == null) {
                return;
            }
            animatedImageDrawable.setRepeatCount(0);
        } catch (Exception e) {
            com.bytedance.sdk.component.utils.sLN.Lxb("GifView", "setRepeatConfig error", e);
        }
    }

    public void Lxb(int i, boolean z) {
        this.NXR = z;
        this.Lxb = i;
        if (i != -1) {
            if (!this.lc) {
                this.LD = Lxb(i);
            } else {
                this.JXs = LD(i);
            }
        }
    }

    private AnimatedImageDrawable LD(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Lxb(lk(bArr));
    }

    public void LD() {
        if (this.LD == null || !this.NXR) {
            return;
        }
        this.NXR = false;
        if (!this.lc) {
            this.lk = SystemClock.uptimeMillis() - ((long) this.ZU);
            invalidate();
            return;
        }
        AnimatedImageDrawable animatedImageDrawable = this.JXs;
        if (animatedImageDrawable == null || animatedImageDrawable.isRunning()) {
            return;
        }
        this.JXs.start();
    }

    public void Lxb(byte[] bArr, boolean z) {
        this.NXR = z;
        if (bArr != null) {
            if (!this.lc) {
                this.LD = Lxb(bArr);
            } else {
                this.JXs = LD(bArr);
            }
            lk();
        }
    }

    private void lk() {
        if (this.LD == null || this.lc || !this.STP) {
            return;
        }
        postInvalidateOnAnimation();
    }

    private Movie Lxb(int i) {
        try {
            return Movie.decodeStream(getResources().openRawResource(i));
        } catch (Throwable unused) {
            return null;
        }
    }

    private Movie Lxb(byte[] bArr) {
        try {
            return Movie.decodeByteArray(bArr, 0, bArr.length);
        } catch (Throwable unused) {
            return null;
        }
    }

    private AnimatedImageDrawable Lxb(ImageDecoder.Source source) {
        try {
            if (Build.VERSION.SDK_INT < 28) {
                return null;
            }
            Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(source);
            setImageDrawable(drawableDecodeDrawable);
            if (AbstractC3745j0.q(drawableDecodeDrawable)) {
                AnimatedImageDrawable animatedImageDrawableC = AbstractC3745j0.c(drawableDecodeDrawable);
                if (!this.NXR) {
                    animatedImageDrawableC.start();
                }
                return animatedImageDrawableC;
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public static File Lxb(Context context, String str, String str2) {
        return com.bytedance.sdk.component.utils.lc.Lxb(context, com.bytedance.sdk.openadsdk.multipro.LD.lk(), str, str2);
    }

    private void Lxb(Canvas canvas) {
        Movie movie = this.LD;
        if (movie == null) {
            return;
        }
        movie.setTime(this.ZU);
        float f = this.nBu;
        if (f == 0.0f) {
            canvas.scale(1.0f, 1.0f);
            this.LD.draw(canvas, 0.0f, 0.0f);
        } else {
            canvas.scale(f, f);
            Movie movie2 = this.LD;
            float f2 = this.OY;
            float f3 = this.nBu;
            movie2.draw(canvas, f2 / f3, this.QAg / f3);
        }
        canvas.restore();
    }
}
