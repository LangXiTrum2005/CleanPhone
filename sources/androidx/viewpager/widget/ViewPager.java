package androidx.viewpager.widget;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.v4.media.a;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.core.content.ContextCompat;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.view.AbsSavedState;
import com.applovin.shadow.okio.Segment;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class ViewPager extends ViewGroup {
    private static final int CLOSE_ENOUGH = 2;
    private static final boolean DEBUG = false;
    private static final int DEFAULT_GUTTER_SIZE = 16;
    private static final int DEFAULT_OFFSCREEN_PAGES = 1;
    private static final int DRAW_ORDER_DEFAULT = 0;
    private static final int DRAW_ORDER_FORWARD = 1;
    private static final int DRAW_ORDER_REVERSE = 2;
    private static final int INVALID_POINTER = -1;
    private static final int MAX_SETTLE_DURATION = 600;
    private static final int MIN_DISTANCE_FOR_FLING = 25;
    private static final int MIN_FLING_VELOCITY = 400;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    private static final String TAG = "ViewPager";
    private static final boolean USE_CACHE = false;
    private int mActivePointerId;
    PagerAdapter mAdapter;
    private List<OnAdapterChangeListener> mAdapterChangeListeners;
    private int mBottomPageBounds;
    private boolean mCalledSuper;
    private int mChildHeightMeasureSpec;
    private int mChildWidthMeasureSpec;
    private int mCloseEnough;
    int mCurItem;
    private int mDecorChildCount;
    private int mDefaultGutterSize;
    private int mDrawingOrder;
    private ArrayList<View> mDrawingOrderedChildren;
    private final Runnable mEndScrollRunnable;
    private int mExpectedAdapterCount;
    private long mFakeDragBeginTime;
    private boolean mFakeDragging;
    private boolean mFirstLayout;
    private float mFirstOffset;
    private int mFlingDistance;
    private int mGutterSize;
    private boolean mInLayout;
    private float mInitialMotionX;
    private float mInitialMotionY;
    private OnPageChangeListener mInternalPageChangeListener;
    private boolean mIsBeingDragged;
    private boolean mIsScrollStarted;
    private boolean mIsUnableToDrag;
    private final ArrayList<ItemInfo> mItems;
    private float mLastMotionX;
    private float mLastMotionY;
    private float mLastOffset;
    private EdgeEffect mLeftEdge;
    private Drawable mMarginDrawable;
    private int mMaximumVelocity;
    private int mMinimumVelocity;
    private boolean mNeedCalculatePageOffsets;
    private PagerObserver mObserver;
    private int mOffscreenPageLimit;
    private OnPageChangeListener mOnPageChangeListener;
    private List<OnPageChangeListener> mOnPageChangeListeners;
    private int mPageMargin;
    private PageTransformer mPageTransformer;
    private int mPageTransformerLayerType;
    private boolean mPopulatePending;
    private Parcelable mRestoredAdapterState;
    private ClassLoader mRestoredClassLoader;
    private int mRestoredCurItem;
    private EdgeEffect mRightEdge;
    private int mScrollState;
    private Scroller mScroller;
    private boolean mScrollingCacheEnabled;
    private final ItemInfo mTempItem;
    private final Rect mTempRect;
    private int mTopPageBounds;
    private int mTouchSlop;
    private VelocityTracker mVelocityTracker;
    static final int[] LAYOUT_ATTRS = {R.attr.layout_gravity};
    private static final Comparator<ItemInfo> COMPARATOR = new AnonymousClass1();
    private static final Interpolator sInterpolator = new AnonymousClass2();
    private static final ViewPositionComparator sPositionComparator = new ViewPositionComparator();

    /* JADX INFO: renamed from: androidx.viewpager.widget.ViewPager$1, reason: invalid class name */
    public static class AnonymousClass1 implements Comparator<ItemInfo> {
        @Override // java.util.Comparator
        public final int compare(ItemInfo itemInfo, ItemInfo itemInfo2) {
            return itemInfo.f8527b - itemInfo2.f8527b;
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager.widget.ViewPager$2, reason: invalid class name */
    public static class AnonymousClass2 implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    public @interface DecorView {
    }

    public static class ItemInfo {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f8526a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f8527b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f8528c;
        public float d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f8529e;
    }

    public static class LayoutParams extends ViewGroup.LayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f8530a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f8531b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f8532c;
        public boolean d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f8533e;
        public int f;
    }

    public class MyAccessibilityDelegate extends AccessibilityDelegateCompat {
        public MyAccessibilityDelegate() {
        }

        /* JADX WARN: Code duplicated, block: B:7:0x001a  */
        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final void c(View view, AccessibilityEvent accessibilityEvent) {
            boolean z2;
            PagerAdapter pagerAdapter;
            super.c(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            ViewPager viewPager = ViewPager.this;
            PagerAdapter pagerAdapter2 = viewPager.mAdapter;
            if (pagerAdapter2 != null) {
                z2 = pagerAdapter2.getCount() > 1;
            }
            accessibilityEvent.setScrollable(z2);
            if (accessibilityEvent.getEventType() != 4096 || (pagerAdapter = viewPager.mAdapter) == null) {
                return;
            }
            accessibilityEvent.setItemCount(pagerAdapter.getCount());
            accessibilityEvent.setFromIndex(viewPager.mCurItem);
            accessibilityEvent.setToIndex(viewPager.mCurItem);
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final void d(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            this.f4417a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.f4534a);
            accessibilityNodeInfoCompat.j(ViewPager.class.getName());
            ViewPager viewPager = ViewPager.this;
            PagerAdapter pagerAdapter = viewPager.mAdapter;
            accessibilityNodeInfoCompat.o(pagerAdapter != null && pagerAdapter.getCount() > 1);
            if (viewPager.canScrollHorizontally(1)) {
                accessibilityNodeInfoCompat.a(4096);
            }
            if (viewPager.canScrollHorizontally(-1)) {
                accessibilityNodeInfoCompat.a(Segment.SIZE);
            }
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final boolean g(View view, int i2, Bundle bundle) {
            if (super.g(view, i2, bundle)) {
                return true;
            }
            ViewPager viewPager = ViewPager.this;
            if (i2 == 4096) {
                if (!viewPager.canScrollHorizontally(1)) {
                    return false;
                }
                viewPager.setCurrentItem(viewPager.mCurItem + 1);
                return true;
            }
            if (i2 != 8192 || !viewPager.canScrollHorizontally(-1)) {
                return false;
            }
            viewPager.setCurrentItem(viewPager.mCurItem - 1);
            return true;
        }
    }

    public interface OnAdapterChangeListener {
        void a(ViewPager viewPager, PagerAdapter pagerAdapter);
    }

    public interface OnPageChangeListener {
        void onPageScrollStateChanged(int i2);

        void onPageScrolled(int i2, float f, int i3);

        void onPageSelected(int i2);
    }

    public interface PageTransformer {
        void a();
    }

    public class PagerObserver extends DataSetObserver {
        public PagerObserver() {
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            ViewPager.this.dataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            ViewPager.this.dataSetChanged();
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new AnonymousClass1();
        public int Z;
        public Parcelable e0;
        public final ClassLoader f0;

        /* JADX INFO: renamed from: androidx.viewpager.widget.ViewPager$SavedState$1, reason: invalid class name */
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
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.Z = parcel.readInt();
            this.e0 = parcel.readParcelable(classLoader);
            this.f0 = classLoader;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("FragmentPager.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" position=");
            return a.i(this.Z, "}", sb);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.Z);
            parcel.writeParcelable(this.e0, i2);
        }
    }

    public static class SimpleOnPageChangeListener implements OnPageChangeListener {
        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public final void onPageScrollStateChanged(int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public final void onPageScrolled(int i2, float f, int i3) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public final void onPageSelected(int i2) {
        }
    }

    public static class ViewPositionComparator implements Comparator<View> {
        @Override // java.util.Comparator
        public final int compare(View view, View view2) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            LayoutParams layoutParams2 = (LayoutParams) view2.getLayoutParams();
            boolean z2 = layoutParams.f8530a;
            if (z2 != layoutParams2.f8530a) {
                return z2 ? 1 : -1;
            }
            return layoutParams.f8533e - layoutParams2.f8533e;
        }
    }

    public ViewPager(Context context) {
        super(context);
        this.mItems = new ArrayList<>();
        this.mTempItem = new ItemInfo();
        this.mTempRect = new Rect();
        this.mRestoredCurItem = -1;
        this.mRestoredAdapterState = null;
        this.mRestoredClassLoader = null;
        this.mFirstOffset = -3.4028235E38f;
        this.mLastOffset = Float.MAX_VALUE;
        this.mOffscreenPageLimit = 1;
        this.mActivePointerId = -1;
        this.mFirstLayout = true;
        this.mNeedCalculatePageOffsets = false;
        this.mEndScrollRunnable = new Runnable() { // from class: androidx.viewpager.widget.ViewPager.3
            @Override // java.lang.Runnable
            public final void run() {
                ViewPager viewPager = ViewPager.this;
                viewPager.setScrollState(0);
                viewPager.populate();
            }
        };
        this.mScrollState = 0;
        initViewPager();
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void setScrollingCacheEnabled(boolean z2) {
        if (this.mScrollingCacheEnabled != z2) {
            this.mScrollingCacheEnabled = z2;
        }
    }

    public final void a(boolean z2) {
        boolean z3 = this.mScrollState == 2;
        if (z3) {
            setScrollingCacheEnabled(false);
            if (!this.mScroller.isFinished()) {
                this.mScroller.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.mScroller.getCurrX();
                int currY = this.mScroller.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        g(currX);
                    }
                }
            }
        }
        this.mPopulatePending = false;
        for (int i2 = 0; i2 < this.mItems.size(); i2++) {
            ItemInfo itemInfo = this.mItems.get(i2);
            if (itemInfo.f8528c) {
                itemInfo.f8528c = false;
                z3 = true;
            }
        }
        if (z3) {
            if (!z2) {
                this.mEndScrollRunnable.run();
                return;
            }
            Runnable runnable = this.mEndScrollRunnable;
            WeakHashMap weakHashMap = ViewCompat.f4466a;
            postOnAnimation(runnable);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i2, int i3) {
        ItemInfo itemInfoInfoForChild;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i4 = 0; i4 < getChildCount(); i4++) {
                View childAt = getChildAt(i4);
                if (childAt.getVisibility() == 0 && (itemInfoInfoForChild = infoForChild(childAt)) != null && itemInfoInfoForChild.f8527b == this.mCurItem) {
                    childAt.addFocusables(arrayList, i2, i3);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i3 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    public ItemInfo addNewItem(int i2, int i3) {
        ItemInfo itemInfo = new ItemInfo();
        itemInfo.f8527b = i2;
        itemInfo.f8526a = this.mAdapter.instantiateItem((ViewGroup) this, i2);
        itemInfo.d = this.mAdapter.getPageWidth(i2);
        if (i3 < 0 || i3 >= this.mItems.size()) {
            this.mItems.add(itemInfo);
            return itemInfo;
        }
        this.mItems.add(i3, itemInfo);
        return itemInfo;
    }

    public void addOnAdapterChangeListener(OnAdapterChangeListener onAdapterChangeListener) {
        if (this.mAdapterChangeListeners == null) {
            this.mAdapterChangeListeners = new ArrayList();
        }
        this.mAdapterChangeListeners.add(onAdapterChangeListener);
    }

    public void addOnPageChangeListener(OnPageChangeListener onPageChangeListener) {
        if (this.mOnPageChangeListeners == null) {
            this.mOnPageChangeListeners = new ArrayList();
        }
        this.mOnPageChangeListeners.add(onPageChangeListener);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList<View> arrayList) {
        ItemInfo itemInfoInfoForChild;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (itemInfoInfoForChild = infoForChild(childAt)) != null && itemInfoInfoForChild.f8527b == this.mCurItem) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        boolean z2 = layoutParams2.f8530a | (view.getClass().getAnnotation(DecorView.class) != null);
        layoutParams2.f8530a = z2;
        if (!this.mInLayout) {
            super.addView(view, i2, layoutParams);
        } else {
            if (z2) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            layoutParams2.d = true;
            addViewInLayout(view, i2, layoutParams);
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00bc  */
    public boolean arrowScroll(int i2) {
        boolean zPageLeft;
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
            break;
        }
        if (viewFindFocus != null) {
            ViewParent parent = viewFindFocus.getParent();
            while (true) {
                if (!(parent instanceof ViewGroup)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(viewFindFocus.getClass().getSimpleName());
                    for (ViewParent parent2 = viewFindFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                        sb.append(" => ");
                        sb.append(parent2.getClass().getSimpleName());
                    }
                    Log.e(TAG, "arrowScroll tried to find focus based on non-child current focused view " + sb.toString());
                    viewFindFocus = null;
                    break;
                }
                if (parent == this) {
                    break;
                }
                parent = parent.getParent();
            }
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i2);
        if (viewFindNextFocus == null || viewFindNextFocus == viewFindFocus) {
            if (i2 == 17 || i2 == 1) {
                zPageLeft = pageLeft();
            } else if (i2 == 66 || i2 == 2) {
                zPageLeft = pageRight();
            } else {
                zPageLeft = false;
            }
        } else if (i2 == 17) {
            zPageLeft = (viewFindFocus == null || d(this.mTempRect, viewFindNextFocus).left < d(this.mTempRect, viewFindFocus).left) ? viewFindNextFocus.requestFocus() : pageLeft();
        } else if (i2 == 66) {
            zPageLeft = (viewFindFocus == null || d(this.mTempRect, viewFindNextFocus).left > d(this.mTempRect, viewFindFocus).left) ? viewFindNextFocus.requestFocus() : pageRight();
        } else {
            zPageLeft = false;
        }
        if (zPageLeft) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i2));
        }
        return zPageLeft;
    }

    public final int b(int i2, float f, int i3, int i4) {
        if (Math.abs(i4) <= this.mFlingDistance || Math.abs(i3) <= this.mMinimumVelocity) {
            i2 += (int) (f + (i2 >= this.mCurItem ? 0.4f : 0.6f));
        } else if (i3 <= 0) {
            i2++;
        }
        if (this.mItems.size() > 0) {
            return Math.max(this.mItems.get(0).f8527b, Math.min(i2, ((ItemInfo) a.d(1, this.mItems)).f8527b));
        }
        return i2;
    }

    public boolean beginFakeDrag() {
        if (this.mIsBeingDragged) {
            return false;
        }
        this.mFakeDragging = true;
        setScrollState(1);
        this.mLastMotionX = 0.0f;
        this.mInitialMotionX = 0.0f;
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, 0.0f, 0.0f, 0);
        this.mVelocityTracker.addMovement(motionEventObtain);
        motionEventObtain.recycle();
        this.mFakeDragBeginTime = jUptimeMillis;
        return true;
    }

    public final void c(int i2) {
        OnPageChangeListener onPageChangeListener = this.mOnPageChangeListener;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageSelected(i2);
        }
        List<OnPageChangeListener> list = this.mOnPageChangeListeners;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                OnPageChangeListener onPageChangeListener2 = this.mOnPageChangeListeners.get(i3);
                if (onPageChangeListener2 != null) {
                    onPageChangeListener2.onPageSelected(i2);
                }
            }
        }
        OnPageChangeListener onPageChangeListener3 = this.mInternalPageChangeListener;
        if (onPageChangeListener3 != null) {
            onPageChangeListener3.onPageSelected(i2);
        }
    }

    public boolean canScroll(View view, boolean z2, int i2, int i3, int i4) {
        int i5;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i6 = i3 + scrollX;
                if (i6 >= childAt.getLeft() && i6 < childAt.getRight() && (i5 = i4 + scrollY) >= childAt.getTop() && i5 < childAt.getBottom() && canScroll(childAt, true, i2, i6 - childAt.getLeft(), i5 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z2 && view.canScrollHorizontally(-i2);
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i2) {
        if (this.mAdapter == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        if (i2 < 0) {
            return scrollX > ((int) (((float) clientWidth) * this.mFirstOffset));
        }
        return i2 > 0 && scrollX < ((int) (((float) clientWidth) * this.mLastOffset));
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    public void clearOnPageChangeListeners() {
        List<OnPageChangeListener> list = this.mOnPageChangeListeners;
        if (list != null) {
            list.clear();
        }
    }

    @Override // android.view.View
    public void computeScroll() {
        this.mIsScrollStarted = true;
        if (this.mScroller.isFinished() || !this.mScroller.computeScrollOffset()) {
            a(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.mScroller.getCurrX();
        int currY = this.mScroller.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!g(currX)) {
                this.mScroller.abortAnimation();
                scrollTo(0, currY);
            }
        }
        WeakHashMap weakHashMap = ViewCompat.f4466a;
        postInvalidateOnAnimation();
    }

    public final Rect d(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left = viewGroup.getLeft() + rect.left;
            rect.right = viewGroup.getRight() + rect.right;
            rect.top = viewGroup.getTop() + rect.top;
            rect.bottom = viewGroup.getBottom() + rect.bottom;
            parent = viewGroup.getParent();
        }
        return rect;
    }

    public void dataSetChanged() {
        int count = this.mAdapter.getCount();
        this.mExpectedAdapterCount = count;
        boolean z2 = this.mItems.size() < (this.mOffscreenPageLimit * 2) + 1 && this.mItems.size() < count;
        int iMax = this.mCurItem;
        int i2 = 0;
        boolean z3 = false;
        while (i2 < this.mItems.size()) {
            ItemInfo itemInfo = this.mItems.get(i2);
            int itemPosition = this.mAdapter.getItemPosition(itemInfo.f8526a);
            if (itemPosition != -1) {
                if (itemPosition == -2) {
                    this.mItems.remove(i2);
                    i2--;
                    if (!z3) {
                        this.mAdapter.startUpdate((ViewGroup) this);
                        z3 = true;
                    }
                    this.mAdapter.destroyItem((ViewGroup) this, itemInfo.f8527b, itemInfo.f8526a);
                    int i3 = this.mCurItem;
                    if (i3 == itemInfo.f8527b) {
                        iMax = Math.max(0, Math.min(i3, count - 1));
                    }
                } else {
                    int i4 = itemInfo.f8527b;
                    if (i4 != itemPosition) {
                        if (i4 == this.mCurItem) {
                            iMax = itemPosition;
                        }
                        itemInfo.f8527b = itemPosition;
                    }
                }
                z2 = true;
            }
            i2++;
        }
        if (z3) {
            this.mAdapter.finishUpdate((ViewGroup) this);
        }
        Collections.sort(this.mItems, COMPARATOR);
        if (z2) {
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                LayoutParams layoutParams = (LayoutParams) getChildAt(i5).getLayoutParams();
                if (!layoutParams.f8530a) {
                    layoutParams.f8532c = 0.0f;
                }
            }
            setCurrentItemInternal(iMax, false, true);
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || executeKeyEvent(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        ItemInfo itemInfoInfoForChild;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (itemInfoInfoForChild = infoForChild(childAt)) != null && itemInfoInfoForChild.f8527b == this.mCurItem && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    public float distanceInfluenceForSnapDuration(float f) {
        return (float) Math.sin((f - 0.5f) * 0.47123894f);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        PagerAdapter pagerAdapter;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean zDraw = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (pagerAdapter = this.mAdapter) != null && pagerAdapter.getCount() > 1)) {
            if (!this.mLeftEdge.isFinished()) {
                int iSave = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate(getPaddingTop() + (-height), this.mFirstOffset * width);
                this.mLeftEdge.setSize(height, width);
                zDraw = this.mLeftEdge.draw(canvas);
                canvas.restoreToCount(iSave);
            }
            if (!this.mRightEdge.isFinished()) {
                int iSave2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.mLastOffset + 1.0f)) * width2);
                this.mRightEdge.setSize(height2, width2);
                zDraw |= this.mRightEdge.draw(canvas);
                canvas.restoreToCount(iSave2);
            }
        } else {
            this.mLeftEdge.finish();
            this.mRightEdge.finish();
        }
        if (zDraw) {
            WeakHashMap weakHashMap = ViewCompat.f4466a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.mMarginDrawable;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    public final ItemInfo e() {
        int i2;
        int clientWidth = getClientWidth();
        float f = 0.0f;
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f2 = clientWidth > 0 ? this.mPageMargin / clientWidth : 0.0f;
        int i3 = 0;
        boolean z2 = true;
        ItemInfo itemInfo = null;
        int i4 = -1;
        float f3 = 0.0f;
        while (i3 < this.mItems.size()) {
            ItemInfo itemInfo2 = this.mItems.get(i3);
            if (!z2 && itemInfo2.f8527b != (i2 = i4 + 1)) {
                itemInfo2 = this.mTempItem;
                itemInfo2.f8529e = f + f3 + f2;
                itemInfo2.f8527b = i2;
                itemInfo2.d = this.mAdapter.getPageWidth(i2);
                i3--;
            }
            ItemInfo itemInfo3 = itemInfo2;
            f = itemInfo3.f8529e;
            float f4 = itemInfo3.d + f + f2;
            if (!z2 && scrollX < f) {
                break;
            }
            if (scrollX < f4 || i3 == this.mItems.size() - 1) {
                return itemInfo3;
            }
            int i5 = itemInfo3.f8527b;
            float f5 = itemInfo3.d;
            i3++;
            i4 = i5;
            f3 = f5;
            itemInfo = itemInfo3;
            z2 = false;
        }
        return itemInfo;
    }

    public void endFakeDrag() {
        if (!this.mFakeDragging) {
            throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        }
        if (this.mAdapter != null) {
            VelocityTracker velocityTracker = this.mVelocityTracker;
            velocityTracker.computeCurrentVelocity(1000, this.mMaximumVelocity);
            int xVelocity = (int) velocityTracker.getXVelocity(this.mActivePointerId);
            this.mPopulatePending = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            ItemInfo itemInfoE = e();
            setCurrentItemInternal(b(itemInfoE.f8527b, ((scrollX / clientWidth) - itemInfoE.f8529e) / itemInfoE.d, xVelocity, (int) (this.mLastMotionX - this.mInitialMotionX)), true, true, xVelocity);
        }
        this.mIsBeingDragged = false;
        this.mIsUnableToDrag = false;
        VelocityTracker velocityTracker2 = this.mVelocityTracker;
        if (velocityTracker2 != null) {
            velocityTracker2.recycle();
            this.mVelocityTracker = null;
        }
        this.mFakeDragging = false;
    }

    public boolean executeKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 21) {
            return keyEvent.hasModifiers(2) ? pageLeft() : arrowScroll(17);
        }
        if (keyCode == 22) {
            return keyEvent.hasModifiers(2) ? pageRight() : arrowScroll(66);
        }
        if (keyCode != 61) {
            return false;
        }
        if (keyEvent.hasNoModifiers()) {
            return arrowScroll(2);
        }
        if (keyEvent.hasModifiers(1)) {
            return arrowScroll(1);
        }
        return false;
    }

    public final void f(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mActivePointerId) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.mLastMotionX = motionEvent.getX(i2);
            this.mActivePointerId = motionEvent.getPointerId(i2);
            VelocityTracker velocityTracker = this.mVelocityTracker;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public void fakeDragBy(float f) {
        if (!this.mFakeDragging) {
            throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        }
        if (this.mAdapter == null) {
            return;
        }
        this.mLastMotionX += f;
        float scrollX = getScrollX() - f;
        float clientWidth = getClientWidth();
        float f2 = this.mFirstOffset * clientWidth;
        float f3 = this.mLastOffset * clientWidth;
        ItemInfo itemInfo = this.mItems.get(0);
        ItemInfo itemInfo2 = (ItemInfo) a.d(1, this.mItems);
        if (itemInfo.f8527b != 0) {
            f2 = itemInfo.f8529e * clientWidth;
        }
        if (itemInfo2.f8527b != this.mAdapter.getCount() - 1) {
            f3 = itemInfo2.f8529e * clientWidth;
        }
        if (scrollX < f2) {
            scrollX = f2;
        } else if (scrollX > f3) {
            scrollX = f3;
        }
        int i2 = (int) scrollX;
        this.mLastMotionX = (scrollX - i2) + this.mLastMotionX;
        scrollTo(i2, getScrollY());
        g(i2);
        MotionEvent motionEventObtain = MotionEvent.obtain(this.mFakeDragBeginTime, SystemClock.uptimeMillis(), 2, this.mLastMotionX, 0.0f, 0);
        this.mVelocityTracker.addMovement(motionEventObtain);
        motionEventObtain.recycle();
    }

    public final boolean g(int i2) {
        if (this.mItems.size() == 0) {
            if (this.mFirstLayout) {
                return false;
            }
            this.mCalledSuper = false;
            onPageScrolled(0, 0.0f, 0);
            if (this.mCalledSuper) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        ItemInfo itemInfoE = e();
        int clientWidth = getClientWidth();
        int i3 = this.mPageMargin;
        int i4 = clientWidth + i3;
        float f = clientWidth;
        int i5 = itemInfoE.f8527b;
        float f2 = ((i2 / f) - itemInfoE.f8529e) / (itemInfoE.d + (i3 / f));
        this.mCalledSuper = false;
        onPageScrolled(i5, f2, (int) (i4 * f2));
        if (this.mCalledSuper) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        LayoutParams layoutParams = new LayoutParams(-1, -1);
        layoutParams.f8532c = 0.0f;
        return layoutParams;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public PagerAdapter getAdapter() {
        return this.mAdapter;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i2, int i3) {
        if (this.mDrawingOrder == 2) {
            i3 = (i2 - 1) - i3;
        }
        return ((LayoutParams) this.mDrawingOrderedChildren.get(i3).getLayoutParams()).f;
    }

    public int getCurrentItem() {
        return this.mCurItem;
    }

    public int getOffscreenPageLimit() {
        return this.mOffscreenPageLimit;
    }

    public int getPageMargin() {
        return this.mPageMargin;
    }

    public final boolean h(float f) {
        boolean z2;
        boolean z3;
        float f2 = this.mLastMotionX - f;
        this.mLastMotionX = f;
        float scrollX = getScrollX() + f2;
        float clientWidth = getClientWidth();
        float f3 = this.mFirstOffset * clientWidth;
        float f4 = this.mLastOffset * clientWidth;
        boolean z4 = false;
        ItemInfo itemInfo = this.mItems.get(0);
        ItemInfo itemInfo2 = (ItemInfo) a.d(1, this.mItems);
        if (itemInfo.f8527b != 0) {
            f3 = itemInfo.f8529e * clientWidth;
            z2 = false;
        } else {
            z2 = true;
        }
        if (itemInfo2.f8527b != this.mAdapter.getCount() - 1) {
            f4 = itemInfo2.f8529e * clientWidth;
            z3 = false;
        } else {
            z3 = true;
        }
        if (scrollX < f3) {
            if (z2) {
                this.mLeftEdge.onPull(Math.abs(f3 - scrollX) / clientWidth);
                z4 = true;
            }
            scrollX = f3;
        } else if (scrollX > f4) {
            if (z3) {
                this.mRightEdge.onPull(Math.abs(scrollX - f4) / clientWidth);
                z4 = true;
            }
            scrollX = f4;
        }
        int i2 = (int) scrollX;
        this.mLastMotionX = (scrollX - i2) + this.mLastMotionX;
        scrollTo(i2, getScrollY());
        g(i2);
        return z4;
    }

    public final void i(int i2, int i3, int i4, int i5) {
        if (i3 > 0 && !this.mItems.isEmpty()) {
            if (!this.mScroller.isFinished()) {
                this.mScroller.setFinalX(getCurrentItem() * getClientWidth());
                return;
            } else {
                scrollTo((int) ((getScrollX() / (((i3 - getPaddingLeft()) - getPaddingRight()) + i5)) * (((i2 - getPaddingLeft()) - getPaddingRight()) + i4)), getScrollY());
                return;
            }
        }
        ItemInfo itemInfoInfoForPosition = infoForPosition(this.mCurItem);
        int iMin = (int) ((itemInfoInfoForPosition != null ? Math.min(itemInfoInfoForPosition.f8529e, this.mLastOffset) : 0.0f) * ((i2 - getPaddingLeft()) - getPaddingRight()));
        if (iMin != getScrollX()) {
            a(false);
            scrollTo(iMin, getScrollY());
        }
    }

    public ItemInfo infoForAnyChild(View view) {
        while (true) {
            Object parent = view.getParent();
            if (parent == this) {
                return infoForChild(view);
            }
            if (parent == null || !(parent instanceof View)) {
                return null;
            }
            view = (View) parent;
        }
    }

    public ItemInfo infoForChild(View view) {
        for (int i2 = 0; i2 < this.mItems.size(); i2++) {
            ItemInfo itemInfo = this.mItems.get(i2);
            if (this.mAdapter.isViewFromObject(view, itemInfo.f8526a)) {
                return itemInfo;
            }
        }
        return null;
    }

    public ItemInfo infoForPosition(int i2) {
        for (int i3 = 0; i3 < this.mItems.size(); i3++) {
            ItemInfo itemInfo = this.mItems.get(i3);
            if (itemInfo.f8527b == i2) {
                return itemInfo;
            }
        }
        return null;
    }

    public void initViewPager() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.mScroller = new Scroller(context, sInterpolator);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.mTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
        this.mMinimumVelocity = (int) (400.0f * f);
        this.mMaximumVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        this.mLeftEdge = new EdgeEffect(context);
        this.mRightEdge = new EdgeEffect(context);
        this.mFlingDistance = (int) (25.0f * f);
        this.mCloseEnough = (int) (2.0f * f);
        this.mDefaultGutterSize = (int) (f * 16.0f);
        ViewCompat.z(this, new MyAccessibilityDelegate());
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        ViewCompat.G(this, new OnApplyWindowInsetsListener() { // from class: androidx.viewpager.widget.ViewPager.4
            public final Rect X = new Rect();

            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat d(View view, WindowInsetsCompat windowInsetsCompat) {
                WindowInsetsCompat windowInsetsCompatT = ViewCompat.t(view, windowInsetsCompat);
                if (windowInsetsCompatT.m()) {
                    return windowInsetsCompatT;
                }
                int iH = windowInsetsCompatT.h();
                Rect rect = this.X;
                rect.left = iH;
                rect.top = windowInsetsCompatT.j();
                rect.right = windowInsetsCompatT.i();
                rect.bottom = windowInsetsCompatT.g();
                ViewPager viewPager = ViewPager.this;
                int childCount = viewPager.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    WindowInsetsCompat windowInsetsCompatC = ViewCompat.c(viewPager.getChildAt(i2), windowInsetsCompatT);
                    rect.left = Math.min(windowInsetsCompatC.h(), rect.left);
                    rect.top = Math.min(windowInsetsCompatC.j(), rect.top);
                    rect.right = Math.min(windowInsetsCompatC.i(), rect.right);
                    rect.bottom = Math.min(windowInsetsCompatC.g(), rect.bottom);
                }
                return windowInsetsCompatT.n(rect.left, rect.top, rect.right, rect.bottom);
            }
        });
    }

    public boolean isFakeDragging() {
        return this.mFakeDragging;
    }

    public final boolean j() {
        this.mActivePointerId = -1;
        this.mIsBeingDragged = false;
        this.mIsUnableToDrag = false;
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.mVelocityTracker = null;
        }
        this.mLeftEdge.onRelease();
        this.mRightEdge.onRelease();
        return this.mLeftEdge.isFinished() || this.mRightEdge.isFinished();
    }

    public final void k(int i2, int i3, boolean z2, boolean z3) {
        int iMax;
        ItemInfo itemInfoInfoForPosition = infoForPosition(i2);
        if (itemInfoInfoForPosition != null) {
            iMax = (int) (Math.max(this.mFirstOffset, Math.min(itemInfoInfoForPosition.f8529e, this.mLastOffset)) * getClientWidth());
        } else {
            iMax = 0;
        }
        if (z2) {
            smoothScrollTo(iMax, 0, i3);
            if (z3) {
                c(i2);
                return;
            }
            return;
        }
        if (z3) {
            c(i2);
        }
        a(false);
        scrollTo(iMax, 0);
        g(iMax);
    }

    public final void l() {
        if (this.mDrawingOrder != 0) {
            ArrayList<View> arrayList = this.mDrawingOrderedChildren;
            if (arrayList == null) {
                this.mDrawingOrderedChildren = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                this.mDrawingOrderedChildren.add(getChildAt(i2));
            }
            Collections.sort(this.mDrawingOrderedChildren, sPositionComparator);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mFirstLayout = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.mEndScrollRunnable);
        Scroller scroller = this.mScroller;
        if (scroller != null && !scroller.isFinished()) {
            this.mScroller.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i2;
        float f;
        super.onDraw(canvas);
        if (this.mPageMargin <= 0 || this.mMarginDrawable == null || this.mItems.size() <= 0 || this.mAdapter == null) {
            return;
        }
        int scrollX = getScrollX();
        int width = getWidth();
        float f2 = width;
        float f3 = this.mPageMargin / f2;
        int i3 = 0;
        ItemInfo itemInfo = this.mItems.get(0);
        float f4 = itemInfo.f8529e;
        int size = this.mItems.size();
        int i4 = itemInfo.f8527b;
        int i5 = this.mItems.get(size - 1).f8527b;
        while (i4 < i5) {
            while (true) {
                i2 = itemInfo.f8527b;
                if (i4 <= i2 || i3 >= size) {
                    break;
                }
                i3++;
                itemInfo = this.mItems.get(i3);
            }
            if (i4 == i2) {
                float f5 = itemInfo.f8529e;
                float f6 = itemInfo.d;
                f = (f5 + f6) * f2;
                f4 = f5 + f6 + f3;
            } else {
                float pageWidth = this.mAdapter.getPageWidth(i4);
                f = (f4 + pageWidth) * f2;
                f4 = pageWidth + f3 + f4;
            }
            if (this.mPageMargin + f > scrollX) {
                this.mMarginDrawable.setBounds(Math.round(f), this.mTopPageBounds, Math.round(this.mPageMargin + f), this.mBottomPageBounds);
                this.mMarginDrawable.draw(canvas);
            }
            if (f > scrollX + width) {
                return;
            }
            i4++;
            scrollX = scrollX;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            j();
            return false;
        }
        if (action != 0) {
            if (this.mIsBeingDragged) {
                return true;
            }
            if (this.mIsUnableToDrag) {
                return false;
            }
        }
        if (action == 0) {
            float x = motionEvent.getX();
            this.mInitialMotionX = x;
            this.mLastMotionX = x;
            float y = motionEvent.getY();
            this.mInitialMotionY = y;
            this.mLastMotionY = y;
            this.mActivePointerId = motionEvent.getPointerId(0);
            this.mIsUnableToDrag = false;
            this.mIsScrollStarted = true;
            this.mScroller.computeScrollOffset();
            if (this.mScrollState != 2 || Math.abs(this.mScroller.getFinalX() - this.mScroller.getCurrX()) <= this.mCloseEnough) {
                a(false);
                this.mIsBeingDragged = false;
            } else {
                this.mScroller.abortAnimation();
                this.mPopulatePending = false;
                populate();
                this.mIsBeingDragged = true;
                ViewParent parent = getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                setScrollState(1);
            }
        } else if (action == 2) {
            int i2 = this.mActivePointerId;
            if (i2 != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i2);
                float x2 = motionEvent.getX(iFindPointerIndex);
                float f = x2 - this.mLastMotionX;
                float fAbs = Math.abs(f);
                float y2 = motionEvent.getY(iFindPointerIndex);
                float fAbs2 = Math.abs(y2 - this.mInitialMotionY);
                if (f != 0.0f) {
                    float f2 = this.mLastMotionX;
                    if ((f2 >= this.mGutterSize || f <= 0.0f) && ((f2 <= getWidth() - this.mGutterSize || f >= 0.0f) && canScroll(this, false, (int) f, (int) x2, (int) y2))) {
                        this.mLastMotionX = x2;
                        this.mLastMotionY = y2;
                        this.mIsUnableToDrag = true;
                        return false;
                    }
                }
                float f3 = this.mTouchSlop;
                if (fAbs > f3 && fAbs * 0.5f > fAbs2) {
                    this.mIsBeingDragged = true;
                    ViewParent parent2 = getParent();
                    if (parent2 != null) {
                        parent2.requestDisallowInterceptTouchEvent(true);
                    }
                    setScrollState(1);
                    float f4 = this.mInitialMotionX;
                    float f5 = this.mTouchSlop;
                    this.mLastMotionX = f > 0.0f ? f4 + f5 : f4 - f5;
                    this.mLastMotionY = y2;
                    setScrollingCacheEnabled(true);
                } else if (fAbs2 > f3) {
                    this.mIsUnableToDrag = true;
                }
                if (this.mIsBeingDragged && h(x2)) {
                    WeakHashMap weakHashMap = ViewCompat.f4466a;
                    postInvalidateOnAnimation();
                }
            }
        } else if (action == 6) {
            f(motionEvent);
        }
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        return this.mIsBeingDragged;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0072  */
    /* JADX WARN: Code duplicated, block: B:24:0x0076  */
    /* JADX WARN: Code duplicated, block: B:26:0x007a  */
    /* JADX WARN: Code duplicated, block: B:27:0x007c  */
    /* JADX WARN: Code duplicated, block: B:29:0x008e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0094  */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        boolean z3;
        ItemInfo itemInfoInfoForChild;
        int iMax;
        int measuredWidth;
        int iMax2;
        int measuredHeight;
        int childCount = getChildCount();
        int i6 = i4 - i2;
        int i7 = i5 - i3;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f8530a) {
                    int i10 = layoutParams.f8531b;
                    int i11 = i10 & 7;
                    int i12 = i10 & 112;
                    if (i11 != 1) {
                        if (i11 == 3) {
                            measuredWidth = childAt.getMeasuredWidth() + paddingLeft;
                        } else if (i11 != 5) {
                            measuredWidth = paddingLeft;
                        } else {
                            iMax = (i6 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        if (i12 != 16) {
                            if (i12 != 48) {
                                measuredHeight = childAt.getMeasuredHeight() + paddingTop;
                            } else if (i12 != 80) {
                                measuredHeight = paddingTop;
                            } else {
                                iMax2 = (i7 - paddingBottom) - childAt.getMeasuredHeight();
                                paddingBottom += childAt.getMeasuredHeight();
                            }
                            int i13 = paddingLeft + scrollX;
                            childAt.layout(i13, paddingTop, childAt.getMeasuredWidth() + i13, childAt.getMeasuredHeight() + paddingTop);
                            i8++;
                            paddingTop = measuredHeight;
                            paddingLeft = measuredWidth;
                        } else {
                            iMax2 = Math.max((i7 - childAt.getMeasuredHeight()) / 2, paddingTop);
                        }
                        int i14 = iMax2;
                        measuredHeight = paddingTop;
                        paddingTop = i14;
                        int i15 = paddingLeft + scrollX;
                        childAt.layout(i15, paddingTop, childAt.getMeasuredWidth() + i15, childAt.getMeasuredHeight() + paddingTop);
                        i8++;
                        paddingTop = measuredHeight;
                        paddingLeft = measuredWidth;
                    } else {
                        iMax = Math.max((i6 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i16 = iMax;
                    measuredWidth = paddingLeft;
                    paddingLeft = i16;
                    if (i12 != 16) {
                        if (i12 != 48) {
                            measuredHeight = childAt.getMeasuredHeight() + paddingTop;
                        } else if (i12 != 80) {
                            measuredHeight = paddingTop;
                        } else {
                            iMax2 = (i7 - paddingBottom) - childAt.getMeasuredHeight();
                            paddingBottom += childAt.getMeasuredHeight();
                        }
                        int i17 = paddingLeft + scrollX;
                        childAt.layout(i17, paddingTop, childAt.getMeasuredWidth() + i17, childAt.getMeasuredHeight() + paddingTop);
                        i8++;
                        paddingTop = measuredHeight;
                        paddingLeft = measuredWidth;
                    } else {
                        iMax2 = Math.max((i7 - childAt.getMeasuredHeight()) / 2, paddingTop);
                    }
                    int i18 = iMax2;
                    measuredHeight = paddingTop;
                    paddingTop = i18;
                    int i19 = paddingLeft + scrollX;
                    childAt.layout(i19, paddingTop, childAt.getMeasuredWidth() + i19, childAt.getMeasuredHeight() + paddingTop);
                    i8++;
                    paddingTop = measuredHeight;
                    paddingLeft = measuredWidth;
                }
            }
        }
        int i20 = (i6 - paddingLeft) - paddingRight;
        for (int i21 = 0; i21 < childCount; i21++) {
            View childAt2 = getChildAt(i21);
            if (childAt2.getVisibility() != 8) {
                LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
                if (!layoutParams2.f8530a && (itemInfoInfoForChild = infoForChild(childAt2)) != null) {
                    float f = i20;
                    int i22 = ((int) (itemInfoInfoForChild.f8529e * f)) + paddingLeft;
                    if (layoutParams2.d) {
                        layoutParams2.d = false;
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (f * layoutParams2.f8532c), 1073741824), View.MeasureSpec.makeMeasureSpec((i7 - paddingTop) - paddingBottom, 1073741824));
                    }
                    childAt2.layout(i22, paddingTop, childAt2.getMeasuredWidth() + i22, childAt2.getMeasuredHeight() + paddingTop);
                }
            }
        }
        this.mTopPageBounds = paddingTop;
        this.mBottomPageBounds = i7 - paddingBottom;
        this.mDecorChildCount = i8;
        if (this.mFirstLayout) {
            z3 = false;
            k(this.mCurItem, 0, false, false);
        } else {
            z3 = false;
        }
        this.mFirstLayout = z3;
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        LayoutParams layoutParams;
        LayoutParams layoutParams2;
        int i4;
        setMeasuredDimension(View.getDefaultSize(0, i2), View.getDefaultSize(0, i3));
        int measuredWidth = getMeasuredWidth();
        this.mGutterSize = Math.min(measuredWidth / 10, this.mDefaultGutterSize);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i5 = 0;
        while (true) {
            boolean z2 = true;
            int i6 = 1073741824;
            if (i5 >= childCount) {
                break;
            }
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8 && (layoutParams2 = (LayoutParams) childAt.getLayoutParams()) != null && layoutParams2.f8530a) {
                int i7 = layoutParams2.f8531b;
                int i8 = i7 & 7;
                int i9 = i7 & 112;
                boolean z3 = i9 == 48 || i9 == 80;
                if (i8 != 3 && i8 != 5) {
                    z2 = false;
                }
                int i10 = Integer.MIN_VALUE;
                if (z3) {
                    i4 = Integer.MIN_VALUE;
                    i10 = 1073741824;
                } else {
                    i4 = z2 ? 1073741824 : Integer.MIN_VALUE;
                }
                int i11 = ((ViewGroup.LayoutParams) layoutParams2).width;
                if (i11 != -2) {
                    if (i11 == -1) {
                        i11 = paddingLeft;
                    }
                    i10 = 1073741824;
                } else {
                    i11 = paddingLeft;
                }
                int i12 = ((ViewGroup.LayoutParams) layoutParams2).height;
                if (i12 == -2) {
                    i12 = measuredHeight;
                    i6 = i4;
                } else if (i12 == -1) {
                    i12 = measuredHeight;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i11, i10), View.MeasureSpec.makeMeasureSpec(i12, i6));
                if (z3) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z2) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i5++;
        }
        this.mChildWidthMeasureSpec = View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.mChildHeightMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.mInLayout = true;
        populate();
        this.mInLayout = false;
        int childCount2 = getChildCount();
        for (int i13 = 0; i13 < childCount2; i13++) {
            View childAt2 = getChildAt(i13);
            if (childAt2.getVisibility() != 8 && ((layoutParams = (LayoutParams) childAt2.getLayoutParams()) == null || !layoutParams.f8530a)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * layoutParams.f8532c), 1073741824), this.mChildHeightMeasureSpec);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0065  */
    public void onPageScrolled(int i2, float f, int i3) {
        int iMax;
        int width;
        int left;
        if (this.mDecorChildCount > 0) {
            int scrollX = getScrollX();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width2 = getWidth();
            int childCount = getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f8530a) {
                    int i5 = layoutParams.f8531b & 7;
                    if (i5 != 1) {
                        if (i5 == 3) {
                            width = childAt.getWidth() + paddingLeft;
                        } else if (i5 != 5) {
                            width = paddingLeft;
                        } else {
                            iMax = (width2 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        left = (paddingLeft + scrollX) - childAt.getLeft();
                        if (left != 0) {
                            childAt.offsetLeftAndRight(left);
                        }
                        paddingLeft = width;
                    } else {
                        iMax = Math.max((width2 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i6 = iMax;
                    width = paddingLeft;
                    paddingLeft = i6;
                    left = (paddingLeft + scrollX) - childAt.getLeft();
                    if (left != 0) {
                        childAt.offsetLeftAndRight(left);
                    }
                    paddingLeft = width;
                }
            }
        }
        OnPageChangeListener onPageChangeListener = this.mOnPageChangeListener;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageScrolled(i2, f, i3);
        }
        List<OnPageChangeListener> list = this.mOnPageChangeListeners;
        if (list != null) {
            int size = list.size();
            for (int i7 = 0; i7 < size; i7++) {
                OnPageChangeListener onPageChangeListener2 = this.mOnPageChangeListeners.get(i7);
                if (onPageChangeListener2 != null) {
                    onPageChangeListener2.onPageScrolled(i2, f, i3);
                }
            }
        }
        OnPageChangeListener onPageChangeListener3 = this.mInternalPageChangeListener;
        if (onPageChangeListener3 != null) {
            onPageChangeListener3.onPageScrolled(i2, f, i3);
        }
        if (this.mPageTransformer != null) {
            getScrollX();
            int childCount2 = getChildCount();
            for (int i8 = 0; i8 < childCount2; i8++) {
                View childAt2 = getChildAt(i8);
                if (!((LayoutParams) childAt2.getLayoutParams()).f8530a) {
                    childAt2.getLeft();
                    getClientWidth();
                    this.mPageTransformer.a();
                }
            }
        }
        this.mCalledSuper = true;
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i2, Rect rect) {
        int i3;
        int i4;
        int i5;
        ItemInfo itemInfoInfoForChild;
        int childCount = getChildCount();
        if ((i2 & 2) != 0) {
            i4 = childCount;
            i3 = 0;
            i5 = 1;
        } else {
            i3 = childCount - 1;
            i4 = -1;
            i5 = -1;
        }
        while (i3 != i4) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() == 0 && (itemInfoInfoForChild = infoForChild(childAt)) != null && itemInfoInfoForChild.f8527b == this.mCurItem && childAt.requestFocus(i2, rect)) {
                return true;
            }
            i3 += i5;
        }
        return false;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.X);
        PagerAdapter pagerAdapter = this.mAdapter;
        ClassLoader classLoader = savedState.f0;
        if (pagerAdapter != null) {
            pagerAdapter.restoreState(savedState.e0, classLoader);
            setCurrentItemInternal(savedState.Z, false, true);
        } else {
            this.mRestoredCurItem = savedState.Z;
            this.mRestoredAdapterState = savedState.e0;
            this.mRestoredClassLoader = classLoader;
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.Z = this.mCurItem;
        PagerAdapter pagerAdapter = this.mAdapter;
        if (pagerAdapter != null) {
            savedState.e0 = pagerAdapter.saveState();
        }
        return savedState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 != i4) {
            int i6 = this.mPageMargin;
            i(i2, i4, i6, i6);
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00e4  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        PagerAdapter pagerAdapter;
        if (!this.mFakeDragging) {
            boolean zJ = false;
            if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (pagerAdapter = this.mAdapter) == null || pagerAdapter.getCount() == 0) {
                return false;
            }
            if (this.mVelocityTracker == null) {
                this.mVelocityTracker = VelocityTracker.obtain();
            }
            this.mVelocityTracker.addMovement(motionEvent);
            int action = motionEvent.getAction() & 255;
            if (action == 0) {
                this.mScroller.abortAnimation();
                this.mPopulatePending = false;
                populate();
                float x = motionEvent.getX();
                this.mInitialMotionX = x;
                this.mLastMotionX = x;
                float y = motionEvent.getY();
                this.mInitialMotionY = y;
                this.mLastMotionY = y;
                this.mActivePointerId = motionEvent.getPointerId(0);
            } else if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        if (action == 5) {
                            int actionIndex = motionEvent.getActionIndex();
                            this.mLastMotionX = motionEvent.getX(actionIndex);
                            this.mActivePointerId = motionEvent.getPointerId(actionIndex);
                        } else if (action == 6) {
                            f(motionEvent);
                            this.mLastMotionX = motionEvent.getX(motionEvent.findPointerIndex(this.mActivePointerId));
                        }
                    } else if (this.mIsBeingDragged) {
                        k(this.mCurItem, 0, true, false);
                        zJ = j();
                    }
                } else if (!this.mIsBeingDragged) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.mActivePointerId);
                    if (iFindPointerIndex == -1) {
                        zJ = j();
                    } else {
                        float x2 = motionEvent.getX(iFindPointerIndex);
                        float fAbs = Math.abs(x2 - this.mLastMotionX);
                        float y2 = motionEvent.getY(iFindPointerIndex);
                        float fAbs2 = Math.abs(y2 - this.mLastMotionY);
                        if (fAbs > this.mTouchSlop && fAbs > fAbs2) {
                            this.mIsBeingDragged = true;
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                            float f = this.mInitialMotionX;
                            this.mLastMotionX = x2 - f > 0.0f ? f + this.mTouchSlop : f - this.mTouchSlop;
                            this.mLastMotionY = y2;
                            setScrollState(1);
                            setScrollingCacheEnabled(true);
                            ViewParent parent2 = getParent();
                            if (parent2 != null) {
                                parent2.requestDisallowInterceptTouchEvent(true);
                            }
                        }
                        if (this.mIsBeingDragged) {
                            zJ = h(motionEvent.getX(motionEvent.findPointerIndex(this.mActivePointerId)));
                        }
                    }
                } else if (this.mIsBeingDragged) {
                    zJ = h(motionEvent.getX(motionEvent.findPointerIndex(this.mActivePointerId)));
                }
            } else if (this.mIsBeingDragged) {
                VelocityTracker velocityTracker = this.mVelocityTracker;
                velocityTracker.computeCurrentVelocity(1000, this.mMaximumVelocity);
                int xVelocity = (int) velocityTracker.getXVelocity(this.mActivePointerId);
                this.mPopulatePending = true;
                int clientWidth = getClientWidth();
                int scrollX = getScrollX();
                ItemInfo itemInfoE = e();
                float f2 = clientWidth;
                setCurrentItemInternal(b(itemInfoE.f8527b, ((scrollX / f2) - itemInfoE.f8529e) / (itemInfoE.d + (this.mPageMargin / f2)), xVelocity, (int) (motionEvent.getX(motionEvent.findPointerIndex(this.mActivePointerId)) - this.mInitialMotionX)), true, true, xVelocity);
                zJ = j();
            }
            if (zJ) {
                WeakHashMap weakHashMap = ViewCompat.f4466a;
                postInvalidateOnAnimation();
            }
        }
        return true;
    }

    public boolean pageLeft() {
        int i2 = this.mCurItem;
        if (i2 <= 0) {
            return false;
        }
        setCurrentItem(i2 - 1, true);
        return true;
    }

    public boolean pageRight() {
        PagerAdapter pagerAdapter = this.mAdapter;
        if (pagerAdapter == null || this.mCurItem >= pagerAdapter.getCount() - 1) {
            return false;
        }
        setCurrentItem(this.mCurItem + 1, true);
        return true;
    }

    public void populate() {
        populate(this.mCurItem);
    }

    public void removeOnAdapterChangeListener(OnAdapterChangeListener onAdapterChangeListener) {
        List<OnAdapterChangeListener> list = this.mAdapterChangeListeners;
        if (list != null) {
            list.remove(onAdapterChangeListener);
        }
    }

    public void removeOnPageChangeListener(OnPageChangeListener onPageChangeListener) {
        List<OnPageChangeListener> list = this.mOnPageChangeListeners;
        if (list != null) {
            list.remove(onPageChangeListener);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.mInLayout) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setAdapter(PagerAdapter pagerAdapter) {
        PagerAdapter pagerAdapter2 = this.mAdapter;
        if (pagerAdapter2 != null) {
            pagerAdapter2.setViewPagerObserver(null);
            this.mAdapter.startUpdate((ViewGroup) this);
            for (int i2 = 0; i2 < this.mItems.size(); i2++) {
                ItemInfo itemInfo = this.mItems.get(i2);
                this.mAdapter.destroyItem((ViewGroup) this, itemInfo.f8527b, itemInfo.f8526a);
            }
            this.mAdapter.finishUpdate((ViewGroup) this);
            this.mItems.clear();
            int i3 = 0;
            while (i3 < getChildCount()) {
                if (!((LayoutParams) getChildAt(i3).getLayoutParams()).f8530a) {
                    removeViewAt(i3);
                    i3--;
                }
                i3++;
            }
            this.mCurItem = 0;
            scrollTo(0, 0);
        }
        this.mAdapter = pagerAdapter;
        this.mExpectedAdapterCount = 0;
        if (pagerAdapter != null) {
            if (this.mObserver == null) {
                this.mObserver = new PagerObserver();
            }
            this.mAdapter.setViewPagerObserver(this.mObserver);
            this.mPopulatePending = false;
            boolean z2 = this.mFirstLayout;
            this.mFirstLayout = true;
            this.mExpectedAdapterCount = this.mAdapter.getCount();
            if (this.mRestoredCurItem >= 0) {
                this.mAdapter.restoreState(this.mRestoredAdapterState, this.mRestoredClassLoader);
                setCurrentItemInternal(this.mRestoredCurItem, false, true);
                this.mRestoredCurItem = -1;
                this.mRestoredAdapterState = null;
                this.mRestoredClassLoader = null;
            } else if (z2) {
                requestLayout();
            } else {
                populate();
            }
        }
        List<OnAdapterChangeListener> list = this.mAdapterChangeListeners;
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = this.mAdapterChangeListeners.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.mAdapterChangeListeners.get(i4).a(this, pagerAdapter);
        }
    }

    public void setCurrentItem(int i2) {
        this.mPopulatePending = false;
        setCurrentItemInternal(i2, !this.mFirstLayout, false);
    }

    public void setCurrentItemInternal(int i2, boolean z2, boolean z3) {
        setCurrentItemInternal(i2, z2, z3, 0);
    }

    public OnPageChangeListener setInternalPageChangeListener(OnPageChangeListener onPageChangeListener) {
        OnPageChangeListener onPageChangeListener2 = this.mInternalPageChangeListener;
        this.mInternalPageChangeListener = onPageChangeListener;
        return onPageChangeListener2;
    }

    public void setOffscreenPageLimit(int i2) {
        if (i2 < 1) {
            Log.w(TAG, "Requested offscreen page limit " + i2 + " too small; defaulting to 1");
            i2 = 1;
        }
        if (i2 != this.mOffscreenPageLimit) {
            this.mOffscreenPageLimit = i2;
            populate();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(OnPageChangeListener onPageChangeListener) {
        this.mOnPageChangeListener = onPageChangeListener;
    }

    public void setPageMargin(int i2) {
        int i3 = this.mPageMargin;
        this.mPageMargin = i2;
        int width = getWidth();
        i(width, width, i2, i3);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.mMarginDrawable = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setPageTransformer(boolean z2, PageTransformer pageTransformer) {
        setPageTransformer(z2, pageTransformer, 2);
    }

    public void setScrollState(int i2) {
        if (this.mScrollState == i2) {
            return;
        }
        this.mScrollState = i2;
        if (this.mPageTransformer != null) {
            boolean z2 = i2 != 0;
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                getChildAt(i3).setLayerType(z2 ? this.mPageTransformerLayerType : 0, null);
            }
        }
        OnPageChangeListener onPageChangeListener = this.mOnPageChangeListener;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageScrollStateChanged(i2);
        }
        List<OnPageChangeListener> list = this.mOnPageChangeListeners;
        if (list != null) {
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                OnPageChangeListener onPageChangeListener2 = this.mOnPageChangeListeners.get(i4);
                if (onPageChangeListener2 != null) {
                    onPageChangeListener2.onPageScrollStateChanged(i2);
                }
            }
        }
        OnPageChangeListener onPageChangeListener3 = this.mInternalPageChangeListener;
        if (onPageChangeListener3 != null) {
            onPageChangeListener3.onPageScrollStateChanged(i2);
        }
    }

    public void smoothScrollTo(int i2, int i3) {
        smoothScrollTo(i2, i3, 0);
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.mMarginDrawable;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        LayoutParams layoutParams = new LayoutParams(context, attributeSet);
        layoutParams.f8532c = 0.0f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, LAYOUT_ATTRS);
        layoutParams.f8531b = typedArrayObtainStyledAttributes.getInteger(0, 48);
        typedArrayObtainStyledAttributes.recycle();
        return layoutParams;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00cf A[PHI: r7 r10 r14
  0x00cf: PHI (r7v18 int) = (r7v17 int), (r7v5 int), (r7v21 int) binds: [B:64:0x00f5, B:61:0x00df, B:52:0x00c4] A[DONT_GENERATE, DONT_INLINE]
  0x00cf: PHI (r10v39 int) = (r10v1 int), (r10v38 int), (r10v42 int) binds: [B:64:0x00f5, B:61:0x00df, B:52:0x00c4] A[DONT_GENERATE, DONT_INLINE]
  0x00cf: PHI (r14v6 float) = (r14v4 float), (r14v5 float), (r14v3 float) binds: [B:64:0x00f5, B:61:0x00df, B:52:0x00c4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:90:0x015f A[PHI: r3 r12
  0x015f: PHI (r3v41 float) = (r3v39 float), (r3v40 float), (r3v38 float) binds: [B:98:0x018c, B:95:0x0172, B:88:0x0154] A[DONT_GENERATE, DONT_INLINE]
  0x015f: PHI (r12v8 int) = (r12v6 int), (r12v7 int), (r12v5 int) binds: [B:98:0x018c, B:95:0x0172, B:88:0x0154] A[DONT_GENERATE, DONT_INLINE]] */
    public void populate(int i2) {
        ItemInfo itemInfoInfoForPosition;
        String hexString;
        ItemInfo itemInfoAddNewItem;
        float f;
        ItemInfo itemInfoInfoForChild;
        int i3;
        int i4;
        ItemInfo itemInfo;
        ItemInfo itemInfo2;
        ItemInfo itemInfo3;
        int i5 = this.mCurItem;
        if (i5 != i2) {
            itemInfoInfoForPosition = infoForPosition(i5);
            this.mCurItem = i2;
        } else {
            itemInfoInfoForPosition = null;
        }
        if (this.mAdapter == null) {
            l();
            return;
        }
        if (this.mPopulatePending) {
            l();
            return;
        }
        if (getWindowToken() == null) {
            return;
        }
        this.mAdapter.startUpdate((ViewGroup) this);
        int i6 = this.mOffscreenPageLimit;
        int iMax = Math.max(0, this.mCurItem - i6);
        int count = this.mAdapter.getCount();
        int iMin = Math.min(count - 1, this.mCurItem + i6);
        if (count != this.mExpectedAdapterCount) {
            try {
                hexString = getResources().getResourceName(getId());
            } catch (Resources.NotFoundException unused) {
                hexString = Integer.toHexString(getId());
            }
            StringBuilder sb = new StringBuilder("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: ");
            androidx.datastore.preferences.protobuf.a.y(sb, this.mExpectedAdapterCount, ", found: ", count, " Pager id: ");
            sb.append(hexString);
            sb.append(" Pager class: ");
            sb.append(getClass());
            sb.append(" Problematic adapter: ");
            sb.append(this.mAdapter.getClass());
            throw new IllegalStateException(sb.toString());
        }
        int i7 = 0;
        while (true) {
            if (i7 < this.mItems.size()) {
                itemInfoAddNewItem = this.mItems.get(i7);
                int i8 = itemInfoAddNewItem.f8527b;
                int i9 = this.mCurItem;
                if (i8 >= i9) {
                    if (i8 != i9) {
                        break;
                    } else {
                        break;
                    }
                }
                i7++;
            }
            itemInfoAddNewItem = null;
            break;
        }
        if (itemInfoAddNewItem == null && count > 0) {
            itemInfoAddNewItem = addNewItem(this.mCurItem, i7);
        }
        if (itemInfoAddNewItem != null) {
            int i10 = i7 - 1;
            ItemInfo itemInfo4 = i10 >= 0 ? this.mItems.get(i10) : null;
            int clientWidth = getClientWidth();
            float paddingLeft = clientWidth <= 0 ? 0.0f : (getPaddingLeft() / clientWidth) + (2.0f - itemInfoAddNewItem.d);
            float f2 = 0.0f;
            for (int i11 = this.mCurItem - 1; i11 >= 0; i11--) {
                if (f2 < paddingLeft || i11 >= iMax) {
                    if (itemInfo4 == null || i11 != itemInfo4.f8527b) {
                        f2 += addNewItem(i11, i10 + 1).d;
                        i7++;
                        if (i10 >= 0) {
                            itemInfo3 = this.mItems.get(i10);
                        } else {
                            itemInfo3 = null;
                        }
                    } else {
                        f2 += itemInfo4.d;
                        i10--;
                        if (i10 >= 0) {
                            itemInfo3 = this.mItems.get(i10);
                        } else {
                            itemInfo3 = null;
                        }
                    }
                    itemInfo4 = itemInfo3;
                } else {
                    if (itemInfo4 == null) {
                        break;
                    }
                    if (i11 == itemInfo4.f8527b && !itemInfo4.f8528c) {
                        this.mItems.remove(i10);
                        this.mAdapter.destroyItem((ViewGroup) this, i11, itemInfo4.f8526a);
                        i10--;
                        i7--;
                        if (i10 >= 0) {
                            itemInfo3 = this.mItems.get(i10);
                        } else {
                            itemInfo3 = null;
                        }
                        itemInfo4 = itemInfo3;
                    }
                }
            }
            f = 0.0f;
            float f3 = itemInfoAddNewItem.d;
            int i12 = i7 + 1;
            if (f3 < 2.0f) {
                ItemInfo itemInfo5 = i12 < this.mItems.size() ? this.mItems.get(i12) : null;
                float paddingRight = clientWidth <= 0 ? 0.0f : (getPaddingRight() / clientWidth) + 2.0f;
                int i13 = i12;
                for (int i14 = this.mCurItem + 1; i14 < count; i14++) {
                    if (f3 >= paddingRight && i14 > iMin) {
                        if (itemInfo5 == null) {
                            break;
                        }
                        if (i14 == itemInfo5.f8527b && !itemInfo5.f8528c) {
                            this.mItems.remove(i13);
                            this.mAdapter.destroyItem((ViewGroup) this, i14, itemInfo5.f8526a);
                            if (i13 < this.mItems.size()) {
                                itemInfo5 = this.mItems.get(i13);
                            } else {
                                itemInfo5 = null;
                            }
                        }
                    } else if (itemInfo5 == null || i14 != itemInfo5.f8527b) {
                        ItemInfo itemInfoAddNewItem2 = addNewItem(i14, i13);
                        i13++;
                        f3 += itemInfoAddNewItem2.d;
                        if (i13 < this.mItems.size()) {
                            itemInfo5 = this.mItems.get(i13);
                        } else {
                            itemInfo5 = null;
                        }
                    } else {
                        f3 += itemInfo5.d;
                        i13++;
                        if (i13 < this.mItems.size()) {
                            itemInfo5 = this.mItems.get(i13);
                        } else {
                            itemInfo5 = null;
                        }
                    }
                }
            }
            int count2 = this.mAdapter.getCount();
            int clientWidth2 = getClientWidth();
            float f4 = clientWidth2 > 0 ? this.mPageMargin / clientWidth2 : 0.0f;
            if (itemInfoInfoForPosition != null) {
                int i15 = itemInfoInfoForPosition.f8527b;
                int i16 = itemInfoAddNewItem.f8527b;
                if (i15 < i16) {
                    float pageWidth = itemInfoInfoForPosition.f8529e + itemInfoInfoForPosition.d + f4;
                    int i17 = i15 + 1;
                    int i18 = 0;
                    while (i17 <= itemInfoAddNewItem.f8527b && i18 < this.mItems.size()) {
                        ItemInfo itemInfo6 = this.mItems.get(i18);
                        while (true) {
                            itemInfo2 = itemInfo6;
                            if (i17 <= itemInfo2.f8527b || i18 >= this.mItems.size() - 1) {
                                break;
                            }
                            i18++;
                            itemInfo6 = this.mItems.get(i18);
                        }
                        while (i17 < itemInfo2.f8527b) {
                            pageWidth += this.mAdapter.getPageWidth(i17) + f4;
                            i17++;
                        }
                        itemInfo2.f8529e = pageWidth;
                        pageWidth += itemInfo2.d + f4;
                        i17++;
                    }
                } else if (i15 > i16) {
                    int size = this.mItems.size() - 1;
                    float pageWidth2 = itemInfoInfoForPosition.f8529e;
                    while (true) {
                        i15--;
                        if (i15 < itemInfoAddNewItem.f8527b || size < 0) {
                            break;
                        }
                        ItemInfo itemInfo7 = this.mItems.get(size);
                        while (true) {
                            itemInfo = itemInfo7;
                            if (i15 >= itemInfo.f8527b || size <= 0) {
                                break;
                            }
                            size--;
                            itemInfo7 = this.mItems.get(size);
                        }
                        while (i15 > itemInfo.f8527b) {
                            pageWidth2 -= this.mAdapter.getPageWidth(i15) + f4;
                            i15--;
                        }
                        pageWidth2 -= itemInfo.d + f4;
                        itemInfo.f8529e = pageWidth2;
                    }
                }
            }
            int size2 = this.mItems.size();
            float pageWidth3 = itemInfoAddNewItem.f8529e;
            int i19 = itemInfoAddNewItem.f8527b;
            int i20 = i19 - 1;
            this.mFirstOffset = i19 == 0 ? pageWidth3 : -3.4028235E38f;
            int i21 = count2 - 1;
            this.mLastOffset = i19 == i21 ? (itemInfoAddNewItem.d + pageWidth3) - 1.0f : Float.MAX_VALUE;
            int i22 = i7 - 1;
            while (i22 >= 0) {
                ItemInfo itemInfo8 = this.mItems.get(i22);
                while (true) {
                    i4 = itemInfo8.f8527b;
                    if (i20 <= i4) {
                        break;
                    }
                    pageWidth3 -= this.mAdapter.getPageWidth(i20) + f4;
                    i20--;
                }
                pageWidth3 -= itemInfo8.d + f4;
                itemInfo8.f8529e = pageWidth3;
                if (i4 == 0) {
                    this.mFirstOffset = pageWidth3;
                }
                i22--;
                i20--;
            }
            float pageWidth4 = itemInfoAddNewItem.f8529e + itemInfoAddNewItem.d + f4;
            int i23 = itemInfoAddNewItem.f8527b;
            while (true) {
                i23++;
                if (i12 >= size2) {
                    break;
                }
                ItemInfo itemInfo9 = this.mItems.get(i12);
                while (true) {
                    i3 = itemInfo9.f8527b;
                    if (i23 >= i3) {
                        break;
                    }
                    pageWidth4 += this.mAdapter.getPageWidth(i23) + f4;
                    i23++;
                }
                if (i3 == i21) {
                    this.mLastOffset = (itemInfo9.d + pageWidth4) - 1.0f;
                }
                itemInfo9.f8529e = pageWidth4;
                pageWidth4 += itemInfo9.d + f4;
                i12++;
            }
            this.mNeedCalculatePageOffsets = false;
            this.mAdapter.setPrimaryItem((ViewGroup) this, this.mCurItem, itemInfoAddNewItem.f8526a);
        } else {
            f = 0.0f;
        }
        this.mAdapter.finishUpdate((ViewGroup) this);
        int childCount = getChildCount();
        for (int i24 = 0; i24 < childCount; i24++) {
            View childAt = getChildAt(i24);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            layoutParams.f = i24;
            if (!layoutParams.f8530a && layoutParams.f8532c == f && (itemInfoInfoForChild = infoForChild(childAt)) != null) {
                layoutParams.f8532c = itemInfoInfoForChild.d;
                layoutParams.f8533e = itemInfoInfoForChild.f8527b;
            }
        }
        l();
        if (hasFocus()) {
            View viewFindFocus = findFocus();
            ItemInfo itemInfoInfoForAnyChild = viewFindFocus != null ? infoForAnyChild(viewFindFocus) : null;
            if (itemInfoInfoForAnyChild == null || itemInfoInfoForAnyChild.f8527b != this.mCurItem) {
                for (int i25 = 0; i25 < getChildCount(); i25++) {
                    View childAt2 = getChildAt(i25);
                    ItemInfo itemInfoInfoForChild2 = infoForChild(childAt2);
                    if (itemInfoInfoForChild2 != null && itemInfoInfoForChild2.f8527b == this.mCurItem && childAt2.requestFocus(2)) {
                        return;
                    }
                }
            }
        }
    }

    public void setCurrentItemInternal(int i2, boolean z2, boolean z3, int i3) {
        PagerAdapter pagerAdapter = this.mAdapter;
        if (pagerAdapter == null || pagerAdapter.getCount() <= 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (!z3 && this.mCurItem == i2 && this.mItems.size() != 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (i2 < 0) {
            i2 = 0;
        } else if (i2 >= this.mAdapter.getCount()) {
            i2 = this.mAdapter.getCount() - 1;
        }
        int i4 = this.mOffscreenPageLimit;
        int i5 = this.mCurItem;
        if (i2 > i5 + i4 || i2 < i5 - i4) {
            for (int i6 = 0; i6 < this.mItems.size(); i6++) {
                this.mItems.get(i6).f8528c = true;
            }
        }
        boolean z4 = this.mCurItem != i2;
        if (!this.mFirstLayout) {
            populate(i2);
            k(i2, i3, z2, z4);
        } else {
            this.mCurItem = i2;
            if (z4) {
                c(i2);
            }
            requestLayout();
        }
    }

    public void setPageTransformer(boolean z2, PageTransformer pageTransformer, int i2) {
        boolean z3 = pageTransformer != null;
        boolean z4 = z3 != (this.mPageTransformer != null);
        this.mPageTransformer = pageTransformer;
        setChildrenDrawingOrderEnabled(z3);
        if (z3) {
            this.mDrawingOrder = z2 ? 2 : 1;
            this.mPageTransformerLayerType = i2;
        } else {
            this.mDrawingOrder = 0;
        }
        if (z4) {
            populate();
        }
    }

    public void smoothScrollTo(int i2, int i3, int i4) {
        int scrollX;
        int iAbs;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.mScroller;
        if (scroller == null || scroller.isFinished()) {
            scrollX = getScrollX();
        } else {
            scrollX = this.mIsScrollStarted ? this.mScroller.getCurrX() : this.mScroller.getStartX();
            this.mScroller.abortAnimation();
            setScrollingCacheEnabled(false);
        }
        int i5 = scrollX;
        int scrollY = getScrollY();
        int i6 = i2 - i5;
        int i7 = i3 - scrollY;
        if (i6 == 0 && i7 == 0) {
            a(false);
            populate();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i8 = clientWidth / 2;
        float f = clientWidth;
        float f2 = i8;
        float fDistanceInfluenceForSnapDuration = (distanceInfluenceForSnapDuration(Math.min(1.0f, (Math.abs(i6) * 1.0f) / f)) * f2) + f2;
        int iAbs2 = Math.abs(i4);
        if (iAbs2 > 0) {
            iAbs = Math.round(Math.abs(fDistanceInfluenceForSnapDuration / iAbs2) * 1000.0f) * 4;
        } else {
            iAbs = (int) (((Math.abs(i6) / ((this.mAdapter.getPageWidth(this.mCurItem) * f) + this.mPageMargin)) + 1.0f) * 100.0f);
        }
        int iMin = Math.min(iAbs, 600);
        this.mIsScrollStarted = false;
        this.mScroller.startScroll(i5, scrollY, i6, i7, iMin);
        WeakHashMap weakHashMap = ViewCompat.f4466a;
        postInvalidateOnAnimation();
    }

    public void setCurrentItem(int i2, boolean z2) {
        this.mPopulatePending = false;
        setCurrentItemInternal(i2, z2, false);
    }

    public void setPageMarginDrawable(int i2) {
        setPageMarginDrawable(ContextCompat.getDrawable(getContext(), i2));
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mItems = new ArrayList<>();
        this.mTempItem = new ItemInfo();
        this.mTempRect = new Rect();
        this.mRestoredCurItem = -1;
        this.mRestoredAdapterState = null;
        this.mRestoredClassLoader = null;
        this.mFirstOffset = -3.4028235E38f;
        this.mLastOffset = Float.MAX_VALUE;
        this.mOffscreenPageLimit = 1;
        this.mActivePointerId = -1;
        this.mFirstLayout = true;
        this.mNeedCalculatePageOffsets = false;
        this.mEndScrollRunnable = new Runnable() { // from class: androidx.viewpager.widget.ViewPager.3
            @Override // java.lang.Runnable
            public final void run() {
                ViewPager viewPager = ViewPager.this;
                viewPager.setScrollState(0);
                viewPager.populate();
            }
        };
        this.mScrollState = 0;
        initViewPager();
    }
}
