package n;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import ea.f2;
import java.lang.ref.WeakReference;
import zc.u;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends a implements o.k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f46273d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ActionBarContextView f46274e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public f2 f46275f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public WeakReference f46276g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f46277h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public o.m f46278i;

    @Override // n.a
    public final void b() {
        if (this.f46277h) {
            return;
        }
        this.f46277h = true;
        this.f46275f.u(this);
    }

    @Override // o.k
    public final boolean c(o.m mVar, MenuItem menuItem) {
        return ((u) this.f46275f.f39409b).x(this, menuItem);
    }

    @Override // n.a
    public final View d() {
        WeakReference weakReference = this.f46276g;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // n.a
    public final o.m f() {
        return this.f46278i;
    }

    @Override // n.a
    public final MenuInflater g() {
        return new h(this.f46274e.getContext());
    }

    @Override // n.a
    public final CharSequence h() {
        return this.f46274e.getSubtitle();
    }

    @Override // n.a
    public final CharSequence i() {
        return this.f46274e.getTitle();
    }

    @Override // n.a
    public final void j() {
        this.f46275f.w(this, this.f46278i);
    }

    @Override // n.a
    public final boolean k() {
        return this.f46274e.f3892s;
    }

    @Override // n.a
    public final void m(View view) {
        this.f46274e.setCustomView(view);
        this.f46276g = view != null ? new WeakReference(view) : null;
    }

    @Override // n.a
    public final void n(int i10) {
        o(this.f46273d.getString(i10));
    }

    @Override // n.a
    public final void o(CharSequence charSequence) {
        this.f46274e.setSubtitle(charSequence);
    }

    @Override // n.a
    public final void p(int i10) {
        r(this.f46273d.getString(i10));
    }

    @Override // o.k
    public final void q(o.m mVar) {
        j();
        p.j jVar = this.f46274e.f3878d;
        if (jVar != null) {
            jVar.l();
        }
    }

    @Override // n.a
    public final void r(CharSequence charSequence) {
        this.f46274e.setTitle(charSequence);
    }

    @Override // n.a
    public final void s(boolean z10) {
        this.f46265b = z10;
        this.f46274e.setTitleOptional(z10);
    }
}
