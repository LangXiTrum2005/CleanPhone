package androidx.core.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import androidx.core.view.ViewCompat;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class AutoScrollHelper implements View.OnTouchListener {
    public static final int r0 = ViewConfiguration.getTapTimeout();
    public final ClampedScroller X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final AccelerateInterpolator f4562Y;
    public final ListView Z;
    public Runnable e0;
    public final float[] f0;
    public final float[] g0;
    public final int h0;
    public final int i0;
    public final float[] j0;
    public final float[] k0;
    public final float[] l0;
    public boolean m0;
    public boolean n0;
    public boolean o0;
    public boolean p0;
    public boolean q0;

    public static class ClampedScroller {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f4563a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f4564b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f4565c;
        public float d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f4566e;
        public long f;
        public long g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f4567h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f4568i;

        public final float a(long j) {
            long j2 = this.f4566e;
            if (j < j2) {
                return 0.0f;
            }
            long j3 = this.g;
            if (j3 < 0 || j < j3) {
                return AutoScrollHelper.c((j - j2) / this.f4563a, 0.0f, 1.0f) * 0.5f;
            }
            float f = this.f4567h;
            return (AutoScrollHelper.c((j - j3) / this.f4568i, 0.0f, 1.0f) * f) + (1.0f - f);
        }
    }

    public class ScrollAnimationRunnable implements Runnable {
        public ScrollAnimationRunnable() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            AutoScrollHelper autoScrollHelper = AutoScrollHelper.this;
            if (autoScrollHelper.p0) {
                boolean z2 = autoScrollHelper.n0;
                ClampedScroller clampedScroller = autoScrollHelper.X;
                if (z2) {
                    autoScrollHelper.n0 = false;
                    long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                    clampedScroller.f4566e = jCurrentAnimationTimeMillis;
                    clampedScroller.g = -1L;
                    clampedScroller.f = jCurrentAnimationTimeMillis;
                    clampedScroller.f4567h = 0.5f;
                }
                if ((clampedScroller.g > 0 && AnimationUtils.currentAnimationTimeMillis() > clampedScroller.g + ((long) clampedScroller.f4568i)) || !autoScrollHelper.g()) {
                    autoScrollHelper.p0 = false;
                    return;
                }
                boolean z3 = autoScrollHelper.o0;
                ListView listView = autoScrollHelper.Z;
                if (z3) {
                    autoScrollHelper.o0 = false;
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    listView.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                }
                if (clampedScroller.f == 0) {
                    throw new RuntimeException("Cannot compute scroll delta before calling start()");
                }
                long jCurrentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                float fA = clampedScroller.a(jCurrentAnimationTimeMillis2);
                long j = jCurrentAnimationTimeMillis2 - clampedScroller.f;
                clampedScroller.f = jCurrentAnimationTimeMillis2;
                autoScrollHelper.f((int) (j * ((fA * 4.0f) + ((-4.0f) * fA * fA)) * clampedScroller.d));
                WeakHashMap weakHashMap = ViewCompat.f4466a;
                listView.postOnAnimation(this);
            }
        }
    }

    public AutoScrollHelper(ListView listView) {
        ClampedScroller clampedScroller = new ClampedScroller();
        clampedScroller.f4566e = Long.MIN_VALUE;
        clampedScroller.g = -1L;
        clampedScroller.f = 0L;
        this.X = clampedScroller;
        this.f4562Y = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f0 = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.g0 = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.j0 = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.k0 = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.l0 = fArr5;
        this.Z = listView;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = ((int) ((1575.0f * f) + 0.5f)) / 1000.0f;
        fArr5[0] = f2;
        fArr5[1] = f2;
        float f3 = ((int) ((f * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f3;
        fArr4[1] = f3;
        this.h0 = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.i0 = r0;
        clampedScroller.f4563a = 500;
        clampedScroller.f4564b = 500;
    }

    public static float c(float f, float f2, float f3) {
        if (f > f3) {
            return f3;
        }
        return f < f2 ? f2 : f;
    }

    public abstract boolean a(int i2);

    /* JADX WARN: Code duplicated, block: B:12:0x003b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:13:0x003c  */
    /* JADX WARN: Code duplicated, block: B:15:0x004b  */
    /* JADX WARN: Code duplicated, block: B:17:0x0051  */
    public final float b(float f, float f2, float f3, int i2) {
        float fC;
        float interpolation;
        float fC2 = c(this.f0[i2] * f2, 0.0f, this.g0[i2]);
        float fD = d(f2 - f, fC2) - d(f, fC2);
        AccelerateInterpolator accelerateInterpolator = this.f4562Y;
        if (fD >= 0.0f) {
            if (fD > 0.0f) {
                interpolation = accelerateInterpolator.getInterpolation(fD);
            } else {
                fC = 0.0f;
            }
            if (fC == 0.0f) {
                return 0.0f;
            }
            float f4 = this.j0[i2];
            float f5 = this.k0[i2];
            float f6 = this.l0[i2];
            float f7 = f4 * f3;
            return fC > 0.0f ? c(fC * f7, f5, f6) : -c((-fC) * f7, f5, f6);
        }
        interpolation = -accelerateInterpolator.getInterpolation(-fD);
        fC = c(interpolation, -1.0f, 1.0f);
        if (fC == 0.0f) {
            return 0.0f;
        }
        float f8 = this.j0[i2];
        float f9 = this.k0[i2];
        float f10 = this.l0[i2];
        float f11 = f8 * f3;
        if (fC > 0.0f) {
        }
    }

    public final float d(float f, float f2) {
        if (f2 != 0.0f) {
            int i2 = this.h0;
            if (i2 == 0 || i2 == 1) {
                if (f < f2) {
                    if (f >= 0.0f) {
                        return 1.0f - (f / f2);
                    }
                    if (this.p0 && i2 == 1) {
                        return 1.0f;
                    }
                }
            } else if (i2 == 2 && f < 0.0f) {
                return f / (-f2);
            }
        }
        return 0.0f;
    }

    public final void e() {
        int i2 = 0;
        if (this.n0) {
            this.p0 = false;
            return;
        }
        ClampedScroller clampedScroller = this.X;
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i3 = (int) (jCurrentAnimationTimeMillis - clampedScroller.f4566e);
        int i4 = clampedScroller.f4564b;
        if (i3 > i4) {
            i2 = i4;
        } else if (i3 >= 0) {
            i2 = i3;
        }
        clampedScroller.f4568i = i2;
        clampedScroller.f4567h = clampedScroller.a(jCurrentAnimationTimeMillis);
        clampedScroller.g = jCurrentAnimationTimeMillis;
    }

    public abstract void f(int i2);

    public final boolean g() {
        ClampedScroller clampedScroller = this.X;
        float f = clampedScroller.d;
        int iAbs = (int) (f / Math.abs(f));
        Math.abs(clampedScroller.f4565c);
        return iAbs != 0 && a(iAbs);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0014, code lost:
    
        if (r0 != 3) goto L30;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
        /*
            r7 = this;
            boolean r0 = r7.q0
            r1 = 0
            if (r0 != 0) goto L7
            goto L7e
        L7:
            int r0 = r9.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1b
            if (r0 == r2) goto L17
            r3 = 2
            if (r0 == r3) goto L1f
            r8 = 3
            if (r0 == r8) goto L17
            goto L7e
        L17:
            r7.e()
            return r1
        L1b:
            r7.o0 = r2
            r7.m0 = r1
        L1f:
            float r0 = r9.getX()
            int r3 = r8.getWidth()
            float r3 = (float) r3
            android.widget.ListView r4 = r7.Z
            int r5 = r4.getWidth()
            float r5 = (float) r5
            float r0 = r7.b(r0, r3, r5, r1)
            float r9 = r9.getY()
            int r8 = r8.getHeight()
            float r8 = (float) r8
            int r3 = r4.getHeight()
            float r3 = (float) r3
            float r8 = r7.b(r9, r8, r3, r2)
            androidx.core.widget.AutoScrollHelper$ClampedScroller r9 = r7.X
            r9.f4565c = r0
            r9.d = r8
            boolean r8 = r7.p0
            if (r8 != 0) goto L7e
            boolean r8 = r7.g()
            if (r8 == 0) goto L7e
            java.lang.Runnable r8 = r7.e0
            if (r8 != 0) goto L60
            androidx.core.widget.AutoScrollHelper$ScrollAnimationRunnable r8 = new androidx.core.widget.AutoScrollHelper$ScrollAnimationRunnable
            r8.<init>()
            r7.e0 = r8
        L60:
            r7.p0 = r2
            r7.n0 = r2
            boolean r8 = r7.m0
            if (r8 != 0) goto L75
            int r8 = r7.i0
            if (r8 <= 0) goto L75
            java.lang.Runnable r9 = r7.e0
            long r5 = (long) r8
            java.util.WeakHashMap r8 = androidx.core.view.ViewCompat.f4466a
            r4.postOnAnimationDelayed(r9, r5)
            goto L7c
        L75:
            java.lang.Runnable r8 = r7.e0
            androidx.core.widget.AutoScrollHelper$ScrollAnimationRunnable r8 = (androidx.core.widget.AutoScrollHelper.ScrollAnimationRunnable) r8
            r8.run()
        L7c:
            r7.m0 = r2
        L7e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.AutoScrollHelper.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
