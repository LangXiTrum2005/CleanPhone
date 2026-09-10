package p;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a2 implements o.c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f47594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ListAdapter f47595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public n1 f47596c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f47599f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f47600g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f47602i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f47603j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f47604k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public x1 f47606n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public View f47607o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public AdapterView.OnItemClickListener f47608p;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Handler f47613u;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Rect f47615w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f47616x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final a0 f47617y;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f47597d = -2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f47598e = -2;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f47601h = 1002;
    public int l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f47605m = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final w1 f47609q = new w1(this, 1);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final z1 f47610r = new z1(this);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y1 f47611s = new y1(this);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final w1 f47612t = new w1(this, 0);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Rect f47614v = new Rect();

    public a2(Context context, AttributeSet attributeSet, int i10) {
        int resourceId;
        this.f47594a = context;
        this.f47613u = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.a.f43530o, i10, 0);
        this.f47599f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f47600g = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f47602i = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        a0 a0Var = new a0(context, attributeSet, i10, 0);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, j.a.f43534s, i10, 0);
        if (typedArrayObtainStyledAttributes2.hasValue(2)) {
            a0Var.setOverlapAnchor(typedArrayObtainStyledAttributes2.getBoolean(2, false));
        }
        a0Var.setBackgroundDrawable((!typedArrayObtainStyledAttributes2.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes2.getDrawable(0) : com.google.android.gms.internal.auth.o.i(context, resourceId));
        typedArrayObtainStyledAttributes2.recycle();
        this.f47617y = a0Var;
        a0Var.setInputMethodMode(1);
    }

    @Override // o.c0
    public final boolean a() {
        return this.f47617y.isShowing();
    }

    public final int b() {
        return this.f47599f;
    }

    public final void c(int i10) {
        this.f47599f = i10;
    }

    @Override // o.c0
    public final void dismiss() {
        a0 a0Var = this.f47617y;
        a0Var.dismiss();
        a0Var.setContentView(null);
        this.f47596c = null;
        this.f47613u.removeCallbacks(this.f47609q);
    }

    public final Drawable e() {
        return this.f47617y.getBackground();
    }

    public final void g(int i10) {
        this.f47600g = i10;
        this.f47602i = true;
    }

    public final int j() {
        if (this.f47602i) {
            return this.f47600g;
        }
        return 0;
    }

    public void k(ListAdapter listAdapter) {
        x1 x1Var = this.f47606n;
        if (x1Var == null) {
            this.f47606n = new x1(this);
        } else {
            ListAdapter listAdapter2 = this.f47595b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(x1Var);
            }
        }
        this.f47595b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f47606n);
        }
        n1 n1Var = this.f47596c;
        if (n1Var != null) {
            n1Var.setAdapter(this.f47595b);
        }
    }

    @Override // o.c0
    public final n1 l() {
        return this.f47596c;
    }

    public final void m(Drawable drawable) {
        this.f47617y.setBackgroundDrawable(drawable);
    }

    public n1 n(Context context, boolean z10) {
        return new n1(context, z10);
    }

    public final void o(int i10) {
        Drawable background = this.f47617y.getBackground();
        if (background == null) {
            this.f47598e = i10;
            return;
        }
        Rect rect = this.f47614v;
        background.getPadding(rect);
        this.f47598e = rect.left + rect.right + i10;
    }

    @Override // o.c0
    public final void show() {
        int i10;
        int iMakeMeasureSpec;
        int paddingBottom;
        n1 n1Var;
        n1 n1Var2 = this.f47596c;
        Context context = this.f47594a;
        a0 a0Var = this.f47617y;
        if (n1Var2 == null) {
            n1 n1VarN = n(context, !this.f47616x);
            this.f47596c = n1VarN;
            n1VarN.setAdapter(this.f47595b);
            this.f47596c.setOnItemClickListener(this.f47608p);
            this.f47596c.setFocusable(true);
            this.f47596c.setFocusableInTouchMode(true);
            this.f47596c.setOnItemSelectedListener(new t1(this));
            this.f47596c.setOnScrollListener(this.f47611s);
            a0Var.setContentView(this.f47596c);
        }
        Drawable background = a0Var.getBackground();
        Rect rect = this.f47614v;
        if (background != null) {
            background.getPadding(rect);
            int i11 = rect.top;
            i10 = rect.bottom + i11;
            if (!this.f47602i) {
                this.f47600g = -i11;
            }
        } else {
            rect.setEmpty();
            i10 = 0;
        }
        int iA = u1.a(a0Var, this.f47607o, this.f47600g, a0Var.getInputMethodMode() == 2);
        int i12 = this.f47597d;
        if (i12 == -1) {
            paddingBottom = iA + i10;
        } else {
            int i13 = this.f47598e;
            if (i13 != -2) {
                iMakeMeasureSpec = i13 != -1 ? View.MeasureSpec.makeMeasureSpec(i13, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824);
            } else {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE);
            }
            int iA2 = this.f47596c.a(iMakeMeasureSpec, iA);
            paddingBottom = iA2 + (iA2 > 0 ? this.f47596c.getPaddingBottom() + this.f47596c.getPaddingTop() + i10 : 0);
        }
        boolean z10 = a0Var.getInputMethodMode() == 2;
        a0Var.setWindowLayoutType(this.f47601h);
        if (a0Var.isShowing()) {
            if (this.f47607o.isAttachedToWindow()) {
                int width = this.f47598e;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = this.f47607o.getWidth();
                }
                if (i12 == -1) {
                    i12 = z10 ? paddingBottom : -1;
                    if (z10) {
                        a0Var.setWidth(this.f47598e == -1 ? -1 : 0);
                        a0Var.setHeight(0);
                    } else {
                        a0Var.setWidth(this.f47598e == -1 ? -1 : 0);
                        a0Var.setHeight(-1);
                    }
                } else if (i12 == -2) {
                    i12 = paddingBottom;
                }
                a0Var.setOutsideTouchable(true);
                int i14 = width;
                View view = this.f47607o;
                int i15 = this.f47599f;
                int i16 = this.f47600g;
                int i17 = i14 < 0 ? -1 : i14;
                if (i12 < 0) {
                    i12 = -1;
                }
                a0Var.update(view, i15, i16, i17, i12);
                return;
            }
            return;
        }
        int width2 = this.f47598e;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = this.f47607o.getWidth();
        }
        if (i12 == -1) {
            i12 = -1;
        } else if (i12 == -2) {
            i12 = paddingBottom;
        }
        a0Var.setWidth(width2);
        a0Var.setHeight(i12);
        v1.b(a0Var, true);
        a0Var.setOutsideTouchable(true);
        a0Var.setTouchInterceptor(this.f47610r);
        if (this.f47604k) {
            a0Var.setOverlapAnchor(this.f47603j);
        }
        v1.a(a0Var, this.f47615w);
        a0Var.showAsDropDown(this.f47607o, this.f47599f, this.f47600g, this.l);
        this.f47596c.setSelection(-1);
        if ((!this.f47616x || this.f47596c.isInTouchMode()) && (n1Var = this.f47596c) != null) {
            n1Var.setListSelectionHidden(true);
            n1Var.requestLayout();
        }
        if (this.f47616x) {
            return;
        }
        this.f47613u.post(this.f47612t);
    }
}
