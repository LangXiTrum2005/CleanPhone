package androidx.customview.widget;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class ViewDragHelper {
    public static final Interpolator v = new AnonymousClass1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4589b;
    public float[] d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float[] f4591e;
    public float[] f;
    public float[] g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int[] f4592h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int[] f4593i;
    public int[] j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public VelocityTracker f4594l;
    public final float m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final float f4595n;
    public final int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final OverScroller f4596p;
    public final Callback q;
    public View r;
    public boolean s;
    public final CoordinatorLayout t;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4590c = -1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Runnable f4597u = new Runnable() { // from class: androidx.customview.widget.ViewDragHelper.2
        @Override // java.lang.Runnable
        public final void run() {
            ViewDragHelper.this.p(0);
        }
    };

    /* JADX INFO: renamed from: androidx.customview.widget.ViewDragHelper$1, reason: invalid class name */
    public class AnonymousClass1 implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    public ViewDragHelper(Context context, CoordinatorLayout coordinatorLayout, Callback callback) {
        if (coordinatorLayout == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (callback == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.t = coordinatorLayout;
        this.q = callback;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f4589b = viewConfiguration.getScaledTouchSlop();
        this.m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f4595n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f4596p = new OverScroller(context, v);
    }

    public final void a() {
        this.f4590c = -1;
        float[] fArr = this.d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f4591e, 0.0f);
            Arrays.fill(this.f, 0.0f);
            Arrays.fill(this.g, 0.0f);
            Arrays.fill(this.f4592h, 0);
            Arrays.fill(this.f4593i, 0);
            Arrays.fill(this.j, 0);
            this.k = 0;
        }
        VelocityTracker velocityTracker = this.f4594l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f4594l = null;
        }
    }

    public final void b(int i2, View view) {
        ViewParent parent = view.getParent();
        CoordinatorLayout coordinatorLayout = this.t;
        if (parent != coordinatorLayout) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + coordinatorLayout + ")");
        }
        this.r = view;
        this.f4590c = i2;
        this.q.e(i2, view);
        p(1);
    }

    public final boolean c(float f, float f2, int i2, int i3) {
        Math.abs(f);
        Math.abs(f2);
        int i4 = this.f4592h[i2];
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0044 A[RETURN] */
    public final boolean d(float f, float f2, View view) {
        if (view != null) {
            Callback callback = this.q;
            boolean z2 = callback.c(view) > 0;
            boolean z3 = callback.d() > 0;
            if (z2 && z3) {
                float f3 = (f2 * f2) + (f * f);
                int i2 = this.f4589b;
                if (f3 > i2 * i2) {
                    return true;
                }
            } else if (!z2 ? !(!z3 || Math.abs(f2) <= this.f4589b) : Math.abs(f) > this.f4589b) {
                return true;
            }
        }
        return false;
    }

    public final void e(int i2) {
        float[] fArr = this.d;
        if (fArr != null) {
            int i3 = this.k;
            int i4 = 1 << i2;
            if ((i3 & i4) != 0) {
                fArr[i2] = 0.0f;
                this.f4591e[i2] = 0.0f;
                this.f[i2] = 0.0f;
                this.g[i2] = 0.0f;
                this.f4592h[i2] = 0;
                this.f4593i[i2] = 0;
                this.j[i2] = 0;
                this.k = (~i4) & i3;
            }
        }
    }

    public final int f(int i2, int i3, int i4) {
        if (i2 == 0) {
            return 0;
        }
        int width = this.t.getWidth();
        float f = width / 2;
        float fSin = (((float) Math.sin((Math.min(1.0f, Math.abs(i2) / width) - 0.5f) * 0.47123894f)) * f) + f;
        int iAbs = Math.abs(i3);
        return Math.min(iAbs > 0 ? Math.round(Math.abs(fSin / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i2) / i4) + 1.0f) * 256.0f), 600);
    }

    public final boolean g() {
        if (this.f4588a == 2) {
            OverScroller overScroller = this.f4596p;
            boolean zComputeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.r.getLeft();
            int top2 = currY - this.r.getTop();
            if (left != 0) {
                View view = this.r;
                WeakHashMap weakHashMap = ViewCompat.f4466a;
                view.offsetLeftAndRight(left);
            }
            if (top2 != 0) {
                View view2 = this.r;
                WeakHashMap weakHashMap2 = ViewCompat.f4466a;
                view2.offsetTopAndBottom(top2);
            }
            if (left != 0 || top2 != 0) {
                this.q.g(currX, currY, this.r);
            }
            if (zComputeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                zComputeScrollOffset = false;
            }
            if (!zComputeScrollOffset) {
                this.t.post(this.f4597u);
            }
        }
        return this.f4588a == 2;
    }

    public final View h(int i2, int i3) {
        CoordinatorLayout coordinatorLayout = this.t;
        for (int childCount = coordinatorLayout.getChildCount() - 1; childCount >= 0; childCount--) {
            this.q.getClass();
            View childAt = coordinatorLayout.getChildAt(childCount);
            if (i2 >= childAt.getLeft() && i2 < childAt.getRight() && i3 >= childAt.getTop() && i3 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final boolean i(int i2, int i3, int i4, int i5) {
        float f;
        float f2;
        float f3;
        float f4;
        int left = this.r.getLeft();
        int top2 = this.r.getTop();
        int i6 = i2 - left;
        int i7 = i3 - top2;
        OverScroller overScroller = this.f4596p;
        if (i6 == 0 && i7 == 0) {
            overScroller.abortAnimation();
            p(0);
            return false;
        }
        View view = this.r;
        int i8 = (int) this.f4595n;
        int i9 = (int) this.m;
        int iAbs = Math.abs(i4);
        if (iAbs < i8) {
            i4 = 0;
        } else if (iAbs > i9) {
            i4 = i4 > 0 ? i9 : -i9;
        }
        int iAbs2 = Math.abs(i5);
        if (iAbs2 < i8) {
            i5 = 0;
        } else if (iAbs2 > i9) {
            i5 = i5 > 0 ? i9 : -i9;
        }
        int iAbs3 = Math.abs(i6);
        int iAbs4 = Math.abs(i7);
        int iAbs5 = Math.abs(i4);
        int iAbs6 = Math.abs(i5);
        int i10 = iAbs5 + iAbs6;
        int i11 = iAbs3 + iAbs4;
        if (i4 != 0) {
            f = iAbs5;
            f2 = i10;
        } else {
            f = iAbs3;
            f2 = i11;
        }
        float f5 = f / f2;
        if (i5 != 0) {
            f3 = iAbs6;
            f4 = i10;
        } else {
            f3 = iAbs4;
            f4 = i11;
        }
        float f6 = f3 / f4;
        Callback callback = this.q;
        overScroller.startScroll(left, top2, i6, i7, (int) ((f(i7, i5, callback.d()) * f6) + (f(i6, i4, callback.c(view)) * f5)));
        p(2);
        return true;
    }

    public final boolean j(int i2) {
        if ((this.k & (1 << i2)) != 0) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i2 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    public final void k(MotionEvent motionEvent) {
        int i2;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f4594l == null) {
            this.f4594l = VelocityTracker.obtain();
        }
        this.f4594l.addMovement(motionEvent);
        int i3 = 0;
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View viewH = h((int) x, (int) y);
            n(pointerId, x, y);
            s(pointerId, viewH);
            int i4 = this.f4592h[pointerId];
            return;
        }
        if (actionMasked == 1) {
            if (this.f4588a == 1) {
                l();
            }
            a();
            return;
        }
        Callback callback = this.q;
        if (actionMasked == 2) {
            if (this.f4588a != 1) {
                int pointerCount = motionEvent.getPointerCount();
                while (i3 < pointerCount) {
                    int pointerId2 = motionEvent.getPointerId(i3);
                    if (j(pointerId2)) {
                        float x2 = motionEvent.getX(i3);
                        float y2 = motionEvent.getY(i3);
                        float f = x2 - this.d[pointerId2];
                        float f2 = y2 - this.f4591e[pointerId2];
                        m(pointerId2, f, f2);
                        if (this.f4588a != 1) {
                            View viewH2 = h((int) x2, (int) y2);
                            if (d(f, f2, viewH2) && s(pointerId2, viewH2)) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    i3++;
                }
                o(motionEvent);
                return;
            }
            if (j(this.f4590c)) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f4590c);
                float x3 = motionEvent.getX(iFindPointerIndex);
                float y3 = motionEvent.getY(iFindPointerIndex);
                float[] fArr = this.f;
                int i5 = this.f4590c;
                int i6 = (int) (x3 - fArr[i5]);
                int i7 = (int) (y3 - this.g[i5]);
                int left = this.r.getLeft() + i6;
                int top2 = this.r.getTop() + i7;
                int left2 = this.r.getLeft();
                int top3 = this.r.getTop();
                if (i6 != 0) {
                    left = callback.a(left, this.r);
                    WeakHashMap weakHashMap = ViewCompat.f4466a;
                    this.r.offsetLeftAndRight(left - left2);
                }
                if (i7 != 0) {
                    top2 = callback.b(top2, this.r);
                    WeakHashMap weakHashMap2 = ViewCompat.f4466a;
                    this.r.offsetTopAndBottom(top2 - top3);
                }
                if (i6 != 0 || i7 != 0) {
                    callback.g(left, top2, this.r);
                }
                o(motionEvent);
                return;
            }
            return;
        }
        if (actionMasked == 3) {
            if (this.f4588a == 1) {
                this.s = true;
                callback.h(0.0f, 0.0f, this.r);
                this.s = false;
                if (this.f4588a == 1) {
                    p(0);
                }
            }
            a();
            return;
        }
        if (actionMasked == 5) {
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            float x4 = motionEvent.getX(actionIndex);
            float y4 = motionEvent.getY(actionIndex);
            n(pointerId3, x4, y4);
            if (this.f4588a == 0) {
                s(pointerId3, h((int) x4, (int) y4));
                int i8 = this.f4592h[pointerId3];
                return;
            }
            int i9 = (int) x4;
            int i10 = (int) y4;
            View view = this.r;
            if (view != null && i9 >= view.getLeft() && i9 < view.getRight() && i10 >= view.getTop() && i10 < view.getBottom()) {
                s(pointerId3, this.r);
                return;
            }
            return;
        }
        if (actionMasked != 6) {
            return;
        }
        int pointerId4 = motionEvent.getPointerId(actionIndex);
        if (this.f4588a == 1 && pointerId4 == this.f4590c) {
            int pointerCount2 = motionEvent.getPointerCount();
            while (true) {
                if (i3 >= pointerCount2) {
                    i2 = -1;
                    break;
                }
                int pointerId5 = motionEvent.getPointerId(i3);
                if (pointerId5 != this.f4590c) {
                    View viewH3 = h((int) motionEvent.getX(i3), (int) motionEvent.getY(i3));
                    View view2 = this.r;
                    if (viewH3 == view2 && s(pointerId5, view2)) {
                        i2 = this.f4590c;
                        break;
                    }
                }
                i3++;
            }
            if (i2 == -1) {
                l();
            }
        }
        e(pointerId4);
    }

    public final void l() {
        VelocityTracker velocityTracker = this.f4594l;
        float f = this.m;
        velocityTracker.computeCurrentVelocity(1000, f);
        float xVelocity = this.f4594l.getXVelocity(this.f4590c);
        float f2 = this.f4595n;
        float fAbs = Math.abs(xVelocity);
        if (fAbs < f2) {
            xVelocity = 0.0f;
        } else if (fAbs > f) {
            xVelocity = xVelocity > 0.0f ? f : -f;
        }
        float yVelocity = this.f4594l.getYVelocity(this.f4590c);
        float fAbs2 = Math.abs(yVelocity);
        if (fAbs2 < f2) {
            f = 0.0f;
        } else if (fAbs2 <= f) {
            f = yVelocity;
        } else if (yVelocity <= 0.0f) {
            f = -f;
        }
        this.s = true;
        this.q.h(xVelocity, f, this.r);
        this.s = false;
        if (this.f4588a == 1) {
            p(0);
        }
    }

    public final void m(int i2, float f, float f2) {
        c(f, f2, i2, 1);
        c(f2, f, i2, 4);
        c(f, f2, i2, 2);
        c(f2, f, i2, 8);
    }

    public final void n(int i2, float f, float f2) {
        float[] fArr = this.d;
        if (fArr == null || fArr.length <= i2) {
            int i3 = i2 + 1;
            float[] fArr2 = new float[i3];
            float[] fArr3 = new float[i3];
            float[] fArr4 = new float[i3];
            float[] fArr5 = new float[i3];
            int[] iArr = new int[i3];
            int[] iArr2 = new int[i3];
            int[] iArr3 = new int[i3];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f4591e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f4592h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f4593i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.d = fArr2;
            this.f4591e = fArr3;
            this.f = fArr4;
            this.g = fArr5;
            this.f4592h = iArr;
            this.f4593i = iArr2;
            this.j = iArr3;
        }
        float[] fArr9 = this.d;
        this.f[i2] = f;
        fArr9[i2] = f;
        float[] fArr10 = this.f4591e;
        this.g[i2] = f2;
        fArr10[i2] = f2;
        int[] iArr7 = this.f4592h;
        int i4 = (int) f;
        int i5 = (int) f2;
        CoordinatorLayout coordinatorLayout = this.t;
        int i6 = i4 < coordinatorLayout.getLeft() + this.o ? 1 : 0;
        if (i5 < coordinatorLayout.getTop() + this.o) {
            i6 |= 4;
        }
        if (i4 > coordinatorLayout.getRight() - this.o) {
            i6 |= 2;
        }
        if (i5 > coordinatorLayout.getBottom() - this.o) {
            i6 |= 8;
        }
        iArr7[i2] = i6;
        this.k = (1 << i2) | this.k;
    }

    public final void o(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i2 = 0; i2 < pointerCount; i2++) {
            int pointerId = motionEvent.getPointerId(i2);
            if (j(pointerId)) {
                float x = motionEvent.getX(i2);
                float y = motionEvent.getY(i2);
                this.f[pointerId] = x;
                this.g[pointerId] = y;
            }
        }
    }

    public final void p(int i2) {
        this.t.removeCallbacks(this.f4597u);
        if (this.f4588a != i2) {
            this.f4588a = i2;
            this.q.f(i2);
            if (this.f4588a == 0) {
                this.r = null;
            }
        }
    }

    public final boolean q(int i2, int i3) {
        if (this.s) {
            return i(i2, i3, (int) this.f4594l.getXVelocity(this.f4590c), (int) this.f4594l.getYVelocity(this.f4590c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ed  */
    public final boolean r(MotionEvent motionEvent) {
        View viewH;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f4594l == null) {
            this.f4594l = VelocityTracker.obtain();
        }
        this.f4594l.addMovement(motionEvent);
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            n(pointerId, x, y);
            View viewH2 = h((int) x, (int) y);
            if (viewH2 == this.r && this.f4588a == 2) {
                s(pointerId, viewH2);
            }
            int i2 = this.f4592h[pointerId];
        } else if (actionMasked == 1) {
            a();
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                a();
            } else if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x2 = motionEvent.getX(actionIndex);
                float y2 = motionEvent.getY(actionIndex);
                n(pointerId2, x2, y2);
                int i3 = this.f4588a;
                if (i3 == 0) {
                    int i4 = this.f4592h[pointerId2];
                } else if (i3 == 2 && (viewH = h((int) x2, (int) y2)) == this.r) {
                    s(pointerId2, viewH);
                }
            } else if (actionMasked == 6) {
                e(motionEvent.getPointerId(actionIndex));
            }
        } else if (this.d != null && this.f4591e != null) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i5 = 0; i5 < pointerCount; i5++) {
                int pointerId3 = motionEvent.getPointerId(i5);
                if (j(pointerId3)) {
                    float x3 = motionEvent.getX(i5);
                    float y3 = motionEvent.getY(i5);
                    float f = x3 - this.d[pointerId3];
                    float f2 = y3 - this.f4591e[pointerId3];
                    View viewH3 = h((int) x3, (int) y3);
                    boolean z2 = viewH3 != null && d(f, f2, viewH3);
                    if (!z2) {
                        m(pointerId3, f, f2);
                        if (this.f4588a != 1) {
                            break;
                        }
                    } else {
                        int left = viewH3.getLeft();
                        Callback callback = this.q;
                        int iA = callback.a(((int) f) + left, viewH3);
                        int top2 = viewH3.getTop();
                        int iB = callback.b(((int) f2) + top2, viewH3);
                        int iC = callback.c(viewH3);
                        int iD = callback.d();
                        if ((iC == 0 || (iC > 0 && iA == left)) && (iD == 0 || (iD > 0 && iB == top2))) {
                            break;
                        }
                        m(pointerId3, f, f2);
                        if (this.f4588a != 1 || (z2 && s(pointerId3, viewH3))) {
                            break;
                        }
                    }
                }
            }
            o(motionEvent);
        }
        return this.f4588a == 1;
    }

    public final boolean s(int i2, View view) {
        if (view == this.r && this.f4590c == i2) {
            return true;
        }
        if (view == null || !this.q.i(i2, view)) {
            return false;
        }
        this.f4590c = i2;
        b(i2, view);
        return true;
    }

    public static abstract class Callback {
        public int a(int i2, View view) {
            return 0;
        }

        public int b(int i2, View view) {
            return 0;
        }

        public int c(View view) {
            return 0;
        }

        public int d() {
            return 0;
        }

        public void f(int i2) {
        }

        public abstract boolean i(int i2, View view);

        public void e(int i2, View view) {
        }

        public void g(int i2, int i3, View view) {
        }

        public void h(float f, float f2, View view) {
        }
    }
}
