package com.smartdigimkt.expressad.foundation.webview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import com.smartdigimkt.v0.k;

/* JADX INFO: loaded from: classes5.dex */
public class ProgressBar extends View implements com.smartdigimkt.expressad.foundation.webview.a {
    private static final String D0 = "ProgressBar";
    private static final boolean E0 = false;
    private static final float F0 = 0.05f;
    private static final float G0 = 0.2f;
    private static final float H0 = 0.4f;
    private static final float I0 = 1.0f;
    private static final long J0 = 2000;
    private static final float K0 = 0.2f;
    private static final float L0 = 1200.0f;
    private static final long M0 = 25;
    Runnable A0;
    private boolean B0;
    private boolean C0;
    private Rect e0;
    private float f0;
    private float g0;
    private long h0;
    private float i0;
    private boolean j0;
    private float k0;
    private float l0;
    private float m0;
    private long n0;
    private int o0;
    private int p0;
    private int q0;
    private int r0;
    private long s0;
    private Drawable t0;
    private Drawable u0;
    private Drawable v0;
    private Drawable w0;
    private boolean x0;
    private com.smartdigimkt.expressad.foundation.webview.a.InterfaceC0472a y0;
    private Handler z0;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ProgressBar.this.invalidate();
        }
    }

    public ProgressBar(Context context) {
        super(context);
        this.e0 = new Rect();
        this.g0 = 0.95f;
        this.s0 = M0;
        this.x0 = false;
        this.z0 = new Handler(Looper.getMainLooper());
        this.A0 = new a();
        this.C0 = false;
        a(context);
    }

    private void a(Context context) {
        setWillNotDraw(false);
    }

    private float getVelocity() {
        if (this.j0) {
            if (this.B0) {
                return 1.0f;
            }
            return H0;
        }
        if (this.n0 < 2000) {
            if (this.q0 == 1) {
                if (this.B0) {
                    return 1.0f;
                }
                return H0;
            }
            if (this.p0 == 1) {
                if (this.B0) {
                    return H0;
                }
                return 0.2f;
            }
            if (this.B0) {
                return 0.2f;
            }
        }
        return F0;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        if (!this.x0) {
            this.x0 = true;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = this.C0 ? 0L : jCurrentTimeMillis - this.h0;
        this.i0 = Math.abs(j / 1000.0f);
        this.h0 = jCurrentTimeMillis;
        this.n0 += j;
        float velocity = getVelocity();
        this.m0 = velocity;
        float f = (velocity * this.i0) + this.l0;
        this.l0 = f;
        if (!this.j0) {
            float f2 = this.g0;
            if (f > f2) {
                this.l0 = f2;
            }
        }
        this.e0.right = (int) (this.l0 * this.f0);
        this.z0.removeCallbacksAndMessages(null);
        this.z0.postDelayed(this.A0, this.s0);
        super.draw(canvas);
        a(canvas, this.i0);
    }

    @Override // android.view.View
    public Bitmap getDrawingCache(boolean z2) {
        return null;
    }

    @Override // com.smartdigimkt.expressad.foundation.webview.a
    public float getProgress() {
        return this.l0;
    }

    @Override // com.smartdigimkt.expressad.foundation.webview.a
    public void initResource(boolean z2) {
        if (z2 || (this.w0 == null && this.t0 == null && this.u0 == null && this.v0 == null)) {
            Drawable drawable = getResources().getDrawable(k.a(getContext(), "sdm_cm_highlight", k.d));
            this.w0 = drawable;
            if (drawable != null) {
                drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), this.w0.getIntrinsicHeight());
            }
            Drawable drawable2 = getResources().getDrawable(k.a(getContext(), "sdm_cm_head", k.d));
            this.t0 = drawable2;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, drawable2.getIntrinsicWidth(), this.t0.getIntrinsicHeight());
            }
            this.u0 = getResources().getDrawable(k.a(getContext(), "sdm_cm_tail", k.d));
            this.v0 = getResources().getDrawable(k.a(getContext(), "sdm_cm_end_animation", k.d));
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        this.f0 = getMeasuredWidth();
    }

    @Override // com.smartdigimkt.expressad.foundation.webview.a
    public void onThemeChange() {
        if (this.x0) {
            initResource(true);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
        Drawable drawable = this.w0;
        if (drawable != null) {
            drawable.setBounds(0, 0, (int) (((double) drawable.getIntrinsicWidth()) * 1.5d), getHeight());
        }
        Drawable drawable2 = this.t0;
        if (drawable2 != null) {
            drawable2.setBounds(0, 0, getWidth(), getHeight());
        }
    }

    @Override // com.smartdigimkt.expressad.foundation.webview.a
    public void setPaused(boolean z2) {
        this.C0 = z2;
        if (z2) {
            return;
        }
        this.h0 = System.currentTimeMillis();
    }

    @Override // com.smartdigimkt.expressad.foundation.webview.a
    public void setProgress(float f, boolean z2) {
        if (!z2 || f < 1.0f) {
            return;
        }
        startEndAnimation();
    }

    @Override // com.smartdigimkt.expressad.foundation.webview.a
    public void setProgressBarListener(com.smartdigimkt.expressad.foundation.webview.a.InterfaceC0472a interfaceC0472a) {
        this.y0 = interfaceC0472a;
    }

    @Override // com.smartdigimkt.expressad.foundation.webview.a
    public void setProgressState(int i2) {
        if (i2 == 5) {
            this.p0 = 1;
            this.q0 = 0;
            this.r0 = 0;
            this.n0 = 0L;
            return;
        }
        if (i2 == 6) {
            this.q0 = 1;
            if (this.r0 == 1) {
                startEndAnimation();
            }
            this.n0 = 0L;
            return;
        }
        if (i2 == 7) {
            startEndAnimation();
        } else {
            if (i2 != 8) {
                return;
            }
            this.r0 = 1;
            if (this.q0 == 1) {
                startEndAnimation();
            }
        }
    }

    @Override // android.view.View, com.smartdigimkt.expressad.foundation.webview.a
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        if (i2 == 0) {
            com.smartdigimkt.expressad.foundation.webview.a.InterfaceC0472a interfaceC0472a = this.y0;
            if (interfaceC0472a != null) {
                interfaceC0472a.a(true);
                return;
            }
            return;
        }
        com.smartdigimkt.expressad.foundation.webview.a.InterfaceC0472a interfaceC0472a2 = this.y0;
        if (interfaceC0472a2 != null) {
            interfaceC0472a2.a(false);
        }
    }

    @Override // com.smartdigimkt.expressad.foundation.webview.a
    public void setVisible(boolean z2) {
        if (!z2) {
            setVisibility(4);
            return;
        }
        this.B0 = true;
        this.h0 = System.currentTimeMillis();
        this.i0 = 0.0f;
        this.n0 = 0L;
        this.j0 = false;
        this.k0 = 0.0f;
        this.l0 = 0.0f;
        this.f0 = getMeasuredWidth();
        this.C0 = false;
        this.p0 = 0;
        this.q0 = 0;
        this.r0 = 0;
        Drawable drawable = this.w0;
        if (drawable != null) {
            this.o0 = -drawable.getIntrinsicWidth();
        } else {
            this.o0 = 0;
        }
        Drawable drawable2 = this.u0;
        if (drawable2 != null) {
            drawable2.setAlpha(255);
        }
        Drawable drawable3 = this.v0;
        if (drawable3 != null) {
            drawable3.setAlpha(255);
        }
        Drawable drawable4 = this.t0;
        if (drawable4 != null) {
            drawable4.setAlpha(255);
        }
        setVisibility(0);
        invalidate();
    }

    @Override // com.smartdigimkt.expressad.foundation.webview.a
    public void startEndAnimation() {
        if (this.j0) {
            return;
        }
        this.j0 = true;
        this.k0 = 0.0f;
    }

    private void a(Canvas canvas, float f) {
        Drawable drawable;
        Drawable drawable2;
        if (this.j0) {
            float f2 = this.k0;
            float f3 = this.f0 * 0.5f;
            int i2 = (int) ((1.0f - (f2 / f3)) * 255.0f);
            if (i2 < 0) {
                i2 = 0;
            }
            if (f2 > f3) {
                setVisible(false);
            }
            Drawable drawable3 = this.u0;
            if (drawable3 != null) {
                drawable3.setAlpha(i2);
            }
            Drawable drawable4 = this.v0;
            if (drawable4 != null) {
                drawable4.setAlpha(i2);
            }
            Drawable drawable5 = this.t0;
            if (drawable5 != null) {
                drawable5.setAlpha(i2);
            }
            canvas.save();
            canvas.translate(this.k0, 0.0f);
        }
        if (this.u0 != null && this.t0 != null) {
            int iWidth = (int) (this.e0.width() - (this.t0.getIntrinsicWidth() * F0));
            Drawable drawable6 = this.u0;
            drawable6.setBounds(0, 0, iWidth, drawable6.getIntrinsicHeight());
            this.u0.draw(canvas);
        }
        if (this.j0 && (drawable2 = this.v0) != null && this.t0 != null) {
            int intrinsicWidth = drawable2.getIntrinsicWidth();
            Drawable drawable7 = this.v0;
            drawable7.setBounds(0, 0, intrinsicWidth, drawable7.getIntrinsicHeight());
            canvas.save();
            canvas.translate(-intrinsicWidth, 0.0f);
            this.v0.draw(canvas);
            canvas.restore();
        }
        if (this.t0 != null) {
            canvas.save();
            canvas.translate(this.e0.width() - getWidth(), 0.0f);
            this.t0.draw(canvas);
            canvas.restore();
        }
        if (!this.j0 && Math.abs(this.l0 - this.g0) < 1.0E-5f && (drawable = this.w0) != null) {
            int i3 = (int) ((f * 0.2f * this.f0) + this.o0);
            this.o0 = i3;
            if (drawable.getIntrinsicWidth() + i3 >= this.e0.width()) {
                this.o0 = -this.w0.getIntrinsicWidth();
            }
            canvas.save();
            canvas.translate(this.o0, 0.0f);
            this.w0.draw(canvas);
            canvas.restore();
        }
        if (this.j0) {
            canvas.restore();
        }
    }

    public ProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e0 = new Rect();
        this.g0 = 0.95f;
        this.s0 = M0;
        this.x0 = false;
        this.z0 = new Handler(Looper.getMainLooper());
        this.A0 = new a();
        this.C0 = false;
        a(context);
    }
}
