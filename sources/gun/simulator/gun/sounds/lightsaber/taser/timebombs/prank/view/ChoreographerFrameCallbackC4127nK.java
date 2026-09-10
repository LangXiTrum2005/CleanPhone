package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.os.Build;
import android.view.Choreographer;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.nK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ChoreographerFrameCallbackC4127nK extends ValueAnimator implements Choreographer.FrameCallback {
    public MJ l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArraySet f4738a = new CopyOnWriteArraySet();
    public final CopyOnWriteArraySet b = new CopyOnWriteArraySet();
    public final CopyOnWriteArraySet c = new CopyOnWriteArraySet();
    public float d = 1.0f;
    public boolean e = false;
    public long f = 0;
    public float g = 0.0f;
    public float h = 0.0f;
    public int i = 0;
    public float j = -2.1474836E9f;
    public float k = 2.1474836E9f;
    public boolean m = false;
    public boolean n = false;

    @Override // android.animation.Animator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void addListener(Animator.AnimatorListener animatorListener) {
        this.b.add(animatorListener);
    }

    @Override // android.animation.Animator
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void addPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.c.add(animatorPauseListener);
    }

    @Override // android.animation.ValueAnimator
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f4738a.add(animatorUpdateListener);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void cancel() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorListener) it.next()).onAnimationCancel(this);
        }
        k(j());
        o(true);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        if (this.m) {
            o(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
        MJ mj = this.l;
        if (mj == null || !this.m) {
            return;
        }
        long j2 = this.f;
        float fAbs = (j2 != 0 ? j - j2 : 0L) / ((1.0E9f / mj.n) / Math.abs(this.d));
        float f = this.g;
        if (j()) {
            fAbs = -fAbs;
        }
        float f2 = f + fAbs;
        float fG = g();
        float f3 = f();
        PointF pointF = AbstractC5187zP.f5324a;
        boolean z = !(f2 >= fG && f2 <= f3);
        float f4 = this.g;
        float fB = AbstractC5187zP.b(f2, g(), f());
        this.g = fB;
        if (this.n) {
            fB = (float) Math.floor(fB);
        }
        this.h = fB;
        this.f = j;
        if (!this.n || this.g != f4) {
            l();
        }
        if (z) {
            if (getRepeatCount() == -1 || this.i < getRepeatCount()) {
                Iterator it = this.b.iterator();
                while (it.hasNext()) {
                    ((Animator.AnimatorListener) it.next()).onAnimationRepeat(this);
                }
                this.i++;
                if (getRepeatMode() == 2) {
                    this.e = !this.e;
                    this.d = -this.d;
                } else {
                    float f5 = j() ? f() : g();
                    this.g = f5;
                    this.h = f5;
                }
                this.f = j;
            } else {
                float fG2 = this.d < 0.0f ? g() : f();
                this.g = fG2;
                this.h = fG2;
                o(true);
                k(j());
            }
        }
        if (this.l == null) {
            return;
        }
        float f6 = this.h;
        if (f6 < this.j || f6 > this.k) {
            throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.j), Float.valueOf(this.k), Float.valueOf(this.h)));
        }
    }

    public final float e() {
        MJ mj = this.l;
        if (mj == null) {
            return 0.0f;
        }
        float f = this.h;
        float f2 = mj.l;
        return (f - f2) / (mj.m - f2);
    }

    public final float f() {
        MJ mj = this.l;
        if (mj == null) {
            return 0.0f;
        }
        float f = this.k;
        return f == 2.1474836E9f ? mj.m : f;
    }

    public final float g() {
        MJ mj = this.l;
        if (mj == null) {
            return 0.0f;
        }
        float f = this.j;
        return f == -2.1474836E9f ? mj.l : f;
    }

    @Override // android.animation.ValueAnimator
    public final float getAnimatedFraction() {
        float fG;
        float f;
        float fG2;
        if (this.l == null) {
            return 0.0f;
        }
        if (j()) {
            fG = f() - this.h;
            f = f();
            fG2 = g();
        } else {
            fG = this.h - g();
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
        MJ mj = this.l;
        if (mj == null) {
            return 0L;
        }
        return (long) mj.b();
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final /* bridge */ /* synthetic */ long getStartDelay() {
        i();
        throw null;
    }

    public final long i() {
        throw new UnsupportedOperationException("LottieAnimator does not support getStartDelay.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final boolean isRunning() {
        return this.m;
    }

    public final boolean j() {
        return this.d < 0.0f;
    }

    public final void k(boolean z) {
        for (Animator.AnimatorListener animatorListener : this.b) {
            if (Build.VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationEnd(this, z);
            } else {
                animatorListener.onAnimationEnd(this);
            }
        }
    }

    public final void l() {
        Iterator it = this.f4738a.iterator();
        while (it.hasNext()) {
            ((ValueAnimator.AnimatorUpdateListener) it.next()).onAnimationUpdate(this);
        }
    }

    @Override // android.animation.Animator
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public final void removeAllListeners() {
        this.b.clear();
    }

    @Override // android.animation.ValueAnimator
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final void removeAllUpdateListeners() {
        this.f4738a.clear();
    }

    public final void o(boolean z) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z) {
            this.m = false;
        }
    }

    @Override // android.animation.Animator
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public final void removeListener(Animator.AnimatorListener animatorListener) {
        this.b.remove(animatorListener);
    }

    @Override // android.animation.Animator
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final void removePauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.c.remove(animatorPauseListener);
    }

    @Override // android.animation.ValueAnimator
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f4738a.remove(animatorUpdateListener);
    }

    public final ValueAnimator s(long j) {
        throw new UnsupportedOperationException("LottieAnimator does not support setDuration.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final /* bridge */ /* synthetic */ ValueAnimator setDuration(long j) {
        s(j);
        throw null;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final /* bridge */ /* synthetic */ void setInterpolator(TimeInterpolator timeInterpolator) {
        u(timeInterpolator);
        throw null;
    }

    @Override // android.animation.ValueAnimator
    public final void setRepeatMode(int i) {
        super.setRepeatMode(i);
        if (i == 2 || !this.e) {
            return;
        }
        this.e = false;
        this.d = -this.d;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final /* bridge */ /* synthetic */ void setStartDelay(long j) {
        w(j);
        throw null;
    }

    public final void t(float f) {
        if (this.g == f) {
            return;
        }
        float fB = AbstractC5187zP.b(f, g(), f());
        this.g = fB;
        if (this.n) {
            fB = (float) Math.floor(fB);
        }
        this.h = fB;
        this.f = 0L;
        l();
    }

    public final void u(TimeInterpolator timeInterpolator) {
        throw new UnsupportedOperationException("LottieAnimator does not support setInterpolator.");
    }

    public final void v(float f, float f2) {
        if (f > f2) {
            throw new IllegalArgumentException("minFrame (" + f + ") must be <= maxFrame (" + f2 + ")");
        }
        MJ mj = this.l;
        float f3 = mj == null ? -3.4028235E38f : mj.l;
        float f4 = mj == null ? Float.MAX_VALUE : mj.m;
        float fB = AbstractC5187zP.b(f, f3, f4);
        float fB2 = AbstractC5187zP.b(f2, f3, f4);
        if (fB == this.j && fB2 == this.k) {
            return;
        }
        this.j = fB;
        this.k = fB2;
        t((int) AbstractC5187zP.b(this.h, fB, fB2));
    }

    public final void w(long j) {
        throw new UnsupportedOperationException("LottieAnimator does not support setStartDelay.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final /* bridge */ /* synthetic */ Animator setDuration(long j) {
        s(j);
        throw null;
    }
}
