package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.v4.media.a;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.collection.SimpleArrayMap;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.util.Pools;
import androidx.core.view.NestedScrollingParent2;
import androidx.core.view.NestedScrollingParent3;
import androidx.core.view.NestedScrollingParentHelper;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.customview.view.AbsSavedState;
import com.charging.screenshow.battery.animations.themes.R;
import com.thinkup.core.common.n.mo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements NestedScrollingParent2, NestedScrollingParent3 {
    public static final Comparator A0;
    public static final Pools.SynchronizedPool B0;
    public static final String x0;
    public static final Class[] y0;
    public static final ThreadLocal z0;
    public final ArrayList e0;
    public final DirectedAcyclicGraph f0;
    public final ArrayList g0;
    public final ArrayList h0;
    public final int[] i0;
    public final int[] j0;
    public boolean k0;
    public boolean l0;
    public final int[] m0;
    public View n0;
    public View o0;
    public OnPreDrawListener p0;
    public boolean q0;
    public WindowInsetsCompat r0;
    public boolean s0;
    public Drawable t0;
    public ViewGroup.OnHierarchyChangeListener u0;
    public OnApplyWindowInsetsListener v0;
    public final NestedScrollingParentHelper w0;

    public interface AttachedBehavior {
        Behavior getBehavior();
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Deprecated
    public @interface DefaultBehavior {
        Class value();
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface DispatchChangeEvent {
    }

    public class HierarchyChangeListener implements ViewGroup.OnHierarchyChangeListener {
        public HierarchyChangeListener() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.u0;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout coordinatorLayout = CoordinatorLayout.this;
            coordinatorLayout.r(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = coordinatorLayout.u0;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    public class OnPreDrawListener implements ViewTreeObserver.OnPreDrawListener {
        public OnPreDrawListener() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            CoordinatorLayout.this.r(0);
            return true;
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new AnonymousClass1();
        public SparseArray Z;

        /* JADX INFO: renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$SavedState$1, reason: invalid class name */
        public static class AnonymousClass1 implements Parcelable.ClassLoaderCreator<SavedState> {
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
            int i2 = parcel.readInt();
            int[] iArr = new int[i2];
            parcel.readIntArray(iArr);
            Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
            this.Z = new SparseArray(i2);
            for (int i3 = 0; i3 < i2; i3++) {
                this.Z.append(iArr[i3], parcelableArray[i3]);
            }
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            SparseArray sparseArray = this.Z;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i3 = 0; i3 < size; i3++) {
                iArr[i3] = this.Z.keyAt(i3);
                parcelableArr[i3] = (Parcelable) this.Z.valueAt(i3);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i2);
        }
    }

    public static class ViewElevationComparator implements Comparator<View> {
        @Override // java.util.Comparator
        public final int compare(View view, View view2) {
            float fQ = ViewCompat.q(view);
            float fQ2 = ViewCompat.q(view2);
            if (fQ > fQ2) {
                return -1;
            }
            return fQ < fQ2 ? 1 : 0;
        }
    }

    static {
        Package r0 = CoordinatorLayout.class.getPackage();
        x0 = r0 != null ? r0.getName() : null;
        A0 = new ViewElevationComparator();
        y0 = new Class[]{Context.class, AttributeSet.class};
        z0 = new ThreadLocal();
        B0 = new Pools.SynchronizedPool(12);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.coordinatorLayoutStyle);
        this.e0 = new ArrayList();
        this.f0 = new DirectedAcyclicGraph();
        this.g0 = new ArrayList();
        this.h0 = new ArrayList();
        this.i0 = new int[2];
        this.j0 = new int[2];
        this.w0 = new NestedScrollingParentHelper();
        int[] iArr = androidx.coordinatorlayout.R.styleable.f4144a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.coordinatorLayoutStyle, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, typedArrayObtainStyledAttributes, R.attr.coordinatorLayoutStyle, 0);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            this.m0 = intArray;
            float f = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i2 = 0; i2 < length; i2++) {
                int[] iArr2 = this.m0;
                iArr2[i2] = (int) (iArr2[i2] * f);
            }
        }
        this.t0 = typedArrayObtainStyledAttributes.getDrawable(1);
        typedArrayObtainStyledAttributes.recycle();
        z();
        super.setOnHierarchyChangeListener(new HierarchyChangeListener());
        WeakHashMap weakHashMap = ViewCompat.f4466a;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    public static Rect c() {
        Rect rect = (Rect) B0.b();
        return rect == null ? new Rect() : rect;
    }

    public static void h(int i2, Rect rect, Rect rect2, LayoutParams layoutParams, int i3, int i4) {
        int iWidth;
        int iHeight;
        int i5 = layoutParams.f4148c;
        if (i5 == 0) {
            i5 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i5, i2);
        int i6 = layoutParams.d;
        if ((i6 & 7) == 0) {
            i6 |= 8388611;
        }
        if ((i6 & 112) == 0) {
            i6 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i6, i2);
        int i7 = absoluteGravity & 7;
        int i8 = absoluteGravity & 112;
        int i9 = absoluteGravity2 & 7;
        int i10 = absoluteGravity2 & 112;
        if (i9 != 1) {
            iWidth = i9 != 5 ? rect.left : rect.right;
        } else {
            iWidth = rect.left + (rect.width() / 2);
        }
        if (i10 != 16) {
            iHeight = i10 != 80 ? rect.top : rect.bottom;
        } else {
            iHeight = rect.top + (rect.height() / 2);
        }
        if (i7 == 1) {
            iWidth -= i3 / 2;
        } else if (i7 != 5) {
            iWidth -= i3;
        }
        if (i8 == 16) {
            iHeight -= i4 / 2;
        } else if (i8 != 80) {
            iHeight -= i4;
        }
        rect2.set(iWidth, iHeight, i3 + iWidth, i4 + iHeight);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static LayoutParams p(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (!layoutParams.f4147b) {
            if (view instanceof AttachedBehavior) {
                Behavior behavior = ((AttachedBehavior) view).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                Behavior behavior2 = layoutParams.f4146a;
                if (behavior2 != behavior) {
                    if (behavior2 != null) {
                        behavior2.l();
                    }
                    layoutParams.f4146a = behavior;
                    layoutParams.f4147b = true;
                    if (behavior != null) {
                        behavior.i(layoutParams);
                    }
                }
                layoutParams.f4147b = true;
                return layoutParams;
            }
            DefaultBehavior defaultBehavior = null;
            for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                defaultBehavior = (DefaultBehavior) superclass.getAnnotation(DefaultBehavior.class);
                if (defaultBehavior != null) {
                    break;
                }
            }
            if (defaultBehavior != null) {
                try {
                    Behavior behavior3 = (Behavior) defaultBehavior.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    Behavior behavior4 = layoutParams.f4146a;
                    if (behavior4 != behavior3) {
                        if (behavior4 != null) {
                            behavior4.l();
                        }
                        layoutParams.f4146a = behavior3;
                        layoutParams.f4147b = true;
                        if (behavior3 != null) {
                            behavior3.i(layoutParams);
                        }
                    }
                } catch (Exception e2) {
                    Log.e("CoordinatorLayout", "Default behavior class " + defaultBehavior.value().getName() + " could not be instantiated. Did you forget a default constructor?", e2);
                }
            }
            layoutParams.f4147b = true;
        }
        return layoutParams;
    }

    public static void x(int i2, View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i3 = layoutParams.f4151i;
        if (i3 != i2) {
            WeakHashMap weakHashMap = ViewCompat.f4466a;
            view.offsetLeftAndRight(i2 - i3);
            layoutParams.f4151i = i2;
        }
    }

    public static void y(int i2, View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i3 = layoutParams.j;
        if (i3 != i2) {
            WeakHashMap weakHashMap = ViewCompat.f4466a;
            view.offsetTopAndBottom(i2 - i3);
            layoutParams.j = i2;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    public final void d(LayoutParams layoutParams, Rect rect, int i2, int i3) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i2) - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i3) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin));
        rect.set(iMax, iMax2, i2 + iMax, i3 + iMax2);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        Behavior behavior = ((LayoutParams) view.getLayoutParams()).f4146a;
        if (behavior != null) {
            behavior.getClass();
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.t0;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    public final void e(View view, Rect rect, boolean z2) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z2) {
            g(rect, view);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public final ArrayList f(View view) {
        SimpleArrayMap simpleArrayMap = this.f0.f4156b;
        int i2 = simpleArrayMap.Z;
        ArrayList arrayList = null;
        for (int i3 = 0; i3 < i2; i3++) {
            ArrayList arrayList2 = (ArrayList) simpleArrayMap.j(i3);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(simpleArrayMap.f(i3));
            }
        }
        ArrayList arrayList3 = this.h0;
        arrayList3.clear();
        if (arrayList != null) {
            arrayList3.addAll(arrayList);
        }
        return arrayList3;
    }

    public final void g(Rect rect, View view) {
        ThreadLocal threadLocal = ViewGroupUtils.f4158a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal threadLocal2 = ViewGroupUtils.f4158a;
        Matrix matrix = (Matrix) threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        ViewGroupUtils.a(this, view, matrix);
        ThreadLocal threadLocal3 = ViewGroupUtils.f4159b;
        RectF rectF = (RectF) threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public final List<View> getDependencySortedChildren() {
        v();
        return Collections.unmodifiableList(this.e0);
    }

    public final WindowInsetsCompat getLastWindowInsets() {
        return this.r0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        NestedScrollingParentHelper nestedScrollingParentHelper = this.w0;
        return nestedScrollingParentHelper.f4454b | nestedScrollingParentHelper.f4453a;
    }

    public Drawable getStatusBarBackground() {
        return this.t0;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public final void i(int i2, View view) {
        NestedScrollingParentHelper nestedScrollingParentHelper = this.w0;
        if (i2 == 1) {
            nestedScrollingParentHelper.f4454b = 0;
        } else {
            nestedScrollingParentHelper.f4453a = 0;
        }
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (layoutParams.a(i2)) {
                Behavior behavior = layoutParams.f4146a;
                if (behavior != null) {
                    behavior.w(this, childAt, view, i2);
                }
                if (i2 == 0) {
                    layoutParams.m = false;
                } else if (i2 == 1) {
                    layoutParams.f4153n = false;
                }
                layoutParams.o = false;
            }
        }
        this.o0 = null;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public final void j(View view, View view2, int i2, int i3) {
        NestedScrollingParentHelper nestedScrollingParentHelper = this.w0;
        if (i3 == 1) {
            nestedScrollingParentHelper.f4454b = i2;
        } else {
            nestedScrollingParentHelper.f4453a = i2;
        }
        this.o0 = view2;
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            ((LayoutParams) getChildAt(i4).getLayoutParams()).getClass();
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public final void k(View view, int i2, int i3, int[] iArr, int i4) {
        Behavior behavior;
        int childCount = getChildCount();
        boolean z2 = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.a(i4) && (behavior = layoutParams.f4146a) != null) {
                    int[] iArr2 = this.i0;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    behavior.q(this, childAt, view, i2, i3, iArr2, i4);
                    iMax = i2 > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i3 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z2 = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z2) {
            r(1);
        }
    }

    public final int l(int i2) {
        int[] iArr = this.m0;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i2);
            return 0;
        }
        if (i2 >= 0 && i2 < iArr.length) {
            return iArr[i2];
        }
        Log.e("CoordinatorLayout", "Keyline index " + i2 + " out of range for " + this);
        return 0;
    }

    @Override // androidx.core.view.NestedScrollingParent3
    public final void m(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        Behavior behavior;
        int childCount = getChildCount();
        int iMax = 0;
        int iMax2 = 0;
        boolean z2 = false;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.a(i6) && (behavior = layoutParams.f4146a) != null) {
                    int[] iArr2 = this.i0;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    behavior.r(this, childAt, i3, i4, i5, iArr2);
                    iMax = i4 > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i5 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z2 = true;
                }
            }
        }
        iArr[0] = iArr[0] + iMax;
        iArr[1] = iArr[1] + iMax2;
        if (z2) {
            r(1);
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public final void n(View view, int i2, int i3, int i4, int i5, int i6) {
        m(view, i2, i3, i4, i5, 0, this.j0);
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public final boolean o(View view, View view2, int i2, int i3) {
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                Behavior behavior = layoutParams.f4146a;
                if (behavior != null) {
                    boolean zV = behavior.v(this, childAt, view, view2, i2, i3);
                    z2 |= zV;
                    if (i3 == 0) {
                        layoutParams.m = zV;
                    } else if (i3 == 1) {
                        layoutParams.f4153n = zV;
                    }
                } else if (i3 == 0) {
                    layoutParams.m = false;
                } else if (i3 == 1) {
                    layoutParams.f4153n = false;
                }
            }
        }
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        w(false);
        if (this.q0) {
            if (this.p0 == null) {
                this.p0 = new OnPreDrawListener();
            }
            getViewTreeObserver().addOnPreDrawListener(this.p0);
        }
        if (this.r0 == null) {
            WeakHashMap weakHashMap = ViewCompat.f4466a;
            if (getFitsSystemWindows()) {
                ViewCompat.x(this);
            }
        }
        this.l0 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        w(false);
        if (this.q0 && this.p0 != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.p0);
        }
        View view = this.o0;
        if (view != null) {
            i(0, view);
        }
        this.l0 = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.s0 || this.t0 == null) {
            return;
        }
        WindowInsetsCompat windowInsetsCompat = this.r0;
        int iJ = windowInsetsCompat != null ? windowInsetsCompat.j() : 0;
        if (iJ > 0) {
            this.t0.setBounds(0, 0, getWidth(), iJ);
            this.t0.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            w(true);
        }
        boolean zU = u(motionEvent, 0);
        if (actionMasked != 1 && actionMasked != 3) {
            return zU;
        }
        w(true);
        return zU;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        Behavior behavior;
        WeakHashMap weakHashMap = ViewCompat.f4466a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList = this.e0;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            View view = (View) arrayList.get(i6);
            if (view.getVisibility() != 8 && ((behavior = ((LayoutParams) view.getLayoutParams()).f4146a) == null || !behavior.n(this, view, layoutDirection))) {
                s(layoutDirection, view);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:69:0x012b  */
    /* JADX WARN: Code duplicated, block: B:72:0x015c  */
    /* JADX WARN: Code duplicated, block: B:75:0x0166  */
    /* JADX WARN: Code duplicated, block: B:78:0x0187  */
    /* JADX WARN: Code duplicated, block: B:79:0x018a  */
    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        boolean z2;
        int i4;
        int i5;
        int i6;
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        Behavior behavior;
        int i7;
        View view;
        ArrayList arrayList;
        int i8;
        int i9;
        int i10;
        boolean z3;
        int i11;
        int i12;
        int i13;
        boolean zO;
        int iMax;
        CoordinatorLayout coordinatorLayout = this;
        coordinatorLayout.v();
        int childCount = coordinatorLayout.getChildCount();
        int i14 = 0;
        loop0: while (true) {
            if (i14 >= childCount) {
                z2 = false;
                break;
            }
            View childAt = coordinatorLayout.getChildAt(i14);
            SimpleArrayMap simpleArrayMap = coordinatorLayout.f0.f4156b;
            int i15 = simpleArrayMap.Z;
            for (int i16 = 0; i16 < i15; i16++) {
                ArrayList arrayList2 = (ArrayList) simpleArrayMap.j(i16);
                if (arrayList2 != null && arrayList2.contains(childAt)) {
                    z2 = true;
                    break loop0;
                }
            }
            i14++;
        }
        if (z2 != coordinatorLayout.q0) {
            if (z2) {
                if (coordinatorLayout.l0) {
                    if (coordinatorLayout.p0 == null) {
                        coordinatorLayout.p0 = coordinatorLayout.new OnPreDrawListener();
                    }
                    coordinatorLayout.getViewTreeObserver().addOnPreDrawListener(coordinatorLayout.p0);
                }
                coordinatorLayout.q0 = true;
            } else {
                if (coordinatorLayout.l0 && coordinatorLayout.p0 != null) {
                    coordinatorLayout.getViewTreeObserver().removeOnPreDrawListener(coordinatorLayout.p0);
                }
                coordinatorLayout.q0 = false;
            }
        }
        int paddingLeft = coordinatorLayout.getPaddingLeft();
        int paddingTop = coordinatorLayout.getPaddingTop();
        int paddingRight = coordinatorLayout.getPaddingRight();
        int paddingBottom = coordinatorLayout.getPaddingBottom();
        WeakHashMap weakHashMap = ViewCompat.f4466a;
        int layoutDirection = coordinatorLayout.getLayoutDirection();
        boolean z4 = layoutDirection == 1;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        int i17 = paddingLeft + paddingRight;
        int i18 = paddingTop + paddingBottom;
        int suggestedMinimumWidth = coordinatorLayout.getSuggestedMinimumWidth();
        int suggestedMinimumHeight = coordinatorLayout.getSuggestedMinimumHeight();
        boolean z5 = coordinatorLayout.r0 != null && coordinatorLayout.getFitsSystemWindows();
        ArrayList arrayList3 = coordinatorLayout.e0;
        int size3 = arrayList3.size();
        int i19 = 0;
        int iCombineMeasuredStates = 0;
        while (i19 < size3) {
            View view2 = (View) arrayList3.get(i19);
            int i20 = suggestedMinimumWidth;
            if (view2.getVisibility() == 8) {
                arrayList = arrayList3;
                i5 = size3;
                i11 = paddingLeft;
                i9 = paddingRight;
                suggestedMinimumWidth = i20;
                z3 = false;
                i13 = i19;
            } else {
                LayoutParams layoutParams = (LayoutParams) view2.getLayoutParams();
                int i21 = layoutParams.f4149e;
                if (i21 < 0 || mode == 0) {
                    i4 = suggestedMinimumHeight;
                } else {
                    int iL = coordinatorLayout.l(i21);
                    int i22 = layoutParams.f4148c;
                    if (i22 == 0) {
                        i22 = 8388661;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i22, layoutDirection) & 7;
                    i4 = suggestedMinimumHeight;
                    if ((absoluteGravity != 3 || z4) && !(absoluteGravity == 5 && z4)) {
                        if ((absoluteGravity == 5 && !z4) || (absoluteGravity == 3 && z4)) {
                            iMax = Math.max(0, iL - paddingLeft);
                        }
                        if (z5 || view2.getFitsSystemWindows()) {
                            iMakeMeasureSpec = i2;
                            iMakeMeasureSpec2 = i3;
                        } else {
                            int i23 = coordinatorLayout.r0.i() + coordinatorLayout.r0.h();
                            int iG = coordinatorLayout.r0.g() + coordinatorLayout.r0.j();
                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size - i23, mode);
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size2 - iG, mode2);
                        }
                        behavior = layoutParams.f4146a;
                        if (behavior != null) {
                            ArrayList arrayList4 = arrayList3;
                            int i24 = iMakeMeasureSpec;
                            arrayList = arrayList4;
                            z3 = false;
                            i9 = paddingRight;
                            i10 = i4;
                            i11 = paddingLeft;
                            i12 = i20;
                            i13 = i19;
                            int i25 = iMakeMeasureSpec2;
                            zO = behavior.o(this, view2, i24, i6, i25);
                            view = view2;
                            iMakeMeasureSpec = i24;
                            i8 = i6;
                            i7 = i25;
                            if (zO) {
                                coordinatorLayout = this;
                            }
                            int iMax2 = Math.max(i12, view.getMeasuredWidth() + i17 + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin);
                            int iMax3 = Math.max(i10, view.getMeasuredHeight() + i18 + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
                            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                            suggestedMinimumWidth = iMax2;
                            suggestedMinimumHeight = iMax3;
                        } else {
                            int i26 = i6;
                            i7 = iMakeMeasureSpec2;
                            view = view2;
                            arrayList = arrayList3;
                            i8 = i26;
                            i9 = paddingRight;
                            i10 = i4;
                            z3 = false;
                            i11 = paddingLeft;
                            i12 = i20;
                            i13 = i19;
                        }
                        coordinatorLayout = this;
                        coordinatorLayout.measureChildWithMargins(view, iMakeMeasureSpec, i8, i7, 0);
                        int iMax4 = Math.max(i12, view.getMeasuredWidth() + i17 + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin);
                        int iMax5 = Math.max(i10, view.getMeasuredHeight() + i18 + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
                        iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                        suggestedMinimumWidth = iMax4;
                        suggestedMinimumHeight = iMax5;
                    } else {
                        iMax = Math.max(0, (size - paddingRight) - iL);
                    }
                    int i27 = size3;
                    i6 = iMax;
                    i5 = i27;
                    if (z5) {
                        iMakeMeasureSpec = i2;
                        iMakeMeasureSpec2 = i3;
                    } else {
                        iMakeMeasureSpec = i2;
                        iMakeMeasureSpec2 = i3;
                    }
                    behavior = layoutParams.f4146a;
                    if (behavior != null) {
                        ArrayList arrayList5 = arrayList3;
                        int i28 = iMakeMeasureSpec;
                        arrayList = arrayList5;
                        z3 = false;
                        i9 = paddingRight;
                        i10 = i4;
                        i11 = paddingLeft;
                        i12 = i20;
                        i13 = i19;
                        int i29 = iMakeMeasureSpec2;
                        zO = behavior.o(this, view2, i28, i6, i29);
                        view = view2;
                        iMakeMeasureSpec = i28;
                        i8 = i6;
                        i7 = i29;
                        if (zO) {
                            coordinatorLayout = this;
                        }
                        int iMax6 = Math.max(i12, view.getMeasuredWidth() + i17 + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin);
                        int iMax7 = Math.max(i10, view.getMeasuredHeight() + i18 + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
                        iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                        suggestedMinimumWidth = iMax6;
                        suggestedMinimumHeight = iMax7;
                    } else {
                        int i210 = i6;
                        i7 = iMakeMeasureSpec2;
                        view = view2;
                        arrayList = arrayList3;
                        i8 = i210;
                        i9 = paddingRight;
                        i10 = i4;
                        z3 = false;
                        i11 = paddingLeft;
                        i12 = i20;
                        i13 = i19;
                    }
                    coordinatorLayout = this;
                    coordinatorLayout.measureChildWithMargins(view, iMakeMeasureSpec, i8, i7, 0);
                    int iMax8 = Math.max(i12, view.getMeasuredWidth() + i17 + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin);
                    int iMax9 = Math.max(i10, view.getMeasuredHeight() + i18 + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                    suggestedMinimumWidth = iMax8;
                    suggestedMinimumHeight = iMax9;
                }
                i5 = size3;
                i6 = 0;
                if (z5) {
                    iMakeMeasureSpec = i2;
                    iMakeMeasureSpec2 = i3;
                } else {
                    iMakeMeasureSpec = i2;
                    iMakeMeasureSpec2 = i3;
                }
                behavior = layoutParams.f4146a;
                if (behavior != null) {
                    ArrayList arrayList6 = arrayList3;
                    int i211 = iMakeMeasureSpec;
                    arrayList = arrayList6;
                    z3 = false;
                    i9 = paddingRight;
                    i10 = i4;
                    i11 = paddingLeft;
                    i12 = i20;
                    i13 = i19;
                    int i212 = iMakeMeasureSpec2;
                    zO = behavior.o(this, view2, i211, i6, i212);
                    view = view2;
                    iMakeMeasureSpec = i211;
                    i8 = i6;
                    i7 = i212;
                    if (zO) {
                        coordinatorLayout = this;
                    }
                    int iMax10 = Math.max(i12, view.getMeasuredWidth() + i17 + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin);
                    int iMax11 = Math.max(i10, view.getMeasuredHeight() + i18 + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                    suggestedMinimumWidth = iMax10;
                    suggestedMinimumHeight = iMax11;
                } else {
                    int i213 = i6;
                    i7 = iMakeMeasureSpec2;
                    view = view2;
                    arrayList = arrayList3;
                    i8 = i213;
                    i9 = paddingRight;
                    i10 = i4;
                    z3 = false;
                    i11 = paddingLeft;
                    i12 = i20;
                    i13 = i19;
                }
                coordinatorLayout = this;
                coordinatorLayout.measureChildWithMargins(view, iMakeMeasureSpec, i8, i7, 0);
                int iMax12 = Math.max(i12, view.getMeasuredWidth() + i17 + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin);
                int iMax13 = Math.max(i10, view.getMeasuredHeight() + i18 + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                suggestedMinimumWidth = iMax12;
                suggestedMinimumHeight = iMax13;
            }
            i19 = i13 + 1;
            arrayList3 = arrayList;
            size3 = i5;
            paddingLeft = i11;
            paddingRight = i9;
        }
        coordinatorLayout.setMeasuredDimension(View.resolveSizeAndState(suggestedMinimumWidth, i2, (-16777216) & iCombineMeasuredStates), View.resolveSizeAndState(suggestedMinimumHeight, i3, iCombineMeasuredStates << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z2) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.a(0)) {
                    Behavior behavior = layoutParams.f4146a;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        Behavior behavior;
        int childCount = getChildCount();
        boolean zP = false;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.a(0) && (behavior = layoutParams.f4146a) != null) {
                    zP |= behavior.p(view);
                }
            }
        }
        return zP;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
        k(view, i2, i3, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        n(view, i2, i3, i4, i5, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i2) {
        j(view, view2, i2, 0);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.X);
        SparseArray sparseArray = savedState.Z;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int id = childAt.getId();
            Behavior behavior = p(childAt).f4146a;
            if (id != -1 && behavior != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                behavior.t(childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableU;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int id = childAt.getId();
            Behavior behavior = ((LayoutParams) childAt.getLayoutParams()).f4146a;
            if (id != -1 && behavior != null && (parcelableU = behavior.u(childAt)) != null) {
                sparseArray.append(id, parcelableU);
            }
        }
        savedState.Z = sparseArray;
        return savedState;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i2) {
        return o(view, view2, i2, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        i(0, view);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002f  */
    /* JADX WARN: Code duplicated, block: B:15:0x0035 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0037  */
    /* JADX WARN: Code duplicated, block: B:18:0x004a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015 A[PHI: r3
  0x0015: PHI (r3v4 boolean) = (r3v2 boolean), (r3v5 boolean) binds: [B:10:0x0022, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zU;
        boolean zX;
        MotionEvent motionEventObtain;
        int actionMasked = motionEvent.getActionMasked();
        if (this.n0 == null) {
            zU = u(motionEvent, 1);
            if (!zU) {
                zX = false;
            }
            motionEventObtain = null;
            if (this.n0 == null) {
                zX |= super.onTouchEvent(motionEvent);
            } else if (zU) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(motionEventObtain);
            }
            if (motionEventObtain != null) {
                motionEventObtain.recycle();
            }
            if (actionMasked == 1 && actionMasked != 3) {
                return zX;
            }
            w(false);
            return zX;
        }
        zU = false;
        Behavior behavior = ((LayoutParams) this.n0.getLayoutParams()).f4146a;
        if (behavior != null) {
            zX = behavior.x(this, this.n0, motionEvent);
        } else {
            zX = false;
        }
        motionEventObtain = null;
        if (this.n0 == null) {
            zX |= super.onTouchEvent(motionEvent);
        } else if (zU) {
            long jUptimeMillis2 = SystemClock.uptimeMillis();
            motionEventObtain = MotionEvent.obtain(jUptimeMillis2, jUptimeMillis2, 3, 0.0f, 0.0f, 0);
            super.onTouchEvent(motionEventObtain);
        }
        if (motionEventObtain != null) {
            motionEventObtain.recycle();
        }
        if (actionMasked == 1) {
        }
        w(false);
        return zX;
    }

    public final boolean q(int i2, int i3, View view) {
        Pools.SynchronizedPool synchronizedPool = B0;
        Rect rectC = c();
        g(rectC, view);
        try {
            return rectC.contains(i2, i3);
        } finally {
            rectC.setEmpty();
            synchronizedPool.a(rectC);
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0271  */
    /* JADX WARN: Code duplicated, block: B:33:0x00df  */
    public final void r(int i2) {
        Rect rect;
        int i3;
        Rect rect2;
        int i4;
        ArrayList arrayList;
        int i5;
        boolean zJ;
        boolean z2;
        boolean z3;
        int width;
        int i6;
        int i7;
        int i8;
        int height;
        int i9;
        int i10;
        int i11;
        Rect rect3;
        Pools.SynchronizedPool synchronizedPool;
        Behavior behavior;
        WeakHashMap weakHashMap = ViewCompat.f4466a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList2 = this.e0;
        int size = arrayList2.size();
        Rect rectC = c();
        Rect rectC2 = c();
        Rect rectC3 = c();
        int i12 = 0;
        while (true) {
            Pools.SynchronizedPool synchronizedPool2 = B0;
            if (i12 >= size) {
                Rect rect4 = rectC2;
                Rect rect5 = rectC3;
                rectC.setEmpty();
                synchronizedPool2.a(rectC);
                rect4.setEmpty();
                synchronizedPool2.a(rect4);
                rect5.setEmpty();
                synchronizedPool2.a(rect5);
                return;
            }
            View view = (View) arrayList2.get(i12);
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (i2 != 0 || view.getVisibility() != 8) {
                int i13 = 0;
                while (i13 < i12) {
                    if (layoutParams.f4152l == ((View) arrayList2.get(i13))) {
                        LayoutParams layoutParams2 = (LayoutParams) view.getLayoutParams();
                        if (layoutParams2.k != null) {
                            Rect rectC4 = c();
                            Rect rectC5 = c();
                            Rect rect6 = rectC3;
                            Rect rectC6 = c();
                            g(rectC4, layoutParams2.k);
                            e(view, rectC5, false);
                            int measuredWidth = view.getMeasuredWidth();
                            Pools.SynchronizedPool synchronizedPool3 = synchronizedPool2;
                            int measuredHeight = view.getMeasuredHeight();
                            synchronizedPool = synchronizedPool3;
                            h(layoutDirection, rectC4, rectC6, layoutParams2, measuredWidth, measuredHeight);
                            rect3 = rect6;
                            boolean z4 = (rectC6.left == rectC5.left && rectC6.top == rectC5.top) ? false : true;
                            d(layoutParams2, rectC6, measuredWidth, measuredHeight);
                            int i14 = rectC6.left - rectC5.left;
                            int i15 = rectC6.top - rectC5.top;
                            if (i14 != 0) {
                                WeakHashMap weakHashMap2 = ViewCompat.f4466a;
                                view.offsetLeftAndRight(i14);
                            }
                            if (i15 != 0) {
                                WeakHashMap weakHashMap3 = ViewCompat.f4466a;
                                view.offsetTopAndBottom(i15);
                            }
                            if (z4 && (behavior = layoutParams2.f4146a) != null) {
                                behavior.j(this, view, layoutParams2.k);
                            }
                            rectC4.setEmpty();
                            synchronizedPool.a(rectC4);
                            rectC5.setEmpty();
                            synchronizedPool.a(rectC5);
                            rectC6.setEmpty();
                            synchronizedPool.a(rectC6);
                        } else {
                            rect3 = rectC3;
                            synchronizedPool = synchronizedPool2;
                        }
                    } else {
                        rect3 = rectC3;
                        synchronizedPool = synchronizedPool2;
                    }
                    synchronizedPool2 = synchronizedPool;
                    i13++;
                    rectC2 = rectC2;
                    i12 = i12;
                    arrayList2 = arrayList2;
                    size = size;
                    rectC3 = rect3;
                }
                ArrayList arrayList3 = arrayList2;
                rect = rectC2;
                Rect rect7 = rectC3;
                i3 = i12;
                Pools.Pool pool = synchronizedPool2;
                int i16 = size;
                e(view, rect, true);
                if (layoutParams.g != 0 && !rect.isEmpty()) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(layoutParams.g, layoutDirection);
                    int i17 = absoluteGravity & 112;
                    if (i17 == 48) {
                        rectC.top = Math.max(rectC.top, rect.bottom);
                    } else if (i17 == 80) {
                        rectC.bottom = Math.max(rectC.bottom, getHeight() - rect.top);
                    }
                    int i18 = absoluteGravity & 7;
                    if (i18 == 3) {
                        rectC.left = Math.max(rectC.left, rect.right);
                    } else if (i18 == 5) {
                        rectC.right = Math.max(rectC.right, getWidth() - rect.left);
                    }
                }
                if (layoutParams.f4150h != 0 && view.getVisibility() == 0) {
                    WeakHashMap weakHashMap4 = ViewCompat.f4466a;
                    if (view.isLaidOut() && view.getWidth() > 0 && view.getHeight() > 0) {
                        LayoutParams layoutParams3 = (LayoutParams) view.getLayoutParams();
                        Behavior behavior2 = layoutParams3.f4146a;
                        Rect rectC7 = c();
                        Rect rectC8 = c();
                        rectC8.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                        if (behavior2 == null || !behavior2.g(view)) {
                            rectC7.set(rectC8);
                        } else if (!rectC8.contains(rectC7)) {
                            throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + rectC7.toShortString() + " | Bounds:" + rectC8.toShortString());
                        }
                        rectC8.setEmpty();
                        pool.a(rectC8);
                        if (rectC7.isEmpty()) {
                            rectC7.setEmpty();
                            pool.a(rectC7);
                        } else {
                            int absoluteGravity2 = Gravity.getAbsoluteGravity(layoutParams3.f4150h, layoutDirection);
                            if ((absoluteGravity2 & 48) != 48 || (i10 = (rectC7.top - ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin) - layoutParams3.j) >= (i11 = rectC.top)) {
                                z2 = false;
                            } else {
                                y(i11 - i10, view);
                                z2 = true;
                            }
                            if ((absoluteGravity2 & 80) == 80 && (height = ((getHeight() - rectC7.bottom) - ((ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin) + layoutParams3.j) < (i9 = rectC.bottom)) {
                                y(height - i9, view);
                                z2 = true;
                            }
                            if (!z2) {
                                y(0, view);
                            }
                            if ((absoluteGravity2 & 3) != 3 || (i7 = (rectC7.left - ((ViewGroup.MarginLayoutParams) layoutParams3).leftMargin) - layoutParams3.f4151i) >= (i8 = rectC.left)) {
                                z3 = false;
                            } else {
                                x(i8 - i7, view);
                                z3 = true;
                            }
                            if ((absoluteGravity2 & 5) == 5 && (width = ((getWidth() - rectC7.right) - ((ViewGroup.MarginLayoutParams) layoutParams3).rightMargin) + layoutParams3.f4151i) < (i6 = rectC.right)) {
                                x(width - i6, view);
                                z3 = true;
                            }
                            if (!z3) {
                                x(0, view);
                            }
                            rectC7.setEmpty();
                            pool.a(rectC7);
                        }
                    }
                }
                if (i2 != 2) {
                    rect2 = rect7;
                    rect2.set(((LayoutParams) view.getLayoutParams()).f4154p);
                    if (rect2.equals(rect)) {
                        arrayList = arrayList3;
                        i4 = i16;
                    } else {
                        ((LayoutParams) view.getLayoutParams()).f4154p.set(rect);
                    }
                } else {
                    rect2 = rect7;
                }
                int i19 = i3 + 1;
                i4 = i16;
                while (true) {
                    arrayList = arrayList3;
                    if (i19 >= i4) {
                        break;
                    }
                    View view2 = (View) arrayList.get(i19);
                    LayoutParams layoutParams4 = (LayoutParams) view2.getLayoutParams();
                    Behavior behavior3 = layoutParams4.f4146a;
                    if (behavior3 == null || !behavior3.h(view2, view)) {
                        i5 = 1;
                    } else if (i2 == 0 && layoutParams4.o) {
                        layoutParams4.o = false;
                        i5 = 1;
                    } else {
                        if (i2 != 2) {
                            zJ = behavior3.j(this, view2, view);
                        } else {
                            behavior3.k(this, view);
                            zJ = true;
                        }
                        i5 = 1;
                        if (i2 == 1) {
                            layoutParams4.o = zJ;
                        }
                    }
                    i19 += i5;
                    arrayList3 = arrayList;
                }
            } else {
                int i20 = size;
                arrayList = arrayList2;
                i4 = i20;
                rect = rectC2;
                rect2 = rectC3;
                i3 = i12;
            }
            i12 = i3 + 1;
            ArrayList arrayList4 = arrayList;
            size = i4;
            arrayList2 = arrayList4;
            rectC3 = rect2;
            rectC2 = rect;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        Behavior behavior = ((LayoutParams) view.getLayoutParams()).f4146a;
        if (behavior == null || !behavior.s(this, view, rect, z2)) {
            return super.requestChildRectangleOnScreen(view, rect, z2);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z2) {
        super.requestDisallowInterceptTouchEvent(z2);
        if (!z2 || this.k0) {
            return;
        }
        w(false);
        this.k0 = true;
    }

    public final void s(int i2, View view) {
        int i3;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        View view2 = layoutParams.k;
        if (view2 == null && layoutParams.f != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        Pools.SynchronizedPool synchronizedPool = B0;
        if (view2 != null) {
            Rect rectC = c();
            Rect rectC2 = c();
            try {
                g(rectC, view2);
                LayoutParams layoutParams2 = (LayoutParams) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                h(i2, rectC, rectC2, layoutParams2, measuredWidth, measuredHeight);
                d(layoutParams2, rectC2, measuredWidth, measuredHeight);
                view.layout(rectC2.left, rectC2.top, rectC2.right, rectC2.bottom);
                return;
            } finally {
                rectC.setEmpty();
                synchronizedPool.a(rectC);
                rectC2.setEmpty();
                synchronizedPool.a(rectC2);
            }
        }
        int i4 = layoutParams.f4149e;
        if (i4 < 0) {
            LayoutParams layoutParams3 = (LayoutParams) view.getLayoutParams();
            Rect rectC3 = c();
            rectC3.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams3).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) layoutParams3).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin);
            if (this.r0 != null) {
                WeakHashMap weakHashMap = ViewCompat.f4466a;
                if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                    rectC3.left = this.r0.h() + rectC3.left;
                    rectC3.top = this.r0.j() + rectC3.top;
                    rectC3.right -= this.r0.i();
                    rectC3.bottom -= this.r0.g();
                }
            }
            Rect rectC4 = c();
            int i5 = layoutParams3.f4148c;
            if ((i5 & 7) == 0) {
                i5 |= 8388611;
            }
            if ((i5 & 112) == 0) {
                i5 |= 48;
            }
            Gravity.apply(i5, view.getMeasuredWidth(), view.getMeasuredHeight(), rectC3, rectC4, i2);
            view.layout(rectC4.left, rectC4.top, rectC4.right, rectC4.bottom);
            rectC3.setEmpty();
            synchronizedPool.a(rectC3);
            rectC4.setEmpty();
            synchronizedPool.a(rectC4);
            return;
        }
        LayoutParams layoutParams4 = (LayoutParams) view.getLayoutParams();
        int i6 = layoutParams4.f4148c;
        if (i6 == 0) {
            i6 = 8388661;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i6, i2);
        int i7 = absoluteGravity & 7;
        int i8 = absoluteGravity & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth2 = view.getMeasuredWidth();
        int measuredHeight2 = view.getMeasuredHeight();
        if (i2 == 1) {
            i4 = width - i4;
        }
        int iL = l(i4) - measuredWidth2;
        if (i7 == 1) {
            iL += measuredWidth2 / 2;
        } else if (i7 == 5) {
            iL += measuredWidth2;
        }
        if (i8 != 16) {
            i3 = i8 != 80 ? 0 : measuredHeight2;
        } else {
            i3 = measuredHeight2 / 2;
        }
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams4).leftMargin, Math.min(iL, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) layoutParams4).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin, Math.min(i3, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin));
        view.layout(iMax, iMax2, measuredWidth2 + iMax, measuredHeight2 + iMax2);
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z2) {
        super.setFitsSystemWindows(z2);
        z();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.u0 = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.t0;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.t0 = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.t0.setState(getDrawableState());
                }
                Drawable drawable3 = this.t0;
                WeakHashMap weakHashMap = ViewCompat.f4466a;
                DrawableCompat.h(drawable3, getLayoutDirection());
                this.t0.setVisible(getVisibility() == 0, false);
                this.t0.setCallback(this);
            }
            WeakHashMap weakHashMap2 = ViewCompat.f4466a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarBackgroundColor(int i2) {
        setStatusBarBackground(new ColorDrawable(i2));
    }

    public void setStatusBarBackgroundResource(int i2) {
        setStatusBarBackground(i2 != 0 ? ContextCompat.getDrawable(getContext(), i2) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        boolean z2 = i2 == 0;
        Drawable drawable = this.t0;
        if (drawable == null || drawable.isVisible() == z2) {
            return;
        }
        this.t0.setVisible(z2, false);
    }

    public final void t(int i2, int i3, int i4, View view) {
        measureChildWithMargins(view, i2, i3, i4, 0);
    }

    public final boolean u(MotionEvent motionEvent, int i2) {
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.g0;
        arrayList.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i3 = childCount - 1; i3 >= 0; i3--) {
            arrayList.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i3) : i3));
        }
        Comparator comparator = A0;
        if (comparator != null) {
            Collections.sort(arrayList, comparator);
        }
        int size = arrayList.size();
        MotionEvent motionEventObtain = null;
        boolean zM = false;
        for (int i4 = 0; i4 < size; i4++) {
            View view = (View) arrayList.get(i4);
            Behavior behavior = ((LayoutParams) view.getLayoutParams()).f4146a;
            if (zM && actionMasked != 0) {
                if (behavior != null) {
                    if (motionEventObtain == null) {
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    if (i2 == 0) {
                        behavior.m(this, view, motionEventObtain);
                    } else if (i2 == 1) {
                        behavior.x(this, view, motionEventObtain);
                    }
                }
            } else if (!zM && behavior != null) {
                if (i2 == 0) {
                    zM = behavior.m(this, view, motionEvent);
                } else if (i2 == 1) {
                    zM = behavior.x(this, view, motionEvent);
                }
                if (zM) {
                    this.n0 = view;
                }
            }
        }
        arrayList.clear();
        return zM;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0083 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0076 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x0078  */
    /* JADX WARN: Code duplicated, block: B:36:0x007e  */
    /* JADX WARN: Code duplicated, block: B:39:0x008b  */
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
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:40:0x008f
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public final void v() {
        /*
            Method dump skipped, instruction units count: 392
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.v():void");
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.t0;
    }

    public final void w(boolean z2) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            Behavior behavior = ((LayoutParams) childAt.getLayoutParams()).f4146a;
            if (behavior != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z2) {
                    behavior.m(this, childAt, motionEventObtain);
                } else {
                    behavior.x(this, childAt, motionEventObtain);
                }
                motionEventObtain.recycle();
            }
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            ((LayoutParams) getChildAt(i3).getLayoutParams()).getClass();
        }
        this.n0 = null;
        this.k0 = false;
    }

    public final void z() {
        WeakHashMap weakHashMap = ViewCompat.f4466a;
        if (!getFitsSystemWindows()) {
            ViewCompat.G(this, null);
            return;
        }
        if (this.v0 == null) {
            this.v0 = new OnApplyWindowInsetsListener() { // from class: androidx.coordinatorlayout.widget.CoordinatorLayout.1
                @Override // androidx.core.view.OnApplyWindowInsetsListener
                public final WindowInsetsCompat d(View view, WindowInsetsCompat windowInsetsCompat) {
                    CoordinatorLayout coordinatorLayout = CoordinatorLayout.this;
                    if (!Objects.equals(coordinatorLayout.r0, windowInsetsCompat)) {
                        coordinatorLayout.r0 = windowInsetsCompat;
                        boolean z2 = windowInsetsCompat.j() > 0;
                        coordinatorLayout.s0 = z2;
                        coordinatorLayout.setWillNotDraw(!z2 && coordinatorLayout.getBackground() == null);
                        if (!windowInsetsCompat.m()) {
                            int childCount = coordinatorLayout.getChildCount();
                            for (int i2 = 0; i2 < childCount; i2++) {
                                View childAt = coordinatorLayout.getChildAt(i2);
                                WeakHashMap weakHashMap2 = ViewCompat.f4466a;
                                if (childAt.getFitsSystemWindows() && ((LayoutParams) childAt.getLayoutParams()).f4146a != null && windowInsetsCompat.m()) {
                                    break;
                                }
                            }
                        }
                        coordinatorLayout.requestLayout();
                    }
                    return windowInsetsCompat;
                }
            };
        }
        ViewCompat.G(this, this.v0);
        setSystemUiVisibility(1280);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            return new LayoutParams((LayoutParams) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Behavior f4146a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f4147b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f4148c;
        public int d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f4149e;
        public final int f;
        public final int g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f4150h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f4151i;
        public int j;
        public View k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public View f4152l;
        public boolean m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public boolean f4153n;
        public boolean o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final Rect f4154p;

        public LayoutParams() {
            super(-2, -2);
            this.f4147b = false;
            this.f4148c = 0;
            this.d = 0;
            this.f4149e = -1;
            this.f = -1;
            this.g = 0;
            this.f4150h = 0;
            this.f4154p = new Rect();
        }

        public final boolean a(int i2) {
            if (i2 == 0) {
                return this.m;
            }
            if (i2 != 1) {
                return false;
            }
            return this.f4153n;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            Behavior behavior;
            super(context, attributeSet);
            this.f4147b = false;
            this.f4148c = 0;
            this.d = 0;
            this.f4149e = -1;
            this.f = -1;
            this.g = 0;
            this.f4150h = 0;
            this.f4154p = new Rect();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.coordinatorlayout.R.styleable.f4145b);
            this.f4148c = typedArrayObtainStyledAttributes.getInteger(0, 0);
            this.f = typedArrayObtainStyledAttributes.getResourceId(1, -1);
            this.d = typedArrayObtainStyledAttributes.getInteger(2, 0);
            this.f4149e = typedArrayObtainStyledAttributes.getInteger(6, -1);
            this.g = typedArrayObtainStyledAttributes.getInt(5, 0);
            this.f4150h = typedArrayObtainStyledAttributes.getInt(4, 0);
            boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(3);
            this.f4147b = zHasValue;
            if (zHasValue) {
                String string = typedArrayObtainStyledAttributes.getString(3);
                String str = CoordinatorLayout.x0;
                if (TextUtils.isEmpty(string)) {
                    behavior = null;
                } else {
                    if (string.startsWith(mo.ono)) {
                        string = context.getPackageName() + string;
                    } else if (string.indexOf(46) < 0) {
                        String str2 = CoordinatorLayout.x0;
                        if (!TextUtils.isEmpty(str2)) {
                            string = str2 + '.' + string;
                        }
                    }
                    try {
                        ThreadLocal threadLocal = CoordinatorLayout.z0;
                        Map map = (Map) threadLocal.get();
                        if (map == null) {
                            map = new HashMap();
                            threadLocal.set(map);
                        }
                        Constructor<?> constructor = (Constructor) map.get(string);
                        if (constructor == null) {
                            constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.y0);
                            constructor.setAccessible(true);
                            map.put(string, constructor);
                        }
                        behavior = (Behavior) constructor.newInstance(context, attributeSet);
                    } catch (Exception e2) {
                        throw new RuntimeException(a.C("Could not inflate Behavior subclass ", string), e2);
                    }
                }
                this.f4146a = behavior;
            }
            typedArrayObtainStyledAttributes.recycle();
            Behavior behavior2 = this.f4146a;
            if (behavior2 != null) {
                behavior2.i(this);
            }
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.MarginLayoutParams) layoutParams);
            this.f4147b = false;
            this.f4148c = 0;
            this.d = 0;
            this.f4149e = -1;
            this.f = -1;
            this.g = 0;
            this.f4150h = 0;
            this.f4154p = new Rect();
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f4147b = false;
            this.f4148c = 0;
            this.d = 0;
            this.f4149e = -1;
            this.f = -1;
            this.g = 0;
            this.f4150h = 0;
            this.f4154p = new Rect();
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f4147b = false;
            this.f4148c = 0;
            this.d = 0;
            this.f4149e = -1;
            this.f = -1;
            this.g = 0;
            this.f4150h = 0;
            this.f4154p = new Rect();
        }
    }

    public static abstract class Behavior<V extends View> {
        public boolean g(View view) {
            return false;
        }

        public boolean h(View view, View view2) {
            return false;
        }

        public void i(LayoutParams layoutParams) {
        }

        public boolean j(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return false;
        }

        public void l() {
        }

        public boolean m(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return false;
        }

        public boolean n(CoordinatorLayout coordinatorLayout, View view, int i2) {
            return false;
        }

        public boolean o(CoordinatorLayout coordinatorLayout, View view, int i2, int i3, int i4) {
            return false;
        }

        public boolean p(View view) {
            return false;
        }

        public void q(CoordinatorLayout coordinatorLayout, View view, View view2, int i2, int i3, int[] iArr, int i4) {
        }

        public void r(CoordinatorLayout coordinatorLayout, View view, int i2, int i3, int i4, int[] iArr) {
            iArr[0] = iArr[0] + i3;
            iArr[1] = iArr[1] + i4;
        }

        public boolean s(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z2) {
            return false;
        }

        public Parcelable u(View view) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        public boolean v(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i2, int i3) {
            return false;
        }

        public void w(CoordinatorLayout coordinatorLayout, View view, View view2, int i2) {
        }

        public boolean x(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return false;
        }

        public void k(CoordinatorLayout coordinatorLayout, View view) {
        }

        public void t(View view, Parcelable parcelable) {
        }
    }
}
