package androidx.appcompat.view;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class StandaloneActionMode extends ActionMode implements MenuBuilder.Callback {
    public Context Z;
    public ActionBarContextView e0;
    public ActionMode.Callback f0;
    public WeakReference g0;
    public boolean h0;
    public MenuBuilder i0;

    @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
    public final boolean a(MenuBuilder menuBuilder, MenuItem menuItem) {
        return this.f0.c(this, menuItem);
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
    public final void b(MenuBuilder menuBuilder) {
        i();
        this.e0.i();
    }

    @Override // androidx.appcompat.view.ActionMode
    public final void c() {
        if (this.h0) {
            return;
        }
        this.h0 = true;
        this.f0.a(this);
    }

    @Override // androidx.appcompat.view.ActionMode
    public final View d() {
        WeakReference weakReference = this.g0;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // androidx.appcompat.view.ActionMode
    public final MenuBuilder e() {
        return this.i0;
    }

    @Override // androidx.appcompat.view.ActionMode
    public final MenuInflater f() {
        return new SupportMenuInflater(this.e0.getContext());
    }

    @Override // androidx.appcompat.view.ActionMode
    public final CharSequence g() {
        return this.e0.getSubtitle();
    }

    @Override // androidx.appcompat.view.ActionMode
    public final CharSequence h() {
        return this.e0.getTitle();
    }

    @Override // androidx.appcompat.view.ActionMode
    public final void i() {
        this.f0.d(this, this.i0);
    }

    @Override // androidx.appcompat.view.ActionMode
    public final boolean j() {
        return this.e0.w0;
    }

    @Override // androidx.appcompat.view.ActionMode
    public final void k(View view) {
        this.e0.setCustomView(view);
        this.g0 = view != null ? new WeakReference(view) : null;
    }

    @Override // androidx.appcompat.view.ActionMode
    public final void l(int i2) {
        m(this.Z.getString(i2));
    }

    @Override // androidx.appcompat.view.ActionMode
    public final void m(CharSequence charSequence) {
        this.e0.setSubtitle(charSequence);
    }

    @Override // androidx.appcompat.view.ActionMode
    public final void n(int i2) {
        o(this.Z.getString(i2));
    }

    @Override // androidx.appcompat.view.ActionMode
    public final void o(CharSequence charSequence) {
        this.e0.setTitle(charSequence);
    }

    @Override // androidx.appcompat.view.ActionMode
    public final void p(boolean z2) {
        this.f3420Y = z2;
        this.e0.setTitleOptional(z2);
    }
}
