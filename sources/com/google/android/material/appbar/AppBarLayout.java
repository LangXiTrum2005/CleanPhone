package com.google.android.material.appbar;

import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.math.MathUtils;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.NestedScrollingChild;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.R;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes4.dex */
public class AppBarLayout extends LinearLayout implements CoordinatorLayout.AttachedBehavior {
    public int e0;
    public int f0;
    public int g0;
    public int h0;
    public boolean i0;
    public int j0;
    public boolean k0;
    public boolean l0;
    public boolean m0;
    public boolean n0;
    public int o0;
    public WeakReference p0;
    public ValueAnimator q0;
    public int[] r0;
    public Drawable s0;
    public Behavior t0;

    /* JADX INFO: renamed from: com.google.android.material.appbar.AppBarLayout$1, reason: invalid class name */
    class AnonymousClass1 implements OnApplyWindowInsetsListener {
        @Override // androidx.core.view.OnApplyWindowInsetsListener
        public final WindowInsetsCompat d(View view, WindowInsetsCompat windowInsetsCompat) {
            throw null;
        }
    }

    public interface BaseOnOffsetChangedListener<T extends AppBarLayout> {
        void a(AppBarLayout appBarLayout, int i2);
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {

        public static abstract class DragCallback extends BaseBehavior.BaseDragCallback<AppBarLayout> {
        }

        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static abstract class ChildScrollEffect {
    }

    public static class CompressChildScrollEffect extends ChildScrollEffect {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Rect f19094a = new Rect();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Rect f19095b = new Rect();
    }

    public static class LayoutParams extends LinearLayout.LayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f19096a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public CompressChildScrollEffect f19097b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Interpolator f19098c;

        @Retention(RetentionPolicy.SOURCE)
        public @interface ScrollEffect {
        }

        @Retention(RetentionPolicy.SOURCE)
        public @interface ScrollFlags {
        }
    }

    public interface LiftOnScrollListener {
    }

    public interface OnOffsetChangedListener extends BaseOnOffsetChangedListener<AppBarLayout> {
    }

    public static class ScrollingViewBehavior extends HeaderScrollingViewBehavior {
        public ScrollingViewBehavior() {
        }

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
        public final AppBarLayout C(ArrayList arrayList) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = (View) arrayList.get(i2);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
        public final float D(View view) {
            int i2;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) appBarLayout.getLayoutParams()).f4146a;
                int iZ = behavior instanceof BaseBehavior ? ((BaseBehavior) behavior).z() : 0;
                if ((downNestedPreScrollRange == 0 || totalScrollRange + iZ > downNestedPreScrollRange) && (i2 = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (iZ / i2) + 1.0f;
                }
            }
            return 0.0f;
        }

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
        public final int E(View view) {
            return view instanceof AppBarLayout ? ((AppBarLayout) view).getTotalScrollRange() : view.getMeasuredHeight();
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean h(View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean j(CoordinatorLayout coordinatorLayout, View view, View view2) {
            int iB;
            CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) view2.getLayoutParams()).f4146a;
            if (behavior instanceof BaseBehavior) {
                int bottom = (view2.getBottom() - view.getTop()) + ((BaseBehavior) behavior).k0 + this.f0;
                if (this.g0 == 0) {
                    iB = 0;
                } else {
                    float fD = D(view2);
                    int i2 = this.g0;
                    iB = MathUtils.b((int) (fD * i2), 0, i2);
                }
                int i3 = bottom - iB;
                WeakHashMap weakHashMap = ViewCompat.f4466a;
                view.offsetTopAndBottom(i3);
            }
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.n0) {
                    appBarLayout.f(appBarLayout.g(view));
                }
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final void k(CoordinatorLayout coordinatorLayout, View view) {
            if (view instanceof AppBarLayout) {
                ViewCompat.z(coordinatorLayout, null);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean s(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z2) {
            AppBarLayout appBarLayout;
            ArrayList arrayListF = coordinatorLayout.f(view);
            int size = arrayListF.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    appBarLayout = null;
                    break;
                }
                View view2 = (View) arrayListF.get(i2);
                if (view2 instanceof AppBarLayout) {
                    appBarLayout = (AppBarLayout) view2;
                    break;
                }
                i2++;
            }
            if (appBarLayout != null) {
                Rect rect2 = new Rect(rect);
                rect2.offset(view.getLeft(), view.getTop());
                int width = coordinatorLayout.getWidth();
                int height = coordinatorLayout.getHeight();
                Rect rect3 = this.Z;
                rect3.set(0, 0, width, height);
                if (!rect3.contains(rect2)) {
                    appBarLayout.j0 = (z2 ? 0 : 4) | 10;
                    appBarLayout.requestLayout();
                    return true;
                }
            }
            return false;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(0);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.f19061A);
            this.g0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static LayoutParams c(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            LayoutParams layoutParams2 = new LayoutParams((LinearLayout.LayoutParams) layoutParams);
            layoutParams2.f19096a = 1;
            return layoutParams2;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            LayoutParams layoutParams3 = new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
            layoutParams3.f19096a = 1;
            return layoutParams3;
        }
        LayoutParams layoutParams4 = new LayoutParams(layoutParams);
        layoutParams4.f19096a = 1;
        return layoutParams4;
    }

    public final void a(OnOffsetChangedListener onOffsetChangedListener) {
        throw null;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        LayoutParams layoutParams = new LayoutParams(context, attributeSet);
        layoutParams.f19096a = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.f19066a);
        layoutParams.f19096a = typedArrayObtainStyledAttributes.getInt(1, 0);
        layoutParams.f19097b = typedArrayObtainStyledAttributes.getInt(0, 0) != 1 ? null : new CompressChildScrollEffect();
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            layoutParams.f19098c = AnimationUtils.loadInterpolator(context, typedArrayObtainStyledAttributes.getResourceId(2, 0));
        }
        typedArrayObtainStyledAttributes.recycle();
        return layoutParams;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public final void d() {
        BaseBehavior.SavedState savedStateM = (this.f0 == -1 || this.j0 != 0) ? null : this.t0.M(AbsSavedState.f4579Y, this);
        this.f0 = -1;
        this.g0 = -1;
        this.h0 = -1;
        if (savedStateM != null) {
            Behavior behavior = this.t0;
            if (behavior.n0 != null) {
                return;
            }
            behavior.n0 = savedStateM;
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.s0 == null || getTopInset() <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(0.0f, -this.e0);
        this.s0.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.s0;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    public final void e(int i2) {
        this.e0 = i2;
        if (!willNotDraw()) {
            WeakHashMap weakHashMap = ViewCompat.f4466a;
            postInvalidateOnAnimation();
        }
        throw null;
    }

    public final boolean f(boolean z2) {
        if (this.k0 || this.m0 == z2) {
            return false;
        }
        this.m0 = z2;
        refreshDrawableState();
        if (!(getBackground() instanceof MaterialShapeDrawable) || !this.n0) {
            return true;
        }
        ValueAnimator valueAnimator = this.q0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 0.0f);
        this.q0 = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(0L);
        this.q0.setInterpolator(null);
        this.q0.start();
        return true;
    }

    public final boolean g(View view) {
        int i2;
        if (this.p0 == null && (i2 = this.o0) != -1) {
            View viewFindViewById = view != null ? view.findViewById(i2) : null;
            if (viewFindViewById == null && (getParent() instanceof ViewGroup)) {
                viewFindViewById = ((ViewGroup) getParent()).findViewById(this.o0);
            }
            if (viewFindViewById != null) {
                this.p0 = new WeakReference(viewFindViewById);
            }
        }
        WeakReference weakReference = this.p0;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != null) {
            view = view2;
        }
        if (view != null) {
            return view.canScrollVertically(-1) || view.getScrollY() > 0;
        }
        return false;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        LayoutParams layoutParams = new LayoutParams(-1, -2);
        layoutParams.f19096a = 1;
        return layoutParams;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AttachedBehavior
    public CoordinatorLayout.Behavior<AppBarLayout> getBehavior() {
        Behavior behavior = new Behavior();
        this.t0 = behavior;
        return behavior;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0050  */
    /* JADX WARN: Code duplicated, block: B:23:0x0058  */
    public int getDownNestedPreScrollRange() {
        int iMin;
        int minimumHeight;
        int i2 = this.g0;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i4 = layoutParams.f19096a;
                if ((i4 & 5) != 5) {
                    if (i3 > 0) {
                        break;
                    }
                } else {
                    int i5 = ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                    if ((i4 & 8) != 0) {
                        WeakHashMap weakHashMap = ViewCompat.f4466a;
                        minimumHeight = childAt.getMinimumHeight();
                    } else {
                        if ((i4 & 2) != 0) {
                            WeakHashMap weakHashMap2 = ViewCompat.f4466a;
                            minimumHeight = measuredHeight - childAt.getMinimumHeight();
                        } else {
                            iMin = i5 + measuredHeight;
                        }
                        if (childCount == 0) {
                            WeakHashMap weakHashMap3 = ViewCompat.f4466a;
                            if (childAt.getFitsSystemWindows()) {
                                iMin = Math.min(iMin, measuredHeight - getTopInset());
                            }
                        }
                        i3 += iMin;
                    }
                    iMin = minimumHeight + i5;
                    if (childCount == 0) {
                        WeakHashMap weakHashMap4 = ViewCompat.f4466a;
                        if (childAt.getFitsSystemWindows()) {
                            iMin = Math.min(iMin, measuredHeight - getTopInset());
                        }
                    }
                    i3 += iMin;
                }
            }
        }
        int iMax = Math.max(0, i3);
        this.g0 = iMax;
        return iMax;
    }

    public int getDownNestedScrollRange() {
        int i2 = this.h0;
        if (i2 != -1) {
            return i2;
        }
        int childCount = getChildCount();
        int minimumHeight = 0;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredHeight = ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin + childAt.getMeasuredHeight();
                int i4 = layoutParams.f19096a;
                if ((i4 & 1) == 0) {
                    break;
                }
                minimumHeight += measuredHeight;
                if ((i4 & 2) != 0) {
                    WeakHashMap weakHashMap = ViewCompat.f4466a;
                    minimumHeight -= childAt.getMinimumHeight();
                    break;
                }
            }
        }
        int iMax = Math.max(0, minimumHeight);
        this.h0 = iMax;
        return iMax;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.o0;
    }

    public MaterialShapeDrawable getMaterialShapeBackground() {
        Drawable background = getBackground();
        if (background instanceof MaterialShapeDrawable) {
            return (MaterialShapeDrawable) background;
        }
        return null;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        WeakHashMap weakHashMap = ViewCompat.f4466a;
        int minimumHeight = getMinimumHeight();
        if (minimumHeight == 0) {
            int childCount = getChildCount();
            minimumHeight = childCount >= 1 ? getChildAt(childCount - 1).getMinimumHeight() : 0;
            if (minimumHeight == 0) {
                return getHeight() / 3;
            }
        }
        return (minimumHeight * 2) + topInset;
    }

    public int getPendingAction() {
        return this.j0;
    }

    public Drawable getStatusBarForeground() {
        return this.s0;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    public final int getTopInset() {
        return 0;
    }

    public final int getTotalScrollRange() {
        int i2 = this.f0;
        if (i2 != -1) {
            return i2;
        }
        int childCount = getChildCount();
        int minimumHeight = 0;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i4 = layoutParams.f19096a;
                if ((i4 & 1) == 0) {
                    break;
                }
                int topInset = measuredHeight + ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin + minimumHeight;
                if (i3 == 0) {
                    WeakHashMap weakHashMap = ViewCompat.f4466a;
                    if (childAt.getFitsSystemWindows()) {
                        topInset -= getTopInset();
                    }
                }
                minimumHeight = topInset;
                if ((i4 & 2) != 0) {
                    WeakHashMap weakHashMap2 = ViewCompat.f4466a;
                    minimumHeight -= childAt.getMinimumHeight();
                    break;
                }
            }
        }
        int iMax = Math.max(0, minimumHeight);
        this.f0 = iMax;
        return iMax;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.d(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i2) {
        if (this.r0 == null) {
            this.r0 = new int[4];
        }
        int[] iArr = this.r0;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i2 + iArr.length);
        boolean z2 = this.l0;
        iArr[0] = z2 ? com.charging.screenshow.battery.animations.themes.R.attr.state_liftable : -2130969784;
        iArr[1] = (z2 && this.m0) ? com.charging.screenshow.battery.animations.themes.R.attr.state_lifted : -2130969785;
        iArr[2] = z2 ? com.charging.screenshow.battery.animations.themes.R.attr.state_collapsible : -2130969780;
        iArr[3] = (z2 && this.m0) ? com.charging.screenshow.battery.animations.themes.R.attr.state_collapsed : -2130969779;
        return View.mergeDrawableStates(iArrOnCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WeakReference weakReference = this.p0;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.p0 = null;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        boolean z3 = true;
        super.onLayout(z2, i2, i3, i4, i5);
        WeakHashMap weakHashMap = ViewCompat.f4466a;
        if (getFitsSystemWindows() && getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8 && !childAt.getFitsSystemWindows()) {
                int topInset = getTopInset();
                for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                    getChildAt(childCount).offsetTopAndBottom(topInset);
                }
            }
        }
        d();
        this.i0 = false;
        int childCount2 = getChildCount();
        for (int i6 = 0; i6 < childCount2; i6++) {
            if (((LayoutParams) getChildAt(i6).getLayoutParams()).f19098c != null) {
                this.i0 = true;
                break;
            }
        }
        Drawable drawable = this.s0;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (this.k0) {
            return;
        }
        if (!this.n0) {
            int childCount3 = getChildCount();
            int i7 = 0;
            while (true) {
                if (i7 >= childCount3) {
                    z3 = false;
                    break;
                }
                int i8 = ((LayoutParams) getChildAt(i7).getLayoutParams()).f19096a;
                if ((i8 & 1) == 1 && (i8 & 10) != 0) {
                    break;
                } else {
                    i7++;
                }
            }
        }
        if (this.l0 != z3) {
            this.l0 = z3;
            refreshDrawableState();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        int mode = View.MeasureSpec.getMode(i3);
        if (mode != 1073741824) {
            WeakHashMap weakHashMap = ViewCompat.f4466a;
            if (getFitsSystemWindows() && getChildCount() > 0) {
                View childAt = getChildAt(0);
                if (childAt.getVisibility() != 8 && !childAt.getFitsSystemWindows()) {
                    int measuredHeight = getMeasuredHeight();
                    if (mode == Integer.MIN_VALUE) {
                        measuredHeight = MathUtils.b(getTopInset() + getMeasuredHeight(), 0, View.MeasureSpec.getSize(i3));
                    } else if (mode == 0) {
                        measuredHeight += getTopInset();
                    }
                    setMeasuredDimension(getMeasuredWidth(), measuredHeight);
                }
            }
        }
        d();
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        MaterialShapeUtils.b(this, f);
    }

    public void setExpanded(boolean z2) {
        WeakHashMap weakHashMap = ViewCompat.f4466a;
        this.j0 = (z2 ? 1 : 2) | (isLaidOut() ? 4 : 0) | 8;
        requestLayout();
    }

    public void setLiftOnScroll(boolean z2) {
        this.n0 = z2;
    }

    public void setLiftOnScrollTargetView(View view) {
        this.o0 = -1;
        if (view != null) {
            this.p0 = new WeakReference(view);
            return;
        }
        WeakReference weakReference = this.p0;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.p0 = null;
    }

    public void setLiftOnScrollTargetViewId(int i2) {
        this.o0 = i2;
        WeakReference weakReference = this.p0;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.p0 = null;
    }

    public void setLiftableOverrideEnabled(boolean z2) {
        this.k0 = z2;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i2) {
        if (i2 != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(i2);
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.s0;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.s0 = drawableMutate;
            if (drawableMutate instanceof MaterialShapeDrawable) {
                int i2 = ((MaterialShapeDrawable) drawableMutate).v0;
            } else {
                ColorStateList colorStateListD = DrawableUtils.d(drawableMutate);
                if (colorStateListD != null) {
                    colorStateListD.getDefaultColor();
                }
            }
            Drawable drawable3 = this.s0;
            boolean z2 = false;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.s0.setState(getDrawableState());
                }
                Drawable drawable4 = this.s0;
                WeakHashMap weakHashMap = ViewCompat.f4466a;
                DrawableCompat.h(drawable4, getLayoutDirection());
                this.s0.setVisible(getVisibility() == 0, false);
                this.s0.setCallback(this);
            }
            if (this.s0 != null && getTopInset() > 0) {
                z2 = true;
            }
            setWillNotDraw(!z2);
            WeakHashMap weakHashMap2 = ViewCompat.f4466a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarForegroundColor(int i2) {
        setStatusBarForeground(new ColorDrawable(i2));
    }

    public void setStatusBarForegroundResource(int i2) {
        setStatusBarForeground(AppCompatResources.a(getContext(), i2));
    }

    @Deprecated
    public void setTargetElevation(float f) {
        int integer = getResources().getInteger(com.charging.screenshow.battery.animations.themes.R.integer.app_bar_elevation_anim_duration);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j = integer;
        stateListAnimator.addState(new int[]{android.R.attr.state_enabled, com.charging.screenshow.battery.animations.themes.R.attr.state_liftable, -2130969785}, ObjectAnimator.ofFloat(this, "elevation", 0.0f).setDuration(j));
        stateListAnimator.addState(new int[]{android.R.attr.state_enabled}, ObjectAnimator.ofFloat(this, "elevation", f).setDuration(j));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(this, "elevation", 0.0f).setDuration(0L));
        setStateListAnimator(stateListAnimator);
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        boolean z2 = i2 == 0;
        Drawable drawable = this.s0;
        if (drawable != null) {
            drawable.setVisible(z2, false);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.s0;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return c(layoutParams);
    }

    public static class BaseBehavior<T extends AppBarLayout> extends HeaderBehavior<T> {
        public int k0;
        public int l0;
        public ValueAnimator m0;
        public SavedState n0;
        public WeakReference o0;

        /* JADX INFO: renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$2, reason: invalid class name */
        class AnonymousClass2 extends AccessibilityDelegateCompat {
            public final /* synthetic */ AppBarLayout d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ CoordinatorLayout f19093e;
            public final /* synthetic */ BaseBehavior f;

            public AnonymousClass2(CoordinatorLayout coordinatorLayout, BaseBehavior baseBehavior, AppBarLayout appBarLayout) {
                this.f = baseBehavior;
                this.d = appBarLayout;
                this.f19093e = coordinatorLayout;
            }

            @Override // androidx.core.view.AccessibilityDelegateCompat
            public final void d(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                BaseBehavior baseBehavior;
                View viewI;
                this.f4417a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.f4534a);
                accessibilityNodeInfoCompat.j(ScrollView.class.getName());
                AppBarLayout appBarLayout = this.d;
                if (appBarLayout.getTotalScrollRange() == 0 || (viewI = BaseBehavior.I((baseBehavior = this.f), this.f19093e)) == null) {
                    return;
                }
                int childCount = appBarLayout.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    if (((LayoutParams) appBarLayout.getChildAt(i2).getLayoutParams()).f19096a != 0) {
                        if (baseBehavior.z() != (-appBarLayout.getTotalScrollRange())) {
                            accessibilityNodeInfoCompat.b(AccessibilityNodeInfoCompat.AccessibilityActionCompat.f4537h);
                            accessibilityNodeInfoCompat.o(true);
                        }
                        if (baseBehavior.z() != 0) {
                            if (!viewI.canScrollVertically(-1)) {
                                accessibilityNodeInfoCompat.b(AccessibilityNodeInfoCompat.AccessibilityActionCompat.f4538i);
                                accessibilityNodeInfoCompat.o(true);
                                return;
                            } else {
                                if ((-appBarLayout.getDownNestedPreScrollRange()) != 0) {
                                    accessibilityNodeInfoCompat.b(AccessibilityNodeInfoCompat.AccessibilityActionCompat.f4538i);
                                    accessibilityNodeInfoCompat.o(true);
                                    return;
                                }
                                return;
                            }
                        }
                        return;
                    }
                }
            }

            @Override // androidx.core.view.AccessibilityDelegateCompat
            public final boolean g(View view, int i2, Bundle bundle) {
                AppBarLayout appBarLayout = this.d;
                if (i2 == 4096) {
                    appBarLayout.setExpanded(false);
                    return true;
                }
                if (i2 != 8192) {
                    return super.g(view, i2, bundle);
                }
                BaseBehavior baseBehavior = this.f;
                if (baseBehavior.z() != 0) {
                    View viewI = BaseBehavior.I(baseBehavior, this.f19093e);
                    if (!viewI.canScrollVertically(-1)) {
                        appBarLayout.setExpanded(true);
                        return true;
                    }
                    int i3 = -appBarLayout.getDownNestedPreScrollRange();
                    if (i3 != 0) {
                        CoordinatorLayout coordinatorLayout = this.f19093e;
                        AppBarLayout appBarLayout2 = this.d;
                        this.f.L(coordinatorLayout, appBarLayout2, viewI, i3, new int[]{0, 0});
                        return true;
                    }
                }
                return false;
            }
        }

        public static abstract class BaseDragCallback<T extends AppBarLayout> {
        }

        public static class SavedState extends AbsSavedState {
            public static final Parcelable.Creator<SavedState> CREATOR = new AnonymousClass1();
            public boolean Z;
            public boolean e0;
            public int f0;
            public float g0;
            public boolean h0;

            /* JADX INFO: renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$SavedState$1, reason: invalid class name */
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
                this.Z = parcel.readByte() != 0;
                this.e0 = parcel.readByte() != 0;
                this.f0 = parcel.readInt();
                this.g0 = parcel.readFloat();
                this.h0 = parcel.readByte() != 0;
            }

            @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i2) {
                super.writeToParcel(parcel, i2);
                parcel.writeByte(this.Z ? (byte) 1 : (byte) 0);
                parcel.writeByte(this.e0 ? (byte) 1 : (byte) 0);
                parcel.writeInt(this.f0);
                parcel.writeFloat(this.g0);
                parcel.writeByte(this.h0 ? (byte) 1 : (byte) 0);
            }
        }

        public BaseBehavior() {
            this.g0 = -1;
            this.i0 = -1;
        }

        public static View I(BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout) {
            baseBehavior.getClass();
            int childCount = coordinatorLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = coordinatorLayout.getChildAt(i2);
                if (((CoordinatorLayout.LayoutParams) childAt.getLayoutParams()).f4146a instanceof ScrollingViewBehavior) {
                    return childAt;
                }
            }
            return null;
        }

        public static View K(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = coordinatorLayout.getChildAt(i2);
                if ((childAt instanceof NestedScrollingChild) || (childAt instanceof AbsListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        /* JADX WARN: Code duplicated, block: B:26:0x005c  */
        public static void O(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i2, int i3, boolean z2) {
            View childAt;
            boolean zG;
            int iAbs = Math.abs(i2);
            int childCount = appBarLayout.getChildCount();
            int i4 = 0;
            while (true) {
                if (i4 >= childCount) {
                    childAt = null;
                    break;
                }
                childAt = appBarLayout.getChildAt(i4);
                if (iAbs >= childAt.getTop() && iAbs <= childAt.getBottom()) {
                    break;
                } else {
                    i4++;
                }
            }
            if (childAt != null) {
                int i5 = ((LayoutParams) childAt.getLayoutParams()).f19096a;
                if ((i5 & 1) != 0) {
                    WeakHashMap weakHashMap = ViewCompat.f4466a;
                    int minimumHeight = childAt.getMinimumHeight();
                    if (i3 <= 0 || (i5 & 12) == 0 ? (i5 & 2) == 0 || (-i2) < (childAt.getBottom() - minimumHeight) - appBarLayout.getTopInset() : (-i2) < (childAt.getBottom() - minimumHeight) - appBarLayout.getTopInset()) {
                        zG = false;
                    } else {
                        zG = true;
                    }
                } else {
                    zG = false;
                }
            } else {
                zG = false;
            }
            if (appBarLayout.n0) {
                zG = appBarLayout.g(K(coordinatorLayout));
            }
            boolean zF = appBarLayout.f(zG);
            if (!z2) {
                if (zF) {
                    List list = (List) coordinatorLayout.f0.f4156b.get(appBarLayout);
                    ArrayList arrayList = coordinatorLayout.h0;
                    arrayList.clear();
                    if (list != null) {
                        arrayList.addAll(list);
                    }
                    int size = arrayList.size();
                    for (int i6 = 0; i6 < size; i6++) {
                        CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) ((View) arrayList.get(i6)).getLayoutParams()).f4146a;
                        if (behavior instanceof ScrollingViewBehavior) {
                            if (((ScrollingViewBehavior) behavior).g0 == 0) {
                                return;
                            }
                        }
                    }
                    return;
                }
                return;
            }
            if (appBarLayout.getBackground() != null) {
                appBarLayout.getBackground().jumpToCurrentState();
            }
            if (appBarLayout.getForeground() != null) {
                appBarLayout.getForeground().jumpToCurrentState();
            }
            if (appBarLayout.getStateListAnimator() != null) {
                appBarLayout.getStateListAnimator().jumpToCurrentState();
            }
        }

        @Override // com.google.android.material.appbar.HeaderBehavior
        public final boolean C(View view) {
            WeakReference weakReference = this.o0;
            if (weakReference == null) {
                return true;
            }
            View view2 = (View) weakReference.get();
            return (view2 == null || !view2.isShown() || view2.canScrollVertically(-1)) ? false : true;
        }

        @Override // com.google.android.material.appbar.HeaderBehavior
        public final int D(View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            return appBarLayout.getTopInset() + (-appBarLayout.getDownNestedScrollRange());
        }

        @Override // com.google.android.material.appbar.HeaderBehavior
        public final int E(View view) {
            return ((AppBarLayout) view).getTotalScrollRange();
        }

        @Override // com.google.android.material.appbar.HeaderBehavior
        public final void F(CoordinatorLayout coordinatorLayout, View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            N(coordinatorLayout, appBarLayout);
            if (appBarLayout.n0) {
                appBarLayout.f(appBarLayout.g(K(coordinatorLayout)));
            }
        }

        @Override // com.google.android.material.appbar.HeaderBehavior
        public final int G(CoordinatorLayout coordinatorLayout, View view, int i2, int i3, int i4) {
            int top2;
            List list;
            int topInset;
            int i5 = 1;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int iZ = z();
            int i6 = 0;
            if (i3 == 0 || iZ < i3 || iZ > i4) {
                this.k0 = 0;
            } else {
                int iB = MathUtils.b(i2, i3, i4);
                if (iZ != iB) {
                    if (!appBarLayout.i0) {
                        top2 = iB;
                        break;
                    }
                    int iAbs = Math.abs(iB);
                    int childCount = appBarLayout.getChildCount();
                    int i7 = 0;
                    while (true) {
                        if (i7 < childCount) {
                            View childAt = appBarLayout.getChildAt(i7);
                            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                            Interpolator interpolator = layoutParams.f19098c;
                            if (iAbs < childAt.getTop() || iAbs > childAt.getBottom()) {
                                i7++;
                            } else if (interpolator != null) {
                                int i8 = layoutParams.f19096a;
                                if ((i8 & 1) != 0) {
                                    topInset = childAt.getHeight() + ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                                    if ((i8 & 2) != 0) {
                                        WeakHashMap weakHashMap = ViewCompat.f4466a;
                                        topInset -= childAt.getMinimumHeight();
                                    }
                                } else {
                                    topInset = 0;
                                }
                                WeakHashMap weakHashMap2 = ViewCompat.f4466a;
                                if (childAt.getFitsSystemWindows()) {
                                    topInset -= appBarLayout.getTopInset();
                                }
                                if (topInset > 0) {
                                    float f = topInset;
                                    top2 = (childAt.getTop() + Math.round(interpolator.getInterpolation((iAbs - childAt.getTop()) / f) * f)) * Integer.signum(iB);
                                    break;
                                }
                            }
                        }
                        top2 = iB;
                        break;
                    }
                    boolean zB = B(top2);
                    int i9 = iZ - iB;
                    this.k0 = iB - top2;
                    if (zB) {
                        int i10 = 0;
                        while (i10 < appBarLayout.getChildCount()) {
                            LayoutParams layoutParams2 = (LayoutParams) appBarLayout.getChildAt(i10).getLayoutParams();
                            CompressChildScrollEffect compressChildScrollEffect = layoutParams2.f19097b;
                            if (compressChildScrollEffect != null && (layoutParams2.f19096a & i5) != 0) {
                                View childAt2 = appBarLayout.getChildAt(i10);
                                float fY = y();
                                Rect rect = compressChildScrollEffect.f19094a;
                                childAt2.getDrawingRect(rect);
                                appBarLayout.offsetDescendantRectToMyCoords(childAt2, rect);
                                rect.offset(0, -appBarLayout.getTopInset());
                                float fAbs = rect.top - Math.abs(fY);
                                if (fAbs <= 0.0f) {
                                    float fA = 1.0f - MathUtils.a(Math.abs(fAbs / rect.height()), 0.0f, 1.0f);
                                    float fHeight = (-fAbs) - ((rect.height() * 0.3f) * (1.0f - (fA * fA)));
                                    childAt2.setTranslationY(fHeight);
                                    Rect rect2 = compressChildScrollEffect.f19095b;
                                    childAt2.getDrawingRect(rect2);
                                    rect2.offset(0, (int) (-fHeight));
                                    if (fHeight >= rect2.height()) {
                                        childAt2.setVisibility(4);
                                    } else {
                                        childAt2.setVisibility(0);
                                    }
                                    WeakHashMap weakHashMap3 = ViewCompat.f4466a;
                                    childAt2.setClipBounds(rect2);
                                } else {
                                    WeakHashMap weakHashMap4 = ViewCompat.f4466a;
                                    childAt2.setClipBounds(null);
                                    childAt2.setTranslationY(0.0f);
                                    childAt2.setVisibility(0);
                                }
                            }
                            i10++;
                            i5 = i5;
                        }
                    }
                    int i11 = i5;
                    if (!zB && appBarLayout.i0 && (list = (List) coordinatorLayout.f0.f4156b.get(appBarLayout)) != null && !list.isEmpty()) {
                        for (int i12 = 0; i12 < list.size(); i12++) {
                            View view2 = (View) list.get(i12);
                            CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) view2.getLayoutParams()).f4146a;
                            if (behavior != null) {
                                behavior.j(coordinatorLayout, view2, appBarLayout);
                            }
                        }
                    }
                    appBarLayout.e(y());
                    O(coordinatorLayout, appBarLayout, iB, iB < iZ ? -1 : i11, false);
                    i6 = i9;
                }
            }
            if (ViewCompat.f(coordinatorLayout) != null) {
                return i6;
            }
            ViewCompat.z(coordinatorLayout, new AnonymousClass2(coordinatorLayout, this, appBarLayout));
            return i6;
        }

        public final void J(final CoordinatorLayout coordinatorLayout, final AppBarLayout appBarLayout, int i2) {
            int iAbs = Math.abs(z() - i2);
            float fAbs = Math.abs(0.0f);
            int iRound = fAbs > 0.0f ? Math.round((iAbs / fAbs) * 1000.0f) * 3 : (int) (((iAbs / appBarLayout.getHeight()) + 1.0f) * 150.0f);
            int iZ = z();
            if (iZ == i2) {
                ValueAnimator valueAnimator = this.m0;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.m0.cancel();
                return;
            }
            ValueAnimator valueAnimator2 = this.m0;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.m0 = valueAnimator3;
                valueAnimator3.setInterpolator(com.google.android.material.animation.AnimationUtils.f19081e);
                this.m0.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.appbar.AppBarLayout.BaseBehavior.1
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator4) {
                        int iIntValue = ((Integer) valueAnimator4.getAnimatedValue()).intValue();
                        this.H(coordinatorLayout, appBarLayout, iIntValue);
                    }
                });
            } else {
                valueAnimator2.cancel();
            }
            this.m0.setDuration(Math.min(iRound, 600));
            this.m0.setIntValues(iZ, i2);
            this.m0.start();
        }

        /* JADX WARN: Code duplicated, block: B:9:0x002b  */
        public final void L(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i2, int[] iArr) {
            AppBarLayout appBarLayout2;
            int i3;
            int downNestedPreScrollRange;
            if (i2 == 0) {
                appBarLayout2 = appBarLayout;
            } else {
                if (i2 < 0) {
                    i3 = -appBarLayout.getTotalScrollRange();
                    downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange() + i3;
                } else {
                    i3 = -appBarLayout.getUpNestedPreScrollRange();
                    downNestedPreScrollRange = 0;
                }
                int i4 = i3;
                int i5 = downNestedPreScrollRange;
                if (i4 != i5) {
                    appBarLayout2 = appBarLayout;
                    iArr[1] = G(coordinatorLayout, appBarLayout2, z() - i2, i4, i5);
                } else {
                    appBarLayout2 = appBarLayout;
                }
            }
            if (appBarLayout2.n0) {
                appBarLayout2.f(appBarLayout2.g(view));
            }
        }

        public final SavedState M(Parcelable parcelable, AppBarLayout appBarLayout) {
            int iY = y();
            int childCount = appBarLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = appBarLayout.getChildAt(i2);
                int bottom = childAt.getBottom() + iY;
                if (childAt.getTop() + iY <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = AbsSavedState.f4579Y;
                    }
                    SavedState savedState = new SavedState(parcelable);
                    boolean z2 = iY == 0;
                    savedState.e0 = z2;
                    savedState.Z = !z2 && (-iY) >= appBarLayout.getTotalScrollRange();
                    savedState.f0 = i2;
                    WeakHashMap weakHashMap = ViewCompat.f4466a;
                    savedState.h0 = bottom == appBarLayout.getTopInset() + childAt.getMinimumHeight();
                    savedState.g0 = bottom / childAt.getHeight();
                    return savedState;
                }
            }
            return null;
        }

        public final void N(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            int paddingTop = appBarLayout.getPaddingTop() + appBarLayout.getTopInset();
            int iZ = z() - paddingTop;
            int childCount = appBarLayout.getChildCount();
            int i2 = 0;
            while (true) {
                if (i2 >= childCount) {
                    i2 = -1;
                    break;
                }
                View childAt = appBarLayout.getChildAt(i2);
                int top2 = childAt.getTop();
                int bottom = childAt.getBottom();
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if ((layoutParams.f19096a & 32) == 32) {
                    top2 -= ((LinearLayout.LayoutParams) layoutParams).topMargin;
                    bottom += ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                }
                int i3 = -iZ;
                if (top2 <= i3 && bottom >= i3) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 >= 0) {
                View childAt2 = appBarLayout.getChildAt(i2);
                LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
                int i4 = layoutParams2.f19096a;
                if ((i4 & 17) == 17) {
                    int topInset = -childAt2.getTop();
                    int minimumHeight = -childAt2.getBottom();
                    if (i2 == 0) {
                        WeakHashMap weakHashMap = ViewCompat.f4466a;
                        if (appBarLayout.getFitsSystemWindows() && childAt2.getFitsSystemWindows()) {
                            topInset -= appBarLayout.getTopInset();
                        }
                    }
                    if ((i4 & 2) == 2) {
                        WeakHashMap weakHashMap2 = ViewCompat.f4466a;
                        minimumHeight += childAt2.getMinimumHeight();
                    } else if ((i4 & 5) == 5) {
                        WeakHashMap weakHashMap3 = ViewCompat.f4466a;
                        int minimumHeight2 = childAt2.getMinimumHeight() + minimumHeight;
                        if (iZ < minimumHeight2) {
                            topInset = minimumHeight2;
                        } else {
                            minimumHeight = minimumHeight2;
                        }
                    }
                    if ((i4 & 32) == 32) {
                        topInset += ((LinearLayout.LayoutParams) layoutParams2).topMargin;
                        minimumHeight -= ((LinearLayout.LayoutParams) layoutParams2).bottomMargin;
                    }
                    if (iZ < (minimumHeight + topInset) / 2) {
                        topInset = minimumHeight;
                    }
                    J(coordinatorLayout, appBarLayout, MathUtils.b(topInset + paddingTop, -appBarLayout.getTotalScrollRange(), 0));
                }
            }
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean n(CoordinatorLayout coordinatorLayout, View view, int i2) {
            int iRound;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            super.n(coordinatorLayout, appBarLayout, i2);
            int pendingAction = appBarLayout.getPendingAction();
            SavedState savedState = this.n0;
            if (savedState == null || (pendingAction & 8) != 0) {
                if (pendingAction != 0) {
                    boolean z2 = (pendingAction & 4) != 0;
                    if ((pendingAction & 2) != 0) {
                        int i3 = -appBarLayout.getUpNestedPreScrollRange();
                        if (z2) {
                            J(coordinatorLayout, appBarLayout, i3);
                        } else {
                            H(coordinatorLayout, appBarLayout, i3);
                        }
                    } else if ((pendingAction & 1) != 0) {
                        if (z2) {
                            J(coordinatorLayout, appBarLayout, 0);
                        } else {
                            H(coordinatorLayout, appBarLayout, 0);
                        }
                    }
                }
            } else if (savedState.Z) {
                H(coordinatorLayout, appBarLayout, -appBarLayout.getTotalScrollRange());
            } else if (savedState.e0) {
                H(coordinatorLayout, appBarLayout, 0);
            } else {
                View childAt = appBarLayout.getChildAt(savedState.f0);
                int i4 = -childAt.getBottom();
                if (this.n0.h0) {
                    WeakHashMap weakHashMap = ViewCompat.f4466a;
                    iRound = appBarLayout.getTopInset() + childAt.getMinimumHeight() + i4;
                } else {
                    iRound = Math.round(childAt.getHeight() * this.n0.g0) + i4;
                }
                H(coordinatorLayout, appBarLayout, iRound);
            }
            appBarLayout.j0 = 0;
            this.n0 = null;
            B(MathUtils.b(y(), -appBarLayout.getTotalScrollRange(), 0));
            O(coordinatorLayout, appBarLayout, y(), 0, true);
            appBarLayout.e(y());
            if (ViewCompat.f(coordinatorLayout) != null) {
                return true;
            }
            ViewCompat.z(coordinatorLayout, new AnonymousClass2(coordinatorLayout, this, appBarLayout));
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean o(CoordinatorLayout coordinatorLayout, View view, int i2, int i3, int i4) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.LayoutParams) appBarLayout.getLayoutParams())).height != -2) {
                return false;
            }
            coordinatorLayout.t(i2, i3, View.MeasureSpec.makeMeasureSpec(0, 0), appBarLayout);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final /* bridge */ /* synthetic */ void q(CoordinatorLayout coordinatorLayout, View view, View view2, int i2, int i3, int[] iArr, int i4) {
            L(coordinatorLayout, (AppBarLayout) view, view2, i3, iArr);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final void r(CoordinatorLayout coordinatorLayout, View view, int i2, int i3, int i4, int[] iArr) {
            CoordinatorLayout coordinatorLayout2;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (i4 < 0) {
                coordinatorLayout2 = coordinatorLayout;
                iArr[1] = G(coordinatorLayout2, appBarLayout, z() - i4, -appBarLayout.getDownNestedScrollRange(), 0);
            } else {
                coordinatorLayout2 = coordinatorLayout;
            }
            if (i4 == 0 && ViewCompat.f(coordinatorLayout2) == null) {
                ViewCompat.z(coordinatorLayout2, new AnonymousClass2(coordinatorLayout2, this, appBarLayout));
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final void t(View view, Parcelable parcelable) {
            if (parcelable instanceof SavedState) {
                this.n0 = (SavedState) parcelable;
            } else {
                this.n0 = null;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final Parcelable u(View view) {
            android.view.AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
            SavedState savedStateM = M(absSavedState, (AppBarLayout) view);
            return savedStateM == null ? absSavedState : savedStateM;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean v(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i2, int i3) {
            ValueAnimator valueAnimator;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            boolean z2 = (i2 & 2) != 0 && (appBarLayout.n0 || (appBarLayout.getTotalScrollRange() != 0 && coordinatorLayout.getHeight() - view2.getHeight() <= appBarLayout.getHeight()));
            if (z2 && (valueAnimator = this.m0) != null) {
                valueAnimator.cancel();
            }
            this.o0 = null;
            this.l0 = i3;
            return z2;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final void w(CoordinatorLayout coordinatorLayout, View view, View view2, int i2) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (this.l0 == 0 || i2 == 1) {
                N(coordinatorLayout, appBarLayout);
                if (appBarLayout.n0) {
                    appBarLayout.f(appBarLayout.g(view2));
                }
            }
            this.o0 = new WeakReference(view2);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public final int z() {
            return y() + this.k0;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(0);
            this.g0 = -1;
            this.i0 = -1;
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateDefaultLayoutParams() {
        LayoutParams layoutParams = new LayoutParams(-1, -2);
        layoutParams.f19096a = 1;
        return layoutParams;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return c(layoutParams);
    }
}
