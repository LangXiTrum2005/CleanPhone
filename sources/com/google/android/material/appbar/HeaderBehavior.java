package com.google.android.material.appbar;

import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.math.MathUtils;
import androidx.core.view.ViewCompat;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes4.dex */
abstract class HeaderBehavior<V extends View> extends ViewOffsetBehavior<V> {
    public Runnable Z;
    public OverScroller e0;
    public boolean f0;
    public int g0;
    public int h0;
    public int i0;
    public VelocityTracker j0;

    public class FlingRunnable implements Runnable {
        public final CoordinatorLayout X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final View f19101Y;

        public FlingRunnable(CoordinatorLayout coordinatorLayout, View view) {
            this.X = coordinatorLayout;
            this.f19101Y = view;
        }

        @Override // java.lang.Runnable
        public final void run() {
            HeaderBehavior headerBehavior;
            OverScroller overScroller;
            View view = this.f19101Y;
            if (view == null || (overScroller = (headerBehavior = HeaderBehavior.this).e0) == null) {
                return;
            }
            boolean zComputeScrollOffset = overScroller.computeScrollOffset();
            CoordinatorLayout coordinatorLayout = this.X;
            if (!zComputeScrollOffset) {
                headerBehavior.F(coordinatorLayout, view);
                return;
            }
            headerBehavior.H(coordinatorLayout, view, headerBehavior.e0.getCurrY());
            WeakHashMap weakHashMap = ViewCompat.f4466a;
            view.postOnAnimation(this);
        }
    }

    public boolean C(View view) {
        return false;
    }

    public int D(View view) {
        return -view.getHeight();
    }

    public int E(View view) {
        return view.getHeight();
    }

    public void F(CoordinatorLayout coordinatorLayout, View view) {
    }

    public int G(CoordinatorLayout coordinatorLayout, View view, int i2, int i3, int i4) {
        int iB;
        int iY = y();
        if (i3 == 0 || iY < i3 || iY > i4 || iY == (iB = MathUtils.b(i2, i3, i4))) {
            return 0;
        }
        B(iB);
        return iY - iB;
    }

    public final void H(CoordinatorLayout coordinatorLayout, View view, int i2) {
        G(coordinatorLayout, view, i2, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0046  */
    /* JADX WARN: Code duplicated, block: B:26:0x0060  */
    /* JADX WARN: Code duplicated, block: B:29:0x0065  */
    /* JADX WARN: Code duplicated, block: B:31:0x0071  */
    /* JADX WARN: Code duplicated, block: B:40:0x008b  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean m(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        int y;
        boolean z2;
        OverScroller overScroller;
        int iFindPointerIndex;
        if (this.i0 < 0) {
            this.i0 = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f0) {
            int i2 = this.g0;
            if (i2 != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i2)) != -1) {
                int y2 = (int) motionEvent.getY(iFindPointerIndex);
                if (Math.abs(y2 - this.h0) > this.i0) {
                    this.h0 = y2;
                    return true;
                }
                if (motionEvent.getActionMasked() == 0) {
                    this.g0 = -1;
                    int x = (int) motionEvent.getX();
                    y = (int) motionEvent.getY();
                    if (C(view)) {
                        z2 = false;
                    } else {
                        z2 = false;
                    }
                    this.f0 = z2;
                    if (z2) {
                        this.h0 = y;
                        this.g0 = motionEvent.getPointerId(0);
                        if (this.j0 == null) {
                            this.j0 = VelocityTracker.obtain();
                        }
                        overScroller = this.e0;
                        if (overScroller != null) {
                            this.e0.abortAnimation();
                            return true;
                        }
                    }
                }
                velocityTracker = this.j0;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(motionEvent);
                }
            }
        } else {
            if (motionEvent.getActionMasked() == 0) {
                this.g0 = -1;
                int x2 = (int) motionEvent.getX();
                y = (int) motionEvent.getY();
                if (C(view) || !coordinatorLayout.q(x2, y, view)) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                this.f0 = z2;
                if (z2) {
                    this.h0 = y;
                    this.g0 = motionEvent.getPointerId(0);
                    if (this.j0 == null) {
                        this.j0 = VelocityTracker.obtain();
                    }
                    overScroller = this.e0;
                    if (overScroller != null && !overScroller.isFinished()) {
                        this.e0.abortAnimation();
                        return true;
                    }
                }
            }
            velocityTracker = this.j0;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:43:0x00da A[ADDED_TO_REGION] */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean x(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z2;
        VelocityTracker velocityTracker;
        VelocityTracker velocityTracker2;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.g0);
                if (iFindPointerIndex != -1) {
                    int y = (int) motionEvent.getY(iFindPointerIndex);
                    int i2 = this.h0 - y;
                    this.h0 = y;
                    G(coordinatorLayout, view, z() - i2, D(view), 0);
                }
            }
            if (actionMasked != 3) {
                if (actionMasked == 6) {
                    int i3 = motionEvent.getActionIndex() == 0 ? 1 : 0;
                    this.g0 = motionEvent.getPointerId(i3);
                    this.h0 = (int) (motionEvent.getY(i3) + 0.5f);
                }
            }
            z2 = false;
            velocityTracker2 = this.j0;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
            }
            return !this.f0 || z2;
        }
        VelocityTracker velocityTracker3 = this.j0;
        if (velocityTracker3 != null) {
            velocityTracker3.addMovement(motionEvent);
            this.j0.computeCurrentVelocity(1000);
            float yVelocity = this.j0.getYVelocity(this.g0);
            int i4 = -E(view);
            Runnable runnable = this.Z;
            if (runnable != null) {
                view.removeCallbacks(runnable);
                this.Z = null;
            }
            if (this.e0 == null) {
                this.e0 = new OverScroller(view.getContext());
            }
            this.e0.fling(0, y(), 0, Math.round(yVelocity), 0, 0, i4, 0);
            if (this.e0.computeScrollOffset()) {
                FlingRunnable flingRunnable = new FlingRunnable(coordinatorLayout, view);
                this.Z = flingRunnable;
                WeakHashMap weakHashMap = ViewCompat.f4466a;
                view.postOnAnimation(flingRunnable);
            } else {
                F(coordinatorLayout, view);
            }
            z2 = true;
        }
        this.f0 = false;
        this.g0 = -1;
        velocityTracker = this.j0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.j0 = null;
        }
        velocityTracker2 = this.j0;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        if (this.f0) {
        }
        z2 = false;
        this.f0 = false;
        this.g0 = -1;
        velocityTracker = this.j0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.j0 = null;
        }
        velocityTracker2 = this.j0;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        if (this.f0) {
        }
    }
}
