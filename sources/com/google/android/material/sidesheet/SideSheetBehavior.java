package com.google.android.material.sidesheet;

import A.RunnableC0879a;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Property;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.activity.BackEventCompat;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.math.MathUtils;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.widget.ViewDragHelper;
import com.charging.screenshow.battery.animations.themes.R;
import com.google.android.exoplayer2.analytics.d;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.motion.MaterialSideContainerBackHelper;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes4.dex */
public class SideSheetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> implements Sheet<SideSheetCallback> {
    public SheetDelegate X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final MaterialShapeDrawable f19477Y;
    public final ColorStateList Z;
    public final ShapeAppearanceModel e0;
    public final StateSettlingTracker f0;
    public final float g0;
    public final boolean h0;
    public int i0;
    public ViewDragHelper j0;
    public boolean k0;
    public final float l0;
    public int m0;
    public int n0;
    public int o0;
    public int p0;
    public WeakReference q0;
    public WeakReference r0;
    public final int s0;
    public VelocityTracker t0;
    public MaterialSideContainerBackHelper u0;
    public int v0;
    public final LinkedHashSet w0;
    public final ViewDragHelper.Callback x0;

    public class StateSettlingTracker {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f19479a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f19480b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final c f19481c = new Runnable() { // from class: com.google.android.material.sidesheet.c
            @Override // java.lang.Runnable
            public final void run() {
                SideSheetBehavior.StateSettlingTracker stateSettlingTracker = this.X;
                stateSettlingTracker.f19480b = false;
                SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                ViewDragHelper viewDragHelper = sideSheetBehavior.j0;
                if (viewDragHelper != null && viewDragHelper.g()) {
                    stateSettlingTracker.a(stateSettlingTracker.f19479a);
                } else if (sideSheetBehavior.i0 == 2) {
                    sideSheetBehavior.y(stateSettlingTracker.f19479a);
                }
            }
        };

        /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.material.sidesheet.c] */
        public StateSettlingTracker() {
        }

        public final void a(int i2) {
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            WeakReference weakReference = sideSheetBehavior.q0;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.f19479a = i2;
            if (this.f19480b) {
                return;
            }
            View view = (View) sideSheetBehavior.q0.get();
            c cVar = this.f19481c;
            WeakHashMap weakHashMap = ViewCompat.f4466a;
            view.postOnAnimation(cVar);
            this.f19480b = true;
        }
    }

    public SideSheetBehavior() {
        this.f0 = new StateSettlingTracker();
        this.h0 = true;
        this.i0 = 5;
        this.l0 = 0.1f;
        this.s0 = -1;
        this.w0 = new LinkedHashSet();
        this.x0 = new ViewDragHelper.Callback() { // from class: com.google.android.material.sidesheet.SideSheetBehavior.1
            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public final int a(int i2, View view) {
                SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                return MathUtils.b(i2, sideSheetBehavior.X.g(), sideSheetBehavior.X.f());
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public final int b(int i2, View view) {
                return view.getTop();
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public final int c(View view) {
                SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                return sideSheetBehavior.m0 + sideSheetBehavior.p0;
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public final void f(int i2) {
                if (i2 == 1) {
                    SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                    if (sideSheetBehavior.h0) {
                        sideSheetBehavior.y(1);
                    }
                }
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public final void g(int i2, int i3, View view) {
                ViewGroup.MarginLayoutParams marginLayoutParams;
                SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                WeakReference weakReference = sideSheetBehavior.r0;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
                    sideSheetBehavior.X.p(marginLayoutParams, view.getLeft(), view.getRight());
                    view2.setLayoutParams(marginLayoutParams);
                }
                LinkedHashSet linkedHashSet = sideSheetBehavior.w0;
                if (linkedHashSet.isEmpty()) {
                    return;
                }
                sideSheetBehavior.X.b(i2);
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    ((SheetCallback) it.next()).getClass();
                }
            }

            /* JADX WARN: Code duplicated, block: B:19:0x0053  */
            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public final void h(float f, float f2, View view) {
                int i2;
                SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                if (!sideSheetBehavior.X.k(f)) {
                    if (!sideSheetBehavior.X.n(view, f)) {
                        if (f == 0.0f || Math.abs(f) <= Math.abs(f2)) {
                            int left = view.getLeft();
                            i2 = Math.abs(left - sideSheetBehavior.X.d()) < Math.abs(left - sideSheetBehavior.X.e()) ? 3 : 5;
                        }
                    } else if (sideSheetBehavior.X.m(f, f2) || sideSheetBehavior.X.l(view)) {
                    }
                }
                sideSheetBehavior.A(view, i2, true);
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public final boolean i(int i2, View view) {
                WeakReference weakReference;
                SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                return (sideSheetBehavior.i0 == 1 || (weakReference = sideSheetBehavior.q0) == null || weakReference.get() != view) ? false : true;
            }
        };
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
    
        if (r1.q(r0, r3.getTop()) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004b, code lost:
    
        if (r3 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004d, code lost:
    
        y(2);
        r2.f0.a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0056, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A(android.view.View r3, int r4, boolean r5) {
        /*
            r2 = this;
            r0 = 3
            if (r4 == r0) goto L19
            r0 = 5
            if (r4 != r0) goto Ld
            com.google.android.material.sidesheet.SheetDelegate r0 = r2.X
            int r0 = r0.e()
            goto L1f
        Ld:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Invalid state to get outer edge offset: "
            java.lang.String r4 = android.support.v4.media.a.h(r4, r5)
            r3.<init>(r4)
            throw r3
        L19:
            com.google.android.material.sidesheet.SheetDelegate r0 = r2.X
            int r0 = r0.d()
        L1f:
            androidx.customview.widget.ViewDragHelper r1 = r2.j0
            if (r1 == 0) goto L57
            if (r5 == 0) goto L30
            int r3 = r3.getTop()
            boolean r3 = r1.q(r0, r3)
            if (r3 == 0) goto L57
            goto L4d
        L30:
            int r5 = r3.getTop()
            r1.r = r3
            r3 = -1
            r1.f4590c = r3
            r3 = 0
            boolean r3 = r1.i(r0, r5, r3, r3)
            if (r3 != 0) goto L4b
            int r5 = r1.f4588a
            if (r5 != 0) goto L4b
            android.view.View r5 = r1.r
            if (r5 == 0) goto L4b
            r5 = 0
            r1.r = r5
        L4b:
            if (r3 == 0) goto L57
        L4d:
            r3 = 2
            r2.y(r3)
            com.google.android.material.sidesheet.SideSheetBehavior$StateSettlingTracker r3 = r2.f0
            r3.a(r4)
            return
        L57:
            r2.y(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.sidesheet.SideSheetBehavior.A(android.view.View, int, boolean):void");
    }

    public final void B() {
        View view;
        WeakReference weakReference = this.q0;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        ViewCompat.v(262144, view);
        ViewCompat.s(0, view);
        ViewCompat.v(1048576, view);
        ViewCompat.s(0, view);
        int i2 = 5;
        if (this.i0 != 5) {
            ViewCompat.w(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.f4539l, new d(this, i2, 6));
        }
        int i3 = 3;
        if (this.i0 != 3) {
            ViewCompat.w(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.j, new d(this, i3, 6));
        }
    }

    @Override // com.google.android.material.sidesheet.Sheet
    public final void a(SideSheetDialog.AnonymousClass1 anonymousClass1) {
        this.w0.add(anonymousClass1);
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public final void b() {
        MaterialSideContainerBackHelper materialSideContainerBackHelper = this.u0;
        if (materialSideContainerBackHelper == null || materialSideContainerBackHelper.a() == null) {
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        View view = materialSideContainerBackHelper.f19359b;
        animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 1.0f));
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i2), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setDuration(materialSideContainerBackHelper.f19361e);
        animatorSet.start();
    }

    @Override // com.google.android.material.sidesheet.Sheet
    public final void c(int i2) {
        if (i2 == 1 || i2 == 2) {
            throw new IllegalArgumentException(android.support.v4.media.a.r(new StringBuilder("STATE_"), i2 == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        WeakReference weakReference = this.q0;
        if (weakReference == null || weakReference.get() == null) {
            y(i2);
            return;
        }
        View view = (View) this.q0.get();
        RunnableC0879a runnableC0879a = new RunnableC0879a(this, i2, 8);
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested()) {
            WeakHashMap weakHashMap = ViewCompat.f4466a;
            if (view.isAttachedToWindow()) {
                view.post(runnableC0879a);
                return;
            }
        }
        runnableC0879a.run();
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public final void d(BackEventCompat backEventCompat) {
        MaterialSideContainerBackHelper materialSideContainerBackHelper = this.u0;
        if (materialSideContainerBackHelper == null) {
            return;
        }
        materialSideContainerBackHelper.f = backEventCompat;
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public final void e(BackEventCompat backEventCompat) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        MaterialSideContainerBackHelper materialSideContainerBackHelper = this.u0;
        if (materialSideContainerBackHelper == null) {
            return;
        }
        SheetDelegate sheetDelegate = this.X;
        int i2 = (sheetDelegate == null || sheetDelegate.j() == 0) ? 5 : 3;
        if (materialSideContainerBackHelper.f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
        }
        BackEventCompat backEventCompat2 = materialSideContainerBackHelper.f;
        materialSideContainerBackHelper.f = backEventCompat;
        if (backEventCompat2 != null) {
            materialSideContainerBackHelper.c(i2, backEventCompat.f3218c, backEventCompat.d == 0);
        }
        WeakReference weakReference = this.q0;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        View view = (View) this.q0.get();
        WeakReference weakReference2 = this.r0;
        View view2 = weakReference2 != null ? (View) weakReference2.get() : null;
        if (view2 == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) == null) {
            return;
        }
        this.X.o(marginLayoutParams, (int) ((view.getScaleX() * this.m0) + this.p0));
        view2.requestLayout();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.material.motion.MaterialBackHandler
    public final void f() {
        final ViewGroup.MarginLayoutParams marginLayoutParams;
        MaterialSideContainerBackHelper materialSideContainerBackHelper = this.u0;
        if (materialSideContainerBackHelper == null) {
            return;
        }
        BackEventCompat backEventCompat = materialSideContainerBackHelper.f;
        b bVar = 0;
        bVar = 0;
        materialSideContainerBackHelper.f = null;
        int i2 = 5;
        if (backEventCompat == null || Build.VERSION.SDK_INT < 34) {
            c(5);
            return;
        }
        SheetDelegate sheetDelegate = this.X;
        if (sheetDelegate != null && sheetDelegate.j() != 0) {
            i2 = 3;
        }
        Animator.AnimatorListener animatorListener = new AnimatorListenerAdapter() { // from class: com.google.android.material.sidesheet.SideSheetBehavior.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                sideSheetBehavior.y(5);
                WeakReference weakReference = sideSheetBehavior.q0;
                if (weakReference == null || weakReference.get() == null) {
                    return;
                }
                ((View) sideSheetBehavior.q0.get()).requestLayout();
            }
        };
        WeakReference weakReference = this.r0;
        final View view = weakReference != null ? (View) weakReference.get() : null;
        if (view != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams()) != null) {
            final int iC = this.X.c(marginLayoutParams);
            bVar = new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.sidesheet.b
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.X.X.o(marginLayoutParams, AnimationUtils.c(valueAnimator.getAnimatedFraction(), iC, 0));
                    view.requestLayout();
                }
            };
        }
        materialSideContainerBackHelper.b(backEventCompat, i2, animatorListener, bVar);
    }

    @Override // com.google.android.material.sidesheet.Sheet
    public final int getState() {
        return this.i0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void i(CoordinatorLayout.LayoutParams layoutParams) {
        this.q0 = null;
        this.j0 = null;
        this.u0 = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void l() {
        this.q0 = null;
        this.j0 = null;
        this.u0 = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean m(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        ViewDragHelper viewDragHelper;
        VelocityTracker velocityTracker;
        if ((!view.isShown() && ViewCompat.g(view) == null) || !this.h0) {
            this.k0 = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 && (velocityTracker = this.t0) != null) {
            velocityTracker.recycle();
            this.t0 = null;
        }
        if (this.t0 == null) {
            this.t0 = VelocityTracker.obtain();
        }
        this.t0.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.v0 = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.k0) {
            this.k0 = false;
            return false;
        }
        return (this.k0 || (viewDragHelper = this.j0) == null || !viewDragHelper.r(motionEvent)) ? false : true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean n(CoordinatorLayout coordinatorLayout, View view, int i2) {
        View view2;
        View view3;
        int i3;
        View viewFindViewById;
        MaterialShapeDrawable materialShapeDrawable = this.f19477Y;
        WeakHashMap weakHashMap = ViewCompat.f4466a;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        int iH = 0;
        if (this.q0 == null) {
            this.q0 = new WeakReference(view);
            this.u0 = new MaterialSideContainerBackHelper(view);
            if (materialShapeDrawable != null) {
                view.setBackground(materialShapeDrawable);
                float fK = this.g0;
                if (fK == -1.0f) {
                    fK = ViewCompat.k(view);
                }
                materialShapeDrawable.k(fK);
            } else {
                ColorStateList colorStateList = this.Z;
                if (colorStateList != null) {
                    ViewCompat.C(view, colorStateList);
                }
            }
            int i4 = this.i0 == 5 ? 4 : 0;
            if (view.getVisibility() != i4) {
                view.setVisibility(i4);
            }
            B();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
            if (ViewCompat.g(view) == null) {
                ViewCompat.B(view, view.getResources().getString(R.string.side_sheet_accessibility_pane_title));
            }
        }
        int i5 = Gravity.getAbsoluteGravity(((CoordinatorLayout.LayoutParams) view.getLayoutParams()).f4148c, i2) == 3 ? 1 : 0;
        SheetDelegate sheetDelegate = this.X;
        if (sheetDelegate == null || sheetDelegate.j() != i5) {
            ShapeAppearanceModel shapeAppearanceModel = this.e0;
            CoordinatorLayout.LayoutParams layoutParams = null;
            if (i5 == 0) {
                this.X = new RightSheetDelegate(this);
                if (shapeAppearanceModel != null) {
                    WeakReference weakReference = this.q0;
                    if (weakReference != null && (view3 = (View) weakReference.get()) != null && (view3.getLayoutParams() instanceof CoordinatorLayout.LayoutParams)) {
                        layoutParams = (CoordinatorLayout.LayoutParams) view3.getLayoutParams();
                    }
                    if (layoutParams == null || ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin <= 0) {
                        ShapeAppearanceModel.Builder builderF = shapeAppearanceModel.f();
                        builderF.g(0.0f);
                        builderF.e(0.0f);
                        ShapeAppearanceModel shapeAppearanceModelA = builderF.a();
                        if (materialShapeDrawable != null) {
                            materialShapeDrawable.setShapeAppearanceModel(shapeAppearanceModelA);
                        }
                    }
                }
            } else {
                if (i5 != 1) {
                    throw new IllegalArgumentException(androidx.datastore.preferences.protobuf.a.k("Invalid sheet edge position value: ", i5, ". Must be 0 or 1."));
                }
                this.X = new LeftSheetDelegate(this);
                if (shapeAppearanceModel != null) {
                    WeakReference weakReference2 = this.q0;
                    if (weakReference2 != null && (view2 = (View) weakReference2.get()) != null && (view2.getLayoutParams() instanceof CoordinatorLayout.LayoutParams)) {
                        layoutParams = (CoordinatorLayout.LayoutParams) view2.getLayoutParams();
                    }
                    if (layoutParams == null || ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin <= 0) {
                        ShapeAppearanceModel.Builder builderF2 = shapeAppearanceModel.f();
                        builderF2.f(0.0f);
                        builderF2.d(0.0f);
                        ShapeAppearanceModel shapeAppearanceModelA2 = builderF2.a();
                        if (materialShapeDrawable != null) {
                            materialShapeDrawable.setShapeAppearanceModel(shapeAppearanceModelA2);
                        }
                    }
                }
            }
        }
        if (this.j0 == null) {
            this.j0 = new ViewDragHelper(coordinatorLayout.getContext(), coordinatorLayout, this.x0);
        }
        int iH2 = this.X.h(view);
        coordinatorLayout.s(i2, view);
        this.n0 = coordinatorLayout.getWidth();
        this.o0 = this.X.i(coordinatorLayout);
        this.m0 = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        this.p0 = marginLayoutParams != null ? this.X.a(marginLayoutParams) : 0;
        int i6 = this.i0;
        if (i6 == 1 || i6 == 2) {
            iH = iH2 - this.X.h(view);
        } else if (i6 != 3) {
            if (i6 != 5) {
                throw new IllegalStateException("Unexpected value: " + this.i0);
            }
            iH = this.X.e();
        }
        view.offsetLeftAndRight(iH);
        if (this.r0 == null && (i3 = this.s0) != -1 && (viewFindViewById = coordinatorLayout.findViewById(i3)) != null) {
            this.r0 = new WeakReference(viewFindViewById);
        }
        for (SheetCallback sheetCallback : this.w0) {
            if (sheetCallback instanceof SideSheetCallback) {
                ((SideSheetCallback) sheetCallback).getClass();
            }
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean o(CoordinatorLayout coordinatorLayout, View view, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i2, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i4, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void t(View view, Parcelable parcelable) {
        int i2 = ((SavedState) parcelable).Z;
        if (i2 == 1 || i2 == 2) {
            i2 = 5;
        }
        this.i0 = i2;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final Parcelable u(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new SavedState(this);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean x(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.i0 == 1 && actionMasked == 0) {
            return true;
        }
        if (z()) {
            this.j0.k(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.t0) != null) {
            velocityTracker.recycle();
            this.t0 = null;
        }
        if (this.t0 == null) {
            this.t0 = VelocityTracker.obtain();
        }
        this.t0.addMovement(motionEvent);
        if (z() && actionMasked == 2 && !this.k0 && z()) {
            float fAbs = Math.abs(this.v0 - motionEvent.getX());
            ViewDragHelper viewDragHelper = this.j0;
            if (fAbs > viewDragHelper.f4589b) {
                viewDragHelper.b(motionEvent.getPointerId(motionEvent.getActionIndex()), view);
            }
        }
        return !this.k0;
    }

    public final void y(int i2) {
        View view;
        if (this.i0 == i2) {
            return;
        }
        this.i0 = i2;
        WeakReference weakReference = this.q0;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i3 = this.i0 == 5 ? 4 : 0;
        if (view.getVisibility() != i3) {
            view.setVisibility(i3);
        }
        Iterator it = this.w0.iterator();
        while (it.hasNext()) {
            ((SheetCallback) it.next()).a(i2);
        }
        B();
    }

    public final boolean z() {
        if (this.j0 != null) {
            return this.h0 || this.i0 == 1;
        }
        return false;
    }

    public static class SavedState extends androidx.customview.view.AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new AnonymousClass1();
        public final int Z;

        /* JADX INFO: renamed from: com.google.android.material.sidesheet.SideSheetBehavior$SavedState$1, reason: invalid class name */
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
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.Z);
        }

        public SavedState(SideSheetBehavior sideSheetBehavior) {
            super(AbsSavedState.EMPTY_STATE);
            this.Z = sideSheetBehavior.i0;
        }
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        this.f0 = new StateSettlingTracker();
        this.h0 = true;
        this.i0 = 5;
        this.l0 = 0.1f;
        this.s0 = -1;
        this.w0 = new LinkedHashSet();
        this.x0 = new ViewDragHelper.Callback() { // from class: com.google.android.material.sidesheet.SideSheetBehavior.1
            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public final int a(int i2, View view) {
                SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                return MathUtils.b(i2, sideSheetBehavior.X.g(), sideSheetBehavior.X.f());
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public final int b(int i2, View view) {
                return view.getTop();
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public final int c(View view) {
                SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                return sideSheetBehavior.m0 + sideSheetBehavior.p0;
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public final void f(int i2) {
                if (i2 == 1) {
                    SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                    if (sideSheetBehavior.h0) {
                        sideSheetBehavior.y(1);
                    }
                }
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public final void g(int i2, int i3, View view) {
                ViewGroup.MarginLayoutParams marginLayoutParams;
                SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                WeakReference weakReference = sideSheetBehavior.r0;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
                    sideSheetBehavior.X.p(marginLayoutParams, view.getLeft(), view.getRight());
                    view2.setLayoutParams(marginLayoutParams);
                }
                LinkedHashSet linkedHashSet = sideSheetBehavior.w0;
                if (linkedHashSet.isEmpty()) {
                    return;
                }
                sideSheetBehavior.X.b(i2);
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    ((SheetCallback) it.next()).getClass();
                }
            }

            /* JADX WARN: Code duplicated, block: B:19:0x0053  */
            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public final void h(float f, float f2, View view) {
                int i2;
                SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                if (!sideSheetBehavior.X.k(f)) {
                    if (!sideSheetBehavior.X.n(view, f)) {
                        if (f == 0.0f || Math.abs(f) <= Math.abs(f2)) {
                            int left = view.getLeft();
                            i2 = Math.abs(left - sideSheetBehavior.X.d()) < Math.abs(left - sideSheetBehavior.X.e()) ? 3 : 5;
                        }
                    } else if (sideSheetBehavior.X.m(f, f2) || sideSheetBehavior.X.l(view)) {
                    }
                }
                sideSheetBehavior.A(view, i2, true);
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public final boolean i(int i2, View view) {
                WeakReference weakReference;
                SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                return (sideSheetBehavior.i0 == 1 || (weakReference = sideSheetBehavior.q0) == null || weakReference.get() != view) ? false : true;
            }
        };
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.google.android.material.R.styleable.D);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.Z = MaterialResources.a(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            this.e0 = ShapeAppearanceModel.c(context, attributeSet, 0, R.style.Widget_Material3_SideSheet).a();
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(5, -1);
            this.s0 = resourceId;
            WeakReference weakReference = this.r0;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.r0 = null;
            WeakReference weakReference2 = this.q0;
            if (weakReference2 != null) {
                View view = (View) weakReference2.get();
                if (resourceId != -1) {
                    WeakHashMap weakHashMap = ViewCompat.f4466a;
                    if (view.isLaidOut()) {
                        view.requestLayout();
                    }
                }
            }
        }
        ShapeAppearanceModel shapeAppearanceModel = this.e0;
        if (shapeAppearanceModel != null) {
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(shapeAppearanceModel);
            this.f19477Y = materialShapeDrawable;
            materialShapeDrawable.j(context);
            ColorStateList colorStateList = this.Z;
            if (colorStateList != null) {
                this.f19477Y.l(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f19477Y.setTint(typedValue.data);
            }
        }
        this.g0 = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        this.h0 = typedArrayObtainStyledAttributes.getBoolean(4, true);
        typedArrayObtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
