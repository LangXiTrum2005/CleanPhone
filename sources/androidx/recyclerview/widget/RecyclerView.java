package androidx.recyclerview.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.applovin.shadow.okio.Segment;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import com.unity3d.services.UnityAdsConstants;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements m0.c0 {
    static final boolean DEBUG = false;
    static final int DEFAULT_ORIENTATION = 1;
    static final boolean DISPATCH_TEMP_DETACH = false;
    static final long FOREVER_NS = Long.MAX_VALUE;
    public static final int HORIZONTAL = 0;
    private static final int INVALID_POINTER = -1;
    public static final int INVALID_TYPE = -1;
    private static final Class<?>[] LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE;
    static final int MAX_SCROLL_DURATION = 2000;
    public static final long NO_ID = -1;
    public static final int NO_POSITION = -1;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    static final String TAG = "RecyclerView";
    public static final int TOUCH_SLOP_DEFAULT = 0;
    public static final int TOUCH_SLOP_PAGING = 1;
    static final String TRACE_BIND_VIEW_TAG = "RV OnBindView";
    static final String TRACE_CREATE_VIEW_TAG = "RV CreateView";
    private static final String TRACE_HANDLE_ADAPTER_UPDATES_TAG = "RV PartialInvalidate";
    static final String TRACE_NESTED_PREFETCH_TAG = "RV Nested Prefetch";
    private static final String TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG = "RV FullInvalidate";
    private static final String TRACE_ON_LAYOUT_TAG = "RV OnLayout";
    static final String TRACE_PREFETCH_TAG = "RV Prefetch";
    static final String TRACE_SCROLL_TAG = "RV Scroll";
    static final boolean VERBOSE_TRACING = false;
    public static final int VERTICAL = 1;
    static final Interpolator sQuinticInterpolator;
    j1 mAccessibilityDelegate;
    private final AccessibilityManager mAccessibilityManager;
    private v0 mActiveOnItemTouchListener;
    g0 mAdapter;
    b mAdapterHelper;
    boolean mAdapterUpdateDuringMeasure;
    private EdgeEffect mBottomGlow;
    private j0 mChildDrawingOrderCallback;
    d mChildHelper;
    boolean mClipToPadding;
    boolean mDataSetHasChangedAfterLayout;
    boolean mDispatchItemsChangedEvent;
    private int mDispatchScrollCounter;
    private int mEatenAccessibilityChangeFlags;

    @NonNull
    private k0 mEdgeEffectFactory;
    boolean mEnableFastScroller;
    boolean mFirstLayoutComplete;
    s mGapWorker;
    boolean mHasFixedSize;
    private boolean mIgnoreMotionEventTillDown;
    private int mInitialTouchX;
    private int mInitialTouchY;
    private int mInterceptRequestLayoutDepth;
    boolean mIsAttached;
    n0 mItemAnimator;
    private l0 mItemAnimatorListener;
    private Runnable mItemAnimatorRunner;
    final ArrayList<o0> mItemDecorations;
    boolean mItemsAddedOrRemoved;
    boolean mItemsChanged;
    private int mLastTouchX;
    private int mLastTouchY;
    r0 mLayout;
    boolean mLayoutFrozen;
    private int mLayoutOrScrollCounter;
    boolean mLayoutWasDefered;
    private EdgeEffect mLeftGlow;
    private final int mMaxFlingVelocity;
    private final int mMinFlingVelocity;
    private final int[] mMinMaxLayoutPositions;
    private final int[] mNestedOffsets;
    private final a1 mObserver;
    private List<t0> mOnChildAttachStateListeners;
    private u0 mOnFlingListener;
    private final ArrayList<v0> mOnItemTouchListeners;
    final List<h1> mPendingAccessibilityImportanceChange;
    private b1 mPendingSavedState;
    boolean mPostedAnimatorRunner;
    q mPrefetchRegistry;
    private boolean mPreserveFocusAfterLayout;
    final y0 mRecycler;
    z0 mRecyclerListener;
    private EdgeEffect mRightGlow;
    private float mScaledHorizontalScrollFactor;
    private float mScaledVerticalScrollFactor;
    final int[] mScrollConsumed;
    private OnScrollListener mScrollListener;
    private List<OnScrollListener> mScrollListeners;
    private final int[] mScrollOffset;
    private int mScrollPointerId;
    private int mScrollState;
    final int[] mScrollStepConsumed;
    private m0.s mScrollingChildHelper;
    final e1 mState;
    final Rect mTempRect;
    private final Rect mTempRect2;
    final RectF mTempRectF;
    private EdgeEffect mTopGlow;
    private int mTouchSlop;
    final Runnable mUpdateChildViewsRunnable;
    private VelocityTracker mVelocityTracker;
    final g1 mViewFlinger;
    private final r1 mViewInfoProcessCallback;
    final s1 mViewInfoStore;
    private static final int[] NESTED_SCROLLING_ATTRS = {R.attr.nestedScrollingEnabled};
    private static final int[] CLIP_TO_PADDING_ATTR = {R.attr.clipToPadding};
    static final boolean FORCE_INVALIDATE_DISPLAY_LIST = false;
    static final boolean ALLOW_SIZE_IN_UNSPECIFIED_SPEC = true;
    static final boolean POST_UPDATES_ON_ANIMATION = true;
    static final boolean ALLOW_THREAD_GAP_WORK = true;
    private static final boolean FORCE_ABS_FOCUS_SEARCH_DIRECTION = false;
    private static final boolean IGNORE_DETACHED_FOCUSED_CHILD = false;

    static {
        Class cls = Integer.TYPE;
        LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE = new Class[]{Context.class, AttributeSet.class, cls, cls};
        sQuinticInterpolator = new e0(0);
    }

    public RecyclerView(@NonNull Context context) {
        this(context, null);
    }

    private void addAnimatingView(h1 h1Var) {
        View view = h1Var.itemView;
        boolean z10 = view.getParent() == this;
        this.mRecycler.k(getChildViewHolder(view));
        if (h1Var.isTmpDetached()) {
            this.mChildHelper.b(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z10) {
            this.mChildHelper.a(view, -1, true);
            return;
        }
        d dVar = this.mChildHelper;
        int iIndexOfChild = dVar.f4740a.f4767a.indexOfChild(view);
        if (iIndexOfChild >= 0) {
            dVar.f4741b.L(iIndexOfChild);
            dVar.i(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    private void animateChange(@NonNull h1 h1Var, @NonNull h1 h1Var2, @NonNull m0 m0Var, @NonNull m0 m0Var2, boolean z10, boolean z11) {
        h1Var.setIsRecyclable(false);
        if (z10) {
            addAnimatingView(h1Var);
        }
        if (h1Var != h1Var2) {
            if (z11) {
                addAnimatingView(h1Var2);
            }
            h1Var.mShadowedHolder = h1Var2;
            addAnimatingView(h1Var);
            this.mRecycler.k(h1Var);
            h1Var2.setIsRecyclable(false);
            h1Var2.mShadowingHolder = h1Var;
        }
        if (this.mItemAnimator.a(h1Var, h1Var2, m0Var, m0Var2)) {
            postAnimationRunner();
        }
    }

    private void cancelTouch() {
        resetTouch();
        setScrollState(0);
    }

    public static void clearNestedRecyclerViewIfNotNested(@NonNull h1 h1Var) {
        WeakReference<RecyclerView> weakReference = h1Var.mNestedRecyclerView;
        if (weakReference != null) {
            RecyclerView recyclerView = weakReference.get();
            while (recyclerView != null) {
                if (recyclerView == h1Var.itemView) {
                    return;
                }
                Object parent = recyclerView.getParent();
                recyclerView = parent instanceof View ? (View) parent : null;
            }
            h1Var.mNestedRecyclerView = null;
        }
    }

    private void createLayoutManager(Context context, String str, AttributeSet attributeSet, int i10, int i11) {
        Object[] objArr;
        Constructor constructor;
        if (str != null) {
            String strTrim = str.trim();
            if (strTrim.isEmpty()) {
                return;
            }
            String fullClassName = getFullClassName(context, strTrim);
            try {
                Class<? extends U> clsAsSubclass = (isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).loadClass(fullClassName).asSubclass(r0.class);
                try {
                    constructor = clsAsSubclass.getConstructor(LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE);
                    objArr = new Object[]{context, attributeSet, Integer.valueOf(i10), Integer.valueOf(i11)};
                } catch (NoSuchMethodException e10) {
                    objArr = null;
                    try {
                        constructor = clsAsSubclass.getConstructor(null);
                    } catch (NoSuchMethodException e11) {
                        e11.initCause(e10);
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + fullClassName, e11);
                    }
                }
                constructor.setAccessible(true);
                setLayoutManager((r0) constructor.newInstance(objArr));
            } catch (ClassCastException e12) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + fullClassName, e12);
            } catch (ClassNotFoundException e13) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + fullClassName, e13);
            } catch (IllegalAccessException e14) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + fullClassName, e14);
            } catch (InstantiationException e15) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + fullClassName, e15);
            } catch (InvocationTargetException e16) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + fullClassName, e16);
            }
        }
    }

    private boolean didChildRangeChange(int i10, int i11) {
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        int[] iArr = this.mMinMaxLayoutPositions;
        return (iArr[0] == i10 && iArr[1] == i11) ? false : true;
    }

    private void dispatchContentChangedIfNecessary() {
        int i10 = this.mEatenAccessibilityChangeFlags;
        this.mEatenAccessibilityChangeFlags = 0;
        if (i10 == 0 || !isAccessibilityEnabled()) {
            return;
        }
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
        accessibilityEventObtain.setEventType(com.ironsource.mediationsdk.metadata.a.f29616n);
        accessibilityEventObtain.setContentChangeTypes(i10);
        sendAccessibilityEventUnchecked(accessibilityEventObtain);
    }

    private void dispatchLayoutStep1() {
        q1 q1Var;
        this.mState.a(1);
        fillRemainingScrollValues(this.mState);
        this.mState.f4757i = false;
        startInterceptRequestLayout();
        s1 s1Var = this.mViewInfoStore;
        s1Var.f4929a.clear();
        s1Var.f4930b.a();
        onEnterLayoutOrScroll();
        processAdapterUpdatesAndSetAnimationFlags();
        saveFocusInfo();
        e1 e1Var = this.mState;
        e1Var.f4756h = e1Var.f4758j && this.mItemsChanged;
        this.mItemsChanged = false;
        this.mItemsAddedOrRemoved = false;
        e1Var.f4755g = e1Var.f4759k;
        e1Var.f4753e = this.mAdapter.getItemCount();
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        if (this.mState.f4758j) {
            int iE = this.mChildHelper.e();
            for (int i10 = 0; i10 < iE; i10++) {
                h1 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.d(i10));
                if (!childViewHolderInt.shouldIgnore() && (!childViewHolderInt.isInvalid() || this.mAdapter.hasStableIds())) {
                    n0 n0Var = this.mItemAnimator;
                    n0.b(childViewHolderInt);
                    childViewHolderInt.getUnmodifiedPayloads();
                    n0Var.getClass();
                    m0 m0Var = new m0();
                    m0Var.a(childViewHolderInt);
                    x.e eVar = this.mViewInfoStore.f4929a;
                    q1 q1VarA = (q1) eVar.get(childViewHolderInt);
                    if (q1VarA == null) {
                        q1VarA = q1.a();
                        eVar.put(childViewHolderInt, q1VarA);
                    }
                    q1VarA.f4898b = m0Var;
                    q1VarA.f4897a |= 4;
                    if (this.mState.f4756h && childViewHolderInt.isUpdated() && !childViewHolderInt.isRemoved() && !childViewHolderInt.shouldIgnore() && !childViewHolderInt.isInvalid()) {
                        this.mViewInfoStore.f4930b.d(getChangedHolderKey(childViewHolderInt), childViewHolderInt);
                    }
                }
            }
        }
        if (this.mState.f4759k) {
            saveOldPositions();
            e1 e1Var2 = this.mState;
            boolean z10 = e1Var2.f4754f;
            e1Var2.f4754f = false;
            this.mLayout.V(this.mRecycler, e1Var2);
            this.mState.f4754f = z10;
            for (int i11 = 0; i11 < this.mChildHelper.e(); i11++) {
                h1 childViewHolderInt2 = getChildViewHolderInt(this.mChildHelper.d(i11));
                if (!childViewHolderInt2.shouldIgnore() && ((q1Var = (q1) this.mViewInfoStore.f4929a.get(childViewHolderInt2)) == null || (q1Var.f4897a & 4) == 0)) {
                    n0.b(childViewHolderInt2);
                    boolean zHasAnyOfTheFlags = childViewHolderInt2.hasAnyOfTheFlags(Segment.SIZE);
                    n0 n0Var2 = this.mItemAnimator;
                    childViewHolderInt2.getUnmodifiedPayloads();
                    n0Var2.getClass();
                    m0 m0Var2 = new m0();
                    m0Var2.a(childViewHolderInt2);
                    if (zHasAnyOfTheFlags) {
                        recordAnimationInfoIfBouncedHiddenView(childViewHolderInt2, m0Var2);
                    } else {
                        x.e eVar2 = this.mViewInfoStore.f4929a;
                        q1 q1VarA2 = (q1) eVar2.get(childViewHolderInt2);
                        if (q1VarA2 == null) {
                            q1VarA2 = q1.a();
                            eVar2.put(childViewHolderInt2, q1VarA2);
                        }
                        q1VarA2.f4897a |= 2;
                        q1VarA2.f4898b = m0Var2;
                    }
                }
            }
            clearOldPositions();
        } else {
            clearOldPositions();
        }
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        this.mState.f4752d = 2;
    }

    private void dispatchLayoutStep2() {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        this.mState.a(6);
        this.mAdapterHelper.c();
        this.mState.f4753e = this.mAdapter.getItemCount();
        e1 e1Var = this.mState;
        e1Var.f4751c = 0;
        e1Var.f4755g = false;
        this.mLayout.V(this.mRecycler, e1Var);
        e1 e1Var2 = this.mState;
        e1Var2.f4754f = false;
        this.mPendingSavedState = null;
        e1Var2.f4758j = e1Var2.f4758j && this.mItemAnimator != null;
        e1Var2.f4752d = 4;
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
    }

    /* JADX WARN: Code duplicated, block: B:65:0x0175  */
    /* JADX WARN: Code duplicated, block: B:93:0x019f A[SYNTHETIC] */
    private void dispatchLayoutStep3() {
        boolean z10;
        boolean zG;
        this.mState.a(4);
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        e1 e1Var = this.mState;
        boolean z11 = true;
        e1Var.f4752d = 1;
        if (e1Var.f4758j) {
            for (int iE = this.mChildHelper.e() - 1; iE >= 0; iE--) {
                h1 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.d(iE));
                if (!childViewHolderInt.shouldIgnore()) {
                    long changedHolderKey = getChangedHolderKey(childViewHolderInt);
                    this.mItemAnimator.getClass();
                    m0 m0Var = new m0();
                    m0Var.a(childViewHolderInt);
                    h1 h1Var = (h1) this.mViewInfoStore.f4930b.b(changedHolderKey);
                    if (h1Var == null || h1Var.shouldIgnore()) {
                        this.mViewInfoStore.a(childViewHolderInt, m0Var);
                    } else {
                        q1 q1Var = (q1) this.mViewInfoStore.f4929a.get(h1Var);
                        boolean z12 = (q1Var == null || (q1Var.f4897a & 1) == 0) ? false : true;
                        q1 q1Var2 = (q1) this.mViewInfoStore.f4929a.get(childViewHolderInt);
                        boolean z13 = (q1Var2 == null || (q1Var2.f4897a & 1) == 0) ? false : true;
                        if (z12 == 0 || h1Var != childViewHolderInt) {
                            m0 m0VarB = this.mViewInfoStore.b(h1Var, 4);
                            this.mViewInfoStore.a(childViewHolderInt, m0Var);
                            m0 m0VarB2 = this.mViewInfoStore.b(childViewHolderInt, 8);
                            if (m0VarB == null) {
                                handleMissingPreInfoForChangeError(changedHolderKey, childViewHolderInt, h1Var);
                            } else {
                                animateChange(h1Var, childViewHolderInt, m0VarB, m0VarB2, z12, z13);
                            }
                        } else {
                            this.mViewInfoStore.a(childViewHolderInt, m0Var);
                        }
                    }
                }
            }
            s1 s1Var = this.mViewInfoStore;
            r1 r1Var = this.mViewInfoProcessCallback;
            x.e eVar = s1Var.f4929a;
            int i10 = eVar.f53506c - 1;
            while (i10 >= 0) {
                h1 h1Var2 = (h1) eVar.f(i10);
                q1 q1Var3 = (q1) eVar.h(i10);
                int i11 = q1Var3.f4897a;
                if ((i11 & 3) == 3) {
                    RecyclerView recyclerView = ((f0) r1Var).f4767a;
                    recyclerView.mLayout.c0(h1Var2.itemView, recyclerView.mRecycler);
                } else if ((i11 & 1) != 0) {
                    m0 m0Var2 = q1Var3.f4898b;
                    if (m0Var2 == null) {
                        RecyclerView recyclerView2 = ((f0) r1Var).f4767a;
                        recyclerView2.mLayout.c0(h1Var2.itemView, recyclerView2.mRecycler);
                    } else {
                        m0 m0Var3 = q1Var3.f4899c;
                        RecyclerView recyclerView3 = ((f0) r1Var).f4767a;
                        recyclerView3.mRecycler.k(h1Var2);
                        recyclerView3.animateDisappearance(h1Var2, m0Var2, m0Var3);
                    }
                } else if ((i11 & 14) == 14) {
                    ((f0) r1Var).f4767a.animateAppearance(h1Var2, q1Var3.f4898b, q1Var3.f4899c);
                } else {
                    if ((i11 & 12) == 12) {
                        m0 m0Var4 = q1Var3.f4898b;
                        m0 m0Var5 = q1Var3.f4899c;
                        f0 f0Var = (f0) r1Var;
                        f0Var.getClass();
                        h1Var2.setIsRecyclable(false);
                        RecyclerView recyclerView4 = f0Var.f4767a;
                        if (!recyclerView4.mDataSetHasChangedAfterLayout) {
                            k kVar = (k) recyclerView4.mItemAnimator;
                            kVar.getClass();
                            int i12 = m0Var4.f4823a;
                            int i13 = m0Var5.f4823a;
                            if (i12 == i13) {
                                z10 = z11;
                                if (m0Var4.f4824b == m0Var5.f4824b) {
                                    kVar.c(h1Var2);
                                    zG = false;
                                }
                                if (zG) {
                                    recyclerView4.postAnimationRunner();
                                }
                            } else {
                                z10 = z11;
                            }
                            zG = kVar.g(h1Var2, i12, m0Var4.f4824b, i13, m0Var5.f4824b);
                            if (zG) {
                                recyclerView4.postAnimationRunner();
                            }
                        } else if (recyclerView4.mItemAnimator.a(h1Var2, h1Var2, m0Var4, m0Var5)) {
                            recyclerView4.postAnimationRunner();
                        }
                    } else {
                        z10 = z11;
                        if ((i11 & 4) != 0) {
                            m0 m0Var6 = q1Var3.f4898b;
                            RecyclerView recyclerView5 = ((f0) r1Var).f4767a;
                            recyclerView5.mRecycler.k(h1Var2);
                            recyclerView5.animateDisappearance(h1Var2, m0Var6, null);
                        } else if ((i11 & 8) != 0) {
                            ((f0) r1Var).f4767a.animateAppearance(h1Var2, q1Var3.f4898b, q1Var3.f4899c);
                        }
                    }
                    q1Var3.f4897a = 0;
                    q1Var3.f4898b = null;
                    q1Var3.f4899c = null;
                    q1.f4896d.e(q1Var3);
                    i10--;
                    z11 = z10;
                }
                z10 = z11;
                q1Var3.f4897a = 0;
                q1Var3.f4898b = null;
                q1Var3.f4899c = null;
                q1.f4896d.e(q1Var3);
                i10--;
                z11 = z10;
            }
        }
        boolean z14 = z11;
        this.mLayout.b0(this.mRecycler);
        e1 e1Var2 = this.mState;
        e1Var2.f4750b = e1Var2.f4753e;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        e1Var2.f4758j = false;
        e1Var2.f4759k = false;
        this.mLayout.f4910f = false;
        ArrayList arrayList = this.mRecycler.f4971b;
        if (arrayList != null) {
            arrayList.clear();
        }
        r0 r0Var = this.mLayout;
        if (r0Var.f4915k) {
            r0Var.f4914j = 0;
            r0Var.f4915k = false;
            this.mRecycler.l();
        }
        this.mLayout.W(this.mState);
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        s1 s1Var2 = this.mViewInfoStore;
        s1Var2.f4929a.clear();
        s1Var2.f4930b.a();
        int[] iArr = this.mMinMaxLayoutPositions;
        if (didChildRangeChange(iArr[0], iArr[z14 ? 1 : 0])) {
            dispatchOnScrolled(0, 0);
        }
        recoverFocusFromState();
        resetFocusInfo();
    }

    private boolean dispatchOnItemTouch(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        v0 v0Var = this.mActiveOnItemTouchListener;
        if (v0Var != null) {
            if (action != 0) {
                p pVar = (p) v0Var;
                int i10 = pVar.f4857b;
                if (pVar.f4876v != 0) {
                    if (motionEvent.getAction() == 0) {
                        boolean zB = pVar.b(motionEvent.getX(), motionEvent.getY());
                        boolean zA = pVar.a(motionEvent.getX(), motionEvent.getY());
                        if (zB || zA) {
                            if (zA) {
                                pVar.f4877w = 1;
                                pVar.f4870p = (int) motionEvent.getX();
                            } else if (zB) {
                                pVar.f4877w = 2;
                                pVar.f4867m = (int) motionEvent.getY();
                            }
                            pVar.e(2);
                        }
                    } else if (motionEvent.getAction() == 1 && pVar.f4876v == 2) {
                        pVar.f4867m = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        pVar.f4870p = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        pVar.e(1);
                        pVar.f4877w = 0;
                    } else if (motionEvent.getAction() == 2 && pVar.f4876v == 2) {
                        pVar.f();
                        if (pVar.f4877w == 1) {
                            float x10 = motionEvent.getX();
                            int[] iArr = pVar.f4879y;
                            iArr[0] = i10;
                            int i11 = pVar.f4871q - i10;
                            iArr[1] = i11;
                            float fMax = Math.max(i10, Math.min(i11, x10));
                            if (Math.abs(pVar.f4869o - fMax) >= 2.0f) {
                                int iD = p.d(pVar.f4870p, fMax, iArr, pVar.f4873s.computeHorizontalScrollRange(), pVar.f4873s.computeHorizontalScrollOffset(), pVar.f4871q);
                                if (iD != 0) {
                                    pVar.f4873s.scrollBy(iD, 0);
                                }
                                pVar.f4870p = fMax;
                            }
                        }
                        if (pVar.f4877w == 2) {
                            float y10 = motionEvent.getY();
                            int[] iArr2 = pVar.f4878x;
                            iArr2[0] = i10;
                            int i12 = pVar.f4872r - i10;
                            iArr2[1] = i12;
                            float fMax2 = Math.max(i10, Math.min(i12, y10));
                            if (Math.abs(pVar.l - fMax2) >= 2.0f) {
                                int iD2 = p.d(pVar.f4867m, fMax2, iArr2, pVar.f4873s.computeVerticalScrollRange(), pVar.f4873s.computeVerticalScrollOffset(), pVar.f4872r);
                                if (iD2 != 0) {
                                    pVar.f4873s.scrollBy(0, iD2);
                                }
                                pVar.f4867m = fMax2;
                            }
                        }
                    }
                }
                if (action != 3 && action != 1) {
                    return true;
                }
                this.mActiveOnItemTouchListener = null;
                return true;
            }
            this.mActiveOnItemTouchListener = null;
        }
        if (action != 0) {
            int size = this.mOnItemTouchListeners.size();
            for (int i13 = 0; i13 < size; i13++) {
                p pVar2 = (p) this.mOnItemTouchListeners.get(i13);
                if (pVar2.c(motionEvent)) {
                    this.mActiveOnItemTouchListener = pVar2;
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dispatchOnItemTouchIntercept(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 3 || action == 0) {
            this.mActiveOnItemTouchListener = null;
        }
        int size = this.mOnItemTouchListeners.size();
        for (int i10 = 0; i10 < size; i10++) {
            p pVar = (p) this.mOnItemTouchListeners.get(i10);
            if (pVar.c(motionEvent) && action != 3) {
                this.mActiveOnItemTouchListener = pVar;
                return true;
            }
        }
        return false;
    }

    private void findMinMaxChildLayoutPositions(int[] iArr) {
        int iE = this.mChildHelper.e();
        if (iE == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i10 = Integer.MAX_VALUE;
        int i11 = Integer.MIN_VALUE;
        for (int i12 = 0; i12 < iE; i12++) {
            h1 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.d(i12));
            if (!childViewHolderInt.shouldIgnore()) {
                int layoutPosition = childViewHolderInt.getLayoutPosition();
                if (layoutPosition < i10) {
                    i10 = layoutPosition;
                }
                if (layoutPosition > i11) {
                    i11 = layoutPosition;
                }
            }
        }
        iArr[0] = i10;
        iArr[1] = i11;
    }

    @Nullable
    public static RecyclerView findNestedRecyclerView(@NonNull View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            RecyclerView recyclerViewFindNestedRecyclerView = findNestedRecyclerView(viewGroup.getChildAt(i10));
            if (recyclerViewFindNestedRecyclerView != null) {
                return recyclerViewFindNestedRecyclerView;
            }
        }
        return null;
    }

    @Nullable
    private View findNextViewToFocus() {
        h1 h1VarFindViewHolderForAdapterPosition;
        e1 e1Var = this.mState;
        int i10 = e1Var.l;
        if (i10 == -1) {
            i10 = 0;
        }
        int iB = e1Var.b();
        for (int i11 = i10; i11 < iB; i11++) {
            h1 h1VarFindViewHolderForAdapterPosition2 = findViewHolderForAdapterPosition(i11);
            if (h1VarFindViewHolderForAdapterPosition2 == null) {
                break;
            }
            if (h1VarFindViewHolderForAdapterPosition2.itemView.hasFocusable()) {
                return h1VarFindViewHolderForAdapterPosition2.itemView;
            }
        }
        int iMin = Math.min(iB, i10);
        do {
            iMin--;
            if (iMin < 0 || (h1VarFindViewHolderForAdapterPosition = findViewHolderForAdapterPosition(iMin)) == null) {
                return null;
            }
        } while (!h1VarFindViewHolderForAdapterPosition.itemView.hasFocusable());
        return h1VarFindViewHolderForAdapterPosition.itemView;
    }

    public static h1 getChildViewHolderInt(View view) {
        if (view == null) {
            return null;
        }
        return ((s0) view.getLayoutParams()).f4925a;
    }

    public static void getDecoratedBoundsWithMarginsInt(View view, Rect rect) {
        s0 s0Var = (s0) view.getLayoutParams();
        Rect rect2 = s0Var.f4926b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) s0Var).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) s0Var).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) s0Var).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) s0Var).bottomMargin);
    }

    private int getDeepestFocusedViewWithId(View view) {
        int id2 = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            if (view.getId() != -1) {
                id2 = view.getId();
            }
        }
        return id2;
    }

    private String getFullClassName(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        }
        if (str.contains(".")) {
            return str;
        }
        return RecyclerView.class.getPackage().getName() + '.' + str;
    }

    private m0.s getScrollingChildHelper() {
        if (this.mScrollingChildHelper == null) {
            this.mScrollingChildHelper = new m0.s(this);
        }
        return this.mScrollingChildHelper;
    }

    private void handleMissingPreInfoForChangeError(long j10, h1 h1Var, h1 h1Var2) {
        int iE = this.mChildHelper.e();
        for (int i10 = 0; i10 < iE; i10++) {
            h1 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.d(i10));
            if (childViewHolderInt != h1Var && getChangedHolderKey(childViewHolderInt) == j10) {
                g0 g0Var = this.mAdapter;
                if (g0Var == null || !g0Var.hasStableIds()) {
                    StringBuilder sb2 = new StringBuilder("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:");
                    sb2.append(childViewHolderInt);
                    sb2.append(" \n View Holder 2:");
                    sb2.append(h1Var);
                    throw new IllegalStateException(defpackage.e.k(this, sb2));
                }
                StringBuilder sb3 = new StringBuilder("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:");
                sb3.append(childViewHolderInt);
                sb3.append(" \n View Holder 2:");
                sb3.append(h1Var);
                throw new IllegalStateException(defpackage.e.k(this, sb3));
            }
        }
        Log.e(TAG, "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + h1Var2 + " cannot be found but it is necessary for " + h1Var + exceptionLabel());
    }

    private boolean hasUpdatedView() {
        int iE = this.mChildHelper.e();
        for (int i10 = 0; i10 < iE; i10++) {
            h1 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.d(i10));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && childViewHolderInt.isUpdated()) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"InlinedApi"})
    private void initAutofill() {
        WeakHashMap weakHashMap = m0.s0.f45746a;
        if (m0.n0.a(this) == 0) {
            m0.n0.b(this, 8);
        }
    }

    private void initChildrenHelper() {
        this.mChildHelper = new d(new f0(this));
    }

    private boolean isPreferredNextFocus(View view, View view2, int i10) {
        int i11;
        if (view2 != null && view2 != this && findContainingItemView(view2) != null) {
            if (view != null && findContainingItemView(view) != null) {
                this.mTempRect.set(0, 0, view.getWidth(), view.getHeight());
                this.mTempRect2.set(0, 0, view2.getWidth(), view2.getHeight());
                offsetDescendantRectToMyCoords(view, this.mTempRect);
                offsetDescendantRectToMyCoords(view2, this.mTempRect2);
                RecyclerView recyclerView = this.mLayout.f4906b;
                WeakHashMap weakHashMap = m0.s0.f45746a;
                byte b10 = -1;
                int i12 = recyclerView.getLayoutDirection() == 1 ? -1 : 1;
                Rect rect = this.mTempRect;
                int i13 = rect.left;
                Rect rect2 = this.mTempRect2;
                int i14 = rect2.left;
                if ((i13 < i14 || rect.right <= i14) && rect.right < rect2.right) {
                    i11 = 1;
                } else {
                    int i15 = rect.right;
                    int i16 = rect2.right;
                    i11 = ((i15 > i16 || i13 >= i16) && i13 > i14) ? -1 : 0;
                }
                int i17 = rect.top;
                int i18 = rect2.top;
                if ((i17 < i18 || rect.bottom <= i18) && rect.bottom < rect2.bottom) {
                    b10 = 1;
                } else {
                    int i19 = rect.bottom;
                    int i20 = rect2.bottom;
                    if ((i19 <= i20 && i17 < i20) || i17 <= i18) {
                        b10 = 0;
                    }
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 17) {
                            if (i10 != 33) {
                                if (i10 != 66) {
                                    if (i10 != 130) {
                                        StringBuilder sb2 = new StringBuilder("Invalid direction: ");
                                        sb2.append(i10);
                                        throw new IllegalArgumentException(defpackage.e.k(this, sb2));
                                    }
                                    if (b10 > 0) {
                                    }
                                } else if (i11 > 0) {
                                }
                            } else if (b10 < 0) {
                            }
                        } else if (i11 < 0) {
                        }
                    } else if (b10 > 0 || (b10 == 0 && i11 * i12 >= 0)) {
                    }
                } else if (b10 < 0 || (b10 == 0 && i11 * i12 <= 0)) {
                }
            }
            return true;
        }
        return false;
    }

    private void onPointerUp(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mScrollPointerId) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.mScrollPointerId = motionEvent.getPointerId(i10);
            int x10 = (int) (motionEvent.getX(i10) + 0.5f);
            this.mLastTouchX = x10;
            this.mInitialTouchX = x10;
            int y10 = (int) (motionEvent.getY(i10) + 0.5f);
            this.mLastTouchY = y10;
            this.mInitialTouchY = y10;
        }
    }

    private boolean predictiveItemAnimationsEnabled() {
        return this.mItemAnimator != null && this.mLayout.t0();
    }

    private void processAdapterUpdatesAndSetAnimationFlags() {
        boolean z10;
        boolean z11 = false;
        if (this.mDataSetHasChangedAfterLayout) {
            b bVar = this.mAdapterHelper;
            bVar.k(bVar.f4720b);
            bVar.k(bVar.f4721c);
            bVar.f4724f = 0;
            if (this.mDispatchItemsChangedEvent) {
                this.mLayout.R();
            }
        }
        if (predictiveItemAnimationsEnabled()) {
            this.mAdapterHelper.j();
        } else {
            this.mAdapterHelper.c();
        }
        boolean z12 = this.mItemsAddedOrRemoved || this.mItemsChanged;
        this.mState.f4758j = this.mFirstLayoutComplete && this.mItemAnimator != null && ((z10 = this.mDataSetHasChangedAfterLayout) || z12 || this.mLayout.f4910f) && (!z10 || this.mAdapter.hasStableIds());
        e1 e1Var = this.mState;
        if (e1Var.f4758j && z12 && !this.mDataSetHasChangedAfterLayout && predictiveItemAnimationsEnabled()) {
            z11 = true;
        }
        e1Var.f4759k = z11;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0040  */
    /* JADX WARN: Code duplicated, block: B:13:0x0056  */
    /* JADX WARN: Code duplicated, block: B:15:0x005a  */
    /* JADX WARN: Code duplicated, block: B:16:0x0071  */
    private void pullGlows(float f10, float f11, float f12, float f13) {
        boolean z10;
        boolean z11 = true;
        if (f11 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            if (f11 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                ensureRightGlow();
                this.mRightGlow.onPull(f11 / getWidth(), f12 / getHeight());
            } else {
                z10 = false;
            }
            if (f13 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                ensureTopGlow();
                this.mTopGlow.onPull((-f13) / getHeight(), f10 / getWidth());
            } else if (f13 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                ensureBottomGlow();
                this.mBottomGlow.onPull(f13 / getHeight(), 1.0f - (f10 / getWidth()));
            } else {
                z11 = z10;
            }
            if (z11 && f11 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f13 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                return;
            }
            WeakHashMap weakHashMap = m0.s0.f45746a;
            postInvalidateOnAnimation();
        }
        ensureLeftGlow();
        this.mLeftGlow.onPull((-f11) / getWidth(), 1.0f - (f12 / getHeight()));
        z10 = true;
        if (f13 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            ensureTopGlow();
            this.mTopGlow.onPull((-f13) / getHeight(), f10 / getWidth());
        } else if (f13 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            ensureBottomGlow();
            this.mBottomGlow.onPull(f13 / getHeight(), 1.0f - (f10 / getWidth()));
        } else {
            z11 = z10;
        }
        if (z11) {
        }
        WeakHashMap weakHashMap2 = m0.s0.f45746a;
        postInvalidateOnAnimation();
    }

    /* JADX WARN: Code duplicated, block: B:43:0x008e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0096  */
    private void recoverFocusFromState() {
        View viewFindViewById;
        if (!this.mPreserveFocusAfterLayout || this.mAdapter == null || !hasFocus() || getDescendantFocusability() == 393216) {
            return;
        }
        if (getDescendantFocusability() == 131072 && isFocused()) {
            return;
        }
        if (!isFocused()) {
            View focusedChild = getFocusedChild();
            if (!IGNORE_DETACHED_FOCUSED_CHILD || (focusedChild.getParent() != null && focusedChild.hasFocus())) {
                if (!this.mChildHelper.f4742c.contains(focusedChild)) {
                    return;
                }
            } else if (this.mChildHelper.e() == 0) {
                requestFocus();
                return;
            }
        }
        View viewFindNextViewToFocus = null;
        h1 h1VarFindViewHolderForItemId = (this.mState.f4760m == -1 || !this.mAdapter.hasStableIds()) ? null : findViewHolderForItemId(this.mState.f4760m);
        if (h1VarFindViewHolderForItemId != null) {
            if (!this.mChildHelper.f4742c.contains(h1VarFindViewHolderForItemId.itemView) && h1VarFindViewHolderForItemId.itemView.hasFocusable()) {
                viewFindNextViewToFocus = h1VarFindViewHolderForItemId.itemView;
            } else if (this.mChildHelper.e() > 0) {
                viewFindNextViewToFocus = findNextViewToFocus();
            }
        } else if (this.mChildHelper.e() > 0) {
            viewFindNextViewToFocus = findNextViewToFocus();
        }
        if (viewFindNextViewToFocus != null) {
            int i10 = this.mState.f4761n;
            if (i10 != -1 && (viewFindViewById = viewFindNextViewToFocus.findViewById(i10)) != null && viewFindViewById.isFocusable()) {
                viewFindNextViewToFocus = viewFindViewById;
            }
            viewFindNextViewToFocus.requestFocus();
        }
    }

    private void releaseGlows() {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.mLeftGlow.isFinished();
        } else {
            zIsFinished = false;
        }
        EdgeEffect edgeEffect2 = this.mTopGlow;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mRightGlow;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.mBottomGlow.isFinished();
        }
        if (zIsFinished) {
            WeakHashMap weakHashMap = m0.s0.f45746a;
            postInvalidateOnAnimation();
        }
    }

    private void requestChildOnScreen(@NonNull View view, @Nullable View view2) {
        View view3 = view2 != null ? view2 : view;
        this.mTempRect.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof s0) {
            s0 s0Var = (s0) layoutParams;
            if (!s0Var.f4927c) {
                Rect rect = s0Var.f4926b;
                Rect rect2 = this.mTempRect;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.mTempRect);
            offsetRectIntoDescendantCoords(view, this.mTempRect);
        }
        this.mLayout.e0(this, view, this.mTempRect, !this.mFirstLayoutComplete, view2 == null);
    }

    private void resetFocusInfo() {
        e1 e1Var = this.mState;
        e1Var.f4760m = -1L;
        e1Var.l = -1;
        e1Var.f4761n = -1;
    }

    private void resetTouch() {
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        stopNestedScroll(0);
        releaseGlows();
    }

    private void saveFocusInfo() {
        int adapterPosition;
        View focusedChild = (this.mPreserveFocusAfterLayout && hasFocus() && this.mAdapter != null) ? getFocusedChild() : null;
        h1 h1VarFindContainingViewHolder = focusedChild != null ? findContainingViewHolder(focusedChild) : null;
        if (h1VarFindContainingViewHolder == null) {
            resetFocusInfo();
            return;
        }
        this.mState.f4760m = this.mAdapter.hasStableIds() ? h1VarFindContainingViewHolder.getItemId() : -1L;
        e1 e1Var = this.mState;
        if (this.mDataSetHasChangedAfterLayout) {
            adapterPosition = -1;
        } else {
            adapterPosition = h1VarFindContainingViewHolder.isRemoved() ? h1VarFindContainingViewHolder.mOldPosition : h1VarFindContainingViewHolder.getAdapterPosition();
        }
        e1Var.l = adapterPosition;
        this.mState.f4761n = getDeepestFocusedViewWithId(h1VarFindContainingViewHolder.itemView);
    }

    private void setAdapterInternal(@Nullable g0 g0Var, boolean z10, boolean z11) {
        g0 g0Var2 = this.mAdapter;
        if (g0Var2 != null) {
            g0Var2.unregisterAdapterDataObserver(this.mObserver);
            this.mAdapter.onDetachedFromRecyclerView(this);
        }
        if (!z10 || z11) {
            removeAndRecycleViews();
        }
        b bVar = this.mAdapterHelper;
        bVar.k(bVar.f4720b);
        bVar.k(bVar.f4721c);
        bVar.f4724f = 0;
        g0 g0Var3 = this.mAdapter;
        this.mAdapter = g0Var;
        if (g0Var != null) {
            g0Var.registerAdapterDataObserver(this.mObserver);
            g0Var.onAttachedToRecyclerView(this);
        }
        y0 y0Var = this.mRecycler;
        g0 g0Var4 = this.mAdapter;
        y0Var.f4970a.clear();
        y0Var.e();
        x0 x0VarC = y0Var.c();
        if (g0Var3 != null) {
            x0VarC.f4958b--;
        }
        if (!z10 && x0VarC.f4958b == 0) {
            SparseArray sparseArray = x0VarC.f4957a;
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                ((w0) sparseArray.valueAt(i10)).f4949a.clear();
            }
        }
        if (g0Var4 != null) {
            x0VarC.f4958b++;
        } else {
            x0VarC.getClass();
        }
        this.mState.f4754f = true;
    }

    private void stopScrollersInternal() {
        a0 a0Var;
        g1 g1Var = this.mViewFlinger;
        g1Var.f4780g.removeCallbacks(g1Var);
        g1Var.f4776c.abortAnimation();
        r0 r0Var = this.mLayout;
        if (r0Var == null || (a0Var = r0Var.f4909e) == null) {
            return;
        }
        a0Var.d();
    }

    public void absorbGlows(int i10, int i11) {
        if (i10 < 0) {
            ensureLeftGlow();
            this.mLeftGlow.onAbsorb(-i10);
        } else if (i10 > 0) {
            ensureRightGlow();
            this.mRightGlow.onAbsorb(i10);
        }
        if (i11 < 0) {
            ensureTopGlow();
            this.mTopGlow.onAbsorb(-i11);
        } else if (i11 > 0) {
            ensureBottomGlow();
            this.mBottomGlow.onAbsorb(i11);
        }
        if (i10 == 0 && i11 == 0) {
            return;
        }
        WeakHashMap weakHashMap = m0.s0.f45746a;
        postInvalidateOnAnimation();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i10, int i11) {
        r0 r0Var = this.mLayout;
        if (r0Var != null) {
            r0Var.getClass();
        }
        super.addFocusables(arrayList, i10, i11);
    }

    public void addItemDecoration(@NonNull o0 o0Var, int i10) {
        r0 r0Var = this.mLayout;
        if (r0Var != null) {
            r0Var.c("Cannot add item decoration during a scroll  or layout");
        }
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i10 < 0) {
            this.mItemDecorations.add(o0Var);
        } else {
            this.mItemDecorations.add(i10, o0Var);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void addOnChildAttachStateChangeListener(@NonNull t0 t0Var) {
        if (this.mOnChildAttachStateListeners == null) {
            this.mOnChildAttachStateListeners = new ArrayList();
        }
        this.mOnChildAttachStateListeners.add(t0Var);
    }

    public void addOnItemTouchListener(@NonNull v0 v0Var) {
        this.mOnItemTouchListeners.add(v0Var);
    }

    public void addOnScrollListener(@NonNull OnScrollListener onScrollListener) {
        if (this.mScrollListeners == null) {
            this.mScrollListeners = new ArrayList();
        }
        this.mScrollListeners.add(onScrollListener);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001b  */
    public void animateAppearance(@NonNull h1 h1Var, @Nullable m0 m0Var, @NonNull m0 m0Var2) {
        boolean zG;
        h1Var.setIsRecyclable(false);
        k kVar = (k) this.mItemAnimator;
        if (m0Var != null) {
            kVar.getClass();
            int i10 = m0Var.f4823a;
            int i11 = m0Var2.f4823a;
            if (i10 == i11 && m0Var.f4824b == m0Var2.f4824b) {
                kVar.l(h1Var);
                h1Var.itemView.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                kVar.f4803i.add(h1Var);
                zG = true;
            } else {
                zG = kVar.g(h1Var, i10, m0Var.f4824b, i11, m0Var2.f4824b);
            }
        } else {
            kVar.l(h1Var);
            h1Var.itemView.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            kVar.f4803i.add(h1Var);
            zG = true;
        }
        if (zG) {
            postAnimationRunner();
        }
    }

    public void animateDisappearance(@NonNull h1 h1Var, @NonNull m0 m0Var, @Nullable m0 m0Var2) {
        boolean zG;
        addAnimatingView(h1Var);
        h1Var.setIsRecyclable(false);
        k kVar = (k) this.mItemAnimator;
        kVar.getClass();
        int i10 = m0Var.f4823a;
        int i11 = m0Var.f4824b;
        View view = h1Var.itemView;
        int left = m0Var2 == null ? view.getLeft() : m0Var2.f4823a;
        int top = m0Var2 == null ? view.getTop() : m0Var2.f4824b;
        if (h1Var.isRemoved() || (i10 == left && i11 == top)) {
            kVar.l(h1Var);
            kVar.f4802h.add(h1Var);
            zG = true;
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            zG = kVar.g(h1Var, i10, i11, left, top);
        }
        if (zG) {
            postAnimationRunner();
        }
    }

    public void assertInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            return;
        }
        if (str != null) {
            throw new IllegalStateException(defpackage.e.k(this, d5.u.i(str)));
        }
        throw new IllegalStateException(defpackage.e.k(this, new StringBuilder("Cannot call this method unless RecyclerView is computing a layout or scrolling")));
    }

    public void assertNotInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException(defpackage.e.k(this, new StringBuilder("Cannot call this method while RecyclerView is computing a layout or scrolling")));
        }
        if (this.mDispatchScrollCounter > 0) {
            Log.w(TAG, "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(defpackage.e.k(this, new StringBuilder(""))));
        }
    }

    public boolean canReuseUpdatedViewHolder(h1 h1Var) {
        n0 n0Var = this.mItemAnimator;
        if (n0Var != null) {
            return (h1Var.getUnmodifiedPayloads().isEmpty() && ((k) n0Var).f4801g && !h1Var.isInvalid()) ? false : true;
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof s0) && this.mLayout.f((s0) layoutParams);
    }

    public void clearOldPositions() {
        int iH = this.mChildHelper.h();
        for (int i10 = 0; i10 < iH; i10++) {
            h1 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i10));
            if (!childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.clearOldPosition();
            }
        }
        y0 y0Var = this.mRecycler;
        ArrayList arrayList = y0Var.f4970a;
        ArrayList arrayList2 = y0Var.f4972c;
        int size = arrayList2.size();
        for (int i11 = 0; i11 < size; i11++) {
            ((h1) arrayList2.get(i11)).clearOldPosition();
        }
        int size2 = arrayList.size();
        for (int i12 = 0; i12 < size2; i12++) {
            ((h1) arrayList.get(i12)).clearOldPosition();
        }
        ArrayList arrayList3 = y0Var.f4971b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i13 = 0; i13 < size3; i13++) {
                ((h1) y0Var.f4971b.get(i13)).clearOldPosition();
            }
        }
    }

    public void clearOnChildAttachStateChangeListeners() {
        List<t0> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            list.clear();
        }
    }

    public void clearOnScrollListeners() {
        List<OnScrollListener> list = this.mScrollListeners;
        if (list != null) {
            list.clear();
        }
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        r0 r0Var = this.mLayout;
        if (r0Var != null && r0Var.d()) {
            return this.mLayout.j(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        r0 r0Var = this.mLayout;
        if (r0Var != null && r0Var.d()) {
            return this.mLayout.k(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        r0 r0Var = this.mLayout;
        if (r0Var != null && r0Var.d()) {
            return this.mLayout.l(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        r0 r0Var = this.mLayout;
        if (r0Var != null && r0Var.e()) {
            return this.mLayout.m(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        r0 r0Var = this.mLayout;
        if (r0Var != null && r0Var.e()) {
            return this.mLayout.n(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        r0 r0Var = this.mLayout;
        if (r0Var != null && r0Var.e()) {
            return this.mLayout.o(this.mState);
        }
        return 0;
    }

    public void considerReleasingGlowsOnScroll(int i10, int i11) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || edgeEffect.isFinished() || i10 <= 0) {
            zIsFinished = false;
        } else {
            this.mLeftGlow.onRelease();
            zIsFinished = this.mLeftGlow.isFinished();
        }
        EdgeEffect edgeEffect2 = this.mRightGlow;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i10 < 0) {
            this.mRightGlow.onRelease();
            zIsFinished |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i11 > 0) {
            this.mTopGlow.onRelease();
            zIsFinished |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i11 < 0) {
            this.mBottomGlow.onRelease();
            zIsFinished |= this.mBottomGlow.isFinished();
        }
        if (zIsFinished) {
            WeakHashMap weakHashMap = m0.s0.f45746a;
            postInvalidateOnAnimation();
        }
    }

    public void consumePendingUpdateOperations() {
        if (!this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout) {
            Trace.beginSection(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
            dispatchLayout();
            Trace.endSection();
            return;
        }
        if (this.mAdapterHelper.g()) {
            b bVar = this.mAdapterHelper;
            int i10 = bVar.f4724f;
            if ((i10 & 4) == 0 || (i10 & 11) != 0) {
                if (bVar.g()) {
                    Trace.beginSection(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
                    dispatchLayout();
                    Trace.endSection();
                    return;
                }
                return;
            }
            Trace.beginSection(TRACE_HANDLE_ADAPTER_UPDATES_TAG);
            startInterceptRequestLayout();
            onEnterLayoutOrScroll();
            this.mAdapterHelper.j();
            if (!this.mLayoutWasDefered) {
                if (hasUpdatedView()) {
                    dispatchLayout();
                } else {
                    this.mAdapterHelper.b();
                }
            }
            stopInterceptRequestLayout(true);
            onExitLayoutOrScroll();
            Trace.endSection();
        }
    }

    public void defaultOnMeasure(int i10, int i11) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = m0.s0.f45746a;
        setMeasuredDimension(r0.g(i10, paddingRight, getMinimumWidth()), r0.g(i11, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    public void dispatchChildAttached(View view) {
        int size;
        h1 childViewHolderInt = getChildViewHolderInt(view);
        onChildAttachedToWindow(view);
        g0 g0Var = this.mAdapter;
        if (g0Var != null && childViewHolderInt != null) {
            g0Var.onViewAttachedToWindow(childViewHolderInt);
        }
        List<t0> list = this.mOnChildAttachStateListeners;
        if (list == null || (size = list.size() - 1) < 0) {
            return;
        }
        this.mOnChildAttachStateListeners.get(size).getClass();
        throw new ClassCastException();
    }

    public void dispatchChildDetached(View view) {
        int size;
        h1 childViewHolderInt = getChildViewHolderInt(view);
        onChildDetachedFromWindow(view);
        g0 g0Var = this.mAdapter;
        if (g0Var != null && childViewHolderInt != null) {
            g0Var.onViewDetachedFromWindow(childViewHolderInt);
        }
        List<t0> list = this.mOnChildAttachStateListeners;
        if (list == null || (size = list.size() - 1) < 0) {
            return;
        }
        this.mOnChildAttachStateListeners.get(size).getClass();
        throw new ClassCastException();
    }

    public void dispatchLayout() {
        if (this.mAdapter == null) {
            Log.e(TAG, "No adapter attached; skipping layout");
            return;
        }
        if (this.mLayout == null) {
            Log.e(TAG, "No layout manager attached; skipping layout");
            return;
        }
        e1 e1Var = this.mState;
        e1Var.f4757i = false;
        if (e1Var.f4752d == 1) {
            dispatchLayoutStep1();
            this.mLayout.j0(this);
            dispatchLayoutStep2();
        } else {
            b bVar = this.mAdapterHelper;
            if ((bVar.f4721c.isEmpty() || bVar.f4720b.isEmpty()) && this.mLayout.f4917n == getWidth() && this.mLayout.f4918o == getHeight()) {
                this.mLayout.j0(this);
            } else {
                this.mLayout.j0(this);
                dispatchLayoutStep2();
            }
        }
        dispatchLayoutStep3();
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return getScrollingChildHelper().a(f10, f11, z10);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f10, float f11) {
        return getScrollingChildHelper().b(f10, f11);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i10, i11, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return getScrollingChildHelper().d(i10, i11, i12, i13, iArr, 0, null);
    }

    public void dispatchOnScrollStateChanged(int i10) {
        r0 r0Var = this.mLayout;
        if (r0Var != null) {
            r0Var.Z(i10);
        }
        onScrollStateChanged(i10);
        OnScrollListener onScrollListener = this.mScrollListener;
        if (onScrollListener != null) {
            onScrollListener.onScrollStateChanged(this, i10);
        }
        List<OnScrollListener> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).onScrollStateChanged(this, i10);
            }
        }
    }

    public void dispatchOnScrolled(int i10, int i11) {
        this.mDispatchScrollCounter++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX, scrollY);
        onScrolled(i10, i11);
        OnScrollListener onScrollListener = this.mScrollListener;
        if (onScrollListener != null) {
            onScrollListener.onScrolled(this, i10, i11);
        }
        List<OnScrollListener> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).onScrolled(this, i10, i11);
            }
        }
        this.mDispatchScrollCounter--;
    }

    public void dispatchPendingImportantForAccessibilityChanges() {
        int i10;
        for (int size = this.mPendingAccessibilityImportanceChange.size() - 1; size >= 0; size--) {
            h1 h1Var = this.mPendingAccessibilityImportanceChange.get(size);
            if (h1Var.itemView.getParent() == this && !h1Var.shouldIgnore() && (i10 = h1Var.mPendingAccessibilityState) != -1) {
                View view = h1Var.itemView;
                WeakHashMap weakHashMap = m0.s0.f45746a;
                view.setImportantForAccessibility(i10);
                h1Var.mPendingAccessibilityState = -1;
            }
        }
        this.mPendingAccessibilityImportanceChange.clear();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z10;
        super.draw(canvas);
        int size = this.mItemDecorations.size();
        boolean z11 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                break;
            }
            p pVar = (p) this.mItemDecorations.get(i10);
            if (pVar.f4871q != pVar.f4873s.getWidth() || pVar.f4872r != pVar.f4873s.getHeight()) {
                pVar.f4871q = pVar.f4873s.getWidth();
                pVar.f4872r = pVar.f4873s.getHeight();
                pVar.e(0);
            } else if (pVar.A != 0) {
                if (pVar.f4874t) {
                    int i11 = pVar.f4871q;
                    int i12 = pVar.f4860e;
                    int i13 = i11 - i12;
                    int i14 = pVar.l;
                    int i15 = pVar.f4866k;
                    int i16 = i14 - (i15 / 2);
                    StateListDrawable stateListDrawable = pVar.f4858c;
                    stateListDrawable.setBounds(0, 0, i12, i15);
                    Drawable drawable = pVar.f4859d;
                    drawable.setBounds(0, 0, pVar.f4861f, pVar.f4872r);
                    RecyclerView recyclerView = pVar.f4873s;
                    WeakHashMap weakHashMap = m0.s0.f45746a;
                    if (recyclerView.getLayoutDirection() == 1) {
                        drawable.draw(canvas);
                        canvas.translate(i12, i16);
                        canvas.scale(-1.0f, 1.0f);
                        stateListDrawable.draw(canvas);
                        canvas.scale(1.0f, 1.0f);
                        canvas.translate(-i12, -i16);
                    } else {
                        canvas.translate(i13, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        drawable.draw(canvas);
                        canvas.translate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i16);
                        stateListDrawable.draw(canvas);
                        canvas.translate(-i13, -i16);
                    }
                }
                if (pVar.f4875u) {
                    int i17 = pVar.f4872r;
                    int i18 = pVar.f4864i;
                    int i19 = i17 - i18;
                    int i20 = pVar.f4869o;
                    int i21 = pVar.f4868n;
                    int i22 = i20 - (i21 / 2);
                    StateListDrawable stateListDrawable2 = pVar.f4862g;
                    stateListDrawable2.setBounds(0, 0, i21, i18);
                    Drawable drawable2 = pVar.f4863h;
                    drawable2.setBounds(0, 0, pVar.f4871q, pVar.f4865j);
                    canvas.translate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i19);
                    drawable2.draw(canvas);
                    canvas.translate(i22, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    stateListDrawable2.draw(canvas);
                    canvas.translate(-i22, -i19);
                }
            }
            i10++;
        }
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z10 = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.mClipToPadding ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            EdgeEffect edgeEffect2 = this.mLeftGlow;
            z10 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.mClipToPadding) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.mTopGlow;
            z10 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.mRightGlow;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.mClipToPadding ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(-paddingTop, -width);
            EdgeEffect edgeEffect6 = this.mRightGlow;
            z10 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.mBottomGlow;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.mClipToPadding) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.mBottomGlow;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z11 = true;
            }
            z10 |= z11;
            canvas.restoreToCount(iSave4);
        }
        if ((z10 || this.mItemAnimator == null || this.mItemDecorations.size() <= 0 || !this.mItemAnimator.f()) ? z10 : true) {
            WeakHashMap weakHashMap2 = m0.s0.f45746a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        return super.drawChild(canvas, view, j10);
    }

    public void ensureBottomGlow() {
        if (this.mBottomGlow != null) {
            return;
        }
        this.mEdgeEffectFactory.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.mBottomGlow = edgeEffect;
        if (this.mClipToPadding) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void ensureLeftGlow() {
        if (this.mLeftGlow != null) {
            return;
        }
        this.mEdgeEffectFactory.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.mLeftGlow = edgeEffect;
        if (this.mClipToPadding) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public void ensureRightGlow() {
        if (this.mRightGlow != null) {
            return;
        }
        this.mEdgeEffectFactory.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.mRightGlow = edgeEffect;
        if (this.mClipToPadding) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public void ensureTopGlow() {
        if (this.mTopGlow != null) {
            return;
        }
        this.mEdgeEffectFactory.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.mTopGlow = edgeEffect;
        if (this.mClipToPadding) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public String exceptionLabel() {
        return " " + super.toString() + ", adapter:" + this.mAdapter + ", layout:" + this.mLayout + ", context:" + getContext();
    }

    public final void fillRemainingScrollValues(e1 e1Var) {
        if (getScrollState() != 2) {
            e1Var.getClass();
            return;
        }
        OverScroller overScroller = this.mViewFlinger.f4776c;
        overScroller.getFinalX();
        overScroller.getCurrX();
        e1Var.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    @Nullable
    public View findChildViewUnder(float f10, float f11) {
        for (int iE = this.mChildHelper.e() - 1; iE >= 0; iE--) {
            View viewD = this.mChildHelper.d(iE);
            float translationX = viewD.getTranslationX();
            float translationY = viewD.getTranslationY();
            if (f10 >= viewD.getLeft() + translationX && f10 <= viewD.getRight() + translationX && f11 >= viewD.getTop() + translationY && f11 <= viewD.getBottom() + translationY) {
                return viewD;
            }
        }
        return null;
    }

    @Nullable
    public View findContainingItemView(@NonNull View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    @Nullable
    public h1 findContainingViewHolder(@NonNull View view) {
        View viewFindContainingItemView = findContainingItemView(view);
        if (viewFindContainingItemView == null) {
            return null;
        }
        return getChildViewHolder(viewFindContainingItemView);
    }

    @Nullable
    public h1 findViewHolderForAdapterPosition(int i10) {
        h1 h1Var = null;
        if (this.mDataSetHasChangedAfterLayout) {
            return null;
        }
        int iH = this.mChildHelper.h();
        for (int i11 = 0; i11 < iH; i11++) {
            h1 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i11));
            if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && getAdapterPositionFor(childViewHolderInt) == i10) {
                d dVar = this.mChildHelper;
                if (!dVar.f4742c.contains(childViewHolderInt.itemView)) {
                    return childViewHolderInt;
                }
                h1Var = childViewHolderInt;
            }
        }
        return h1Var;
    }

    public h1 findViewHolderForItemId(long j10) {
        g0 g0Var = this.mAdapter;
        h1 h1Var = null;
        if (g0Var != null && g0Var.hasStableIds()) {
            int iH = this.mChildHelper.h();
            for (int i10 = 0; i10 < iH; i10++) {
                h1 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i10));
                if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && childViewHolderInt.getItemId() == j10) {
                    d dVar = this.mChildHelper;
                    if (!dVar.f4742c.contains(childViewHolderInt.itemView)) {
                        return childViewHolderInt;
                    }
                    h1Var = childViewHolderInt;
                }
            }
        }
        return h1Var;
    }

    @Nullable
    public h1 findViewHolderForLayoutPosition(int i10) {
        return findViewHolderForPosition(i10, false);
    }

    @Nullable
    @Deprecated
    public h1 findViewHolderForPosition(int i10) {
        return findViewHolderForPosition(i10, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean fling(int i10, int i11) {
        r0 r0Var = this.mLayout;
        if (r0Var == null) {
            Log.e(TAG, "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        }
        if (!this.mLayoutFrozen) {
            boolean zD = r0Var.d();
            boolean zE = this.mLayout.e();
            int i12 = (!zD || Math.abs(i10) < this.mMinFlingVelocity) ? 0 : i10;
            int i13 = (!zE || Math.abs(i11) < this.mMinFlingVelocity) ? 0 : i11;
            if (i12 != 0 || i13 != 0) {
                float f10 = i12;
                float f11 = i13;
                if (!dispatchNestedPreFling(f10, f11)) {
                    boolean z10 = zD || zE;
                    dispatchNestedFling(f10, f11, z10);
                    int i14 = zD;
                    if (z10) {
                        if (zE) {
                            i14 = (zD ? 1 : 0) | 2;
                        }
                        startNestedScroll(i14, 1);
                        int i15 = this.mMaxFlingVelocity;
                        int iMax = Math.max(-i15, Math.min(i12, i15));
                        int i16 = this.mMaxFlingVelocity;
                        int iMax2 = Math.max(-i16, Math.min(i13, i16));
                        g1 g1Var = this.mViewFlinger;
                        g1Var.f4780g.setScrollState(2);
                        g1Var.f4775b = 0;
                        g1Var.f4774a = 0;
                        g1Var.f4776c.fling(0, 0, iMax, iMax2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
                        g1Var.b();
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:77:0x00dc A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:78:0x00dd  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i10) {
        View viewM;
        boolean z10;
        this.mLayout.getClass();
        boolean z11 = (this.mAdapter == null || this.mLayout == null || isComputingLayout() || this.mLayoutFrozen) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        if (!z11 || (i10 != 2 && i10 != 1)) {
            View viewFindNextFocus = focusFinder.findNextFocus(this, view, i10);
            if (viewFindNextFocus == null && z11) {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) != null) {
                    startInterceptRequestLayout();
                    viewM = this.mLayout.M(view, i10, this.mRecycler, this.mState);
                    stopInterceptRequestLayout(false);
                }
                return null;
            }
            viewM = viewFindNextFocus;
            if (viewM != null || viewM.hasFocusable()) {
                if (isPreferredNextFocus(view, viewM, i10)) {
                    return viewM;
                }
                return super.focusSearch(view, i10);
            }
            if (getFocusedChild() == null) {
                return super.focusSearch(view, i10);
            }
            requestChildOnScreen(viewM, null);
            return view;
        }
        if (this.mLayout.e()) {
            int i11 = i10 == 2 ? TsExtractor.TS_STREAM_TYPE_HDMV_DTS : 33;
            z10 = focusFinder.findNextFocus(this, view, i11) == null;
            if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                i10 = i11;
            }
        } else {
            z10 = false;
        }
        if (!z10 && this.mLayout.d()) {
            RecyclerView recyclerView = this.mLayout.f4906b;
            WeakHashMap weakHashMap = m0.s0.f45746a;
            int i12 = (recyclerView.getLayoutDirection() == 1) ^ (i10 == 2) ? 66 : 17;
            boolean z12 = focusFinder.findNextFocus(this, view, i12) == null;
            if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                i10 = i12;
            }
            z10 = z12;
        }
        if (z10) {
            consumePendingUpdateOperations();
            if (findContainingItemView(view) != null) {
                startInterceptRequestLayout();
                this.mLayout.M(view, i10, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            }
            return null;
        }
        viewM = focusFinder.findNextFocus(this, view, i10);
        if (viewM != null) {
        }
        if (isPreferredNextFocus(view, viewM, i10)) {
            return viewM;
        }
        return super.focusSearch(view, i10);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        r0 r0Var = this.mLayout;
        if (r0Var != null) {
            return r0Var.r();
        }
        throw new IllegalStateException(defpackage.e.k(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        r0 r0Var = this.mLayout;
        if (r0Var != null) {
            return r0Var.s(getContext(), attributeSet);
        }
        throw new IllegalStateException(defpackage.e.k(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Nullable
    public g0 getAdapter() {
        return this.mAdapter;
    }

    public int getAdapterPositionFor(h1 h1Var) {
        if (h1Var.hasAnyOfTheFlags(IronSourceError.ERROR_PLACEMENT_CAPPED) || !h1Var.isBound()) {
            return -1;
        }
        b bVar = this.mAdapterHelper;
        int i10 = h1Var.mPosition;
        ArrayList arrayList = bVar.f4720b;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            a aVar = (a) arrayList.get(i11);
            int i12 = aVar.f4701a;
            if (i12 != 1) {
                if (i12 == 2) {
                    int i13 = aVar.f4702b;
                    if (i13 <= i10) {
                        int i14 = aVar.f4704d;
                        if (i13 + i14 > i10) {
                            return -1;
                        }
                        i10 -= i14;
                    } else {
                        continue;
                    }
                } else if (i12 == 8) {
                    int i15 = aVar.f4702b;
                    if (i15 == i10) {
                        i10 = aVar.f4704d;
                    } else {
                        if (i15 < i10) {
                            i10--;
                        }
                        if (aVar.f4704d <= i10) {
                            i10++;
                        }
                    }
                }
            } else if (aVar.f4702b <= i10) {
                i10 += aVar.f4704d;
            }
        }
        return i10;
    }

    @Override // android.view.View
    public int getBaseline() {
        r0 r0Var = this.mLayout;
        if (r0Var == null) {
            return super.getBaseline();
        }
        r0Var.getClass();
        return -1;
    }

    public long getChangedHolderKey(h1 h1Var) {
        return this.mAdapter.hasStableIds() ? h1Var.getItemId() : h1Var.mPosition;
    }

    public int getChildAdapterPosition(@NonNull View view) {
        h1 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.getAdapterPosition();
        }
        return -1;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i10, int i11) {
        return super.getChildDrawingOrder(i10, i11);
    }

    public long getChildItemId(@NonNull View view) {
        h1 childViewHolderInt;
        g0 g0Var = this.mAdapter;
        if (g0Var == null || !g0Var.hasStableIds() || (childViewHolderInt = getChildViewHolderInt(view)) == null) {
            return -1L;
        }
        return childViewHolderInt.getItemId();
    }

    public int getChildLayoutPosition(@NonNull View view) {
        h1 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.getLayoutPosition();
        }
        return -1;
    }

    @Deprecated
    public int getChildPosition(@NonNull View view) {
        return getChildAdapterPosition(view);
    }

    public h1 getChildViewHolder(@NonNull View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return getChildViewHolderInt(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.mClipToPadding;
    }

    @Nullable
    public j1 getCompatAccessibilityDelegate() {
        return this.mAccessibilityDelegate;
    }

    public void getDecoratedBoundsWithMargins(@NonNull View view, @NonNull Rect rect) {
        getDecoratedBoundsWithMarginsInt(view, rect);
    }

    @NonNull
    public k0 getEdgeEffectFactory() {
        return this.mEdgeEffectFactory;
    }

    @Nullable
    public n0 getItemAnimator() {
        return this.mItemAnimator;
    }

    public Rect getItemDecorInsetsForChild(View view) {
        s0 s0Var = (s0) view.getLayoutParams();
        boolean z10 = s0Var.f4927c;
        Rect rect = s0Var.f4926b;
        if (!z10 || (this.mState.f4755g && (s0Var.f4925a.isUpdated() || s0Var.f4925a.isInvalid()))) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        int size = this.mItemDecorations.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.mTempRect.set(0, 0, 0, 0);
            o0 o0Var = this.mItemDecorations.get(i10);
            Rect rect2 = this.mTempRect;
            o0Var.getClass();
            ((s0) view.getLayoutParams()).f4925a.getLayoutPosition();
            rect2.set(0, 0, 0, 0);
            int i11 = rect.left;
            Rect rect3 = this.mTempRect;
            rect.left = i11 + rect3.left;
            rect.top += rect3.top;
            rect.right += rect3.right;
            rect.bottom += rect3.bottom;
        }
        s0Var.f4927c = false;
        return rect;
    }

    @NonNull
    public o0 getItemDecorationAt(int i10) {
        int itemDecorationCount = getItemDecorationCount();
        if (i10 >= 0 && i10 < itemDecorationCount) {
            return this.mItemDecorations.get(i10);
        }
        throw new IndexOutOfBoundsException(i10 + " is an invalid index for size " + itemDecorationCount);
    }

    public int getItemDecorationCount() {
        return this.mItemDecorations.size();
    }

    @Nullable
    public r0 getLayoutManager() {
        return this.mLayout;
    }

    public int getMaxFlingVelocity() {
        return this.mMaxFlingVelocity;
    }

    public int getMinFlingVelocity() {
        return this.mMinFlingVelocity;
    }

    public long getNanoTime() {
        if (ALLOW_THREAD_GAP_WORK) {
            return System.nanoTime();
        }
        return 0L;
    }

    @Nullable
    public u0 getOnFlingListener() {
        return null;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.mPreserveFocusAfterLayout;
    }

    @NonNull
    public x0 getRecycledViewPool() {
        return this.mRecycler.c();
    }

    public int getScrollState() {
        return this.mScrollState;
    }

    public boolean hasFixedSize() {
        return this.mHasFixedSize;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().f(0);
    }

    public boolean hasPendingAdapterUpdates() {
        return !this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout || this.mAdapterHelper.g();
    }

    public void initAdapterManager() {
        this.mAdapterHelper = new b(new f0(this));
    }

    public void initFastScroller(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
            throw new IllegalArgumentException(defpackage.e.k(this, new StringBuilder("Trying to set fast scroller without both required drawables.")));
        }
        Resources resources = getContext().getResources();
        new p(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(androidx.recyclerview.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(androidx.recyclerview.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(androidx.recyclerview.R.dimen.fastscroll_margin));
    }

    public void invalidateGlows() {
        this.mBottomGlow = null;
        this.mTopGlow = null;
        this.mRightGlow = null;
        this.mLeftGlow = null;
    }

    public void invalidateItemDecorations() {
        if (this.mItemDecorations.size() == 0) {
            return;
        }
        r0 r0Var = this.mLayout;
        if (r0Var != null) {
            r0Var.c("Cannot invalidate item decorations during a scroll or layout");
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public boolean isAccessibilityEnabled() {
        AccessibilityManager accessibilityManager = this.mAccessibilityManager;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public boolean isAnimating() {
        n0 n0Var = this.mItemAnimator;
        return n0Var != null && n0Var.f();
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.mIsAttached;
    }

    public boolean isComputingLayout() {
        return this.mLayoutOrScrollCounter > 0;
    }

    public boolean isLayoutFrozen() {
        return this.mLayoutFrozen;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f45744d;
    }

    public void jumpToPositionForSmoothScroller(int i10) {
        r0 r0Var = this.mLayout;
        if (r0Var == null) {
            return;
        }
        r0Var.h0(i10);
        awakenScrollBars();
    }

    public void markItemDecorInsetsDirty() {
        int iH = this.mChildHelper.h();
        for (int i10 = 0; i10 < iH; i10++) {
            ((s0) this.mChildHelper.g(i10).getLayoutParams()).f4927c = true;
        }
        ArrayList arrayList = this.mRecycler.f4972c;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            s0 s0Var = (s0) ((h1) arrayList.get(i11)).itemView.getLayoutParams();
            if (s0Var != null) {
                s0Var.f4927c = true;
            }
        }
    }

    public void markKnownViewsInvalid() {
        int iH = this.mChildHelper.h();
        for (int i10 = 0; i10 < iH; i10++) {
            h1 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i10));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.addFlags(6);
            }
        }
        markItemDecorInsetsDirty();
        y0 y0Var = this.mRecycler;
        ArrayList arrayList = y0Var.f4972c;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            h1 h1Var = (h1) arrayList.get(i11);
            if (h1Var != null) {
                h1Var.addFlags(6);
                h1Var.addChangePayload(null);
            }
        }
        g0 g0Var = y0Var.f4977h.mAdapter;
        if (g0Var == null || !g0Var.hasStableIds()) {
            y0Var.e();
        }
    }

    public void offsetChildrenHorizontal(int i10) {
        int iE = this.mChildHelper.e();
        for (int i11 = 0; i11 < iE; i11++) {
            this.mChildHelper.d(i11).offsetLeftAndRight(i10);
        }
    }

    public void offsetChildrenVertical(int i10) {
        int iE = this.mChildHelper.e();
        for (int i11 = 0; i11 < iE; i11++) {
            this.mChildHelper.d(i11).offsetTopAndBottom(i10);
        }
    }

    public void offsetPositionRecordsForInsert(int i10, int i11) {
        int iH = this.mChildHelper.h();
        for (int i12 = 0; i12 < iH; i12++) {
            h1 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i12));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && childViewHolderInt.mPosition >= i10) {
                childViewHolderInt.offsetPosition(i11, false);
                this.mState.f4754f = true;
            }
        }
        ArrayList arrayList = this.mRecycler.f4972c;
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            h1 h1Var = (h1) arrayList.get(i13);
            if (h1Var != null && h1Var.mPosition >= i10) {
                h1Var.offsetPosition(i11, true);
            }
        }
        requestLayout();
    }

    public void offsetPositionRecordsForMove(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int iH = this.mChildHelper.h();
        int i19 = -1;
        if (i10 < i11) {
            i13 = i10;
            i12 = i11;
            i14 = -1;
        } else {
            i12 = i10;
            i13 = i11;
            i14 = 1;
        }
        for (int i20 = 0; i20 < iH; i20++) {
            h1 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i20));
            if (childViewHolderInt != null && (i18 = childViewHolderInt.mPosition) >= i13 && i18 <= i12) {
                if (i18 == i10) {
                    childViewHolderInt.offsetPosition(i11 - i10, false);
                } else {
                    childViewHolderInt.offsetPosition(i14, false);
                }
                this.mState.f4754f = true;
            }
        }
        ArrayList arrayList = this.mRecycler.f4972c;
        if (i10 < i11) {
            i16 = i10;
            i15 = i11;
        } else {
            i15 = i10;
            i19 = 1;
            i16 = i11;
        }
        int size = arrayList.size();
        for (int i21 = 0; i21 < size; i21++) {
            h1 h1Var = (h1) arrayList.get(i21);
            if (h1Var != null && (i17 = h1Var.mPosition) >= i16 && i17 <= i15) {
                if (i17 == i10) {
                    h1Var.offsetPosition(i11 - i10, false);
                } else {
                    h1Var.offsetPosition(i19, false);
                }
            }
        }
        requestLayout();
    }

    public void offsetPositionRecordsForRemove(int i10, int i11, boolean z10) {
        int i12 = i10 + i11;
        int iH = this.mChildHelper.h();
        for (int i13 = 0; i13 < iH; i13++) {
            h1 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i13));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore()) {
                int i14 = childViewHolderInt.mPosition;
                if (i14 >= i12) {
                    childViewHolderInt.offsetPosition(-i11, z10);
                    this.mState.f4754f = true;
                } else if (i14 >= i10) {
                    childViewHolderInt.flagRemovedAndOffsetPosition(i10 - 1, -i11, z10);
                    this.mState.f4754f = true;
                }
            }
        }
        y0 y0Var = this.mRecycler;
        ArrayList arrayList = y0Var.f4972c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            h1 h1Var = (h1) arrayList.get(size);
            if (h1Var != null) {
                int i15 = h1Var.mPosition;
                if (i15 >= i12) {
                    h1Var.offsetPosition(-i11, z10);
                } else if (i15 >= i10) {
                    h1Var.addFlags(8);
                    y0Var.f(size);
                }
            }
        }
        requestLayout();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005e  */
    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        float refreshRate;
        super.onAttachedToWindow();
        this.mLayoutOrScrollCounter = 0;
        this.mIsAttached = true;
        this.mFirstLayoutComplete = this.mFirstLayoutComplete && !isLayoutRequested();
        r0 r0Var = this.mLayout;
        if (r0Var != null) {
            r0Var.f4911g = true;
        }
        this.mPostedAnimatorRunner = false;
        if (ALLOW_THREAD_GAP_WORK) {
            ThreadLocal threadLocal = s.f4919e;
            s sVar = (s) threadLocal.get();
            this.mGapWorker = sVar;
            if (sVar == null) {
                s sVar2 = new s();
                sVar2.f4921a = new ArrayList();
                sVar2.f4924d = new ArrayList();
                this.mGapWorker = sVar2;
                WeakHashMap weakHashMap = m0.s0.f45746a;
                Display display = getDisplay();
                if (isInEditMode() || display == null) {
                    refreshRate = 60.0f;
                } else {
                    refreshRate = display.getRefreshRate();
                    if (refreshRate < 30.0f) {
                        refreshRate = 60.0f;
                    }
                }
                s sVar3 = this.mGapWorker;
                sVar3.f4923c = (long) (1.0E9f / refreshRate);
                threadLocal.set(sVar3);
            }
            this.mGapWorker.f4921a.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        s sVar;
        super.onDetachedFromWindow();
        n0 n0Var = this.mItemAnimator;
        if (n0Var != null) {
            n0Var.e();
        }
        stopScroll();
        this.mIsAttached = false;
        r0 r0Var = this.mLayout;
        if (r0Var != null) {
            r0Var.f4911g = false;
            r0Var.L(this);
        }
        this.mPendingAccessibilityImportanceChange.clear();
        removeCallbacks(this.mItemAnimatorRunner);
        this.mViewInfoStore.getClass();
        while (q1.f4896d.g() != null) {
        }
        if (!ALLOW_THREAD_GAP_WORK || (sVar = this.mGapWorker) == null) {
            return;
        }
        sVar.f4921a.remove(this);
        this.mGapWorker = null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.mItemDecorations.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.mItemDecorations.get(i10).getClass();
        }
    }

    public void onEnterLayoutOrScroll() {
        this.mLayoutOrScrollCounter++;
    }

    public void onExitLayoutOrScroll() {
        onExitLayoutOrScroll(true);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0064  */
    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f10;
        float axisValue;
        if (this.mLayout != null && !this.mLayoutFrozen && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f10 = this.mLayout.e() ? -motionEvent.getAxisValue(9) : 0.0f;
                axisValue = this.mLayout.d() ? motionEvent.getAxisValue(10) : 0.0f;
            } else if ((motionEvent.getSource() & 4194304) != 0) {
                float axisValue2 = motionEvent.getAxisValue(26);
                if (this.mLayout.e()) {
                    f10 = -axisValue2;
                } else if (this.mLayout.d()) {
                    axisValue = axisValue2;
                    f10 = 0.0f;
                } else {
                    f10 = 0.0f;
                    axisValue = 0.0f;
                }
            } else {
                f10 = 0.0f;
                axisValue = 0.0f;
            }
            if (f10 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || axisValue != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                scrollByInternal((int) (axisValue * this.mScaledHorizontalScrollFactor), (int) (f10 * this.mScaledVerticalScrollFactor), motionEvent);
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        if (!this.mLayoutFrozen) {
            if (dispatchOnItemTouchIntercept(motionEvent)) {
                cancelTouch();
                return true;
            }
            r0 r0Var = this.mLayout;
            if (r0Var != null) {
                boolean zD = r0Var.d();
                boolean zE = this.mLayout.e();
                if (this.mVelocityTracker == null) {
                    this.mVelocityTracker = VelocityTracker.obtain();
                }
                this.mVelocityTracker.addMovement(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                if (actionMasked == 0) {
                    if (this.mIgnoreMotionEventTillDown) {
                        this.mIgnoreMotionEventTillDown = false;
                    }
                    this.mScrollPointerId = motionEvent.getPointerId(0);
                    int x10 = (int) (motionEvent.getX() + 0.5f);
                    this.mLastTouchX = x10;
                    this.mInitialTouchX = x10;
                    int y10 = (int) (motionEvent.getY() + 0.5f);
                    this.mLastTouchY = y10;
                    this.mInitialTouchY = y10;
                    if (this.mScrollState == 2) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        setScrollState(1);
                    }
                    int[] iArr = this.mNestedOffsets;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    int i10 = zD;
                    if (zE) {
                        i10 = (zD ? 1 : 0) | 2;
                    }
                    startNestedScroll(i10, 0);
                } else if (actionMasked == 1) {
                    this.mVelocityTracker.clear();
                    stopNestedScroll(0);
                } else if (actionMasked == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.mScrollPointerId);
                    if (iFindPointerIndex < 0) {
                        Log.e(TAG, "Error processing scroll; pointer index for id " + this.mScrollPointerId + " not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    int x11 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                    int y11 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                    if (this.mScrollState != 1) {
                        int i11 = x11 - this.mInitialTouchX;
                        int i12 = y11 - this.mInitialTouchY;
                        if (!zD || Math.abs(i11) <= this.mTouchSlop) {
                            z10 = false;
                        } else {
                            this.mLastTouchX = x11;
                            z10 = true;
                        }
                        if (zE && Math.abs(i12) > this.mTouchSlop) {
                            this.mLastTouchY = y11;
                            z10 = true;
                        }
                        if (z10) {
                            setScrollState(1);
                        }
                    }
                } else if (actionMasked == 3) {
                    cancelTouch();
                } else if (actionMasked == 5) {
                    this.mScrollPointerId = motionEvent.getPointerId(actionIndex);
                    int x12 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.mLastTouchX = x12;
                    this.mInitialTouchX = x12;
                    int y12 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                    this.mLastTouchY = y12;
                    this.mInitialTouchY = y12;
                } else if (actionMasked == 6) {
                    onPointerUp(motionEvent);
                }
                if (this.mScrollState == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        Trace.beginSection(TRACE_ON_LAYOUT_TAG);
        dispatchLayout();
        Trace.endSection();
        this.mFirstLayoutComplete = true;
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        r0 r0Var = this.mLayout;
        if (r0Var == null) {
            defaultOnMeasure(i10, i11);
            return;
        }
        if (r0Var.G()) {
            int mode = View.MeasureSpec.getMode(i10);
            int mode2 = View.MeasureSpec.getMode(i11);
            this.mLayout.f4906b.defaultOnMeasure(i10, i11);
            if ((mode == 1073741824 && mode2 == 1073741824) || this.mAdapter == null) {
                return;
            }
            if (this.mState.f4752d == 1) {
                dispatchLayoutStep1();
            }
            this.mLayout.k0(i10, i11);
            this.mState.f4757i = true;
            dispatchLayoutStep2();
            this.mLayout.m0(i10, i11);
            if (this.mLayout.p0()) {
                this.mLayout.k0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.mState.f4757i = true;
                dispatchLayoutStep2();
                this.mLayout.m0(i10, i11);
                return;
            }
            return;
        }
        if (this.mHasFixedSize) {
            this.mLayout.f4906b.defaultOnMeasure(i10, i11);
            return;
        }
        if (this.mAdapterUpdateDuringMeasure) {
            startInterceptRequestLayout();
            onEnterLayoutOrScroll();
            processAdapterUpdatesAndSetAnimationFlags();
            onExitLayoutOrScroll();
            e1 e1Var = this.mState;
            if (e1Var.f4759k) {
                e1Var.f4755g = true;
            } else {
                this.mAdapterHelper.c();
                this.mState.f4755g = false;
            }
            this.mAdapterUpdateDuringMeasure = false;
            stopInterceptRequestLayout(false);
        } else if (this.mState.f4759k) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        g0 g0Var = this.mAdapter;
        if (g0Var != null) {
            this.mState.f4753e = g0Var.getItemCount();
        } else {
            this.mState.f4753e = 0;
        }
        startInterceptRequestLayout();
        this.mLayout.f4906b.defaultOnMeasure(i10, i11);
        stopInterceptRequestLayout(false);
        this.mState.f4755g = false;
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i10, Rect rect) {
        if (isComputingLayout()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i10, rect);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof b1)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b1 b1Var = (b1) parcelable;
        this.mPendingSavedState = b1Var;
        super.onRestoreInstanceState(b1Var.f48514a);
        r0 r0Var = this.mLayout;
        if (r0Var == null || (parcelable2 = this.mPendingSavedState.f4726c) == null) {
            return;
        }
        r0Var.X(parcelable2);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        b1 b1Var = new b1(super.onSaveInstanceState());
        b1 b1Var2 = this.mPendingSavedState;
        if (b1Var2 != null) {
            b1Var.f4726c = b1Var2.f4726c;
            return b1Var;
        }
        r0 r0Var = this.mLayout;
        if (r0Var != null) {
            b1Var.f4726c = r0Var.Y();
            return b1Var;
        }
        b1Var.f4726c = null;
        return b1Var;
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 == i12 && i11 == i13) {
            return;
        }
        invalidateGlows();
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0105  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i10;
        RecyclerView recyclerView;
        boolean z10;
        if (!this.mLayoutFrozen && !this.mIgnoreMotionEventTillDown) {
            if (dispatchOnItemTouch(motionEvent)) {
                cancelTouch();
                return true;
            }
            r0 r0Var = this.mLayout;
            if (r0Var != null) {
                boolean zD = r0Var.d();
                boolean zE = this.mLayout.e();
                if (this.mVelocityTracker == null) {
                    this.mVelocityTracker = VelocityTracker.obtain();
                }
                MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                if (actionMasked == 0) {
                    int[] iArr = this.mNestedOffsets;
                    iArr[1] = 0;
                    iArr[0] = 0;
                }
                int[] iArr2 = this.mNestedOffsets;
                motionEventObtain.offsetLocation(iArr2[0], iArr2[1]);
                if (actionMasked != 0) {
                    if (actionMasked == 1) {
                        this.mVelocityTracker.addMovement(motionEventObtain);
                        this.mVelocityTracker.computeCurrentVelocity(1000, this.mMaxFlingVelocity);
                        float f10 = zD ? -this.mVelocityTracker.getXVelocity(this.mScrollPointerId) : 0.0f;
                        float f11 = zE ? -this.mVelocityTracker.getYVelocity(this.mScrollPointerId) : 0.0f;
                        if ((f10 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f11 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) || !fling((int) f10, (int) f11)) {
                            setScrollState(0);
                        }
                        resetTouch();
                    } else if (actionMasked != 2) {
                        if (actionMasked == 3) {
                            cancelTouch();
                        } else if (actionMasked == 5) {
                            this.mScrollPointerId = motionEvent.getPointerId(actionIndex);
                            int x10 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                            this.mLastTouchX = x10;
                            this.mInitialTouchX = x10;
                            int y10 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                            this.mLastTouchY = y10;
                            this.mInitialTouchY = y10;
                        } else if (actionMasked == 6) {
                            onPointerUp(motionEvent);
                        }
                        recyclerView = this;
                    } else {
                        int iFindPointerIndex = motionEvent.findPointerIndex(this.mScrollPointerId);
                        if (iFindPointerIndex < 0) {
                            Log.e(TAG, "Error processing scroll; pointer index for id " + this.mScrollPointerId + " not found. Did any MotionEvents get skipped?");
                            return false;
                        }
                        int x11 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                        int y11 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                        int i11 = this.mLastTouchX - x11;
                        int i12 = this.mLastTouchY - y11;
                        RecyclerView recyclerView2 = this;
                        if (dispatchNestedPreScroll(i11, i12, this.mScrollConsumed, this.mScrollOffset, 0)) {
                            int[] iArr3 = recyclerView2.mScrollConsumed;
                            i11 -= iArr3[0];
                            i12 -= iArr3[1];
                            int[] iArr4 = recyclerView2.mScrollOffset;
                            motionEventObtain.offsetLocation(iArr4[0], iArr4[1]);
                            int[] iArr5 = recyclerView2.mNestedOffsets;
                            int i13 = iArr5[0];
                            int[] iArr6 = recyclerView2.mScrollOffset;
                            iArr5[0] = i13 + iArr6[0];
                            iArr5[1] = iArr5[1] + iArr6[1];
                        }
                        if (recyclerView2.mScrollState != 1) {
                            if (zD) {
                                int iAbs = Math.abs(i11);
                                int i14 = recyclerView2.mTouchSlop;
                                if (iAbs > i14) {
                                    i11 = i11 > 0 ? i11 - i14 : i11 + i14;
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                            } else {
                                z10 = false;
                            }
                            if (zE) {
                                int iAbs2 = Math.abs(i12);
                                int i15 = recyclerView2.mTouchSlop;
                                if (iAbs2 > i15) {
                                    i12 = i12 > 0 ? i12 - i15 : i12 + i15;
                                    z10 = true;
                                }
                            }
                            if (z10) {
                                recyclerView2.setScrollState(1);
                            }
                        }
                        int i16 = recyclerView2.mScrollState;
                        recyclerView = recyclerView2;
                        if (i16 == 1) {
                            int[] iArr7 = recyclerView2.mScrollOffset;
                            recyclerView2.mLastTouchX = x11 - iArr7[0];
                            recyclerView2.mLastTouchY = y11 - iArr7[1];
                            if (recyclerView2.scrollByInternal(zD ? i11 : 0, zE ? i12 : 0, motionEventObtain)) {
                                recyclerView2.getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            s sVar = recyclerView2.mGapWorker;
                            recyclerView = recyclerView2;
                            recyclerView = recyclerView2;
                            if (sVar != null && (i11 != 0 || i12 != 0)) {
                                sVar.a(recyclerView2, i11, i12);
                                recyclerView = recyclerView2;
                            }
                        }
                    }
                    motionEventObtain.recycle();
                    return true;
                }
                RecyclerView recyclerView3 = this;
                recyclerView3.mScrollPointerId = motionEvent.getPointerId(0);
                int x12 = (int) (motionEvent.getX() + 0.5f);
                recyclerView3.mLastTouchX = x12;
                recyclerView3.mInitialTouchX = x12;
                int y12 = (int) (motionEvent.getY() + 0.5f);
                recyclerView3.mLastTouchY = y12;
                recyclerView3.mInitialTouchY = y12;
                if (zE) {
                    i10 = zD;
                    i10 = (zD ? 1 : 0) | 2;
                }
                i10 = zD;
                recyclerView3.startNestedScroll(i10, 0);
                recyclerView = recyclerView3;
                recyclerView.mVelocityTracker.addMovement(motionEventObtain);
                motionEventObtain.recycle();
                return true;
            }
        }
        return false;
    }

    public void postAnimationRunner() {
        if (this.mPostedAnimatorRunner || !this.mIsAttached) {
            return;
        }
        Runnable runnable = this.mItemAnimatorRunner;
        WeakHashMap weakHashMap = m0.s0.f45746a;
        postOnAnimation(runnable);
        this.mPostedAnimatorRunner = true;
    }

    public void processDataSetCompletelyChanged(boolean z10) {
        this.mDispatchItemsChangedEvent = z10 | this.mDispatchItemsChangedEvent;
        this.mDataSetHasChangedAfterLayout = true;
        markKnownViewsInvalid();
    }

    public void recordAnimationInfoIfBouncedHiddenView(h1 h1Var, m0 m0Var) {
        h1Var.setFlags(0, Segment.SIZE);
        if (this.mState.f4756h && h1Var.isUpdated() && !h1Var.isRemoved() && !h1Var.shouldIgnore()) {
            this.mViewInfoStore.f4930b.d(getChangedHolderKey(h1Var), h1Var);
        }
        x.e eVar = this.mViewInfoStore.f4929a;
        q1 q1VarA = (q1) eVar.get(h1Var);
        if (q1VarA == null) {
            q1VarA = q1.a();
            eVar.put(h1Var, q1VarA);
        }
        q1VarA.f4898b = m0Var;
        q1VarA.f4897a |= 4;
    }

    public void removeAndRecycleViews() {
        n0 n0Var = this.mItemAnimator;
        if (n0Var != null) {
            n0Var.e();
        }
        r0 r0Var = this.mLayout;
        if (r0Var != null) {
            r0Var.a0(this.mRecycler);
            this.mLayout.b0(this.mRecycler);
        }
        y0 y0Var = this.mRecycler;
        y0Var.f4970a.clear();
        y0Var.e();
    }

    public boolean removeAnimatingView(View view) {
        startInterceptRequestLayout();
        d dVar = this.mChildHelper;
        c cVar = dVar.f4741b;
        f0 f0Var = dVar.f4740a;
        int iIndexOfChild = f0Var.f4767a.indexOfChild(view);
        boolean z10 = true;
        if (iIndexOfChild == -1) {
            dVar.j(view);
        } else if (cVar.G(iIndexOfChild)) {
            cVar.J(iIndexOfChild);
            dVar.j(view);
            f0Var.b(iIndexOfChild);
        } else {
            z10 = false;
        }
        if (z10) {
            h1 childViewHolderInt = getChildViewHolderInt(view);
            this.mRecycler.k(childViewHolderInt);
            this.mRecycler.h(childViewHolderInt);
        }
        stopInterceptRequestLayout(!z10);
        return z10;
    }

    @Override // android.view.ViewGroup
    public void removeDetachedView(View view, boolean z10) {
        h1 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            if (childViewHolderInt.isTmpDetached()) {
                childViewHolderInt.clearTmpDetachFlag();
            } else if (!childViewHolderInt.shouldIgnore()) {
                StringBuilder sb2 = new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb2.append(childViewHolderInt);
                throw new IllegalArgumentException(defpackage.e.k(this, sb2));
            }
        }
        view.clearAnimation();
        dispatchChildDetached(view);
        super.removeDetachedView(view, z10);
    }

    public void removeItemDecoration(@NonNull o0 o0Var) {
        r0 r0Var = this.mLayout;
        if (r0Var != null) {
            r0Var.c("Cannot remove item decoration during a scroll  or layout");
        }
        this.mItemDecorations.remove(o0Var);
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void removeItemDecorationAt(int i10) {
        int itemDecorationCount = getItemDecorationCount();
        if (i10 >= 0 && i10 < itemDecorationCount) {
            removeItemDecoration(getItemDecorationAt(i10));
            return;
        }
        throw new IndexOutOfBoundsException(i10 + " is an invalid index for size " + itemDecorationCount);
    }

    public void removeOnChildAttachStateChangeListener(@NonNull t0 t0Var) {
        List<t0> list = this.mOnChildAttachStateListeners;
        if (list == null) {
            return;
        }
        list.remove(t0Var);
    }

    public void removeOnItemTouchListener(@NonNull v0 v0Var) {
        this.mOnItemTouchListeners.remove(v0Var);
        if (this.mActiveOnItemTouchListener == v0Var) {
            this.mActiveOnItemTouchListener = null;
        }
    }

    public void removeOnScrollListener(@NonNull OnScrollListener onScrollListener) {
        List<OnScrollListener> list = this.mScrollListeners;
        if (list != null) {
            list.remove(onScrollListener);
        }
    }

    public void repositionShadowingViews() {
        h1 h1Var;
        int iE = this.mChildHelper.e();
        for (int i10 = 0; i10 < iE; i10++) {
            View viewD = this.mChildHelper.d(i10);
            h1 childViewHolder = getChildViewHolder(viewD);
            if (childViewHolder != null && (h1Var = childViewHolder.mShadowingHolder) != null) {
                View view = h1Var.itemView;
                int left = viewD.getLeft();
                int top = viewD.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        a0 a0Var = this.mLayout.f4909e;
        if ((a0Var == null || !a0Var.f4709e) && !isComputingLayout() && view2 != null) {
            requestChildOnScreen(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        return this.mLayout.e0(this, view, rect, z10, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        int size = this.mOnItemTouchListeners.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.mOnItemTouchListeners.get(i10).getClass();
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.mInterceptRequestLayoutDepth != 0 || this.mLayoutFrozen) {
            this.mLayoutWasDefered = true;
        } else {
            super.requestLayout();
        }
    }

    public void saveOldPositions() {
        int iH = this.mChildHelper.h();
        for (int i10 = 0; i10 < iH; i10++) {
            h1 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i10));
            if (!childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.saveOldPosition();
            }
        }
    }

    @Override // android.view.View
    public void scrollBy(int i10, int i11) {
        r0 r0Var = this.mLayout;
        if (r0Var == null) {
            Log.e(TAG, "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.mLayoutFrozen) {
            return;
        }
        boolean zD = r0Var.d();
        boolean zE = this.mLayout.e();
        if (zD || zE) {
            if (!zD) {
                i10 = 0;
            }
            if (!zE) {
                i11 = 0;
            }
            scrollByInternal(i10, i11, null);
        }
    }

    public boolean scrollByInternal(int i10, int i11, MotionEvent motionEvent) {
        int i12;
        int i13;
        int i14;
        int i15;
        consumePendingUpdateOperations();
        if (this.mAdapter != null) {
            scrollStep(i10, i11, this.mScrollStepConsumed);
            int[] iArr = this.mScrollStepConsumed;
            int i16 = iArr[0];
            int i17 = iArr[1];
            i14 = i10 - i16;
            i15 = i11 - i17;
            i13 = i17;
            i12 = i16;
        } else {
            i12 = 0;
            i13 = 0;
            i14 = 0;
            i15 = 0;
        }
        if (!this.mItemDecorations.isEmpty()) {
            invalidate();
        }
        if (dispatchNestedScroll(i12, i13, i14, i15, this.mScrollOffset, 0)) {
            int i18 = this.mLastTouchX;
            int[] iArr2 = this.mScrollOffset;
            int i19 = iArr2[0];
            this.mLastTouchX = i18 - i19;
            int i20 = this.mLastTouchY;
            int i21 = iArr2[1];
            this.mLastTouchY = i20 - i21;
            if (motionEvent != null) {
                motionEvent.offsetLocation(i19, i21);
            }
            int[] iArr3 = this.mNestedOffsets;
            int i22 = iArr3[0];
            int[] iArr4 = this.mScrollOffset;
            iArr3[0] = i22 + iArr4[0];
            iArr3[1] = iArr3[1] + iArr4[1];
        } else if (getOverScrollMode() != 2) {
            if (motionEvent != null && (motionEvent.getSource() & 8194) != 8194) {
                pullGlows(motionEvent.getX(), i14, motionEvent.getY(), i15);
            }
            considerReleasingGlowsOnScroll(i10, i11);
        }
        if (i12 != 0 || i13 != 0) {
            dispatchOnScrolled(i12, i13);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (i12 == 0 && i13 == 0) ? false : true;
    }

    public void scrollStep(int i10, int i11, @Nullable int[] iArr) {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        Trace.beginSection(TRACE_SCROLL_TAG);
        fillRemainingScrollValues(this.mState);
        int iG0 = i10 != 0 ? this.mLayout.g0(i10, this.mRecycler, this.mState) : 0;
        int iI0 = i11 != 0 ? this.mLayout.i0(i11, this.mRecycler, this.mState) : 0;
        Trace.endSection();
        repositionShadowingViews();
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        if (iArr != null) {
            iArr[0] = iG0;
            iArr[1] = iI0;
        }
    }

    @Override // android.view.View
    public void scrollTo(int i10, int i11) {
        Log.w(TAG, "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public void scrollToPosition(int i10) {
        if (this.mLayoutFrozen) {
            return;
        }
        stopScroll();
        r0 r0Var = this.mLayout;
        if (r0Var == null) {
            Log.e(TAG, "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            r0Var.h0(i10);
            awakenScrollBars();
        }
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (shouldDeferAccessibilityEvent(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(@Nullable j1 j1Var) {
        this.mAccessibilityDelegate = j1Var;
        m0.s0.f(this, j1Var);
    }

    public void setAdapter(@Nullable g0 g0Var) {
        setLayoutFrozen(false);
        setAdapterInternal(g0Var, false, true);
        processDataSetCompletelyChanged(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(@Nullable j0 j0Var) {
        if (j0Var == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    public boolean setChildImportantForAccessibilityInternal(h1 h1Var, int i10) {
        if (isComputingLayout()) {
            h1Var.mPendingAccessibilityState = i10;
            this.mPendingAccessibilityImportanceChange.add(h1Var);
            return false;
        }
        View view = h1Var.itemView;
        WeakHashMap weakHashMap = m0.s0.f45746a;
        view.setImportantForAccessibility(i10);
        return true;
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z10) {
        if (z10 != this.mClipToPadding) {
            invalidateGlows();
        }
        this.mClipToPadding = z10;
        super.setClipToPadding(z10);
        if (this.mFirstLayoutComplete) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(@NonNull k0 k0Var) {
        k0Var.getClass();
        this.mEdgeEffectFactory = k0Var;
        invalidateGlows();
    }

    public void setHasFixedSize(boolean z10) {
        this.mHasFixedSize = z10;
    }

    public void setItemAnimator(@Nullable n0 n0Var) {
        n0 n0Var2 = this.mItemAnimator;
        if (n0Var2 != null) {
            n0Var2.e();
            this.mItemAnimator.f4832a = null;
        }
        this.mItemAnimator = n0Var;
        if (n0Var != null) {
            n0Var.f4832a = this.mItemAnimatorListener;
        }
    }

    public void setItemViewCacheSize(int i10) {
        y0 y0Var = this.mRecycler;
        y0Var.f4974e = i10;
        y0Var.l();
    }

    public void setLayoutFrozen(boolean z10) {
        if (z10 != this.mLayoutFrozen) {
            assertNotInLayoutOrScroll("Do not setLayoutFrozen in layout or scroll");
            if (z10) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0));
                this.mLayoutFrozen = true;
                this.mIgnoreMotionEventTillDown = true;
                stopScroll();
                return;
            }
            this.mLayoutFrozen = false;
            if (this.mLayoutWasDefered && this.mLayout != null && this.mAdapter != null) {
                requestLayout();
            }
            this.mLayoutWasDefered = false;
        }
    }

    public void setLayoutManager(@Nullable r0 r0Var) {
        if (r0Var == this.mLayout) {
            return;
        }
        stopScroll();
        if (this.mLayout != null) {
            n0 n0Var = this.mItemAnimator;
            if (n0Var != null) {
                n0Var.e();
            }
            this.mLayout.a0(this.mRecycler);
            this.mLayout.b0(this.mRecycler);
            y0 y0Var = this.mRecycler;
            y0Var.f4970a.clear();
            y0Var.e();
            if (this.mIsAttached) {
                r0 r0Var2 = this.mLayout;
                r0Var2.f4911g = false;
                r0Var2.L(this);
            }
            this.mLayout.n0(null);
            this.mLayout = null;
        } else {
            y0 y0Var2 = this.mRecycler;
            y0Var2.f4970a.clear();
            y0Var2.e();
        }
        d dVar = this.mChildHelper;
        RecyclerView recyclerView = dVar.f4740a.f4767a;
        dVar.f4741b.K();
        ArrayList arrayList = dVar.f4742c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            h1 childViewHolderInt = getChildViewHolderInt((View) arrayList.get(size));
            if (childViewHolderInt != null) {
                childViewHolderInt.onLeftHiddenState(recyclerView);
            }
            arrayList.remove(size);
        }
        int childCount = recyclerView.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = recyclerView.getChildAt(i10);
            recyclerView.dispatchChildDetached(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.mLayout = r0Var;
        if (r0Var != null) {
            if (r0Var.f4906b != null) {
                StringBuilder sb2 = new StringBuilder("LayoutManager ");
                sb2.append(r0Var);
                sb2.append(" is already attached to a RecyclerView:");
                throw new IllegalArgumentException(defpackage.e.k(r0Var.f4906b, sb2));
            }
            r0Var.n0(this);
            if (this.mIsAttached) {
                this.mLayout.f4911g = true;
            }
        }
        this.mRecycler.l();
        requestLayout();
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z10) {
        m0.s scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f45744d) {
            ViewGroup viewGroup = scrollingChildHelper.f45743c;
            WeakHashMap weakHashMap = m0.s0.f45746a;
            viewGroup.stopNestedScroll();
        }
        scrollingChildHelper.f45744d = z10;
    }

    @Deprecated
    public void setOnScrollListener(@Nullable OnScrollListener onScrollListener) {
        this.mScrollListener = onScrollListener;
    }

    public void setPreserveFocusAfterLayout(boolean z10) {
        this.mPreserveFocusAfterLayout = z10;
    }

    public void setRecycledViewPool(@Nullable x0 x0Var) {
        y0 y0Var = this.mRecycler;
        x0 x0Var2 = y0Var.f4976g;
        if (x0Var2 != null) {
            x0Var2.f4958b--;
        }
        y0Var.f4976g = x0Var;
        if (x0Var == null || y0Var.f4977h.getAdapter() == null) {
            return;
        }
        y0Var.f4976g.f4958b++;
    }

    public void setScrollState(int i10) {
        if (i10 == this.mScrollState) {
            return;
        }
        this.mScrollState = i10;
        if (i10 != 2) {
            stopScrollersInternal();
        }
        dispatchOnScrollStateChanged(i10);
    }

    public void setScrollingTouchSlop(int i10) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i10 != 0) {
            if (i10 == 1) {
                this.mTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w(TAG, "setScrollingTouchSlop(): bad argument constant " + i10 + "; using default value");
        }
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(@Nullable f1 f1Var) {
        this.mRecycler.getClass();
    }

    public boolean shouldDeferAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (!isComputingLayout()) {
            return false;
        }
        int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
        this.mEatenAccessibilityChangeFlags |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        return true;
    }

    public void smoothScrollBy(int i10, int i11) {
        smoothScrollBy(i10, i11, null);
    }

    public void smoothScrollToPosition(int i10) {
        if (this.mLayoutFrozen) {
            return;
        }
        r0 r0Var = this.mLayout;
        if (r0Var == null) {
            Log.e(TAG, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            r0Var.r0(this, i10);
        }
    }

    public void startInterceptRequestLayout() {
        int i10 = this.mInterceptRequestLayoutDepth + 1;
        this.mInterceptRequestLayoutDepth = i10;
        if (i10 != 1 || this.mLayoutFrozen) {
            return;
        }
        this.mLayoutWasDefered = false;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i10) {
        return getScrollingChildHelper().g(i10, 0);
    }

    public void stopInterceptRequestLayout(boolean z10) {
        if (this.mInterceptRequestLayoutDepth < 1) {
            this.mInterceptRequestLayoutDepth = 1;
        }
        if (!z10 && !this.mLayoutFrozen) {
            this.mLayoutWasDefered = false;
        }
        if (this.mInterceptRequestLayoutDepth == 1) {
            if (z10 && this.mLayoutWasDefered && !this.mLayoutFrozen && this.mLayout != null && this.mAdapter != null) {
                dispatchLayout();
            }
            if (!this.mLayoutFrozen) {
                this.mLayoutWasDefered = false;
            }
        }
        this.mInterceptRequestLayoutDepth--;
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        getScrollingChildHelper().h(0);
    }

    public void stopScroll() {
        setScrollState(0);
        stopScrollersInternal();
    }

    public void swapAdapter(@Nullable g0 g0Var, boolean z10) {
        setLayoutFrozen(false);
        setAdapterInternal(g0Var, true, z10);
        processDataSetCompletelyChanged(true);
        requestLayout();
    }

    public void viewRangeUpdate(int i10, int i11, Object obj) {
        int i12;
        int i13;
        int iH = this.mChildHelper.h();
        int i14 = i11 + i10;
        for (int i15 = 0; i15 < iH; i15++) {
            View viewG = this.mChildHelper.g(i15);
            h1 childViewHolderInt = getChildViewHolderInt(viewG);
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && (i13 = childViewHolderInt.mPosition) >= i10 && i13 < i14) {
                childViewHolderInt.addFlags(2);
                childViewHolderInt.addChangePayload(obj);
                ((s0) viewG.getLayoutParams()).f4927c = true;
            }
        }
        y0 y0Var = this.mRecycler;
        ArrayList arrayList = y0Var.f4972c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            h1 h1Var = (h1) arrayList.get(size);
            if (h1Var != null && (i12 = h1Var.mPosition) >= i10 && i12 < i14) {
                h1Var.addFlags(2);
                y0Var.f(size);
            }
        }
    }

    public RecyclerView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002a  */
    /* JADX WARN: Code duplicated, block: B:17:0x0036  */
    /* JADX WARN: Code duplicated, block: B:22:0x0038 A[SYNTHETIC] */
    @Nullable
    public h1 findViewHolderForPosition(int i10, boolean z10) {
        d dVar;
        int iH = this.mChildHelper.h();
        h1 h1Var = null;
        for (int i11 = 0; i11 < iH; i11++) {
            h1 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i11));
            if (childViewHolderInt != null && !childViewHolderInt.isRemoved()) {
                if (z10) {
                    if (childViewHolderInt.mPosition != i10) {
                        continue;
                    } else {
                        dVar = this.mChildHelper;
                        if (dVar.f4742c.contains(childViewHolderInt.itemView)) {
                            return childViewHolderInt;
                        }
                        h1Var = childViewHolderInt;
                    }
                } else if (childViewHolderInt.getLayoutPosition() != i10) {
                    continue;
                } else {
                    dVar = this.mChildHelper;
                    if (dVar.f4742c.contains(childViewHolderInt.itemView)) {
                        return childViewHolderInt;
                    }
                    h1Var = childViewHolderInt;
                }
            }
        }
        return h1Var;
    }

    public void onExitLayoutOrScroll(boolean z10) {
        int i10 = this.mLayoutOrScrollCounter - 1;
        this.mLayoutOrScrollCounter = i10;
        if (i10 < 1) {
            this.mLayoutOrScrollCounter = 0;
            if (z10) {
                dispatchContentChangedIfNecessary();
                dispatchPendingImportantForAccessibilityChanges();
            }
        }
    }

    public void smoothScrollBy(int i10, int i11, @Nullable Interpolator interpolator) {
        r0 r0Var = this.mLayout;
        if (r0Var == null) {
            Log.e(TAG, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.mLayoutFrozen) {
            return;
        }
        if (!r0Var.d()) {
            i10 = 0;
        }
        if (!this.mLayout.e()) {
            i11 = 0;
        }
        if (i10 == 0 && i11 == 0) {
            return;
        }
        g1 g1Var = this.mViewFlinger;
        int iA = g1Var.a(i10, i11);
        if (interpolator == null) {
            interpolator = sQuinticInterpolator;
        }
        g1Var.c(i10, i11, iA, interpolator);
    }

    public RecyclerView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        RecyclerView recyclerView;
        super(context, attributeSet, i10);
        this.mObserver = new a1(this);
        this.mRecycler = new y0(this);
        this.mViewInfoStore = new s1();
        this.mUpdateChildViewsRunnable = new d0(this, 0);
        this.mTempRect = new Rect();
        this.mTempRect2 = new Rect();
        this.mTempRectF = new RectF();
        this.mItemDecorations = new ArrayList<>();
        this.mOnItemTouchListeners = new ArrayList<>();
        this.mInterceptRequestLayoutDepth = 0;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        this.mLayoutOrScrollCounter = 0;
        this.mDispatchScrollCounter = 0;
        this.mEdgeEffectFactory = new k0();
        k kVar = new k();
        kVar.f4832a = null;
        kVar.f4833b = new ArrayList();
        kVar.f4834c = 120L;
        kVar.f4835d = 120L;
        kVar.f4836e = 250L;
        kVar.f4837f = 250L;
        boolean z10 = true;
        boolean z11 = true;
        kVar.f4801g = true;
        kVar.f4802h = new ArrayList();
        kVar.f4803i = new ArrayList();
        kVar.f4804j = new ArrayList();
        kVar.f4805k = new ArrayList();
        kVar.l = new ArrayList();
        kVar.f4806m = new ArrayList();
        kVar.f4807n = new ArrayList();
        kVar.f4808o = new ArrayList();
        kVar.f4809p = new ArrayList();
        kVar.f4810q = new ArrayList();
        kVar.f4811r = new ArrayList();
        this.mItemAnimator = kVar;
        this.mScrollState = 0;
        this.mScrollPointerId = -1;
        this.mScaledHorizontalScrollFactor = Float.MIN_VALUE;
        this.mScaledVerticalScrollFactor = Float.MIN_VALUE;
        this.mPreserveFocusAfterLayout = true;
        this.mViewFlinger = new g1(this);
        this.mPrefetchRegistry = ALLOW_THREAD_GAP_WORK ? new q() : null;
        e1 e1Var = new e1();
        e1Var.f4749a = -1;
        e1Var.f4750b = 0;
        e1Var.f4751c = 0;
        e1Var.f4752d = 1;
        e1Var.f4753e = 0;
        e1Var.f4754f = false;
        e1Var.f4755g = false;
        e1Var.f4756h = false;
        e1Var.f4757i = false;
        e1Var.f4758j = false;
        e1Var.f4759k = false;
        this.mState = e1Var;
        this.mItemsAddedOrRemoved = false;
        this.mItemsChanged = false;
        this.mItemAnimatorListener = new f0(this);
        this.mPostedAnimatorRunner = false;
        this.mMinMaxLayoutPositions = new int[2];
        this.mScrollOffset = new int[2];
        this.mScrollConsumed = new int[2];
        this.mNestedOffsets = new int[2];
        this.mScrollStepConsumed = new int[2];
        this.mPendingAccessibilityImportanceChange = new ArrayList();
        this.mItemAnimatorRunner = new d0(this, z11 ? 1 : 0);
        this.mViewInfoProcessCallback = new f0(this);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, CLIP_TO_PADDING_ATTR, i10, 0);
            this.mClipToPadding = typedArrayObtainStyledAttributes.getBoolean(0, true);
            typedArrayObtainStyledAttributes.recycle();
        } else {
            this.mClipToPadding = true;
        }
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.mScaledHorizontalScrollFactor = viewConfiguration.getScaledHorizontalScrollFactor();
        this.mScaledVerticalScrollFactor = viewConfiguration.getScaledVerticalScrollFactor();
        this.mMinFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        this.mMaxFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.mItemAnimator.f4832a = this.mItemAnimatorListener;
        initAdapterManager();
        initChildrenHelper();
        initAutofill();
        WeakHashMap weakHashMap = m0.s0.f45746a;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.mAccessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new j1(this));
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, androidx.recyclerview.R.styleable.RecyclerView, i10, 0);
            String string = typedArrayObtainStyledAttributes2.getString(androidx.recyclerview.R.styleable.RecyclerView_layoutManager);
            if (typedArrayObtainStyledAttributes2.getInt(androidx.recyclerview.R.styleable.RecyclerView_android_descendantFocusability, -1) == -1) {
                setDescendantFocusability(262144);
            }
            boolean z12 = typedArrayObtainStyledAttributes2.getBoolean(androidx.recyclerview.R.styleable.RecyclerView_fastScrollEnabled, false);
            this.mEnableFastScroller = z12;
            if (z12) {
                initFastScroller((StateListDrawable) typedArrayObtainStyledAttributes2.getDrawable(androidx.recyclerview.R.styleable.RecyclerView_fastScrollVerticalThumbDrawable), typedArrayObtainStyledAttributes2.getDrawable(androidx.recyclerview.R.styleable.RecyclerView_fastScrollVerticalTrackDrawable), (StateListDrawable) typedArrayObtainStyledAttributes2.getDrawable(androidx.recyclerview.R.styleable.RecyclerView_fastScrollHorizontalThumbDrawable), typedArrayObtainStyledAttributes2.getDrawable(androidx.recyclerview.R.styleable.RecyclerView_fastScrollHorizontalTrackDrawable));
            }
            typedArrayObtainStyledAttributes2.recycle();
            recyclerView = this;
            recyclerView.createLayoutManager(context, string, attributeSet, i10, 0);
            TypedArray typedArrayObtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, NESTED_SCROLLING_ATTRS, i10, 0);
            z10 = typedArrayObtainStyledAttributes3.getBoolean(0, true);
            typedArrayObtainStyledAttributes3.recycle();
        } else {
            recyclerView = this;
            recyclerView.setDescendantFocusability(262144);
        }
        recyclerView.setNestedScrollingEnabled(z10);
    }

    public boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2, int i12) {
        return getScrollingChildHelper().c(i10, i11, iArr, iArr2, i12);
    }

    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr, int i14) {
        return getScrollingChildHelper().d(i10, i11, i12, i13, iArr, i14, null);
    }

    public boolean hasNestedScrollingParent(int i10) {
        return getScrollingChildHelper().f(i10);
    }

    public boolean startNestedScroll(int i10, int i11) {
        return getScrollingChildHelper().g(i10, i11);
    }

    public void stopNestedScroll(int i10) {
        getScrollingChildHelper().h(i10);
    }

    public void addItemDecoration(@NonNull o0 o0Var) {
        addItemDecoration(o0Var, -1);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        r0 r0Var = this.mLayout;
        if (r0Var != null) {
            return r0Var.t(layoutParams);
        }
        throw new IllegalStateException(defpackage.e.k(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    public void onChildAttachedToWindow(@NonNull View view) {
    }

    public void onChildDetachedFromWindow(@NonNull View view) {
    }

    public void onScrollStateChanged(int i10) {
    }

    public void setOnFlingListener(@Nullable u0 u0Var) {
    }

    public void setRecyclerListener(@Nullable z0 z0Var) {
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static abstract class OnScrollListener {
        public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i10) {
        }

        public void onScrolled(@NonNull RecyclerView recyclerView, int i10, int i11) {
        }
    }

    public void onScrolled(int i10, int i11) {
    }
}
