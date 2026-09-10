package k;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import ea.f2;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends n.a implements o.k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f44087d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o.m f44088e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public f2 f44089f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public WeakReference f44090g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ f0 f44091h;

    public e0(f0 f0Var, Context context, f2 f2Var) {
        this.f44091h = f0Var;
        this.f44087d = context;
        this.f44089f = f2Var;
        o.m mVar = new o.m(context);
        mVar.l = 1;
        this.f44088e = mVar;
        mVar.f46963e = this;
    }

    @Override // n.a
    public final void b() {
        f0 f0Var = this.f44091h;
        if (f0Var.f44105i != this) {
            return;
        }
        if (f0Var.f44111p) {
            f0Var.f44106j = this;
            f0Var.f44107k = this.f44089f;
        } else {
            this.f44089f.u(this);
        }
        this.f44089f = null;
        f0Var.a0(false);
        ActionBarContextView actionBarContextView = f0Var.f44102f;
        if (actionBarContextView.f3885k == null) {
            actionBarContextView.e();
        }
        f0Var.f44099c.setHideOnContentScrollEnabled(f0Var.f44116u);
        f0Var.f44105i = null;
    }

    @Override // o.k
    public final boolean c(o.m mVar, MenuItem menuItem) {
        f2 f2Var = this.f44089f;
        if (f2Var != null) {
            return ((zc.u) f2Var.f39409b).x(this, menuItem);
        }
        return false;
    }

    @Override // n.a
    public final View d() {
        WeakReference weakReference = this.f44090g;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // n.a
    public final o.m f() {
        return this.f44088e;
    }

    @Override // n.a
    public final MenuInflater g() {
        return new n.h(this.f44087d);
    }

    @Override // n.a
    public final CharSequence h() {
        return this.f44091h.f44102f.getSubtitle();
    }

    @Override // n.a
    public final CharSequence i() {
        return this.f44091h.f44102f.getTitle();
    }

    @Override // n.a
    public final void j() {
        if (this.f44091h.f44105i != this) {
            return;
        }
        o.m mVar = this.f44088e;
        mVar.w();
        try {
            this.f44089f.w(this, mVar);
        } finally {
            mVar.v();
        }
    }

    @Override // n.a
    public final boolean k() {
        return this.f44091h.f44102f.f3892s;
    }

    @Override // n.a
    public final void m(View view) {
        this.f44091h.f44102f.setCustomView(view);
        this.f44090g = new WeakReference(view);
    }

    @Override // n.a
    public final void n(int i10) {
        o(this.f44091h.f44097a.getResources().getString(i10));
    }

    @Override // n.a
    public final void o(CharSequence charSequence) {
        this.f44091h.f44102f.setSubtitle(charSequence);
    }

    @Override // n.a
    public final void p(int i10) {
        r(this.f44091h.f44097a.getResources().getString(i10));
    }

    @Override // o.k
    public final void q(o.m mVar) {
        if (this.f44089f == null) {
            return;
        }
        j();
        p.j jVar = this.f44091h.f44102f.f3878d;
        if (jVar != null) {
            jVar.l();
        }
    }

    @Override // n.a
    public final void r(CharSequence charSequence) {
        this.f44091h.f44102f.setTitle(charSequence);
    }

    @Override // n.a
    public final void s(boolean z10) {
        this.f46265b = z10;
        this.f44091h.f44102f.setTitleOptional(z10);
    }
}
