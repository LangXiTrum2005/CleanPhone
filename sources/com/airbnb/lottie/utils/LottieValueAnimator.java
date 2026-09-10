package com.airbnb.lottie.utils;

import android.animation.Animator;
import android.graphics.PointF;
import android.view.Choreographer;
import com.airbnb.lottie.L;
import com.airbnb.lottie.LottieComposition;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class LottieValueAnimator extends BaseLottieAnimator implements Choreographer.FrameCallback {
    public float Z;
    public boolean e0;
    public long f0;
    public float g0;
    public int h0;
    public float i0;
    public float j0;
    public LottieComposition k0;
    public boolean l0;

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void cancel() {
        Iterator it = this.f9941Y.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorListener) it.next()).onAnimationCancel(this);
        }
        b(i());
        j(true);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        boolean z2 = false;
        if (this.l0) {
            j(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
        LottieComposition lottieComposition = this.k0;
        if (lottieComposition == null || !this.l0) {
            return;
        }
        long j2 = this.f0;
        float fAbs = (j2 != 0 ? j - j2 : 0L) / ((1.0E9f / lottieComposition.m) / Math.abs(this.Z));
        float f = this.g0;
        if (i()) {
            fAbs = -fAbs;
        }
        float f2 = f + fAbs;
        this.g0 = f2;
        float fG = g();
        float f3 = f();
        PointF pointF = MiscUtils.f9945a;
        if (f2 >= fG && f2 <= f3) {
            z2 = true;
        }
        this.g0 = MiscUtils.b(this.g0, g(), f());
        this.f0 = j;
        c();
        if (!z2) {
            if (getRepeatCount() == -1 || this.h0 < getRepeatCount()) {
                Iterator it = this.f9941Y.iterator();
                while (it.hasNext()) {
                    ((Animator.AnimatorListener) it.next()).onAnimationRepeat(this);
                }
                this.h0++;
                if (getRepeatMode() == 2) {
                    this.e0 = !this.e0;
                    this.Z = -this.Z;
                } else {
                    this.g0 = i() ? f() : g();
                }
                this.f0 = j;
            } else {
                this.g0 = this.Z < 0.0f ? g() : f();
                j(true);
                b(i());
            }
        }
        if (this.k0 != null) {
            float f4 = this.g0;
            if (f4 < this.i0 || f4 > this.j0) {
                throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.i0), Float.valueOf(this.j0), Float.valueOf(this.g0)));
            }
        }
        L.a();
    }

    public final float e() {
        LottieComposition lottieComposition = this.k0;
        if (lottieComposition == null) {
            return 0.0f;
        }
        float f = this.g0;
        float f2 = lottieComposition.k;
        return (f - f2) / (lottieComposition.f9520l - f2);
    }

    public final float f() {
        LottieComposition lottieComposition = this.k0;
        if (lottieComposition == null) {
            return 0.0f;
        }
        float f = this.j0;
        return f == 2.1474836E9f ? lottieComposition.f9520l : f;
    }

    public final float g() {
        LottieComposition lottieComposition = this.k0;
        if (lottieComposition == null) {
            return 0.0f;
        }
        float f = this.i0;
        return f == -2.1474836E9f ? lottieComposition.k : f;
    }

    @Override // android.animation.ValueAnimator
    public final float getAnimatedFraction() {
        float fG;
        float f;
        float fG2;
        if (this.k0 == null) {
            return 0.0f;
        }
        if (i()) {
            fG = f() - this.g0;
            f = f();
            fG2 = g();
        } else {
            fG = this.g0 - g();
            f = f();
            fG2 = g();
        }
        return fG / (f - fG2);
    }

    @Override // android.animation.ValueAnimator
    public final Object getAnimatedValue() {
        return Float.valueOf(e());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final long getDuration() {
        LottieComposition lottieComposition = this.k0;
        if (lottieComposition == null) {
            return 0L;
        }
        return (long) lottieComposition.b();
    }

    public final boolean i() {
        return this.Z < 0.0f;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final boolean isRunning() {
        return this.l0;
    }

    public final void j(boolean z2) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z2) {
            this.l0 = false;
        }
    }

    public final void k(float f) {
        if (this.g0 == f) {
            return;
        }
        this.g0 = MiscUtils.b(f, g(), f());
        this.f0 = 0L;
        c();
    }

    public final void l(float f, float f2) {
        if (f > f2) {
            throw new IllegalArgumentException("minFrame (" + f + ") must be <= maxFrame (" + f2 + ")");
        }
        LottieComposition lottieComposition = this.k0;
        float f3 = lottieComposition == null ? -3.4028235E38f : lottieComposition.k;
        float f4 = lottieComposition == null ? Float.MAX_VALUE : lottieComposition.f9520l;
        float fB = MiscUtils.b(f, f3, f4);
        float fB2 = MiscUtils.b(f2, f3, f4);
        if (fB == this.i0 && fB2 == this.j0) {
            return;
        }
        this.i0 = fB;
        this.j0 = fB2;
        k((int) MiscUtils.b(this.g0, fB, fB2));
    }

    @Override // android.animation.ValueAnimator
    public final void setRepeatMode(int i2) {
        super.setRepeatMode(i2);
        if (i2 == 2 || !this.e0) {
            return;
        }
        this.e0 = false;
        this.Z = -this.Z;
    }
}
