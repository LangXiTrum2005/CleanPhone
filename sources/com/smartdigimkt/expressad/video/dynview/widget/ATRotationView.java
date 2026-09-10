package com.smartdigimkt.expressad.video.dynview.widget;

import android.content.Context;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes5.dex */
public class ATRotationView extends FrameLayout {
    private Camera e0;
    private Matrix f0;
    private int g0;
    private int h0;
    private int i0;
    private int j0;
    private int k0;
    private int l0;
    private int m0;
    private int n0;
    private float o0;
    private float p0;
    private boolean q0;
    private boolean r0;
    private boolean s0;
    Runnable t0;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ATRotationView.this.b();
        }
    }

    public ATRotationView(Context context) {
        super(context);
        this.i0 = 40;
        this.j0 = 20;
        this.k0 = 0;
        this.l0 = 0;
        this.n0 = 0;
        this.o0 = 0.5f;
        this.p0 = 0.9f;
        this.q0 = true;
        this.r0 = false;
        this.s0 = false;
        this.t0 = new a();
        a();
    }

    private void b(Canvas canvas) {
        int height = getHeight() / 2;
        int i2 = ((this.k0 * this.g0) / 2) / this.i0;
        a(canvas, i2, height, 0);
        a(canvas, i2, height, 1);
        if (Math.abs(this.k0) > this.i0 / 2) {
            a(canvas, i2, height, 3);
            a(canvas, i2, height, 2);
        } else {
            a(canvas, i2, height, 2);
            a(canvas, i2, height, 3);
        }
    }

    private int c(int i2) {
        int i3;
        int i4;
        int i5;
        if (i2 == 0) {
            i3 = this.s0 ? this.l0 - 2 : this.l0 + 2;
        } else if (i2 != 1) {
            if (i2 != 2) {
                i3 = i2 != 3 ? 0 : this.l0;
            } else if (this.s0) {
                i4 = this.l0;
                i3 = i4 - 1;
            } else {
                i5 = this.l0;
                i3 = i5 + 1;
            }
        } else if (this.s0) {
            i5 = this.l0;
            i3 = i5 + 1;
        } else {
            i4 = this.l0;
            i3 = i4 - 1;
        }
        int childCount = i3 % getChildCount();
        return childCount >= 0 ? childCount : getChildCount() + childCount;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (getChildCount() == 0) {
            return;
        }
        if (this.r0) {
            b(canvas);
        } else {
            a(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int i6 = i4 - i2;
        float f = i6;
        float f2 = this.o0;
        int i7 = (int) (((1.0f - f2) * f) / 2.0f);
        int i8 = i5 - i3;
        float f3 = i8;
        float f4 = this.p0;
        int i9 = (int) (((1.0f - f4) * f3) / 2.0f);
        this.g0 = (int) (f3 * f4);
        this.h0 = (int) (f * f2);
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            childAt.layout(i7, i9, i6 - i7, i8 - i9);
            childAt.setClickable(true);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            int i11 = layoutParams.width;
            int i12 = this.h0;
            if (i11 != i12) {
                layoutParams.width = i12;
                layoutParams.height = this.g0;
                childAt.setLayoutParams(layoutParams);
            }
        }
    }

    public void setAutoscroll(boolean z2) {
        if (z2) {
            postDelayed(this.t0, 1000 / this.j0);
        }
        this.q0 = z2;
    }

    public void setHeightRatio(float f) {
        this.p0 = f;
    }

    public void setRotateV(boolean z2) {
        this.r0 = z2;
        invalidate();
    }

    public void setWidthRatio(float f) {
        this.o0 = f;
    }

    private void a() {
        this.e0 = new Camera();
        this.f0 = new Matrix();
        setWillNotDraw(false);
    }

    private void a(Canvas canvas) {
        int width = getWidth() / 2;
        int i2 = ((this.k0 * this.h0) / 2) / this.i0;
        b(canvas, i2, width, 0);
        b(canvas, i2, width, 1);
        if (Math.abs(this.k0) > this.i0 / 2) {
            b(canvas, i2, width, 3);
            b(canvas, i2, width, 2);
        } else {
            b(canvas, i2, width, 2);
            b(canvas, i2, width, 3);
        }
    }

    private void b(int i2, int i3, int i4) {
        float f = (-i2) / 2.0f;
        if (i4 == 0) {
            this.e0.translate(0.0f, f, 0.0f);
            float f2 = -i3;
            this.e0.rotateX(f2);
            this.e0.translate(0.0f, f, 0.0f);
            this.e0.translate(0.0f, f, 0.0f);
            this.e0.rotateX(f2);
            this.e0.translate(0.0f, f, 0.0f);
            return;
        }
        if (i4 == 1) {
            this.e0.translate(0.0f, f, 0.0f);
            this.e0.rotateX(i3);
            this.e0.translate(0.0f, f, 0.0f);
        } else if (i4 != 2) {
            if (i4 != 3) {
                return;
            }
            this.e0.rotateX(0.0f);
        } else {
            this.e0.translate(0.0f, f, 0.0f);
            this.e0.rotateX(-i3);
            this.e0.translate(0.0f, f, 0.0f);
        }
    }

    public ATRotationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.i0 = 40;
        this.j0 = 20;
        this.k0 = 0;
        this.l0 = 0;
        this.n0 = 0;
        this.o0 = 0.5f;
        this.p0 = 0.9f;
        this.q0 = true;
        this.r0 = false;
        this.s0 = false;
        this.t0 = new a();
        a();
    }

    private void a(Canvas canvas, int i2, int i3, int i4) {
        canvas.save();
        this.e0.save();
        this.f0.reset();
        float f = i2;
        this.e0.translate(0.0f, f, 0.0f);
        this.e0.rotateX(this.k0);
        this.e0.translate(0.0f, f, 0.0f);
        if (i2 == 0) {
            if (this.s0) {
                b(this.g0, this.i0, i4);
            } else {
                b(-this.g0, -this.i0, i4);
            }
        } else if (i2 > 0) {
            b(this.g0, this.i0, i4);
        } else if (i2 < 0) {
            b(-this.g0, -this.i0, i4);
        }
        this.e0.getMatrix(this.f0);
        this.e0.restore();
        this.f0.preTranslate((-getWidth()) / 2, -i3);
        this.f0.postTranslate(getWidth() / 2, i3);
        canvas.concat(this.f0);
        View childAt = getChildAt(c(i4));
        if (childAt != null) {
            drawChild(canvas, childAt, 0L);
        }
        canvas.restore();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        if (getChildCount() == 0) {
            return;
        }
        int i2 = this.k0 - 1;
        this.k0 = i2;
        this.m0 = this.l0;
        a(i2);
        if (this.q0) {
            postDelayed(this.t0, 1000 / this.j0);
        }
    }

    public ATRotationView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.i0 = 40;
        this.j0 = 20;
        this.k0 = 0;
        this.l0 = 0;
        this.n0 = 0;
        this.o0 = 0.5f;
        this.p0 = 0.9f;
        this.q0 = true;
        this.r0 = false;
        this.s0 = false;
        this.t0 = new a();
        a();
    }

    private void b(Canvas canvas, int i2, int i3, int i4) {
        canvas.save();
        this.e0.save();
        this.f0.reset();
        float f = i2;
        this.e0.translate(f, 0.0f, 0.0f);
        this.e0.rotateY(this.k0);
        this.e0.translate(f, 0.0f, 0.0f);
        if (i2 == 0) {
            if (this.s0) {
                a(this.h0, this.i0, i4);
            } else {
                a(-this.h0, -this.i0, i4);
            }
        } else if (i2 > 0) {
            a(this.h0, this.i0, i4);
        } else if (i2 < 0) {
            a(-this.h0, -this.i0, i4);
        }
        this.e0.getMatrix(this.f0);
        this.e0.restore();
        this.f0.preTranslate(-i3, (-getHeight()) / 2);
        this.f0.postTranslate(i3, getHeight() / 2);
        canvas.concat(this.f0);
        View childAt = getChildAt(c(i4));
        if (childAt != null) {
            drawChild(canvas, childAt, 0L);
        }
        canvas.restore();
    }

    private void a(int i2) {
        int i3 = this.i0;
        int i4 = this.m0 - (i2 / i3);
        this.k0 = i2 % i3;
        b(i4);
        invalidate();
    }

    private void a(int i2, int i3, int i4) {
        if (i4 == 0) {
            float f = (-i2) / 2;
            this.e0.translate(f, 0.0f, 0.0f);
            float f2 = -i3;
            this.e0.rotateY(f2);
            this.e0.translate(f, 0.0f, 0.0f);
            this.e0.translate(f, 0.0f, 0.0f);
            this.e0.rotateY(f2);
            this.e0.translate(f, 0.0f, 0.0f);
            return;
        }
        if (i4 == 1) {
            float f3 = i2 / 2;
            this.e0.translate(f3, 0.0f, 0.0f);
            this.e0.rotateY(i3);
            this.e0.translate(f3, 0.0f, 0.0f);
            return;
        }
        if (i4 != 2) {
            if (i4 != 3) {
                return;
            }
            this.e0.rotateY(0.0f);
        } else {
            float f4 = (-i2) / 2;
            this.e0.translate(f4, 0.0f, 0.0f);
            this.e0.rotateY(-i3);
            this.e0.translate(f4, 0.0f, 0.0f);
        }
    }

    private void b(int i2) {
        int iC;
        this.l0 = i2;
        if (Math.abs(this.k0) > this.i0 / 2) {
            iC = c(2);
        } else {
            iC = c(3);
        }
        if (this.n0 != iC) {
            this.n0 = iC;
        }
    }
}
