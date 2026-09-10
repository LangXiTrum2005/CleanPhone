package androidx.drawerlayout.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.a;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.content.ContextCompat;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.customview.view.AbsSavedState;
import androidx.customview.widget.Openable;
import androidx.customview.widget.ViewDragHelper;
import java.util.ArrayList;
import java.util.WeakHashMap;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
public class DrawerLayout extends ViewGroup implements Openable {
    public static final int[] q0 = {R.attr.layout_gravity};
    public static final boolean r0;
    public static final boolean s0;
    public static final boolean t0;
    public float e0;
    public float f0;
    public boolean g0;
    public boolean h0;
    public int i0;
    public int j0;
    public int k0;
    public int l0;
    public DrawerListener m0;
    public Drawable n0;
    public WindowInsets o0;
    public boolean p0;

    /* JADX INFO: renamed from: androidx.drawerlayout.widget.DrawerLayout$1, reason: invalid class name */
    public class AnonymousClass1 implements AccessibilityViewCommand {
        @Override // androidx.core.view.accessibility.AccessibilityViewCommand
        public final boolean d(View view) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: androidx.drawerlayout.widget.DrawerLayout$2, reason: invalid class name */
    class AnonymousClass2 implements View.OnApplyWindowInsetsListener {
        @Override // android.view.View.OnApplyWindowInsetsListener
        public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            DrawerLayout drawerLayout = (DrawerLayout) view;
            boolean z2 = false;
            boolean z3 = windowInsets.getSystemWindowInsetTop() > 0;
            drawerLayout.o0 = windowInsets;
            drawerLayout.p0 = z3;
            if (!z3 && drawerLayout.getBackground() == null) {
                z2 = true;
            }
            drawerLayout.setWillNotDraw(z2);
            drawerLayout.requestLayout();
            return windowInsets.consumeSystemWindowInsets();
        }
    }

    public class AccessibilityDelegate extends AccessibilityDelegateCompat {
        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
            if (accessibilityEvent.getEventType() != 32) {
                return this.f4417a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
            }
            accessibilityEvent.getText();
            throw null;
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final void c(View view, AccessibilityEvent accessibilityEvent) {
            super.c(view, accessibilityEvent);
            accessibilityEvent.setClassName("androidx.drawerlayout.widget.DrawerLayout");
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final void d(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            boolean z2 = DrawerLayout.r0;
            View.AccessibilityDelegate accessibilityDelegate = this.f4417a;
            AccessibilityNodeInfo accessibilityNodeInfo = accessibilityNodeInfoCompat.f4534a;
            if (z2) {
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            } else {
                AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(accessibilityNodeInfo);
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoObtain);
                accessibilityNodeInfoCompat.f4535b = -1;
                accessibilityNodeInfo.setSource(view);
                WeakHashMap weakHashMap = ViewCompat.f4466a;
                Object parentForAccessibility = view.getParentForAccessibility();
                if (parentForAccessibility instanceof View) {
                    accessibilityNodeInfo.setParent((View) parentForAccessibility);
                }
                accessibilityNodeInfoObtain.getBoundsInScreen(null);
                accessibilityNodeInfo.setBoundsInScreen(null);
                accessibilityNodeInfo.setVisibleToUser(accessibilityNodeInfoObtain.isVisibleToUser());
                accessibilityNodeInfo.setPackageName(accessibilityNodeInfoObtain.getPackageName());
                accessibilityNodeInfoCompat.j(accessibilityNodeInfoObtain.getClassName());
                accessibilityNodeInfoCompat.m(accessibilityNodeInfoObtain.getContentDescription());
                accessibilityNodeInfo.setEnabled(accessibilityNodeInfoObtain.isEnabled());
                accessibilityNodeInfo.setFocused(accessibilityNodeInfoObtain.isFocused());
                accessibilityNodeInfo.setAccessibilityFocused(accessibilityNodeInfoObtain.isAccessibilityFocused());
                accessibilityNodeInfo.setSelected(accessibilityNodeInfoObtain.isSelected());
                accessibilityNodeInfoCompat.a(accessibilityNodeInfoObtain.getActions());
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = viewGroup.getChildAt(i2);
                    if (DrawerLayout.e(childAt)) {
                        accessibilityNodeInfo.addChild(childAt);
                    }
                }
            }
            accessibilityNodeInfoCompat.j("androidx.drawerlayout.widget.DrawerLayout");
            accessibilityNodeInfo.setFocusable(false);
            accessibilityNodeInfo.setFocused(false);
            accessibilityNodeInfoCompat.h(AccessibilityNodeInfoCompat.AccessibilityActionCompat.f4536e);
            accessibilityNodeInfoCompat.h(AccessibilityNodeInfoCompat.AccessibilityActionCompat.f);
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (DrawerLayout.r0 || DrawerLayout.e(view)) {
                return this.f4417a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
            }
            return false;
        }
    }

    public static final class ChildAccessibilityDelegate extends AccessibilityDelegateCompat {
        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final void d(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            View.AccessibilityDelegate accessibilityDelegate = this.f4417a;
            AccessibilityNodeInfo accessibilityNodeInfo = accessibilityNodeInfoCompat.f4534a;
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            if (DrawerLayout.e(view)) {
                return;
            }
            accessibilityNodeInfo.setParent(null);
        }
    }

    public interface DrawerListener {
        void a();
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f4948a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f4949b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f4950c;
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new AnonymousClass1();
        public int Z;
        public int e0;
        public int f0;
        public int g0;
        public int h0;

        /* JADX INFO: renamed from: androidx.drawerlayout.widget.DrawerLayout$SavedState$1, reason: invalid class name */
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
            this.Z = 0;
            this.Z = parcel.readInt();
            this.e0 = parcel.readInt();
            this.f0 = parcel.readInt();
            this.g0 = parcel.readInt();
            this.h0 = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.Z);
            parcel.writeInt(this.e0);
            parcel.writeInt(this.f0);
            parcel.writeInt(this.g0);
            parcel.writeInt(this.h0);
        }
    }

    public class ViewDragCallback extends ViewDragHelper.Callback {

        /* JADX INFO: renamed from: androidx.drawerlayout.widget.DrawerLayout$ViewDragCallback$1, reason: invalid class name */
        public class AnonymousClass1 implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                throw null;
            }
        }

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
            ((LayoutParams) view.getLayoutParams()).getClass();
            throw null;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final void f(int i2) {
            throw null;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final void g(int i2, int i3, View view) {
            view.getWidth();
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

    static {
        int i2 = Build.VERSION.SDK_INT;
        r0 = true;
        s0 = true;
        t0 = i2 >= 29;
    }

    public static boolean e(View view) {
        WeakHashMap weakHashMap = ViewCompat.f4466a;
        return (view.getImportantForAccessibility() == 4 || view.getImportantForAccessibility() == 2) ? false : true;
    }

    public static boolean f(View view) {
        return ((LayoutParams) view.getLayoutParams()).f4948a == 0;
    }

    public static boolean g(View view) {
        if (h(view)) {
            return (((LayoutParams) view.getLayoutParams()).f4950c & 1) == 1;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public static boolean h(View view) {
        int i2 = ((LayoutParams) view.getLayoutParams()).f4948a;
        WeakHashMap weakHashMap = ViewCompat.f4466a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i2, view.getLayoutDirection());
        return ((absoluteGravity & 3) == 0 && (absoluteGravity & 5) == 0) ? false : true;
    }

    public final boolean a(View view) {
        int i2 = ((LayoutParams) view.getLayoutParams()).f4948a;
        WeakHashMap weakHashMap = ViewCompat.f4466a;
        return (Gravity.getAbsoluteGravity(i2, getLayoutDirection()) & 3) == 3;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i2, int i3) {
        if (getDescendantFocusability() == 393216) {
            return;
        }
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (!h(childAt)) {
                throw null;
            }
            if (g(childAt)) {
                childAt.addFocusables(arrayList, i2, i3);
                z2 = true;
            }
        }
        if (!z2) {
            throw null;
        }
        throw null;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        View childAt;
        super.addView(view, i2, layoutParams);
        int childCount = getChildCount();
        int i3 = 0;
        while (true) {
            if (i3 >= childCount) {
                childAt = null;
                break;
            }
            childAt = getChildAt(i3);
            if ((((LayoutParams) childAt.getLayoutParams()).f4950c & 1) == 1) {
                break;
            } else {
                i3++;
            }
        }
        if (childAt != null || h(view)) {
            WeakHashMap weakHashMap = ViewCompat.f4466a;
            view.setImportantForAccessibility(4);
        } else {
            WeakHashMap weakHashMap2 = ViewCompat.f4466a;
            view.setImportantForAccessibility(1);
        }
        if (r0) {
            return;
        }
        ViewCompat.z(view, null);
    }

    public final void b(boolean z2) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (h(childAt)) {
                if (!z2) {
                    childAt.getWidth();
                    if (a(childAt)) {
                        childAt.getTop();
                        throw null;
                    }
                    getWidth();
                    childAt.getTop();
                    throw null;
                }
                layoutParams.getClass();
            }
        }
        throw null;
    }

    public final View c(int i2) {
        WeakHashMap weakHashMap = ViewCompat.f4466a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i2, getLayoutDirection()) & 7;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            int i4 = ((LayoutParams) childAt.getLayoutParams()).f4948a;
            WeakHashMap weakHashMap2 = ViewCompat.f4466a;
            if ((Gravity.getAbsoluteGravity(i4, getLayoutDirection()) & 7) == absoluteGravity) {
                return childAt;
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void computeScroll() {
        int childCount = getChildCount();
        float fMax = 0.0f;
        for (int i2 = 0; i2 < childCount; i2++) {
            fMax = Math.max(fMax, ((LayoutParams) getChildAt(i2).getLayoutParams()).f4949b);
        }
        this.f0 = fMax;
        throw null;
    }

    public final int d(View view) {
        if (!h(view)) {
            throw new IllegalArgumentException("View " + view + " is not a drawer");
        }
        int i2 = ((LayoutParams) view.getLayoutParams()).f4948a;
        WeakHashMap weakHashMap = ViewCompat.f4466a;
        int layoutDirection = getLayoutDirection();
        if (i2 == 3) {
            int i3 = this.i0;
            if (i3 != 3) {
                return i3;
            }
            int i4 = layoutDirection == 0 ? this.k0 : this.l0;
            if (i4 != 3) {
                return i4;
            }
            return 0;
        }
        if (i2 == 5) {
            int i5 = this.j0;
            if (i5 != 3) {
                return i5;
            }
            int i6 = layoutDirection == 0 ? this.l0 : this.k0;
            if (i6 != 3) {
                return i6;
            }
            return 0;
        }
        if (i2 == 8388611) {
            int i7 = this.k0;
            if (i7 != 3) {
                return i7;
            }
            int i8 = layoutDirection == 0 ? this.i0 : this.j0;
            if (i8 != 3) {
                return i8;
            }
            return 0;
        }
        if (i2 != 8388613) {
            return 0;
        }
        int i9 = this.l0;
        if (i9 != 3) {
            return i9;
        }
        int i10 = layoutDirection == 0 ? this.j0 : this.i0;
        if (i10 != 3) {
            return i10;
        }
        return 0;
    }

    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.f0 <= 0.0f) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount == 0) {
            return false;
        }
        motionEvent.getX();
        motionEvent.getY();
        int i2 = childCount - 1;
        if (i2 < 0) {
            return false;
        }
        getChildAt(i2).getHitRect(null);
        throw null;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        Drawable background;
        int height = getHeight();
        boolean zF = f(view);
        int width = getWidth();
        int iSave = canvas.save();
        if (zF) {
            int childCount = getChildCount();
            int i2 = 0;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt != view && childAt.getVisibility() == 0 && (background = childAt.getBackground()) != null && background.getOpacity() == -1 && h(childAt) && childAt.getHeight() >= height) {
                    if (a(childAt)) {
                        int right = childAt.getRight();
                        if (right > i2) {
                            i2 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < width) {
                            width = left;
                        }
                    }
                }
            }
            canvas.clipRect(i2, 0, width, getHeight());
        }
        boolean zDrawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(iSave);
        if (this.f0 <= 0.0f || !zF) {
            return zDrawChild;
        }
        throw null;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        LayoutParams layoutParams = new LayoutParams(-1, -1);
        layoutParams.f4948a = 0;
        return layoutParams;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            LayoutParams layoutParams2 = (LayoutParams) layoutParams;
            LayoutParams layoutParams3 = new LayoutParams(layoutParams2);
            layoutParams3.f4948a = 0;
            layoutParams3.f4948a = layoutParams2.f4948a;
            return layoutParams3;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            LayoutParams layoutParams4 = new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
            layoutParams4.f4948a = 0;
            return layoutParams4;
        }
        LayoutParams layoutParams5 = new LayoutParams(layoutParams);
        layoutParams5.f4948a = 0;
        return layoutParams5;
    }

    public float getDrawerElevation() {
        if (s0) {
            return this.e0;
        }
        return 0.0f;
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.n0;
    }

    public final void i(View view) {
        if (!h(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (!this.h0) {
            layoutParams.f4950c |= 2;
            if (a(view)) {
                view.getTop();
                throw null;
            }
            getWidth();
            view.getWidth();
            view.getTop();
            throw null;
        }
        layoutParams.f4949b = 1.0f;
        layoutParams.f4950c = 1;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt == view) {
                WeakHashMap weakHashMap = ViewCompat.f4466a;
                childAt.setImportantForAccessibility(1);
            } else {
                WeakHashMap weakHashMap2 = ViewCompat.f4466a;
                childAt.setImportantForAccessibility(4);
            }
        }
        AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat = AccessibilityNodeInfoCompat.AccessibilityActionCompat.f4539l;
        ViewCompat.v(accessibilityActionCompat.a(), view);
        ViewCompat.s(0, view);
        if (g(view) && d(view) != 2) {
            ViewCompat.w(view, accessibilityActionCompat, null);
        }
        invalidate();
    }

    public final void j(int i2, int i3) {
        View viewC;
        WeakHashMap weakHashMap = ViewCompat.f4466a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i3, getLayoutDirection());
        if (i3 == 3) {
            this.i0 = i2;
        } else if (i3 == 5) {
            this.j0 = i2;
        } else if (i3 == 8388611) {
            this.k0 = i2;
        } else if (i3 == 8388613) {
            this.l0 = i2;
        }
        if (i2 != 0) {
            throw null;
        }
        if (i2 != 1) {
            if (i2 == 2 && (viewC = c(absoluteGravity)) != null) {
                i(viewC);
                return;
            }
            return;
        }
        View viewC2 = c(absoluteGravity);
        if (viewC2 != null) {
            if (!h(viewC2)) {
                throw new IllegalArgumentException("View " + viewC2 + " is not a sliding drawer");
            }
            LayoutParams layoutParams = (LayoutParams) viewC2.getLayoutParams();
            if (this.h0) {
                layoutParams.f4949b = 0.0f;
                layoutParams.f4950c = 0;
                invalidate();
                return;
            }
            layoutParams.f4950c |= 4;
            if (a(viewC2)) {
                viewC2.getWidth();
                viewC2.getTop();
                throw null;
            }
            getWidth();
            viewC2.getTop();
            throw null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.h0 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.h0 = true;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.p0 || this.n0 == null) {
            return;
        }
        WindowInsets windowInsets = this.o0;
        int systemWindowInsetTop = windowInsets != null ? windowInsets.getSystemWindowInsetTop() : 0;
        if (systemWindowInsetTop > 0) {
            this.n0.setBounds(0, 0, getWidth(), systemWindowInsetTop);
            this.n0.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        motionEvent.getActionMasked();
        throw null;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i2, KeyEvent keyEvent) {
        View childAt;
        if (i2 == 4) {
            int childCount = getChildCount();
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    childAt = null;
                    break;
                }
                childAt = getChildAt(i3);
                if (h(childAt)) {
                    if (!h(childAt)) {
                        throw new IllegalArgumentException("View " + childAt + " is not a drawer");
                    }
                    if (((LayoutParams) childAt.getLayoutParams()).f4949b > 0.0f) {
                        break;
                    }
                }
                i3++;
            }
            if (childAt != null) {
                keyEvent.startTracking();
                return true;
            }
        }
        return super.onKeyDown(i2, keyEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i2, KeyEvent keyEvent) {
        View childAt;
        if (i2 != 4) {
            return super.onKeyUp(i2, keyEvent);
        }
        int childCount = getChildCount();
        int i3 = 0;
        while (true) {
            if (i3 >= childCount) {
                childAt = null;
                break;
            }
            childAt = getChildAt(i3);
            if (h(childAt)) {
                if (!h(childAt)) {
                    throw new IllegalArgumentException("View " + childAt + " is not a drawer");
                }
                if (((LayoutParams) childAt.getLayoutParams()).f4949b > 0.0f) {
                    break;
                }
            }
            i3++;
        }
        if (childAt == null || d(childAt) != 0) {
            return childAt != null;
        }
        b(false);
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        WindowInsets rootWindowInsets;
        float f;
        int i6;
        boolean z3 = true;
        this.g0 = true;
        int i7 = i4 - i2;
        int childCount = getChildCount();
        int i8 = 0;
        while (i8 < childCount) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (f(childAt)) {
                    int i9 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                    childAt.layout(i9, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, childAt.getMeasuredWidth() + i9, childAt.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin);
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a(childAt)) {
                        float f2 = measuredWidth;
                        i6 = (-measuredWidth) + ((int) (layoutParams.f4949b * f2));
                        f = (measuredWidth + i6) / f2;
                    } else {
                        float f3 = measuredWidth;
                        int i10 = i7 - ((int) (layoutParams.f4949b * f3));
                        f = (i7 - i10) / f3;
                        i6 = i10;
                    }
                    boolean z4 = f != layoutParams.f4949b ? z3 : false;
                    int i11 = layoutParams.f4948a & 112;
                    if (i11 == 16) {
                        int i12 = i5 - i3;
                        int i13 = (i12 - measuredHeight) / 2;
                        int i14 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                        if (i13 < i14) {
                            i13 = i14;
                        } else {
                            int i15 = i13 + measuredHeight;
                            int i16 = i12 - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                            if (i15 > i16) {
                                i13 = i16 - measuredHeight;
                            }
                        }
                        childAt.layout(i6, i13, measuredWidth + i6, measuredHeight + i13);
                    } else if (i11 != 80) {
                        int i17 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                        childAt.layout(i6, i17, measuredWidth + i6, measuredHeight + i17);
                    } else {
                        int i18 = i5 - i3;
                        childAt.layout(i6, (i18 - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i6, i18 - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
                    }
                    if (z4) {
                        LayoutParams layoutParams2 = (LayoutParams) childAt.getLayoutParams();
                        if (f != layoutParams2.f4949b) {
                            layoutParams2.f4949b = f;
                            throw null;
                        }
                    }
                    int i19 = layoutParams.f4949b > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i19) {
                        childAt.setVisibility(i19);
                    }
                }
            }
            i8++;
            z3 = true;
        }
        if (t0 && (rootWindowInsets = getRootWindowInsets()) != null) {
            WindowInsetsCompat.p(null, rootWindowInsets).f();
            throw null;
        }
        this.g0 = false;
        this.h0 = false;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0039  */
    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        boolean z2;
        int i4;
        String hexString;
        int i5 = 3;
        int mode = View.MeasureSpec.getMode(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i3);
        char c2 = AbstractJsonLexerKt.INVALID;
        if (mode != 1073741824 || mode2 != 1073741824) {
            if (!isInEditMode()) {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
            if (mode == 0) {
                size = 300;
            }
            if (mode2 == 0) {
                size2 = 300;
            }
        }
        setMeasuredDimension(size, size2);
        if (this.o0 != null) {
            WeakHashMap weakHashMap = ViewCompat.f4466a;
            if (getFitsSystemWindows()) {
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            z2 = false;
        }
        WeakHashMap weakHashMap2 = ViewCompat.f4466a;
        int layoutDirection = getLayoutDirection();
        int childCount = getChildCount();
        int i6 = 0;
        boolean z3 = false;
        boolean z4 = false;
        while (i6 < childCount) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (z2) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(layoutParams.f4948a, layoutDirection);
                    if (childAt.getFitsSystemWindows()) {
                        WindowInsets windowInsetsReplaceSystemWindowInsets = this.o0;
                        if (absoluteGravity == i5) {
                            windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetLeft(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), 0, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                        } else if (absoluteGravity == 5) {
                            windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(0, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetRight(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                        }
                        childAt.dispatchApplyWindowInsets(windowInsetsReplaceSystemWindowInsets);
                    } else {
                        WindowInsets windowInsetsReplaceSystemWindowInsets2 = this.o0;
                        if (absoluteGravity == 3) {
                            windowInsetsReplaceSystemWindowInsets2 = windowInsetsReplaceSystemWindowInsets2.replaceSystemWindowInsets(windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetLeft(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop(), 0, windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom());
                        } else if (absoluteGravity == 5) {
                            windowInsetsReplaceSystemWindowInsets2 = windowInsetsReplaceSystemWindowInsets2.replaceSystemWindowInsets(0, windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetRight(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom());
                        }
                        ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetLeft();
                        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop();
                        ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetRight();
                        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom();
                    }
                }
                if (f(childAt)) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, 1073741824));
                } else {
                    if (!h(childAt)) {
                        throw new IllegalStateException("Child " + childAt + " at index " + i6 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                    }
                    if (s0) {
                        float fK = ViewCompat.k(childAt);
                        float f = this.e0;
                        if (fK != f) {
                            ViewCompat.E(childAt, f);
                        }
                    }
                    int i7 = ((LayoutParams) childAt.getLayoutParams()).f4948a;
                    WeakHashMap weakHashMap3 = ViewCompat.f4466a;
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i7, getLayoutDirection());
                    int i8 = absoluteGravity2 & 7;
                    boolean z5 = i8 == 3;
                    if ((z5 && z3) || (!z5 && z4)) {
                        StringBuilder sb = new StringBuilder("Child drawer has absolute gravity ");
                        if ((absoluteGravity2 & 3) != 3) {
                            hexString = (absoluteGravity2 & 5) == 5 ? "RIGHT" : Integer.toHexString(i8);
                        } else {
                            hexString = "LEFT";
                        }
                        throw new IllegalStateException(a.r(sb, hexString, " but this DrawerLayout already has a drawer view along that edge"));
                    }
                    i4 = 3;
                    if (z5) {
                        z3 = true;
                    } else {
                        z4 = true;
                    }
                    childAt.measure(ViewGroup.getChildMeasureSpec(i2, ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, ((ViewGroup.MarginLayoutParams) layoutParams).width), ViewGroup.getChildMeasureSpec(i3, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, ((ViewGroup.MarginLayoutParams) layoutParams).height));
                }
                i6++;
                i5 = i4;
                c2 = AbstractJsonLexerKt.INVALID;
            }
            i4 = 3;
            i6++;
            i5 = i4;
            c2 = AbstractJsonLexerKt.INVALID;
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        View viewC;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.X);
        int i2 = savedState.Z;
        if (i2 != 0 && (viewC = c(i2)) != null) {
            i(viewC);
        }
        int i3 = savedState.e0;
        if (i3 != 3) {
            j(i3, 3);
        }
        int i4 = savedState.f0;
        if (i4 != 3) {
            j(i4, 5);
        }
        int i5 = savedState.g0;
        if (i5 != 3) {
            j(i5, 8388611);
        }
        int i6 = savedState.h0;
        if (i6 != 3) {
            j(i6, 8388613);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i2) {
        if (s0) {
            return;
        }
        WeakHashMap weakHashMap = ViewCompat.f4466a;
        getLayoutDirection();
        getLayoutDirection();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.Z = 0;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            LayoutParams layoutParams = (LayoutParams) getChildAt(i2).getLayoutParams();
            int i3 = layoutParams.f4950c;
            boolean z2 = i3 == 1;
            boolean z3 = i3 == 2;
            if (z2 || z3) {
                savedState.Z = layoutParams.f4948a;
                break;
            }
        }
        savedState.e0 = this.i0;
        savedState.f0 = this.j0;
        savedState.g0 = this.k0;
        savedState.h0 = this.l0;
        return savedState;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z2) {
        super.requestDisallowInterceptTouchEvent(z2);
        if (z2) {
            b(true);
            throw null;
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.g0) {
            return;
        }
        super.requestLayout();
    }

    public void setDrawerElevation(float f) {
        this.e0 = f;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (h(childAt)) {
                ViewCompat.E(childAt, this.e0);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(DrawerListener drawerListener) {
        if (this.m0 != null) {
            throw null;
        }
        if (drawerListener != null) {
            throw null;
        }
        this.m0 = drawerListener;
    }

    public void setDrawerLockMode(int i2) {
        j(i2, 3);
        j(i2, 5);
    }

    public void setScrimColor(int i2) {
        invalidate();
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.n0 = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i2) {
        this.n0 = new ColorDrawable(i2);
        invalidate();
    }

    public void setStatusBarBackground(int i2) {
        this.n0 = i2 != 0 ? ContextCompat.getDrawable(getContext(), i2) : null;
        invalidate();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        LayoutParams layoutParams = new LayoutParams(context, attributeSet);
        layoutParams.f4948a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q0);
        layoutParams.f4948a = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        return layoutParams;
    }

    public static abstract class SimpleDrawerListener implements DrawerListener {
        @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
        public final void a() {
        }
    }
}
