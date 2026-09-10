package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.support.v4.media.a;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import com.google.android.material.R;
import com.google.android.material.animation.MotionSpec;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.internal.DescendantOffsetUtils;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes4.dex */
public class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.AttachedBehavior {
    public ColorStateList x0;

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$1, reason: invalid class name */
    class AnonymousClass1 implements Size {
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$2, reason: invalid class name */
    class AnonymousClass2 implements Size {
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$3, reason: invalid class name */
    class AnonymousClass3 implements Size {
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$4, reason: invalid class name */
    class AnonymousClass4 implements Size {
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$5, reason: invalid class name */
    class AnonymousClass5 extends AnimatorListenerAdapter {
        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            throw null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            throw null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$6, reason: invalid class name */
    public class AnonymousClass6 extends Property<View, Float> {
        @Override // android.util.Property
        public final Float get(View view) {
            return Float.valueOf(view.getLayoutParams().width);
        }

        @Override // android.util.Property
        public final void set(View view, Float f) {
            View view2 = view;
            view2.getLayoutParams().width = f.intValue();
            view2.requestLayout();
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$7, reason: invalid class name */
    public class AnonymousClass7 extends Property<View, Float> {
        @Override // android.util.Property
        public final Float get(View view) {
            return Float.valueOf(view.getLayoutParams().height);
        }

        @Override // android.util.Property
        public final void set(View view, Float f) {
            View view2 = view;
            view2.getLayoutParams().height = f.intValue();
            view2.requestLayout();
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$8, reason: invalid class name */
    public class AnonymousClass8 extends Property<View, Float> {
        @Override // android.util.Property
        public final Float get(View view) {
            WeakHashMap weakHashMap = ViewCompat.f4466a;
            return Float.valueOf(view.getPaddingStart());
        }

        @Override // android.util.Property
        public final void set(View view, Float f) {
            View view2 = view;
            int iIntValue = f.intValue();
            int paddingTop = view2.getPaddingTop();
            WeakHashMap weakHashMap = ViewCompat.f4466a;
            view2.setPaddingRelative(iIntValue, paddingTop, view2.getPaddingEnd(), view2.getPaddingBottom());
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$9, reason: invalid class name */
    public class AnonymousClass9 extends Property<View, Float> {
        @Override // android.util.Property
        public final Float get(View view) {
            WeakHashMap weakHashMap = ViewCompat.f4466a;
            return Float.valueOf(view.getPaddingEnd());
        }

        @Override // android.util.Property
        public final void set(View view, Float f) {
            View view2 = view;
            WeakHashMap weakHashMap = ViewCompat.f4466a;
            view2.setPaddingRelative(view2.getPaddingStart(), view2.getPaddingTop(), f.intValue(), view2.getPaddingBottom());
        }
    }

    public class ChangeSizeStrategy extends BaseMotionStrategy {
    }

    public class HideStrategy extends BaseMotionStrategy {
    }

    public static abstract class OnChangedCallback {
    }

    public class ShowStrategy extends BaseMotionStrategy {
    }

    public interface Size {
    }

    static {
        new AnonymousClass6(Float.class, "width");
        new AnonymousClass7(Float.class, "height");
        new AnonymousClass8(Float.class, "paddingStart");
        new AnonymousClass9(Float.class, "paddingEnd");
    }

    public static void e(ExtendedFloatingActionButton extendedFloatingActionButton, int i2) {
        if (i2 != 0 && i2 != 1 && i2 != 2 && i2 != 3) {
            throw new IllegalStateException(a.h(i2, "Unknown strategy type: "));
        }
        throw null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AttachedBehavior
    public CoordinatorLayout.Behavior<ExtendedFloatingActionButton> getBehavior() {
        return null;
    }

    public int getCollapsedPadding() {
        return (getCollapsedSize() - getIconSize()) / 2;
    }

    public int getCollapsedSize() {
        return 0;
    }

    public MotionSpec getExtendMotionSpec() {
        throw null;
    }

    public MotionSpec getHideMotionSpec() {
        throw null;
    }

    public MotionSpec getShowMotionSpec() {
        throw null;
    }

    public MotionSpec getShrinkMotionSpec() {
        throw null;
    }

    public void setAnimateShowBeforeLayout(boolean z2) {
    }

    public void setExtendMotionSpec(MotionSpec motionSpec) {
        throw null;
    }

    public void setExtendMotionSpecResource(int i2) {
        setExtendMotionSpec(MotionSpec.a(getContext(), i2));
    }

    public void setExtended(boolean z2) {
        if (z2) {
            throw null;
        }
    }

    public void setHideMotionSpec(MotionSpec motionSpec) {
        throw null;
    }

    public void setHideMotionSpecResource(int i2) {
        setHideMotionSpec(MotionSpec.a(getContext(), i2));
    }

    public void setShowMotionSpec(MotionSpec motionSpec) {
        throw null;
    }

    public void setShowMotionSpecResource(int i2) {
        setShowMotionSpec(MotionSpec.a(getContext(), i2));
    }

    public void setShrinkMotionSpec(MotionSpec motionSpec) {
        throw null;
    }

    public void setShrinkMotionSpecResource(int i2) {
        setShrinkMotionSpec(MotionSpec.a(getContext(), i2));
    }

    @Override // android.widget.TextView
    public void setTextColor(int i2) {
        super.setTextColor(i2);
        this.x0 = getTextColors();
    }

    public static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.Behavior<T> {
        public Rect X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final boolean f19282Y;
        public final boolean Z;

        public ExtendedFloatingActionButtonBehavior() {
            this.f19282Y = false;
            this.Z = true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final /* bridge */ /* synthetic */ boolean g(View view) {
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final void i(CoordinatorLayout.LayoutParams layoutParams) {
            if (layoutParams.f4150h == 0) {
                layoutParams.f4150h = 80;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean j(CoordinatorLayout coordinatorLayout, View view, View view2) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                y(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof CoordinatorLayout.LayoutParams ? ((CoordinatorLayout.LayoutParams) layoutParams).f4146a instanceof BottomSheetBehavior : false) {
                    z(view2, extendedFloatingActionButton);
                }
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean n(CoordinatorLayout coordinatorLayout, View view, int i2) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            ArrayList arrayListF = coordinatorLayout.f(extendedFloatingActionButton);
            int size = arrayListF.size();
            for (int i3 = 0; i3 < size; i3++) {
                View view2 = (View) arrayListF.get(i3);
                if (view2 instanceof AppBarLayout) {
                    y(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton);
                } else {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if (layoutParams instanceof CoordinatorLayout.LayoutParams ? ((CoordinatorLayout.LayoutParams) layoutParams).f4146a instanceof BottomSheetBehavior : false) {
                        z(view2, extendedFloatingActionButton);
                    }
                }
            }
            coordinatorLayout.s(i2, extendedFloatingActionButton);
            return true;
        }

        public final void y(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) extendedFloatingActionButton.getLayoutParams();
            if ((this.f19282Y || this.Z) && layoutParams.f == appBarLayout.getId()) {
                if (this.X == null) {
                    this.X = new Rect();
                }
                Rect rect = this.X;
                DescendantOffsetUtils.a(coordinatorLayout, appBarLayout, rect);
                if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                    ExtendedFloatingActionButton.e(extendedFloatingActionButton, this.Z ? 2 : 1);
                    throw null;
                }
                ExtendedFloatingActionButton.e(extendedFloatingActionButton, this.Z ? 3 : 0);
                throw null;
            }
        }

        public final void z(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) extendedFloatingActionButton.getLayoutParams();
            if ((this.f19282Y || this.Z) && layoutParams.f == view.getId()) {
                if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.LayoutParams) extendedFloatingActionButton.getLayoutParams())).topMargin) {
                    ExtendedFloatingActionButton.e(extendedFloatingActionButton, this.Z ? 2 : 1);
                    throw null;
                }
                ExtendedFloatingActionButton.e(extendedFloatingActionButton, this.Z ? 3 : 0);
                throw null;
            }
        }

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.j);
            this.f19282Y = typedArrayObtainStyledAttributes.getBoolean(0, false);
            this.Z = typedArrayObtainStyledAttributes.getBoolean(1, true);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.widget.TextView
    public void setTextColor(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        this.x0 = getTextColors();
    }
}
