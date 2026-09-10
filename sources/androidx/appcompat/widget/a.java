package androidx.appcompat.widget;

import androidx.appcompat.view.menu.MenuItemImpl;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ Toolbar f3671Y;

    public /* synthetic */ a(Toolbar toolbar, int i2) {
        this.X = i2;
        this.f3671Y = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.X) {
            case 0:
                Toolbar.ExpandedActionViewMenuPresenter expandedActionViewMenuPresenter = this.f3671Y.Q0;
                MenuItemImpl menuItemImpl = expandedActionViewMenuPresenter == null ? null : expandedActionViewMenuPresenter.f3649Y;
                if (menuItemImpl != null) {
                    menuItemImpl.collapseActionView();
                }
                break;
            default:
                this.f3671Y.o();
                break;
        }
    }
}
