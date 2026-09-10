package o;

import android.view.MenuItem;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class s implements MenuItem.OnMenuItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MenuItem.OnMenuItemClickListener f47015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f47016b;

    public s(t tVar, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f47016b = tVar;
        this.f47015a = onMenuItemClickListener;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        return this.f47015a.onMenuItemClick(this.f47016b.h(menuItem));
    }
}
