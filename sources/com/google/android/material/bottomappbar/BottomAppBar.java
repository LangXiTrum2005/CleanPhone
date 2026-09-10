package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.customview.view.AbsSavedState;
import com.charging.screenshow.battery.animations.themes.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.animation.TransformationCallback;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.shape.MaterialShapeUtils;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes4.dex */
public class BottomAppBar extends Toolbar implements CoordinatorLayout.AttachedBehavior {
    public static final /* synthetic */ int j1 = 0;
    public Integer Y0;
    public AnimatorSet Z0;
    public AnimatorSet a1;
    public int b1;
    public int c1;
    public int d1;
    public int e1;
    public int f1;
    public boolean g1;
    public boolean h1;
    public Behavior i1;

    /* JADX INFO: renamed from: com.google.android.material.bottomappbar.BottomAppBar$1, reason: invalid class name */
    public class AnonymousClass1 extends AnimatorListenerAdapter {
        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.bottomappbar.BottomAppBar$2, reason: invalid class name */
    public class AnonymousClass2 implements TransformationCallback<FloatingActionButton> {
    }

    /* JADX INFO: renamed from: com.google.android.material.bottomappbar.BottomAppBar$3, reason: invalid class name */
    class AnonymousClass3 implements ViewUtils.OnApplyWindowInsetsListener {
        @Override // com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener
        public final WindowInsetsCompat a(View view, WindowInsetsCompat windowInsetsCompat, ViewUtils.RelativePadding relativePadding) {
            int i2 = BottomAppBar.j1;
            throw null;
        }
    }

    public interface AnimationListener {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface FabAlignmentMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface FabAnchorMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface FabAnimationMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface MenuAlignmentMode {
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new AnonymousClass1();
        public int Z;
        public boolean e0;

        /* JADX INFO: renamed from: com.google.android.material.bottomappbar.BottomAppBar$SavedState$1, reason: invalid class name */
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
            this.e0 = parcel.readInt() != 0;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.Z);
            parcel.writeInt(this.e0 ? 1 : 0);
        }
    }

    private ActionMenuView getActionMenuView() {
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getBottomInset() {
        throw null;
    }

    private int getFabAlignmentAnimationDuration() {
        return MotionUtils.c(getContext(), R.attr.motionDurationLong2, 300);
    }

    private float getFabTranslationX() {
        return D(this.b1);
    }

    private float getFabTranslationY() {
        if (this.d1 == 1) {
            return -getTopEdgeTreatment().Z;
        }
        View viewB = B();
        return viewB != null ? (-((getMeasuredHeight() + getBottomInset()) - viewB.getMeasuredHeight())) / 2 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getLeftInset() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getRightInset() {
        throw null;
    }

    private BottomAppBarTopEdgeTreatment getTopEdgeTreatment() {
        throw null;
    }

    public final View B() {
        if (!(getParent() instanceof CoordinatorLayout)) {
            return null;
        }
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) getParent();
        List list = (List) coordinatorLayout.f0.f4156b.get(this);
        ArrayList<View> arrayList = coordinatorLayout.h0;
        arrayList.clear();
        if (list != null) {
            arrayList.addAll(list);
        }
        for (View view : arrayList) {
            if ((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton)) {
                return view;
            }
        }
        return null;
    }

    public final int C(ActionMenuView actionMenuView, int i2, boolean z2) {
        if (this.f1 != 1 && (i2 != 1 || !z2)) {
            return 0;
        }
        boolean zE = ViewUtils.e(this);
        int measuredWidth = zE ? getMeasuredWidth() : 0;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            if ((childAt.getLayoutParams() instanceof Toolbar.LayoutParams) && (((Toolbar.LayoutParams) childAt.getLayoutParams()).f3289a & 8388615) == 8388611) {
                measuredWidth = zE ? Math.min(measuredWidth, childAt.getLeft()) : Math.max(measuredWidth, childAt.getRight());
            }
        }
        if (zE) {
            actionMenuView.getRight();
        } else {
            actionMenuView.getLeft();
        }
        throw null;
    }

    public final float D(int i2) {
        ViewUtils.e(this);
        if (i2 != 1) {
            return 0.0f;
        }
        B();
        throw null;
    }

    public final boolean E() {
        View viewB = B();
        FloatingActionButton floatingActionButton = viewB instanceof FloatingActionButton ? (FloatingActionButton) viewB : null;
        return floatingActionButton != null && floatingActionButton.h();
    }

    public final void F() {
        BottomAppBarTopEdgeTreatment topEdgeTreatment = getTopEdgeTreatment();
        getFabTranslationX();
        topEdgeTreatment.getClass();
        if (this.h1 && E()) {
            int i2 = this.d1;
        }
        throw null;
    }

    public final void G(final ActionMenuView actionMenuView, final int i2, final boolean z2, boolean z3) {
        Runnable runnable = new Runnable() { // from class: com.google.android.material.bottomappbar.BottomAppBar.8
            @Override // java.lang.Runnable
            public final void run() {
                ActionMenuView actionMenuView2 = actionMenuView;
                BottomAppBar.this.C(actionMenuView2, i2, z2);
                actionMenuView2.setTranslationX(0);
            }
        };
        if (z3) {
            actionMenuView.post(runnable);
        } else {
            runnable.run();
        }
    }

    public ColorStateList getBackgroundTint() {
        throw null;
    }

    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().Z;
    }

    public int getFabAlignmentMode() {
        return this.b1;
    }

    public int getFabAlignmentModeEndMargin() {
        return this.e1;
    }

    public int getFabAnchorMode() {
        return this.d1;
    }

    public int getFabAnimationMode() {
        return this.c1;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().f19125Y;
    }

    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().X;
    }

    public boolean getHideOnScroll() {
        return this.g1;
    }

    public int getMenuAlignmentMode() {
        return this.f1;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.c(this, null);
        throw null;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        if (z2) {
            AnimatorSet animatorSet = this.a1;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = this.Z0;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            F();
            throw null;
        }
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView == null || this.a1 != null) {
            return;
        }
        actionMenuView.setAlpha(1.0f);
        if (E()) {
            G(actionMenuView, this.b1, this.h1, false);
        } else {
            G(actionMenuView, 0, false, false);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.X);
        this.b1 = savedState.Z;
        this.h1 = savedState.e0;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.Z = this.b1;
        savedState.e0 = this.h1;
        return savedState;
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
        DrawableCompat.j(null, colorStateList);
    }

    public void setCradleVerticalOffset(float f) {
        if (f == getCradleVerticalOffset()) {
            return;
        }
        BottomAppBarTopEdgeTreatment topEdgeTreatment = getTopEdgeTreatment();
        if (f >= 0.0f) {
            topEdgeTreatment.Z = f;
            throw null;
        }
        topEdgeTreatment.getClass();
        throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
    }

    @Override // android.view.View
    public void setElevation(float f) {
        throw null;
    }

    public void setFabAlignmentMode(final int i2) {
        final int i3;
        final boolean z2 = this.h1;
        WeakHashMap weakHashMap = ViewCompat.f4466a;
        if (isLaidOut()) {
            AnimatorSet animatorSet = this.a1;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            ArrayList arrayList = new ArrayList();
            if (E()) {
                i3 = i2;
            } else {
                z2 = false;
                i3 = 0;
            }
            final ActionMenuView actionMenuView = getActionMenuView();
            if (actionMenuView != null) {
                float fabAlignmentAnimationDuration = getFabAlignmentAnimationDuration();
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", 1.0f);
                objectAnimatorOfFloat.setDuration((long) (0.8f * fabAlignmentAnimationDuration));
                float translationX = actionMenuView.getTranslationX();
                C(actionMenuView, i3, z2);
                if (Math.abs(translationX - 0) > 1.0f) {
                    ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(actionMenuView, "alpha", 0.0f);
                    objectAnimatorOfFloat2.setDuration((long) (fabAlignmentAnimationDuration * 0.2f));
                    objectAnimatorOfFloat2.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.bottomappbar.BottomAppBar.7
                        public boolean X;

                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public final void onAnimationCancel(Animator animator) {
                            this.X = true;
                        }

                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public final void onAnimationEnd(Animator animator) {
                            if (this.X) {
                                return;
                            }
                            BottomAppBar bottomAppBar = BottomAppBar.this;
                            bottomAppBar.getClass();
                            bottomAppBar.G(actionMenuView, i3, z2, false);
                        }
                    });
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    animatorSet2.playSequentially(objectAnimatorOfFloat2, objectAnimatorOfFloat);
                    arrayList.add(animatorSet2);
                } else if (actionMenuView.getAlpha() < 1.0f) {
                    arrayList.add(objectAnimatorOfFloat);
                }
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.playTogether(arrayList);
            this.a1 = animatorSet3;
            animatorSet3.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.bottomappbar.BottomAppBar.6
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    int i4 = BottomAppBar.j1;
                    BottomAppBar bottomAppBar = BottomAppBar.this;
                    bottomAppBar.getClass();
                    bottomAppBar.a1 = null;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                    int i4 = BottomAppBar.j1;
                    BottomAppBar.this.getClass();
                }
            });
            this.a1.start();
        }
        if (this.b1 != i2 && isLaidOut()) {
            AnimatorSet animatorSet4 = this.Z0;
            if (animatorSet4 != null) {
                animatorSet4.cancel();
            }
            ArrayList arrayList2 = new ArrayList();
            if (this.c1 == 1) {
                View viewB = B();
                ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(viewB instanceof FloatingActionButton ? (FloatingActionButton) viewB : null, "translationX", D(i2));
                objectAnimatorOfFloat3.setDuration(getFabAlignmentAnimationDuration());
                arrayList2.add(objectAnimatorOfFloat3);
            } else {
                View viewB2 = B();
                FloatingActionButton floatingActionButton = viewB2 instanceof FloatingActionButton ? (FloatingActionButton) viewB2 : null;
                if (floatingActionButton != null && !floatingActionButton.g()) {
                    floatingActionButton.f(new FloatingActionButton.OnVisibilityChangedListener() { // from class: com.google.android.material.bottomappbar.BottomAppBar.5
                        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.OnVisibilityChangedListener
                        public final void a(FloatingActionButton floatingActionButton2) {
                            int i4 = BottomAppBar.j1;
                            floatingActionButton2.setTranslationX(BottomAppBar.this.D(i2));
                            floatingActionButton2.j(new FloatingActionButton.OnVisibilityChangedListener() { // from class: com.google.android.material.bottomappbar.BottomAppBar.5.1
                                @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.OnVisibilityChangedListener
                                public final void b() {
                                    BottomAppBar bottomAppBar = BottomAppBar.this;
                                    int i5 = BottomAppBar.j1;
                                }
                            }, true);
                        }
                    }, true);
                }
            }
            AnimatorSet animatorSet5 = new AnimatorSet();
            animatorSet5.playTogether(arrayList2);
            animatorSet5.setInterpolator(MotionUtils.d(getContext(), R.attr.motionEasingEmphasizedInterpolator, AnimationUtils.f19078a));
            this.Z0 = animatorSet5;
            animatorSet5.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.bottomappbar.BottomAppBar.4
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    BottomAppBar bottomAppBar = BottomAppBar.this;
                    int i4 = BottomAppBar.j1;
                    bottomAppBar.Z0 = null;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                    int i4 = BottomAppBar.j1;
                }
            });
            this.Z0.start();
        }
        this.b1 = i2;
    }

    public void setFabAlignmentModeEndMargin(int i2) {
        if (this.e1 == i2) {
            return;
        }
        this.e1 = i2;
        F();
        throw null;
    }

    public void setFabAnchorMode(int i2) {
        this.d1 = i2;
        F();
        throw null;
    }

    public void setFabAnimationMode(int i2) {
        this.c1 = i2;
    }

    public void setFabCornerSize(float f) {
        if (f == getTopEdgeTreatment().e0) {
            return;
        }
        getTopEdgeTreatment().e0 = f;
        throw null;
    }

    public void setFabCradleMargin(float f) {
        if (f == getFabCradleMargin()) {
            return;
        }
        getTopEdgeTreatment().f19125Y = f;
        throw null;
    }

    public void setFabCradleRoundedCornerRadius(float f) {
        if (f == getFabCradleRoundedCornerRadius()) {
            return;
        }
        getTopEdgeTreatment().X = f;
        throw null;
    }

    public void setHideOnScroll(boolean z2) {
        this.g1 = z2;
    }

    public void setMenuAlignmentMode(int i2) {
        if (this.f1 != i2) {
            this.f1 = i2;
            ActionMenuView actionMenuView = getActionMenuView();
            if (actionMenuView != null) {
                G(actionMenuView, this.b1, E(), false);
            }
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.Y0 != null) {
            drawable = drawable.mutate();
            DrawableCompat.i(drawable, this.Y0.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i2) {
        this.Y0 = Integer.valueOf(i2);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AttachedBehavior
    public Behavior getBehavior() {
        if (this.i1 == null) {
            this.i1 = new Behavior();
        }
        return this.i1;
    }

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {
        public final Rect j0;
        public WeakReference k0;
        public int l0;
        public final View.OnLayoutChangeListener m0;

        public Behavior() {
            this.m0 = new View.OnLayoutChangeListener() { // from class: com.google.android.material.bottomappbar.BottomAppBar.Behavior.1
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                    Behavior behavior = Behavior.this;
                    BottomAppBar bottomAppBar = (BottomAppBar) behavior.k0.get();
                    if (bottomAppBar == null || !((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton))) {
                        view.removeOnLayoutChangeListener(this);
                        return;
                    }
                    int height = view.getHeight();
                    if (view instanceof FloatingActionButton) {
                        FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                        behavior.j0.set(0, 0, floatingActionButton.getMeasuredWidth(), floatingActionButton.getMeasuredHeight());
                        throw null;
                    }
                    CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) view.getLayoutParams();
                    if (behavior.l0 == 0) {
                        if (bottomAppBar.d1 == 1) {
                            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = bottomAppBar.getBottomInset() + (bottomAppBar.getResources().getDimensionPixelOffset(R.dimen.mtrl_bottomappbar_fab_bottom_margin) - ((view.getMeasuredHeight() - height) / 2));
                        }
                        ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = bottomAppBar.getLeftInset();
                        ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = bottomAppBar.getRightInset();
                        if (ViewUtils.e(view)) {
                            ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                        } else {
                            ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                        }
                    }
                    int i10 = BottomAppBar.j1;
                    bottomAppBar.F();
                    throw null;
                }
            };
            this.j0 = new Rect();
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean n(CoordinatorLayout coordinatorLayout, View view, int i2) {
            final BottomAppBar bottomAppBar = (BottomAppBar) view;
            this.k0 = new WeakReference(bottomAppBar);
            int i3 = BottomAppBar.j1;
            View viewB = bottomAppBar.B();
            if (viewB != null) {
                WeakHashMap weakHashMap = ViewCompat.f4466a;
                if (!viewB.isLaidOut()) {
                    CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) viewB.getLayoutParams();
                    layoutParams.d = 17;
                    int i4 = bottomAppBar.d1;
                    if (i4 == 1) {
                        layoutParams.d = 49;
                    }
                    if (i4 == 0) {
                        layoutParams.d |= 80;
                    }
                    this.l0 = ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.LayoutParams) viewB.getLayoutParams())).bottomMargin;
                    if (viewB instanceof FloatingActionButton) {
                        FloatingActionButton floatingActionButton = (FloatingActionButton) viewB;
                        if (floatingActionButton.getShowMotionSpec() == null) {
                            floatingActionButton.setShowMotionSpecResource(R.animator.mtrl_fab_show_motion_spec);
                        }
                        if (floatingActionButton.getHideMotionSpec() == null) {
                            floatingActionButton.setHideMotionSpecResource(R.animator.mtrl_fab_hide_motion_spec);
                        }
                        floatingActionButton.b();
                        floatingActionButton.c(new AnimatorListenerAdapter() { // from class: com.google.android.material.bottomappbar.BottomAppBar.9
                            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                            public final void onAnimationStart(Animator animator) {
                                BottomAppBar.this.getClass();
                                throw null;
                            }
                        });
                        floatingActionButton.d();
                    }
                    viewB.addOnLayoutChangeListener(this.m0);
                    bottomAppBar.F();
                    throw null;
                }
            }
            coordinatorLayout.s(i2, bottomAppBar);
            super.n(coordinatorLayout, bottomAppBar, i2);
            return false;
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean v(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i2, int i3) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            return bottomAppBar.getHideOnScroll() && super.v(coordinatorLayout, bottomAppBar, view2, view3, i2, i3);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.m0 = new View.OnLayoutChangeListener() { // from class: com.google.android.material.bottomappbar.BottomAppBar.Behavior.1
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                    Behavior behavior = Behavior.this;
                    BottomAppBar bottomAppBar = (BottomAppBar) behavior.k0.get();
                    if (bottomAppBar == null || !((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton))) {
                        view.removeOnLayoutChangeListener(this);
                        return;
                    }
                    int height = view.getHeight();
                    if (view instanceof FloatingActionButton) {
                        FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                        behavior.j0.set(0, 0, floatingActionButton.getMeasuredWidth(), floatingActionButton.getMeasuredHeight());
                        throw null;
                    }
                    CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) view.getLayoutParams();
                    if (behavior.l0 == 0) {
                        if (bottomAppBar.d1 == 1) {
                            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = bottomAppBar.getBottomInset() + (bottomAppBar.getResources().getDimensionPixelOffset(R.dimen.mtrl_bottomappbar_fab_bottom_margin) - ((view.getMeasuredHeight() - height) / 2));
                        }
                        ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = bottomAppBar.getLeftInset();
                        ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = bottomAppBar.getRightInset();
                        if (ViewUtils.e(view)) {
                            ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                        } else {
                            ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                        }
                    }
                    int i10 = BottomAppBar.j1;
                    bottomAppBar.F();
                    throw null;
                }
            };
            this.j0 = new Rect();
        }
    }
}
