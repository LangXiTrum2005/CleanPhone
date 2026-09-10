package o;

import android.view.MenuItem;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class r implements MenuItem.OnActionExpandListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MenuItem.OnActionExpandListener f47013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f47014b;

    public r(t tVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f47014b = tVar;
        this.f47013a = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f47013a.onMenuItemActionCollapse(this.f47014b.h(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f47013a.onMenuItemActionExpand(this.f47014b.h(menuItem));
    }
}
