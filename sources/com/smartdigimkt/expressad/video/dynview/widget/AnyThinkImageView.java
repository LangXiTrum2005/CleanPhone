package com.smartdigimkt.expressad.video.dynview.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.util.AttributeSet;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes5.dex */
public class AnyThinkImageView extends ImageView {
    private static final String w0 = "AnyThinkImageView";
    private Xfermode e0;
    private int f0;
    private int g0;
    private int h0;
    private int i0;
    private int j0;
    private int k0;
    private int l0;
    private int m0;
    private int n0;
    private float[] o0;
    private float[] p0;
    private RectF q0;
    private RectF r0;
    private boolean s0;
    private boolean t0;
    private Path u0;
    private Paint v0;

    public AnyThinkImageView(Context context) {
        this(context, null);
    }

    private void a(Canvas canvas) {
        a(canvas, this.m0, this.n0, this.r0, this.o0);
    }

    private void b() {
        int i2;
        int i3;
        int i4;
        try {
            if (this.o0 == null || this.p0 == null) {
                return;
            }
            int i5 = 0;
            while (true) {
                i2 = 2;
                if (i5 >= 2) {
                    break;
                }
                float[] fArr = this.o0;
                float f = this.i0;
                fArr[i5] = f;
                this.p0[i5] = f - (this.m0 / 2.0f);
                i5++;
            }
            while (true) {
                i3 = 4;
                if (i2 >= 4) {
                    break;
                }
                float[] fArr2 = this.o0;
                float f2 = this.j0;
                fArr2[i2] = f2;
                this.p0[i2] = f2 - (this.m0 / 2.0f);
                i2++;
            }
            while (true) {
                if (i3 >= 6) {
                    break;
                }
                float[] fArr3 = this.o0;
                float f3 = this.k0;
                fArr3[i3] = f3;
                this.p0[i3] = f3 - (this.m0 / 2.0f);
                i3++;
            }
            for (i4 = 6; i4 < 8; i4++) {
                float[] fArr4 = this.o0;
                float f4 = this.l0;
                fArr4[i4] = f4;
                this.p0[i4] = f4 - (this.m0 / 2.0f);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private void c() {
        RectF rectF = this.r0;
        if (rectF != null) {
            float f = this.m0 / 2.0f;
            rectF.set(f, f, this.f0 - f, this.g0 - f);
        }
    }

    private void d() {
        RectF rectF = this.q0;
        if (rectF != null) {
            rectF.set(0.0f, 0.0f, this.f0, this.g0);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        if (canvas == null) {
            return;
        }
        try {
            canvas.saveLayer(this.q0, null, 31);
            int i2 = this.f0;
            int i3 = this.m0 * 2;
            float f = (i2 - i3) * 1.0f;
            float f2 = i2;
            int i4 = this.g0;
            float f3 = i4;
            canvas.scale(f / f2, ((i4 - i3) * 1.0f) / f3, f2 / 2.0f, f3 / 2.0f);
            super.onDraw(canvas);
            Paint paint = this.v0;
            if (paint != null) {
                paint.reset();
                this.v0.setAntiAlias(true);
                this.v0.setStyle(Paint.Style.FILL);
                this.v0.setXfermode(this.e0);
            }
            Path path = this.u0;
            if (path != null) {
                path.reset();
                this.u0.addRoundRect(this.q0, this.p0, Path.Direction.CCW);
            }
            canvas.drawPath(this.u0, this.v0);
            Paint paint2 = this.v0;
            if (paint2 != null) {
                paint2.setXfermode(null);
            }
            canvas.restore();
            if (this.s0) {
                a(canvas);
            }
        } catch (Exception e2) {
            e2.getMessage();
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        this.f0 = i2;
        this.g0 = i3;
        if (this.t0) {
            b();
        } else {
            a();
        }
        c();
        d();
    }

    public void setBorder(int i2, int i3, int i4) {
        this.s0 = true;
        this.m0 = i3;
        this.n0 = i4;
        this.h0 = i2;
    }

    public void setCornerRadius(int i2) {
        this.h0 = i2;
    }

    public void setCustomBorder(int i2, int i3, int i4, int i5, int i6, int i7) {
        this.s0 = true;
        this.t0 = true;
        this.m0 = i6;
        this.n0 = i7;
        this.i0 = i2;
        this.k0 = i4;
        this.j0 = i3;
        this.l0 = i5;
    }

    public AnyThinkImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void a(Canvas canvas, int i2, int i3, RectF rectF, float[] fArr) {
        try {
            a(i2, i3);
            Path path = this.u0;
            if (path != null) {
                path.addRoundRect(rectF, fArr, Path.Direction.CCW);
            }
            if (canvas != null) {
                canvas.drawPath(this.u0, this.v0);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public AnyThinkImageView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.u0 = new Path();
        this.v0 = new Paint();
        this.o0 = new float[8];
        this.p0 = new float[8];
        this.r0 = new RectF();
        this.q0 = new RectF();
        this.e0 = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
    }

    private void a(int i2, int i3) {
        Path path = this.u0;
        if (path != null) {
            path.reset();
        }
        Paint paint = this.v0;
        if (paint != null) {
            paint.setStrokeWidth(i2);
            this.v0.setColor(i3);
            this.v0.setStyle(Paint.Style.STROKE);
        }
    }

    private void a() {
        if (this.o0 == null || this.p0 == null) {
            return;
        }
        int i2 = 0;
        while (true) {
            try {
                float[] fArr = this.o0;
                if (i2 >= fArr.length) {
                    return;
                }
                float f = this.h0;
                fArr[i2] = f;
                this.p0[i2] = f - (this.m0 / 2.0f);
                i2++;
            } catch (Exception e2) {
                e2.printStackTrace();
                return;
            }
        }
    }
}
