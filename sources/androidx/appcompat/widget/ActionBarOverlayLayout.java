package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.internal.ads.n3;
import com.storage.androidcleaner.R;
import java.util.WeakHashMap;
import k.f0;
import m0.a1;
import m0.b1;
import m0.c1;
import m0.d1;
import m0.l0;
import m0.o1;
import m0.r1;
import m0.s0;
import m0.t;
import m0.u;
import o.m;
import o.x;
import o4.o;
import p.b;
import p.c;
import p.d;
import p.e;
import p.e1;
import p.f1;
import p.j;
import p.s2;
import p.x2;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"UnknownNullness"})
public class ActionBarOverlayLayout extends ViewGroup implements e1, t, u {
    public static final int[] C = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};
    public static final r1 D;
    public static final Rect E;
    public final n3 A;
    public final e B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3895b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ContentFrameLayout f3896c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ActionBarContainer f3897d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public f1 f3898e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Drawable f3899f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f3900g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f3901h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f3902i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f3903j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f3904k;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Rect f3905m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Rect f3906n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Rect f3907o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Rect f3908p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public r1 f3909q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public r1 f3910r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public r1 f3911s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public r1 f3912t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public c f3913u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public OverScroller f3914v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ViewPropertyAnimator f3915w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final o f3916x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final b f3917y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final b f3918z;

    static {
        m0.f1 b1Var;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 36) {
            b1Var = new m0.e1();
        } else if (i10 >= 35) {
            b1Var = new d1();
        } else if (i10 >= 34) {
            b1Var = new c1();
        } else {
            b1Var = i10 >= 31 ? new b1() : new a1();
        }
        b1Var.f(f0.b.b(0, 1, 0, 1));
        D = b1Var.b();
        E = new Rect();
    }

    public ActionBarOverlayLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3895b = 0;
        this.f3905m = new Rect();
        this.f3906n = new Rect();
        this.f3907o = new Rect();
        this.f3908p = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        r1 r1Var = r1.f45739b;
        this.f3909q = r1Var;
        this.f3910r = r1Var;
        this.f3911s = r1Var;
        this.f3912t = r1Var;
        this.f3916x = new o(this, 1);
        this.f3917y = new b(this, 0);
        this.f3918z = new b(this, 1);
        i(context);
        this.A = new n3();
        e eVar = new e(context);
        eVar.setWillNotDraw(true);
        this.B = eVar;
        addView(eVar);
    }

    public static boolean g(View view, Rect rect, boolean z10) {
        boolean z11;
        d dVar = (d) view.getLayoutParams();
        int i10 = ((ViewGroup.MarginLayoutParams) dVar).leftMargin;
        int i11 = rect.left;
        if (i10 != i11) {
            ((ViewGroup.MarginLayoutParams) dVar).leftMargin = i11;
            z11 = true;
        } else {
            z11 = false;
        }
        int i12 = ((ViewGroup.MarginLayoutParams) dVar).topMargin;
        int i13 = rect.top;
        if (i12 != i13) {
            ((ViewGroup.MarginLayoutParams) dVar).topMargin = i13;
            z11 = true;
        }
        int i14 = ((ViewGroup.MarginLayoutParams) dVar).rightMargin;
        int i15 = rect.right;
        if (i14 != i15) {
            ((ViewGroup.MarginLayoutParams) dVar).rightMargin = i15;
            z11 = true;
        }
        if (z10) {
            int i16 = ((ViewGroup.MarginLayoutParams) dVar).bottomMargin;
            int i17 = rect.bottom;
            if (i16 != i17) {
                ((ViewGroup.MarginLayoutParams) dVar).bottomMargin = i17;
                return true;
            }
        }
        return z11;
    }

    @Override // m0.t
    public final void a(View view, View view2, int i10, int i11) {
        if (i11 == 0) {
            onNestedScrollAccepted(view, view2, i10);
        }
    }

    @Override // m0.t
    public final void b(View view, int i10) {
        if (i10 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // m0.t
    public final void c(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14) {
        if (i14 == 0) {
            onNestedScroll(viewGroup, i10, i11, i12, i13);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof d;
    }

    @Override // m0.u
    public final void d(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        c(viewGroup, i10, i11, i12, i13, i14);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int translationY;
        super.draw(canvas);
        if (this.f3899f != null) {
            if (this.f3897d.getVisibility() == 0) {
                translationY = (int) (this.f3897d.getTranslationY() + this.f3897d.getBottom() + 0.5f);
            } else {
                translationY = 0;
            }
            this.f3899f.setBounds(0, translationY, getWidth(), this.f3899f.getIntrinsicHeight() + translationY);
            this.f3899f.draw(canvas);
        }
    }

    @Override // m0.t
    public final boolean e(View view, View view2, int i10, int i11) {
        return i11 == 0 && onStartNestedScroll(view, view2, i10);
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new d(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new d(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f3897d;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        n3 n3Var = this.A;
        return n3Var.f17625b | n3Var.f17624a;
    }

    public CharSequence getTitle() {
        k();
        return ((x2) this.f3898e).f47854a.getTitle();
    }

    public final void h() {
        removeCallbacks(this.f3917y);
        removeCallbacks(this.f3918z);
        ViewPropertyAnimator viewPropertyAnimator = this.f3915w;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void i(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(C);
        this.f3894a = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.f3899f = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.f3914v = new OverScroller(context);
    }

    public final void j(int i10) {
        k();
        if (i10 == 2) {
            ((x2) this.f3898e).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else if (i10 == 5) {
            ((x2) this.f3898e).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else {
            if (i10 != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    public final void k() {
        f1 wrapper;
        if (this.f3896c == null) {
            this.f3896c = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f3897d = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback callbackFindViewById = findViewById(R.id.action_bar);
            if (callbackFindViewById instanceof f1) {
                wrapper = (f1) callbackFindViewById;
            } else {
                if (!(callbackFindViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById.getClass().getSimpleName()));
                }
                wrapper = ((Toolbar) callbackFindViewById).getWrapper();
            }
            this.f3898e = wrapper;
        }
    }

    public final void l(Menu menu, x xVar) {
        k();
        x2 x2Var = (x2) this.f3898e;
        Toolbar toolbar = x2Var.f47854a;
        if (x2Var.f47865m == null) {
            x2Var.f47865m = new j(toolbar.getContext());
        }
        j jVar = x2Var.f47865m;
        jVar.f47674e = xVar;
        m mVar = (m) menu;
        if (mVar == null && toolbar.f3970a == null) {
            return;
        }
        toolbar.f();
        m mVar2 = toolbar.f3970a.f3919p;
        if (mVar2 == mVar) {
            return;
        }
        if (mVar2 != null) {
            mVar2.r(toolbar.K);
            mVar2.r(toolbar.L);
        }
        if (toolbar.L == null) {
            toolbar.L = new s2(toolbar);
        }
        jVar.f47685q = true;
        if (mVar != null) {
            mVar.b(jVar, toolbar.f3979j);
            mVar.b(toolbar.L, toolbar.f3979j);
        } else {
            jVar.g(toolbar.f3979j, null);
            toolbar.L.g(toolbar.f3979j, null);
            jVar.c();
            toolbar.L.c();
        }
        toolbar.f3970a.setPopupTheme(toolbar.f3980k);
        toolbar.f3970a.setPresenter(jVar);
        toolbar.K = jVar;
        toolbar.t();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        k();
        r1 r1VarG = r1.g(this, windowInsets);
        boolean zG = g(this.f3897d, new Rect(r1VarG.b(), r1VarG.d(), r1VarG.c(), r1VarG.a()), false);
        WeakHashMap weakHashMap = s0.f45746a;
        Rect rect = this.f3905m;
        l0.a(this, r1VarG, rect);
        int i10 = rect.left;
        int i11 = rect.top;
        int i12 = rect.right;
        int i13 = rect.bottom;
        o1 o1Var = r1VarG.f45740a;
        r1 r1VarM = o1Var.m(i10, i11, i12, i13);
        this.f3909q = r1VarM;
        boolean z10 = true;
        if (!this.f3910r.equals(r1VarM)) {
            this.f3910r = this.f3909q;
            zG = true;
        }
        Rect rect2 = this.f3906n;
        if (rect2.equals(rect)) {
            z10 = zG;
        } else {
            rect2.set(rect);
        }
        if (z10) {
            requestLayout();
        }
        return o1Var.a().f45740a.c().f45740a.b().f();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i(getContext());
        WeakHashMap weakHashMap = s0.f45746a;
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i15 = ((ViewGroup.MarginLayoutParams) dVar).leftMargin + paddingLeft;
                int i16 = ((ViewGroup.MarginLayoutParams) dVar).topMargin + paddingTop;
                childAt.layout(i15, i16, measuredWidth + i15, measuredHeight + i16);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:24:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:25:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:27:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:28:0x00df  */
    /* JADX WARN: Code duplicated, block: B:30:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:31:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:34:0x00f3  */
    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int measuredHeight;
        r1 r1Var;
        int i12;
        m0.f1 a1Var;
        k();
        measureChildWithMargins(this.f3897d, i10, 0, i11, 0);
        d dVar = (d) this.f3897d.getLayoutParams();
        int iMax = Math.max(0, this.f3897d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) dVar).leftMargin + ((ViewGroup.MarginLayoutParams) dVar).rightMargin);
        int iMax2 = Math.max(0, this.f3897d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) dVar).topMargin + ((ViewGroup.MarginLayoutParams) dVar).bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.f3897d.getMeasuredState());
        WeakHashMap weakHashMap = s0.f45746a;
        boolean z10 = (getWindowSystemUiVisibility() & NotificationCompat.FLAG_LOCAL_ONLY) != 0;
        if (z10) {
            measuredHeight = this.f3894a;
            if (this.f3901h && this.f3897d.getTabContainer() != null) {
                measuredHeight += this.f3894a;
            }
        } else {
            measuredHeight = this.f3897d.getVisibility() != 8 ? this.f3897d.getMeasuredHeight() : 0;
        }
        Rect rect = this.f3905m;
        Rect rect2 = this.f3907o;
        rect2.set(rect);
        this.f3911s = this.f3909q;
        if (this.f3900g || z10) {
            f0.b bVarB = f0.b.b(this.f3911s.b(), this.f3911s.d() + measuredHeight, this.f3911s.c(), this.f3911s.a());
            r1Var = this.f3911s;
            i12 = Build.VERSION.SDK_INT;
            if (i12 >= 36) {
                a1Var = new m0.e1(r1Var);
            } else if (i12 >= 35) {
                a1Var = new d1(r1Var);
            } else if (i12 >= 34) {
                a1Var = new c1(r1Var);
            } else if (i12 >= 31) {
                a1Var = new b1(r1Var);
            } else {
                a1Var = new a1(r1Var);
            }
            a1Var.f(bVarB);
            this.f3911s = a1Var.b();
        } else {
            e eVar = this.B;
            r1 r1Var2 = D;
            Rect rect3 = this.f3908p;
            l0.a(eVar, r1Var2, rect3);
            if (rect3.equals(E)) {
                f0.b bVarB2 = f0.b.b(this.f3911s.b(), this.f3911s.d() + measuredHeight, this.f3911s.c(), this.f3911s.a());
                r1Var = this.f3911s;
                i12 = Build.VERSION.SDK_INT;
                if (i12 >= 36) {
                    a1Var = new m0.e1(r1Var);
                } else if (i12 >= 35) {
                    a1Var = new d1(r1Var);
                } else if (i12 >= 34) {
                    a1Var = new c1(r1Var);
                } else if (i12 >= 31) {
                    a1Var = new b1(r1Var);
                } else {
                    a1Var = new a1(r1Var);
                }
                a1Var.f(bVarB2);
                this.f3911s = a1Var.b();
            } else {
                rect2.top += measuredHeight;
                rect2.bottom = rect2.bottom;
                this.f3911s = this.f3911s.f45740a.m(0, measuredHeight, 0, 0);
            }
        }
        g(this.f3896c, rect2, true);
        if (!this.f3912t.equals(this.f3911s)) {
            r1 r1Var3 = this.f3911s;
            this.f3912t = r1Var3;
            s0.b(this.f3896c, r1Var3);
        }
        measureChildWithMargins(this.f3896c, i10, 0, i11, 0);
        d dVar2 = (d) this.f3896c.getLayoutParams();
        int iMax3 = Math.max(iMax, this.f3896c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) dVar2).leftMargin + ((ViewGroup.MarginLayoutParams) dVar2).rightMargin);
        int iMax4 = Math.max(iMax2, this.f3896c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) dVar2).topMargin + ((ViewGroup.MarginLayoutParams) dVar2).bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f3896c.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + iMax3, getSuggestedMinimumWidth()), i10, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax4, getSuggestedMinimumHeight()), i11, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        if (!this.f3902i || !z10) {
            return false;
        }
        this.f3914v.fling(0, 0, 0, (int) f11, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f3914v.getFinalY() > this.f3897d.getHeight()) {
            h();
            this.f3918z.run();
        } else {
            h();
            this.f3917y.run();
        }
        this.f3903j = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f10, float f11) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        int i14 = this.f3904k + i11;
        this.f3904k = i14;
        setActionBarHideOffset(i14);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        f0 f0Var;
        n.j jVar;
        this.A.f17624a = i10;
        this.f3904k = getActionBarHideOffset();
        h();
        c cVar = this.f3913u;
        if (cVar == null || (jVar = (f0Var = (f0) cVar).f44114s) == null) {
            return;
        }
        jVar.b();
        f0Var.f44114s = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        if ((i10 & 2) == 0 || this.f3897d.getVisibility() != 0) {
            return false;
        }
        return this.f3902i;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.f3902i || this.f3903j) {
            return;
        }
        if (this.f3904k <= this.f3897d.getHeight()) {
            h();
            postDelayed(this.f3917y, 600L);
        } else {
            h();
            postDelayed(this.f3918z, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i10) {
        super.onWindowSystemUiVisibilityChanged(i10);
        k();
        int i11 = this.l ^ i10;
        this.l = i10;
        boolean z10 = (i10 & 4) == 0;
        boolean z11 = (i10 & NotificationCompat.FLAG_LOCAL_ONLY) != 0;
        c cVar = this.f3913u;
        if (cVar != null) {
            f0 f0Var = (f0) cVar;
            f0Var.f44110o = !z11;
            if (z10 || !z11) {
                if (f0Var.f44111p) {
                    f0Var.f44111p = false;
                    f0Var.f0(true);
                }
            } else if (!f0Var.f44111p) {
                f0Var.f44111p = true;
                f0Var.f0(true);
            }
        }
        if ((i11 & NotificationCompat.FLAG_LOCAL_ONLY) == 0 || this.f3913u == null) {
            return;
        }
        WeakHashMap weakHashMap = s0.f45746a;
        requestApplyInsets();
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        this.f3895b = i10;
        c cVar = this.f3913u;
        if (cVar != null) {
            ((f0) cVar).f44109n = i10;
        }
    }

    public void setActionBarHideOffset(int i10) {
        h();
        this.f3897d.setTranslationY(-Math.max(0, Math.min(i10, this.f3897d.getHeight())));
    }

    public void setActionBarVisibilityCallback(c cVar) {
        this.f3913u = cVar;
        if (getWindowToken() != null) {
            ((f0) this.f3913u).f44109n = this.f3895b;
            int i10 = this.l;
            if (i10 != 0) {
                onWindowSystemUiVisibilityChanged(i10);
                WeakHashMap weakHashMap = s0.f45746a;
                requestApplyInsets();
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z10) {
        this.f3901h = z10;
    }

    public void setHideOnContentScrollEnabled(boolean z10) {
        if (z10 != this.f3902i) {
            this.f3902i = z10;
            if (z10) {
                return;
            }
            h();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i10) {
        k();
        x2 x2Var = (x2) this.f3898e;
        x2Var.f47857d = i10 != 0 ? com.google.android.gms.internal.auth.o.i(x2Var.f47854a.getContext(), i10) : null;
        x2Var.c();
    }

    public void setLogo(int i10) {
        k();
        x2 x2Var = (x2) this.f3898e;
        x2Var.f47858e = i10 != 0 ? com.google.android.gms.internal.auth.o.i(x2Var.f47854a.getContext(), i10) : null;
        x2Var.c();
    }

    public void setOverlayMode(boolean z10) {
        this.f3900g = z10;
    }

    @Override // p.e1
    public void setWindowCallback(Window.Callback callback) {
        k();
        ((x2) this.f3898e).f47864k = callback;
    }

    @Override // p.e1
    public void setWindowTitle(CharSequence charSequence) {
        k();
        x2 x2Var = (x2) this.f3898e;
        if (x2Var.f47860g) {
            return;
        }
        Toolbar toolbar = x2Var.f47854a;
        x2Var.f47861h = charSequence;
        if ((x2Var.f47855b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (x2Var.f47860g) {
                s0.g(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new d(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        k();
        x2 x2Var = (x2) this.f3898e;
        x2Var.f47857d = drawable;
        x2Var.c();
    }

    public void setShowingForActionMode(boolean z10) {
    }

    public void setUiOptions(int i10) {
    }

    @Override // m0.t
    public final void f(int[] iArr, int i10, int i11, int i12) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
    }
}
