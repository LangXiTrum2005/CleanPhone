package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.a0;
import com.ironsource.InterfaceC0435l1;
import com.storage.androidcleaner.R;
import g9.k;
import j.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import m0.n;
import m0.p0;
import m0.q;
import m0.r;
import m0.s0;
import n.h;
import na.g;
import o.m;
import o.o;
import oa.k0;
import p.f1;
import p.j;
import p.j2;
import p.q2;
import p.r2;
import p.s2;
import p.t2;
import p.u2;
import p.v2;
import p.w2;
import p.x;
import p.x0;
import p.x2;
import p.y2;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class Toolbar extends ViewGroup implements n {
    public ColorStateList A;
    public boolean B;
    public boolean C;
    public final ArrayList D;
    public final ArrayList E;
    public final int[] F;
    public final q G;
    public ArrayList H;
    public final k0 I;
    public x2 J;
    public j K;
    public s2 L;
    public boolean M;
    public OnBackInvokedCallback N;
    public OnBackInvokedDispatcher O;
    public boolean P;
    public final a0 Q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ActionMenuView f3970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public x0 f3971b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public x0 f3972c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public x f3973d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AppCompatImageView f3974e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Drawable f3975f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CharSequence f3976g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public x f3977h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public View f3978i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Context f3979j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f3980k;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f3981m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f3982n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f3983o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f3984p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f3985q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f3986r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f3987s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public j2 f3988t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f3989u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f3990v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f3991w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public CharSequence f3992x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public CharSequence f3993y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ColorStateList f3994z;

    public Toolbar(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.f3991w = 8388627;
        this.D = new ArrayList();
        this.E = new ArrayList();
        this.F = new int[2];
        this.G = new q(new q2(this, 1));
        this.H = new ArrayList();
        this.I = new k0(this, 2);
        this.Q = new a0(this, 28);
        Context context2 = getContext();
        int[] iArr = a.f43539x;
        k kVarZ = k.z(context2, attributeSet, iArr, R.attr.toolbarStyle);
        TypedArray typedArray = (TypedArray) kVarZ.f41771c;
        WeakHashMap weakHashMap = s0.f45746a;
        p0.b(this, context, iArr, attributeSet, typedArray, R.attr.toolbarStyle, 0);
        TypedArray typedArray2 = (TypedArray) kVarZ.f41771c;
        this.l = typedArray2.getResourceId(28, 0);
        this.f3981m = typedArray2.getResourceId(19, 0);
        this.f3991w = typedArray2.getInteger(0, 8388627);
        this.f3982n = typedArray2.getInteger(2, 48);
        int dimensionPixelOffset = typedArray2.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray2.hasValue(27) ? typedArray2.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.f3987s = dimensionPixelOffset;
        this.f3986r = dimensionPixelOffset;
        this.f3985q = dimensionPixelOffset;
        this.f3984p = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray2.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.f3984p = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray2.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.f3985q = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray2.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.f3986r = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray2.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.f3987s = dimensionPixelOffset5;
        }
        this.f3983o = typedArray2.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray2.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray2.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray2.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray2.getDimensionPixelSize(8, 0);
        d();
        j2 j2Var = this.f3988t;
        j2Var.f47707h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            j2Var.f47704e = dimensionPixelSize;
            j2Var.f47700a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            j2Var.f47705f = dimensionPixelSize2;
            j2Var.f47701b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            j2Var.a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.f3989u = typedArray2.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.f3990v = typedArray2.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.f3975f = kVarZ.s(4);
        this.f3976g = typedArray2.getText(3);
        CharSequence text = typedArray2.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray2.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.f3979j = getContext();
        setPopupTheme(typedArray2.getResourceId(17, 0));
        Drawable drawableS = kVarZ.s(16);
        if (drawableS != null) {
            setNavigationIcon(drawableS);
        }
        CharSequence text3 = typedArray2.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable drawableS2 = kVarZ.s(11);
        if (drawableS2 != null) {
            setLogo(drawableS2);
        }
        CharSequence text4 = typedArray2.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray2.hasValue(29)) {
            setTitleTextColor(kVarZ.q(29));
        }
        if (typedArray2.hasValue(20)) {
            setSubtitleTextColor(kVarZ.q(20));
        }
        if (typedArray2.hasValue(14)) {
            getMenuInflater().inflate(typedArray2.getResourceId(14, 0), getMenu());
        }
        kVarZ.B();
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i10 = 0; i10 < menu.size(); i10++) {
            arrayList.add(menu.getItem(i10));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new h(getContext());
    }

    public static t2 h() {
        t2 t2Var = new t2(-2, -2);
        t2Var.f47816b = 0;
        t2Var.f47815a = 8388627;
        return t2Var;
    }

    public static t2 i(ViewGroup.LayoutParams layoutParams) {
        boolean z10 = layoutParams instanceof t2;
        if (z10) {
            t2 t2Var = (t2) layoutParams;
            t2 t2Var2 = new t2(t2Var);
            t2Var2.f47816b = 0;
            t2Var2.f47816b = t2Var.f47816b;
            return t2Var2;
        }
        if (z10) {
            t2 t2Var3 = new t2((t2) layoutParams);
            t2Var3.f47816b = 0;
            return t2Var3;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            t2 t2Var4 = new t2(layoutParams);
            t2Var4.f47816b = 0;
            return t2Var4;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        t2 t2Var5 = new t2(marginLayoutParams);
        t2Var5.f47816b = 0;
        ((ViewGroup.MarginLayoutParams) t2Var5).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) t2Var5).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) t2Var5).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) t2Var5).bottomMargin = marginLayoutParams.bottomMargin;
        return t2Var5;
    }

    public static int k(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    public static int l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(ArrayList arrayList, int i10) {
        boolean z10 = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i10, getLayoutDirection());
        arrayList.clear();
        if (!z10) {
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                t2 t2Var = (t2) childAt.getLayoutParams();
                if (t2Var.f47816b == 0 && s(childAt)) {
                    int i12 = t2Var.f47815a;
                    int layoutDirection = getLayoutDirection();
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i12, layoutDirection) & 7;
                    if (absoluteGravity2 != 1 && absoluteGravity2 != 3 && absoluteGravity2 != 5) {
                        absoluteGravity2 = layoutDirection == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i13 = childCount - 1; i13 >= 0; i13--) {
            View childAt2 = getChildAt(i13);
            t2 t2Var2 = (t2) childAt2.getLayoutParams();
            if (t2Var2.f47816b == 0 && s(childAt2)) {
                int i14 = t2Var2.f47815a;
                int layoutDirection2 = getLayoutDirection();
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i14, layoutDirection2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = layoutDirection2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    @Override // m0.n
    public final void addMenuProvider(r rVar) {
        q qVar = this.G;
        qVar.f45737b.add(rVar);
        qVar.f45736a.run();
    }

    public final void b(View view, boolean z10) {
        t2 t2VarI;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            t2VarI = h();
        } else {
            t2VarI = !checkLayoutParams(layoutParams) ? i(layoutParams) : (t2) layoutParams;
        }
        t2VarI.f47816b = 1;
        if (!z10 || this.f3978i == null) {
            addView(view, t2VarI);
        } else {
            view.setLayoutParams(t2VarI);
            this.E.add(view);
        }
    }

    public final void c() {
        if (this.f3977h == null) {
            x xVar = new x(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.f3977h = xVar;
            xVar.setImageDrawable(this.f3975f);
            this.f3977h.setContentDescription(this.f3976g);
            t2 t2VarH = h();
            t2VarH.f47815a = (this.f3982n & InterfaceC0435l1.d.b.f29113j) | 8388611;
            t2VarH.f47816b = 2;
            this.f3977h.setLayoutParams(t2VarH);
            this.f3977h.setOnClickListener(new k.a(this, 2));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof t2);
    }

    public final void d() {
        if (this.f3988t == null) {
            j2 j2Var = new j2();
            j2Var.f47700a = 0;
            j2Var.f47701b = 0;
            j2Var.f47702c = Integer.MIN_VALUE;
            j2Var.f47703d = Integer.MIN_VALUE;
            j2Var.f47704e = 0;
            j2Var.f47705f = 0;
            j2Var.f47706g = false;
            j2Var.f47707h = false;
            this.f3988t = j2Var;
        }
    }

    public final void e() {
        f();
        ActionMenuView actionMenuView = this.f3970a;
        if (actionMenuView.f3919p == null) {
            m mVar = (m) actionMenuView.getMenu();
            if (this.L == null) {
                this.L = new s2(this);
            }
            this.f3970a.setExpandedActionViewsExclusive(true);
            mVar.b(this.L, this.f3979j);
            t();
        }
    }

    public final void f() {
        if (this.f3970a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f3970a = actionMenuView;
            actionMenuView.setPopupTheme(this.f3980k);
            this.f3970a.setOnMenuItemClickListener(this.I);
            ActionMenuView actionMenuView2 = this.f3970a;
            g gVar = new g(this, 5);
            actionMenuView2.getClass();
            actionMenuView2.f3924u = gVar;
            t2 t2VarH = h();
            t2VarH.f47815a = (this.f3982n & InterfaceC0435l1.d.b.f29113j) | 8388613;
            this.f3970a.setLayoutParams(t2VarH);
            b(this.f3970a, false);
        }
    }

    public final void g() {
        if (this.f3973d == null) {
            this.f3973d = new x(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            t2 t2VarH = h();
            t2VarH.f47815a = (this.f3982n & InterfaceC0435l1.d.b.f29113j) | 8388611;
            this.f3973d.setLayoutParams(t2VarH);
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return h();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return i(layoutParams);
    }

    @Nullable
    public CharSequence getCollapseContentDescription() {
        x xVar = this.f3977h;
        if (xVar != null) {
            return xVar.getContentDescription();
        }
        return null;
    }

    @Nullable
    public Drawable getCollapseIcon() {
        x xVar = this.f3977h;
        if (xVar != null) {
            return xVar.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        j2 j2Var = this.f3988t;
        if (j2Var != null) {
            return j2Var.f47706g ? j2Var.f47700a : j2Var.f47701b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i10 = this.f3990v;
        return i10 != Integer.MIN_VALUE ? i10 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        j2 j2Var = this.f3988t;
        if (j2Var != null) {
            return j2Var.f47700a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        j2 j2Var = this.f3988t;
        if (j2Var != null) {
            return j2Var.f47701b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        j2 j2Var = this.f3988t;
        if (j2Var != null) {
            return j2Var.f47706g ? j2Var.f47701b : j2Var.f47700a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i10 = this.f3989u;
        return i10 != Integer.MIN_VALUE ? i10 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        m mVar;
        ActionMenuView actionMenuView = this.f3970a;
        return (actionMenuView == null || (mVar = actionMenuView.f3919p) == null || !mVar.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.f3990v, 0));
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f3989u, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        AppCompatImageView appCompatImageView = this.f3974e;
        if (appCompatImageView != null) {
            return appCompatImageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        AppCompatImageView appCompatImageView = this.f3974e;
        if (appCompatImageView != null) {
            return appCompatImageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.f3970a.getMenu();
    }

    @Nullable
    public View getNavButtonView() {
        return this.f3973d;
    }

    @Nullable
    public CharSequence getNavigationContentDescription() {
        x xVar = this.f3973d;
        if (xVar != null) {
            return xVar.getContentDescription();
        }
        return null;
    }

    @Nullable
    public Drawable getNavigationIcon() {
        x xVar = this.f3973d;
        if (xVar != null) {
            return xVar.getDrawable();
        }
        return null;
    }

    public j getOuterActionMenuPresenter() {
        return this.K;
    }

    @Nullable
    public Drawable getOverflowIcon() {
        e();
        return this.f3970a.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f3979j;
    }

    public int getPopupTheme() {
        return this.f3980k;
    }

    public CharSequence getSubtitle() {
        return this.f3993y;
    }

    @Nullable
    public final TextView getSubtitleTextView() {
        return this.f3972c;
    }

    public CharSequence getTitle() {
        return this.f3992x;
    }

    public int getTitleMarginBottom() {
        return this.f3987s;
    }

    public int getTitleMarginEnd() {
        return this.f3985q;
    }

    public int getTitleMarginStart() {
        return this.f3984p;
    }

    public int getTitleMarginTop() {
        return this.f3986r;
    }

    @Nullable
    public final TextView getTitleTextView() {
        return this.f3971b;
    }

    public f1 getWrapper() {
        Drawable drawable;
        if (this.J == null) {
            x2 x2Var = new x2();
            x2Var.f47866n = 0;
            x2Var.f47854a = this;
            x2Var.f47861h = getTitle();
            x2Var.f47862i = getSubtitle();
            x2Var.f47860g = x2Var.f47861h != null;
            x2Var.f47859f = getNavigationIcon();
            k kVarZ = k.z(getContext(), null, a.f43517a, R.attr.actionBarStyle);
            TypedArray typedArray = (TypedArray) kVarZ.f41771c;
            x2Var.f47867o = kVarZ.s(15);
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                x2Var.f47860g = true;
                x2Var.f47861h = text;
                if ((x2Var.f47855b & 8) != 0) {
                    setTitle(text);
                    if (x2Var.f47860g) {
                        s0.g(getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                x2Var.f47862i = text2;
                if ((x2Var.f47855b & 8) != 0) {
                    setSubtitle(text2);
                }
            }
            Drawable drawableS = kVarZ.s(20);
            if (drawableS != null) {
                x2Var.f47858e = drawableS;
                x2Var.c();
            }
            Drawable drawableS2 = kVarZ.s(17);
            if (drawableS2 != null) {
                x2Var.f47857d = drawableS2;
                x2Var.c();
            }
            if (x2Var.f47859f == null && (drawable = x2Var.f47867o) != null) {
                x2Var.f47859f = drawable;
                if ((x2Var.f47855b & 4) != 0) {
                    setNavigationIcon(drawable);
                } else {
                    setNavigationIcon((Drawable) null);
                }
            }
            x2Var.a(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View viewInflate = LayoutInflater.from(getContext()).inflate(resourceId, (ViewGroup) this, false);
                View view = x2Var.f47856c;
                if (view != null && (x2Var.f47855b & 16) != 0) {
                    removeView(view);
                }
                x2Var.f47856c = viewInflate;
                if (viewInflate != null && (x2Var.f47855b & 16) != 0) {
                    addView(viewInflate);
                }
                x2Var.a(x2Var.f47855b | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                layoutParams.height = layoutDimension;
                setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(7, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(3, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                int iMax = Math.max(dimensionPixelOffset, 0);
                int iMax2 = Math.max(dimensionPixelOffset2, 0);
                d();
                this.f3988t.a(iMax, iMax2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = getContext();
                this.l = resourceId2;
                x0 x0Var = this.f3971b;
                if (x0Var != null) {
                    x0Var.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = getContext();
                this.f3981m = resourceId3;
                x0 x0Var2 = this.f3972c;
                if (x0Var2 != null) {
                    x0Var2.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                setPopupTheme(resourceId4);
            }
            kVarZ.B();
            if (R.string.abc_action_bar_up_description != x2Var.f47866n) {
                x2Var.f47866n = R.string.abc_action_bar_up_description;
                if (TextUtils.isEmpty(getNavigationContentDescription())) {
                    int i10 = x2Var.f47866n;
                    x2Var.f47863j = i10 != 0 ? getContext().getString(i10) : null;
                    x2Var.b();
                }
            }
            x2Var.f47863j = getNavigationContentDescription();
            setNavigationOnClickListener(new w2(x2Var));
            this.J = x2Var;
        }
        return this.J;
    }

    public final int j(View view, int i10) {
        t2 t2Var = (t2) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i11 = i10 > 0 ? (measuredHeight - i10) / 2 : 0;
        int i12 = t2Var.f47815a & InterfaceC0435l1.d.b.f29113j;
        if (i12 != 16 && i12 != 48 && i12 != 80) {
            i12 = this.f3991w & InterfaceC0435l1.d.b.f29113j;
        }
        if (i12 == 48) {
            return getPaddingTop() - i11;
        }
        if (i12 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) t2Var).bottomMargin) - i11;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i13 = ((ViewGroup.MarginLayoutParams) t2Var).topMargin;
        if (iMax < i13) {
            iMax = i13;
        } else {
            int i14 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i15 = ((ViewGroup.MarginLayoutParams) t2Var).bottomMargin;
            if (i14 < i15) {
                iMax = Math.max(0, iMax - (i15 - i14));
            }
        }
        return paddingTop + iMax;
    }

    public final void m() {
        Iterator it = this.H.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(((MenuItem) it.next()).getItemId());
        }
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        MenuInflater menuInflater = getMenuInflater();
        Iterator it2 = this.G.f45737b.iterator();
        while (it2.hasNext()) {
            ((androidx.fragment.app.x0) ((r) it2.next())).f4504a.k(menu, menuInflater);
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.H = currentMenuItems2;
    }

    public final boolean n(View view) {
        return view.getParent() == this || this.E.contains(view);
    }

    public final int o(View view, int i10, int i11, int[] iArr) {
        t2 t2Var = (t2) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) t2Var).leftMargin - iArr[0];
        int iMax = Math.max(0, i12) + i10;
        iArr[0] = Math.max(0, -i12);
        int iJ = j(view, i11);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iJ, iMax + measuredWidth, view.getMeasuredHeight() + iJ);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) t2Var).rightMargin + iMax;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        t();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.Q);
        t();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.C = false;
        }
        if (!this.C) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.C = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.C = false;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x027d  */
    /* JADX WARN: Code duplicated, block: B:103:0x028f A[LOOP:0: B:102:0x028d->B:103:0x028f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:106:0x02a7 A[LOOP:1: B:105:0x02a5->B:106:0x02a7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:109:0x02c7 A[LOOP:2: B:108:0x02c5->B:109:0x02c7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:113:0x030d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:114:0x030f  */
    /* JADX WARN: Code duplicated, block: B:115:0x0313  */
    /* JADX WARN: Code duplicated, block: B:118:0x031a A[LOOP:3: B:117:0x0318->B:118:0x031a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x0062 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x0064  */
    /* JADX WARN: Code duplicated, block: B:21:0x006b  */
    /* JADX WARN: Code duplicated, block: B:24:0x0079 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x007b  */
    /* JADX WARN: Code duplicated, block: B:26:0x0082  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:31:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:34:0x00cd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:40:0x0101  */
    /* JADX WARN: Code duplicated, block: B:42:0x0106  */
    /* JADX WARN: Code duplicated, block: B:43:0x011f  */
    /* JADX WARN: Code duplicated, block: B:46:0x0125 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x0127  */
    /* JADX WARN: Code duplicated, block: B:48:0x012a  */
    /* JADX WARN: Code duplicated, block: B:50:0x012e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0131  */
    /* JADX WARN: Code duplicated, block: B:54:0x0143  */
    /* JADX WARN: Code duplicated, block: B:56:0x014b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:63:0x0164  */
    /* JADX WARN: Code duplicated, block: B:65:0x0168  */
    /* JADX WARN: Code duplicated, block: B:67:0x0179  */
    /* JADX WARN: Code duplicated, block: B:68:0x017b  */
    /* JADX WARN: Code duplicated, block: B:70:0x0187  */
    /* JADX WARN: Code duplicated, block: B:72:0x0193  */
    /* JADX WARN: Code duplicated, block: B:73:0x019d  */
    /* JADX WARN: Code duplicated, block: B:75:0x01aa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:77:0x01af  */
    /* JADX WARN: Code duplicated, block: B:80:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:81:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:83:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:84:0x020d  */
    /* JADX WARN: Code duplicated, block: B:86:0x0210  */
    /* JADX WARN: Code duplicated, block: B:88:0x0218 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:89:0x021a  */
    /* JADX WARN: Code duplicated, block: B:91:0x021e  */
    /* JADX WARN: Code duplicated, block: B:94:0x0232  */
    /* JADX WARN: Code duplicated, block: B:95:0x0255  */
    /* JADX WARN: Code duplicated, block: B:97:0x0258  */
    /* JADX WARN: Code duplicated, block: B:98:0x027a  */
    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int iO;
        int iP;
        int iMax;
        int iMin;
        boolean zS;
        boolean zS2;
        int measuredHeight;
        x0 x0Var;
        x0 x0Var2;
        t2 t2Var;
        t2 t2Var2;
        int i14;
        boolean z11;
        int i15;
        int i16;
        int paddingTop;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int iMax2;
        int i23;
        int i24;
        int i25;
        int i26;
        ArrayList arrayList;
        int size;
        int iO2;
        int i27;
        int size2;
        int i28;
        int i29;
        int size3;
        int i30;
        int i31;
        int measuredWidth;
        int i32;
        int i33;
        int i34;
        int size4;
        boolean z12 = getLayoutDirection() == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i35 = width - paddingRight;
        int[] iArr = this.F;
        iArr[1] = 0;
        iArr[0] = 0;
        WeakHashMap weakHashMap = s0.f45746a;
        int minimumHeight = getMinimumHeight();
        int iMin2 = minimumHeight >= 0 ? Math.min(minimumHeight, i13 - i11) : 0;
        if (s(this.f3973d)) {
            if (z12) {
                iP = p(this.f3973d, i35, iMin2, iArr);
                iO = paddingLeft;
            } else {
                iO = o(this.f3973d, paddingLeft, iMin2, iArr);
            }
            if (s(this.f3977h)) {
                if (z12) {
                    iP = p(this.f3977h, iP, iMin2, iArr);
                } else {
                    iO = o(this.f3977h, iO, iMin2, iArr);
                }
            }
            if (s(this.f3970a)) {
                if (z12) {
                    iO = o(this.f3970a, iO, iMin2, iArr);
                } else {
                    iP = p(this.f3970a, iP, iMin2, iArr);
                }
            }
            int currentContentInsetLeft = getCurrentContentInsetLeft();
            int currentContentInsetRight = getCurrentContentInsetRight();
            iArr[0] = Math.max(0, currentContentInsetLeft - iO);
            iArr[1] = Math.max(0, currentContentInsetRight - (i35 - iP));
            iMax = Math.max(iO, currentContentInsetLeft);
            iMin = Math.min(iP, i35 - currentContentInsetRight);
            if (s(this.f3978i)) {
                if (z12) {
                    iMin = p(this.f3978i, iMin, iMin2, iArr);
                } else {
                    iMax = o(this.f3978i, iMax, iMin2, iArr);
                }
            }
            if (s(this.f3974e)) {
                if (z12) {
                    iMin = p(this.f3974e, iMin, iMin2, iArr);
                } else {
                    iMax = o(this.f3974e, iMax, iMin2, iArr);
                }
            }
            zS = s(this.f3971b);
            zS2 = s(this.f3972c);
            if (zS) {
                t2 t2Var3 = (t2) this.f3971b.getLayoutParams();
                measuredHeight = this.f3971b.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) t2Var3).topMargin + ((ViewGroup.MarginLayoutParams) t2Var3).bottomMargin;
            } else {
                measuredHeight = 0;
            }
            if (zS2) {
                t2 t2Var4 = (t2) this.f3972c.getLayoutParams();
                measuredHeight = this.f3972c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) t2Var4).topMargin + ((ViewGroup.MarginLayoutParams) t2Var4).bottomMargin + measuredHeight;
            }
            if (zS || zS2) {
                if (zS) {
                    x0Var = this.f3971b;
                } else {
                    x0Var = this.f3972c;
                }
                if (zS2) {
                    x0Var2 = this.f3972c;
                } else {
                    x0Var2 = this.f3971b;
                }
                t2Var = (t2) x0Var.getLayoutParams();
                t2Var2 = (t2) x0Var2.getLayoutParams();
                i14 = measuredHeight;
                z11 = (!zS && this.f3971b.getMeasuredWidth() > 0) || (zS2 && this.f3972c.getMeasuredWidth() > 0);
                i15 = this.f3991w & InterfaceC0435l1.d.b.f29113j;
                i16 = iMax;
                if (i15 == 48) {
                    paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) t2Var).topMargin + this.f3986r;
                } else if (i15 != 80) {
                    iMax2 = (((height - paddingTop2) - paddingBottom) - i14) / 2;
                    i23 = ((ViewGroup.MarginLayoutParams) t2Var).topMargin + this.f3986r;
                    if (iMax2 < i23) {
                        iMax2 = i23;
                    } else {
                        i24 = (((height - paddingBottom) - i14) - iMax2) - paddingTop2;
                        i25 = ((ViewGroup.MarginLayoutParams) t2Var).bottomMargin;
                        i26 = this.f3987s;
                        if (i24 < i25 + i26) {
                            iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) t2Var2).bottomMargin + i26) - i24));
                        }
                    }
                    paddingTop = paddingTop2 + iMax2;
                } else {
                    paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) t2Var2).bottomMargin) - this.f3987s) - i14;
                }
                if (z12) {
                    if (z11) {
                        i20 = this.f3984p;
                    } else {
                        i20 = 0;
                    }
                    int i36 = i20 - iArr[1];
                    iMin -= Math.max(0, i36);
                    iArr[1] = Math.max(0, -i36);
                    if (zS) {
                        t2 t2Var5 = (t2) this.f3971b.getLayoutParams();
                        int measuredWidth2 = iMin - this.f3971b.getMeasuredWidth();
                        int measuredHeight2 = this.f3971b.getMeasuredHeight() + paddingTop;
                        this.f3971b.layout(measuredWidth2, paddingTop, iMin, measuredHeight2);
                        i21 = measuredWidth2 - this.f3985q;
                        paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) t2Var5).bottomMargin;
                    } else {
                        i21 = iMin;
                    }
                    if (zS2) {
                        int i37 = paddingTop + ((ViewGroup.MarginLayoutParams) ((t2) this.f3972c.getLayoutParams())).topMargin;
                        this.f3972c.layout(iMin - this.f3972c.getMeasuredWidth(), i37, iMin, this.f3972c.getMeasuredHeight() + i37);
                        i22 = iMin - this.f3985q;
                    } else {
                        i22 = iMin;
                    }
                    if (z11) {
                        iMin = Math.min(i21, i22);
                    }
                    iMax = i16;
                } else {
                    if (z11) {
                        i17 = this.f3984p;
                    } else {
                        i17 = 0;
                    }
                    int i38 = i17 - iArr[0];
                    iMax = Math.max(0, i38) + i16;
                    iArr[0] = Math.max(0, -i38);
                    if (zS) {
                        t2 t2Var6 = (t2) this.f3971b.getLayoutParams();
                        int measuredWidth3 = this.f3971b.getMeasuredWidth() + iMax;
                        int measuredHeight3 = this.f3971b.getMeasuredHeight() + paddingTop;
                        this.f3971b.layout(iMax, paddingTop, measuredWidth3, measuredHeight3);
                        i18 = measuredWidth3 + this.f3985q;
                        paddingTop = measuredHeight3 + ((ViewGroup.MarginLayoutParams) t2Var6).bottomMargin;
                    } else {
                        i18 = iMax;
                    }
                    if (zS2) {
                        int i39 = paddingTop + ((ViewGroup.MarginLayoutParams) ((t2) this.f3972c.getLayoutParams())).topMargin;
                        int measuredWidth4 = this.f3972c.getMeasuredWidth() + iMax;
                        this.f3972c.layout(iMax, i39, measuredWidth4, this.f3972c.getMeasuredHeight() + i39);
                        i19 = measuredWidth4 + this.f3985q;
                    } else {
                        i19 = iMax;
                    }
                    if (z11) {
                        iMax = Math.max(i18, i19);
                    }
                }
            }
            arrayList = this.D;
            a(arrayList, 3);
            size = arrayList.size();
            iO2 = iMax;
            for (i27 = 0; i27 < size; i27++) {
                iO2 = o((View) arrayList.get(i27), iO2, iMin2, iArr);
            }
            a(arrayList, 5);
            size2 = arrayList.size();
            for (i28 = 0; i28 < size2; i28++) {
                iMin = p((View) arrayList.get(i28), iMin, iMin2, iArr);
            }
            a(arrayList, 1);
            int i40 = iArr[0];
            i29 = iArr[1];
            size3 = arrayList.size();
            i30 = i40;
            i31 = 0;
            measuredWidth = 0;
            while (i31 < size3) {
                View view = (View) arrayList.get(i31);
                t2 t2Var7 = (t2) view.getLayoutParams();
                int i41 = i29;
                int i42 = ((ViewGroup.MarginLayoutParams) t2Var7).leftMargin - i30;
                int i43 = ((ViewGroup.MarginLayoutParams) t2Var7).rightMargin - i41;
                int iMax3 = Math.max(0, i42);
                int iMax4 = Math.max(0, i43);
                int iMax5 = Math.max(0, -i42);
                int iMax6 = Math.max(0, -i43);
                measuredWidth += view.getMeasuredWidth() + iMax3 + iMax4;
                i31++;
                i30 = iMax5;
                i29 = iMax6;
            }
            i33 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (measuredWidth / 2);
            i34 = measuredWidth + i33;
            if (i33 >= iO2) {
                if (i34 > iMin) {
                    iO2 = i33 - (i34 - iMin);
                } else {
                    iO2 = i33;
                }
            }
            size4 = arrayList.size();
            for (i32 = 0; i32 < size4; i32++) {
                iO2 = o((View) arrayList.get(i32), iO2, iMin2, iArr);
            }
            arrayList.clear();
        }
        iO = paddingLeft;
        iP = i35;
        if (s(this.f3977h)) {
            if (z12) {
                iP = p(this.f3977h, iP, iMin2, iArr);
            } else {
                iO = o(this.f3977h, iO, iMin2, iArr);
            }
        }
        if (s(this.f3970a)) {
            if (z12) {
                iO = o(this.f3970a, iO, iMin2, iArr);
            } else {
                iP = p(this.f3970a, iP, iMin2, iArr);
            }
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - iO);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i35 - iP));
        iMax = Math.max(iO, currentContentInsetLeft2);
        iMin = Math.min(iP, i35 - currentContentInsetRight2);
        if (s(this.f3978i)) {
            if (z12) {
                iMin = p(this.f3978i, iMin, iMin2, iArr);
            } else {
                iMax = o(this.f3978i, iMax, iMin2, iArr);
            }
        }
        if (s(this.f3974e)) {
            if (z12) {
                iMin = p(this.f3974e, iMin, iMin2, iArr);
            } else {
                iMax = o(this.f3974e, iMax, iMin2, iArr);
            }
        }
        zS = s(this.f3971b);
        zS2 = s(this.f3972c);
        if (zS) {
            t2 t2Var8 = (t2) this.f3971b.getLayoutParams();
            measuredHeight = this.f3971b.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) t2Var8).topMargin + ((ViewGroup.MarginLayoutParams) t2Var8).bottomMargin;
        } else {
            measuredHeight = 0;
        }
        if (zS2) {
            t2 t2Var9 = (t2) this.f3972c.getLayoutParams();
            measuredHeight = this.f3972c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) t2Var9).topMargin + ((ViewGroup.MarginLayoutParams) t2Var9).bottomMargin + measuredHeight;
        }
        if (zS) {
            if (zS) {
                x0Var = this.f3971b;
            } else {
                x0Var = this.f3972c;
            }
            if (zS2) {
                x0Var2 = this.f3972c;
            } else {
                x0Var2 = this.f3971b;
            }
            t2Var = (t2) x0Var.getLayoutParams();
            t2Var2 = (t2) x0Var2.getLayoutParams();
            i14 = measuredHeight;
            if (zS) {
            }
            i15 = this.f3991w & InterfaceC0435l1.d.b.f29113j;
            i16 = iMax;
            if (i15 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) t2Var).topMargin + this.f3986r;
            } else if (i15 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - i14) / 2;
                i23 = ((ViewGroup.MarginLayoutParams) t2Var).topMargin + this.f3986r;
                if (iMax2 < i23) {
                    iMax2 = i23;
                } else {
                    i24 = (((height - paddingBottom) - i14) - iMax2) - paddingTop2;
                    i25 = ((ViewGroup.MarginLayoutParams) t2Var).bottomMargin;
                    i26 = this.f3987s;
                    if (i24 < i25 + i26) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) t2Var2).bottomMargin + i26) - i24));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) t2Var2).bottomMargin) - this.f3987s) - i14;
            }
            if (z12) {
                if (z11) {
                    i20 = this.f3984p;
                } else {
                    i20 = 0;
                }
                int i310 = i20 - iArr[1];
                iMin -= Math.max(0, i310);
                iArr[1] = Math.max(0, -i310);
                if (zS) {
                    t2 t2Var10 = (t2) this.f3971b.getLayoutParams();
                    int measuredWidth5 = iMin - this.f3971b.getMeasuredWidth();
                    int measuredHeight4 = this.f3971b.getMeasuredHeight() + paddingTop;
                    this.f3971b.layout(measuredWidth5, paddingTop, iMin, measuredHeight4);
                    i21 = measuredWidth5 - this.f3985q;
                    paddingTop = measuredHeight4 + ((ViewGroup.MarginLayoutParams) t2Var10).bottomMargin;
                } else {
                    i21 = iMin;
                }
                if (zS2) {
                    int i311 = paddingTop + ((ViewGroup.MarginLayoutParams) ((t2) this.f3972c.getLayoutParams())).topMargin;
                    this.f3972c.layout(iMin - this.f3972c.getMeasuredWidth(), i311, iMin, this.f3972c.getMeasuredHeight() + i311);
                    i22 = iMin - this.f3985q;
                } else {
                    i22 = iMin;
                }
                if (z11) {
                    iMin = Math.min(i21, i22);
                }
                iMax = i16;
            } else {
                if (z11) {
                    i17 = this.f3984p;
                } else {
                    i17 = 0;
                }
                int i312 = i17 - iArr[0];
                iMax = Math.max(0, i312) + i16;
                iArr[0] = Math.max(0, -i312);
                if (zS) {
                    t2 t2Var11 = (t2) this.f3971b.getLayoutParams();
                    int measuredWidth6 = this.f3971b.getMeasuredWidth() + iMax;
                    int measuredHeight5 = this.f3971b.getMeasuredHeight() + paddingTop;
                    this.f3971b.layout(iMax, paddingTop, measuredWidth6, measuredHeight5);
                    i18 = measuredWidth6 + this.f3985q;
                    paddingTop = measuredHeight5 + ((ViewGroup.MarginLayoutParams) t2Var11).bottomMargin;
                } else {
                    i18 = iMax;
                }
                if (zS2) {
                    int i313 = paddingTop + ((ViewGroup.MarginLayoutParams) ((t2) this.f3972c.getLayoutParams())).topMargin;
                    int measuredWidth7 = this.f3972c.getMeasuredWidth() + iMax;
                    this.f3972c.layout(iMax, i313, measuredWidth7, this.f3972c.getMeasuredHeight() + i313);
                    i19 = measuredWidth7 + this.f3985q;
                } else {
                    i19 = iMax;
                }
                if (z11) {
                    iMax = Math.max(i18, i19);
                }
            }
        } else {
            if (zS) {
                x0Var = this.f3971b;
            } else {
                x0Var = this.f3972c;
            }
            if (zS2) {
                x0Var2 = this.f3972c;
            } else {
                x0Var2 = this.f3971b;
            }
            t2Var = (t2) x0Var.getLayoutParams();
            t2Var2 = (t2) x0Var2.getLayoutParams();
            i14 = measuredHeight;
            if (zS) {
            }
            i15 = this.f3991w & InterfaceC0435l1.d.b.f29113j;
            i16 = iMax;
            if (i15 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) t2Var).topMargin + this.f3986r;
            } else if (i15 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - i14) / 2;
                i23 = ((ViewGroup.MarginLayoutParams) t2Var).topMargin + this.f3986r;
                if (iMax2 < i23) {
                    iMax2 = i23;
                } else {
                    i24 = (((height - paddingBottom) - i14) - iMax2) - paddingTop2;
                    i25 = ((ViewGroup.MarginLayoutParams) t2Var).bottomMargin;
                    i26 = this.f3987s;
                    if (i24 < i25 + i26) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) t2Var2).bottomMargin + i26) - i24));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) t2Var2).bottomMargin) - this.f3987s) - i14;
            }
            if (z12) {
                if (z11) {
                    i20 = this.f3984p;
                } else {
                    i20 = 0;
                }
                int i314 = i20 - iArr[1];
                iMin -= Math.max(0, i314);
                iArr[1] = Math.max(0, -i314);
                if (zS) {
                    t2 t2Var12 = (t2) this.f3971b.getLayoutParams();
                    int measuredWidth8 = iMin - this.f3971b.getMeasuredWidth();
                    int measuredHeight6 = this.f3971b.getMeasuredHeight() + paddingTop;
                    this.f3971b.layout(measuredWidth8, paddingTop, iMin, measuredHeight6);
                    i21 = measuredWidth8 - this.f3985q;
                    paddingTop = measuredHeight6 + ((ViewGroup.MarginLayoutParams) t2Var12).bottomMargin;
                } else {
                    i21 = iMin;
                }
                if (zS2) {
                    int i315 = paddingTop + ((ViewGroup.MarginLayoutParams) ((t2) this.f3972c.getLayoutParams())).topMargin;
                    this.f3972c.layout(iMin - this.f3972c.getMeasuredWidth(), i315, iMin, this.f3972c.getMeasuredHeight() + i315);
                    i22 = iMin - this.f3985q;
                } else {
                    i22 = iMin;
                }
                if (z11) {
                    iMin = Math.min(i21, i22);
                }
                iMax = i16;
            } else {
                if (z11) {
                    i17 = this.f3984p;
                } else {
                    i17 = 0;
                }
                int i316 = i17 - iArr[0];
                iMax = Math.max(0, i316) + i16;
                iArr[0] = Math.max(0, -i316);
                if (zS) {
                    t2 t2Var13 = (t2) this.f3971b.getLayoutParams();
                    int measuredWidth9 = this.f3971b.getMeasuredWidth() + iMax;
                    int measuredHeight7 = this.f3971b.getMeasuredHeight() + paddingTop;
                    this.f3971b.layout(iMax, paddingTop, measuredWidth9, measuredHeight7);
                    i18 = measuredWidth9 + this.f3985q;
                    paddingTop = measuredHeight7 + ((ViewGroup.MarginLayoutParams) t2Var13).bottomMargin;
                } else {
                    i18 = iMax;
                }
                if (zS2) {
                    int i317 = paddingTop + ((ViewGroup.MarginLayoutParams) ((t2) this.f3972c.getLayoutParams())).topMargin;
                    int measuredWidth10 = this.f3972c.getMeasuredWidth() + iMax;
                    this.f3972c.layout(iMax, i317, measuredWidth10, this.f3972c.getMeasuredHeight() + i317);
                    i19 = measuredWidth10 + this.f3985q;
                } else {
                    i19 = iMax;
                }
                if (z11) {
                    iMax = Math.max(i18, i19);
                }
            }
        }
        arrayList = this.D;
        a(arrayList, 3);
        size = arrayList.size();
        iO2 = iMax;
        while (i27 < size) {
            iO2 = o((View) arrayList.get(i27), iO2, iMin2, iArr);
        }
        a(arrayList, 5);
        size2 = arrayList.size();
        while (i28 < size2) {
            iMin = p((View) arrayList.get(i28), iMin, iMin2, iArr);
        }
        a(arrayList, 1);
        int i44 = iArr[0];
        i29 = iArr[1];
        size3 = arrayList.size();
        i30 = i44;
        i31 = 0;
        measuredWidth = 0;
        while (i31 < size3) {
            View view2 = (View) arrayList.get(i31);
            t2 t2Var14 = (t2) view2.getLayoutParams();
            int i45 = i29;
            int i46 = ((ViewGroup.MarginLayoutParams) t2Var14).leftMargin - i30;
            int i47 = ((ViewGroup.MarginLayoutParams) t2Var14).rightMargin - i45;
            int iMax7 = Math.max(0, i46);
            int iMax8 = Math.max(0, i47);
            int iMax9 = Math.max(0, -i46);
            int iMax10 = Math.max(0, -i47);
            measuredWidth += view2.getMeasuredWidth() + iMax7 + iMax8;
            i31++;
            i30 = iMax9;
            i29 = iMax10;
        }
        i33 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (measuredWidth / 2);
        i34 = measuredWidth + i33;
        if (i33 >= iO2) {
            if (i34 > iMin) {
                iO2 = i33 - (i34 - iMin);
            } else {
                iO2 = i33;
            }
        }
        size4 = arrayList.size();
        while (i32 < size4) {
            iO2 = o((View) arrayList.get(i32), iO2, iMin2, iArr);
        }
        arrayList.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        byte b10;
        byte b11;
        int iK;
        int iMax;
        int iCombineMeasuredStates;
        int iK2;
        int iL;
        int iCombineMeasuredStates2;
        int iMax2;
        int i12 = 0;
        if (getLayoutDirection() == 1) {
            b11 = true;
            b10 = 0;
        } else {
            b10 = 1;
            b11 = false;
        }
        if (s(this.f3973d)) {
            r(this.f3973d, i10, 0, i11, this.f3983o);
            iK = k(this.f3973d) + this.f3973d.getMeasuredWidth();
            iMax = Math.max(0, l(this.f3973d) + this.f3973d.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.f3973d.getMeasuredState());
        } else {
            iK = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (s(this.f3977h)) {
            r(this.f3977h, i10, 0, i11, this.f3983o);
            iK = k(this.f3977h) + this.f3977h.getMeasuredWidth();
            iMax = Math.max(iMax, l(this.f3977h) + this.f3977h.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f3977h.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, iK);
        int iMax4 = Math.max(0, currentContentInsetStart - iK);
        byte b12 = b11;
        int[] iArr = this.F;
        iArr[b12 == true ? 1 : 0] = iMax4;
        if (s(this.f3970a)) {
            r(this.f3970a, i10, iMax3, i11, this.f3983o);
            iK2 = k(this.f3970a) + this.f3970a.getMeasuredWidth();
            iMax = Math.max(iMax, l(this.f3970a) + this.f3970a.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f3970a.getMeasuredState());
        } else {
            iK2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax5 = iMax3 + Math.max(currentContentInsetEnd, iK2);
        iArr[b10] = Math.max(0, currentContentInsetEnd - iK2);
        if (s(this.f3978i)) {
            iMax5 += q(this.f3978i, i10, iMax5, i11, 0, iArr);
            iMax = Math.max(iMax, l(this.f3978i) + this.f3978i.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f3978i.getMeasuredState());
        }
        if (s(this.f3974e)) {
            iMax5 += q(this.f3974e, i10, iMax5, i11, 0, iArr);
            iMax = Math.max(iMax, l(this.f3974e) + this.f3974e.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f3974e.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (((t2) childAt.getLayoutParams()).f47816b == 0 && s(childAt)) {
                iMax5 += q(childAt, i10, iMax5, i11, 0, iArr);
                int iMax6 = Math.max(iMax, l(childAt) + childAt.getMeasuredHeight());
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
                iMax = iMax6;
            } else {
                iMax5 = iMax5;
            }
        }
        int i14 = iMax5;
        int i15 = this.f3986r + this.f3987s;
        int i16 = this.f3984p + this.f3985q;
        if (s(this.f3971b)) {
            q(this.f3971b, i10, i14 + i16, i11, i15, iArr);
            int iK3 = k(this.f3971b) + this.f3971b.getMeasuredWidth();
            iL = l(this.f3971b) + this.f3971b.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f3971b.getMeasuredState());
            iMax2 = iK3;
        } else {
            iL = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
        }
        if (s(this.f3972c)) {
            iMax2 = Math.max(iMax2, q(this.f3972c, i10, i14 + i16, i11, i15 + iL, iArr));
            iL += l(this.f3972c) + this.f3972c.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.f3972c.getMeasuredState());
        }
        int iMax7 = Math.max(iMax, iL);
        int paddingRight = getPaddingRight() + getPaddingLeft() + i14 + iMax2;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + iMax7;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i10, (-16777216) & iCombineMeasuredStates2);
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i11, iCombineMeasuredStates2 << 16);
        if (!this.M) {
            i12 = iResolveSizeAndState2;
            break;
        }
        int childCount2 = getChildCount();
        for (int i17 = 0; i17 < childCount2; i17++) {
            View childAt2 = getChildAt(i17);
            if (s(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                i12 = iResolveSizeAndState2;
                break;
            }
        }
        setMeasuredDimension(iResolveSizeAndState, i12);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof v2)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        v2 v2Var = (v2) parcelable;
        super.onRestoreInstanceState(v2Var.f48514a);
        ActionMenuView actionMenuView = this.f3970a;
        m mVar = actionMenuView != null ? actionMenuView.f3919p : null;
        int i10 = v2Var.f47835c;
        if (i10 != 0 && this.L != null && mVar != null && (menuItemFindItem = mVar.findItem(i10)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (v2Var.f47836d) {
            a0 a0Var = this.Q;
            removeCallbacks(a0Var);
            post(a0Var);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        d();
        j2 j2Var = this.f3988t;
        boolean z10 = i10 == 1;
        if (z10 == j2Var.f47706g) {
            return;
        }
        j2Var.f47706g = z10;
        if (!j2Var.f47707h) {
            j2Var.f47700a = j2Var.f47704e;
            j2Var.f47701b = j2Var.f47705f;
            return;
        }
        if (z10) {
            int i11 = j2Var.f47703d;
            if (i11 == Integer.MIN_VALUE) {
                i11 = j2Var.f47704e;
            }
            j2Var.f47700a = i11;
            int i12 = j2Var.f47702c;
            if (i12 == Integer.MIN_VALUE) {
                i12 = j2Var.f47705f;
            }
            j2Var.f47701b = i12;
            return;
        }
        int i13 = j2Var.f47702c;
        if (i13 == Integer.MIN_VALUE) {
            i13 = j2Var.f47704e;
        }
        j2Var.f47700a = i13;
        int i14 = j2Var.f47703d;
        if (i14 == Integer.MIN_VALUE) {
            i14 = j2Var.f47705f;
        }
        j2Var.f47701b = i14;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        j jVar;
        o oVar;
        v2 v2Var = new v2(super.onSaveInstanceState());
        s2 s2Var = this.L;
        if (s2Var != null && (oVar = s2Var.f47809b) != null) {
            v2Var.f47835c = oVar.f46985a;
        }
        ActionMenuView actionMenuView = this.f3970a;
        v2Var.f47836d = (actionMenuView == null || (jVar = actionMenuView.f3923t) == null || !jVar.k()) ? false : true;
        return v2Var;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.B = false;
        }
        if (!this.B) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.B = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.B = false;
        return true;
    }

    public final int p(View view, int i10, int i11, int[] iArr) {
        t2 t2Var = (t2) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) t2Var).rightMargin - iArr[1];
        int iMax = i10 - Math.max(0, i12);
        iArr[1] = Math.max(0, -i12);
        int iJ = j(view, i11);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iJ, iMax, view.getMeasuredHeight() + iJ);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) t2Var).leftMargin);
    }

    public final int q(View view, int i10, int i11, int i12, int i13, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i14 = marginLayoutParams.leftMargin - iArr[0];
        int i15 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i15) + Math.max(0, i14);
        iArr[0] = Math.max(0, -i14);
        iArr[1] = Math.max(0, -i15);
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + iMax + i11, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i12, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    public final void r(View view, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i12, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i13 >= 0) {
            if (mode != 0) {
                i13 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i13);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i13, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    @Override // m0.n
    public final void removeMenuProvider(r rVar) {
        this.G.b(rVar);
    }

    public final boolean s(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public void setBackInvokedCallbackEnabled(boolean z10) {
        if (this.P != z10) {
            this.P = z10;
            t();
        }
    }

    public void setCollapseContentDescription(int i10) {
        setCollapseContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setCollapseIcon(int i10) {
        setCollapseIcon(com.google.android.gms.internal.auth.o.i(getContext(), i10));
    }

    public void setCollapsible(boolean z10) {
        this.M = z10;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i10) {
        if (i10 < 0) {
            i10 = Integer.MIN_VALUE;
        }
        if (i10 != this.f3990v) {
            this.f3990v = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i10) {
        if (i10 < 0) {
            i10 = Integer.MIN_VALUE;
        }
        if (i10 != this.f3989u) {
            this.f3989u = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i10) {
        setLogo(com.google.android.gms.internal.auth.o.i(getContext(), i10));
    }

    public void setLogoDescription(int i10) {
        setLogoDescription(getContext().getText(i10));
    }

    public void setNavigationContentDescription(int i10) {
        setNavigationContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setNavigationIcon(int i10) {
        setNavigationIcon(com.google.android.gms.internal.auth.o.i(getContext(), i10));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        g();
        this.f3973d.setOnClickListener(onClickListener);
    }

    public void setOverflowIcon(@Nullable Drawable drawable) {
        e();
        this.f3970a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i10) {
        if (this.f3980k != i10) {
            this.f3980k = i10;
            if (i10 == 0) {
                this.f3979j = getContext();
            } else {
                this.f3979j = new ContextThemeWrapper(getContext(), i10);
            }
        }
    }

    public void setSubtitle(int i10) {
        setSubtitle(getContext().getText(i10));
    }

    public void setSubtitleTextColor(int i10) {
        setSubtitleTextColor(ColorStateList.valueOf(i10));
    }

    public void setTitle(int i10) {
        setTitle(getContext().getText(i10));
    }

    public void setTitleMarginBottom(int i10) {
        this.f3987s = i10;
        requestLayout();
    }

    public void setTitleMarginEnd(int i10) {
        this.f3985q = i10;
        requestLayout();
    }

    public void setTitleMarginStart(int i10) {
        this.f3984p = i10;
        requestLayout();
    }

    public void setTitleMarginTop(int i10) {
        this.f3986r = i10;
        requestLayout();
    }

    public void setTitleTextColor(int i10) {
        setTitleTextColor(ColorStateList.valueOf(i10));
    }

    public final void t() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcherA = r2.a(this);
            s2 s2Var = this.L;
            boolean z10 = (s2Var == null || s2Var.f47809b == null || onBackInvokedDispatcherA == null || !isAttachedToWindow() || !this.P) ? false : true;
            if (z10 && this.O == null) {
                if (this.N == null) {
                    this.N = r2.b(new q2(this, 0));
                }
                r2.c(onBackInvokedDispatcherA, this.N);
                this.O = onBackInvokedDispatcherA;
                return;
            }
            if (z10 || (onBackInvokedDispatcher = this.O) == null) {
                return;
            }
            r2.d(onBackInvokedDispatcher, this.N);
            this.O = null;
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        t2 t2Var = new t2(context, attributeSet);
        t2Var.f47815a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f43518b);
        t2Var.f47815a = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        t2Var.f47816b = 0;
        return t2Var;
    }

    public void setCollapseContentDescription(@Nullable CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        x xVar = this.f3977h;
        if (xVar != null) {
            xVar.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(@Nullable Drawable drawable) {
        if (drawable != null) {
            c();
            this.f3977h.setImageDrawable(drawable);
        } else {
            x xVar = this.f3977h;
            if (xVar != null) {
                xVar.setImageDrawable(this.f3975f);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f3974e == null) {
                this.f3974e = new AppCompatImageView(getContext());
            }
            if (!n(this.f3974e)) {
                b(this.f3974e, true);
            }
        } else {
            AppCompatImageView appCompatImageView = this.f3974e;
            if (appCompatImageView != null && n(appCompatImageView)) {
                removeView(this.f3974e);
                this.E.remove(this.f3974e);
            }
        }
        AppCompatImageView appCompatImageView2 = this.f3974e;
        if (appCompatImageView2 != null) {
            appCompatImageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f3974e == null) {
            this.f3974e = new AppCompatImageView(getContext());
        }
        AppCompatImageView appCompatImageView = this.f3974e;
        if (appCompatImageView != null) {
            appCompatImageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(@Nullable CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        x xVar = this.f3973d;
        if (xVar != null) {
            xVar.setContentDescription(charSequence);
            y2.a(this.f3973d, charSequence);
        }
    }

    public void setNavigationIcon(@Nullable Drawable drawable) {
        if (drawable != null) {
            g();
            if (!n(this.f3973d)) {
                b(this.f3973d, true);
            }
        } else {
            x xVar = this.f3973d;
            if (xVar != null && n(xVar)) {
                removeView(this.f3973d);
                this.E.remove(this.f3973d);
            }
        }
        x xVar2 = this.f3973d;
        if (xVar2 != null) {
            xVar2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            x0 x0Var = this.f3972c;
            if (x0Var != null && n(x0Var)) {
                removeView(this.f3972c);
                this.E.remove(this.f3972c);
            }
        } else {
            if (this.f3972c == null) {
                Context context = getContext();
                x0 x0Var2 = new x0(context, null);
                this.f3972c = x0Var2;
                x0Var2.setSingleLine();
                this.f3972c.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.f3981m;
                if (i10 != 0) {
                    this.f3972c.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.A;
                if (colorStateList != null) {
                    this.f3972c.setTextColor(colorStateList);
                }
            }
            if (!n(this.f3972c)) {
                b(this.f3972c, true);
            }
        }
        x0 x0Var3 = this.f3972c;
        if (x0Var3 != null) {
            x0Var3.setText(charSequence);
        }
        this.f3993y = charSequence;
    }

    public void setSubtitleTextColor(@NonNull ColorStateList colorStateList) {
        this.A = colorStateList;
        x0 x0Var = this.f3972c;
        if (x0Var != null) {
            x0Var.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            x0 x0Var = this.f3971b;
            if (x0Var != null && n(x0Var)) {
                removeView(this.f3971b);
                this.E.remove(this.f3971b);
            }
        } else {
            if (this.f3971b == null) {
                Context context = getContext();
                x0 x0Var2 = new x0(context, null);
                this.f3971b = x0Var2;
                x0Var2.setSingleLine();
                this.f3971b.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.l;
                if (i10 != 0) {
                    this.f3971b.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.f3994z;
                if (colorStateList != null) {
                    this.f3971b.setTextColor(colorStateList);
                }
            }
            if (!n(this.f3971b)) {
                b(this.f3971b, true);
            }
        }
        x0 x0Var3 = this.f3971b;
        if (x0Var3 != null) {
            x0Var3.setText(charSequence);
        }
        this.f3992x = charSequence;
    }

    public void setTitleTextColor(@NonNull ColorStateList colorStateList) {
        this.f3994z = colorStateList;
        x0 x0Var = this.f3971b;
        if (x0Var != null) {
            x0Var.setTextColor(colorStateList);
        }
    }

    public void setOnMenuItemClickListener(u2 u2Var) {
    }
}
