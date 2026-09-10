package n;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import o.b0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends ActionMode {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f46279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f46280b;

    public e(Context context, a aVar) {
        this.f46279a = context;
        this.f46280b = aVar;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f46280b.b();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f46280b.d();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new b0(this.f46279a, this.f46280b.f());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f46280b.g();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f46280b.h();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f46280b.f46266c;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f46280b.i();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f46280b.f46265b;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f46280b.j();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f46280b.k();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f46280b.m(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f46280b.o(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f46280b.f46266c = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f46280b.r(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z10) {
        this.f46280b.s(z10);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i10) {
        this.f46280b.n(i10);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i10) {
        this.f46280b.p(i10);
    }
}
