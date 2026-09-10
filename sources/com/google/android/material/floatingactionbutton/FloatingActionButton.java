package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatDrawableManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.TintableBackgroundView;
import androidx.core.widget.TintableImageSourceView;
import com.charging.screenshow.battery.animations.themes.R;
import com.google.android.material.animation.MotionSpec;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.expandable.ExpandableTransformationWidget;
import com.google.android.material.internal.DescendantOffsetUtils;
import com.google.android.material.internal.VisibilityAwareImageButton;
import com.google.android.material.shadow.ShadowViewDelegate;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;
import com.google.android.material.stateful.ExtendableSavedState;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class FloatingActionButton extends VisibilityAwareImageButton implements TintableBackgroundView, TintableImageSourceView, ExpandableTransformationWidget, Shapeable, CoordinatorLayout.AttachedBehavior {
    public ColorStateList f0;
    public PorterDuff.Mode g0;
    public ColorStateList h0;
    public PorterDuff.Mode i0;
    public ColorStateList j0;
    public int k0;
    public int l0;
    public boolean m0;

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$1, reason: invalid class name */
    class AnonymousClass1 implements FloatingActionButtonImpl.InternalVisibilityChangedListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ OnVisibilityChangedListener f19283a;

        public AnonymousClass1(OnVisibilityChangedListener onVisibilityChangedListener) {
            this.f19283a = onVisibilityChangedListener;
        }

        public final void a() {
            this.f19283a.a(FloatingActionButton.this);
        }
    }

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public class ShadowDelegateImpl implements ShadowViewDelegate {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Size {
    }

    public class TransformationCallbackWrapper<T extends FloatingActionButton> implements FloatingActionButtonImpl.InternalTransformationCallback {
        @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.InternalTransformationCallback
        public final void a() {
            throw null;
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.InternalTransformationCallback
        public final void b() {
            throw null;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof TransformationCallbackWrapper)) {
                return false;
            }
            ((TransformationCallbackWrapper) obj).getClass();
            throw null;
        }

        public final int hashCode() {
            throw null;
        }
    }

    private FloatingActionButtonImpl getImpl() {
        return null;
    }

    @Override // com.google.android.material.expandable.ExpandableWidget
    public final boolean a() {
        throw null;
    }

    public final void b() {
        FloatingActionButtonImpl impl = getImpl();
        if (impl.o == null) {
            impl.o = new ArrayList();
        }
        impl.o.add(null);
    }

    public final void c(Animator.AnimatorListener animatorListener) {
        FloatingActionButtonImpl impl = getImpl();
        if (impl.f19298n == null) {
            impl.f19298n = new ArrayList();
        }
        impl.f19298n.add(animatorListener);
    }

    public final void d() {
        FloatingActionButtonImpl impl = getImpl();
        TransformationCallbackWrapper transformationCallbackWrapper = new TransformationCallbackWrapper();
        if (impl.f19299p == null) {
            impl.f19299p = new ArrayList();
        }
        impl.f19299p.add(transformationCallbackWrapper);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().h(getDrawableState());
    }

    public final int e(int i2) {
        int i3 = this.l0;
        if (i3 != 0) {
            return i3;
        }
        Resources resources = getResources();
        if (i2 != -1) {
            return i2 != 1 ? resources.getDimensionPixelSize(R.dimen.design_fab_size_normal) : resources.getDimensionPixelSize(R.dimen.design_fab_size_mini);
        }
        return Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? e(1) : e(0);
    }

    public final void f(OnVisibilityChangedListener onVisibilityChangedListener, boolean z2) {
        FloatingActionButtonImpl impl = getImpl();
        if (onVisibilityChangedListener != null) {
            new AnonymousClass1(onVisibilityChangedListener);
        }
        impl.getClass();
        throw null;
    }

    public final boolean g() {
        getImpl().getClass();
        throw null;
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return this.f0;
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.g0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AttachedBehavior
    public CoordinatorLayout.Behavior<FloatingActionButton> getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().d();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().f19294e;
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().f;
    }

    public Drawable getContentBackground() {
        getImpl().getClass();
        return null;
    }

    public int getCustomSize() {
        return this.l0;
    }

    public int getExpandedComponentIdHint() {
        throw null;
    }

    public MotionSpec getHideMotionSpec() {
        return getImpl().f19296i;
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.j0;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.j0;
    }

    @Override // com.google.android.material.shape.Shapeable
    public ShapeAppearanceModel getShapeAppearanceModel() {
        ShapeAppearanceModel shapeAppearanceModel = getImpl().f19291a;
        shapeAppearanceModel.getClass();
        return shapeAppearanceModel;
    }

    public MotionSpec getShowMotionSpec() {
        return getImpl().f19295h;
    }

    public int getSize() {
        return this.k0;
    }

    public int getSizeDimension() {
        return e(this.k0);
    }

    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    public ColorStateList getSupportImageTintList() {
        return this.h0;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        return this.i0;
    }

    public boolean getUseCompatPadding() {
        return this.m0;
    }

    public final boolean h() {
        getImpl().getClass();
        throw null;
    }

    public final void i() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        ColorStateList colorStateList = this.h0;
        if (colorStateList == null) {
            drawable.clearColorFilter();
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
        PorterDuff.Mode mode = this.i0;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter(AppCompatDrawableManager.c(colorForState, mode));
    }

    public final void j(OnVisibilityChangedListener onVisibilityChangedListener, boolean z2) {
        FloatingActionButtonImpl impl = getImpl();
        if (onVisibilityChangedListener != null) {
            new AnonymousClass1(onVisibilityChangedListener);
        }
        impl.getClass();
        throw null;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().f();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        FloatingActionButtonImpl impl = getImpl();
        impl.getClass();
        if (!(impl instanceof FloatingActionButtonImplLollipop)) {
            throw null;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getImpl().getClass();
        throw null;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i2, int i3) {
        getSizeDimension();
        getImpl().k();
        throw null;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ExtendableSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ExtendableSavedState extendableSavedState = (ExtendableSavedState) parcelable;
        super.onRestoreInstanceState(extendableSavedState.X);
        ((Bundle) extendableSavedState.Z.get("expandableWidgetHelper")).getClass();
        throw null;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        if (parcelableOnSaveInstanceState == null) {
            parcelableOnSaveInstanceState = new Bundle();
        }
        new ExtendableSavedState(parcelableOnSaveInstanceState);
        throw null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return super.onTouchEvent(motionEvent);
        }
        getMeasuredWidth();
        getMeasuredHeight();
        throw null;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i2) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f0 != colorStateList) {
            this.f0 = colorStateList;
            getImpl().getClass();
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.g0 != mode) {
            this.g0 = mode;
            getImpl().getClass();
        }
    }

    public void setCompatElevation(float f) {
        FloatingActionButtonImpl impl = getImpl();
        if (impl.d != f) {
            impl.d = f;
            impl.i(f, impl.f19294e, impl.f);
        }
    }

    public void setCompatElevationResource(int i2) {
        setCompatElevation(getResources().getDimension(i2));
    }

    public void setCompatHoveredFocusedTranslationZ(float f) {
        FloatingActionButtonImpl impl = getImpl();
        if (impl.f19294e != f) {
            impl.f19294e = f;
            impl.i(impl.d, f, impl.f);
        }
    }

    public void setCompatHoveredFocusedTranslationZResource(int i2) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i2));
    }

    public void setCompatPressedTranslationZ(float f) {
        FloatingActionButtonImpl impl = getImpl();
        if (impl.f != f) {
            impl.f = f;
            impl.i(impl.d, impl.f19294e, f);
        }
    }

    public void setCompatPressedTranslationZResource(int i2) {
        setCompatPressedTranslationZ(getResources().getDimension(i2));
    }

    public void setCustomSize(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        }
        if (i2 != this.l0) {
            this.l0 = i2;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        getImpl().getClass();
    }

    public void setEnsureMinTouchTargetSize(boolean z2) {
        if (z2 != getImpl().f19292b) {
            getImpl().f19292b = z2;
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i2) {
        throw null;
    }

    public void setHideMotionSpec(MotionSpec motionSpec) {
        getImpl().f19296i = motionSpec;
    }

    public void setHideMotionSpecResource(int i2) {
        setHideMotionSpec(MotionSpec.a(getContext(), i2));
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() == drawable) {
            return;
        }
        super.setImageDrawable(drawable);
        FloatingActionButtonImpl impl = getImpl();
        float f = impl.k;
        impl.k = f;
        impl.a(f, null);
        throw null;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i2) {
        throw null;
    }

    public void setMaxImageSize(int i2) {
        FloatingActionButtonImpl impl = getImpl();
        if (impl.f19297l == i2) {
            return;
        }
        impl.f19297l = i2;
        float f = impl.k;
        impl.k = f;
        impl.a(f, null);
        throw null;
    }

    public void setRippleColor(int i2) {
        setRippleColor(ColorStateList.valueOf(i2));
    }

    @Override // android.view.View
    public void setScaleX(float f) {
        super.setScaleX(f);
        ArrayList arrayList = getImpl().f19299p;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((FloatingActionButtonImpl.InternalTransformationCallback) it.next()).b();
            }
        }
    }

    @Override // android.view.View
    public void setScaleY(float f) {
        super.setScaleY(f);
        ArrayList arrayList = getImpl().f19299p;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((FloatingActionButtonImpl.InternalTransformationCallback) it.next()).b();
            }
        }
    }

    public void setShadowPaddingEnabled(boolean z2) {
        FloatingActionButtonImpl impl = getImpl();
        impl.f19293c = z2;
        impl.k();
        throw null;
    }

    @Override // com.google.android.material.shape.Shapeable
    public void setShapeAppearanceModel(ShapeAppearanceModel shapeAppearanceModel) {
        getImpl().f19291a = shapeAppearanceModel;
    }

    public void setShowMotionSpec(MotionSpec motionSpec) {
        getImpl().f19295h = motionSpec;
    }

    public void setShowMotionSpecResource(int i2) {
        setShowMotionSpec(MotionSpec.a(getContext(), i2));
    }

    public void setSize(int i2) {
        this.l0 = 0;
        if (i2 != this.k0) {
            this.k0 = i2;
            requestLayout();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.h0 != colorStateList) {
            this.h0 = colorStateList;
            i();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.i0 != mode) {
            this.i0 = mode;
            i();
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        super.setTranslationX(f);
        getImpl().j();
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        getImpl().j();
    }

    @Override // android.view.View
    public void setTranslationZ(float f) {
        super.setTranslationZ(f);
        getImpl().j();
    }

    public void setUseCompatPadding(boolean z2) {
        if (this.m0 != z2) {
            this.m0 = z2;
            getImpl().g();
        }
    }

    @Override // com.google.android.material.internal.VisibilityAwareImageButton, android.widget.ImageView, android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
    }

    public static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.Behavior<T> {
        public Rect X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final boolean f19285Y;

        public BaseBehavior() {
            this.f19285Y = true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean g(View view) {
            ((FloatingActionButton) view).getLeft();
            throw null;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final void i(CoordinatorLayout.LayoutParams layoutParams) {
            if (layoutParams.f4150h == 0) {
                layoutParams.f4150h = 80;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean j(CoordinatorLayout coordinatorLayout, View view, View view2) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                y(coordinatorLayout, (AppBarLayout) view2, floatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof CoordinatorLayout.LayoutParams ? ((CoordinatorLayout.LayoutParams) layoutParams).f4146a instanceof BottomSheetBehavior : false) {
                    z(view2, floatingActionButton);
                }
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean n(CoordinatorLayout coordinatorLayout, View view, int i2) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            ArrayList arrayListF = coordinatorLayout.f(floatingActionButton);
            int size = arrayListF.size();
            for (int i3 = 0; i3 < size; i3++) {
                View view2 = (View) arrayListF.get(i3);
                if (!(view2 instanceof AppBarLayout)) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if ((layoutParams instanceof CoordinatorLayout.LayoutParams ? ((CoordinatorLayout.LayoutParams) layoutParams).f4146a instanceof BottomSheetBehavior : false) && z(view2, floatingActionButton)) {
                        break;
                    }
                } else {
                    if (y(coordinatorLayout, (AppBarLayout) view2, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.s(i2, floatingActionButton);
            return true;
        }

        public final boolean y(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (!(this.f19285Y && ((CoordinatorLayout.LayoutParams) floatingActionButton.getLayoutParams()).f == appBarLayout.getId() && floatingActionButton.getUserSetVisibility() == 0)) {
                return false;
            }
            if (this.X == null) {
                this.X = new Rect();
            }
            Rect rect = this.X;
            DescendantOffsetUtils.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.f(null, false);
            } else {
                floatingActionButton.j(null, false);
            }
            return true;
        }

        public final boolean z(View view, FloatingActionButton floatingActionButton) {
            if (!(this.f19285Y && ((CoordinatorLayout.LayoutParams) floatingActionButton.getLayoutParams()).f == view.getId() && floatingActionButton.getUserSetVisibility() == 0)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.LayoutParams) floatingActionButton.getLayoutParams())).topMargin) {
                floatingActionButton.f(null, false);
            } else {
                floatingActionButton.j(null, false);
            }
            return true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.google.android.material.R.styleable.k);
            this.f19285Y = typedArrayObtainStyledAttributes.getBoolean(0, true);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.j0 != colorStateList) {
            this.j0 = colorStateList;
            getImpl().getClass();
        }
    }

    public static abstract class OnVisibilityChangedListener {
        public void a(FloatingActionButton floatingActionButton) {
        }

        public void b() {
        }
    }
}
