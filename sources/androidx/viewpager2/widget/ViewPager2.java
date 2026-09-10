package androidx.viewpager2.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.adapter.StatefulAdapter;
import com.applovin.shadow.okio.Segment;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class ViewPager2 extends ViewGroup {
    public final Rect e0;
    public final Rect f0;
    public final CompositeOnPageChangeCallback g0;
    public int h0;
    public boolean i0;
    public final RecyclerView.AdapterDataObserver j0;
    public LinearLayoutManager k0;
    public int l0;
    public Parcelable m0;
    public RecyclerView n0;
    public PagerSnapHelper o0;
    public ScrollEventAdapter p0;
    public CompositeOnPageChangeCallback q0;
    public FakeDrag r0;
    public PageTransformerAdapter s0;
    public RecyclerView.ItemAnimator t0;
    public boolean u0;
    public boolean v0;
    public int w0;
    public PageAwareAccessibilityProvider x0;

    /* JADX INFO: renamed from: androidx.viewpager2.widget.ViewPager2$4, reason: invalid class name */
    class AnonymousClass4 implements RecyclerView.OnChildAttachStateChangeListener {
        @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
        public final void a(View view) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
        public final void b(View view) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            if (((ViewGroup.MarginLayoutParams) layoutParams).width != -1 || ((ViewGroup.MarginLayoutParams) layoutParams).height != -1) {
                throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
            }
        }
    }

    public abstract class AccessibilityProvider {
    }

    public class BasicAccessibilityProvider extends AccessibilityProvider {
    }

    public static abstract class DataSetChangeObserver extends RecyclerView.AdapterDataObserver {
        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public abstract void onChanged();

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeChanged(int i2, int i3) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeInserted(int i2, int i3) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeMoved(int i2, int i3, int i4) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeRemoved(int i2, int i3) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeChanged(int i2, int i3, Object obj) {
            onChanged();
        }
    }

    public class LinearLayoutManagerImpl extends LinearLayoutManager {
        public LinearLayoutManagerImpl() {
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public final void calculateExtraLayoutSpace(RecyclerView.State state, int[] iArr) {
            ViewPager2 viewPager2 = ViewPager2.this;
            int offscreenPageLimit = viewPager2.getOffscreenPageLimit();
            if (offscreenPageLimit == -1) {
                super.calculateExtraLayoutSpace(state, iArr);
                return;
            }
            int pageSize = viewPager2.getPageSize() * offscreenPageLimit;
            iArr[0] = pageSize;
            iArr[1] = pageSize;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
        public final void onInitializeAccessibilityNodeInfo(RecyclerView.Recycler recycler, RecyclerView.State state, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(recycler, state, accessibilityNodeInfoCompat);
            ViewPager2.this.x0.getClass();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
        public final void onInitializeAccessibilityNodeInfoForItem(RecyclerView.Recycler recycler, RecyclerView.State state, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            ViewPager2 viewPager2 = ViewPager2.this;
            accessibilityNodeInfoCompat.l(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.a(viewPager2.getOrientation() == 1 ? viewPager2.k0.getPosition(view) : 0, 1, viewPager2.getOrientation() == 0 ? viewPager2.k0.getPosition(view) : 0, 1, false));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
        public final boolean performAccessibilityAction(RecyclerView.Recycler recycler, RecyclerView.State state, int i2, Bundle bundle) {
            ViewPager2.this.x0.getClass();
            return super.performAccessibilityAction(recycler, state, i2, bundle);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
        public final boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z2, boolean z3) {
            return false;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface OffscreenPageLimit {
    }

    public static abstract class OnPageChangeCallback {
        public void a(int i2) {
        }

        public void b(int i2, float f, int i3) {
        }

        public void c(int i2) {
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Orientation {
    }

    public class PageAwareAccessibilityProvider extends AccessibilityProvider {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AccessibilityViewCommand f8556a = new AccessibilityViewCommand() { // from class: androidx.viewpager2.widget.ViewPager2.PageAwareAccessibilityProvider.1
            @Override // androidx.core.view.accessibility.AccessibilityViewCommand
            public final boolean d(View view) {
                int currentItem = ((ViewPager2) view).getCurrentItem() + 1;
                ViewPager2 viewPager2 = ViewPager2.this;
                if (viewPager2.v0) {
                    viewPager2.e(currentItem, true);
                }
                return true;
            }
        };

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AccessibilityViewCommand f8557b = new AccessibilityViewCommand() { // from class: androidx.viewpager2.widget.ViewPager2.PageAwareAccessibilityProvider.2
            @Override // androidx.core.view.accessibility.AccessibilityViewCommand
            public final boolean d(View view) {
                int currentItem = ((ViewPager2) view).getCurrentItem() - 1;
                ViewPager2 viewPager2 = ViewPager2.this;
                if (viewPager2.v0) {
                    viewPager2.e(currentItem, true);
                }
                return true;
            }
        };

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public RecyclerView.AdapterDataObserver f8558c;

        public PageAwareAccessibilityProvider() {
        }

        public final void a() {
            int itemCount;
            int i2 = R.id.accessibilityActionPageLeft;
            ViewPager2 viewPager2 = ViewPager2.this;
            ViewCompat.v(R.id.accessibilityActionPageLeft, viewPager2);
            ViewCompat.s(0, viewPager2);
            ViewCompat.v(R.id.accessibilityActionPageRight, viewPager2);
            ViewCompat.s(0, viewPager2);
            ViewCompat.v(R.id.accessibilityActionPageUp, viewPager2);
            ViewCompat.s(0, viewPager2);
            ViewCompat.v(R.id.accessibilityActionPageDown, viewPager2);
            ViewCompat.s(0, viewPager2);
            if (viewPager2.getAdapter() == null || (itemCount = viewPager2.getAdapter().getItemCount()) == 0 || !viewPager2.v0) {
                return;
            }
            int orientation = viewPager2.getOrientation();
            AccessibilityViewCommand accessibilityViewCommand = this.f8557b;
            AccessibilityViewCommand accessibilityViewCommand2 = this.f8556a;
            if (orientation != 0) {
                if (viewPager2.h0 < itemCount - 1) {
                    ViewCompat.w(viewPager2, new AccessibilityNodeInfoCompat.AccessibilityActionCompat(R.id.accessibilityActionPageDown, (String) null), accessibilityViewCommand2);
                }
                if (viewPager2.h0 > 0) {
                    ViewCompat.w(viewPager2, new AccessibilityNodeInfoCompat.AccessibilityActionCompat(R.id.accessibilityActionPageUp, (String) null), accessibilityViewCommand);
                    return;
                }
                return;
            }
            boolean z2 = viewPager2.k0.getLayoutDirection() == 1;
            int i3 = z2 ? 16908360 : 16908361;
            if (z2) {
                i2 = 16908361;
            }
            if (viewPager2.h0 < itemCount - 1) {
                ViewCompat.w(viewPager2, new AccessibilityNodeInfoCompat.AccessibilityActionCompat(i3, (String) null), accessibilityViewCommand2);
            }
            if (viewPager2.h0 > 0) {
                ViewCompat.w(viewPager2, new AccessibilityNodeInfoCompat.AccessibilityActionCompat(i2, (String) null), accessibilityViewCommand);
            }
        }
    }

    public interface PageTransformer {
        void a(View view, float f);
    }

    public class PagerSnapHelperImpl extends PagerSnapHelper {
        public PagerSnapHelperImpl() {
        }

        @Override // androidx.recyclerview.widget.PagerSnapHelper, androidx.recyclerview.widget.SnapHelper
        public final View findSnapView(RecyclerView.LayoutManager layoutManager) {
            ScrollEventAdapter scrollEventAdapter = ViewPager2.this.r0.f8540a;
            return super.findSnapView(layoutManager);
        }
    }

    public class RecyclerViewImpl extends RecyclerView {
        public RecyclerViewImpl(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
        public final CharSequence getAccessibilityClassName() {
            ViewPager2.this.x0.getClass();
            return super.getAccessibilityClassName();
        }

        @Override // android.view.View
        public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            ViewPager2 viewPager2 = ViewPager2.this;
            accessibilityEvent.setFromIndex(viewPager2.h0);
            accessibilityEvent.setToIndex(viewPager2.h0);
            accessibilityEvent.setSource(ViewPager2.this);
            accessibilityEvent.setClassName("androidx.viewpager.widget.ViewPager");
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.v0 && super.onInterceptTouchEvent(motionEvent);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.v0 && super.onTouchEvent(motionEvent);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ScrollState {
    }

    public static class SmoothScrollToPosition implements Runnable {
        public final int X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final RecyclerView f8562Y;

        public SmoothScrollToPosition(RecyclerView recyclerView, int i2) {
            this.X = i2;
            this.f8562Y = recyclerView;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f8562Y.smoothScrollToPosition(this.X);
        }
    }

    public ViewPager2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e0 = new Rect();
        this.f0 = new Rect();
        this.g0 = new CompositeOnPageChangeCallback();
        this.i0 = false;
        this.j0 = new DataSetChangeObserver() { // from class: androidx.viewpager2.widget.ViewPager2.1
            @Override // androidx.viewpager2.widget.ViewPager2.DataSetChangeObserver, androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public final void onChanged() {
                ViewPager2 viewPager2 = ViewPager2.this;
                viewPager2.i0 = true;
                viewPager2.p0.f8549l = true;
            }
        };
        this.l0 = -1;
        this.t0 = null;
        this.u0 = false;
        this.v0 = true;
        this.w0 = -1;
        a(context, attributeSet);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        this.x0 = new PageAwareAccessibilityProvider();
        RecyclerViewImpl recyclerViewImpl = new RecyclerViewImpl(context);
        this.n0 = recyclerViewImpl;
        WeakHashMap weakHashMap = ViewCompat.f4466a;
        recyclerViewImpl.setId(View.generateViewId());
        this.n0.setDescendantFocusability(131072);
        LinearLayoutManagerImpl linearLayoutManagerImpl = new LinearLayoutManagerImpl();
        this.k0 = linearLayoutManagerImpl;
        this.n0.setLayoutManager(linearLayoutManagerImpl);
        this.n0.setScrollingTouchSlop(1);
        int[] iArr = androidx.viewpager2.R.styleable.f8535a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        ViewCompat.y(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, 0);
        try {
            setOrientation(typedArrayObtainStyledAttributes.getInt(0, 0));
            typedArrayObtainStyledAttributes.recycle();
            this.n0.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            this.n0.addOnChildAttachStateChangeListener(new AnonymousClass4());
            ScrollEventAdapter scrollEventAdapter = new ScrollEventAdapter(this);
            this.p0 = scrollEventAdapter;
            this.r0 = new FakeDrag(scrollEventAdapter);
            PagerSnapHelperImpl pagerSnapHelperImpl = new PagerSnapHelperImpl();
            this.o0 = pagerSnapHelperImpl;
            pagerSnapHelperImpl.attachToRecyclerView(this.n0);
            this.n0.addOnScrollListener(this.p0);
            CompositeOnPageChangeCallback compositeOnPageChangeCallback = new CompositeOnPageChangeCallback();
            this.q0 = compositeOnPageChangeCallback;
            this.p0.f8543a = compositeOnPageChangeCallback;
            OnPageChangeCallback onPageChangeCallback = new OnPageChangeCallback() { // from class: androidx.viewpager2.widget.ViewPager2.2
                @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
                public final void a(int i2) {
                    if (i2 == 0) {
                        ViewPager2.this.g();
                    }
                }

                @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
                public final void c(int i2) {
                    ViewPager2 viewPager2 = ViewPager2.this;
                    if (viewPager2.h0 != i2) {
                        viewPager2.h0 = i2;
                        viewPager2.x0.a();
                    }
                }
            };
            OnPageChangeCallback onPageChangeCallback2 = new OnPageChangeCallback() { // from class: androidx.viewpager2.widget.ViewPager2.3
                @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
                public final void c(int i2) {
                    ViewPager2 viewPager2 = ViewPager2.this;
                    viewPager2.clearFocus();
                    if (viewPager2.hasFocus()) {
                        viewPager2.n0.requestFocus(2);
                    }
                }
            };
            compositeOnPageChangeCallback.f8539a.add(onPageChangeCallback);
            this.q0.f8539a.add(onPageChangeCallback2);
            final PageAwareAccessibilityProvider pageAwareAccessibilityProvider = this.x0;
            RecyclerView recyclerView = this.n0;
            pageAwareAccessibilityProvider.getClass();
            recyclerView.setImportantForAccessibility(2);
            pageAwareAccessibilityProvider.f8558c = new DataSetChangeObserver() { // from class: androidx.viewpager2.widget.ViewPager2.PageAwareAccessibilityProvider.3
                @Override // androidx.viewpager2.widget.ViewPager2.DataSetChangeObserver, androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
                public final void onChanged() {
                    PageAwareAccessibilityProvider.this.a();
                }
            };
            ViewPager2 viewPager2 = ViewPager2.this;
            if (viewPager2.getImportantForAccessibility() == 0) {
                viewPager2.setImportantForAccessibility(1);
            }
            CompositeOnPageChangeCallback compositeOnPageChangeCallback2 = this.q0;
            compositeOnPageChangeCallback2.f8539a.add(this.g0);
            PageTransformerAdapter pageTransformerAdapter = new PageTransformerAdapter(this.k0);
            this.s0 = pageTransformerAdapter;
            this.q0.f8539a.add(pageTransformerAdapter);
            RecyclerView recyclerView2 = this.n0;
            attachViewToParent(recyclerView2, 0, recyclerView2.getLayoutParams());
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void b(OnPageChangeCallback onPageChangeCallback) {
        this.g0.f8539a.add(onPageChangeCallback);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c() {
        RecyclerView.Adapter adapter;
        if (this.l0 == -1 || (adapter = getAdapter()) == 0) {
            return;
        }
        if (this.m0 != null) {
            if (adapter instanceof StatefulAdapter) {
                ((StatefulAdapter) adapter).b();
                throw null;
            }
            this.m0 = null;
        }
        int iMax = Math.max(0, Math.min(this.l0, adapter.getItemCount() - 1));
        this.h0 = iMax;
        this.l0 = -1;
        this.n0.scrollToPosition(iMax);
        this.x0.a();
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i2) {
        return this.n0.canScrollHorizontally(i2);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i2) {
        return this.n0.canScrollVertically(i2);
    }

    public final void d(int i2, boolean z2) {
        ScrollEventAdapter scrollEventAdapter = this.r0.f8540a;
        e(i2, z2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        Parcelable parcelable = (Parcelable) sparseArray.get(getId());
        if (parcelable instanceof SavedState) {
            int i2 = ((SavedState) parcelable).X;
            sparseArray.put(this.n0.getId(), (Parcelable) sparseArray.get(i2));
            sparseArray.remove(i2);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        c();
    }

    public final void e(int i2, boolean z2) {
        OnPageChangeCallback onPageChangeCallback;
        RecyclerView.Adapter adapter = getAdapter();
        if (adapter == null) {
            if (this.l0 != -1) {
                this.l0 = Math.max(i2, 0);
                return;
            }
            return;
        }
        if (adapter.getItemCount() <= 0) {
            return;
        }
        int iMin = Math.min(Math.max(i2, 0), adapter.getItemCount() - 1);
        int i3 = this.h0;
        if (iMin == i3 && this.p0.f == 0) {
            return;
        }
        if (iMin == i3 && z2) {
            return;
        }
        double d = i3;
        this.h0 = iMin;
        this.x0.a();
        ScrollEventAdapter scrollEventAdapter = this.p0;
        if (scrollEventAdapter.f != 0) {
            scrollEventAdapter.c();
            ScrollEventAdapter.ScrollEventValues scrollEventValues = scrollEventAdapter.g;
            d = ((double) scrollEventValues.f8550a) + ((double) scrollEventValues.f8551b);
        }
        ScrollEventAdapter scrollEventAdapter2 = this.p0;
        scrollEventAdapter2.getClass();
        scrollEventAdapter2.f8546e = z2 ? 2 : 3;
        boolean z3 = scrollEventAdapter2.f8548i != iMin;
        scrollEventAdapter2.f8548i = iMin;
        scrollEventAdapter2.a(2);
        if (z3 && (onPageChangeCallback = scrollEventAdapter2.f8543a) != null) {
            onPageChangeCallback.c(iMin);
        }
        if (!z2) {
            this.n0.scrollToPosition(iMin);
            return;
        }
        double d2 = iMin;
        if (Math.abs(d2 - d) <= 3.0d) {
            this.n0.smoothScrollToPosition(iMin);
            return;
        }
        this.n0.scrollToPosition(d2 > d ? iMin - 3 : iMin + 3);
        RecyclerView recyclerView = this.n0;
        recyclerView.post(new SmoothScrollToPosition(recyclerView, iMin));
    }

    public final void f(OnPageChangeCallback onPageChangeCallback) {
        this.g0.f8539a.remove(onPageChangeCallback);
    }

    public final void g() {
        PagerSnapHelper pagerSnapHelper = this.o0;
        if (pagerSnapHelper == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        View viewFindSnapView = pagerSnapHelper.findSnapView(this.k0);
        if (viewFindSnapView == null) {
            return;
        }
        int position = this.k0.getPosition(viewFindSnapView);
        if (position != this.h0 && getScrollState() == 0) {
            this.q0.c(position);
        }
        this.i0 = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        this.x0.getClass();
        this.x0.getClass();
        return "androidx.viewpager.widget.ViewPager";
    }

    public RecyclerView.Adapter getAdapter() {
        return this.n0.getAdapter();
    }

    public int getCurrentItem() {
        return this.h0;
    }

    public int getItemDecorationCount() {
        return this.n0.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.w0;
    }

    public int getOrientation() {
        return this.k0.getOrientation() == 1 ? 1 : 0;
    }

    public int getPageSize() {
        int height;
        int paddingBottom;
        RecyclerView recyclerView = this.n0;
        if (getOrientation() == 0) {
            height = recyclerView.getWidth() - recyclerView.getPaddingLeft();
            paddingBottom = recyclerView.getPaddingRight();
        } else {
            height = recyclerView.getHeight() - recyclerView.getPaddingTop();
            paddingBottom = recyclerView.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    public int getScrollState() {
        return this.p0.f;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int itemCount;
        int itemCount2;
        int itemCount3;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        PageAwareAccessibilityProvider pageAwareAccessibilityProvider = this.x0;
        pageAwareAccessibilityProvider.getClass();
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat = new AccessibilityNodeInfoCompat(accessibilityNodeInfo);
        ViewPager2 viewPager2 = ViewPager2.this;
        if (viewPager2.getAdapter() == null) {
            itemCount = 0;
            itemCount2 = 0;
        } else if (viewPager2.getOrientation() == 1) {
            itemCount = viewPager2.getAdapter().getItemCount();
            itemCount2 = 1;
        } else {
            itemCount2 = viewPager2.getAdapter().getItemCount();
            itemCount = 1;
        }
        accessibilityNodeInfoCompat.k(AccessibilityNodeInfoCompat.CollectionInfoCompat.a(itemCount, itemCount2, 0, false));
        RecyclerView.Adapter adapter = viewPager2.getAdapter();
        if (adapter == null || (itemCount3 = adapter.getItemCount()) == 0 || !viewPager2.v0) {
            return;
        }
        if (viewPager2.h0 > 0) {
            accessibilityNodeInfoCompat.a(Segment.SIZE);
        }
        if (viewPager2.h0 < itemCount3 - 1) {
            accessibilityNodeInfoCompat.a(4096);
        }
        accessibilityNodeInfoCompat.o(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int measuredWidth = this.n0.getMeasuredWidth();
        int measuredHeight = this.n0.getMeasuredHeight();
        int paddingLeft = getPaddingLeft();
        Rect rect = this.e0;
        rect.left = paddingLeft;
        rect.right = (i4 - i2) - getPaddingRight();
        rect.top = getPaddingTop();
        rect.bottom = (i5 - i3) - getPaddingBottom();
        Rect rect2 = this.f0;
        Gravity.apply(8388659, measuredWidth, measuredHeight, rect, rect2);
        this.n0.layout(rect2.left, rect2.top, rect2.right, rect2.bottom);
        if (this.i0) {
            g();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        measureChild(this.n0, i2, i3);
        int measuredWidth = this.n0.getMeasuredWidth();
        int measuredHeight = this.n0.getMeasuredHeight();
        int measuredState = this.n0.getMeasuredState();
        int paddingRight = getPaddingRight() + getPaddingLeft() + measuredWidth;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + measuredHeight;
        setMeasuredDimension(View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i2, measuredState), View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i3, measuredState << 16));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.l0 = savedState.f8561Y;
        this.m0 = savedState.Z;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.X = this.n0.getId();
        int i2 = this.l0;
        if (i2 == -1) {
            i2 = this.h0;
        }
        savedState.f8561Y = i2;
        Parcelable parcelable = this.m0;
        if (parcelable != null) {
            savedState.Z = parcelable;
            return savedState;
        }
        Object adapter = this.n0.getAdapter();
        if (!(adapter instanceof StatefulAdapter)) {
            return savedState;
        }
        ((StatefulAdapter) adapter).a();
        throw null;
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        throw new IllegalStateException("ViewPager2 does not support direct child views");
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i2, Bundle bundle) {
        this.x0.getClass();
        if (i2 != 8192 && i2 != 4096) {
            return super.performAccessibilityAction(i2, bundle);
        }
        PageAwareAccessibilityProvider pageAwareAccessibilityProvider = this.x0;
        pageAwareAccessibilityProvider.getClass();
        if (i2 != 8192 && i2 != 4096) {
            throw new IllegalStateException();
        }
        ViewPager2 viewPager2 = ViewPager2.this;
        int currentItem = i2 == 8192 ? viewPager2.getCurrentItem() - 1 : viewPager2.getCurrentItem() + 1;
        if (viewPager2.v0) {
            viewPager2.e(currentItem, true);
        }
        return true;
    }

    public void setAdapter(RecyclerView.Adapter adapter) {
        RecyclerView.Adapter adapter2 = this.n0.getAdapter();
        PageAwareAccessibilityProvider pageAwareAccessibilityProvider = this.x0;
        if (adapter2 != null) {
            adapter2.unregisterAdapterDataObserver(pageAwareAccessibilityProvider.f8558c);
        } else {
            pageAwareAccessibilityProvider.getClass();
        }
        RecyclerView.AdapterDataObserver adapterDataObserver = this.j0;
        if (adapter2 != null) {
            adapter2.unregisterAdapterDataObserver(adapterDataObserver);
        }
        this.n0.setAdapter(adapter);
        this.h0 = 0;
        c();
        PageAwareAccessibilityProvider pageAwareAccessibilityProvider2 = this.x0;
        pageAwareAccessibilityProvider2.a();
        if (adapter != null) {
            adapter.registerAdapterDataObserver(pageAwareAccessibilityProvider2.f8558c);
        }
        if (adapter != null) {
            adapter.registerAdapterDataObserver(adapterDataObserver);
        }
    }

    public void setCurrentItem(int i2) {
        d(i2, true);
    }

    @Override // android.view.View
    public void setLayoutDirection(int i2) {
        super.setLayoutDirection(i2);
        this.x0.a();
    }

    public void setOffscreenPageLimit(int i2) {
        if (i2 < 1 && i2 != -1) {
            throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
        }
        this.w0 = i2;
        this.n0.requestLayout();
    }

    public void setOrientation(int i2) {
        this.k0.setOrientation(i2);
        this.x0.a();
    }

    public void setPageTransformer(PageTransformer pageTransformer) {
        if (pageTransformer != null) {
            if (!this.u0) {
                this.t0 = this.n0.getItemAnimator();
                this.u0 = true;
            }
            this.n0.setItemAnimator(null);
        } else if (this.u0) {
            this.n0.setItemAnimator(this.t0);
            this.t0 = null;
            this.u0 = false;
        }
        PageTransformerAdapter pageTransformerAdapter = this.s0;
        if (pageTransformer == pageTransformerAdapter.f8542b) {
            return;
        }
        pageTransformerAdapter.f8542b = pageTransformer;
        if (pageTransformer == null) {
            return;
        }
        ScrollEventAdapter scrollEventAdapter = this.p0;
        scrollEventAdapter.c();
        ScrollEventAdapter.ScrollEventValues scrollEventValues = scrollEventAdapter.g;
        double d = ((double) scrollEventValues.f8550a) + ((double) scrollEventValues.f8551b);
        int i2 = (int) d;
        float f = (float) (d - ((double) i2));
        this.s0.b(i2, f, Math.round(getPageSize() * f));
    }

    public void setUserInputEnabled(boolean z2) {
        this.v0 = z2;
        this.x0.a();
    }

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new AnonymousClass1();
        public int X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public int f8561Y;
        public Parcelable Z;

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.X);
            parcel.writeInt(this.f8561Y);
            parcel.writeParcelable(this.Z, i2);
        }

        /* JADX INFO: renamed from: androidx.viewpager2.widget.ViewPager2$SavedState$1, reason: invalid class name */
        public class AnonymousClass1 implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                SavedState savedState = new SavedState(parcel, null);
                savedState.X = parcel.readInt();
                savedState.f8561Y = parcel.readInt();
                savedState.Z = parcel.readParcelable(null);
                return savedState;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i2) {
                return new SavedState[i2];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                SavedState savedState = new SavedState(parcel, classLoader);
                savedState.X = parcel.readInt();
                savedState.f8561Y = parcel.readInt();
                savedState.Z = parcel.readParcelable(classLoader);
                return savedState;
            }
        }
    }
}
