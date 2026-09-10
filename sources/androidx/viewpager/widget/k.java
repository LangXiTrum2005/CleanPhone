package androidx.viewpager.widget;

import ae.l;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.os.SystemClock;
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
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.a0;
import androidx.recyclerview.widget.e0;
import com.ironsource.InterfaceC0435l1;
import com.mbridge.msdk.nativex.view.RollingBCView;
import com.unity3d.services.UnityAdsConstants;
import ea.f2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.WeakHashMap;
import m0.l0;
import m0.s0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k extends ViewGroup {
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
    private List<e> mAdapterChangeListeners;
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
    private f mInternalPageChangeListener;
    private boolean mIsBeingDragged;
    private boolean mIsScrollStarted;
    private boolean mIsUnableToDrag;
    private final ArrayList<b> mItems;
    private float mLastMotionX;
    private float mLastMotionY;
    private float mLastOffset;
    private EdgeEffect mLeftEdge;
    private Drawable mMarginDrawable;
    private int mMaximumVelocity;
    private int mMinimumVelocity;
    private boolean mNeedCalculatePageOffsets;
    private h mObserver;
    private int mOffscreenPageLimit;
    private f mOnPageChangeListener;
    private List<f> mOnPageChangeListeners;
    private int mPageMargin;
    private g mPageTransformer;
    private int mPageTransformerLayerType;
    private boolean mPopulatePending;
    private Parcelable mRestoredAdapterState;
    private ClassLoader mRestoredClassLoader;
    private int mRestoredCurItem;
    private EdgeEffect mRightEdge;
    private int mScrollState;
    private Scroller mScroller;
    private boolean mScrollingCacheEnabled;
    private final b mTempItem;
    private final Rect mTempRect;
    private int mTopPageBounds;
    private int mTouchSlop;
    private VelocityTracker mVelocityTracker;
    static final int[] LAYOUT_ATTRS = {R.attr.layout_gravity};
    private static final Comparator<b> COMPARATOR = new l(2);
    private static final Interpolator sInterpolator = new e0(1);
    private static final j sPositionComparator = new j();

    public k(Context context) {
        super(context);
        this.mItems = new ArrayList<>();
        this.mTempItem = new b();
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
        this.mEndScrollRunnable = new a0((RollingBCView) this, 1);
        this.mScrollState = 0;
        initViewPager();
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void setScrollingCacheEnabled(boolean z10) {
        if (this.mScrollingCacheEnabled != z10) {
            this.mScrollingCacheEnabled = z10;
        }
    }

    public final void a(boolean z10) {
        boolean z11 = this.mScrollState == 2;
        if (z11) {
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
        for (int i10 = 0; i10 < this.mItems.size(); i10++) {
            b bVar = this.mItems.get(i10);
            if (bVar.f4988c) {
                bVar.f4988c = false;
                z11 = true;
            }
        }
        if (z11) {
            if (!z10) {
                this.mEndScrollRunnable.run();
                return;
            }
            Runnable runnable = this.mEndScrollRunnable;
            WeakHashMap weakHashMap = s0.f45746a;
            postOnAnimation(runnable);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i10, int i11) {
        b bVarInfoForChild;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                View childAt = getChildAt(i12);
                if (childAt.getVisibility() == 0 && (bVarInfoForChild = infoForChild(childAt)) != null && bVarInfoForChild.f4987b == this.mCurItem) {
                    childAt.addFocusables(arrayList, i10, i11);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i11 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    public b addNewItem(int i10, int i11) {
        b bVar = new b();
        bVar.f4987b = i10;
        bVar.f4986a = this.mAdapter.instantiateItem((ViewGroup) this, i10);
        bVar.f4989d = this.mAdapter.getPageWidth(i10);
        if (i11 < 0 || i11 >= this.mItems.size()) {
            this.mItems.add(bVar);
            return bVar;
        }
        this.mItems.add(i11, bVar);
        return bVar;
    }

    public void addOnAdapterChangeListener(@NonNull e eVar) {
        if (this.mAdapterChangeListeners == null) {
            this.mAdapterChangeListeners = new ArrayList();
        }
        this.mAdapterChangeListeners.add(eVar);
    }

    public void addOnPageChangeListener(@NonNull f fVar) {
        if (this.mOnPageChangeListeners == null) {
            this.mOnPageChangeListeners = new ArrayList();
        }
        this.mOnPageChangeListeners.add(fVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList<View> arrayList) {
        b bVarInfoForChild;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (bVarInfoForChild = infoForChild(childAt)) != null && bVarInfoForChild.f4987b == this.mCurItem) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        c cVar = (c) layoutParams;
        boolean z10 = cVar.f4991a | (view.getClass().getAnnotation(a.class) != null);
        cVar.f4991a = z10;
        if (!this.mInLayout) {
            super.addView(view, i10, layoutParams);
        } else {
            if (z10) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            cVar.f4994d = true;
            addViewInLayout(view, i10, layoutParams);
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00bc  */
    public boolean arrowScroll(int i10) {
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
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(viewFindFocus.getClass().getSimpleName());
                    for (ViewParent parent2 = viewFindFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                        sb2.append(" => ");
                        sb2.append(parent2.getClass().getSimpleName());
                    }
                    Log.e(TAG, "arrowScroll tried to find focus based on non-child current focused view " + sb2.toString());
                    viewFindFocus = null;
                    break;
                }
                if (parent == this) {
                    break;
                }
                parent = parent.getParent();
            }
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i10);
        if (viewFindNextFocus == null || viewFindNextFocus == viewFindFocus) {
            if (i10 == 17 || i10 == 1) {
                zPageLeft = pageLeft();
            } else if (i10 == 66 || i10 == 2) {
                zPageLeft = pageRight();
            } else {
                zPageLeft = false;
            }
        } else if (i10 == 17) {
            zPageLeft = (viewFindFocus == null || d(viewFindNextFocus, this.mTempRect).left < d(viewFindFocus, this.mTempRect).left) ? viewFindNextFocus.requestFocus() : pageLeft();
        } else if (i10 == 66) {
            zPageLeft = (viewFindFocus == null || d(viewFindNextFocus, this.mTempRect).left > d(viewFindFocus, this.mTempRect).left) ? viewFindNextFocus.requestFocus() : pageRight();
        } else {
            zPageLeft = false;
        }
        if (zPageLeft) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i10));
        }
        return zPageLeft;
    }

    public final int b(int i10, int i11, int i12, float f10) {
        if (Math.abs(i12) <= this.mFlingDistance || Math.abs(i11) <= this.mMinimumVelocity) {
            i10 += (int) (f10 + (i10 >= this.mCurItem ? 0.4f : 0.6f));
        } else if (i11 <= 0) {
            i10++;
        }
        if (this.mItems.size() > 0) {
            return Math.max(this.mItems.get(0).f4987b, Math.min(i10, ((b) l1.d.d(this.mItems, 1)).f4987b));
        }
        return i10;
    }

    public boolean beginFakeDrag() {
        if (this.mIsBeingDragged) {
            return false;
        }
        this.mFakeDragging = true;
        setScrollState(1);
        this.mLastMotionX = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.mInitialMotionX = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0);
        this.mVelocityTracker.addMovement(motionEventObtain);
        motionEventObtain.recycle();
        this.mFakeDragBeginTime = jUptimeMillis;
        return true;
    }

    public final void c(int i10) {
        f fVar = this.mOnPageChangeListener;
        if (fVar != null) {
            fVar.onPageSelected(i10);
        }
        List<f> list = this.mOnPageChangeListeners;
        if (list != null) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                f fVar2 = this.mOnPageChangeListeners.get(i11);
                if (fVar2 != null) {
                    fVar2.onPageSelected(i10);
                }
            }
        }
        f fVar3 = this.mInternalPageChangeListener;
        if (fVar3 != null) {
            fVar3.onPageSelected(i10);
        }
    }

    public boolean canScroll(View view, boolean z10, int i10, int i11, int i12) {
        int i13;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i14 = i11 + scrollX;
                if (i14 >= childAt.getLeft() && i14 < childAt.getRight() && (i13 = i12 + scrollY) >= childAt.getTop() && i13 < childAt.getBottom() && canScroll(childAt, true, i10, i14 - childAt.getLeft(), i13 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z10 && view.canScrollHorizontally(-i10);
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i10) {
        if (this.mAdapter == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        if (i10 < 0) {
            return scrollX > ((int) (((float) clientWidth) * this.mFirstOffset));
        }
        return i10 > 0 && scrollX < ((int) (((float) clientWidth) * this.mLastOffset));
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof c) && super.checkLayoutParams(layoutParams);
    }

    public void clearOnPageChangeListeners() {
        List<f> list = this.mOnPageChangeListeners;
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
        WeakHashMap weakHashMap = s0.f45746a;
        postInvalidateOnAnimation();
    }

    public final Rect d(View view, Rect rect) {
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
        boolean z10 = this.mItems.size() < (this.mOffscreenPageLimit * 2) + 1 && this.mItems.size() < count;
        int iMax = this.mCurItem;
        int i10 = 0;
        boolean z11 = false;
        while (i10 < this.mItems.size()) {
            b bVar = this.mItems.get(i10);
            int itemPosition = this.mAdapter.getItemPosition(bVar.f4986a);
            if (itemPosition != -1) {
                if (itemPosition == -2) {
                    this.mItems.remove(i10);
                    i10--;
                    if (!z11) {
                        this.mAdapter.startUpdate((ViewGroup) this);
                        z11 = true;
                    }
                    this.mAdapter.destroyItem((ViewGroup) this, bVar.f4987b, bVar.f4986a);
                    int i11 = this.mCurItem;
                    if (i11 == bVar.f4987b) {
                        iMax = Math.max(0, Math.min(i11, count - 1));
                    }
                } else {
                    int i12 = bVar.f4987b;
                    if (i12 != itemPosition) {
                        if (i12 == this.mCurItem) {
                            iMax = itemPosition;
                        }
                        bVar.f4987b = itemPosition;
                    }
                }
                z10 = true;
            }
            i10++;
        }
        if (z11) {
            this.mAdapter.finishUpdate((ViewGroup) this);
        }
        Collections.sort(this.mItems, COMPARATOR);
        if (z10) {
            int childCount = getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                c cVar = (c) getChildAt(i13).getLayoutParams();
                if (!cVar.f4991a) {
                    cVar.f4993c = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
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
        b bVarInfoForChild;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (bVarInfoForChild = infoForChild(childAt)) != null && bVarInfoForChild.f4987b == this.mCurItem && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    public float distanceInfluenceForSnapDuration(float f10) {
        return (float) Math.sin((f10 - 0.5f) * 0.47123894f);
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
            WeakHashMap weakHashMap = s0.f45746a;
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

    public final b e() {
        int i10;
        int clientWidth = getClientWidth();
        float f10 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f11 = clientWidth > 0 ? this.mPageMargin / clientWidth : 0.0f;
        int i11 = 0;
        boolean z10 = true;
        b bVar = null;
        int i12 = -1;
        float f12 = 0.0f;
        while (i11 < this.mItems.size()) {
            b bVar2 = this.mItems.get(i11);
            if (!z10 && bVar2.f4987b != (i10 = i12 + 1)) {
                bVar2 = this.mTempItem;
                bVar2.f4990e = f10 + f12 + f11;
                bVar2.f4987b = i10;
                bVar2.f4989d = this.mAdapter.getPageWidth(i10);
                i11--;
            }
            b bVar3 = bVar2;
            f10 = bVar3.f4990e;
            float f13 = bVar3.f4989d + f10 + f11;
            if (!z10 && scrollX < f10) {
                break;
            }
            if (scrollX < f13 || i11 == this.mItems.size() - 1) {
                return bVar3;
            }
            int i13 = bVar3.f4987b;
            float f14 = bVar3.f4989d;
            i11++;
            i12 = i13;
            f12 = f14;
            bVar = bVar3;
            z10 = false;
        }
        return bVar;
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
            b bVarE = e();
            setCurrentItemInternal(b(bVarE.f4987b, xVelocity, (int) (this.mLastMotionX - this.mInitialMotionX), ((scrollX / clientWidth) - bVarE.f4990e) / bVarE.f4989d), true, true, xVelocity);
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

    public boolean executeKeyEvent(@NonNull KeyEvent keyEvent) {
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
            int i10 = actionIndex == 0 ? 1 : 0;
            this.mLastMotionX = motionEvent.getX(i10);
            this.mActivePointerId = motionEvent.getPointerId(i10);
            VelocityTracker velocityTracker = this.mVelocityTracker;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public void fakeDragBy(float f10) {
        if (!this.mFakeDragging) {
            throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        }
        if (this.mAdapter == null) {
            return;
        }
        this.mLastMotionX += f10;
        float scrollX = getScrollX() - f10;
        float clientWidth = getClientWidth();
        float f11 = this.mFirstOffset * clientWidth;
        float f12 = this.mLastOffset * clientWidth;
        b bVar = this.mItems.get(0);
        b bVar2 = (b) l1.d.d(this.mItems, 1);
        if (bVar.f4987b != 0) {
            f11 = bVar.f4990e * clientWidth;
        }
        if (bVar2.f4987b != this.mAdapter.getCount() - 1) {
            f12 = bVar2.f4990e * clientWidth;
        }
        if (scrollX < f11) {
            scrollX = f11;
        } else if (scrollX > f12) {
            scrollX = f12;
        }
        int i10 = (int) scrollX;
        this.mLastMotionX = (scrollX - i10) + this.mLastMotionX;
        scrollTo(i10, getScrollY());
        g(i10);
        MotionEvent motionEventObtain = MotionEvent.obtain(this.mFakeDragBeginTime, SystemClock.uptimeMillis(), 2, this.mLastMotionX, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0);
        this.mVelocityTracker.addMovement(motionEventObtain);
        motionEventObtain.recycle();
    }

    public final boolean g(int i10) {
        if (this.mItems.size() == 0) {
            if (this.mFirstLayout) {
                return false;
            }
            this.mCalledSuper = false;
            onPageScrolled(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0);
            if (this.mCalledSuper) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        b bVarE = e();
        int clientWidth = getClientWidth();
        int i11 = this.mPageMargin;
        int i12 = clientWidth + i11;
        float f10 = clientWidth;
        int i13 = bVarE.f4987b;
        float f11 = ((i10 / f10) - bVarE.f4990e) / (bVarE.f4989d + (i11 / f10));
        this.mCalledSuper = false;
        onPageScrolled(i13, f11, (int) (i12 * f11));
        if (this.mCalledSuper) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        c cVar = new c(-1, -1);
        cVar.f4993c = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        return cVar;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    @Nullable
    public PagerAdapter getAdapter() {
        return this.mAdapter;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i10, int i11) {
        if (this.mDrawingOrder == 2) {
            i11 = (i10 - 1) - i11;
        }
        return ((c) this.mDrawingOrderedChildren.get(i11).getLayoutParams()).f4996f;
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

    public final boolean h(float f10) {
        boolean z10;
        boolean z11;
        float f11 = this.mLastMotionX - f10;
        this.mLastMotionX = f10;
        float scrollX = getScrollX() + f11;
        float clientWidth = getClientWidth();
        float f12 = this.mFirstOffset * clientWidth;
        float f13 = this.mLastOffset * clientWidth;
        boolean z12 = false;
        b bVar = this.mItems.get(0);
        b bVar2 = (b) l1.d.d(this.mItems, 1);
        if (bVar.f4987b != 0) {
            f12 = bVar.f4990e * clientWidth;
            z10 = false;
        } else {
            z10 = true;
        }
        if (bVar2.f4987b != this.mAdapter.getCount() - 1) {
            f13 = bVar2.f4990e * clientWidth;
            z11 = false;
        } else {
            z11 = true;
        }
        if (scrollX < f12) {
            if (z10) {
                this.mLeftEdge.onPull(Math.abs(f12 - scrollX) / clientWidth);
                z12 = true;
            }
            scrollX = f12;
        } else if (scrollX > f13) {
            if (z11) {
                this.mRightEdge.onPull(Math.abs(scrollX - f13) / clientWidth);
                z12 = true;
            }
            scrollX = f13;
        }
        int i10 = (int) scrollX;
        this.mLastMotionX = (scrollX - i10) + this.mLastMotionX;
        scrollTo(i10, getScrollY());
        g(i10);
        return z12;
    }

    public final void i(int i10, int i11, int i12, int i13) {
        if (i11 > 0 && !this.mItems.isEmpty()) {
            if (!this.mScroller.isFinished()) {
                this.mScroller.setFinalX(getCurrentItem() * getClientWidth());
                return;
            } else {
                scrollTo((int) ((getScrollX() / (((i11 - getPaddingLeft()) - getPaddingRight()) + i13)) * (((i10 - getPaddingLeft()) - getPaddingRight()) + i12)), getScrollY());
                return;
            }
        }
        b bVarInfoForPosition = infoForPosition(this.mCurItem);
        int iMin = (int) ((bVarInfoForPosition != null ? Math.min(bVarInfoForPosition.f4990e, this.mLastOffset) : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) * ((i10 - getPaddingLeft()) - getPaddingRight()));
        if (iMin != getScrollX()) {
            a(false);
            scrollTo(iMin, getScrollY());
        }
    }

    public b infoForAnyChild(View view) {
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

    public b infoForChild(View view) {
        for (int i10 = 0; i10 < this.mItems.size(); i10++) {
            b bVar = this.mItems.get(i10);
            if (this.mAdapter.isViewFromObject(view, bVar.f4986a)) {
                return bVar;
            }
        }
        return null;
    }

    public b infoForPosition(int i10) {
        for (int i11 = 0; i11 < this.mItems.size(); i11++) {
            b bVar = this.mItems.get(i11);
            if (bVar.f4987b == i10) {
                return bVar;
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
        float f10 = context.getResources().getDisplayMetrics().density;
        this.mTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
        this.mMinimumVelocity = (int) (400.0f * f10);
        this.mMaximumVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        this.mLeftEdge = new EdgeEffect(context);
        this.mRightEdge = new EdgeEffect(context);
        this.mFlingDistance = (int) (25.0f * f10);
        this.mCloseEnough = (int) (2.0f * f10);
        this.mDefaultGutterSize = (int) (f10 * 16.0f);
        s0.f(this, new d(this));
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        l0.b(this, new f2(this));
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

    public final void k(int i10, int i11, boolean z10, boolean z11) {
        int iMax;
        b bVarInfoForPosition = infoForPosition(i10);
        if (bVarInfoForPosition != null) {
            iMax = (int) (Math.max(this.mFirstOffset, Math.min(bVarInfoForPosition.f4990e, this.mLastOffset)) * getClientWidth());
        } else {
            iMax = 0;
        }
        if (z10) {
            smoothScrollTo(iMax, 0, i11);
            if (z11) {
                c(i10);
                return;
            }
            return;
        }
        if (z11) {
            c(i10);
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
            for (int i10 = 0; i10 < childCount; i10++) {
                this.mDrawingOrderedChildren.add(getChildAt(i10));
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
        int i10;
        float f10;
        super.onDraw(canvas);
        if (this.mPageMargin <= 0 || this.mMarginDrawable == null || this.mItems.size() <= 0 || this.mAdapter == null) {
            return;
        }
        int scrollX = getScrollX();
        int width = getWidth();
        float f11 = width;
        float f12 = this.mPageMargin / f11;
        int i11 = 0;
        b bVar = this.mItems.get(0);
        float f13 = bVar.f4990e;
        int size = this.mItems.size();
        int i12 = bVar.f4987b;
        int i13 = this.mItems.get(size - 1).f4987b;
        while (i12 < i13) {
            while (true) {
                i10 = bVar.f4987b;
                if (i12 <= i10 || i11 >= size) {
                    break;
                }
                i11++;
                bVar = this.mItems.get(i11);
            }
            if (i12 == i10) {
                float f14 = bVar.f4990e;
                float f15 = bVar.f4989d;
                f10 = (f14 + f15) * f11;
                f13 = f14 + f15 + f12;
            } else {
                float pageWidth = this.mAdapter.getPageWidth(i12);
                f10 = (f13 + pageWidth) * f11;
                f13 = pageWidth + f12 + f13;
            }
            if (this.mPageMargin + f10 > scrollX) {
                this.mMarginDrawable.setBounds(Math.round(f10), this.mTopPageBounds, Math.round(this.mPageMargin + f10), this.mBottomPageBounds);
                this.mMarginDrawable.draw(canvas);
            }
            if (f10 > scrollX + width) {
                return;
            }
            i12++;
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
            float x10 = motionEvent.getX();
            this.mInitialMotionX = x10;
            this.mLastMotionX = x10;
            float y10 = motionEvent.getY();
            this.mInitialMotionY = y10;
            this.mLastMotionY = y10;
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
            int i10 = this.mActivePointerId;
            if (i10 != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i10);
                float x11 = motionEvent.getX(iFindPointerIndex);
                float f10 = x11 - this.mLastMotionX;
                float fAbs = Math.abs(f10);
                float y11 = motionEvent.getY(iFindPointerIndex);
                float fAbs2 = Math.abs(y11 - this.mInitialMotionY);
                if (f10 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    float f11 = this.mLastMotionX;
                    if ((f11 >= this.mGutterSize || f10 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) && ((f11 <= getWidth() - this.mGutterSize || f10 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) && canScroll(this, false, (int) f10, (int) x11, (int) y11))) {
                        this.mLastMotionX = x11;
                        this.mLastMotionY = y11;
                        this.mIsUnableToDrag = true;
                        return false;
                    }
                }
                float f12 = this.mTouchSlop;
                if (fAbs > f12 && fAbs * 0.5f > fAbs2) {
                    this.mIsBeingDragged = true;
                    ViewParent parent2 = getParent();
                    if (parent2 != null) {
                        parent2.requestDisallowInterceptTouchEvent(true);
                    }
                    setScrollState(1);
                    float f13 = this.mInitialMotionX;
                    float f14 = this.mTouchSlop;
                    this.mLastMotionX = f10 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? f13 + f14 : f13 - f14;
                    this.mLastMotionY = y11;
                    setScrollingCacheEnabled(true);
                } else if (fAbs2 > f12) {
                    this.mIsUnableToDrag = true;
                }
                if (this.mIsBeingDragged && h(x11)) {
                    WeakHashMap weakHashMap = s0.f45746a;
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
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
        b bVarInfoForChild;
        int iMax;
        int measuredWidth;
        int iMax2;
        int measuredHeight;
        int childCount = getChildCount();
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i16 = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                if (cVar.f4991a) {
                    int i18 = cVar.f4992b;
                    int i19 = i18 & 7;
                    int i20 = i18 & InterfaceC0435l1.d.b.f29113j;
                    if (i19 != 1) {
                        if (i19 == 3) {
                            measuredWidth = childAt.getMeasuredWidth() + paddingLeft;
                        } else if (i19 != 5) {
                            measuredWidth = paddingLeft;
                        } else {
                            iMax = (i14 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        if (i20 != 16) {
                            if (i20 != 48) {
                                measuredHeight = childAt.getMeasuredHeight() + paddingTop;
                            } else if (i20 != 80) {
                                measuredHeight = paddingTop;
                            } else {
                                iMax2 = (i15 - paddingBottom) - childAt.getMeasuredHeight();
                                paddingBottom += childAt.getMeasuredHeight();
                            }
                            int i21 = paddingLeft + scrollX;
                            childAt.layout(i21, paddingTop, childAt.getMeasuredWidth() + i21, childAt.getMeasuredHeight() + paddingTop);
                            i16++;
                            paddingTop = measuredHeight;
                            paddingLeft = measuredWidth;
                        } else {
                            iMax2 = Math.max((i15 - childAt.getMeasuredHeight()) / 2, paddingTop);
                        }
                        int i22 = iMax2;
                        measuredHeight = paddingTop;
                        paddingTop = i22;
                        int i23 = paddingLeft + scrollX;
                        childAt.layout(i23, paddingTop, childAt.getMeasuredWidth() + i23, childAt.getMeasuredHeight() + paddingTop);
                        i16++;
                        paddingTop = measuredHeight;
                        paddingLeft = measuredWidth;
                    } else {
                        iMax = Math.max((i14 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i24 = iMax;
                    measuredWidth = paddingLeft;
                    paddingLeft = i24;
                    if (i20 != 16) {
                        if (i20 != 48) {
                            measuredHeight = childAt.getMeasuredHeight() + paddingTop;
                        } else if (i20 != 80) {
                            measuredHeight = paddingTop;
                        } else {
                            iMax2 = (i15 - paddingBottom) - childAt.getMeasuredHeight();
                            paddingBottom += childAt.getMeasuredHeight();
                        }
                        int i25 = paddingLeft + scrollX;
                        childAt.layout(i25, paddingTop, childAt.getMeasuredWidth() + i25, childAt.getMeasuredHeight() + paddingTop);
                        i16++;
                        paddingTop = measuredHeight;
                        paddingLeft = measuredWidth;
                    } else {
                        iMax2 = Math.max((i15 - childAt.getMeasuredHeight()) / 2, paddingTop);
                    }
                    int i26 = iMax2;
                    measuredHeight = paddingTop;
                    paddingTop = i26;
                    int i27 = paddingLeft + scrollX;
                    childAt.layout(i27, paddingTop, childAt.getMeasuredWidth() + i27, childAt.getMeasuredHeight() + paddingTop);
                    i16++;
                    paddingTop = measuredHeight;
                    paddingLeft = measuredWidth;
                }
            }
        }
        int i28 = (i14 - paddingLeft) - paddingRight;
        for (int i29 = 0; i29 < childCount; i29++) {
            View childAt2 = getChildAt(i29);
            if (childAt2.getVisibility() != 8) {
                c cVar2 = (c) childAt2.getLayoutParams();
                if (!cVar2.f4991a && (bVarInfoForChild = infoForChild(childAt2)) != null) {
                    float f10 = i28;
                    int i30 = ((int) (bVarInfoForChild.f4990e * f10)) + paddingLeft;
                    if (cVar2.f4994d) {
                        cVar2.f4994d = false;
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (f10 * cVar2.f4993c), 1073741824), View.MeasureSpec.makeMeasureSpec((i15 - paddingTop) - paddingBottom, 1073741824));
                    }
                    childAt2.layout(i30, paddingTop, childAt2.getMeasuredWidth() + i30, childAt2.getMeasuredHeight() + paddingTop);
                }
            }
        }
        this.mTopPageBounds = paddingTop;
        this.mBottomPageBounds = i15 - paddingBottom;
        this.mDecorChildCount = i16;
        if (this.mFirstLayout) {
            z11 = false;
            k(this.mCurItem, 0, false, false);
        } else {
            z11 = false;
        }
        this.mFirstLayout = z11;
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        c cVar;
        c cVar2;
        int i12;
        setMeasuredDimension(View.getDefaultSize(0, i10), View.getDefaultSize(0, i11));
        int measuredWidth = getMeasuredWidth();
        this.mGutterSize = Math.min(measuredWidth / 10, this.mDefaultGutterSize);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i13 = 0;
        while (true) {
            boolean z10 = true;
            int i14 = 1073741824;
            if (i13 >= childCount) {
                break;
            }
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8 && (cVar2 = (c) childAt.getLayoutParams()) != null && cVar2.f4991a) {
                int i15 = cVar2.f4992b;
                int i16 = i15 & 7;
                int i17 = i15 & InterfaceC0435l1.d.b.f29113j;
                boolean z11 = i17 == 48 || i17 == 80;
                if (i16 != 3 && i16 != 5) {
                    z10 = false;
                }
                int i18 = Integer.MIN_VALUE;
                if (z11) {
                    i12 = Integer.MIN_VALUE;
                    i18 = 1073741824;
                } else {
                    i12 = z10 ? 1073741824 : Integer.MIN_VALUE;
                }
                int i19 = ((ViewGroup.LayoutParams) cVar2).width;
                if (i19 != -2) {
                    if (i19 == -1) {
                        i19 = paddingLeft;
                    }
                    i18 = 1073741824;
                } else {
                    i19 = paddingLeft;
                }
                int i20 = ((ViewGroup.LayoutParams) cVar2).height;
                if (i20 == -2) {
                    i20 = measuredHeight;
                    i14 = i12;
                } else if (i20 == -1) {
                    i20 = measuredHeight;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i19, i18), View.MeasureSpec.makeMeasureSpec(i20, i14));
                if (z11) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z10) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i13++;
        }
        this.mChildWidthMeasureSpec = View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.mChildHeightMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.mInLayout = true;
        populate();
        this.mInLayout = false;
        int childCount2 = getChildCount();
        for (int i21 = 0; i21 < childCount2; i21++) {
            View childAt2 = getChildAt(i21);
            if (childAt2.getVisibility() != 8 && ((cVar = (c) childAt2.getLayoutParams()) == null || !cVar.f4991a)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * cVar.f4993c), 1073741824), this.mChildHeightMeasureSpec);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0065  */
    public void onPageScrolled(int i10, float f10, int i11) {
        int iMax;
        int width;
        int left;
        if (this.mDecorChildCount > 0) {
            int scrollX = getScrollX();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width2 = getWidth();
            int childCount = getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                c cVar = (c) childAt.getLayoutParams();
                if (cVar.f4991a) {
                    int i13 = cVar.f4992b & 7;
                    if (i13 != 1) {
                        if (i13 == 3) {
                            width = childAt.getWidth() + paddingLeft;
                        } else if (i13 != 5) {
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
                    int i14 = iMax;
                    width = paddingLeft;
                    paddingLeft = i14;
                    left = (paddingLeft + scrollX) - childAt.getLeft();
                    if (left != 0) {
                        childAt.offsetLeftAndRight(left);
                    }
                    paddingLeft = width;
                }
            }
        }
        f fVar = this.mOnPageChangeListener;
        if (fVar != null) {
            fVar.onPageScrolled(i10, f10, i11);
        }
        List<f> list = this.mOnPageChangeListeners;
        if (list != null) {
            int size = list.size();
            for (int i15 = 0; i15 < size; i15++) {
                f fVar2 = this.mOnPageChangeListeners.get(i15);
                if (fVar2 != null) {
                    fVar2.onPageScrolled(i10, f10, i11);
                }
            }
        }
        f fVar3 = this.mInternalPageChangeListener;
        if (fVar3 != null) {
            fVar3.onPageScrolled(i10, f10, i11);
        }
        this.mCalledSuper = true;
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i10, Rect rect) {
        int i11;
        int i12;
        int i13;
        b bVarInfoForChild;
        int childCount = getChildCount();
        if ((i10 & 2) != 0) {
            i12 = childCount;
            i11 = 0;
            i13 = 1;
        } else {
            i11 = childCount - 1;
            i12 = -1;
            i13 = -1;
        }
        while (i11 != i12) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() == 0 && (bVarInfoForChild = infoForChild(childAt)) != null && bVarInfoForChild.f4987b == this.mCurItem && childAt.requestFocus(i10, rect)) {
                return true;
            }
            i11 += i13;
        }
        return false;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof i)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        i iVar = (i) parcelable;
        ClassLoader classLoader = iVar.f5001e;
        super.onRestoreInstanceState(iVar.f48514a);
        PagerAdapter pagerAdapter = this.mAdapter;
        if (pagerAdapter != null) {
            pagerAdapter.restoreState(iVar.f5000d, classLoader);
            setCurrentItemInternal(iVar.f4999c, false, true);
        } else {
            this.mRestoredCurItem = iVar.f4999c;
            this.mRestoredAdapterState = iVar.f5000d;
            this.mRestoredClassLoader = classLoader;
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        i iVar = new i(super.onSaveInstanceState());
        iVar.f4999c = this.mCurItem;
        PagerAdapter pagerAdapter = this.mAdapter;
        if (pagerAdapter != null) {
            iVar.f5000d = pagerAdapter.saveState();
        }
        return iVar;
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 != i12) {
            int i14 = this.mPageMargin;
            i(i10, i12, i14, i14);
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
                float x10 = motionEvent.getX();
                this.mInitialMotionX = x10;
                this.mLastMotionX = x10;
                float y10 = motionEvent.getY();
                this.mInitialMotionY = y10;
                this.mLastMotionY = y10;
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
                        float x11 = motionEvent.getX(iFindPointerIndex);
                        float fAbs = Math.abs(x11 - this.mLastMotionX);
                        float y11 = motionEvent.getY(iFindPointerIndex);
                        float fAbs2 = Math.abs(y11 - this.mLastMotionY);
                        if (fAbs > this.mTouchSlop && fAbs > fAbs2) {
                            this.mIsBeingDragged = true;
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                            float f10 = this.mInitialMotionX;
                            this.mLastMotionX = x11 - f10 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? f10 + this.mTouchSlop : f10 - this.mTouchSlop;
                            this.mLastMotionY = y11;
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
                b bVarE = e();
                float f11 = clientWidth;
                setCurrentItemInternal(b(bVarE.f4987b, xVelocity, (int) (motionEvent.getX(motionEvent.findPointerIndex(this.mActivePointerId)) - this.mInitialMotionX), ((scrollX / f11) - bVarE.f4990e) / (bVarE.f4989d + (this.mPageMargin / f11))), true, true, xVelocity);
                zJ = j();
            }
            if (zJ) {
                WeakHashMap weakHashMap = s0.f45746a;
                postInvalidateOnAnimation();
            }
        }
        return true;
    }

    public boolean pageLeft() {
        int i10 = this.mCurItem;
        if (i10 <= 0) {
            return false;
        }
        setCurrentItem(i10 - 1, true);
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

    public void removeOnAdapterChangeListener(@NonNull e eVar) {
        List<e> list = this.mAdapterChangeListeners;
        if (list != null) {
            list.remove(eVar);
        }
    }

    public void removeOnPageChangeListener(@NonNull f fVar) {
        List<f> list = this.mOnPageChangeListeners;
        if (list != null) {
            list.remove(fVar);
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

    public void setAdapter(@Nullable PagerAdapter pagerAdapter) {
        PagerAdapter pagerAdapter2 = this.mAdapter;
        if (pagerAdapter2 != null) {
            pagerAdapter2.setViewPagerObserver(null);
            this.mAdapter.startUpdate((ViewGroup) this);
            for (int i10 = 0; i10 < this.mItems.size(); i10++) {
                b bVar = this.mItems.get(i10);
                this.mAdapter.destroyItem((ViewGroup) this, bVar.f4987b, bVar.f4986a);
            }
            this.mAdapter.finishUpdate((ViewGroup) this);
            this.mItems.clear();
            int i11 = 0;
            while (i11 < getChildCount()) {
                if (!((c) getChildAt(i11).getLayoutParams()).f4991a) {
                    removeViewAt(i11);
                    i11--;
                }
                i11++;
            }
            this.mCurItem = 0;
            scrollTo(0, 0);
        }
        this.mAdapter = pagerAdapter;
        this.mExpectedAdapterCount = 0;
        if (pagerAdapter != null) {
            if (this.mObserver == null) {
                this.mObserver = new h(this);
            }
            this.mAdapter.setViewPagerObserver(this.mObserver);
            this.mPopulatePending = false;
            boolean z10 = this.mFirstLayout;
            this.mFirstLayout = true;
            this.mExpectedAdapterCount = this.mAdapter.getCount();
            if (this.mRestoredCurItem >= 0) {
                this.mAdapter.restoreState(this.mRestoredAdapterState, this.mRestoredClassLoader);
                setCurrentItemInternal(this.mRestoredCurItem, false, true);
                this.mRestoredCurItem = -1;
                this.mRestoredAdapterState = null;
                this.mRestoredClassLoader = null;
            } else if (z10) {
                requestLayout();
            } else {
                populate();
            }
        }
        List<e> list = this.mAdapterChangeListeners;
        if (list == null || list.isEmpty() || this.mAdapterChangeListeners.size() <= 0) {
            return;
        }
        this.mAdapterChangeListeners.get(0).getClass();
        throw new ClassCastException();
    }

    public void setCurrentItem(int i10) {
        this.mPopulatePending = false;
        setCurrentItemInternal(i10, !this.mFirstLayout, false);
    }

    public void setCurrentItemInternal(int i10, boolean z10, boolean z11) {
        setCurrentItemInternal(i10, z10, z11, 0);
    }

    public f setInternalPageChangeListener(f fVar) {
        f fVar2 = this.mInternalPageChangeListener;
        this.mInternalPageChangeListener = fVar;
        return fVar2;
    }

    public void setOffscreenPageLimit(int i10) {
        if (i10 < 1) {
            Log.w(TAG, "Requested offscreen page limit " + i10 + " too small; defaulting to 1");
            i10 = 1;
        }
        if (i10 != this.mOffscreenPageLimit) {
            this.mOffscreenPageLimit = i10;
            populate();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(f fVar) {
        this.mOnPageChangeListener = fVar;
    }

    public void setPageMargin(int i10) {
        int i11 = this.mPageMargin;
        this.mPageMargin = i10;
        int width = getWidth();
        i(width, width, i10, i11);
        requestLayout();
    }

    public void setPageMarginDrawable(@Nullable Drawable drawable) {
        this.mMarginDrawable = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setPageTransformer(boolean z10, @Nullable g gVar) {
        setPageTransformer(z10, gVar, 2);
    }

    public void setScrollState(int i10) {
        if (this.mScrollState == i10) {
            return;
        }
        this.mScrollState = i10;
        f fVar = this.mOnPageChangeListener;
        if (fVar != null) {
            fVar.onPageScrollStateChanged(i10);
        }
        List<f> list = this.mOnPageChangeListeners;
        if (list != null) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                f fVar2 = this.mOnPageChangeListeners.get(i11);
                if (fVar2 != null) {
                    fVar2.onPageScrollStateChanged(i10);
                }
            }
        }
        f fVar3 = this.mInternalPageChangeListener;
        if (fVar3 != null) {
            fVar3.onPageScrollStateChanged(i10);
        }
    }

    public void smoothScrollTo(int i10, int i11) {
        smoothScrollTo(i10, i11, 0);
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.mMarginDrawable;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        c cVar = new c(context, attributeSet);
        cVar.f4993c = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, LAYOUT_ATTRS);
        cVar.f4992b = typedArrayObtainStyledAttributes.getInteger(0, 48);
        typedArrayObtainStyledAttributes.recycle();
        return cVar;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00cf A[PHI: r7 r10 r14
  0x00cf: PHI (r7v18 int) = (r7v17 int), (r7v5 int), (r7v21 int) binds: [B:64:0x00f5, B:61:0x00df, B:52:0x00c4] A[DONT_GENERATE, DONT_INLINE]
  0x00cf: PHI (r10v39 int) = (r10v1 int), (r10v38 int), (r10v42 int) binds: [B:64:0x00f5, B:61:0x00df, B:52:0x00c4] A[DONT_GENERATE, DONT_INLINE]
  0x00cf: PHI (r14v6 float) = (r14v4 float), (r14v5 float), (r14v3 float) binds: [B:64:0x00f5, B:61:0x00df, B:52:0x00c4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:90:0x015f A[PHI: r3 r12
  0x015f: PHI (r3v41 float) = (r3v39 float), (r3v40 float), (r3v38 float) binds: [B:98:0x018c, B:95:0x0172, B:88:0x0154] A[DONT_GENERATE, DONT_INLINE]
  0x015f: PHI (r12v8 int) = (r12v6 int), (r12v7 int), (r12v5 int) binds: [B:98:0x018c, B:95:0x0172, B:88:0x0154] A[DONT_GENERATE, DONT_INLINE]] */
    public void populate(int i10) {
        b bVarInfoForPosition;
        String hexString;
        b bVarAddNewItem;
        float f10;
        b bVarInfoForChild;
        int i11;
        int i12;
        b bVar;
        b bVar2;
        b bVar3;
        int i13 = this.mCurItem;
        if (i13 != i10) {
            bVarInfoForPosition = infoForPosition(i13);
            this.mCurItem = i10;
        } else {
            bVarInfoForPosition = null;
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
        int i14 = this.mOffscreenPageLimit;
        int iMax = Math.max(0, this.mCurItem - i14);
        int count = this.mAdapter.getCount();
        int iMin = Math.min(count - 1, this.mCurItem + i14);
        if (count != this.mExpectedAdapterCount) {
            try {
                hexString = getResources().getResourceName(getId());
            } catch (Resources.NotFoundException unused) {
                hexString = Integer.toHexString(getId());
            }
            StringBuilder sb2 = new StringBuilder("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: ");
            l1.d.o(sb2, this.mExpectedAdapterCount, ", found: ", count, " Pager id: ");
            sb2.append(hexString);
            sb2.append(" Pager class: ");
            sb2.append(getClass());
            sb2.append(" Problematic adapter: ");
            sb2.append(this.mAdapter.getClass());
            throw new IllegalStateException(sb2.toString());
        }
        int i15 = 0;
        while (true) {
            if (i15 < this.mItems.size()) {
                bVarAddNewItem = this.mItems.get(i15);
                int i16 = bVarAddNewItem.f4987b;
                int i17 = this.mCurItem;
                if (i16 >= i17) {
                    if (i16 != i17) {
                        break;
                    } else {
                        break;
                    }
                }
                i15++;
            }
            bVarAddNewItem = null;
            break;
        }
        if (bVarAddNewItem == null && count > 0) {
            bVarAddNewItem = addNewItem(this.mCurItem, i15);
        }
        if (bVarAddNewItem != null) {
            int i18 = i15 - 1;
            b bVar4 = i18 >= 0 ? this.mItems.get(i18) : null;
            int clientWidth = getClientWidth();
            float paddingLeft = clientWidth <= 0 ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : (getPaddingLeft() / clientWidth) + (2.0f - bVarAddNewItem.f4989d);
            float f11 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            for (int i19 = this.mCurItem - 1; i19 >= 0; i19--) {
                if (f11 < paddingLeft || i19 >= iMax) {
                    if (bVar4 == null || i19 != bVar4.f4987b) {
                        f11 += addNewItem(i19, i18 + 1).f4989d;
                        i15++;
                        if (i18 >= 0) {
                            bVar3 = this.mItems.get(i18);
                        } else {
                            bVar3 = null;
                        }
                    } else {
                        f11 += bVar4.f4989d;
                        i18--;
                        if (i18 >= 0) {
                            bVar3 = this.mItems.get(i18);
                        } else {
                            bVar3 = null;
                        }
                    }
                    bVar4 = bVar3;
                } else {
                    if (bVar4 == null) {
                        break;
                    }
                    if (i19 == bVar4.f4987b && !bVar4.f4988c) {
                        this.mItems.remove(i18);
                        this.mAdapter.destroyItem((ViewGroup) this, i19, bVar4.f4986a);
                        i18--;
                        i15--;
                        if (i18 >= 0) {
                            bVar3 = this.mItems.get(i18);
                        } else {
                            bVar3 = null;
                        }
                        bVar4 = bVar3;
                    }
                }
            }
            f10 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            float f12 = bVarAddNewItem.f4989d;
            int i20 = i15 + 1;
            if (f12 < 2.0f) {
                b bVar5 = i20 < this.mItems.size() ? this.mItems.get(i20) : null;
                float paddingRight = clientWidth <= 0 ? 0.0f : (getPaddingRight() / clientWidth) + 2.0f;
                int i21 = i20;
                for (int i22 = this.mCurItem + 1; i22 < count; i22++) {
                    if (f12 >= paddingRight && i22 > iMin) {
                        if (bVar5 == null) {
                            break;
                        }
                        if (i22 == bVar5.f4987b && !bVar5.f4988c) {
                            this.mItems.remove(i21);
                            this.mAdapter.destroyItem((ViewGroup) this, i22, bVar5.f4986a);
                            if (i21 < this.mItems.size()) {
                                bVar5 = this.mItems.get(i21);
                            } else {
                                bVar5 = null;
                            }
                        }
                    } else if (bVar5 == null || i22 != bVar5.f4987b) {
                        b bVarAddNewItem2 = addNewItem(i22, i21);
                        i21++;
                        f12 += bVarAddNewItem2.f4989d;
                        if (i21 < this.mItems.size()) {
                            bVar5 = this.mItems.get(i21);
                        } else {
                            bVar5 = null;
                        }
                    } else {
                        f12 += bVar5.f4989d;
                        i21++;
                        if (i21 < this.mItems.size()) {
                            bVar5 = this.mItems.get(i21);
                        } else {
                            bVar5 = null;
                        }
                    }
                }
            }
            int count2 = this.mAdapter.getCount();
            int clientWidth2 = getClientWidth();
            float f13 = clientWidth2 > 0 ? this.mPageMargin / clientWidth2 : 0.0f;
            if (bVarInfoForPosition != null) {
                int i23 = bVarInfoForPosition.f4987b;
                int i24 = bVarAddNewItem.f4987b;
                if (i23 < i24) {
                    float pageWidth = bVarInfoForPosition.f4990e + bVarInfoForPosition.f4989d + f13;
                    int i25 = i23 + 1;
                    int i26 = 0;
                    while (i25 <= bVarAddNewItem.f4987b && i26 < this.mItems.size()) {
                        b bVar6 = this.mItems.get(i26);
                        while (true) {
                            bVar2 = bVar6;
                            if (i25 <= bVar2.f4987b || i26 >= this.mItems.size() - 1) {
                                break;
                            }
                            i26++;
                            bVar6 = this.mItems.get(i26);
                        }
                        while (i25 < bVar2.f4987b) {
                            pageWidth += this.mAdapter.getPageWidth(i25) + f13;
                            i25++;
                        }
                        bVar2.f4990e = pageWidth;
                        pageWidth += bVar2.f4989d + f13;
                        i25++;
                    }
                } else if (i23 > i24) {
                    int size = this.mItems.size() - 1;
                    float pageWidth2 = bVarInfoForPosition.f4990e;
                    while (true) {
                        i23--;
                        if (i23 < bVarAddNewItem.f4987b || size < 0) {
                            break;
                        }
                        b bVar7 = this.mItems.get(size);
                        while (true) {
                            bVar = bVar7;
                            if (i23 >= bVar.f4987b || size <= 0) {
                                break;
                            }
                            size--;
                            bVar7 = this.mItems.get(size);
                        }
                        while (i23 > bVar.f4987b) {
                            pageWidth2 -= this.mAdapter.getPageWidth(i23) + f13;
                            i23--;
                        }
                        pageWidth2 -= bVar.f4989d + f13;
                        bVar.f4990e = pageWidth2;
                    }
                }
            }
            int size2 = this.mItems.size();
            float pageWidth3 = bVarAddNewItem.f4990e;
            int i27 = bVarAddNewItem.f4987b;
            int i28 = i27 - 1;
            this.mFirstOffset = i27 == 0 ? pageWidth3 : -3.4028235E38f;
            int i29 = count2 - 1;
            this.mLastOffset = i27 == i29 ? (bVarAddNewItem.f4989d + pageWidth3) - 1.0f : Float.MAX_VALUE;
            int i30 = i15 - 1;
            while (i30 >= 0) {
                b bVar8 = this.mItems.get(i30);
                while (true) {
                    i12 = bVar8.f4987b;
                    if (i28 <= i12) {
                        break;
                    }
                    pageWidth3 -= this.mAdapter.getPageWidth(i28) + f13;
                    i28--;
                }
                pageWidth3 -= bVar8.f4989d + f13;
                bVar8.f4990e = pageWidth3;
                if (i12 == 0) {
                    this.mFirstOffset = pageWidth3;
                }
                i30--;
                i28--;
            }
            float pageWidth4 = bVarAddNewItem.f4990e + bVarAddNewItem.f4989d + f13;
            int i31 = bVarAddNewItem.f4987b;
            while (true) {
                i31++;
                if (i20 >= size2) {
                    break;
                }
                b bVar9 = this.mItems.get(i20);
                while (true) {
                    i11 = bVar9.f4987b;
                    if (i31 >= i11) {
                        break;
                    }
                    pageWidth4 += this.mAdapter.getPageWidth(i31) + f13;
                    i31++;
                }
                if (i11 == i29) {
                    this.mLastOffset = (bVar9.f4989d + pageWidth4) - 1.0f;
                }
                bVar9.f4990e = pageWidth4;
                pageWidth4 += bVar9.f4989d + f13;
                i20++;
            }
            this.mNeedCalculatePageOffsets = false;
            this.mAdapter.setPrimaryItem((ViewGroup) this, this.mCurItem, bVarAddNewItem.f4986a);
        } else {
            f10 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        this.mAdapter.finishUpdate((ViewGroup) this);
        int childCount = getChildCount();
        for (int i32 = 0; i32 < childCount; i32++) {
            View childAt = getChildAt(i32);
            c cVar = (c) childAt.getLayoutParams();
            cVar.f4996f = i32;
            if (!cVar.f4991a && cVar.f4993c == f10 && (bVarInfoForChild = infoForChild(childAt)) != null) {
                cVar.f4993c = bVarInfoForChild.f4989d;
                cVar.f4995e = bVarInfoForChild.f4987b;
            }
        }
        l();
        if (hasFocus()) {
            View viewFindFocus = findFocus();
            b bVarInfoForAnyChild = viewFindFocus != null ? infoForAnyChild(viewFindFocus) : null;
            if (bVarInfoForAnyChild == null || bVarInfoForAnyChild.f4987b != this.mCurItem) {
                for (int i33 = 0; i33 < getChildCount(); i33++) {
                    View childAt2 = getChildAt(i33);
                    b bVarInfoForChild2 = infoForChild(childAt2);
                    if (bVarInfoForChild2 != null && bVarInfoForChild2.f4987b == this.mCurItem && childAt2.requestFocus(2)) {
                        return;
                    }
                }
            }
        }
    }

    public void setCurrentItemInternal(int i10, boolean z10, boolean z11, int i11) {
        PagerAdapter pagerAdapter = this.mAdapter;
        if (pagerAdapter == null || pagerAdapter.getCount() <= 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (!z11 && this.mCurItem == i10 && this.mItems.size() != 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (i10 < 0) {
            i10 = 0;
        } else if (i10 >= this.mAdapter.getCount()) {
            i10 = this.mAdapter.getCount() - 1;
        }
        int i12 = this.mOffscreenPageLimit;
        int i13 = this.mCurItem;
        if (i10 > i13 + i12 || i10 < i13 - i12) {
            for (int i14 = 0; i14 < this.mItems.size(); i14++) {
                this.mItems.get(i14).f4988c = true;
            }
        }
        boolean z12 = this.mCurItem != i10;
        if (!this.mFirstLayout) {
            populate(i10);
            k(i10, i11, z10, z12);
        } else {
            this.mCurItem = i10;
            if (z12) {
                c(i10);
            }
            requestLayout();
        }
    }

    public void setPageTransformer(boolean z10, @Nullable g gVar, int i10) {
        boolean z11 = gVar != null;
        setChildrenDrawingOrderEnabled(z11);
        if (z11) {
            this.mDrawingOrder = z10 ? 2 : 1;
            this.mPageTransformerLayerType = i10;
        } else {
            this.mDrawingOrder = 0;
        }
        if (z11) {
            populate();
        }
    }

    public void smoothScrollTo(int i10, int i11, int i12) {
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
        int i13 = scrollX;
        int scrollY = getScrollY();
        int i14 = i10 - i13;
        int i15 = i11 - scrollY;
        if (i14 == 0 && i15 == 0) {
            a(false);
            populate();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i16 = clientWidth / 2;
        float f10 = clientWidth;
        float f11 = i16;
        float fDistanceInfluenceForSnapDuration = (distanceInfluenceForSnapDuration(Math.min(1.0f, (Math.abs(i14) * 1.0f) / f10)) * f11) + f11;
        int iAbs2 = Math.abs(i12);
        if (iAbs2 > 0) {
            iAbs = Math.round(Math.abs(fDistanceInfluenceForSnapDuration / iAbs2) * 1000.0f) * 4;
        } else {
            iAbs = (int) (((Math.abs(i14) / ((this.mAdapter.getPageWidth(this.mCurItem) * f10) + this.mPageMargin)) + 1.0f) * 100.0f);
        }
        int iMin = Math.min(iAbs, 600);
        this.mIsScrollStarted = false;
        this.mScroller.startScroll(i13, scrollY, i14, i15, iMin);
        WeakHashMap weakHashMap = s0.f45746a;
        postInvalidateOnAnimation();
    }

    public void setCurrentItem(int i10, boolean z10) {
        this.mPopulatePending = false;
        setCurrentItemInternal(i10, z10, false);
    }

    public void setPageMarginDrawable(int i10) {
        setPageMarginDrawable(getContext().getDrawable(i10));
    }

    public k(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mItems = new ArrayList<>();
        this.mTempItem = new b();
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
        this.mEndScrollRunnable = new a0((RollingBCView) this, 1);
        this.mScrollState = 0;
        initViewPager();
    }
}
