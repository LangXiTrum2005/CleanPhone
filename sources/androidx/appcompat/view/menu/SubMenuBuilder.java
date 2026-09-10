package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.media.a;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class SubMenuBuilder extends MenuBuilder implements SubMenu {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final MenuItemImpl f3516A;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final MenuBuilder f3517z;

    public SubMenuBuilder(Context context, MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
        super(context);
        this.f3517z = menuBuilder;
        this.f3516A = menuItemImpl;
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder
    public final boolean d(MenuItemImpl menuItemImpl) {
        return this.f3517z.d(menuItemImpl);
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder
    public final boolean e(MenuBuilder menuBuilder, MenuItem menuItem) {
        return super.e(menuBuilder, menuItem) || this.f3517z.e(menuBuilder, menuItem);
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder
    public final boolean f(MenuItemImpl menuItemImpl) {
        return this.f3517z.f(menuItemImpl);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.f3516A;
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder
    public final String j() {
        MenuItemImpl menuItemImpl = this.f3516A;
        int i2 = menuItemImpl != null ? menuItemImpl.f3492a : 0;
        if (i2 == 0) {
            return null;
        }
        return a.h(i2, "android:menu:actionviewstates:");
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder
    public final MenuBuilder k() {
        return this.f3517z.k();
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder
    public final boolean m() {
        return this.f3517z.m();
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder
    public final boolean n() {
        return this.f3517z.n();
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder
    public final boolean o() {
        return this.f3517z.o();
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder, android.view.Menu
    public final void setGroupDividerEnabled(boolean z2) {
        this.f3517z.setGroupDividerEnabled(z2);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        u(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        u(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        u(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.f3516A.setIcon(drawable);
        return this;
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder, android.view.Menu
    public final void setQwertyMode(boolean z2) {
        this.f3517z.setQwertyMode(z2);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i2) {
        u(0, null, i2, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i2) {
        u(i2, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i2) {
        this.f3516A.setIcon(i2);
        return this;
    }
}
