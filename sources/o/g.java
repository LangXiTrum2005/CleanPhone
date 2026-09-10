package o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Handler;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.storage.androidcleaner.R;
import java.util.ArrayList;
import java.util.Iterator;
import p.c2;
import p.d2;
import p.f2;
import p.n1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends u implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f46920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f46921c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f46922d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f46923e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Handler f46924f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final d f46927i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e f46928j;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public View f46931n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public View f46932o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f46933p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f46934q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f46935r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f46936s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f46937t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f46939v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public x f46940w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ViewTreeObserver f46941x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public PopupWindow.OnDismissListener f46942y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f46943z;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f46925g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f46926h = new ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final am.e f46929k = new am.e(this, 23);
    public int l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f46930m = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f46938u = false;

    public g(Context context, View view, int i10, boolean z10) {
        int i11 = 0;
        this.f46927i = new d(this, i11);
        this.f46928j = new e(this, i11);
        this.f46920b = context;
        this.f46931n = view;
        this.f46922d = i10;
        this.f46923e = z10;
        this.f46933p = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f46921c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f46924f = new Handler();
    }

    @Override // o.c0
    public final boolean a() {
        ArrayList arrayList = this.f46926h;
        return arrayList.size() > 0 && ((f) arrayList.get(0)).f46917a.f47617y.isShowing();
    }

    @Override // o.y
    public final void b(m mVar, boolean z10) {
        ArrayList arrayList = this.f46926h;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                i10 = -1;
                break;
            } else if (mVar == ((f) arrayList.get(i10)).f46918b) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 < 0) {
            return;
        }
        int i11 = i10 + 1;
        if (i11 < arrayList.size()) {
            ((f) arrayList.get(i11)).f46918b.c(false);
        }
        f fVar = (f) arrayList.remove(i10);
        m mVar2 = fVar.f46918b;
        f2 f2Var = fVar.f46917a;
        p.a0 a0Var = f2Var.f47617y;
        mVar2.r(this);
        if (this.f46943z) {
            c2.b(a0Var, null);
            a0Var.setAnimationStyle(0);
        }
        f2Var.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f46933p = ((f) arrayList.get(size2 - 1)).f46919c;
        } else {
            this.f46933p = this.f46931n.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z10) {
                ((f) arrayList.get(0)).f46918b.c(false);
                return;
            }
            return;
        }
        dismiss();
        x xVar = this.f46940w;
        if (xVar != null) {
            xVar.b(mVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.f46941x;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f46941x.removeGlobalOnLayoutListener(this.f46927i);
            }
            this.f46941x = null;
        }
        this.f46932o.removeOnAttachStateChangeListener(this.f46928j);
        this.f46942y.onDismiss();
    }

    @Override // o.y
    public final void c() {
        Iterator it = this.f46926h.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((f) it.next()).f46917a.f47596c.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((j) adapter).notifyDataSetChanged();
        }
    }

    @Override // o.c0
    public final void dismiss() {
        ArrayList arrayList = this.f46926h;
        int size = arrayList.size();
        if (size > 0) {
            f[] fVarArr = (f[]) arrayList.toArray(new f[size]);
            for (int i10 = size - 1; i10 >= 0; i10--) {
                f fVar = fVarArr[i10];
                if (fVar.f46917a.f47617y.isShowing()) {
                    fVar.f46917a.dismiss();
                }
            }
        }
    }

    @Override // o.y
    public final void e(x xVar) {
        this.f46940w = xVar;
    }

    @Override // o.y
    public final boolean h() {
        return false;
    }

    @Override // o.y
    public final boolean i(e0 e0Var) {
        for (f fVar : this.f46926h) {
            if (e0Var == fVar.f46918b) {
                fVar.f46917a.f47596c.requestFocus();
                return true;
            }
        }
        if (!e0Var.hasVisibleItems()) {
            return false;
        }
        j(e0Var);
        x xVar = this.f46940w;
        if (xVar != null) {
            xVar.u(e0Var);
        }
        return true;
    }

    @Override // o.u
    public final void j(m mVar) {
        mVar.b(this, this.f46920b);
        if (a()) {
            t(mVar);
        } else {
            this.f46925g.add(mVar);
        }
    }

    @Override // o.c0
    public final n1 l() {
        ArrayList arrayList = this.f46926h;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((f) l1.d.d(arrayList, 1)).f46917a.f47596c;
    }

    @Override // o.u
    public final void m(View view) {
        if (this.f46931n != view) {
            this.f46931n = view;
            this.f46930m = Gravity.getAbsoluteGravity(this.l, view.getLayoutDirection());
        }
    }

    @Override // o.u
    public final void n(boolean z10) {
        this.f46938u = z10;
    }

    @Override // o.u
    public final void o(int i10) {
        if (this.l != i10) {
            this.l = i10;
            this.f46930m = Gravity.getAbsoluteGravity(i10, this.f46931n.getLayoutDirection());
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        f fVar;
        ArrayList arrayList = this.f46926h;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                fVar = null;
                break;
            }
            fVar = (f) arrayList.get(i10);
            if (!fVar.f46917a.f47617y.isShowing()) {
                break;
            } else {
                i10++;
            }
        }
        if (fVar != null) {
            fVar.f46918b.c(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i10 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // o.u
    public final void p(int i10) {
        this.f46934q = true;
        this.f46936s = i10;
    }

    @Override // o.u
    public final void q(PopupWindow.OnDismissListener onDismissListener) {
        this.f46942y = onDismissListener;
    }

    @Override // o.u
    public final void r(boolean z10) {
        this.f46939v = z10;
    }

    @Override // o.u
    public final void s(int i10) {
        this.f46935r = true;
        this.f46937t = i10;
    }

    @Override // o.c0
    public final void show() {
        if (a()) {
            return;
        }
        ArrayList arrayList = this.f46925g;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            t((m) it.next());
        }
        arrayList.clear();
        View view = this.f46931n;
        this.f46932o = view;
        if (view != null) {
            boolean z10 = this.f46941x == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f46941x = viewTreeObserver;
            if (z10) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f46927i);
            }
            this.f46932o.addOnAttachStateChangeListener(this.f46928j);
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x0105  */
    /* JADX WARN: Code duplicated, block: B:57:0x0136  */
    /* JADX WARN: Code duplicated, block: B:59:0x0142  */
    /* JADX WARN: Code duplicated, block: B:60:0x0145  */
    /* JADX WARN: Code duplicated, block: B:61:0x0148  */
    /* JADX WARN: Code duplicated, block: B:65:0x0150  */
    /* JADX WARN: Code duplicated, block: B:66:0x0152  */
    /* JADX WARN: Code duplicated, block: B:69:0x015d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x0160  */
    /* JADX WARN: Code duplicated, block: B:72:0x0167 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x0169  */
    /* JADX WARN: Code duplicated, block: B:74:0x016e  */
    /* JADX WARN: Code duplicated, block: B:76:0x017b  */
    /* JADX WARN: Code duplicated, block: B:78:0x017f  */
    /* JADX WARN: Code duplicated, block: B:81:0x0187  */
    /* JADX WARN: Code duplicated, block: B:84:0x0190  */
    /* JADX WARN: Code duplicated, block: B:85:0x0196  */
    public final void t(m mVar) {
        boolean z10;
        int i10;
        f fVar;
        View childAt;
        Rect rect;
        Rect rect2;
        n1 n1Var;
        int[] iArr;
        Rect rect3;
        int i11;
        int i12;
        boolean z11;
        MenuItem item;
        j jVar;
        int headersCount;
        int firstVisiblePosition;
        Context context = this.f46920b;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        j jVar2 = new j(mVar, layoutInflaterFrom, this.f46923e, R.layout.abc_cascading_menu_item_layout);
        if (!a() && this.f46938u) {
            jVar2.f46954c = true;
        } else if (a()) {
            int size = mVar.f46964f.size();
            int i13 = 0;
            while (true) {
                if (i13 >= size) {
                    z10 = false;
                    break;
                }
                MenuItem item2 = mVar.getItem(i13);
                if (item2.isVisible() && item2.getIcon() != null) {
                    z10 = true;
                    break;
                }
                i13++;
            }
            jVar2.f46954c = z10;
        }
        int iK = u.k(jVar2, context, this.f46921c);
        f2 f2Var = new f2(context, null, this.f46922d);
        f2Var.f47646z = this.f46929k;
        f2Var.f47608p = this;
        f2Var.f47617y.setOnDismissListener(this);
        f2Var.f47607o = this.f46931n;
        f2Var.l = this.f46930m;
        f2Var.f47616x = true;
        f2Var.f47617y.setFocusable(true);
        f2Var.f47617y.setInputMethodMode(2);
        f2Var.k(jVar2);
        f2Var.o(iK);
        f2Var.l = this.f46930m;
        ArrayList arrayList = this.f46926h;
        if (arrayList.size() > 0) {
            fVar = (f) l1.d.d(arrayList, 1);
            m mVar2 = fVar.f46918b;
            int size2 = mVar2.f46964f.size();
            int i14 = 0;
            while (true) {
                if (i14 >= size2) {
                    item = null;
                    break;
                }
                item = mVar2.getItem(i14);
                if (item.hasSubMenu() && mVar == item.getSubMenu()) {
                    break;
                } else {
                    i14++;
                }
            }
            if (item == null) {
                i10 = 1;
                childAt = null;
            } else {
                n1 n1Var2 = fVar.f46917a.f47596c;
                ListAdapter adapter = n1Var2.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    jVar = (j) headerViewListAdapter.getWrappedAdapter();
                } else {
                    jVar = (j) adapter;
                    headersCount = 0;
                }
                int count = jVar.getCount();
                i10 = 1;
                int i15 = 0;
                while (true) {
                    if (i15 >= count) {
                        i15 = -1;
                        break;
                    } else if (item == jVar.getItem(i15)) {
                        break;
                    } else {
                        i15++;
                    }
                }
                if (i15 != -1 && (firstVisiblePosition = (i15 + headersCount) - n1Var2.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < n1Var2.getChildCount()) {
                    childAt = n1Var2.getChildAt(firstVisiblePosition);
                }
            }
            if (childAt != null) {
                d2.a(f2Var.f47617y, false);
                c2.a(f2Var.f47617y, null);
                n1Var = ((f) arrayList.get(arrayList.size() - 1)).f46917a.f47596c;
                iArr = new int[2];
                n1Var.getLocationOnScreen(iArr);
                rect3 = new Rect();
                this.f46932o.getWindowVisibleDisplayFrame(rect3);
                if (this.f46933p == i10) {
                    if (n1Var.getWidth() + iArr[0] + iK > rect3.right) {
                        i12 = 0;
                        i11 = 1;
                    } else {
                        i11 = 1;
                        i12 = 1;
                    }
                } else if (iArr[0] - iK < 0) {
                    i11 = 1;
                    i12 = 1;
                } else {
                    i12 = 0;
                    i11 = 1;
                }
                if (i12 == i11) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.f46933p = i12;
                f2Var.f47607o = childAt;
                if ((this.f46930m & 5) == 5) {
                    if (!z11) {
                        iK = 0 - childAt.getWidth();
                    }
                } else if (z11) {
                    iK = childAt.getWidth();
                } else {
                    iK = 0 - iK;
                }
                f2Var.f47599f = iK;
                f2Var.f47604k = true;
                f2Var.f47603j = true;
                f2Var.g(0);
            } else {
                if (this.f46934q) {
                    f2Var.f47599f = this.f46936s;
                }
                if (this.f46935r) {
                    f2Var.g(this.f46937t);
                }
                rect = this.f47019a;
                if (rect != null) {
                    rect2 = new Rect(rect);
                } else {
                    rect2 = null;
                }
                f2Var.f47615w = rect2;
            }
            arrayList.add(new f(f2Var, mVar, this.f46933p));
            f2Var.show();
            n1 n1Var3 = f2Var.f47596c;
            n1Var3.setOnKeyListener(this);
            if (fVar == null || !this.f46939v || mVar.f46970m == null) {
                return;
            }
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) n1Var3, false);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(mVar.f46970m);
            n1Var3.addHeaderView(frameLayout, null, false);
            f2Var.show();
            return;
        }
        i10 = 1;
        fVar = null;
        childAt = null;
        if (childAt != null) {
            d2.a(f2Var.f47617y, false);
            c2.a(f2Var.f47617y, null);
            n1Var = ((f) arrayList.get(arrayList.size() - 1)).f46917a.f47596c;
            iArr = new int[2];
            n1Var.getLocationOnScreen(iArr);
            rect3 = new Rect();
            this.f46932o.getWindowVisibleDisplayFrame(rect3);
            if (this.f46933p == i10) {
                if (n1Var.getWidth() + iArr[0] + iK > rect3.right) {
                    i12 = 0;
                    i11 = 1;
                } else {
                    i11 = 1;
                    i12 = 1;
                }
            } else if (iArr[0] - iK < 0) {
                i11 = 1;
                i12 = 1;
            } else {
                i12 = 0;
                i11 = 1;
            }
            if (i12 == i11) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f46933p = i12;
            f2Var.f47607o = childAt;
            if ((this.f46930m & 5) == 5) {
                if (!z11) {
                    iK = 0 - childAt.getWidth();
                }
            } else if (z11) {
                iK = childAt.getWidth();
            } else {
                iK = 0 - iK;
            }
            f2Var.f47599f = iK;
            f2Var.f47604k = true;
            f2Var.f47603j = true;
            f2Var.g(0);
        } else {
            if (this.f46934q) {
                f2Var.f47599f = this.f46936s;
            }
            if (this.f46935r) {
                f2Var.g(this.f46937t);
            }
            rect = this.f47019a;
            if (rect != null) {
                rect2 = new Rect(rect);
            } else {
                rect2 = null;
            }
            f2Var.f47615w = rect2;
        }
        arrayList.add(new f(f2Var, mVar, this.f46933p));
        f2Var.show();
        n1 n1Var4 = f2Var.f47596c;
        n1Var4.setOnKeyListener(this);
        if (fVar == null) {
        }
    }
}
