package androidx.slidingpanelayout.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.content.ContextCompat;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.view.AbsSavedState;
import androidx.customview.widget.ViewDragHelper;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class SlidingPaneLayout extends ViewGroup {
    public int e0;
    public int f0;
    public Drawable g0;
    public Drawable h0;
    public boolean i0;
    public View j0;
    public int k0;
    public float l0;
    public float m0;
    public PanelSlideListener n0;
    public boolean o0;

    public class AccessibilityDelegate extends AccessibilityDelegateCompat {
        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final void c(View view, AccessibilityEvent accessibilityEvent) {
            super.c(view, accessibilityEvent);
            accessibilityEvent.setClassName(SlidingPaneLayout.class.getName());
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final void d(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            AccessibilityNodeInfo accessibilityNodeInfo = accessibilityNodeInfoCompat.f4534a;
            AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(accessibilityNodeInfo);
            AccessibilityNodeInfoCompat accessibilityNodeInfoCompat2 = new AccessibilityNodeInfoCompat(accessibilityNodeInfoObtain);
            this.f4417a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoObtain);
            accessibilityNodeInfoCompat2.f(null);
            accessibilityNodeInfo.setBoundsInParent(null);
            accessibilityNodeInfoObtain.getBoundsInScreen(null);
            accessibilityNodeInfo.setBoundsInScreen(null);
            accessibilityNodeInfo.setVisibleToUser(accessibilityNodeInfoObtain.isVisibleToUser());
            accessibilityNodeInfo.setPackageName(accessibilityNodeInfoObtain.getPackageName());
            accessibilityNodeInfoCompat.j(accessibilityNodeInfoObtain.getClassName());
            accessibilityNodeInfoCompat.m(accessibilityNodeInfoObtain.getContentDescription());
            accessibilityNodeInfo.setEnabled(accessibilityNodeInfoObtain.isEnabled());
            accessibilityNodeInfo.setClickable(accessibilityNodeInfoObtain.isClickable());
            accessibilityNodeInfo.setFocusable(accessibilityNodeInfoObtain.isFocusable());
            accessibilityNodeInfo.setFocused(accessibilityNodeInfoObtain.isFocused());
            accessibilityNodeInfo.setAccessibilityFocused(accessibilityNodeInfoObtain.isAccessibilityFocused());
            accessibilityNodeInfo.setSelected(accessibilityNodeInfoObtain.isSelected());
            accessibilityNodeInfo.setLongClickable(accessibilityNodeInfoObtain.isLongClickable());
            accessibilityNodeInfoCompat.a(accessibilityNodeInfoObtain.getActions());
            accessibilityNodeInfo.setMovementGranularities(accessibilityNodeInfoObtain.getMovementGranularities());
            accessibilityNodeInfoCompat.j(SlidingPaneLayout.class.getName());
            accessibilityNodeInfoCompat.f4535b = -1;
            accessibilityNodeInfo.setSource(view);
            WeakHashMap weakHashMap = ViewCompat.f4466a;
            Object parentForAccessibility = view.getParentForAccessibility();
            if (!(parentForAccessibility instanceof View)) {
                throw null;
            }
            accessibilityNodeInfo.setParent((View) parentForAccessibility);
            throw null;
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            throw null;
        }
    }

    public class DisableLayerRunnable implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    public class DragHelperCallback extends ViewDragHelper.Callback {
        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final int a(int i2, View view) {
            throw null;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final int b(int i2, View view) {
            return view.getTop();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final int c(View view) {
            throw null;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final void e(int i2, View view) {
            throw null;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final void f(int i2) {
            throw null;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final void g(int i2, int i3, View view) {
            throw null;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final void h(float f, float f2, View view) {
            throw null;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final boolean i(int i2, View view) {
            throw null;
        }
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int[] f8362c = {R.attr.layout_weight};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f8363a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f8364b;
    }

    public interface PanelSlideListener {
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new AnonymousClass1();
        public boolean Z;

        /* JADX INFO: renamed from: androidx.slidingpanelayout.widget.SlidingPaneLayout$SavedState$1, reason: invalid class name */
        public static class AnonymousClass1 implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i2) {
                return new SavedState[i2];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }
        }

        public SavedState(Parcel parcel) {
            super(parcel, null);
            this.Z = parcel.readInt() != 0;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.Z ? 1 : 0);
        }
    }

    public static class SimplePanelSlideListener implements PanelSlideListener {
    }

    public final boolean a() {
        WeakHashMap weakHashMap = ViewCompat.f4466a;
        return getLayoutDirection() == 1;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void computeScroll() {
        throw null;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i2;
        int right;
        super.draw(canvas);
        Drawable drawable = a() ? this.h0 : this.g0;
        View childAt = getChildCount() > 1 ? getChildAt(1) : null;
        if (childAt == null || drawable == null) {
            return;
        }
        int top2 = childAt.getTop();
        int bottom = childAt.getBottom();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        if (a()) {
            right = childAt.getRight();
            i2 = intrinsicWidth + right;
        } else {
            int left = childAt.getLeft();
            int i3 = left - intrinsicWidth;
            i2 = left;
            right = i3;
        }
        drawable.setBounds(right, top2, i2, bottom);
        drawable.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int iSave = canvas.save();
        if (!this.i0 || layoutParams.f8364b || this.j0 == null) {
            boolean zDrawChild = super.drawChild(canvas, view, j);
            canvas.restoreToCount(iSave);
            return zDrawChild;
        }
        canvas.getClipBounds(null);
        if (a()) {
            throw null;
        }
        throw null;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        LayoutParams layoutParams = new LayoutParams(-1, -1);
        layoutParams.f8363a = 0.0f;
        return layoutParams;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            LayoutParams layoutParams2 = new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
            layoutParams2.f8363a = 0.0f;
            return layoutParams2;
        }
        LayoutParams layoutParams3 = new LayoutParams(layoutParams);
        layoutParams3.f8363a = 0.0f;
        return layoutParams3;
    }

    public int getCoveredFadeColor() {
        return this.f0;
    }

    public int getParallaxDistance() {
        return this.k0;
    }

    public int getSliderFadeColor() {
        return this.e0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        throw null;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (!this.i0 && actionMasked == 0 && getChildCount() > 1 && getChildAt(1) != null) {
            motionEvent.getX();
            motionEvent.getY();
            throw null;
        }
        if (!this.i0 || actionMasked == 3 || actionMasked == 1) {
            throw null;
        }
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            this.l0 = x;
            this.m0 = y;
            throw null;
        }
        if (actionMasked != 2) {
            throw null;
        }
        float x2 = motionEvent.getX();
        float y2 = motionEvent.getY();
        Math.abs(x2 - this.l0);
        Math.abs(y2 - this.m0);
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        if (!a()) {
            throw null;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:125:0x0118 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x00b2 A[PHI: r14
  0x00b2: PHI (r14v2 float) = (r14v1 float), (r14v3 float) binds: [B:34:0x00a9, B:36:0x00ae] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:40:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:47:0x00de  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:50:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:58:0x010d  */
    /* JADX WARN: Code duplicated, block: B:59:0x0110  */
    /* JADX WARN: Code duplicated, block: B:62:0x0116  */
    /* JADX WARN: Code duplicated, block: B:71:0x0135  */
    @Override // android.view.View
    public final void onMeasure(int i2, int i3) throws Throwable {
        int paddingTop;
        int iMin;
        Throwable th;
        int i4;
        int i5;
        int iMakeMeasureSpec;
        int i6;
        int iMakeMeasureSpec2;
        int i7;
        int i8;
        int iMakeMeasureSpec3;
        int i9;
        int iMakeMeasureSpec4;
        int measuredHeight;
        boolean z2;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        if (mode != 1073741824) {
            if (!isInEditMode()) {
                throw new IllegalStateException("Width must have an exact value or MATCH_PARENT");
            }
            if (mode != Integer.MIN_VALUE && mode == 0) {
                size = 300;
            }
        } else if (mode2 == 0) {
            if (!isInEditMode()) {
                throw new IllegalStateException("Height must not be UNSPECIFIED");
            }
            if (mode2 == 0) {
                size2 = 300;
                mode2 = Integer.MIN_VALUE;
            }
        }
        if (mode2 == Integer.MIN_VALUE) {
            paddingTop = (size2 - getPaddingTop()) - getPaddingBottom();
            iMin = 0;
        } else if (mode2 != 1073741824) {
            iMin = 0;
            paddingTop = 0;
        } else {
            iMin = (size2 - getPaddingTop()) - getPaddingBottom();
            paddingTop = iMin;
        }
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int childCount = getChildCount();
        if (childCount > 2) {
            Log.e("SlidingPaneLayout", "onMeasure: More than two child views are not supported.");
        }
        Throwable th2 = null;
        this.j0 = null;
        int i10 = paddingLeft;
        int i11 = 0;
        boolean z3 = false;
        float f = 0.0f;
        while (true) {
            th = th2;
            i4 = 8;
            if (i11 >= childCount) {
                break;
            }
            View childAt = getChildAt(i11);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (childAt.getVisibility() == 8) {
                layoutParams.getClass();
            } else {
                float f2 = layoutParams.f8363a;
                if (f2 > 0.0f) {
                    f += f2;
                    if (((ViewGroup.MarginLayoutParams) layoutParams).width != 0) {
                        i7 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                        i8 = ((ViewGroup.MarginLayoutParams) layoutParams).width;
                        if (i8 == -2) {
                            iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(paddingLeft - i7, Integer.MIN_VALUE);
                        } else if (i8 == -1) {
                            iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(paddingLeft - i7, 1073741824);
                        } else {
                            iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i8, 1073741824);
                        }
                        i9 = ((ViewGroup.MarginLayoutParams) layoutParams).height;
                        if (i9 == -2) {
                            iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(paddingTop, Integer.MIN_VALUE);
                        } else if (i9 == -1) {
                            iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(paddingTop, 1073741824);
                        } else {
                            iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(i9, 1073741824);
                        }
                        childAt.measure(iMakeMeasureSpec3, iMakeMeasureSpec4);
                        int measuredWidth = childAt.getMeasuredWidth();
                        measuredHeight = childAt.getMeasuredHeight();
                        if (mode2 == Integer.MIN_VALUE && measuredHeight > iMin) {
                            iMin = Math.min(measuredHeight, paddingTop);
                        }
                        i10 -= measuredWidth;
                        if (i10 < 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        layoutParams.f8364b = z2;
                        z3 |= z2;
                        if (z2) {
                            this.j0 = childAt;
                        }
                    }
                } else {
                    i7 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                    i8 = ((ViewGroup.MarginLayoutParams) layoutParams).width;
                    if (i8 == -2) {
                        iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(paddingLeft - i7, Integer.MIN_VALUE);
                    } else if (i8 == -1) {
                        iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(paddingLeft - i7, 1073741824);
                    } else {
                        iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i8, 1073741824);
                    }
                    i9 = ((ViewGroup.MarginLayoutParams) layoutParams).height;
                    if (i9 == -2) {
                        iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(paddingTop, Integer.MIN_VALUE);
                    } else if (i9 == -1) {
                        iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(paddingTop, 1073741824);
                    } else {
                        iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(i9, 1073741824);
                    }
                    childAt.measure(iMakeMeasureSpec3, iMakeMeasureSpec4);
                    int measuredWidth2 = childAt.getMeasuredWidth();
                    measuredHeight = childAt.getMeasuredHeight();
                    if (mode2 == Integer.MIN_VALUE) {
                        iMin = Math.min(measuredHeight, paddingTop);
                    }
                    i10 -= measuredWidth2;
                    if (i10 < 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    layoutParams.f8364b = z2;
                    z3 |= z2;
                    if (z2) {
                        this.j0 = childAt;
                    }
                }
            }
            i11++;
            th2 = th;
        }
        if (z3 || f > 0.0f) {
            int i12 = 0;
            while (i12 < childCount) {
                View childAt2 = getChildAt(i12);
                if (childAt2.getVisibility() != i4) {
                    LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
                    if (childAt2.getVisibility() != i4) {
                        int i13 = ((ViewGroup.MarginLayoutParams) layoutParams2).width;
                        float f3 = layoutParams2.f8363a;
                        boolean z4 = i13 == 0 && f3 > 0.0f;
                        int measuredWidth3 = z4 ? 0 : childAt2.getMeasuredWidth();
                        if (!z3 || childAt2 == this.j0) {
                            if (f3 > 0.0f) {
                                if (((ViewGroup.MarginLayoutParams) layoutParams2).width == 0) {
                                    int i14 = ((ViewGroup.MarginLayoutParams) layoutParams2).height;
                                    if (i14 == -2) {
                                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(paddingTop, Integer.MIN_VALUE);
                                        i5 = 1073741824;
                                    } else if (i14 == -1) {
                                        i5 = 1073741824;
                                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(paddingTop, 1073741824);
                                    } else {
                                        i5 = 1073741824;
                                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i14, 1073741824);
                                    }
                                } else {
                                    i5 = 1073741824;
                                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(childAt2.getMeasuredHeight(), 1073741824);
                                }
                                if (z3) {
                                    int i15 = paddingLeft - (((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin);
                                    int iMakeMeasureSpec5 = View.MeasureSpec.makeMeasureSpec(i15, i5);
                                    if (measuredWidth3 != i15) {
                                        childAt2.measure(iMakeMeasureSpec5, iMakeMeasureSpec);
                                    }
                                } else {
                                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth3 + ((int) ((f3 * Math.max(0, i10)) / f)), 1073741824), iMakeMeasureSpec);
                                }
                            }
                        } else if (((ViewGroup.MarginLayoutParams) layoutParams2).width < 0 && (measuredWidth3 > paddingLeft || f3 > 0.0f)) {
                            if (z4) {
                                int i16 = ((ViewGroup.MarginLayoutParams) layoutParams2).height;
                                if (i16 == -2) {
                                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(paddingTop, Integer.MIN_VALUE);
                                    i6 = 1073741824;
                                } else if (i16 == -1) {
                                    i6 = 1073741824;
                                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(paddingTop, 1073741824);
                                } else {
                                    i6 = 1073741824;
                                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i16, 1073741824);
                                }
                            } else {
                                i6 = 1073741824;
                                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(childAt2.getMeasuredHeight(), 1073741824);
                            }
                            childAt2.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i6), iMakeMeasureSpec2);
                        }
                    }
                }
                i12++;
                i4 = 8;
            }
        }
        setMeasuredDimension(size, getPaddingBottom() + getPaddingTop() + iMin);
        this.i0 = z3;
        throw th;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.X);
        boolean z2 = savedState.Z;
        if (z2) {
            this.o0 = true;
        } else {
            this.o0 = false;
        }
        this.o0 = z2;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        boolean z2 = this.i0;
        savedState.Z = z2 ? !z2 : this.o0;
        return savedState;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.i0) {
            throw null;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        if (isInTouchMode() || this.i0) {
            return;
        }
        this.o0 = view == this.j0;
    }

    public void setCoveredFadeColor(int i2) {
        this.f0 = i2;
    }

    public void setPanelSlideListener(PanelSlideListener panelSlideListener) {
        this.n0 = panelSlideListener;
    }

    public void setParallaxDistance(int i2) {
        this.k0 = i2;
        requestLayout();
    }

    @Deprecated
    public void setShadowDrawable(Drawable drawable) {
        setShadowDrawableLeft(drawable);
    }

    public void setShadowDrawableLeft(Drawable drawable) {
        this.g0 = drawable;
    }

    public void setShadowDrawableRight(Drawable drawable) {
        this.h0 = drawable;
    }

    @Deprecated
    public void setShadowResource(int i2) {
        setShadowDrawable(getResources().getDrawable(i2));
    }

    public void setShadowResourceLeft(int i2) {
        setShadowDrawableLeft(ContextCompat.getDrawable(getContext(), i2));
    }

    public void setShadowResourceRight(int i2) {
        setShadowDrawableRight(ContextCompat.getDrawable(getContext(), i2));
    }

    public void setSliderFadeColor(int i2) {
        this.e0 = i2;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        LayoutParams layoutParams = new LayoutParams(context, attributeSet);
        layoutParams.f8363a = 0.0f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, LayoutParams.f8362c);
        layoutParams.f8363a = typedArrayObtainStyledAttributes.getFloat(0, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        return layoutParams;
    }
}
