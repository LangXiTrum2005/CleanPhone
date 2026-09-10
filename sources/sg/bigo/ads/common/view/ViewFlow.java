package sg.bigo.ads.common.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import java.util.ArrayList;
import java.util.List;
import sg.bigo.ads.common.p;

/* JADX INFO: loaded from: classes7.dex */
public class ViewFlow extends sg.bigo.ads.common.view.a {
    private static final Interpolator s = new Interpolator() { // from class: sg.bigo.ads.common.view.ViewFlow.1
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    };

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private float f47618A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private float f47619B;
    private int C;
    private VelocityTracker D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private int f47620E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private int f47621F;
    private int G;
    private int H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private boolean f47622I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final Runnable f47623J;
    private int K;
    private boolean L;
    private boolean M;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected int f47624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected int f47625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected int f47626c;
    protected int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected View f47627e;
    protected View f;
    public boolean g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f47628h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected int f47629i;
    protected int j;
    private final a k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f47630l;
    private int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f47631n;
    private d o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private d f47632p;
    private p q;
    private boolean r;
    private Scroller t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f47633u;
    private boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f47634w;
    private int x;
    private float y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private float f47635z;

    public static class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        c f47639a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f47640b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ViewFlow f47641c;

        private a(ViewFlow viewFlow) {
            this.f47640b = 0;
            this.f47641c = viewFlow;
        }

        @Override // sg.bigo.ads.common.view.ViewFlow.c
        public final void a(final int i2) {
            this.f47641c.post(new Runnable() { // from class: sg.bigo.ads.common.view.ViewFlow.a.3
                @Override // java.lang.Runnable
                public final void run() {
                    a aVar = a.this;
                    int i3 = aVar.f47640b;
                    int i4 = i2;
                    if (i3 == i4) {
                        return;
                    }
                    aVar.f47640b = i4;
                    c cVar = aVar.f47639a;
                    if (cVar != null) {
                        cVar.a(i4);
                    }
                }
            });
        }

        public /* synthetic */ a(ViewFlow viewFlow, byte b2) {
            this(viewFlow);
        }

        @Override // sg.bigo.ads.common.view.ViewFlow.c
        public final void a(final int i2, final int i3) {
            this.f47641c.post(new Runnable() { // from class: sg.bigo.ads.common.view.ViewFlow.a.4
                @Override // java.lang.Runnable
                public final void run() {
                    c cVar = a.this.f47639a;
                    if (cVar != null) {
                        cVar.a(i2, i3);
                    }
                }
            });
        }

        @Override // sg.bigo.ads.common.view.ViewFlow.c
        public final void a(final View view, final int i2) {
            this.f47641c.post(new Runnable() { // from class: sg.bigo.ads.common.view.ViewFlow.a.2
                @Override // java.lang.Runnable
                public final void run() {
                    c cVar = a.this.f47639a;
                    if (cVar != null) {
                        cVar.a(view, i2);
                    }
                }
            });
        }

        @Override // sg.bigo.ads.common.view.ViewFlow.c
        public final void a(final View view, final int i2, final float f) {
            this.f47641c.post(new Runnable() { // from class: sg.bigo.ads.common.view.ViewFlow.a.1
                @Override // java.lang.Runnable
                public final void run() {
                    c cVar = a.this.f47639a;
                    if (cVar != null) {
                        cVar.a(view, i2, f);
                    }
                }
            });
        }
    }

    public static class b extends ViewGroup.LayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f47653a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f47654b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f47655c;
        public int d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f47656e;

        public b() {
            this((byte) 0);
        }

        private b(byte b2) {
            super(-1, -1);
            this.f47656e = 17;
        }
    }

    public interface c {
        void a(int i2);

        void a(int i2, int i3);

        void a(View view, int i2);

        void a(View view, int i2, float f);
    }

    public interface d {
        void a();
    }

    public ViewFlow(Context context) {
        this(context, null);
    }

    private static float b(float f) {
        return (float) Math.sin((f - 0.5f) * 0.47123894f);
    }

    private void c(int i2) {
        a(i2, true, -20);
    }

    private boolean f() {
        int i2 = this.f47626c;
        return i2 == 2 || i2 == 3;
    }

    private boolean g() {
        this.C = -1;
        i();
        return true;
    }

    private int getScrollRange() {
        return Math.max(0, this.f47631n - getMeasuredWidth());
    }

    private void h() {
        this.f47628h = false;
        this.v = true;
    }

    private void i() {
        this.v = false;
        this.f47634w = false;
        this.f47628h = false;
        VelocityTracker velocityTracker = this.D;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.D = null;
        }
    }

    private void j() {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    public final int a(View view) {
        if (view == null) {
            return -1;
        }
        List<View> items = getItems();
        for (int i2 = 0; i2 < items.size(); i2++) {
            if (items.get(i2) == view) {
                return i2;
            }
        }
        return -1;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (i2 < 0) {
            View childAt = getChildAt(getChildCount() - 1);
            if (childAt != null && childAt == this.f) {
                i2 = getChildCount() - 1;
            }
        } else {
            View childAt2 = getChildAt(0);
            if (childAt2 != null && childAt2 == this.f47627e) {
                i2++;
            }
        }
        super.addView(view, i2, layoutParams);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof b) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        this.f47633u = true;
        if (this.t.isFinished() || !this.t.computeScrollOffset()) {
            a(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.t.getCurrX();
        int currY = this.t.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
        }
        sg.bigo.ads.common.e.a.a(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean zDispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        this.g = true;
        if (!this.M) {
            onTouchEvent(motionEvent);
        }
        return zDispatchTouchEvent;
    }

    public final boolean e() {
        int measuredWidth = this.f47631n;
        View view = this.f47627e;
        if (view != null) {
            measuredWidth -= view.getRight();
        }
        View view2 = this.f;
        if (view2 != null) {
            measuredWidth -= view2.getMeasuredWidth();
        }
        return getWidth() >= measuredWidth;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new b();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public int getContentMaxWidthSpace() {
        return this.d;
    }

    public int getCurrentItem() {
        return this.f47624a;
    }

    public int getItemCount() {
        return this.f47625b;
    }

    public List<View> getItems() {
        ArrayList arrayList = new ArrayList();
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt != this.f47627e && childAt != this.f) {
                arrayList.add(childAt);
            }
        }
        return arrayList;
    }

    public c getOnItemChangeListener() {
        return this.k.f47639a;
    }

    public int getViewStyle() {
        return this.f47626c;
    }

    @Override // sg.bigo.ads.common.view.a, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f47622I = true;
    }

    @Override // sg.bigo.ads.common.view.a, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.f47623J);
        Scroller scroller = this.t;
        if (scroller != null && !scroller.isFinished()) {
            this.t.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.M = false;
        if (this.r) {
            return false;
        }
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            g();
            return false;
        }
        if (action != 0) {
            if (this.v) {
                return true;
            }
            if (this.f47634w) {
                return false;
            }
        }
        if (action == 0) {
            float x = motionEvent.getX();
            this.f47618A = x;
            this.y = x;
            float y = motionEvent.getY();
            this.f47619B = y;
            this.f47635z = y;
            this.C = motionEvent.getPointerId(0);
            this.f47634w = false;
            this.f47633u = true;
            this.t.computeScrollOffset();
            if (this.K != 2 || Math.abs(this.t.getFinalX() - this.t.getCurrX()) <= this.H) {
                a(false);
                this.v = false;
            } else {
                this.t.abortAnimation();
                h();
                j();
                setScrollState(1);
            }
        } else if (action == 2) {
            int i2 = this.C;
            if (i2 != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i2);
                float x2 = motionEvent.getX(iFindPointerIndex);
                float f = x2 - this.y;
                float fAbs = Math.abs(f);
                float y2 = motionEvent.getY(iFindPointerIndex);
                float fAbs2 = Math.abs(y2 - this.f47619B);
                if (f != 0.0f) {
                    float f2 = this.y;
                    if ((f2 >= this.j || f <= 0.0f) && ((f2 <= getWidth() - this.j || f >= 0.0f) && getWidth() < this.f47631n)) {
                        this.y = x2;
                        this.f47635z = y2;
                        this.f47634w = true;
                        return false;
                    }
                }
                int i3 = this.x;
                if (fAbs > i3 && fAbs * 0.5f > fAbs2) {
                    h();
                    j();
                    setScrollState(1);
                    float f3 = this.f47618A;
                    float f4 = this.x;
                    this.y = f > 0.0f ? f3 + f4 : f3 - f4;
                    this.f47635z = y2;
                } else if (fAbs2 > i3) {
                    this.f47634w = true;
                }
                if (this.v) {
                    a(x2);
                }
            }
        } else if (action == 6) {
            a(motionEvent);
        }
        if (this.D == null) {
            this.D = VelocityTracker.obtain();
        }
        this.D.addMovement(motionEvent);
        return this.v;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:40:0x00cc  */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        float f;
        float f2;
        float measuredWidth;
        int iMax;
        float measuredWidth2;
        float fMax;
        int i6;
        int i7;
        float measuredHeight;
        this.k.a(this.f47625b);
        this.f47631n = 0;
        int childCount = getChildCount();
        if (childCount <= 0) {
            return;
        }
        float fAbs = Math.abs(i5 - i3);
        int iAbs = Math.abs(i4 - i2);
        View view = this.f47627e;
        if (view != null) {
            if (view != null) {
                float measuredHeight2 = (fAbs - view.getMeasuredHeight()) / 2.0f;
                View view2 = this.f47627e;
                view2.layout(0, (int) measuredHeight2, view2.getMeasuredWidth(), (int) (measuredHeight2 + this.f47627e.getMeasuredHeight()));
            }
            this.f47631n = this.f47627e.getRight() + this.f47631n;
        }
        boolean z3 = true;
        View view3 = null;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt != this.f47627e && childAt != this.f) {
                int i9 = this.f47626c;
                if (i9 != 2) {
                    if (i9 != 3) {
                        this.f47631n += z3 ? this.d : this.m;
                    } else {
                        if (view3 != null) {
                            this.f47631n = (int) (((iAbs - view3.getMeasuredWidth()) / 2.0f) + this.f47631n);
                        }
                        fMax = this.f47631n;
                        measuredWidth2 = (iAbs - childAt.getMeasuredWidth()) / 2.0f;
                    }
                    i6 = ((b) childAt.getLayoutParams()).f47656e;
                    if (i6 != 48) {
                        if (i6 != 80) {
                            measuredHeight = (fAbs - childAt.getMeasuredHeight()) / 2.0f;
                        } else {
                            measuredHeight = fAbs - childAt.getMeasuredHeight();
                        }
                        i7 = (int) measuredHeight;
                    } else {
                        i7 = 0;
                    }
                    int i10 = this.f47631n;
                    childAt.layout(i10, i7, childAt.getMeasuredWidth() + i10, childAt.getMeasuredHeight() + i7);
                    this.f47631n = childAt.getRight();
                    z3 = false;
                    view3 = childAt;
                } else {
                    measuredWidth2 = this.f47631n;
                    fMax = z3 ? Math.max(this.d, (iAbs - childAt.getMeasuredWidth()) / 2.0f) : this.m;
                }
                this.f47631n = (int) (measuredWidth2 + fMax);
                i6 = ((b) childAt.getLayoutParams()).f47656e;
                if (i6 != 48) {
                    if (i6 != 80) {
                        measuredHeight = (fAbs - childAt.getMeasuredHeight()) / 2.0f;
                    } else {
                        measuredHeight = fAbs - childAt.getMeasuredHeight();
                    }
                    i7 = (int) measuredHeight;
                } else {
                    i7 = 0;
                }
                int i11 = this.f47631n;
                childAt.layout(i11, i7, childAt.getMeasuredWidth() + i11, childAt.getMeasuredHeight() + i7);
                this.f47631n = childAt.getRight();
                z3 = false;
                view3 = childAt;
            }
        }
        if (view3 != null) {
            int i12 = this.f47626c;
            if (i12 != 2) {
                if (i12 != 3) {
                    iMax = this.f47631n + this.d;
                } else {
                    f = this.f47631n;
                    measuredWidth = (iAbs - view3.getMeasuredWidth()) / 2.0f;
                    f2 = 0.0f;
                }
                this.f47631n = iMax;
            } else {
                f = this.f47631n;
                f2 = this.d;
                measuredWidth = (iAbs - view3.getMeasuredWidth()) / 2.0f;
            }
            iMax = (int) (Math.max(f2, measuredWidth) + f);
            this.f47631n = iMax;
        }
        View view4 = this.f;
        if (view4 != null) {
            int measuredWidth3 = this.f47631n;
            if (view4 != null) {
                View view5 = this.f47627e;
                int right = view5 != null ? view5.getRight() : 0;
                if (measuredWidth3 - right < getMeasuredWidth()) {
                    measuredWidth3 = getMeasuredWidth() + right;
                }
                float measuredHeight3 = (fAbs - this.f.getMeasuredHeight()) / 2.0f;
                View view6 = this.f;
                view6.layout(measuredWidth3, (int) measuredHeight3, view6.getMeasuredWidth() + measuredWidth3, (int) (measuredHeight3 + this.f.getMeasuredHeight()));
            }
            this.f47631n = this.f.getRight();
        }
        if (this.f47622I) {
            a(this.f47624a, false, 0);
        } else {
            c(this.f47624a);
        }
        this.f47622I = false;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00b8  */
    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        p pVarA;
        p pVarA2;
        p pVar;
        b bVar;
        int i4;
        int i5 = 0;
        setMeasuredDimension(View.getDefaultSize(0, i2), View.getDefaultSize(0, i3));
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        this.j = Math.min(measuredWidth / 10, this.f47629i);
        int measuredWidth2 = getMeasuredWidth() - (this.d * 2);
        int childCount = getChildCount();
        int i6 = 0;
        while (true) {
            if (i6 < childCount) {
                View childAt = getChildAt(i6);
                if (childAt != this.f47627e && childAt != this.f && (bVar = (b) childAt.getLayoutParams()) != null && bVar.f47655c) {
                    int i7 = bVar.f47653a;
                    if (i7 > 0 && (i4 = bVar.f47654b) > 0) {
                        pVarA = p.a(i7, i4, measuredWidth2, measuredHeight);
                        break;
                    }
                    break;
                }
                i6++;
            }
            pVarA = null;
            break;
        }
        if (pVarA == null && (pVar = this.q) != null) {
            pVarA = p.a(pVar.f47362b, pVar.f47363c, measuredWidth2, measuredHeight);
        }
        this.f47624a = Math.min(Math.max(0, this.f47624a), this.f47625b - 1);
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt2 = getChildAt(i8);
            if (childAt2 == this.f47627e || childAt2 == this.f) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), i5), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), i5));
            } else {
                b bVar2 = (b) childAt2.getLayoutParams();
                if (bVar2 != null) {
                    int i9 = bVar2.f47653a;
                    int i10 = bVar2.f47654b;
                    if (this.f47626c == Integer.MIN_VALUE) {
                        pVarA2 = p.a(i9, i10, measuredHeight);
                    } else {
                        int i11 = bVar2.d;
                        if (i11 != 1 && i11 != 2) {
                            pVarA2 = new p(measuredWidth2, measuredHeight);
                        } else if (i11 == 2 && pVarA != null) {
                            pVarA2 = pVarA;
                        } else if (i9 <= 0 || i10 <= 0) {
                            pVarA2 = new p(measuredWidth2, measuredHeight);
                        } else {
                            pVarA2 = p.a(i9, i10, measuredWidth2, measuredHeight);
                        }
                    }
                    int i12 = pVarA2.f47362b;
                    ((ViewGroup.LayoutParams) bVar2).width = i12;
                    ((ViewGroup.LayoutParams) bVar2).height = pVarA2.f47363c;
                    i5 = 0;
                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, i12), 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(0, ((ViewGroup.LayoutParams) bVar2).height), 1073741824));
                }
            }
        }
    }

    @Override // android.view.View
    public void onScrollChanged(int i2, int i3, int i4, int i5) {
        int i6;
        int iMin;
        super.onScrollChanged(i2, i3, i4, i5);
        View childAt = getChildAt(0);
        if (childAt == null || childAt != this.f47627e) {
            i6 = 0;
            iMin = i2;
        } else {
            iMin = Math.max(childAt.getRight(), i2);
            i6 = 1;
        }
        int childCount = getChildCount();
        View childAt2 = getChildAt(childCount - 1);
        if (childAt2 != null && childAt2 == this.f) {
            iMin = Math.min(childAt2.getLeft() - getMeasuredWidth(), iMin);
            childCount--;
        }
        float measuredWidth = f() ? ((getMeasuredWidth() * 1.0f) / 2.0f) + iMin : iMin + this.d;
        View childAt3 = getChildAt(this.f47624a + i6);
        int measuredWidth2 = (childAt3 == null || childAt3.getMeasuredWidth() <= 0) ? getMeasuredWidth() - (this.d * 2) : childAt3.getMeasuredWidth();
        sg.bigo.ads.common.t.a.a("ViewFlow", "computeScrollOffset, ----- begin -----");
        for (int i7 = i6; i7 < childCount; i7++) {
            View childAt4 = getChildAt(i7);
            if (childAt4 != null) {
                float fMax = Math.max(-1.0f, Math.min(1.0f, (f() ? (int) (((childAt4.getLeft() + ((childAt4.getMeasuredWidth() * 1.0f) / 2.0f)) - measuredWidth) + 0.5f) : childAt4.getLeft() - measuredWidth) / measuredWidth2));
                int i8 = i7 - i6;
                if (childAt4.getLeft() < measuredWidth && childAt4.getRight() > measuredWidth) {
                    this.f47630l = i8;
                }
                this.k.a(childAt4, i8, fMax);
                if (fMax == 0.0f && this.f47624a != i8) {
                    this.f47624a = i8;
                    this.f47630l = i8;
                    this.k.a(childAt4, i8);
                }
            }
        }
        sg.bigo.ads.common.t.a.a("ViewFlow", "computeScrollOffset, ----- end -----");
        a aVar = this.k;
        if (aVar != null) {
            aVar.a(i2, getScrollRange());
        }
    }

    /* JADX WARN: Code duplicated, block: B:118:0x0217 A[PHI: r1
  0x0217: PHI (r1v12 sg.bigo.ads.common.view.ViewFlow$d) = (r1v11 sg.bigo.ads.common.view.ViewFlow$d), (r1v13 sg.bigo.ads.common.view.ViewFlow$d) binds: [B:127:0x023c, B:117:0x0215] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:135:0x0271  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:68:0x013b  */
    /* JADX WARN: Code duplicated, block: B:75:0x0158  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int pointerId;
        d dVar;
        int right;
        int scrollRange;
        boolean zG;
        this.M = true;
        boolean zG2 = false;
        if (!this.r) {
            return false;
        }
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || getChildCount() == 0) {
            return false;
        }
        if (this.D == null) {
            this.D = VelocityTracker.obtain();
        }
        this.D.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action == 3) {
                        if (this.v) {
                            a(this.f47624a, true, 0);
                            zG = g();
                        } else {
                            zG = false;
                        }
                        this.f47628h = false;
                        zG2 = zG;
                    } else if (action == 5) {
                        int actionIndex = motionEvent.getActionIndex();
                        this.y = motionEvent.getX(actionIndex);
                        pointerId = motionEvent.getPointerId(actionIndex);
                    } else if (action == 6) {
                        a(motionEvent);
                        this.y = motionEvent.getX(motionEvent.findPointerIndex(this.C));
                    }
                } else if (!this.v) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.C);
                    if (iFindPointerIndex == -1) {
                        zG2 = g();
                    } else {
                        float x = motionEvent.getX(iFindPointerIndex);
                        float fAbs = Math.abs(x - this.y);
                        float y = motionEvent.getY(iFindPointerIndex);
                        float fAbs2 = Math.abs(y - this.f47635z);
                        if (fAbs > this.x && fAbs > fAbs2) {
                            h();
                            j();
                            float f = this.f47618A;
                            this.y = x - f > 0.0f ? f + this.x : f - this.x;
                            this.f47635z = y;
                            setScrollState(1);
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                        }
                        if (this.v) {
                            a(motionEvent.getX(motionEvent.findPointerIndex(this.C)));
                        } else {
                            this.f47628h = true;
                        }
                    }
                } else if (this.v) {
                    a(motionEvent.getX(motionEvent.findPointerIndex(this.C)));
                } else {
                    this.f47628h = true;
                }
            } else if (this.v) {
                VelocityTracker velocityTracker = this.D;
                velocityTracker.computeCurrentVelocity(1000, this.f47621F);
                int xVelocity = (int) velocityTracker.getXVelocity(this.C);
                int scrollX = getScrollX();
                int x2 = (int) (motionEvent.getX(motionEvent.findPointerIndex(this.C)) - this.f47618A);
                if (Integer.MIN_VALUE != this.f47626c) {
                    int i2 = this.f47630l;
                    int i3 = (Math.abs(x2) <= this.G || Math.abs(xVelocity) <= this.f47620E || xVelocity > 0) ? i2 : i2 + 1;
                    if (i3 == i2) {
                        double measuredWidth = (x2 * 1.0f) / a(i2).getMeasuredWidth();
                        if (measuredWidth > 0.1d) {
                            i2--;
                        } else if (measuredWidth < -0.1d) {
                            i2++;
                        }
                    } else {
                        i2 = i3;
                    }
                    int iMax = Math.max(Math.min(i2, this.f47624a + 1), this.f47624a - 1);
                    int childCount = getChildCount();
                    if (childCount > 0) {
                        View view = this.f47627e;
                        if (view != null && view == getChildAt(0)) {
                            childCount--;
                        }
                        View view2 = this.f;
                        if (view2 != null && view2 == getChildAt(getChildCount() - 1)) {
                            childCount--;
                        }
                        iMax = Math.max(0, Math.min(iMax, childCount - 1));
                    }
                    a(iMax, true, xVelocity);
                } else if (Math.abs(xVelocity) > this.f47620E) {
                    int i4 = -xVelocity;
                    if (this.f47627e != null) {
                        View childAt = getChildAt(0);
                        View view3 = this.f47627e;
                        if (childAt == view3) {
                            right = view3.getRight();
                        } else {
                            right = 0;
                        }
                    } else {
                        right = 0;
                    }
                    if (this.f != null) {
                        View childAt2 = getChildAt(getChildCount() - 1);
                        View view4 = this.f;
                        if (childAt2 == view4) {
                            scrollRange = view4.getLeft() - getMeasuredWidth();
                        } else {
                            scrollRange = getScrollRange();
                        }
                    } else {
                        scrollRange = getScrollRange();
                    }
                    int i5 = scrollRange;
                    if (getChildCount() > 0) {
                        this.t.fling(getScrollX(), getScrollY(), i4, 0, right, i5, 0, 0);
                        postInvalidateOnAnimation();
                    }
                } else {
                    post(new Runnable() { // from class: sg.bigo.ads.common.view.ViewFlow.3
                        @Override // java.lang.Runnable
                        public final void run() {
                            ViewFlow.a(ViewFlow.this);
                        }
                    });
                }
                if (scrollX == 0 && x2 > 0 && this.f47627e != null && getChildAt(0) == this.f47627e) {
                    dVar = this.o;
                    if (dVar != null) {
                        dVar.a();
                    }
                } else if (this.f != null) {
                    View childAt3 = getChildAt(getChildCount() - 1);
                    View view5 = this.f;
                    if (childAt3 == view5 && x2 < 0 && scrollX == view5.getRight() - getMeasuredWidth() && (dVar = this.f47632p) != null) {
                        dVar.a();
                    }
                }
                zG = g();
                this.f47628h = false;
                zG2 = zG;
            } else {
                if (Integer.MIN_VALUE != this.f47626c) {
                    c(this.f47630l);
                } else {
                    post(new Runnable() { // from class: sg.bigo.ads.common.view.ViewFlow.4
                        @Override // java.lang.Runnable
                        public final void run() {
                            ViewFlow.a(ViewFlow.this);
                        }
                    });
                }
                zG = false;
                this.f47628h = false;
                zG2 = zG;
            }
            if (zG2) {
                sg.bigo.ads.common.e.a.a(this);
            }
            return true;
        }
        this.t.abortAnimation();
        float x3 = motionEvent.getX();
        this.f47618A = x3;
        this.y = x3;
        float y2 = motionEvent.getY();
        this.f47619B = y2;
        this.f47635z = y2;
        pointerId = motionEvent.getPointerId(0);
        this.C = pointerId;
        if (zG2) {
            sg.bigo.ads.common.e.a.a(this);
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view == this.f || view == this.f47627e || view == null) {
            return;
        }
        this.f47625b++;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view == this.f || view == this.f47627e || view == null) {
            return;
        }
        this.f47625b--;
    }

    public void setContentMaxWidthSpace(int i2) {
        int iMax = Math.max(0, i2);
        if (this.d != iMax) {
            this.d = iMax;
            requestLayout();
        }
    }

    public void setDividerWidth(int i2) {
        int iMax = Math.max(0, i2);
        if (this.m != iMax) {
            this.m = iMax;
            if (this.f47626c != 3) {
                requestLayout();
            }
        }
    }

    public void setEndView(View view) {
        View view2 = this.f;
        if (view != view2) {
            if (view2 != null) {
                removeView(view2);
            }
            this.f = view;
            if (view != null) {
                addView(view);
            }
            requestLayout();
        }
    }

    public void setMainChildSize(p pVar) {
        this.q = pVar;
    }

    public void setOnEndViewShowListener(d dVar) {
        this.f47632p = dVar;
    }

    public void setOnItemChangeListener(c cVar) {
        this.k.f47639a = cVar;
    }

    public void setOnStartViewShowListener(d dVar) {
        this.o = dVar;
    }

    public void setScrollEnabled(boolean z2) {
        this.r = z2;
    }

    public void setScrollState(int i2) {
        if (this.K == i2) {
            return;
        }
        this.K = i2;
    }

    public void setStartView(View view) {
        View view2 = this.f47627e;
        if (view != view2) {
            if (view2 != null) {
                removeView(view2);
            }
            this.f47627e = view;
            if (view != null) {
                addView(view, 0);
            }
            requestLayout();
        }
    }

    public void setViewStyle(int i2) {
        if (this.f47626c != i2) {
            this.f47626c = i2;
            requestLayout();
        }
    }

    public ViewFlow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.k = new a(this, (byte) 0);
        this.f47624a = 0;
        this.f47625b = 0;
        this.f47630l = 0;
        this.f47626c = 3;
        this.r = true;
        this.g = false;
        this.f47628h = false;
        this.C = -1;
        this.f47622I = true;
        this.f47623J = new Runnable() { // from class: sg.bigo.ads.common.view.ViewFlow.2
            @Override // java.lang.Runnable
            public final void run() {
                ViewFlow.this.setScrollState(0);
            }
        };
        this.K = 0;
        this.M = false;
        removeAllViews();
        setFocusable(true);
        setOverScrollMode(2);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        Context context2 = getContext();
        this.t = new Scroller(context2, s);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context2);
        float f = context2.getResources().getDisplayMetrics().density;
        this.x = viewConfiguration.getScaledPagingTouchSlop();
        this.f47620E = (int) (400.0f * f);
        this.f47621F = viewConfiguration.getScaledMaximumFlingVelocity();
        this.G = (int) (25.0f * f);
        this.H = (int) (2.0f * f);
        this.f47629i = (int) (f * 16.0f);
    }

    public final View a(int i2) {
        List<View> items = getItems();
        if (i2 < 0 || i2 >= items.size()) {
            return null;
        }
        return items.get(i2);
    }

    public final void b(int i2) {
        this.f47624a = i2;
        if (this.f47622I) {
            requestLayout();
        } else {
            c(i2);
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0036  */
    @Override // sg.bigo.ads.common.view.a
    public final void a() {
        int i2;
        int itemCount = getItemCount();
        if (itemCount <= 1) {
            return;
        }
        int currentItem = getCurrentItem();
        if (this.L) {
            if (currentItem == 0) {
                i2 = currentItem + 1;
                this.L = false;
            } else {
                i2 = currentItem - 1;
            }
        } else if (currentItem != itemCount - 1) {
            View view = this.f;
            int measuredWidth = this.f47631n;
            if (view != null) {
                measuredWidth -= view.getMeasuredWidth();
            }
            if (getMeasuredWidth() + getScrollX() >= measuredWidth) {
                i2 = currentItem - 1;
                this.L = true;
            } else {
                i2 = currentItem + 1;
            }
        } else {
            i2 = currentItem - 1;
            this.L = true;
        }
        c(i2);
    }

    @Override // sg.bigo.ads.common.view.a
    public final boolean b() {
        return !this.v;
    }

    private void a(int i2, int i3) {
        int scrollX;
        int iAbs;
        if (this.f47625b == 0) {
            return;
        }
        Scroller scroller = this.t;
        if (scroller == null || scroller.isFinished()) {
            scrollX = getScrollX();
        } else {
            scrollX = this.f47633u ? this.t.getCurrX() : this.t.getStartX();
            this.t.abortAnimation();
        }
        int i4 = scrollX;
        int scrollY = getScrollY();
        int i5 = i2 - i4;
        int i6 = 0 - scrollY;
        if (i5 == 0 && i6 == 0) {
            a(false);
            setScrollState(0);
            return;
        }
        setScrollState(2);
        int measuredWidth = getMeasuredWidth();
        float f = measuredWidth / 2;
        float fB = (b(Math.min(1.0f, (Math.abs(i5) * 1.0f) / measuredWidth)) * f) + f;
        int iAbs2 = Math.abs(i3);
        if (iAbs2 > 0) {
            iAbs = Math.round(Math.abs(fB / iAbs2) * 1000.0f) * 4;
        } else {
            iAbs = (int) (((Math.abs(i5) / getChildAt(this.f47624a).getWidth()) + 1.0f) * 100.0f);
        }
        int iMin = Math.min(iAbs, 600);
        this.f47633u = false;
        this.t.startScroll(i4, scrollY, i5, i6, iMin);
        sg.bigo.ads.common.e.a.a(this);
    }

    private void a(int i2, boolean z2, int i3) {
        int iMax;
        int measuredWidth;
        int measuredWidth2;
        if (this.f47625b <= 0) {
            return;
        }
        int iMin = Math.min(Math.max(0, i2), this.f47625b - 1);
        View childAt = getChildAt(0);
        if (childAt != null && childAt == this.f47627e) {
            iMin++;
        }
        View childAt2 = getChildAt(iMin);
        if (childAt2 != null) {
            iMax = f() ? childAt2.getLeft() - ((getMeasuredWidth() - childAt2.getMeasuredWidth()) / 2) : childAt2.getLeft() - Math.max(this.d, this.m);
        } else {
            iMax = 0;
        }
        if (getChildAt(getChildCount() - 1) != null) {
            if (this.f != null) {
                measuredWidth = this.f47631n - getMeasuredWidth();
                measuredWidth2 = this.f.getMeasuredWidth();
            } else {
                measuredWidth = this.f47631n;
                measuredWidth2 = getMeasuredWidth();
            }
            iMax = (int) Math.max(0.0f, Math.min(iMax, measuredWidth - measuredWidth2));
        }
        if (iMax == getScrollX()) {
            return;
        }
        if (z2) {
            a(iMax, i3);
        } else {
            a(false);
            scrollTo(iMax, 0);
        }
    }

    private void a(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.C) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.y = motionEvent.getX(i2);
            this.C = motionEvent.getPointerId(i2);
            VelocityTracker velocityTracker = this.D;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public static /* synthetic */ void a(ViewFlow viewFlow) {
        int scrollX = viewFlow.getScrollX();
        if (viewFlow.f47627e != null) {
            View childAt = viewFlow.getChildAt(0);
            View view = viewFlow.f47627e;
            if (childAt == view && scrollX < view.getRight()) {
                viewFlow.c(0);
                return;
            }
        }
        if (viewFlow.f != null) {
            View childAt2 = viewFlow.getChildAt(viewFlow.getChildCount() - 1);
            View view2 = viewFlow.f;
            if (childAt2 != view2 || scrollX <= view2.getLeft() - viewFlow.getMeasuredWidth()) {
                return;
            }
            viewFlow.c(viewFlow.getItemCount() - 1);
        }
    }

    private void a(boolean z2) {
        boolean z3 = this.K == 2;
        if (z3 && !this.t.isFinished()) {
            this.t.abortAnimation();
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.t.getCurrX();
            int currY = this.t.getCurrY();
            if (scrollX != currX || scrollY != currY) {
                scrollTo(currX, currY);
            }
        }
        if (z3) {
            if (z2) {
                sg.bigo.ads.common.e.a.a(this, this.f47623J);
            } else {
                this.f47623J.run();
            }
        }
    }

    private boolean a(float f) {
        float f2 = this.y - f;
        this.y = f;
        float fMax = Math.max(0.0f, Math.min(getScrollX() + f2, getScrollRange()));
        sg.bigo.ads.common.t.a.b("ViewFlow", "performDrag, getScrollRange()=" + getScrollRange() + ", scrollX=" + fMax);
        int i2 = (int) fMax;
        this.y = (fMax - ((float) i2)) + this.y;
        scrollTo(i2, getScrollY());
        return false;
    }
}
