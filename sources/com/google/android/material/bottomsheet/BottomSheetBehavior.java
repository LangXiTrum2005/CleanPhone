package com.google.android.material.bottomsheet;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.a;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.activity.BackEventCompat;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.Insets;
import androidx.core.math.MathUtils;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.customview.widget.ViewDragHelper;
import com.charging.screenshow.battery.animations.themes.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.motion.MaterialBackHandler;
import com.google.android.material.motion.MaterialBottomContainerBackHelper;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes4.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> implements MaterialBackHandler {
    public boolean A0;
    public final StateSettlingTracker B0;
    public final ValueAnimator C0;
    public final int D0;
    public int E0;
    public int F0;
    public final float G0;
    public int H0;
    public final float I0;
    public boolean J0;
    public boolean K0;
    public final boolean L0;
    public int M0;
    public ViewDragHelper N0;
    public boolean O0;
    public int P0;
    public boolean Q0;
    public final float R0;
    public int S0;
    public int T0;
    public int U0;
    public WeakReference V0;
    public WeakReference W0;
    public final int X;
    public WeakReference X0;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public boolean f19126Y;
    public final ArrayList Y0;
    public final float Z;
    public VelocityTracker Z0;
    public MaterialBottomContainerBackHelper a1;
    public int b1;
    public int c1;
    public boolean d1;
    public final int e0;
    public HashMap e1;
    public int f0;
    public final SparseIntArray f1;
    public boolean g0;
    public final ViewDragHelper.Callback g1;
    public int h0;
    public final int i0;
    public final MaterialShapeDrawable j0;
    public final ColorStateList k0;
    public final int l0;
    public final int m0;
    public int n0;
    public final boolean o0;
    public final boolean p0;
    public final boolean q0;
    public final boolean r0;
    public final boolean s0;
    public final boolean t0;
    public final boolean u0;
    public final boolean v0;
    public int w0;
    public int x0;
    public final boolean y0;
    public final ShapeAppearanceModel z0;

    public static abstract class BottomSheetCallback {
        public void a(View view) {
        }

        public abstract void b(View view);

        public abstract void c(int i2, View view);
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface SaveFlags {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface StableState {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface State {
    }

    public class StateSettlingTracker {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f19132a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f19133b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Runnable f19134c = new Runnable() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.StateSettlingTracker.1
            @Override // java.lang.Runnable
            public final void run() {
                StateSettlingTracker stateSettlingTracker = StateSettlingTracker.this;
                stateSettlingTracker.f19133b = false;
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                ViewDragHelper viewDragHelper = bottomSheetBehavior.N0;
                if (viewDragHelper != null && viewDragHelper.g()) {
                    stateSettlingTracker.a(stateSettlingTracker.f19132a);
                } else if (bottomSheetBehavior.M0 == 2) {
                    bottomSheetBehavior.M(stateSettlingTracker.f19132a);
                }
            }
        };

        public StateSettlingTracker() {
        }

        public final void a(int i2) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            WeakReference weakReference = bottomSheetBehavior.V0;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.f19132a = i2;
            if (this.f19133b) {
                return;
            }
            View view = (View) bottomSheetBehavior.V0.get();
            Runnable runnable = this.f19134c;
            WeakHashMap weakHashMap = ViewCompat.f4466a;
            view.postOnAnimation(runnable);
            this.f19133b = true;
        }
    }

    public BottomSheetBehavior() {
        this.X = 0;
        this.f19126Y = true;
        this.l0 = -1;
        this.m0 = -1;
        this.B0 = new StateSettlingTracker();
        this.G0 = 0.5f;
        this.I0 = -1.0f;
        this.L0 = true;
        this.M0 = 4;
        this.R0 = 0.1f;
        this.Y0 = new ArrayList();
        this.c1 = -1;
        this.f1 = new SparseIntArray();
        this.g1 = new ViewDragHelper.Callback() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.5
            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public final int a(int i2, View view) {
                return view.getLeft();
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public final int b(int i2, View view) {
                return MathUtils.b(i2, BottomSheetBehavior.this.G(), d());
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public final int d() {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                return bottomSheetBehavior.J0 ? bottomSheetBehavior.U0 : bottomSheetBehavior.H0;
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public final void f(int i2) {
                if (i2 == 1) {
                    BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                    if (bottomSheetBehavior.L0) {
                        bottomSheetBehavior.M(1);
                    }
                }
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public final void g(int i2, int i3, View view) {
                BottomSheetBehavior.this.C(i3);
            }

            /* JADX WARN: Code duplicated, block: B:20:0x004c  */
            /* JADX WARN: Code duplicated, block: B:34:0x0085  */
            /* JADX WARN: Code duplicated, block: B:6:0x000d  */
            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public final void h(float f, float f2, View view) {
                int i2 = 6;
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (f2 < 0.0f) {
                    if (bottomSheetBehavior.f19126Y) {
                        i2 = 3;
                    } else {
                        int top2 = view.getTop();
                        System.currentTimeMillis();
                        bottomSheetBehavior.getClass();
                        if (top2 <= bottomSheetBehavior.F0) {
                            i2 = 3;
                        }
                    }
                } else if (bottomSheetBehavior.J0 && bottomSheetBehavior.N(view, f2)) {
                    if (Math.abs(f) >= Math.abs(f2) || f2 <= bottomSheetBehavior.e0) {
                        if (view.getTop() > (bottomSheetBehavior.G() + bottomSheetBehavior.U0) / 2) {
                            i2 = 5;
                        } else if (bottomSheetBehavior.f19126Y || Math.abs(view.getTop() - bottomSheetBehavior.G()) < Math.abs(view.getTop() - bottomSheetBehavior.F0)) {
                            i2 = 3;
                        }
                    } else {
                        i2 = 5;
                    }
                } else if (f2 == 0.0f || Math.abs(f) > Math.abs(f2)) {
                    int top3 = view.getTop();
                    if (!bottomSheetBehavior.f19126Y) {
                        int i3 = bottomSheetBehavior.F0;
                        if (top3 < i3) {
                            if (top3 < Math.abs(top3 - bottomSheetBehavior.H0)) {
                                i2 = 3;
                            } else {
                                bottomSheetBehavior.getClass();
                            }
                        } else if (Math.abs(top3 - i3) < Math.abs(top3 - bottomSheetBehavior.H0)) {
                            bottomSheetBehavior.getClass();
                        } else {
                            i2 = 4;
                        }
                    } else if (Math.abs(top3 - bottomSheetBehavior.E0) < Math.abs(top3 - bottomSheetBehavior.H0)) {
                        i2 = 3;
                    } else {
                        i2 = 4;
                    }
                } else if (bottomSheetBehavior.f19126Y) {
                    i2 = 4;
                } else {
                    int top4 = view.getTop();
                    if (Math.abs(top4 - bottomSheetBehavior.F0) < Math.abs(top4 - bottomSheetBehavior.H0)) {
                        bottomSheetBehavior.getClass();
                    } else {
                        i2 = 4;
                    }
                }
                bottomSheetBehavior.getClass();
                bottomSheetBehavior.O(view, i2, true);
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public final boolean i(int i2, View view) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                int i3 = bottomSheetBehavior.M0;
                if (i3 == 1 || bottomSheetBehavior.d1) {
                    return false;
                }
                if (i3 == 3 && bottomSheetBehavior.b1 == i2) {
                    WeakReference weakReference = bottomSheetBehavior.X0;
                    View view2 = weakReference != null ? (View) weakReference.get() : null;
                    if (view2 != null && view2.canScrollVertically(-1)) {
                        return false;
                    }
                }
                System.currentTimeMillis();
                WeakReference weakReference2 = bottomSheetBehavior.V0;
                return weakReference2 != null && weakReference2.get() == view;
            }
        };
    }

    public static View D(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        if (ViewCompat.r(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View viewD = D(viewGroup.getChildAt(i2));
            if (viewD != null) {
                return viewD;
            }
        }
        return null;
    }

    public static BottomSheetBehavior E(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.LayoutParams)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) layoutParams).f4146a;
        if (behavior instanceof BottomSheetBehavior) {
            return (BottomSheetBehavior) behavior;
        }
        throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
    }

    public static int F(int i2, int i3, int i4, int i5) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, i3, i5);
        if (i4 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i4), 1073741824);
        }
        if (size != 0) {
            i4 = Math.min(size, i4);
        }
        return View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
    }

    public final int A() {
        int i2;
        if (this.g0) {
            return Math.min(Math.max(this.h0, this.U0 - ((this.T0 * 9) / 16)), this.S0) + this.w0;
        }
        return (this.o0 || this.p0 || (i2 = this.n0) <= 0) ? this.f0 + this.w0 : Math.max(this.f0, i2 + this.i0);
    }

    public final void B(int i2, View view) {
        if (view == null) {
            return;
        }
        ViewCompat.v(524288, view);
        ViewCompat.s(0, view);
        ViewCompat.v(262144, view);
        ViewCompat.s(0, view);
        ViewCompat.v(1048576, view);
        ViewCompat.s(0, view);
        SparseIntArray sparseIntArray = this.f1;
        int i3 = sparseIntArray.get(i2, -1);
        if (i3 != -1) {
            ViewCompat.v(i3, view);
            ViewCompat.s(0, view);
            sparseIntArray.delete(i2);
        }
    }

    public final void C(int i2) {
        View view = (View) this.V0.get();
        if (view != null) {
            ArrayList arrayList = this.Y0;
            if (arrayList.isEmpty()) {
                return;
            }
            int i3 = this.H0;
            if (i2 <= i3 && i3 != G()) {
                G();
            }
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                ((BottomSheetCallback) arrayList.get(i4)).b(view);
            }
        }
    }

    public final int G() {
        if (this.f19126Y) {
            return this.E0;
        }
        return Math.max(this.D0, this.s0 ? 0 : this.x0);
    }

    public final int H(int i2) {
        if (i2 == 3) {
            return G();
        }
        if (i2 == 4) {
            return this.H0;
        }
        if (i2 == 5) {
            return this.U0;
        }
        if (i2 == 6) {
            return this.F0;
        }
        throw new IllegalArgumentException(a.h(i2, "Invalid state to get top offset: "));
    }

    public final boolean I() {
        WeakReference weakReference = this.V0;
        if (weakReference != null && weakReference.get() != null) {
            int[] iArr = new int[2];
            ((View) this.V0.get()).getLocationOnScreen(iArr);
            if (iArr[1] == 0) {
                return true;
            }
        }
        return false;
    }

    public final void J(BottomSheetDragHandleView bottomSheetDragHandleView) {
        WeakReference weakReference;
        if (bottomSheetDragHandleView != null || (weakReference = this.W0) == null) {
            this.W0 = new WeakReference(bottomSheetDragHandleView);
            Q(1, bottomSheetDragHandleView);
        } else {
            B(1, (View) weakReference.get());
            this.W0 = null;
        }
    }

    public final void K(boolean z2) {
        if (this.J0 != z2) {
            this.J0 = z2;
            if (!z2 && this.M0 == 5) {
                c(4);
            }
            P();
        }
    }

    public final void L(int i2) {
        if (i2 == -1) {
            if (this.g0) {
                return;
            } else {
                this.g0 = true;
            }
        } else {
            if (!this.g0 && this.f0 == i2) {
                return;
            }
            this.g0 = false;
            this.f0 = Math.max(0, i2);
        }
        T();
    }

    public final void M(int i2) {
        View view;
        if (this.M0 == i2) {
            return;
        }
        this.M0 = i2;
        if (i2 != 4 && i2 != 3 && i2 != 6) {
            boolean z2 = this.J0;
        }
        WeakReference weakReference = this.V0;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i3 = 0;
        if (i2 == 3) {
            S(true);
        } else if (i2 == 6 || i2 == 5 || i2 == 4) {
            S(false);
        }
        R(i2, true);
        while (true) {
            ArrayList arrayList = this.Y0;
            if (i3 >= arrayList.size()) {
                P();
                return;
            } else {
                ((BottomSheetCallback) arrayList.get(i3)).c(i2, view);
                i3++;
            }
        }
    }

    public final boolean N(View view, float f) {
        if (this.K0) {
            return true;
        }
        if (view.getTop() < this.H0) {
            return false;
        }
        return Math.abs(((f * this.R0) + ((float) view.getTop())) - ((float) this.H0)) / ((float) A()) > 0.5f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
    
        if (r3 != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        M(2);
        R(r4, true);
        r2.B0.a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0012, code lost:
    
        if (r1.q(r3.getLeft(), r0) != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void O(android.view.View r3, int r4, boolean r5) {
        /*
            r2 = this;
            int r0 = r2.H(r4)
            androidx.customview.widget.ViewDragHelper r1 = r2.N0
            if (r1 == 0) goto L40
            if (r5 == 0) goto L15
            int r3 = r3.getLeft()
            boolean r3 = r1.q(r3, r0)
            if (r3 == 0) goto L40
            goto L32
        L15:
            int r5 = r3.getLeft()
            r1.r = r3
            r3 = -1
            r1.f4590c = r3
            r3 = 0
            boolean r3 = r1.i(r5, r0, r3, r3)
            if (r3 != 0) goto L30
            int r5 = r1.f4588a
            if (r5 != 0) goto L30
            android.view.View r5 = r1.r
            if (r5 == 0) goto L30
            r5 = 0
            r1.r = r5
        L30:
            if (r3 == 0) goto L40
        L32:
            r3 = 2
            r2.M(r3)
            r3 = 1
            r2.R(r4, r3)
            com.google.android.material.bottomsheet.BottomSheetBehavior$StateSettlingTracker r3 = r2.B0
            r3.a(r4)
            return
        L40:
            r2.M(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.O(android.view.View, int, boolean):void");
    }

    public final void P() {
        WeakReference weakReference = this.V0;
        if (weakReference != null) {
            Q(0, (View) weakReference.get());
        }
        WeakReference weakReference2 = this.W0;
        if (weakReference2 != null) {
            Q(1, (View) weakReference2.get());
        }
    }

    public final void Q(int i2, View view) {
        int iA;
        int i3;
        if (view == null) {
            return;
        }
        B(i2, view);
        final int i4 = 6;
        if (!this.f19126Y && this.M0 != 6) {
            String string = view.getResources().getString(R.string.bottomsheet_action_expand_halfway);
            AccessibilityViewCommand accessibilityViewCommand = new AccessibilityViewCommand() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.6
                @Override // androidx.core.view.accessibility.AccessibilityViewCommand
                public final boolean d(View view2) {
                    BottomSheetBehavior.this.c(i4);
                    return true;
                }
            };
            ArrayList arrayListH = ViewCompat.h(view);
            int i5 = 0;
            while (true) {
                if (i5 >= arrayListH.size()) {
                    int i6 = -1;
                    for (int i7 = 0; i7 < 32 && i6 == -1; i7++) {
                        int i8 = ViewCompat.d[i7];
                        boolean z2 = true;
                        for (int i9 = 0; i9 < arrayListH.size(); i9++) {
                            z2 &= ((AccessibilityNodeInfoCompat.AccessibilityActionCompat) arrayListH.get(i9)).a() != i8;
                        }
                        if (z2) {
                            i6 = i8;
                        }
                    }
                    iA = i6;
                    break;
                }
                if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((AccessibilityNodeInfoCompat.AccessibilityActionCompat) arrayListH.get(i5)).f4541a).getLabel())) {
                    iA = ((AccessibilityNodeInfoCompat.AccessibilityActionCompat) arrayListH.get(i5)).a();
                    break;
                }
                i5++;
            }
            if (iA != -1) {
                i3 = iA;
                AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat = new AccessibilityNodeInfoCompat.AccessibilityActionCompat(null, i3, string, accessibilityViewCommand, null);
                AccessibilityDelegateCompat accessibilityDelegateCompatE = ViewCompat.e(view);
                if (accessibilityDelegateCompatE == null) {
                    accessibilityDelegateCompatE = new AccessibilityDelegateCompat();
                }
                ViewCompat.z(view, accessibilityDelegateCompatE);
                ViewCompat.v(accessibilityActionCompat.a(), view);
                ViewCompat.h(view).add(accessibilityActionCompat);
                ViewCompat.s(0, view);
            } else {
                i3 = iA;
            }
            this.f1.put(i2, i3);
        }
        if (this.J0) {
            final int i10 = 5;
            if (this.M0 != 5) {
                ViewCompat.w(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.f4539l, new AccessibilityViewCommand() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.6
                    @Override // androidx.core.view.accessibility.AccessibilityViewCommand
                    public final boolean d(View view2) {
                        BottomSheetBehavior.this.c(i10);
                        return true;
                    }
                });
            }
        }
        int i11 = this.M0;
        final int i12 = 4;
        final int i13 = 3;
        if (i11 == 3) {
            i4 = this.f19126Y ? 4 : 6;
            ViewCompat.w(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.k, new AccessibilityViewCommand() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.6
                @Override // androidx.core.view.accessibility.AccessibilityViewCommand
                public final boolean d(View view2) {
                    BottomSheetBehavior.this.c(i4);
                    return true;
                }
            });
        } else if (i11 == 4) {
            i4 = this.f19126Y ? 3 : 6;
            ViewCompat.w(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.j, new AccessibilityViewCommand() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.6
                @Override // androidx.core.view.accessibility.AccessibilityViewCommand
                public final boolean d(View view2) {
                    BottomSheetBehavior.this.c(i4);
                    return true;
                }
            });
        } else {
            if (i11 != 6) {
                return;
            }
            ViewCompat.w(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.k, new AccessibilityViewCommand() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.6
                @Override // androidx.core.view.accessibility.AccessibilityViewCommand
                public final boolean d(View view2) {
                    BottomSheetBehavior.this.c(i12);
                    return true;
                }
            });
            ViewCompat.w(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.j, new AccessibilityViewCommand() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.6
                @Override // androidx.core.view.accessibility.AccessibilityViewCommand
                public final boolean d(View view2) {
                    BottomSheetBehavior.this.c(i13);
                    return true;
                }
            });
        }
    }

    public final void R(int i2, boolean z2) {
        MaterialShapeDrawable materialShapeDrawable = this.j0;
        ValueAnimator valueAnimator = this.C0;
        if (i2 == 2) {
            return;
        }
        boolean z3 = this.M0 == 3 && (this.y0 || I());
        if (this.A0 == z3 || materialShapeDrawable == null) {
            return;
        }
        this.A0 = z3;
        if (!z2 || valueAnimator == null) {
            if (valueAnimator != null && valueAnimator.isRunning()) {
                valueAnimator.cancel();
            }
            materialShapeDrawable.m(this.A0 ? z() : 1.0f);
            return;
        }
        if (valueAnimator.isRunning()) {
            valueAnimator.reverse();
        } else {
            valueAnimator.setFloatValues(materialShapeDrawable.X.f19422i, z3 ? z() : 1.0f);
            valueAnimator.start();
        }
    }

    public final void S(boolean z2) {
        WeakReference weakReference = this.V0;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z2) {
                if (this.e1 != null) {
                    return;
                } else {
                    this.e1 = new HashMap(childCount);
                }
            }
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = coordinatorLayout.getChildAt(i2);
                if (childAt != this.V0.get() && z2) {
                    this.e1.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z2) {
                return;
            }
            this.e1 = null;
        }
    }

    public final void T() {
        View view;
        if (this.V0 != null) {
            y();
            if (this.M0 != 4 || (view = (View) this.V0.get()) == null) {
                return;
            }
            view.requestLayout();
        }
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public final void b() {
        MaterialBottomContainerBackHelper materialBottomContainerBackHelper = this.a1;
        if (materialBottomContainerBackHelper == null || materialBottomContainerBackHelper.a() == null) {
            return;
        }
        AnimatorSet animatorSetB = materialBottomContainerBackHelper.b();
        animatorSetB.setDuration(materialBottomContainerBackHelper.f19361e);
        animatorSetB.start();
    }

    public final void c(int i2) {
        if (i2 == 1 || i2 == 2) {
            throw new IllegalArgumentException(a.r(new StringBuilder("STATE_"), i2 == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        if (!this.J0 && i2 == 5) {
            androidx.datastore.preferences.protobuf.a.u(i2, "Cannot set state: ", "BottomSheetBehavior");
            return;
        }
        final int i3 = (i2 == 6 && this.f19126Y && H(i2) <= this.E0) ? 3 : i2;
        WeakReference weakReference = this.V0;
        if (weakReference == null || weakReference.get() == null) {
            M(i2);
            return;
        }
        final View view = (View) this.V0.get();
        Runnable runnable = new Runnable() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.1
            @Override // java.lang.Runnable
            public final void run() {
                BottomSheetBehavior.this.O(view, i3, false);
            }
        };
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested()) {
            WeakHashMap weakHashMap = ViewCompat.f4466a;
            if (view.isAttachedToWindow()) {
                view.post(runnable);
                return;
            }
        }
        runnable.run();
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public final void d(BackEventCompat backEventCompat) {
        MaterialBottomContainerBackHelper materialBottomContainerBackHelper = this.a1;
        if (materialBottomContainerBackHelper == null) {
            return;
        }
        materialBottomContainerBackHelper.f = backEventCompat;
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public final void e(BackEventCompat backEventCompat) {
        MaterialBottomContainerBackHelper materialBottomContainerBackHelper = this.a1;
        if (materialBottomContainerBackHelper == null) {
            return;
        }
        if (materialBottomContainerBackHelper.f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
        }
        BackEventCompat backEventCompat2 = materialBottomContainerBackHelper.f;
        materialBottomContainerBackHelper.f = backEventCompat;
        if (backEventCompat2 == null) {
            return;
        }
        materialBottomContainerBackHelper.d(backEventCompat.f3218c);
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public final void f() {
        MaterialBottomContainerBackHelper materialBottomContainerBackHelper = this.a1;
        if (materialBottomContainerBackHelper == null) {
            return;
        }
        BackEventCompat backEventCompat = materialBottomContainerBackHelper.f;
        materialBottomContainerBackHelper.f = null;
        if (backEventCompat == null || Build.VERSION.SDK_INT < 34) {
            c(this.J0 ? 5 : 4);
            return;
        }
        if (this.J0) {
            materialBottomContainerBackHelper.c(backEventCompat, new AnimatorListenerAdapter() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.2
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                    bottomSheetBehavior.M(5);
                    WeakReference weakReference = bottomSheetBehavior.V0;
                    if (weakReference == null || weakReference.get() == null) {
                        return;
                    }
                    ((View) bottomSheetBehavior.V0.get()).requestLayout();
                }
            });
            return;
        }
        AnimatorSet animatorSetB = materialBottomContainerBackHelper.b();
        animatorSetB.setDuration(AnimationUtils.c(backEventCompat.f3218c, materialBottomContainerBackHelper.f19360c, materialBottomContainerBackHelper.d));
        animatorSetB.start();
        c(4);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void i(CoordinatorLayout.LayoutParams layoutParams) {
        this.V0 = null;
        this.N0 = null;
        this.a1 = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void l() {
        this.V0 = null;
        this.N0 = null;
        this.a1 = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean m(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int i2;
        ViewDragHelper viewDragHelper;
        if (!view.isShown() || !this.L0) {
            this.O0 = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.b1 = -1;
            this.c1 = -1;
            VelocityTracker velocityTracker = this.Z0;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.Z0 = null;
            }
        }
        if (this.Z0 == null) {
            this.Z0 = VelocityTracker.obtain();
        }
        this.Z0.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            this.c1 = (int) motionEvent.getY();
            if (this.M0 != 2) {
                WeakReference weakReference = this.X0;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && coordinatorLayout.q(x, this.c1, view2)) {
                    this.b1 = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.d1 = true;
                }
            }
            this.O0 = this.b1 == -1 && !coordinatorLayout.q(x, this.c1, view);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.d1 = false;
            this.b1 = -1;
            if (this.O0) {
                this.O0 = false;
                return false;
            }
        }
        if (this.O0 || (viewDragHelper = this.N0) == null || !viewDragHelper.r(motionEvent)) {
            WeakReference weakReference2 = this.X0;
            View view3 = weakReference2 != null ? (View) weakReference2.get() : null;
            if (actionMasked != 2 || view3 == null || this.O0 || this.M0 == 1 || coordinatorLayout.q((int) motionEvent.getX(), (int) motionEvent.getY(), view3) || this.N0 == null || (i2 = this.c1) == -1 || Math.abs(i2 - motionEvent.getY()) <= this.N0.f4589b) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean n(CoordinatorLayout coordinatorLayout, View view, int i2) {
        int i3 = this.m0;
        MaterialShapeDrawable materialShapeDrawable = this.j0;
        WeakHashMap weakHashMap = ViewCompat.f4466a;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        int i4 = 0;
        if (this.V0 == null) {
            this.h0 = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            final boolean z2 = (Build.VERSION.SDK_INT < 29 || this.o0 || this.g0) ? false : true;
            if (this.p0 || this.q0 || this.r0 || this.t0 || this.u0 || this.v0 || z2) {
                ViewUtils.a(view, new ViewUtils.OnApplyWindowInsetsListener() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.4
                    /* JADX WARN: Code duplicated, block: B:33:0x0077  */
                    @Override // com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener
                    public final WindowInsetsCompat a(View view2, WindowInsetsCompat windowInsetsCompat, ViewUtils.RelativePadding relativePadding) {
                        boolean z3;
                        Insets insetsE = windowInsetsCompat.e(7);
                        Insets insetsE2 = windowInsetsCompat.e(32);
                        int i5 = insetsE.f4298b;
                        BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                        bottomSheetBehavior.x0 = i5;
                        boolean zE = ViewUtils.e(view2);
                        int paddingBottom = view2.getPaddingBottom();
                        int paddingLeft = view2.getPaddingLeft();
                        int paddingRight = view2.getPaddingRight();
                        if (bottomSheetBehavior.p0) {
                            int iG = windowInsetsCompat.g();
                            bottomSheetBehavior.w0 = iG;
                            paddingBottom = iG + relativePadding.d;
                        }
                        boolean z4 = bottomSheetBehavior.q0;
                        int i6 = insetsE.f4297a;
                        if (z4) {
                            paddingLeft = (zE ? relativePadding.f19357c : relativePadding.f19355a) + i6;
                        }
                        boolean z5 = bottomSheetBehavior.r0;
                        int i7 = insetsE.f4299c;
                        if (z5) {
                            paddingRight = (zE ? relativePadding.f19355a : relativePadding.f19357c) + i7;
                        }
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        boolean z6 = true;
                        if (!bottomSheetBehavior.t0 || marginLayoutParams.leftMargin == i6) {
                            z3 = false;
                        } else {
                            marginLayoutParams.leftMargin = i6;
                            z3 = true;
                        }
                        if (bottomSheetBehavior.u0 && marginLayoutParams.rightMargin != i7) {
                            marginLayoutParams.rightMargin = i7;
                            z3 = true;
                        }
                        if (bottomSheetBehavior.v0) {
                            int i8 = marginLayoutParams.topMargin;
                            int i9 = insetsE.f4298b;
                            if (i8 != i9) {
                                marginLayoutParams.topMargin = i9;
                            } else {
                                z6 = z3;
                            }
                        } else {
                            z6 = z3;
                        }
                        if (z6) {
                            view2.setLayoutParams(marginLayoutParams);
                        }
                        view2.setPadding(paddingLeft, view2.getPaddingTop(), paddingRight, paddingBottom);
                        boolean z7 = z2;
                        if (z7) {
                            bottomSheetBehavior.n0 = insetsE2.d;
                        }
                        if (!bottomSheetBehavior.p0 && !z7) {
                            return windowInsetsCompat;
                        }
                        bottomSheetBehavior.T();
                        return windowInsetsCompat;
                    }
                });
            }
            ViewCompat.N(view, new InsetsAnimationCallback(view));
            this.V0 = new WeakReference(view);
            this.a1 = new MaterialBottomContainerBackHelper(view);
            if (materialShapeDrawable != null) {
                view.setBackground(materialShapeDrawable);
                float fK = this.I0;
                if (fK == -1.0f) {
                    fK = ViewCompat.k(view);
                }
                materialShapeDrawable.k(fK);
            } else {
                ColorStateList colorStateList = this.k0;
                if (colorStateList != null) {
                    ViewCompat.C(view, colorStateList);
                }
            }
            P();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
        }
        if (this.N0 == null) {
            this.N0 = new ViewDragHelper(coordinatorLayout.getContext(), coordinatorLayout, this.g1);
        }
        int top2 = view.getTop();
        coordinatorLayout.s(i2, view);
        this.T0 = coordinatorLayout.getWidth();
        this.U0 = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.S0 = height;
        int iMin = this.U0;
        int i5 = iMin - height;
        int i6 = this.x0;
        if (i5 < i6) {
            if (this.s0) {
                if (i3 != -1) {
                    iMin = Math.min(iMin, i3);
                }
                this.S0 = iMin;
            } else {
                int iMin2 = iMin - i6;
                if (i3 != -1) {
                    iMin2 = Math.min(iMin2, i3);
                }
                this.S0 = iMin2;
            }
        }
        this.E0 = Math.max(0, this.U0 - this.S0);
        this.F0 = (int) ((1.0f - this.G0) * this.U0);
        y();
        int i7 = this.M0;
        if (i7 == 3) {
            view.offsetTopAndBottom(G());
        } else if (i7 == 6) {
            view.offsetTopAndBottom(this.F0);
        } else if (this.J0 && i7 == 5) {
            view.offsetTopAndBottom(this.U0);
        } else if (i7 == 4) {
            view.offsetTopAndBottom(this.H0);
        } else if (i7 == 1 || i7 == 2) {
            view.offsetTopAndBottom(top2 - view.getTop());
        }
        R(this.M0, false);
        this.X0 = new WeakReference(D(view));
        while (true) {
            ArrayList arrayList = this.Y0;
            if (i4 >= arrayList.size()) {
                return true;
            }
            ((BottomSheetCallback) arrayList.get(i4)).a(view);
            i4++;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean o(CoordinatorLayout coordinatorLayout, View view, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(F(i2, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, this.l0, marginLayoutParams.width), F(i4, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.m0, marginLayoutParams.height));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean p(View view) {
        WeakReference weakReference = this.X0;
        return (weakReference == null || view != weakReference.get() || this.M0 == 3) ? false : true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void q(CoordinatorLayout coordinatorLayout, View view, View view2, int i2, int i3, int[] iArr, int i4) {
        boolean z2 = this.L0;
        if (i4 == 1) {
            return;
        }
        WeakReference weakReference = this.X0;
        if (view2 != (weakReference != null ? (View) weakReference.get() : null)) {
            return;
        }
        int top2 = view.getTop();
        int i5 = top2 - i3;
        if (i3 > 0) {
            if (i5 < G()) {
                int iG = top2 - G();
                iArr[1] = iG;
                WeakHashMap weakHashMap = ViewCompat.f4466a;
                view.offsetTopAndBottom(-iG);
                M(3);
            } else {
                if (!z2) {
                    return;
                }
                iArr[1] = i3;
                WeakHashMap weakHashMap2 = ViewCompat.f4466a;
                view.offsetTopAndBottom(-i3);
                M(1);
            }
        } else if (i3 < 0 && !view2.canScrollVertically(-1)) {
            int i6 = this.H0;
            if (i5 > i6 && !this.J0) {
                int i7 = top2 - i6;
                iArr[1] = i7;
                WeakHashMap weakHashMap3 = ViewCompat.f4466a;
                view.offsetTopAndBottom(-i7);
                M(4);
            } else {
                if (!z2) {
                    return;
                }
                iArr[1] = i3;
                WeakHashMap weakHashMap4 = ViewCompat.f4466a;
                view.offsetTopAndBottom(-i3);
                M(1);
            }
        }
        C(view.getTop());
        this.P0 = i3;
        this.Q0 = true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void t(View view, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        int i2 = this.X;
        if (i2 != 0) {
            if (i2 == -1 || (i2 & 1) == 1) {
                this.f0 = savedState.e0;
            }
            if (i2 == -1 || (i2 & 2) == 2) {
                this.f19126Y = savedState.f0;
            }
            if (i2 == -1 || (i2 & 4) == 4) {
                this.J0 = savedState.g0;
            }
            if (i2 == -1 || (i2 & 8) == 8) {
                this.K0 = savedState.h0;
            }
        }
        int i3 = savedState.Z;
        if (i3 == 1 || i3 == 2) {
            this.M0 = 4;
        } else {
            this.M0 = i3;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final Parcelable u(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new SavedState(this);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean v(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i2, int i3) {
        this.P0 = 0;
        this.Q0 = false;
        return (i2 & 2) != 0;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:32:0x005a  */
    /* JADX WARN: Code duplicated, block: B:34:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x0074  */
    /* JADX WARN: Code duplicated, block: B:39:0x0078  */
    /* JADX WARN: Code duplicated, block: B:42:0x0083  */
    /* JADX WARN: Code duplicated, block: B:45:0x0093  */
    /* JADX WARN: Code duplicated, block: B:47:0x0097  */
    /* JADX WARN: Code duplicated, block: B:48:0x0099  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ae  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void w(CoordinatorLayout coordinatorLayout, View view, View view2, int i2) {
        int top2;
        int top3;
        int i3;
        float yVelocity;
        int i4 = 3;
        if (view.getTop() == G()) {
            M(3);
            return;
        }
        WeakReference weakReference = this.X0;
        if (weakReference != null && view2 == weakReference.get() && this.Q0) {
            if (this.P0 > 0) {
                if (!this.f19126Y && view.getTop() > this.F0) {
                    i4 = 6;
                }
            } else if (this.J0) {
                VelocityTracker velocityTracker = this.Z0;
                if (velocityTracker == null) {
                    yVelocity = 0.0f;
                } else {
                    velocityTracker.computeCurrentVelocity(1000, this.Z);
                    yVelocity = this.Z0.getYVelocity(this.b1);
                }
                if (N(view, yVelocity)) {
                    i4 = 5;
                } else if (this.P0 == 0) {
                    top3 = view.getTop();
                    if (this.f19126Y) {
                        i3 = this.F0;
                        if (top3 < i3) {
                            if (top3 >= Math.abs(top3 - this.H0)) {
                            }
                        } else if (Math.abs(top3 - i3) < Math.abs(top3 - this.H0)) {
                            i4 = 4;
                        }
                        i4 = 6;
                    } else if (Math.abs(top3 - this.E0) >= Math.abs(top3 - this.H0)) {
                        i4 = 4;
                    }
                } else {
                    if (!this.f19126Y) {
                        top2 = view.getTop();
                        if (Math.abs(top2 - this.F0) < Math.abs(top2 - this.H0)) {
                            i4 = 6;
                        }
                    }
                    i4 = 4;
                }
            } else if (this.P0 == 0) {
                top3 = view.getTop();
                if (this.f19126Y) {
                    i3 = this.F0;
                    if (top3 < i3) {
                        if (top3 >= Math.abs(top3 - this.H0)) {
                        }
                    } else if (Math.abs(top3 - i3) < Math.abs(top3 - this.H0)) {
                        i4 = 4;
                    }
                    i4 = 6;
                } else if (Math.abs(top3 - this.E0) >= Math.abs(top3 - this.H0)) {
                    i4 = 4;
                }
            } else {
                if (!this.f19126Y) {
                    top2 = view.getTop();
                    if (Math.abs(top2 - this.F0) < Math.abs(top2 - this.H0)) {
                        i4 = 6;
                    }
                }
                i4 = 4;
            }
            O(view, i4, false);
            this.Q0 = false;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean x(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i2 = this.M0;
        if (i2 == 1 && actionMasked == 0) {
            return true;
        }
        ViewDragHelper viewDragHelper = this.N0;
        if (viewDragHelper != null && (this.L0 || i2 == 1)) {
            viewDragHelper.k(motionEvent);
        }
        if (actionMasked == 0) {
            this.b1 = -1;
            this.c1 = -1;
            VelocityTracker velocityTracker = this.Z0;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.Z0 = null;
            }
        }
        if (this.Z0 == null) {
            this.Z0 = VelocityTracker.obtain();
        }
        this.Z0.addMovement(motionEvent);
        if (this.N0 != null && ((this.L0 || this.M0 == 1) && actionMasked == 2 && !this.O0)) {
            float fAbs = Math.abs(this.c1 - motionEvent.getY());
            ViewDragHelper viewDragHelper2 = this.N0;
            if (fAbs > viewDragHelper2.f4589b) {
                viewDragHelper2.b(motionEvent.getPointerId(motionEvent.getActionIndex()), view);
            }
        }
        return !this.O0;
    }

    public final void y() {
        int iA = A();
        if (this.f19126Y) {
            this.H0 = Math.max(this.U0 - iA, this.E0);
        } else {
            this.H0 = this.U0 - iA;
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0044  */
    public final float z() {
        WeakReference weakReference;
        WindowInsets rootWindowInsets;
        float f;
        float f2 = 0.0f;
        if (this.j0 != null && (weakReference = this.V0) != null && weakReference.get() != null && Build.VERSION.SDK_INT >= 31) {
            View view = (View) this.V0.get();
            if (I() && (rootWindowInsets = view.getRootWindowInsets()) != null) {
                float fH = this.j0.h();
                RoundedCorner roundedCorner = rootWindowInsets.getRoundedCorner(0);
                if (roundedCorner != null) {
                    float radius = roundedCorner.getRadius();
                    if (radius <= 0.0f || fH <= 0.0f) {
                        f = 0.0f;
                    } else {
                        f = radius / fH;
                    }
                } else {
                    f = 0.0f;
                }
                MaterialShapeDrawable materialShapeDrawable = this.j0;
                float fA = materialShapeDrawable.X.f19417a.f.a(materialShapeDrawable.g());
                RoundedCorner roundedCorner2 = rootWindowInsets.getRoundedCorner(1);
                if (roundedCorner2 != null) {
                    float radius2 = roundedCorner2.getRadius();
                    if (radius2 > 0.0f && fA > 0.0f) {
                        f2 = radius2 / fA;
                    }
                }
                return Math.max(f, f2);
            }
        }
        return 0.0f;
    }

    public static class SavedState extends androidx.customview.view.AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new AnonymousClass1();
        public final int Z;
        public final int e0;
        public final boolean f0;
        public final boolean g0;
        public final boolean h0;

        /* JADX INFO: renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$SavedState$1, reason: invalid class name */
        public class AnonymousClass1 implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i2) {
                return new SavedState[i2];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.Z = parcel.readInt();
            this.e0 = parcel.readInt();
            this.f0 = parcel.readInt() == 1;
            this.g0 = parcel.readInt() == 1;
            this.h0 = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.Z);
            parcel.writeInt(this.e0);
            parcel.writeInt(this.f0 ? 1 : 0);
            parcel.writeInt(this.g0 ? 1 : 0);
            parcel.writeInt(this.h0 ? 1 : 0);
        }

        public SavedState(BottomSheetBehavior bottomSheetBehavior) {
            super(AbsSavedState.EMPTY_STATE);
            this.Z = bottomSheetBehavior.M0;
            this.e0 = bottomSheetBehavior.f0;
            this.f0 = bottomSheetBehavior.f19126Y;
            this.g0 = bottomSheetBehavior.J0;
            this.h0 = bottomSheetBehavior.K0;
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i2;
        this.X = 0;
        this.f19126Y = true;
        this.l0 = -1;
        this.m0 = -1;
        this.B0 = new StateSettlingTracker();
        this.G0 = 0.5f;
        this.I0 = -1.0f;
        this.L0 = true;
        this.M0 = 4;
        this.R0 = 0.1f;
        this.Y0 = new ArrayList();
        this.c1 = -1;
        this.f1 = new SparseIntArray();
        this.g1 = new ViewDragHelper.Callback() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.5
            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public final int a(int i3, View view) {
                return view.getLeft();
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public final int b(int i3, View view) {
                return MathUtils.b(i3, BottomSheetBehavior.this.G(), d());
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public final int d() {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                return bottomSheetBehavior.J0 ? bottomSheetBehavior.U0 : bottomSheetBehavior.H0;
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public final void f(int i3) {
                if (i3 == 1) {
                    BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                    if (bottomSheetBehavior.L0) {
                        bottomSheetBehavior.M(1);
                    }
                }
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public final void g(int i3, int i4, View view) {
                BottomSheetBehavior.this.C(i4);
            }

            /* JADX WARN: Code duplicated, block: B:20:0x004c  */
            /* JADX WARN: Code duplicated, block: B:34:0x0085  */
            /* JADX WARN: Code duplicated, block: B:6:0x000d  */
            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public final void h(float f, float f2, View view) {
                int i3 = 6;
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (f2 < 0.0f) {
                    if (bottomSheetBehavior.f19126Y) {
                        i3 = 3;
                    } else {
                        int top2 = view.getTop();
                        System.currentTimeMillis();
                        bottomSheetBehavior.getClass();
                        if (top2 <= bottomSheetBehavior.F0) {
                            i3 = 3;
                        }
                    }
                } else if (bottomSheetBehavior.J0 && bottomSheetBehavior.N(view, f2)) {
                    if (Math.abs(f) >= Math.abs(f2) || f2 <= bottomSheetBehavior.e0) {
                        if (view.getTop() > (bottomSheetBehavior.G() + bottomSheetBehavior.U0) / 2) {
                            i3 = 5;
                        } else if (bottomSheetBehavior.f19126Y || Math.abs(view.getTop() - bottomSheetBehavior.G()) < Math.abs(view.getTop() - bottomSheetBehavior.F0)) {
                            i3 = 3;
                        }
                    } else {
                        i3 = 5;
                    }
                } else if (f2 == 0.0f || Math.abs(f) > Math.abs(f2)) {
                    int top3 = view.getTop();
                    if (!bottomSheetBehavior.f19126Y) {
                        int i4 = bottomSheetBehavior.F0;
                        if (top3 < i4) {
                            if (top3 < Math.abs(top3 - bottomSheetBehavior.H0)) {
                                i3 = 3;
                            } else {
                                bottomSheetBehavior.getClass();
                            }
                        } else if (Math.abs(top3 - i4) < Math.abs(top3 - bottomSheetBehavior.H0)) {
                            bottomSheetBehavior.getClass();
                        } else {
                            i3 = 4;
                        }
                    } else if (Math.abs(top3 - bottomSheetBehavior.E0) < Math.abs(top3 - bottomSheetBehavior.H0)) {
                        i3 = 3;
                    } else {
                        i3 = 4;
                    }
                } else if (bottomSheetBehavior.f19126Y) {
                    i3 = 4;
                } else {
                    int top4 = view.getTop();
                    if (Math.abs(top4 - bottomSheetBehavior.F0) < Math.abs(top4 - bottomSheetBehavior.H0)) {
                        bottomSheetBehavior.getClass();
                    } else {
                        i3 = 4;
                    }
                }
                bottomSheetBehavior.getClass();
                bottomSheetBehavior.O(view, i3, true);
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public final boolean i(int i3, View view) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                int i4 = bottomSheetBehavior.M0;
                if (i4 == 1 || bottomSheetBehavior.d1) {
                    return false;
                }
                if (i4 == 3 && bottomSheetBehavior.b1 == i3) {
                    WeakReference weakReference = bottomSheetBehavior.X0;
                    View view2 = weakReference != null ? (View) weakReference.get() : null;
                    if (view2 != null && view2.canScrollVertically(-1)) {
                        return false;
                    }
                }
                System.currentTimeMillis();
                WeakReference weakReference2 = bottomSheetBehavior.V0;
                return weakReference2 != null && weakReference2.get() == view;
            }
        };
        this.i0 = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.google.android.material.R.styleable.f19068c);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.k0 = MaterialResources.a(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(21)) {
            this.z0 = ShapeAppearanceModel.c(context, attributeSet, R.attr.bottomSheetStyle, R.style.Widget_Design_BottomSheet_Modal).a();
        }
        ShapeAppearanceModel shapeAppearanceModel = this.z0;
        if (shapeAppearanceModel != null) {
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(shapeAppearanceModel);
            this.j0 = materialShapeDrawable;
            materialShapeDrawable.j(context);
            ColorStateList colorStateList = this.k0;
            if (colorStateList != null) {
                this.j0.l(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.j0.setTint(typedValue.data);
            }
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(z(), 1.0f);
        this.C0 = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.C0.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                MaterialShapeDrawable materialShapeDrawable2 = BottomSheetBehavior.this.j0;
                if (materialShapeDrawable2 != null) {
                    materialShapeDrawable2.m(fFloatValue);
                }
            }
        });
        this.I0 = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            this.l0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            this.m0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(9);
        if (typedValuePeekValue != null && (i2 = typedValuePeekValue.data) == -1) {
            L(i2);
        } else {
            L(typedArrayObtainStyledAttributes.getDimensionPixelSize(9, -1));
        }
        K(typedArrayObtainStyledAttributes.getBoolean(8, false));
        this.o0 = typedArrayObtainStyledAttributes.getBoolean(13, false);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(6, true);
        if (this.f19126Y != z2) {
            this.f19126Y = z2;
            if (this.V0 != null) {
                y();
            }
            M((this.f19126Y && this.M0 == 6) ? 3 : this.M0);
            R(this.M0, true);
            P();
        }
        this.K0 = typedArrayObtainStyledAttributes.getBoolean(12, false);
        this.L0 = typedArrayObtainStyledAttributes.getBoolean(4, true);
        this.X = typedArrayObtainStyledAttributes.getInt(10, 0);
        float f = typedArrayObtainStyledAttributes.getFloat(7, 0.5f);
        if (f > 0.0f && f < 1.0f) {
            this.G0 = f;
            if (this.V0 != null) {
                this.F0 = (int) ((1.0f - f) * this.U0);
            }
            TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(5);
            if (typedValuePeekValue2 != null && typedValuePeekValue2.type == 16) {
                int i3 = typedValuePeekValue2.data;
                if (i3 >= 0) {
                    this.D0 = i3;
                    R(this.M0, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            } else {
                int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(5, 0);
                if (dimensionPixelOffset >= 0) {
                    this.D0 = dimensionPixelOffset;
                    R(this.M0, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            }
            this.e0 = typedArrayObtainStyledAttributes.getInt(11, 500);
            this.p0 = typedArrayObtainStyledAttributes.getBoolean(17, false);
            this.q0 = typedArrayObtainStyledAttributes.getBoolean(18, false);
            this.r0 = typedArrayObtainStyledAttributes.getBoolean(19, false);
            this.s0 = typedArrayObtainStyledAttributes.getBoolean(20, true);
            this.t0 = typedArrayObtainStyledAttributes.getBoolean(14, false);
            this.u0 = typedArrayObtainStyledAttributes.getBoolean(15, false);
            this.v0 = typedArrayObtainStyledAttributes.getBoolean(16, false);
            this.y0 = typedArrayObtainStyledAttributes.getBoolean(23, true);
            typedArrayObtainStyledAttributes.recycle();
            this.Z = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void r(CoordinatorLayout coordinatorLayout, View view, int i2, int i3, int i4, int[] iArr) {
    }
}
