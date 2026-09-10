package o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.storage.androidcleaner.R;
import p.f2;
import p.n1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends u implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f46896b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f46897c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j f46898d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f46899e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f46900f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f46901g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final f2 f46902h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final d f46903i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e f46904j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public PopupWindow.OnDismissListener f46905k;
    public View l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public View f46906m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public x f46907n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ViewTreeObserver f46908o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f46909p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f46910q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f46911r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f46912s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f46913t;

    public d0(Context context, m mVar, View view, int i10, boolean z10) {
        int i11 = 1;
        this.f46903i = new d(this, i11);
        this.f46904j = new e(this, i11);
        this.f46896b = context;
        this.f46897c = mVar;
        this.f46899e = z10;
        this.f46898d = new j(mVar, LayoutInflater.from(context), z10, R.layout.abc_popup_menu_item_layout);
        this.f46901g = i10;
        Resources resources = context.getResources();
        this.f46900f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.l = view;
        this.f46902h = new f2(context, null, i10);
        mVar.b(this, context);
    }

    @Override // o.c0
    public final boolean a() {
        return !this.f46909p && this.f46902h.f47617y.isShowing();
    }

    @Override // o.y
    public final void b(m mVar, boolean z10) {
        if (mVar != this.f46897c) {
            return;
        }
        dismiss();
        x xVar = this.f46907n;
        if (xVar != null) {
            xVar.b(mVar, z10);
        }
    }

    @Override // o.y
    public final void c() {
        this.f46910q = false;
        j jVar = this.f46898d;
        if (jVar != null) {
            jVar.notifyDataSetChanged();
        }
    }

    @Override // o.c0
    public final void dismiss() {
        if (a()) {
            this.f46902h.dismiss();
        }
    }

    @Override // o.y
    public final void e(x xVar) {
        this.f46907n = xVar;
    }

    @Override // o.y
    public final boolean h() {
        return false;
    }

    @Override // o.y
    public final boolean i(e0 e0Var) {
        boolean z10;
        if (e0Var.hasVisibleItems()) {
            w wVar = new w(this.f46896b, e0Var, this.f46906m, this.f46899e, this.f46901g, 0);
            x xVar = this.f46907n;
            wVar.f47028h = xVar;
            u uVar = wVar.f47029i;
            if (uVar != null) {
                uVar.e(xVar);
            }
            int size = e0Var.f46964f.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    z10 = false;
                    break;
                }
                MenuItem item = e0Var.getItem(i10);
                if (item.isVisible() && item.getIcon() != null) {
                    z10 = true;
                    break;
                }
                i10++;
            }
            wVar.f47027g = z10;
            u uVar2 = wVar.f47029i;
            if (uVar2 != null) {
                uVar2.n(z10);
            }
            wVar.f47030j = this.f46905k;
            this.f46905k = null;
            this.f46897c.c(false);
            f2 f2Var = this.f46902h;
            int width = f2Var.f47599f;
            int iJ = f2Var.j();
            if ((Gravity.getAbsoluteGravity(this.f46912s, this.l.getLayoutDirection()) & 7) == 5) {
                width += this.l.getWidth();
            }
            if (!wVar.b()) {
                if (wVar.f47025e != null) {
                    wVar.d(width, iJ, true, true);
                }
            }
            x xVar2 = this.f46907n;
            if (xVar2 != null) {
                xVar2.u(e0Var);
            }
            return true;
        }
        return false;
    }

    @Override // o.c0
    public final n1 l() {
        return this.f46902h.f47596c;
    }

    @Override // o.u
    public final void m(View view) {
        this.l = view;
    }

    @Override // o.u
    public final void n(boolean z10) {
        this.f46898d.f46954c = z10;
    }

    @Override // o.u
    public final void o(int i10) {
        this.f46912s = i10;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f46909p = true;
        this.f46897c.c(true);
        ViewTreeObserver viewTreeObserver = this.f46908o;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f46908o = this.f46906m.getViewTreeObserver();
            }
            this.f46908o.removeGlobalOnLayoutListener(this.f46903i);
            this.f46908o = null;
        }
        this.f46906m.removeOnAttachStateChangeListener(this.f46904j);
        PopupWindow.OnDismissListener onDismissListener = this.f46905k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
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
        this.f46902h.f47599f = i10;
    }

    @Override // o.u
    public final void q(PopupWindow.OnDismissListener onDismissListener) {
        this.f46905k = onDismissListener;
    }

    @Override // o.u
    public final void r(boolean z10) {
        this.f46913t = z10;
    }

    @Override // o.u
    public final void s(int i10) {
        this.f46902h.g(i10);
    }

    @Override // o.c0
    public final void show() {
        View view;
        if (a()) {
            return;
        }
        if (this.f46909p || (view = this.l) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.f46906m = view;
        f2 f2Var = this.f46902h;
        p.a0 a0Var = f2Var.f47617y;
        p.a0 a0Var2 = f2Var.f47617y;
        a0Var.setOnDismissListener(this);
        f2Var.f47608p = this;
        f2Var.f47616x = true;
        a0Var2.setFocusable(true);
        View view2 = this.f46906m;
        boolean z10 = this.f46908o == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f46908o = viewTreeObserver;
        if (z10) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f46903i);
        }
        view2.addOnAttachStateChangeListener(this.f46904j);
        f2Var.f47607o = view2;
        f2Var.l = this.f46912s;
        boolean z11 = this.f46910q;
        Context context = this.f46896b;
        j jVar = this.f46898d;
        if (!z11) {
            this.f46911r = u.k(jVar, context, this.f46900f);
            this.f46910q = true;
        }
        f2Var.o(this.f46911r);
        a0Var2.setInputMethodMode(2);
        Rect rect = this.f47019a;
        f2Var.f47615w = rect != null ? new Rect(rect) : null;
        f2Var.show();
        n1 n1Var = f2Var.f47596c;
        n1Var.setOnKeyListener(this);
        if (this.f46913t) {
            m mVar = this.f46897c;
            if (mVar.f46970m != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) n1Var, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(mVar.f46970m);
                }
                frameLayout.setEnabled(false);
                n1Var.addHeaderView(frameLayout, null, false);
            }
        }
        f2Var.k(jVar);
        f2Var.show();
    }

    @Override // o.u
    public final void j(m mVar) {
    }
}
