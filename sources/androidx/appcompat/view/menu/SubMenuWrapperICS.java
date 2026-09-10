package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.core.internal.view.SupportSubMenu;

/* JADX INFO: loaded from: classes.dex */
class SubMenuWrapperICS extends MenuWrapperICS implements SubMenu {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SupportSubMenu f3518e;

    public SubMenuWrapperICS(Context context, SupportSubMenu supportSubMenu) {
        super(context, supportSubMenu);
        this.f3518e = supportSubMenu;
    }

    @Override // android.view.SubMenu
    public final void clearHeader() {
        this.f3518e.clearHeader();
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return c(this.f3518e.getItem());
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i2) {
        this.f3518e.setHeaderIcon(i2);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i2) {
        this.f3518e.setHeaderTitle(i2);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        this.f3518e.setHeaderView(view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i2) {
        this.f3518e.setIcon(i2);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        this.f3518e.setHeaderIcon(drawable);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        this.f3518e.setHeaderTitle(charSequence);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.f3518e.setIcon(drawable);
        return this;
    }
}
