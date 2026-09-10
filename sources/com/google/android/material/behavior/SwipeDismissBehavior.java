package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.customview.widget.ViewDragHelper;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes4.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {
    public ViewDragHelper X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public boolean f19115Y;
    public boolean Z;
    public int e0 = 2;
    public float f0 = 0.0f;
    public float g0 = 0.5f;
    public final ViewDragHelper.Callback h0 = new ViewDragHelper.Callback() { // from class: com.google.android.material.behavior.SwipeDismissBehavior.1

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f19116a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f19117b = -1;

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final int a(int i2, View view) {
            int width;
            int width2;
            int width3;
            WeakHashMap weakHashMap = ViewCompat.f4466a;
            boolean z2 = view.getLayoutDirection() == 1;
            int i3 = SwipeDismissBehavior.this.e0;
            if (i3 == 0) {
                if (z2) {
                    width = this.f19116a - view.getWidth();
                    width2 = this.f19116a;
                } else {
                    width = this.f19116a;
                    width3 = view.getWidth();
                    width2 = width3 + width;
                }
            } else if (i3 != 1) {
                width = this.f19116a - view.getWidth();
                width2 = view.getWidth() + this.f19116a;
            } else if (z2) {
                width = this.f19116a;
                width3 = view.getWidth();
                width2 = width3 + width;
            } else {
                width = this.f19116a - view.getWidth();
                width2 = this.f19116a;
            }
            return Math.min(Math.max(width, i2), width2);
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final int b(int i2, View view) {
            return view.getTop();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final int c(View view) {
            return view.getWidth();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final void e(int i2, View view) {
            this.f19117b = i2;
            this.f19116a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                SwipeDismissBehavior swipeDismissBehavior = SwipeDismissBehavior.this;
                swipeDismissBehavior.Z = true;
                parent.requestDisallowInterceptTouchEvent(true);
                swipeDismissBehavior.Z = false;
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final void f(int i2) {
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final void g(int i2, int i3, View view) {
            float width = view.getWidth();
            SwipeDismissBehavior swipeDismissBehavior = SwipeDismissBehavior.this;
            float f = width * swipeDismissBehavior.f0;
            float width2 = view.getWidth() * swipeDismissBehavior.g0;
            float fAbs = Math.abs(i2 - this.f19116a);
            if (fAbs <= f) {
                view.setAlpha(1.0f);
            } else if (fAbs >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((fAbs - f) / (width2 - f))), 1.0f));
            }
        }

        /* JADX WARN: Code duplicated, block: B:27:0x0052  */
        /* JADX WARN: Code duplicated, block: B:29:0x0056  */
        /* JADX WARN: Code duplicated, block: B:32:0x005f  */
        /* JADX WARN: Code duplicated, block: B:33:0x0061  */
        /* JADX WARN: Code duplicated, block: B:34:0x0066  */
        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final void h(float f, float f2, View view) {
            int i2;
            int left;
            int i3;
            this.f19117b = -1;
            int width = view.getWidth();
            SwipeDismissBehavior swipeDismissBehavior = SwipeDismissBehavior.this;
            boolean z2 = true;
            if (f != 0.0f) {
                WeakHashMap weakHashMap = ViewCompat.f4466a;
                boolean z3 = view.getLayoutDirection() == 1;
                int i4 = swipeDismissBehavior.e0;
                if (i4 != 2 && (i4 != 0 ? i4 != 1 || (!z3 ? f < 0.0f : f > 0.0f) : !z3 ? f > 0.0f : f < 0.0f)) {
                    i2 = this.f19116a;
                    z2 = false;
                } else if (f >= 0.0f) {
                    left = view.getLeft();
                    i3 = this.f19116a;
                    if (left < i3) {
                        i2 = this.f19116a - width;
                    } else {
                        i2 = i3 + width;
                    }
                } else {
                    i2 = this.f19116a - width;
                }
            } else {
                if (Math.abs(view.getLeft() - this.f19116a) < Math.round(view.getWidth() * 0.5f)) {
                    i2 = this.f19116a;
                    z2 = false;
                } else if (f >= 0.0f) {
                    left = view.getLeft();
                    i3 = this.f19116a;
                    if (left < i3) {
                        i2 = this.f19116a - width;
                    } else {
                        i2 = i3 + width;
                    }
                } else {
                    i2 = this.f19116a - width;
                }
            }
            if (swipeDismissBehavior.X.q(i2, view.getTop())) {
                SettleRunnable settleRunnable = new SettleRunnable(view, z2);
                WeakHashMap weakHashMap2 = ViewCompat.f4466a;
                view.postOnAnimation(settleRunnable);
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final boolean i(int i2, View view) {
            int i3 = this.f19117b;
            return (i3 == -1 || i3 == i2) && SwipeDismissBehavior.this.y(view);
        }
    };

    public interface OnDismissListener {
    }

    public class SettleRunnable implements Runnable {
        public final View X;

        public SettleRunnable(View view, boolean z2) {
            this.X = view;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ViewDragHelper viewDragHelper = SwipeDismissBehavior.this.X;
            if (viewDragHelper == null || !viewDragHelper.g()) {
                return;
            }
            WeakHashMap weakHashMap = ViewCompat.f4466a;
            this.X.postOnAnimation(this);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean m(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean zQ = this.f19115Y;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zQ = coordinatorLayout.q((int) motionEvent.getX(), (int) motionEvent.getY(), view);
            this.f19115Y = zQ;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f19115Y = false;
        }
        if (zQ) {
            if (this.X == null) {
                this.X = new ViewDragHelper(coordinatorLayout.getContext(), coordinatorLayout, this.h0);
            }
            if (!this.Z && this.X.r(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean n(CoordinatorLayout coordinatorLayout, View view, int i2) {
        WeakHashMap weakHashMap = ViewCompat.f4466a;
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            ViewCompat.v(1048576, view);
            ViewCompat.s(0, view);
            if (y(view)) {
                ViewCompat.w(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.f4539l, new AccessibilityViewCommand() { // from class: com.google.android.material.behavior.SwipeDismissBehavior.2
                    @Override // androidx.core.view.accessibility.AccessibilityViewCommand
                    public final boolean d(View view2) {
                        SwipeDismissBehavior swipeDismissBehavior = SwipeDismissBehavior.this;
                        if (!swipeDismissBehavior.y(view2)) {
                            return false;
                        }
                        WeakHashMap weakHashMap2 = ViewCompat.f4466a;
                        boolean z2 = view2.getLayoutDirection() == 1;
                        int i3 = swipeDismissBehavior.e0;
                        view2.offsetLeftAndRight((!(i3 == 0 && z2) && (i3 != 1 || z2)) ? view2.getWidth() : -view2.getWidth());
                        view2.setAlpha(0.0f);
                        return true;
                    }
                });
            }
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean x(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (this.X == null) {
            return false;
        }
        if (this.Z && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.X.k(motionEvent);
        return true;
    }

    public boolean y(View view) {
        return true;
    }
}
