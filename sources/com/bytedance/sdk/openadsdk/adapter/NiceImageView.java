package com.bytedance.sdk.openadsdk.adapter;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.os.Build;
import android.util.AttributeSet;
import com.bytedance.sdk.openadsdk.core.mo.mml;
import com.bytedance.sdk.openadsdk.utils.ax;

/* JADX INFO: loaded from: classes3.dex */
public class NiceImageView extends mml {
    private RectF aaj;
    private Path bch;
    private int bjy;
    private final float[] exc;
    private int exu;
    private int fs;
    private final float[] jl;
    private int jpc;
    private int jtx;
    private final RectF jyq;
    private final Path ljh;
    private boolean lnr;
    private int mml;
    private int mo;
    private int mzz;
    private final Paint oth;
    private final Context qdl;
    private final Xfermode rdp;
    private int rq;
    private int to;
    private int tvp;
    private boolean ud;
    private int wd;
    private float yt;

    public NiceImageView(Context context) {
        this(context, null);
    }

    private void lnr() {
        if (this.ud) {
            return;
        }
        int i2 = 0;
        if (this.jpc <= 0) {
            float[] fArr = this.jl;
            int i3 = this.tvp;
            float f = i3;
            fArr[1] = f;
            fArr[0] = f;
            int i4 = this.to;
            float f2 = i4;
            fArr[3] = f2;
            fArr[2] = f2;
            int i5 = this.fs;
            float f3 = i5;
            fArr[5] = f3;
            fArr[4] = f3;
            int i6 = this.rq;
            float f4 = i6;
            fArr[7] = f4;
            fArr[6] = f4;
            float[] fArr2 = this.exc;
            int i7 = this.mml;
            float f5 = i3 - (i7 / 2.0f);
            fArr2[1] = f5;
            fArr2[0] = f5;
            float f6 = i4 - (i7 / 2.0f);
            fArr2[3] = f6;
            fArr2[2] = f6;
            float f7 = i5 - (i7 / 2.0f);
            fArr2[5] = f7;
            fArr2[4] = f7;
            float f8 = i6 - (i7 / 2.0f);
            fArr2[7] = f8;
            fArr2[6] = f8;
            return;
        }
        while (true) {
            float[] fArr3 = this.jl;
            if (i2 >= fArr3.length) {
                return;
            }
            int i8 = this.jpc;
            fArr3[i2] = i8;
            this.exc[i2] = i8 - (this.mml / 2.0f);
            i2++;
        }
    }

    private void mml() {
        if (this.ud) {
            return;
        }
        this.mo = 0;
    }

    private void qdl(Canvas canvas) {
        if (!this.ud) {
            int i2 = this.mml;
            if (i2 > 0) {
                qdl(canvas, i2, this.mzz, this.jyq, this.jl);
                return;
            }
            return;
        }
        int i3 = this.mml;
        if (i3 > 0) {
            qdl(canvas, i3, this.mzz, this.yt - (i3 / 2.0f));
        }
        int i4 = this.mo;
        if (i4 > 0) {
            qdl(canvas, i4, this.wd, (this.yt - this.mml) - (i4 / 2.0f));
        }
    }

    private void ud() {
        if (!this.ud) {
            this.aaj.set(0.0f, 0.0f, this.bjy, this.jtx);
            if (this.lnr) {
                this.aaj = this.jyq;
                return;
            }
            return;
        }
        float fMin = Math.min(this.bjy, this.jtx) / 2.0f;
        this.yt = fMin;
        RectF rectF = this.aaj;
        int i2 = this.bjy;
        int i3 = this.jtx;
        rectF.set((i2 / 2.0f) - fMin, (i3 / 2.0f) - fMin, (i2 / 2.0f) + fMin, (i3 / 2.0f) + fMin);
    }

    public void isCircle(boolean z2) {
        this.ud = z2;
        mml();
        ud();
        invalidate();
    }

    public void isCoverSrc(boolean z2) {
        this.lnr = z2;
        ud();
        invalidate();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        canvas.saveLayer(this.aaj, null, 31);
        if (!this.lnr) {
            int i2 = this.bjy;
            int i3 = this.mml;
            int i4 = this.mo;
            int i5 = this.jtx;
            canvas.scale((((i2 - (i3 * 2)) - (i4 * 2)) * 1.0f) / i2, (((i5 - (i3 * 2)) - (i4 * 2)) * 1.0f) / i5, i2 / 2.0f, i5 / 2.0f);
        }
        super.onDraw(canvas);
        this.oth.reset();
        this.ljh.reset();
        if (this.ud) {
            this.ljh.addCircle(this.bjy / 2.0f, this.jtx / 2.0f, this.yt, Path.Direction.CCW);
        } else {
            this.ljh.addRoundRect(this.aaj, this.exc, Path.Direction.CCW);
        }
        this.oth.setAntiAlias(true);
        this.oth.setStyle(Paint.Style.FILL);
        this.oth.setXfermode(this.rdp);
        if (Build.VERSION.SDK_INT <= 27) {
            canvas.drawPath(this.ljh, this.oth);
        } else {
            this.bch.addRect(this.aaj, Path.Direction.CCW);
            this.bch.op(this.ljh, Path.Op.DIFFERENCE);
            canvas.drawPath(this.bch, this.oth);
        }
        this.oth.setXfermode(null);
        int i6 = this.exu;
        if (i6 != 0) {
            this.oth.setColor(i6);
            canvas.drawPath(this.ljh, this.oth);
        }
        canvas.restore();
        qdl(canvas);
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        this.bjy = i2;
        this.jtx = i3;
        qdl();
        ud();
    }

    public void setBorderColor(int i2) {
        this.mzz = i2;
        invalidate();
    }

    public void setBorderWidth(int i2) {
        this.mml = ax.ud(this.qdl, i2);
        qdl(false);
    }

    public void setCornerBottomLeftRadius(int i2) {
        this.rq = ax.ud(this.qdl, i2);
        qdl(true);
    }

    public void setCornerBottomRightRadius(int i2) {
        this.fs = ax.ud(this.qdl, i2);
        qdl(true);
    }

    public void setCornerRadius(int i2) {
        this.jpc = ax.ud(this.qdl, i2);
        qdl(false);
    }

    public void setCornerTopLeftRadius(int i2) {
        this.tvp = ax.ud(this.qdl, i2);
        qdl(true);
    }

    public void setCornerTopRightRadius(int i2) {
        this.to = ax.ud(this.qdl, i2);
        qdl(true);
    }

    public void setInnerBorderColor(int i2) {
        this.wd = i2;
        invalidate();
    }

    public void setInnerBorderWidth(int i2) {
        this.mo = ax.ud(this.qdl, i2);
        mml();
        invalidate();
    }

    public void setMaskColor(int i2) {
        this.exu = i2;
        invalidate();
    }

    public NiceImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NiceImageView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.mzz = -1;
        this.wd = -1;
        this.qdl = context;
        this.jpc = ax.ud(context, 10.0f);
        this.jl = new float[8];
        this.exc = new float[8];
        this.jyq = new RectF();
        this.aaj = new RectF();
        this.oth = new Paint();
        this.ljh = new Path();
        if (Build.VERSION.SDK_INT <= 27) {
            this.rdp = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
        } else {
            this.rdp = new PorterDuffXfermode(PorterDuff.Mode.DST_OUT);
            this.bch = new Path();
        }
        lnr();
        mml();
    }

    private void qdl(Canvas canvas, int i2, int i3, float f) {
        qdl(i2, i3);
        this.ljh.addCircle(this.bjy / 2.0f, this.jtx / 2.0f, f, Path.Direction.CCW);
        canvas.drawPath(this.ljh, this.oth);
    }

    private void qdl(Canvas canvas, int i2, int i3, RectF rectF, float[] fArr) {
        qdl(i2, i3);
        this.ljh.addRoundRect(rectF, fArr, Path.Direction.CCW);
        canvas.drawPath(this.ljh, this.oth);
    }

    private void qdl(int i2, int i3) {
        this.ljh.reset();
        this.oth.setStrokeWidth(i2);
        this.oth.setColor(i3);
        this.oth.setStyle(Paint.Style.STROKE);
    }

    private void qdl() {
        if (this.ud) {
            return;
        }
        RectF rectF = this.jyq;
        int i2 = this.mml;
        rectF.set(i2 / 2.0f, i2 / 2.0f, this.bjy - (i2 / 2.0f), this.jtx - (i2 / 2.0f));
    }

    private void qdl(boolean z2) {
        if (z2) {
            this.jpc = 0;
        }
        lnr();
        qdl();
        invalidate();
    }
}
