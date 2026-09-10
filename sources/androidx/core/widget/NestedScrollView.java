package androidx.core.widget;

import am.e;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.InputDevice;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import com.google.android.gms.internal.ads.n3;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import m0.b0;
import m0.c0;
import m0.d0;
import m0.e0;
import m0.f0;
import m0.h;
import m0.s;
import m0.s0;
import m0.u;
import o0.a;
import p0.b;
import p0.d;
import p0.f;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements u, c0 {
    public static final float C = (float) (Math.log(0.78d) / Math.log(0.9d));
    public static final d D = new d();
    public static final int[] E = {R.attr.fillViewport};
    public float A;
    public final h B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f4025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f4026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f4027c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final OverScroller f4028d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final EdgeEffect f4029e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final EdgeEffect f4030f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public b0 f4031g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f4032h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f4033i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f4034j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public View f4035k;
    public boolean l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public VelocityTracker f4036m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f4037n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f4038o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f4039p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f4040q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f4041r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f4042s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int[] f4043t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int[] f4044u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f4045v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f4046w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public f f4047x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final n3 f4048y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final s f4049z;

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.storage.androidcleaner.R.attr.nestedScrollViewStyle);
        this.f4027c = new Rect();
        this.f4033i = true;
        this.f4034j = false;
        this.f4035k = null;
        this.l = false;
        this.f4038o = true;
        this.f4042s = -1;
        this.f4043t = new int[2];
        this.f4044u = new int[2];
        this.B = new h(getContext(), new e(this, 28));
        int i10 = Build.VERSION.SDK_INT;
        this.f4029e = i10 >= 31 ? b.a(context, attributeSet) : new EdgeEffect(context);
        this.f4030f = i10 >= 31 ? b.a(context, attributeSet) : new EdgeEffect(context);
        this.f4025a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.f4028d = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f4039p = viewConfiguration.getScaledTouchSlop();
        this.f4040q = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f4041r = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, E, com.storage.androidcleaner.R.attr.nestedScrollViewStyle, 0);
        setFillViewport(typedArrayObtainStyledAttributes.getBoolean(0, false));
        typedArrayObtainStyledAttributes.recycle();
        this.f4048y = new n3();
        this.f4049z = new s(this);
        setNestedScrollingEnabled(true);
        s0.f(this, D);
    }

    private b0 getScrollFeedbackProvider() {
        if (this.f4031g == null) {
            this.f4031g = new b0(this);
        }
        return this.f4031g;
    }

    public static boolean m(View view, NestedScrollView nestedScrollView) {
        if (view == nestedScrollView) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && m((View) parent, nestedScrollView);
    }

    @Override // m0.t
    public final void a(View view, View view2, int i10, int i11) {
        n3 n3Var = this.f4048y;
        if (i11 == 1) {
            n3Var.f17625b = i10;
        } else {
            n3Var.f17624a = i10;
        }
        w(2, i11);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // m0.t
    public final void b(View view, int i10) {
        n3 n3Var = this.f4048y;
        if (i10 == 1) {
            n3Var.f17625b = 0;
        } else {
            n3Var.f17624a = 0;
        }
        y(i10);
    }

    @Override // m0.t
    public final void c(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14) {
        o(i13, i14, null);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0083  */
    /* JADX WARN: Code duplicated, block: B:23:0x0092  */
    /* JADX WARN: Code duplicated, block: B:24:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:26:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:30:0x00c5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:33:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:34:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:36:0x00de  */
    /* JADX WARN: Code duplicated, block: B:40:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:42:0x00fc  */
    @Override // android.view.View
    public final void computeScroll() {
        int iRound;
        int[] iArr;
        int i10;
        int scrollRange;
        int i11;
        int overScrollMode;
        if (this.f4028d.isFinished()) {
            return;
        }
        this.f4028d.computeScrollOffset();
        int currY = this.f4028d.getCurrY();
        int i12 = currY - this.f4046w;
        int height = getHeight();
        EdgeEffect edgeEffect = this.f4029e;
        EdgeEffect edgeEffect2 = this.f4030f;
        if (i12 <= 0 || r9.b.l(edgeEffect) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            if (i12 < 0 && r9.b.l(edgeEffect2) != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                float f10 = height;
                iRound = Math.round(r9.b.w(edgeEffect2, (i12 * 4.0f) / f10, 0.5f) * (f10 / 4.0f));
                if (iRound != i12) {
                    edgeEffect2.finish();
                }
            }
            this.f4046w = currY;
            iArr = this.f4044u;
            iArr[1] = 0;
            i(0, i12, iArr, null, 1);
            i10 = i12 - iArr[1];
            scrollRange = getScrollRange();
            if (Build.VERSION.SDK_INT >= 35) {
                a.a(this, Math.abs(this.f4028d.getCurrVelocity()));
            }
            if (i10 != 0) {
                int scrollY = getScrollY();
                q(i10, getScrollX(), scrollY, scrollRange);
                int scrollY2 = getScrollY() - scrollY;
                int i13 = i10 - scrollY2;
                iArr[1] = 0;
                i11 = 1;
                this.f4049z.d(0, scrollY2, 0, i13, this.f4043t, 1, iArr);
                i10 = i13 - iArr[1];
            } else {
                i11 = 1;
            }
            if (i10 != 0) {
                overScrollMode = getOverScrollMode();
                if (overScrollMode != 0 || (overScrollMode == i11 && scrollRange > 0)) {
                    if (i10 < 0) {
                        if (edgeEffect.isFinished()) {
                            edgeEffect.onAbsorb((int) this.f4028d.getCurrVelocity());
                        }
                    } else if (edgeEffect2.isFinished()) {
                        edgeEffect2.onAbsorb((int) this.f4028d.getCurrVelocity());
                    }
                }
                this.f4028d.abortAnimation();
                y(i11);
            }
            if (this.f4028d.isFinished()) {
                y(i11);
            } else {
                postInvalidateOnAnimation();
            }
        }
        iRound = Math.round(r9.b.w(edgeEffect, ((-i12) * 4.0f) / height, 0.5f) * ((-height) / 4.0f));
        if (iRound != i12) {
            edgeEffect.finish();
        }
        i12 -= iRound;
        this.f4046w = currY;
        iArr = this.f4044u;
        iArr[1] = 0;
        i(0, i12, iArr, null, 1);
        i10 = i12 - iArr[1];
        scrollRange = getScrollRange();
        if (Build.VERSION.SDK_INT >= 35) {
            a.a(this, Math.abs(this.f4028d.getCurrVelocity()));
        }
        if (i10 != 0) {
            int scrollY3 = getScrollY();
            q(i10, getScrollX(), scrollY3, scrollRange);
            int scrollY4 = getScrollY() - scrollY3;
            int i14 = i10 - scrollY4;
            iArr[1] = 0;
            i11 = 1;
            this.f4049z.d(0, scrollY4, 0, i14, this.f4043t, 1, iArr);
            i10 = i14 - iArr[1];
        } else {
            i11 = 1;
        }
        if (i10 != 0) {
            overScrollMode = getOverScrollMode();
            if (overScrollMode != 0) {
                if (i10 < 0) {
                    if (edgeEffect.isFinished()) {
                        edgeEffect.onAbsorb((int) this.f4028d.getCurrVelocity());
                    }
                } else if (edgeEffect2.isFinished()) {
                    edgeEffect2.onAbsorb((int) this.f4028d.getCurrVelocity());
                }
            } else if (i10 < 0) {
                if (edgeEffect.isFinished()) {
                    edgeEffect.onAbsorb((int) this.f4028d.getCurrVelocity());
                }
            } else if (edgeEffect2.isFinished()) {
                edgeEffect2.onAbsorb((int) this.f4028d.getCurrVelocity());
            }
            this.f4028d.abortAnimation();
            y(i11);
        }
        if (this.f4028d.isFinished()) {
            postInvalidateOnAnimation();
        } else {
            y(i11);
        }
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int iMax = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        return scrollY > iMax ? (scrollY - iMax) + bottom : bottom;
    }

    @Override // m0.u
    public final void d(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        o(i13, i14, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || j(keyEvent);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return this.f4049z.a(f10, f11, z10);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f10, float f11) {
        return this.f4049z.b(f10, f11);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return this.f4049z.c(i10, i11, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return this.f4049z.d(i10, i11, i12, i13, iArr, 0, null);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.f4029e;
        int paddingLeft2 = 0;
        if (!edgeEffect.isFinished()) {
            int iSave = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int iMin = Math.min(0, scrollY);
            if (getClipToPadding()) {
                width -= getPaddingRight() + getPaddingLeft();
                paddingLeft = getPaddingLeft();
                height -= getPaddingBottom() + getPaddingTop();
                iMin += getPaddingTop();
            } else {
                paddingLeft = 0;
            }
            canvas.translate(paddingLeft, iMin);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect2 = this.f4030f;
        if (edgeEffect2.isFinished()) {
            return;
        }
        int iSave2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int iMax = Math.max(getScrollRange(), scrollY) + height2;
        if (getClipToPadding()) {
            width2 -= getPaddingRight() + getPaddingLeft();
            paddingLeft2 = getPaddingLeft();
        }
        if (getClipToPadding()) {
            height2 -= getPaddingBottom() + getPaddingTop();
            iMax -= getPaddingBottom();
        }
        canvas.translate(paddingLeft2 - width2, iMax);
        canvas.rotate(180.0f, width2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        edgeEffect2.setSize(width2, height2);
        if (edgeEffect2.draw(canvas)) {
            postInvalidateOnAnimation();
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // m0.t
    public final boolean e(View view, View view2, int i10, int i11) {
        return (i10 & 2) != 0;
    }

    @Override // m0.t
    public final void f(int[] iArr, int i10, int i11, int i12) {
        i(i10, i11, iArr, null, i12);
    }

    public final boolean g(int i10) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View view = viewFindFocus;
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, view, i10);
        int maxScrollAmount = getMaxScrollAmount();
        if (viewFindNextFocus == null || !n(viewFindNextFocus, maxScrollAmount, getHeight())) {
            if (i10 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i10 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i10 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            t(maxScrollAmount, -1, null, 0, 1, true);
        } else {
            Rect rect = this.f4027c;
            viewFindNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(viewFindNextFocus, rect);
            t(h(rect), -1, null, 0, 1, true);
            viewFindNextFocus.requestFocus(i10);
        }
        if (view != null && view.isFocused() && !n(view, 0, getHeight())) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        n3 n3Var = this.f4048y;
        return n3Var.f17625b | n3Var.f17624a;
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public float getVerticalScrollFactorCompat() {
        if (this.A == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.A = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.A;
    }

    public final int h(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i10 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i11 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i10 - verticalFadingEdgeLength : i10;
        int i12 = rect.bottom;
        if (i12 > i11 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i11, (childAt.getBottom() + layoutParams.bottomMargin) - i10);
        }
        if (rect.top >= scrollY || i12 >= i11) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i11 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.f4049z.f(0);
    }

    public final boolean i(int i10, int i11, int[] iArr, int[] iArr2, int i12) {
        return this.f4049z.c(i10, i11, iArr, null, i12);
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f4049z.f45744d;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0098  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ab  */
    public final boolean j(KeyEvent keyEvent) {
        View viewFindFocus;
        View viewFindNextFocus;
        this.f4027c.setEmpty();
        int childCount = getChildCount();
        int i10 = TsExtractor.TS_STREAM_TYPE_HDMV_DTS;
        if (childCount > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                if (keyEvent.getAction() == 0) {
                    int keyCode = keyEvent.getKeyCode();
                    if (keyCode == 19) {
                        return keyEvent.isAltPressed() ? l(33) : g(33);
                    }
                    if (keyCode == 20) {
                        return keyEvent.isAltPressed() ? l(TsExtractor.TS_STREAM_TYPE_HDMV_DTS) : g(TsExtractor.TS_STREAM_TYPE_HDMV_DTS);
                    }
                    if (keyCode == 62) {
                        if (keyEvent.isShiftPressed()) {
                            i10 = 33;
                        }
                        r(i10);
                        return false;
                    }
                    if (keyCode == 92) {
                        return l(33);
                    }
                    if (keyCode == 93) {
                        return l(TsExtractor.TS_STREAM_TYPE_HDMV_DTS);
                    }
                    if (keyCode == 122) {
                        r(33);
                        return false;
                    }
                    if (keyCode == 123) {
                        r(TsExtractor.TS_STREAM_TYPE_HDMV_DTS);
                        return false;
                    }
                }
            } else if (isFocused() && keyEvent.getKeyCode() != 4) {
                viewFindFocus = findFocus();
                if (viewFindFocus == this) {
                    viewFindFocus = null;
                }
                viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, TsExtractor.TS_STREAM_TYPE_HDMV_DTS);
                if (viewFindNextFocus == null && viewFindNextFocus != this && viewFindNextFocus.requestFocus(TsExtractor.TS_STREAM_TYPE_HDMV_DTS)) {
                    return true;
                }
            }
        } else if (isFocused()) {
            viewFindFocus = findFocus();
            if (viewFindFocus == this) {
                viewFindFocus = null;
            }
            viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, TsExtractor.TS_STREAM_TYPE_HDMV_DTS);
            if (viewFindNextFocus == null) {
            }
        }
        return false;
    }

    public final void k(int i10) {
        if (getChildCount() > 0) {
            this.f4028d.fling(getScrollX(), getScrollY(), 0, i10, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            w(2, 1);
            this.f4046w = getScrollY();
            postInvalidateOnAnimation();
            if (Build.VERSION.SDK_INT >= 35) {
                a.a(this, Math.abs(this.f4028d.getCurrVelocity()));
            }
        }
    }

    public final boolean l(int i10) {
        int childCount;
        boolean z10 = i10 == 130;
        int height = getHeight();
        Rect rect = this.f4027c;
        rect.top = 0;
        rect.bottom = height;
        if (z10 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.bottom = paddingBottom;
            rect.top = paddingBottom - height;
        }
        return s(i10, rect.top, rect.bottom);
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View view, int i10, int i11) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public final boolean n(View view, int i10, int i11) {
        Rect rect = this.f4027c;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return rect.bottom + i10 >= getScrollY() && rect.top - i10 <= getScrollY() + i11;
    }

    public final void o(int i10, int i11, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i10);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f4049z.d(0, scrollY2, 0, i10 - scrollY2, null, i11, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f4034j = false;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:49:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:70:0x0128  */
    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f10;
        int i10;
        int width;
        boolean z10;
        int i11;
        int scaledMinimumFlingVelocity;
        int scaledMaximumFlingVelocity;
        boolean z11;
        int[] iArr;
        float yVelocity;
        float f11;
        long j10;
        float fSqrt;
        int i12;
        if (motionEvent.getAction() != 8 || this.l) {
            return false;
        }
        if ((motionEvent.getSource() & 2) == 2) {
            float axisValue = motionEvent.getAxisValue(9);
            width = (int) motionEvent.getX();
            i10 = 9;
            f10 = axisValue;
        } else if ((motionEvent.getSource() & 4194304) == 4194304) {
            float axisValue2 = motionEvent.getAxisValue(26);
            width = getWidth() / 2;
            f10 = axisValue2;
            i10 = 26;
        } else {
            f10 = 0.0f;
            i10 = 0;
            width = 0;
        }
        if (f10 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return false;
        }
        t(-((int) (getVerticalScrollFactorCompat() * f10)), i10, motionEvent, width, 1, (motionEvent.getSource() & 8194) == 8194);
        if (i10 != 0) {
            h hVar = this.B;
            NestedScrollView nestedScrollView = (NestedScrollView) hVar.f45706b.f3698b;
            int[] iArr2 = hVar.f45712h;
            int source = motionEvent.getSource();
            int deviceId = motionEvent.getDeviceId();
            if (hVar.f45710f == source && hVar.f45711g == deviceId && hVar.f45709e == i10) {
                z11 = false;
                z10 = true;
                i11 = 0;
            } else {
                Context context = hVar.f45705a;
                z10 = true;
                ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
                int deviceId2 = motionEvent.getDeviceId();
                int source2 = motionEvent.getSource();
                i11 = 0;
                int i13 = Build.VERSION.SDK_INT;
                if (i13 >= 34) {
                    scaledMinimumFlingVelocity = d0.f(viewConfiguration, deviceId2, i10, source2);
                } else {
                    InputDevice device = InputDevice.getDevice(deviceId2);
                    if (device == null || device.getMotionRange(i10, source2) == null) {
                        scaledMinimumFlingVelocity = Integer.MAX_VALUE;
                    } else {
                        Resources resources = context.getResources();
                        int identifier = (source2 == 4194304 && i10 == 26) ? resources.getIdentifier("config_viewMinRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                        Objects.requireNonNull(viewConfiguration);
                        if (identifier == -1) {
                            scaledMinimumFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
                        } else if (identifier == 0 || (scaledMinimumFlingVelocity = resources.getDimensionPixelSize(identifier)) < 0) {
                            scaledMinimumFlingVelocity = Integer.MAX_VALUE;
                        }
                    }
                }
                iArr2[0] = scaledMinimumFlingVelocity;
                int deviceId3 = motionEvent.getDeviceId();
                int source3 = motionEvent.getSource();
                if (i13 >= 34) {
                    scaledMaximumFlingVelocity = d0.e(viewConfiguration, deviceId3, i10, source3);
                } else {
                    InputDevice device2 = InputDevice.getDevice(deviceId3);
                    if (device2 == null || device2.getMotionRange(i10, source3) == null) {
                        scaledMaximumFlingVelocity = Integer.MIN_VALUE;
                    } else {
                        Resources resources2 = context.getResources();
                        int identifier2 = (source3 == 4194304 && i10 == 26) ? resources2.getIdentifier("config_viewMaxRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                        Objects.requireNonNull(viewConfiguration);
                        if (identifier2 == -1) {
                            scaledMaximumFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
                        } else if (identifier2 == 0 || (scaledMaximumFlingVelocity = resources2.getDimensionPixelSize(identifier2)) < 0) {
                            scaledMaximumFlingVelocity = Integer.MIN_VALUE;
                        }
                    }
                }
                iArr2[1] = scaledMaximumFlingVelocity;
                hVar.f45710f = source;
                hVar.f45711g = deviceId;
                hVar.f45709e = i10;
                z11 = true;
            }
            if (iArr2[i11] == Integer.MAX_VALUE) {
                VelocityTracker velocityTracker = hVar.f45707c;
                if (velocityTracker == null) {
                    return z10;
                }
                velocityTracker.recycle();
                hVar.f45707c = null;
                return z10;
            }
            if (hVar.f45707c == null) {
                hVar.f45707c = VelocityTracker.obtain();
            }
            VelocityTracker velocityTracker2 = hVar.f45707c;
            Map map = e0.f45690a;
            velocityTracker2.addMovement(motionEvent);
            int i14 = 20;
            if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
                Map map2 = e0.f45690a;
                if (!map2.containsKey(velocityTracker2)) {
                    map2.put(velocityTracker2, new f0());
                }
                f0 f0Var = (f0) map2.get(velocityTracker2);
                long[] jArr = f0Var.f45692b;
                long eventTime = motionEvent.getEventTime();
                if (f0Var.f45694d != 0 && eventTime - jArr[f0Var.f45695e] > 40) {
                    f0Var.f45694d = i11;
                    f0Var.f45693c = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                }
                int i15 = (f0Var.f45695e + 1) % 20;
                f0Var.f45695e = i15;
                int i16 = f0Var.f45694d;
                if (i16 != 20) {
                    f0Var.f45694d = i16 + 1;
                }
                f0Var.f45691a[i15] = motionEvent.getAxisValue(26);
                jArr[f0Var.f45695e] = eventTime;
            }
            velocityTracker2.computeCurrentVelocity(1000, Float.MAX_VALUE);
            f0 f0Var2 = (f0) e0.f45690a.get(velocityTracker2);
            if (f0Var2 != null) {
                float[] fArr = f0Var2.f45691a;
                long[] jArr2 = f0Var2.f45692b;
                int i17 = f0Var2.f45694d;
                if (i17 < 2) {
                    iArr = iArr2;
                    i12 = 1000;
                    fSqrt = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                } else {
                    int i18 = f0Var2.f45695e;
                    int i19 = ((i18 + 20) - (i17 - 1)) % 20;
                    long j11 = jArr2[i18];
                    while (true) {
                        j10 = jArr2[i19];
                        if (j11 - j10 <= 100) {
                            break;
                        }
                        f0Var2.f45694d--;
                        i19 = (i19 + 1) % 20;
                    }
                    int i20 = f0Var2.f45694d;
                    if (i20 < 2) {
                        iArr = iArr2;
                        i12 = 1000;
                        fSqrt = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    } else if (i20 == 2) {
                        int i21 = (i19 + 1) % 20;
                        long j12 = jArr2[i21];
                        if (j10 == j12) {
                            iArr = iArr2;
                            i12 = 1000;
                            fSqrt = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        } else {
                            iArr = iArr2;
                            i12 = 1000;
                            fSqrt = fArr[i21] / (j12 - j10);
                        }
                    } else {
                        float f12 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        int i22 = 0;
                        int i23 = 0;
                        while (true) {
                            if (i22 >= f0Var2.f45694d - 1) {
                                break;
                            }
                            int i24 = i22 + i19;
                            long j13 = jArr2[i24 % 20];
                            int i25 = (i24 + 1) % i14;
                            if (jArr2[i25] != j13) {
                                i23++;
                                float fSqrt2 = (f12 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(f12) * 2.0f));
                                float f13 = fArr[i25] / (jArr2[i25] - j13);
                                float fAbs = (Math.abs(f13) * (f13 - fSqrt2)) + f12;
                                if (i23 == z10) {
                                    fAbs *= 0.5f;
                                }
                                f12 = fAbs;
                            }
                            i22++;
                            iArr2 = iArr2;
                            i14 = 20;
                            z10 = true;
                        }
                        iArr = iArr2;
                        fSqrt = ((float) Math.sqrt(Math.abs(f12) * 2.0f)) * (f12 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? -1.0f : 1.0f);
                        i12 = 1000;
                    }
                }
                float f14 = fSqrt * i12;
                f0Var2.f45693c = f14;
                if (f14 < (-Math.abs((float) r6))) {
                    f0Var2.f45693c = -Math.abs(Float.MAX_VALUE);
                } else if (f0Var2.f45693c > Math.abs((float) r6)) {
                    f0Var2.f45693c = Math.abs((float) r6);
                }
            } else {
                iArr = iArr2;
            }
            if (Build.VERSION.SDK_INT >= 34) {
                yVelocity = d0.b(velocityTracker2, i10);
            } else if (i10 == 0) {
                yVelocity = velocityTracker2.getXVelocity();
            } else if (i10 == 1) {
                yVelocity = velocityTracker2.getYVelocity();
            } else {
                f0 f0Var3 = (f0) e0.f45690a.get(velocityTracker2);
                yVelocity = (f0Var3 == null || i10 != 26) ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : f0Var3.f45693c;
            }
            float f15 = yVelocity * (-nestedScrollView.getVerticalScrollFactorCompat());
            float fSignum = Math.signum(f15);
            if (z11 || (fSignum != Math.signum(hVar.f45708d) && fSignum != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) {
                nestedScrollView.f4028d.abortAnimation();
            }
            if (Math.abs(f15) >= iArr[0]) {
                int i26 = iArr[1];
                float fMax = Math.max(-i26, Math.min(f15, i26));
                if (fMax == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    f11 = 0.0f;
                } else {
                    nestedScrollView.f4028d.abortAnimation();
                    nestedScrollView.k((int) fMax);
                    f11 = fMax;
                }
                hVar.f45708d = f11;
                return true;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0083  */
    /* JADX WARN: Code duplicated, block: B:36:0x008b  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:62:0x0117  */
    /* JADX WARN: Code duplicated, block: B:70:0x012d  */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        VelocityTracker velocityTracker2;
        int action = motionEvent.getAction();
        boolean z10 = true;
        if (action == 2 && this.l) {
            return true;
        }
        int i10 = action & 255;
        if (i10 == 0) {
            int y10 = (int) motionEvent.getY();
            int x10 = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y10 < childAt.getTop() - scrollY || y10 >= childAt.getBottom() - scrollY || x10 < childAt.getLeft() || x10 >= childAt.getRight()) {
                    if (!x(motionEvent) && this.f4028d.isFinished()) {
                        z10 = false;
                    }
                    this.l = z10;
                    velocityTracker = this.f4036m;
                    if (velocityTracker != null) {
                        velocityTracker.recycle();
                        this.f4036m = null;
                    }
                } else {
                    this.f4032h = y10;
                    this.f4042s = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker3 = this.f4036m;
                    if (velocityTracker3 == null) {
                        this.f4036m = VelocityTracker.obtain();
                    } else {
                        velocityTracker3.clear();
                    }
                    this.f4036m.addMovement(motionEvent);
                    this.f4028d.computeScrollOffset();
                    if (!x(motionEvent) && this.f4028d.isFinished()) {
                        z10 = false;
                    }
                    this.l = z10;
                    w(2, 0);
                }
            } else {
                if (!x(motionEvent)) {
                    z10 = false;
                }
                this.l = z10;
                velocityTracker = this.f4036m;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.f4036m = null;
                }
            }
        } else if (i10 == 1) {
            this.l = false;
            this.f4042s = -1;
            velocityTracker2 = this.f4036m;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.f4036m = null;
            }
            if (this.f4028d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            y(0);
        } else if (i10 == 2) {
            int i11 = this.f4042s;
            if (i11 != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i11);
                if (iFindPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + i11 + " in onInterceptTouchEvent");
                } else {
                    int y11 = (int) motionEvent.getY(iFindPointerIndex);
                    if (Math.abs(y11 - this.f4032h) > this.f4039p && (2 & getNestedScrollAxes()) == 0) {
                        this.l = true;
                        this.f4032h = y11;
                        if (this.f4036m == null) {
                            this.f4036m = VelocityTracker.obtain();
                        }
                        this.f4036m.addMovement(motionEvent);
                        this.f4045v = 0;
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                }
            }
        } else if (i10 == 3) {
            this.l = false;
            this.f4042s = -1;
            velocityTracker2 = this.f4036m;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.f4036m = null;
            }
            if (this.f4028d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            y(0);
        } else if (i10 == 6) {
            p(motionEvent);
        }
        return this.l;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int measuredHeight;
        super.onLayout(z10, i10, i11, i12, i13);
        int i14 = 0;
        this.f4033i = false;
        View view = this.f4035k;
        if (view != null && m(view, this)) {
            View view2 = this.f4035k;
            Rect rect = this.f4027c;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iH = h(rect);
            if (iH != 0) {
                scrollBy(0, iH);
            }
        }
        this.f4035k = null;
        if (!this.f4034j) {
            if (this.f4047x != null) {
                scrollTo(getScrollX(), this.f4047x.f47904a);
                this.f4047x = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                measuredHeight = 0;
            }
            int paddingTop = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < measuredHeight && scrollY >= 0) {
                i14 = paddingTop + scrollY > measuredHeight ? measuredHeight - paddingTop : scrollY;
            }
            if (i14 != scrollY) {
                scrollTo(getScrollX(), i14);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f4034j = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f4037n && View.MeasureSpec.getMode(i11) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        if (z10) {
            return false;
        }
        dispatchNestedFling(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f11, true);
        k((int) f11);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f10, float f11) {
        return this.f4049z.b(f10, f11);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        i(i10, i11, iArr, null, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        o(i13, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        a(view, view2, i10, 0);
    }

    @Override // android.view.View
    public final void onOverScrolled(int i10, int i11, boolean z10, boolean z11) {
        super.scrollTo(i10, i11);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i10, Rect rect) {
        if (i10 == 2) {
            i10 = TsExtractor.TS_STREAM_TYPE_HDMV_DTS;
        } else if (i10 == 1) {
            i10 = 33;
        }
        View viewFindNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i10) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i10);
        if (viewFindNextFocus != null && n(viewFindNextFocus, 0, getHeight())) {
            return viewFindNextFocus.requestFocus(i10, rect);
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof f)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        f fVar = (f) parcelable;
        super.onRestoreInstanceState(fVar.getSuperState());
        this.f4047x = fVar;
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        f fVar = new f(super.onSaveInstanceState());
        fVar.f47904a = getScrollY();
        return fVar;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        View viewFindFocus = findFocus();
        if (viewFindFocus == null || this == viewFindFocus || !n(viewFindFocus, 0, i13)) {
            return;
        }
        Rect rect = this.f4027c;
        viewFindFocus.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(viewFindFocus, rect);
        int iH = h(rect);
        if (iH != 0) {
            if (this.f4038o) {
                v(0, iH, false);
            } else {
                scrollBy(0, iH);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        return e(view, view2, i10, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        b(view, 0);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x011d  */
    /* JADX WARN: Code duplicated, block: B:56:0x0133  */
    /* JADX WARN: Code duplicated, block: B:59:0x013a  */
    /* JADX WARN: Code duplicated, block: B:60:0x013e  */
    /* JADX WARN: Code duplicated, block: B:63:0x0145  */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        float fW;
        int iRound;
        int i10;
        ViewParent parent2;
        if (this.f4036m == null) {
            this.f4036m = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f4045v = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        float f10 = this.f4045v;
        float f11 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        motionEventObtain.offsetLocation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f10);
        if (actionMasked != 0) {
            EdgeEffect edgeEffect = this.f4029e;
            EdgeEffect edgeEffect2 = this.f4030f;
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f4036m;
                velocityTracker.computeCurrentVelocity(1000, this.f4041r);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f4042s);
                if (Math.abs(yVelocity) >= this.f4040q) {
                    if (r9.b.l(edgeEffect) != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        if (u(edgeEffect, yVelocity)) {
                            edgeEffect.onAbsorb(yVelocity);
                        } else {
                            k(-yVelocity);
                        }
                    } else if (r9.b.l(edgeEffect2) != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        int i11 = -yVelocity;
                        if (u(edgeEffect2, i11)) {
                            edgeEffect2.onAbsorb(i11);
                        } else {
                            k(i11);
                        }
                    } else {
                        int i12 = -yVelocity;
                        float f12 = i12;
                        if (!this.f4049z.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f12)) {
                            dispatchNestedFling(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f12, true);
                            k(i12);
                        }
                    }
                } else if (this.f4028d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.f4042s = -1;
                this.l = false;
                VelocityTracker velocityTracker2 = this.f4036m;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f4036m = null;
                }
                y(0);
                edgeEffect.onRelease();
                edgeEffect2.onRelease();
            } else if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f4042s);
                if (iFindPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.f4042s + " in onTouchEvent");
                } else {
                    int y10 = (int) motionEvent.getY(iFindPointerIndex);
                    int i13 = this.f4032h - y10;
                    float x10 = motionEvent.getX(iFindPointerIndex) / getWidth();
                    float height = i13 / getHeight();
                    if (r9.b.l(edgeEffect) != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        fW = -r9.b.w(edgeEffect, -height, x10);
                        if (r9.b.l(edgeEffect) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            edgeEffect.onRelease();
                        }
                    } else if (r9.b.l(edgeEffect2) != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        fW = r9.b.w(edgeEffect2, height, 1.0f - x10);
                        if (r9.b.l(edgeEffect2) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            edgeEffect2.onRelease();
                        }
                    } else {
                        iRound = Math.round(f11 * getHeight());
                        if (iRound != 0) {
                            invalidate();
                        }
                        i10 = i13 - iRound;
                        if (!this.l && Math.abs(i10) > this.f4039p) {
                            parent2 = getParent();
                            if (parent2 != null) {
                                parent2.requestDisallowInterceptTouchEvent(true);
                            }
                            this.l = true;
                            if (i10 > 0) {
                                i10 -= this.f4039p;
                            } else {
                                i10 += this.f4039p;
                            }
                        }
                        if (this.l) {
                            int iT = t(i10, 1, motionEvent, (int) motionEvent.getX(iFindPointerIndex), 0, false);
                            this.f4032h = y10 - iT;
                            this.f4045v += iT;
                        }
                    }
                    f11 = fW;
                    iRound = Math.round(f11 * getHeight());
                    if (iRound != 0) {
                        invalidate();
                    }
                    i10 = i13 - iRound;
                    if (!this.l) {
                        parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.l = true;
                        if (i10 > 0) {
                            i10 -= this.f4039p;
                        } else {
                            i10 += this.f4039p;
                        }
                    }
                    if (this.l) {
                        int iT2 = t(i10, 1, motionEvent, (int) motionEvent.getX(iFindPointerIndex), 0, false);
                        this.f4032h = y10 - iT2;
                        this.f4045v += iT2;
                    }
                }
            } else if (actionMasked == 3) {
                if (this.l && getChildCount() > 0) {
                    if (this.f4028d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                        postInvalidateOnAnimation();
                    }
                }
                this.f4042s = -1;
                this.l = false;
                VelocityTracker velocityTracker3 = this.f4036m;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f4036m = null;
                }
                y(0);
                edgeEffect.onRelease();
                edgeEffect2.onRelease();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f4032h = (int) motionEvent.getY(actionIndex);
                this.f4042s = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                p(motionEvent);
                this.f4032h = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f4042s));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.l && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f4028d.isFinished()) {
                this.f4028d.abortAnimation();
                y(1);
            }
            int y11 = (int) motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            this.f4032h = y11;
            this.f4042s = pointerId;
            w(2, 0);
        }
        VelocityTracker velocityTracker4 = this.f4036m;
        if (velocityTracker4 != null) {
            velocityTracker4.addMovement(motionEventObtain);
        }
        motionEventObtain.recycle();
        return true;
    }

    public final void p(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f4042s) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.f4032h = (int) motionEvent.getY(i10);
            this.f4042s = motionEvent.getPointerId(i10);
            VelocityTracker velocityTracker = this.f4036m;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public final boolean q(int i10, int i11, int i12, int i13) {
        int i14;
        boolean z10;
        int i15;
        boolean z11;
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int i16 = i12 + i10;
        if (i11 <= 0 && i11 >= 0) {
            i14 = i11;
            z10 = false;
        } else {
            i14 = 0;
            z10 = true;
        }
        if (i16 <= i13) {
            if (i16 < 0) {
                i15 = 0;
            } else {
                i15 = i16;
                z11 = false;
            }
            if (z11 && !this.f4049z.f(1)) {
                this.f4028d.springBack(i14, i15, 0, 0, 0, getScrollRange());
            }
            super.scrollTo(i14, i15);
            return !z10 || z11;
        }
        i15 = i13;
        z11 = true;
        if (z11) {
            this.f4028d.springBack(i14, i15, 0, 0, 0, getScrollRange());
        }
        super.scrollTo(i14, i15);
        if (z10) {
        }
    }

    public final void r(int i10) {
        boolean z10 = i10 == 130;
        int height = getHeight();
        Rect rect = this.f4027c;
        if (z10) {
            rect.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
                if (rect.top + height > paddingBottom) {
                    rect.top = paddingBottom - height;
                }
            }
        } else {
            int scrollY = getScrollY() - height;
            rect.top = scrollY;
            if (scrollY < 0) {
                rect.top = 0;
            }
        }
        int i11 = rect.top;
        int i12 = height + i11;
        rect.bottom = i12;
        s(i10, i11, i12);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (this.f4033i) {
            this.f4035k = view2;
        } else {
            Rect rect = this.f4027c;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iH = h(rect);
            if (iH != 0) {
                scrollBy(0, iH);
            }
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int iH = h(rect);
        boolean z11 = iH != 0;
        if (z11) {
            if (z10) {
                scrollBy(0, iH);
                return z11;
            }
            v(0, iH, false);
        }
        return z11;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        VelocityTracker velocityTracker;
        if (z10 && (velocityTracker = this.f4036m) != null) {
            velocityTracker.recycle();
            this.f4036m = null;
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f4033i = true;
        super.requestLayout();
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0068  */
    public final boolean s(int i10, int i11, int i12) {
        boolean z10;
        int height = getHeight();
        int scrollY = getScrollY();
        int i13 = height + scrollY;
        boolean z11 = i10 == 33;
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z12 = false;
        for (int i14 = 0; i14 < size; i14++) {
            View view2 = focusables.get(i14);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i11 < bottom && top < i12) {
                boolean z13 = i11 < top && bottom < i12;
                if (view == null) {
                    view = view2;
                    z12 = z13;
                } else {
                    boolean z14 = (z11 && top < view.getTop()) || (!z11 && bottom > view.getBottom());
                    if (z12) {
                        if (z13 && z14) {
                            view = view2;
                        }
                    } else if (z13) {
                        view = view2;
                        z12 = true;
                    } else if (z14) {
                        view = view2;
                    }
                }
            }
        }
        View view3 = view == null ? this : view;
        if (i11 < scrollY || i12 > i13) {
            t(z11 ? i11 - scrollY : i12 - i13, -1, null, 0, 1, true);
            z10 = true;
        } else {
            z10 = false;
        }
        if (view3 != findFocus()) {
            view3.requestFocus(i10);
        }
        return z10;
    }

    @Override // android.view.View
    public final void scrollTo(int i10, int i11) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width >= width2 || i10 < 0) {
                i10 = 0;
            } else if (width + i10 > width2) {
                i10 = width2 - width;
            }
            if (height >= height2 || i11 < 0) {
                i11 = 0;
            } else if (height + i11 > height2) {
                i11 = height2 - height;
            }
            if (i10 == getScrollX() && i11 == getScrollY()) {
                return;
            }
            super.scrollTo(i10, i11);
        }
    }

    public void setFillViewport(boolean z10) {
        if (z10 != this.f4037n) {
            this.f4037n = z10;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z10) {
        s sVar = this.f4049z;
        if (sVar.f45744d) {
            ViewGroup viewGroup = sVar.f45743c;
            WeakHashMap weakHashMap = s0.f45746a;
            viewGroup.stopNestedScroll();
        }
        sVar.f45744d = z10;
    }

    public void setSmoothScrollingEnabled(boolean z10) {
        this.f4038o = z10;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i10) {
        return this.f4049z.g(i10, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        y(0);
    }

    /* JADX WARN: Code duplicated, block: B:52:0x0115  */
    /* JADX WARN: Code duplicated, block: B:59:0x0126  */
    public final int t(int i10, int i11, MotionEvent motionEvent, int i12, int i13, boolean z10) {
        int i14;
        int i15;
        boolean z11;
        boolean z12;
        VelocityTracker velocityTracker;
        if (i13 == 1) {
            w(2, i13);
        }
        boolean zC = this.f4049z.c(0, i10, this.f4044u, this.f4043t, i13);
        int[] iArr = this.f4043t;
        int[] iArr2 = this.f4044u;
        if (zC) {
            i14 = i10 - iArr2[1];
            i15 = iArr[1];
        } else {
            i14 = i10;
            i15 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        int overScrollMode = getOverScrollMode();
        boolean z13 = (overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0)) && !z10;
        boolean z14 = q(i14, 0, scrollY, scrollRange) && !this.f4049z.f(i13);
        int scrollY2 = getScrollY() - scrollY;
        if (motionEvent != null && scrollY2 != 0) {
            getScrollFeedbackProvider().f45681a.onScrollProgress(motionEvent.getDeviceId(), motionEvent.getSource(), i11, scrollY2);
        }
        iArr2[1] = 0;
        this.f4049z.d(0, scrollY2, 0, i14 - scrollY2, this.f4043t, i13, iArr2);
        int i16 = i15 + iArr[1];
        int i17 = i14 - iArr2[1];
        int i18 = scrollY + i17;
        EdgeEffect edgeEffect = this.f4030f;
        EdgeEffect edgeEffect2 = this.f4029e;
        if (i18 >= 0) {
            if (i18 > scrollRange && z13) {
                r9.b.w(edgeEffect, i17 / getHeight(), 1.0f - (i12 / getWidth()));
                if (motionEvent != null) {
                    z11 = false;
                    getScrollFeedbackProvider().f45681a.onScrollLimit(motionEvent.getDeviceId(), motionEvent.getSource(), i11, false);
                } else {
                    z11 = false;
                }
                if (!edgeEffect2.isFinished()) {
                    edgeEffect2.onRelease();
                }
            }
            if (edgeEffect2.isFinished() || !edgeEffect.isFinished()) {
                postInvalidateOnAnimation();
                z12 = z11;
            } else {
                z12 = z14;
            }
            if (z12 && i13 == 0 && (velocityTracker = this.f4036m) != null) {
                velocityTracker.clear();
            }
            if (i13 == 1) {
                y(i13);
                edgeEffect2.onRelease();
                edgeEffect.onRelease();
            }
            return i16;
        }
        if (z13) {
            r9.b.w(edgeEffect2, (-i17) / getHeight(), i12 / getWidth());
            if (motionEvent != null) {
                getScrollFeedbackProvider().f45681a.onScrollLimit(motionEvent.getDeviceId(), motionEvent.getSource(), i11, true);
            }
            if (!edgeEffect.isFinished()) {
                edgeEffect.onRelease();
            }
        }
        z11 = false;
        if (edgeEffect2.isFinished()) {
            postInvalidateOnAnimation();
            z12 = z11;
        } else {
            postInvalidateOnAnimation();
            z12 = z11;
        }
        if (z12) {
            velocityTracker.clear();
        }
        if (i13 == 1) {
            y(i13);
            edgeEffect2.onRelease();
            edgeEffect.onRelease();
        }
        return i16;
    }

    public final boolean u(EdgeEffect edgeEffect, int i10) {
        if (i10 > 0) {
            return true;
        }
        float fL = r9.b.l(edgeEffect) * getHeight();
        float fAbs = Math.abs(-i10) * 0.35f;
        float f10 = this.f4025a * 0.015f;
        double dLog = Math.log(fAbs / f10);
        double d10 = C;
        return ((float) (Math.exp((d10 / (d10 - 1.0d)) * dLog) * ((double) f10))) < fL;
    }

    public final void v(int i10, int i11, boolean z10) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f4026b > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int iMax = Math.max(0, Math.min(i11 + scrollY, Math.max(0, height - height2))) - scrollY;
            this.f4028d.startScroll(getScrollX(), scrollY, 0, iMax, 250);
            if (z10) {
                w(2, 1);
            } else {
                y(1);
            }
            this.f4046w = getScrollY();
            postInvalidateOnAnimation();
        } else {
            if (!this.f4028d.isFinished()) {
                this.f4028d.abortAnimation();
                y(1);
            }
            scrollBy(i10, i11);
        }
        this.f4026b = AnimationUtils.currentAnimationTimeMillis();
    }

    public final boolean w(int i10, int i11) {
        return this.f4049z.g(2, i11);
    }

    public final boolean x(MotionEvent motionEvent) {
        boolean z10;
        EdgeEffect edgeEffect = this.f4029e;
        if (r9.b.l(edgeEffect) != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            r9.b.w(edgeEffect, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, motionEvent.getX() / getWidth());
            z10 = true;
        } else {
            z10 = false;
        }
        EdgeEffect edgeEffect2 = this.f4030f;
        if (r9.b.l(edgeEffect2) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return z10;
        }
        r9.b.w(edgeEffect2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    public final void y(int i10) {
        this.f4049z.h(i10);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10) {
        if (getChildCount() <= 0) {
            super.addView(view, i10);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i10, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void setOnScrollChangeListener(p0.e eVar) {
    }
}
